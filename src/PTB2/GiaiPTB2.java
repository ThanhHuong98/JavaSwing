package PTB2;

public class GiaiPTB2 {
    private double a,b,c,x1,x2;
    private String strResult;
    public GiaiPTB2(double a, double b, double c){
        this.a=a;
        this.b=b;
        this.c=c;
    }
    public void ResolvePT(){
        if(a==0 && b==0 && c==0){
            strResult="PT vo so nghiem";
        }else {
            double delta = b*b-4*a*c;
            if(delta<0){
                strResult="PT vo nghiem";
            }else {
                x1=-b-Math.sqrt(delta)/2/a;
                x2=-b+Math.sqrt(delta)/2/a;
                strResult = "x1 = "+x1+"\nx2 = "+x2;
            }
        }
    }
    public String getStrResult(){
        if(strResult!=null){
            return strResult;
        }else
            return "";
    }
}
