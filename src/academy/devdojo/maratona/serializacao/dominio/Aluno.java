package academy.devdojo.maratona.serializacao.dominio;

import java.io.*;

public class Aluno implements Serializable {
    @Serial
    private static final long serialVersionUID = -5844186474458027139L;

    private long id;
    private String nome;
    private transient Turma turma;
    private transient String password;
    private static String nomeEscola = "devdojo"; //não é serializado

    public Aluno(long id, String nome, String password) {
        this.id = id;
        this.nome = nome;
        this.password = password;
    }

    @Serial
    private void writeObject(ObjectOutputStream oos) {
        try {
            oos.defaultWriteObject();
            oos.writeUTF(turma.getNome());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Serial
    private void readObject(ObjectInputStream ois) {
        try {
            ois.defaultReadObject();
            String nomeTurma = ois.readUTF();
            this.turma = new Turma(nomeTurma);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", turma=" + turma +
                ", password='" + password + '\'' +
                ", nome da escola= '" + nomeEscola + "'" +
                '}';
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }
}
