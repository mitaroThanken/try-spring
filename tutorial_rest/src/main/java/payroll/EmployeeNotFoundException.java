package payroll;

class EmployeeNotFoundException extends RuntimeException {

    EmployeeNotFoundException(Long id) {
        super("Could not find employee " + id);
    }

    /**
     *
     */
    private static final long serialVersionUID = 1L;
}