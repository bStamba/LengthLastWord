public class LastWordLength {

    public int lengthOfLastWord(String s) {

        //Variables for our string array, length of s, index, and element of our array (i).
        String[] sArray = new String[]{};
        int sL = s.length();
        int index = 0;
        int i = 0;

        //Base cases of 0 and 1.
        if(sL == 0) { return 0; }
        if(sL == 1) { return 1; }

        //Iterate through our string, and store the last word in our StringBuilder.
        while(index < sL){
            sArray = s.split(" ");
            index = index + sArray[i].length();
        }
        return sArray[sArray.length - 1].length();
    }
}
