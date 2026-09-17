class Solution {

    public String encode(List<String> strs) {
        //build string using StringBuilder
        StringBuilder stringBuilder = new StringBuilder();
        for(String s: strs) {
            stringBuilder.append(s.length()).append("#").append(s);
            //algorithm: add length like str 3#str
            //decoder will take the 
        }
        return stringBuilder.toString();
    }
    // 3#str
    public List<String> decode(String str) {
        List<String> decodedMessage = new ArrayList<>();
        int i = 0;
        while(i < str.length()) {
            int hashIndex = str.indexOf("#", i);
            int currentLength = Integer.parseInt(str.substring(i, hashIndex));
            i = hashIndex + 1;
            decodedMessage.add(str.substring(i, i + currentLength));
            i += currentLength;

        }

        return decodedMessage;
    }
}
