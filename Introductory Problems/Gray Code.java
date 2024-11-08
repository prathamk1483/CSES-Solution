import java.util.*;
 
class Codechef {
    public static List<String> generateGrayCode(int n) {
        List<String> result = new ArrayList<>();
        result.add("0");
        result.add("1");
        
        for (int i = 2; i <= n; i++) {
            int currentSize = result.size();
            for (int j = currentSize - 1; j >= 0; j--) {
                result.add(result.get(j));
            }
            for (int j = 0; j < currentSize; j++) {
                result.set(j, "0" + result.get(j));
            }
            for (int j = currentSize; j < result.size(); j++) {
                result.set(j, "1" + result.get(j));
            }
        }
        return result;
    }
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        List<String> grayCode = generateGrayCode(n);
        for (String code : grayCode) {
            System.out.println(code);
        }
    }
}
