public class EncapsulationTask {
    private int standard ;
    private int RollNo ;
    private String Section;

    public int getStandard(){
        return standard;
    }

    public void setStandard(int Stand) {

        this.standard = Stand;
    }

    public void setRollNo(int num) {

        this.RollNo = num;
        if(num <1 || num>50) {
            System.out.println("Wrong Input");
        }
        RollNo = num;

    }

    public int getRollNo() {
        return RollNo;
    }


    public void setSection(String Sec) {

        this.Section = Sec;
    }
    public String getSection() {
        return Section;
    }

    public static void main(String[] args) {
        EncapsulationTask obj = new EncapsulationTask();
        obj.setStandard(11);
        obj.setRollNo(17);
        obj.setSection("A");
        System.out.println(obj.getStandard());
        System.out.println(obj.getRollNo());
        System.out.println(obj.getSection());

    }

}
