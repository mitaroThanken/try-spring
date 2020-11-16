package payroll;

public class OrderNotFoundException extends RuntimeException {

    OrderNotFoundException(Long id) {
        super("Could not find order " + id);
    }
    
    /**
     *
     */
    private static final long serialVersionUID = 1L;
}