public class LastWordLength {

    public int lengthOfLastWord(String s) {

        //We will trim any beginning or ending spaces and then traverse from the end of the string
        //to the beginning, one we find a space we know we have reached the end of the last word.
        s = s.trim();
        int length = 0;

        //Traverse from the end of the string to the beginning, once we find a space then
        //we know we have reached the end of the last word.
        for(int i = s.length() - 1; i >= 0; i--){
            if(s.charAt(i) != ' '){
                length++;
            }
            else{
                break;
            }
        }

        return length;
    }
}
