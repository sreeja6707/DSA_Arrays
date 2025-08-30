class Solution {
    public String defangIPaddr(String address) {
       // String originalString = address;
        String replacedString = address.replace(".", "[.]");
        return replacedString;
    }
}