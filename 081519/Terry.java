class Terry {
    interface Even {
        public void printEven(int[] array);
    }
    public static void main(String[] args) {
        int[] nms = new int[]{0,1,2,3,4,5,6,7,8};
        Even even_nums = (nums) -> {
            for (int num: nums) {
                if (num % 2 == 0)
                    System.out.println(num);
            }
        };
        even_nums.printEven(nms);
    }
}
