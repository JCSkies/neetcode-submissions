class Solution {

    public String encode(List<String> strs) {
        StringBuilder stringBuilder = new StringBuilder();
        // let's make the string here with the algorithm: 
        // for each element in strs, grab the length and use a number sign / hash to separate, like an indicator. then addd the string at the end
        for (String str: strs) {
            stringBuilder.append(str.length()).append("#").append(str);
        }

        return stringBuilder.toString();
    }

    /*
    WHY STRINGBUILDER?

    when concatenating to a regular string object ( str += " "), it creates a new string object, so it uses more memory
    
    StringBuilder uses the same string object, so no new object is created. any concatenations or changes to the string will use the same object.

    this is immutability vs mutability
    */

    // 3#str
    public List<String> decode(String str) {
        List<String> decodedMessage = new ArrayList<>();
        int i = 0;
        //follow the algorithm: 
        // use parseint to grab current string's length (string is substring from i to hashindex since i could vary)
        // get index of # using substring to get index
        // move i one index after # and grab the string from i to i + length
        // add that substring to decodeMessage
        while(i < str.length()) {
            int hashIndex = str.indexOf("#", i);
            int length = Integer.parseInt(str.substring(i, hashIndex));
            i = hashIndex + 1;
            decodedMessage.add(str.substring(i, i + length));
            i += length;
        }
        return decodedMessage;

    }
}
