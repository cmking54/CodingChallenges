class Abe {
    public static void main(String[] args) {
        List<Integer> input = new ArrayList<Integer>();
        // fill above with numbers
        List<Integer> ret = new ArrayList<Integer>();
        
        for (Integer i: input) {
            if (!ret.contains(i)) { // faster with hashset
                ret.add(i);
            }
        }
        System.out.println(ret);
    }
}
