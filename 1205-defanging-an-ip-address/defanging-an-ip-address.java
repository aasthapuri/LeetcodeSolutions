class Solution {
    public String defangIPaddr(String address) {
        // StringBuilder str = new StringBuilder();
        // for(int i=0;i<address.length();i++){
        //     if(address.charAt(i)!='.'){
        //         str.append(address.charAt(i));
        //     }
        //     else if(address.charAt(i)=='.'){
        //         str.append('[');
        //         str.append('.');
        //         str.append(']');
        //     }
        // }
        return address.replace(".","[.]");
    }
}