package com.wipro.polymorphism;
public class program2 {
  public static void main(String[] args) {
	  program2 c=new Circle();
	  program2 t=new Triangle();
	  program2 s=new Square();
    c.draw();
    c.erase();
    t.draw();
    t.erase();
    s.draw();
    s.erase();
    
  }
void draw()
{
  System.out.println("Drawing Shape");
}
void erase()
{
  System.out.println("Erasing Shape");
}

}

class Circle extends program2{
  void draw()
  {
    System.out.println("Drawing circle");
  }
  void erase()
  {
    System.out.println("Erasing Cirle");
  }
}

class Triangle extends program2{
  void draw()
  {
    System.out.println("Drawing Triangle");
  }
  void erase()
  {
    System.out.println("Erasing Triangle");
  }
}

class Square extends program2{
  void draw()
  {
    System.out.println("Drawing Square");
  }
  void erase()
  {
    System.out.println("Erasing Square");
  }
}
