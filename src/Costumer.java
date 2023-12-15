public class Costumer {
    private String name;
    private String cpf;
    private String occupation;

    public Costumer (String name, String cpf, String occupation ) {
        this.name = name;
        this.cpf = cpf;
        this.occupation = occupation;
    }

    public String getName () {
        return this.name;
    }

    public void setName ( String name ) {
        this.name = name;
    }

    public String getCpf () {
        return this.cpf;
    }

    public void setCpf ( String cpf ) {
        this.cpf = cpf;
    }

    public String getOccupation () {
        return this.occupation;
    }

    public void setOccupation ( String occupation ) {
        this.occupation = occupation;
    }

    @Override
    public String toString () {
        return "Costumer{" +
                "name='" + name + '\'' +
                ", cpf='" + cpf + '\'' +
                ", occupation='" + occupation + '\'' +
                '}';
    }
}
