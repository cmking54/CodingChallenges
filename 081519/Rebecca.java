//imcomplete
class Rebecca {
    public static void main(String[] args) {
        AA test = new AA(0,1,2);
        test.display_vals();
    }
}       
    class A {
        public int pub;
        protected int pro;
        private int pri;
        A (int pub, int pro, int pri) {
            this.pub = pub;
            this.pro = pro;
            this.pri = pri;
        }
        void init (int pub, int pro, int pri) {
            this.pub = pub;
            this.pro = pro;
            this.pri = pri;
        }
    }
    class AA extends A {
        AA(int a, int b, int c) {}
        void display_vals() {
            System.out.println("Public value: " + this.pub);
            System.out.println("Protected value: " + this.pro);
            //System.out.println("Private value: " + this.pri);
        }
    }
