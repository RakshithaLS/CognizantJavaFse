public class CustomerRepositoryImpl implements CustomerRepository {
    @Override
    public Customer findCustomerById(int id) {
        // In a real application, this would interact with a database.
        // Here, we'll just return a dummy customer for demonstration purposes.
        return new Customer(id, "John Doe", "john.doe@example.com");
    }
}
