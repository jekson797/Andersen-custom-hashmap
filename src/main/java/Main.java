public class Main {

    public static void main(String[] args) {
        CustomHashMap<Integer, Integer> customHashMap = new CustomHashMap<>();
        fillCustomHashMap(customHashMap, 12);
        customHashMap.remove(10);
        System.out.println("customHashMap.get(5) = " + customHashMap.get(5));
        customHashMap.display();
    }

    private static void fillCustomHashMap(CustomHashMap<Integer, Integer> hashMap, int keysNumber) {
        for (int i = 0; i < keysNumber; i++) {
            hashMap.put(i, i);
        }
    }
}
