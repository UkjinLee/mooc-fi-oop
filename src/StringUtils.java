public class StringUtils {

//    checks if the string searched is contained within the string word
//    case insensitive
//    not care about trailing and ending white spaces in the string searched
//    If either of the strings is null, the method should return false.
//    The methods trim and toUpperCase() of the class String might be helpful
    public static boolean included(String word, String searched) {
        return word.toUpperCase().contains(searched.trim().toUpperCase());
    }
}
