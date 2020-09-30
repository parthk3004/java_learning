
package dulicate;

    class FacebookLikes {
        public String likes(String[] arr) {
            int n  = arr.length;
            if(n==0) {
                return "no one likes this";
            }
            else if(n==1) {
                return arr[0]+" likes this";
            }
            else if(n==2) {
                return arr[0] + " and "  + arr[1] + " like this";
            }
            else if(n==3) {
                return arr[0] + ", "  + arr[1] + " and " + arr[2] + " like this";
            }
            else {
                return arr[0] + ", "  + arr[1] + " and " + (n-2) + " others like this";
            }

        }
}
