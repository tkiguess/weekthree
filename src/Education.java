public class Education {
    private String degree;
    private String major;
    private String university;
    private String graduation;

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public String getGraduation() {
        return graduation;
    }

    public void setGraduation(String graduation) {
        this.graduation = graduation;
    }

    public String additup(){

        return this.appendix(degree+" in "+major+"\n"+university+", "+graduation+"\n"+"\n");

    }

    private String appendix (String uncut) {
        StringBuffer buff= new StringBuffer(uncut);
        return(uncut);
    }


}
