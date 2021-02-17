import java.time.LocalDate;
import java.time.LocalDateTime;

public class Transaction {

    private int amount;
    private LocalDate date;
    private int id;
    private String værdi;

    public Transaction(int id, int amount, LocalDate date, String værdi) {
        this.id = id;
        this.amount = amount;
        this.date = date;
        this.værdi = værdi;
    }

    public int getId() {
        return id;
    }

    public String toString() {
        return "Transaktionsbeløb: "  + værdi +  amount + " kroner \nDato: " + date;
    }
}
