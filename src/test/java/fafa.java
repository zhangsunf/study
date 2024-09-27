public class fafa {
    public static void main(String[] args) {
        String str = "hello world";
        char[] charArray = str.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            for (int j = i + 1; j < charArray.length; j++) {
                if (charArray[i] == charArray[j]) {
                    System.out.println("重复字符：" + charArray[i] + "，位置分别为：" + i + " 和 " + j);
                }
            }
        }
    }

}
