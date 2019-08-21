//imcomplete
class Quinn {
    public static void main(String[] args) {
        B bee = new B();
        bee.a();
        bee.b();
        
        C sea = new C();
        sea.b();
    }
}
interface A {
    static void () {
        System.out.println("lowercase a");
    }
    
}
class B implements A {
    static void a() {
    }
    final void b() {
        System.out.println("lowercase b");
    }
}
class C extends B {
    final void b() {
        System.out.println("lowercase b from C");
    }
}
        
            
