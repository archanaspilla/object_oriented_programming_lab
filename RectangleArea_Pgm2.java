class Rectangle 
 { 
       double  length; 
       double  breadth;        
       void setData(double  l,  double  b) 
       {  
         length =l; 
         breadth=b; 
       } 
         double  getArea() 
       { 
         double  area; 
         area = length * breadth; 
         return area;
       } 
 } 
class RectangleArea_Pgm2
 { 
          public static void main(String[] args) 
      { 
            Rectangle Rect1 = new Rectangle(); 
            Rect1.setData(12.4,13); 
            double  result1 =Rect1.getArea(); 
            System.out.println("Area of Rectangle1 = "+ result1); 
            Rectangle Rect2 = new Rectangle(); 
            Rect2.setData(10.5,9); 
            double   result2 =Rect2.getArea(); 
            System.out.println("Area of Rectangle2 = "+ result2); 
            Rectangle Rect3 = new Rectangle(); 
            Rect3.setData(13,14); 
            double  result3 =Rect3.getArea(); 
            System.out.println("Area of Rectangle3= "+ result3); 
      } 
 } 
