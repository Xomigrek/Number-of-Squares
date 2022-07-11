import ru.netilogy.sqr.services.SQRService;

public class Main {
    public static void main(String[] args) {
        SQRService service = new SQRService();
        System.out.println(service.numSqr(100,130));
    }
}
