class Solution {
    public String interpret(String command) {
        //String originalString = command;
        String replacedString = command.replace("()", "o").replace("(al)","al");
        
        return replacedString;

    }
}