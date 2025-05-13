
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class biblioteca {

    public static void main(String[] args) {
        // Classe Usuário
        class Usuario {

            private String nome;
            private String endereco;
            private String tipo; // "Professor", "Aluno", "Funcionário"
            private String departamento;

            public Usuario(String nome, String endereco, String tipo) {
                this.nome = nome;
                this.endereco = endereco;
                this.tipo = tipo;
                this.departamento = null; // Inicialmente nulo, preenchido se Professor ou Funcionário
            }

            public Usuario(String nome, String endereco, String tipo, String departamento) {
                this.nome = nome;
                this.endereco = endereco;
                this.tipo = tipo;
                this.departamento = departamento;
            }

            public String getNome() {
                return nome;
            }

            public void setNome(String nome) {
                this.nome = nome;
            }

            public String getEndereco() {
                return endereco;
            }

            public void setEndereco(String endereco) {
                this.endereco = endereco;
            }

            public String getTipo() {
                return tipo;
            }

            public void setTipo(String tipo) {
                this.tipo = tipo;
            }

            public String getDepartamento() {
                return departamento;
            }

            public void setDepartamento(String departamento) {
                this.departamento = departamento;
            }

            public void cadastrar() {
                System.out.println("Usuário " + nome + " cadastrado.");
            }

            public void atualizarCadastro(String novoEndereco) {
                this.endereco = novoEndereco;
                System.out.println("Cadastro de " + nome + " atualizado. Novo endereço: " + novoEndereco);
            }

            public void consultarDados() {
                System.out.println("--- Dados do Usuário ---");
                System.out.println("Nome: " + nome);
                System.out.println("Endereço: " + endereco);
                System.out.println("Tipo: " + tipo);
                if (departamento != null) {
                    System.out.println("Departamento: " + departamento);
                }
            }
        }

// Classe Obra
        class Obra {

            private String titulo;
            private String tipo;
            private String lingua;
            private String midia;
            private String autor;
            private String nacionalidadeAutor;
            private String editora;
            private int anoEdicao;

            public Obra(String titulo, String tipo, String lingua, String midia, String autor, String nacionalidadeAutor, String editora, int anoEdicao) {
                this.titulo = titulo;
                this.tipo = tipo;
                this.lingua = lingua;
                this.midia = midia;
                this.autor = autor;
                this.nacionalidadeAutor = nacionalidadeAutor;
                this.editora = editora;
                this.anoEdicao = anoEdicao;
            }

            public String getTitulo() {
                return titulo;
            }

            public void setTitulo(String titulo) {
                this.titulo = titulo;
            }

            public String getTipo() {
                return tipo;
            }

            public void setTipo(String tipo) {
                this.tipo = tipo;
            }

            public String getLingua() {
                return lingua;
            }

            public void setLingua(String lingua) {
                this.lingua = lingua;
            }

            public String getMidia() {
                return midia;
            }

            public void setMidia(String midia) {
                this.midia = midia;
            }

            public String getAutor() {
                return autor;
            }

            public void setAutor(String autor) {
                this.autor = autor;
            }

            public String getNacionalidadeAutor() {
                return nacionalidadeAutor;
            }

            public void setNacionalidadeAutor(String nacionalidadeAutor) {
                this.nacionalidadeAutor = nacionalidadeAutor;
            }

            public String getEditora() {
                return editora;
            }

            public void setEditora(String editora) {
                this.editora = editora;
            }

            public int getAnoEdicao() {
                return anoEdicao;
            }

            public void setAnoEdicao(int anoEdicao) {
                this.anoEdicao = anoEdicao;
            }

            public void cadastrar() {
                System.out.println("Obra \"" + titulo + "\" cadastrada.");
            }

            public void atualizarDados(String novaEditora, int novoAnoEdicao) {
                this.editora = novaEditora;
                this.anoEdicao = novoAnoEdicao;
                System.out.println("Dados da obra \"" + titulo + "\" atualizados. Nova editora: " + novaEditora + ", Novo ano: " + novoAnoEdicao);
            }

            public void consultarDados() {
                System.out.println("--- Dados da Obra ---");
                System.out.println("Título: " + titulo);
                System.out.println("Tipo: " + tipo);
                System.out.println("Língua: " + lingua);
                System.out.println("Mídia: " + midia);
                System.out.println("Autor: " + autor);
                System.out.println("Nacionalidade do Autor: " + nacionalidadeAutor);
                System.out.println("Editora: " + editora);
                System.out.println("Ano de Edição: " + anoEdicao);
            }
        }

// Classe Empréstimo
        class Emprestimo {

            private Usuario usuario;
            private Obra obra;
            private Date dataEmprestimo;
            private Date dataDevolucaoPrevista;
            private Date dataDevolucaoReal;

            public Emprestimo(Usuario usuario, Obra obra, Date dataEmprestimo, Date dataDevolucaoPrevista) {
                this.usuario = usuario;
                this.obra = obra;
                this.dataEmprestimo = dataEmprestimo;
                this.dataDevolucaoPrevista = dataDevolucaoPrevista;
                this.dataDevolucaoReal = null; // Inicialmente nulo
            }

            public Usuario getUsuario() {
                return usuario;
            }

            public Obra getObra() {
                return obra;
            }

            public Date getDataEmprestimo() {
                return dataEmprestimo;
            }

            public Date getDataDevolucaoPrevista() {
                return dataDevolucaoPrevista;
            }

            public Date getDataDevolucaoReal() {
                return dataDevolucaoReal;
            }

            public void realizarEmprestimo() {
                System.out.println("Empréstimo realizado para o usuário " + usuario.getNome() + " da obra \"" + obra.getTitulo() + "\" em " + dataEmprestimo);
            }

            public void registrarDevolucao(Date dataDevolucaoReal) {
                this.dataDevolucaoReal = dataDevolucaoReal;
                System.out.println("Devolução da obra \"" + obra.getTitulo() + "\" por " + usuario.getNome() + " registrada em " + dataDevolucaoReal);
            }

            public void consultarHistorico() {
                System.out.println("--- Histórico de Empréstimo ---");
                System.out.println("Usuário: " + usuario.getNome());
                System.out.println("Obra: " + obra.getTitulo());
                System.out.println("Data de Empréstimo: " + dataEmprestimo);
                System.out.println("Data de Devolução Prevista: " + dataDevolucaoPrevista);
                if (dataDevolucaoReal != null) {
                    System.out.println("Data de Devolução Real: " + dataDevolucaoReal);
                } else {
                    System.out.println("Devolução pendente.");
                }
            }

            // Método simples para verificar se o empréstimo está atrasado
            public boolean estaAtrasado() {
                if (dataDevolucaoReal == null && new Date().after(dataDevolucaoPrevista)) {
                    return true;
                }
                return false;
            }
        }

        class SistemaBiblioteca {

            public static void main(String[] args) {
                // Criando alguns objetos
                Usuario professor1 = new Usuario("Carlos Silva", "Rua das Flores, 123", "Professor", "Departamento de Computação");
                Usuario aluno1 = new Usuario("Ana Oliveira", "Avenida Principal, 456", "Aluno");
                Obra livro1 = new Obra("Introdução à Programação", "Livro científico", "Português", "Físico", "João Pereira", "Brasileira", "Editora ABC", 2020);
                Obra periodico1 = new Obra("Journal of Computer Science", "Periódico científico", "Inglês", "Digital", "Vários Autores", "Internacional", "IEEE", 2023);

                // Cadastrando usuários e obras (chamando os métodos)
                professor1.cadastrar();
                aluno1.cadastrar();
                livro1.cadastrar();
                periodico1.cadastrar();

                System.out.println("\n--- Consultando dados ---");
                professor1.consultarDados();
                livro1.consultarDados();

                // Realizando um empréstimo
                Date dataEmprestimo1 = new Date();
                // Simula uma data de devolução prevista para uma semana depois
                Date dataDevolucaoPrevista1 = new Date(dataEmprestimo1.getTime() + (7 * 24 * 60 * 60 * 1000));
                Emprestimo emprestimo1 = new Emprestimo(aluno1, livro1, dataEmprestimo1, dataDevolucaoPrevista1);
                emprestimo1.realizarEmprestimo();

                System.out.println("\n--- Histórico do Empréstimo ---");
                emprestimo1.consultarHistorico();

                // Simula a devolução alguns dias depois
                Date dataDevolucaoReal1 = new Date(dataEmprestimo1.getTime() + (5 * 24 * 60 * 60 * 1000));
                emprestimo1.registrarDevolucao(dataDevolucaoReal1);

                System.out.println("\n--- Histórico do Empréstimo Após Devolução ---");
                emprestimo1.consultarHistorico();

                // Exemplo de empréstimo atrasado (simulando uma data de devolução que já passou)
                Date dataEmprestimo2 = new Date(System.currentTimeMillis() - (10 * 24 * 60 * 60 * 1000)); // 10 dias atrás
                Date dataDevolucaoPrevista2 = new Date(System.currentTimeMillis() - (3 * 24 * 60 * 60 * 1000)); // 3 dias atrás
                Emprestimo emprestimoAtrasado = new Emprestimo(aluno1, periodico1, dataEmprestimo2, dataDevolucaoPrevista2);
                System.out.println("\nEmpréstimo Atrasado:");
                System.out.println("Está atrasado? " + emprestimoAtrasado.estaAtrasado());
            }
        }

    }
}
