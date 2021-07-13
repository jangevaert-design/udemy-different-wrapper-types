package edu.cnm.deepdive;

public class DifferentWrapperTypes {

  public static void main(String[] args) {
    int myInt = 10;
    Integer myInteger = new Integer(10);//unnecessary boxing. We can use autoboxing as in line 8.
    Integer myInteger2 = 20;
    Integer myInteger3 = Integer.valueOf(10);//unnecessary boxing. We can use autoboxing as in line 8.
    Integer myInteger4 = Integer.parseInt("3");
    //wrappers are objects and objects can be null.
    Integer myInteger5 = null;
    //int myInt2 = null; does not compile

    System.out.println("myInteger = " + myInteger);
    System.out.println("myInteger2 = " + myInteger2);
    System.out.println("myInteger3 = " + myInteger3);
    System.out.println("myInteger4 = " + myInteger4);
    System.out.println("myInteger5 = " + myInteger5);

    //converting wrapper to integer is called unboxing.
    int myInt3 = myInteger3;//unboxing

    //boxing is converting primitive to wrapper.
    //autoboxing is done when we have a primitive on the right side that is converted to wrapper type.

    //carefully when unboxing a null wrapper -> throws NullPointerException.
  }

}
