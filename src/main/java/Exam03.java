public class Exam03 {
    public static void main(String[] args) {
        String log = "127.0.0.1 - - [31/Mar/2026:10:00:01 +0900] \"GET /index.html HTTP/1.1\" 200 1043 \"-\" \"Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/120.0.0.0 Safari/537.36\"";

        String result = log.substring(log.indexOf("/") + 1, log.indexOf(" HTTP"));

        System.out.println(result);
    }
}
