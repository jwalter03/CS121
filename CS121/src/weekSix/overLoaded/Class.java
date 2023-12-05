package weekSix.overLoaded;

public class Class {
    String one;
    String two,three,four;
    Class(){
        this.one = "one";
        this.two = "two";
        this.three = "three";
        this.four = "four";
    }
    Class(String One){
        this.one = One;
    }
    Class(String Two, String Three, String Four){
        this.two = Two;
        this.three = Three;
        this.four = Four;
    }

    public void setOne(String one) {
        this.one = one;
    }


    public java.lang.String getOne() {
        return one;
    }
    public void setOne(String Two, String Three){
        this.two = Two;
        this.three = Three;
    }
}
