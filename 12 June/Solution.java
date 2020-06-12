class RandomizedSet {

    /** Initialize your data structure here. */
    Set<Integer> s;
    public RandomizedSet() {
        s=new HashSet<>();
    }
    
    /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
    public boolean insert(int val) {
        boolean x=s.contains(val);
        s.add(val);
        return !x;
    }
    
    /** Removes a value from the set. Returns true if the set contained the specified element. */
    public boolean remove(int val) {
        boolean x =s.contains(val);
        s.remove(val);
        return x;
    }
    
    /** Get a random element from the set. */
    public int getRandom() {
        Random random = new Random();
        int randomNumber = random.nextInt(s.size());

        int currentIndex = 0;
        int randomElement = 0;

        for(int element : s){

            randomElement = element;

            if(currentIndex == randomNumber)
                return randomElement;

            currentIndex++;
        }
        return randomElement;
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */
