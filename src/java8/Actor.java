package java8;

// when we want to change the published interface you need to declare the default method.
public interface Actor {
  public  void act();
  public  void speak();

 default public void comedy(){
     System.out.println("I can make people laugh default method interface");
  };
}
