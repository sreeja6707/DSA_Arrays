class Solution {
    public int totalNumbers(int[] digits) {
        boolean[] u=new boolean[digits.length];
        Set<Integer>unique=new HashSet<>();
        backtrack(digits,u,new ArrayList<>(),unique);    
        return unique.size();
    }
    private void backtrack(int[] digits, boolean[] used, List<Integer> path, Set<Integer> unique) {
        if (path.size() == 3) {
            int num = path.get(0)*100 + path.get(1)*10 + path.get(2);
            if (path.get(0) != 0 && path.get(2) % 2 == 0) {
                unique.add(num);
            }
            return;
        }
        
        for (int i = 0; i < digits.length; i++) {
            if (used[i]) continue;
            used[i] = true;
            path.add(digits[i]);
            
            backtrack(digits, used, path, unique);
            
            path.remove(path.size() - 1);
            used[i] = false;
        }
    }

}