import javax.management.monitor.StringMonitor;

class cons_over {
    double l,b,h;
    cons_over(double len){
        l=b=h=len;
    }
    cons_over(double len, double b, double h) {
        this.l=len;
        this.b=b;
        this.h=h;

    }
    double volume()
    {
        return l*b*h;

    }

}







public class pr1_demo {
    public static void main(String[] args) {
        cons_over ob1=new cons_over(len:10);
        double v1=ob1.volume();
        ob1.print();
        ob1.print(v1);
        cons_over ob2=new cons_over(len:10,b:20,h:10);
        double v1=ob2.volume();
        ob2.print();
        ob2.print(v1);

    }
    
}
