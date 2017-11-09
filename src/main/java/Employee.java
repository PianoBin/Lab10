/**
 * Class implementing an employee.
 *
 * @see <a href="https://cs125.cs.illinois.edu/lab/10/">Lab 10 Description</a>
 */
public class Employee {

    /**
     * Name of the employee.
     */
    private String name;
    /**
     * Name of the manager.
     */
    private String manager;

    /**
     * Constructor for initialization.
     * @param name2 Name of the employee.
     * @param manager2 Name of the manager.
     */
    public Employee(final String name2, final String manager2) {
        this.name = name2;
        this.manager = manager2;
    }

    /**
     * Getter for name.
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * Setter for name.
     * @param name2 Name of the employee.
     */
    public void setName(final String name2) {
        this.name = name2;
    }

    /**
     * Getter for manager.
     * @return manager
     */
    public String getManager() {
        return manager;
    }

    /**
     * Setter for manager.
     * @param manager2 Name of the employee's manager.
     */
    public void setManager(final String manager2) {
        this.manager = manager2;
    }
}
