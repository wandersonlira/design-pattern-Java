package edu.gof.builderPattern.option_2;

public class Pessoa {
    private final String nome;
    private final String sobrenome;
    private final String usuario;
    private final String email;


    private Pessoa(String nome, String sobrenome, String usuario, String email) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.usuario = usuario;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", usuario='" + usuario + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public static class PessoaBuilder {
        private String nome;
        private String sobrenome;
        private String usuario;
        private String email;


        public PessoaBuilder nome(String nome) {
            this.nome = nome;
            return this;
        }

        public PessoaBuilder sobrenome(String sobrenome) {
            this.sobrenome = sobrenome;
            return this;
        }

        public PessoaBuilder usuario(String usuario) {
            this.usuario = usuario;
            return this;
        }

        public PessoaBuilder email(String email) {
            this.email = email;
            return this;
        }

        public Pessoa build() {
            return new Pessoa(nome, sobrenome, usuario, email);
        }
    }
}
