/*
  Given a valid (IPv4) IP address, return a defanged version of that IP address.

  A defanged IP address replaces every period "." with "[.]".
*/

public class DefangedIP {
  public static String defange(String address) {
    String defanged = "";
    int i;
    for (i = 0; i < address.length(); i++) {
      if (address.charAt(i) == '.') {
        defanged += "[.]";
      } else {
        defanged += address.charAt(i);
      }
    }
    return defanged;
  }

  public static void main(String[] args) {
    String ip = "225.245.31.1";
    String defanged = defange(ip);

    System.out.println(ip);
    System.out.println(defanged);
  }
}
