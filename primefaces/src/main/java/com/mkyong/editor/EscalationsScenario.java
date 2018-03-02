package com.mkyong.editor;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.mkyong.editor.model.AlertGroups;
import com.mkyong.editor.model.Alerts;
import com.mkyong.editor.model.EscalStaff;
import com.mkyong.editor.model.EscalStaffId;
import com.mkyong.editor.model.Escalation;
import com.mkyong.editor.model.EscalationId;
import com.mkyong.editor.model.Grids;
import com.mkyong.editor.model.Staff;

public class EscalationsScenario extends NodeBase{
	
	private List<AlertGroups> alertGroupsList;

	public EscalationsScenario() {
		super();
		createEgScenario();
	}

	public List<AlertGroups> getEgScenario(){
		return alertGroupsList;
	}
	
	private void createEgScenario() {
		// CREATE SCENARIO
		
		
		// STAFFS para grid 1
		Staff roney = new Staff("Peter", "Peter Waterman", "Fabrica - (area-1)", "11-123456789", 
				"peter@hotmail.com", true, new Date(), "001002001001", new HashSet<EscalStaff>());
		
		Staff taiguara = new Staff("Walter", "Walter Johnson", "Fabrica - (area-1)", "11-123456789", 
				"walter@hotmail.com", true, new Date(), "001002001001", new HashSet<EscalStaff>());
		
		
		// EscalStaff
		Set<EscalStaff> escalStaffs = new HashSet<EscalStaff>();
		escalStaffs.add(new EscalStaff(new EscalStaffId(), new Grids(), roney));
		escalStaffs.add(new EscalStaff(new EscalStaffId(), new Grids(), taiguara));
		
		
		// Grid 1 com escalStaff
		String gridId = "Grid-X";
		Grids grid_X = new Grids(gridId, "grid X description", 8, 18, new Date(), 
							true,true,true,true,true,true,true, "3Con - 13. Andar - TI - Area 1", escalStaffs, new HashSet<Escalation>());
		
		String alertGroupStr_X = "Alert-Group-X";
		short gridLevel = 1;
		AlertGroups alertGroups = new AlertGroups(alertGroupStr_X);
		
		Set<Alerts> alertses = new HashSet<Alerts>();
		alertses.add(new Alerts("Alerta-X", alertGroups, "alerta X", new Integer(2)));
		
		alertGroups.setAlertses(alertses);
				
		Set<Escalation> escalations = new HashSet<Escalation>();
		escalations.add(new Escalation(new EscalationId(gridId, alertGroupStr_X, gridLevel), alertGroups, grid_X, true));
		
		alertGroups.setEscalations(escalations);
		
		// Alert Groups
		alertGroupsList = new ArrayList<AlertGroups>();
		alertGroupsList.add(alertGroups);
		
		
	}

}
