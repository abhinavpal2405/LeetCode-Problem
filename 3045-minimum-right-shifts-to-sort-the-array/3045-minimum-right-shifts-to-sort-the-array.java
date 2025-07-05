class Solution {
    public int minimumRightShifts(List<Integer> numsList) {
        int n = numsList.size();
        int count = 0;
        int pivot = -1;

        for (int i = 0; i + 1 < n; i++) {
            if (numsList.get(i) > numsList.get(i + 1)) {
                count++;
                pivot = i;
            }
        }

        if (count == 0) 
        {
            return 0;
        }
        if (count > 1 || numsList.get(n - 1) > numsList.get(0)) {
            return -1;
        }

        return n - pivot - 1;
    }
}
