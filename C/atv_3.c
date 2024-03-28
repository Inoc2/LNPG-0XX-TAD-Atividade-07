#include <stdio.h>
typedef struct empresa{
    char nome;
    int id;
    char cargo;
    float salario;
    char departamento;
    char localizacao;
};

int atualizarInformacoesPessoas(int id, char nome, char cargo, float salario) {
    return 1;
}
int transferirDepartamento(int id, char cargo, char departamento, char localizacao) {
    return 1;
}
int obterInformacoesDepartamento(int id, char cargo, char departamento, char localizacao) {
    return 1;
}

char adicionarEmpregado(char nome, int id, char cargo, float salario, char departamento, char localizacao) {
    return 'a';
}
char removerEmpregado(int id) {
    return 'a';
}
char informacoesEmpregado(int id) {
    return 'a';
}

int main() {
    return 0;
}

