public class atv_2 {
	public class empresa {
        private char nome;
        private int id;
        private char cargo;
        private float salario;
        private char departamento;
        private char localizacao;

        public bool atualizarInformacoesPessoas(int id, char nome, char cargo, float salario){
            ...
        }
        public bool transferirDepartamento(int id, char cargo, char departamento, char localizacao){
            ...
        }
        public boolean obterInformacoesDepartamento(int id, char cargo, char departamento, char localizacao){
            ...
        }

        public char adicionarEmpregado(char nome, int id, char cargo, float salario, char departamento, char localizacao){
            ...
        }
        public char removerEmpregado(int id){
            ...
        }
        public char informacoesEmpregado(int id){
            ...
        }
	}
	
    public static void main(String[] args) {
        System.out.println("");
	    }
}  