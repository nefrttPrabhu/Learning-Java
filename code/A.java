// Base class A
class A {
    int a, b;

    void display() {
        System.out.println("Inside class A values = " + a + " " + b);
    }
}

// Derived class B inheriting from class A
class B extends A {
    int c;

    void show() {
        System.out.println("Inside Class B values = " + a + " " + b + " " + c);
    }
}

// Main class to run the program
class SingleInheritance {
    public static void main(String[] args) {
        B obj = new B();
        obj.a = 10;
        obj.b = 20;
        obj.c = 30;
        obj.display();
        obj.show();
    }
}