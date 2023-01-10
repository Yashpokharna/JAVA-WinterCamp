public class reverse {
    public static void main(String[] args) {
        String str = "YASHPOKHARNA";
        StringBuffer sb = new StringBuffer(str);
        sb.reverse();
            sb.delete(4,9);
        System.out.println(sb);
        }
    }
