package leoAtv08_p3;

public class Main {

	public static void main(String[] args) {		
		permissionsDepartment.addEmployee("José", "Técnico de TI", "Departamento de Informática", "DIP", 999, 2000.00);
		permissionsDepartment.removeEmployee("José", "Técnico de TI", "Departamento de Informática", "DIP", 999, 2000.00);
		permissionsDepartment.informationsEmployee("José", "Técnico de TI", "Departamento de Informática", "DIP", 999, 2000.00);

		permissionsEmployee.updateStatsEmployee("José", "Técnico de TI", 2000.00);
		permissionsEmployee.transferDepartmentEmployee(999, "Departamento de Informática");
		permissionsEmployee.currentDepartment(999, "Departamento de Informática");
	
	}

}
