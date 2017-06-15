import java.util.List;

//Inner Class

class EnclosingClass {

static class Nested {
void anotherMethod() { System.out.println("hi again"); } 
}

public static void main(String[] args) {
//access enclosed class:

Nested n = new Nested(); 
String str = "";
List<Integer> 

n.anotherMethod();  //prints out "hi again"
}

}