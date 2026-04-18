//package exer;
//
//public class Q3 {
//    public static void main(String[] args) {
//        for (int i = 1; i <= 4; i++) {
//            for (int j = 1; j <= 2 * i - 1; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }
//
//}
public class Q3 {
    public static void main(String[] args) {

        String log = "127.0.0.1 - frank [10/Oct/2000:13:55:36 -0700] \"GET /apache_pb.gif HTTP/1.0\" 200";

        int start = log.indexOf("GET ") + 4;
        int end = log.indexOf(" HTTP");

        String url = log.substring(start, end);

        System.out.println(url);
    }
}