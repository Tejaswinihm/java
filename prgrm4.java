  interface triangle{
    float area_tri (float l, float h);
  }
  interface rectangle{
    float area_rec ( float l,float h);
  }
  class area implements triangle, rectangle{
    public float area_rec ( float l,float h){
        return(l*h);
    }
    public float area_tri (float l, float h) {
        return(l*h/2);

    }
    }
  
public class prgrm4 {
public static void main(String[] args) {
    area a=new area();
    System.out.println("area of rectangle"+a.area_rec(22,11));
    System.out.println("area of trinagle"+a.area_tri(4,3));
}
}
