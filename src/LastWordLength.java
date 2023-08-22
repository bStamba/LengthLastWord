public class LastWordLength {

    public int lengthOfLastWord(String s) {

        //Split our string into words using " " as our delimiter, then we will
        //get the last word of the array and return it's length.
        String[] sArr = s.split(" ");
        String lastWord = sArr[sArr.length - 1];
        int length = lastWord.length();

        return length;
    }
}
