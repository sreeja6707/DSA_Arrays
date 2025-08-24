class Solution {
    public String defangIPaddr(String address) {
        String originalString = address;
        String replacedString = originalString.replace(".", "[.]");
        return replacedString;
    }
}