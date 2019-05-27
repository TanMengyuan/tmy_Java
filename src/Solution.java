public class Solution {
    public static int numJewelsInStones(String J, String S) {
        int result = 0;
        for (int i=0; i<S.length(); i++){
            String s = S.substring(i,i+1);
            for (int j=0; j<J.length(); j++){
                String k = J.substring(j,j+1);
                if (s.equals(k)){
                    result ++;
                }
            }
        }
        return result;
    }

    public class Codec {

        // Encodes a URL to a shortened URL.
        public String encode(String longUrl) {
            StringBuffer url = new StringBuffer(longUrl);
            return url.substring(1, url.length()) + url.substring(0, 1);

        }

        // Decodes a shortened URL to its original URL.
        public String decode(String shortUrl) {
            StringBuffer url = new StringBuffer(shortUrl);
            return url.substring(url.length() - 1, url.length()) + url.substring(0, url.length());
        }
    }

    public static void main(String[] args) {
        StringBuffer sBuffer = new StringBuffer("菜鸟教程官网：");
        sBuffer.append("www");
        sBuffer.append(".runoob");
        sBuffer.append(".com");
        System.out.println(sBuffer.substring(0, sBuffer.length() - 2));
//        String J = "aA";
//        String S = "aAAbbbb";
//        System.out.println(numJewelsInStones(J, S));
    }
}
