package com.mkyong.editor;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;

import org.primefaces.model.DefaultTreeNode;
import org.primefaces.model.TreeNode;


@ManagedBean(name = "treeBean")
public class TreeBean  implements Serializable {

	private static final long serialVersionUID = -3048200950354426884L;

	private TreeNode treeNodeStaffs;
	private TreeNode treeNodeEg;
	
	public TreeNode getTreeNodeStaffs() {
		return treeNodeStaffs;
	}
	
	public TreeNode getTreeNodeEg() {
		return treeNodeEg;
	}

	@PostConstruct
	public void initTree() {

		   List<Staff> staffs = new ArrayList<Staff>();
		   staffs.add(new Staff("Peter",  "(11)12345678"));
		   staffs.add(new Staff("Andrew", "(11)87654321"));
		
		   treeNodeStaffs =  new DefaultTreeNode("STAFFS", null); 
		    for (Staff staff: staffs) {
		            //Node Staff
		            TreeNode treeNodeStaff =  new DefaultTreeNode(staff.getName(), treeNodeStaffs); 
		            //Node Staff details
		            TreeNode treeNodeStaffPhoneNumber = new DefaultTreeNode(staff.getName() + " - " + staff.getPhoneNumber(),treeNodeStaff);
		    }
		    
		    treeNodeEg = new EscalationMaintenanceService().createEscalationDocumentTree();

	}
	
	class Staff{
		
		private String name;
		private String phoneNumber;
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getPhoneNumber() {
			return phoneNumber;
		}
		public void setPhoneNumber(String phoneNumber) {
			this.phoneNumber = phoneNumber;
		}
		public Staff(String name, String phoneNumber) {
			super();
			this.name = name;
			this.phoneNumber = phoneNumber;
		}
		public Staff() {
			super();
			name = "empty";
			phoneNumber = "empty";
		}
		
	}
}
