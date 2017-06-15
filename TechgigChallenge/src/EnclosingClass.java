//Static Nested Class

class EnclosingClass {

static class Nested {
void anotherMethod() { System.out.println("hi again"); } 
}

public static void main(String[] args) {
//access enclosed class:

Nested n = new Nested(); 

n.anotherMethod();  //prints out "hi again"
}

}