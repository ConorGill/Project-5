
/**
 * Write a description of class UserError here.
 * Class meant to catch any erroneus User inputs
 */
public class UserError extends Exception
{
    public UserError(String x){
        super(x);
    }
}
