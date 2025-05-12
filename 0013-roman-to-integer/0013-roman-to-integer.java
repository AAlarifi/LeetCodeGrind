class Solution {
    public int romanToInt(String s) {
        HashMap<String, Integer> romanMap = new HashMap<>();
        int total = 0;
        int prevousInt = 0;
        romanMap.put("I", 1);
        romanMap.put("IV", 4);
        romanMap.put("V", 5);
        romanMap.put("IX", 9);
        romanMap.put("X", 10);
        romanMap.put("XL", 40);
        romanMap.put("L", 50);
        romanMap.put("XC", 90);
        romanMap.put("C", 100);
        romanMap.put("CD", 400);
        romanMap.put("D", 500);
        romanMap.put("CM", 900);
        romanMap.put("M", 1000);
        String[] romanNum = s.split("");
        for (int i = 0; i < romanNum.length; i++) {
            if (romanMap.containsKey(romanNum[i])) {
                if (romanMap.get(romanNum[prevousInt]) < romanMap.get(romanNum[i])) {
                    total += romanMap.get(romanNum[i]) - romanMap.get(romanNum[prevousInt])
                            - romanMap.get(romanNum[prevousInt]);

                } else {
                    total += romanMap.get(romanNum[i]);
                }
                if (i > 0) {
                    prevousInt++;
                }
            }
        }
        return total;
    }
}