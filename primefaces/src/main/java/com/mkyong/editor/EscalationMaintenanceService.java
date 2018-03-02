package com.mkyong.editor;

import java.util.Set;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;

import org.primefaces.model.DefaultTreeNode;
import org.primefaces.model.TreeNode;

import com.mkyong.editor.model.AlertGroups;
import com.mkyong.editor.model.Alerts;
import com.mkyong.editor.model.EscalStaff;
import com.mkyong.editor.model.Escalation;
import com.mkyong.editor.model.Grids;
import com.mkyong.editor.model.Staff;
 
@ManagedBean(name="escalationMaintenanceService")
public class EscalationMaintenanceService extends NodeBase{
     
	private static final long serialVersionUID = 1L;
	
     public EscalationMaintenanceService() {
		super();
	}

	public TreeNode createEscalationDocumentTree() {
		
		EscalationsScenario eS = new EscalationsScenario();

		List<AlertGroups> alertGroupsList = eS.getEgScenario();

		// Node ALERT GROUPS  (root)
		TreeNode treeNodeGruposDeAlerta = new DefaultTreeNode("ALERT GROUPS", null);

		for(AlertGroups alertGroup: alertGroupsList) {
			TreeNode treeNodeAlertGroup = new DefaultTreeNode(alertGroup.getAlertGroup(), treeNodeGruposDeAlerta);
			TreeNode treeNodeAlertGroupDescription = new DefaultTreeNode(alertGroup.getAlertGroup() + " - Details...",  treeNodeAlertGroup);

			// Node ALERTS
			TreeNode treeNodeAlerts  = new DefaultTreeNode(NODE_LABEL_ALERTS, treeNodeAlertGroup);
			for(Alerts alert: alertGroup.getAlertses()) {
				// Node Alert
				TreeNode treeNodeAlert = new DefaultTreeNode(alert.getAlertId(), treeNodeAlerts);
				TreeNode treeNodeAlertDetails = new DefaultTreeNode(alert.getAlertId() + " - Details...", treeNodeAlert);
		
			}

			// Node ESCALATIONS
			TreeNode treeNodeEscalations =  new DefaultTreeNode(NODE_LABEL_ESCALATIONS, treeNodeAlertGroup);
			
			// Node Level 1-10 (the number 10 is hard-coded in 'incluirEscalaçao_modal.xhtml')
			TreeNode treeNodeLevelOne = new DefaultTreeNode(NODE_LABEL_LEVEL_ONE, treeNodeEscalations);
			TreeNode treeNodeLevelTwo = new DefaultTreeNode(NODE_LABEL_LEVEL_TWO, treeNodeEscalations);
			TreeNode treeNodeLevelThree = new DefaultTreeNode(NODE_LABEL_LEVEL_THREE, treeNodeEscalations);
			TreeNode treeNodeLevelFour = new DefaultTreeNode(NODE_LABEL_LEVEL_FOUR, treeNodeEscalations);
			TreeNode treeNodeLevelFive = new DefaultTreeNode(NODE_LABEL_LEVEL_FIVE, treeNodeEscalations);
			TreeNode treeNodeLevelSix = new DefaultTreeNode(NODE_LABEL_LEVEL_SIX, treeNodeEscalations);
			TreeNode treeNodeLevelSeven = new DefaultTreeNode(NODE_LABEL_LEVEL_SEVEN, treeNodeEscalations);
			TreeNode treeNodeLevelEight = new DefaultTreeNode(NODE_LABEL_LEVEL_EIGHT, treeNodeEscalations);
			TreeNode treeNodeLevelNine = new DefaultTreeNode(NODE_LABEL_LEVEL_NINE, treeNodeEscalations);
			TreeNode treeNodeLevelTen = new DefaultTreeNode(NODE_LABEL_LEVEL_TEN, treeNodeEscalations);

			// Node Grid
			TreeNode treeNodeGrid = null;
			for(Escalation escalation: alertGroup.getEscalations()) {

				short gridLevel = escalation.getId().getGridLevel();
				
				Grids grid = escalation.getGrids();
				String gridId = grid.getGridId();

				switch (gridLevel) {

				case 1: treeNodeGrid = new DefaultTreeNode(gridId, treeNodeLevelOne);
						break;
				case 2: treeNodeGrid = new DefaultTreeNode(gridId, treeNodeLevelTwo);
						break;
				case 3: treeNodeGrid = new DefaultTreeNode(gridId, treeNodeLevelThree);
						break;
				case 4: treeNodeGrid = new DefaultTreeNode(gridId, treeNodeLevelFour);
						break;
				case 5: treeNodeGrid = new DefaultTreeNode(gridId, treeNodeLevelFive);
						break;
				case 6: treeNodeGrid = new DefaultTreeNode(gridId, treeNodeLevelSix);
						break;
				case 7: treeNodeGrid = new DefaultTreeNode(gridId, treeNodeLevelSeven);
						break;
				case 8: treeNodeGrid = new DefaultTreeNode(gridId, treeNodeLevelEight);
						break;
				case 9: treeNodeGrid = new DefaultTreeNode(gridId, treeNodeLevelNine);
						break;
				case 10: treeNodeGrid = new DefaultTreeNode(gridId, treeNodeLevelTen);
						break;
				default: System.err.println("EscalationMapService: initTree(): Error: Current Grid level is NOT between 1 and 10 ==> " + gridLevel + " !!!");
						break;
				}

				// Node Grid details
				TreeNode treeNodeGridDetails = new DefaultTreeNode(gridId + " - Details...",treeNodeGrid);
				
				// Node STAFFS
				TreeNode treeNodeStaffs =  new DefaultTreeNode(NODE_LABEL_STAFFS, treeNodeGrid); 
				for (EscalStaff scalStaff: grid.getGridses()) {
					Staff staff = scalStaff.getStaff();
					TreeNode treeNodeStaff =  new DefaultTreeNode(staff.getStaffId(), treeNodeStaffs); 
					TreeNode treeNodeStaffDetails = new DefaultTreeNode(staff.getStaffId() + " - Details...", treeNodeStaff);
				}
				
			}
			// Remove any node "LEVEL n" if it has no children Grids
			if (treeNodeLevelOne.getChildCount() == 0) treeNodeEscalations.getChildren().remove(treeNodeLevelOne);
			if (treeNodeLevelTwo.getChildCount() == 0) treeNodeEscalations.getChildren().remove(treeNodeLevelTwo);
			if (treeNodeLevelThree.getChildCount() == 0) treeNodeEscalations.getChildren().remove(treeNodeLevelThree);
			if (treeNodeLevelFour.getChildCount() == 0) treeNodeEscalations.getChildren().remove(treeNodeLevelFour);
			if (treeNodeLevelFive.getChildCount() == 0) treeNodeEscalations.getChildren().remove(treeNodeLevelFive);
			if (treeNodeLevelSix.getChildCount() == 0) treeNodeEscalations.getChildren().remove(treeNodeLevelSix);
			if (treeNodeLevelSeven.getChildCount() == 0) treeNodeEscalations.getChildren().remove(treeNodeLevelSeven);
			if (treeNodeLevelEight.getChildCount() == 0) treeNodeEscalations.getChildren().remove(treeNodeLevelEight);
			if (treeNodeLevelNine.getChildCount() == 0) treeNodeEscalations.getChildren().remove(treeNodeLevelNine);
			if (treeNodeLevelTen.getChildCount() == 0) treeNodeEscalations.getChildren().remove(treeNodeLevelTen);
				
		}
		return treeNodeGruposDeAlerta;
	}

}
