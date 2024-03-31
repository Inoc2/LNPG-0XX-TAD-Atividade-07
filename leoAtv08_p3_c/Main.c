#include <stdio.h>

int main() {
    	addEmployee("José", "Técnico de TI", "Departamento de Informática", "DIP", 999, 2000.00);
	removeEmployee("José", "Técnico de TI", "Departamento de Informática", "DIP", 999, 2000.00);
	informationsEmployee("José", "Técnico de TI", "Departamento de Informática", "DIP", 999, 2000.00);

	updateStatsEmployee("José", "Técnico de TI", 2000.00);
	transferDepartmentEmployee(999, "Departamento de Informática");
	currentDepartment(999, "Departamento de Informática");

    return 0;
}
