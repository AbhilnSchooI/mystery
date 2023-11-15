public class Main {
    public static void main(String[] args) {

        String str = "programming is easy";
        String holder = "";
        String temp;

        //adds spaces + makes every 2 char capital
        for (int j = 1; j <= str.length(); j++) {
            temp = str.substring(j - 1, j);
            if (j % 2 == 0) {
                temp = temp.toUpperCase();
            } else {
                temp = temp.toLowerCase();
            }
            //checks for extra space
            if(!str.substring(j-1, j).equals(" ")){
                holder += temp + " ";
            }
        }

        str = holder;
        holder = "";

        System.out.println(str);

        //removes the spaces
        for (int k = 0; k < str.length(); k++) {
            if(!str.substring(k, k+1).equals(" ")){
                holder += str.substring(k, k + 1);
            }
        }

        str = holder;
        holder = "";

        System.out.println(str);

        //removes every 2nd character
       while (str.length() > 1) {
            for (int l = 0; l < str.length(); l+=2) {
                holder += str.substring(l, l + 1);
            }
            str = holder;
            holder = "";
            System.out.println(str);
       }
    }
}
