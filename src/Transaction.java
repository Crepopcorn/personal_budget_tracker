public class Transaction {
    private int id;  // The transaction ID
    private String date;
    private String description;
    private String category;
    private double amount;
    private String type;

    // Constructor without ID for new transactions (ID will be generated by DB)
    public Transaction(String date, String description, String category, double amount, String type) {
        this.date = date;
        this.description = description;
        this.category = category;
        this.amount = amount;
        this.type = type;
    }

    // Constructor with ID for existing transactions
    public Transaction(int id, String date, String description, String category, double amount, String type) {
        this.id = id;
        this.date = date;
        this.description = description;
        this.category = category;
        this.amount = amount;
        this.type = type;
    }

    // Getter for ID (for when you need the transaction ID)
    public int getId() {
        return id;
    }

    // Getters for other fields (used when displaying or updating)
    public String getDate() {
        return date;
    }

    public String getDescription() {
        return description;
    }

    public String getCategory() {
        return category;
    }

    public double getAmount() {
        return amount;
    }

    public String getType() {
        return type;
    }
}
