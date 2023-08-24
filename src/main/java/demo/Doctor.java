package demo;

public class Doctor implements Staff {
    private String qualifications;
    private String qualifications2;

    public Doctor(String qualifications2) {
        this.qualifications2 = qualifications2;
    }

    public String getQualifications2() {
        return qualifications2;
    }

    public String getQualifications() {
        return qualifications;
    }

    public void setQualifications(String qualifications) {
        this.qualifications = qualifications;
    }

    public void working() {
        System.out.println("Doctor is busy!");
    }
}
