import org.bidouille.jops.Operator;
import org.bidouille.jops.GenericTest.X;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class private_class {

    private static class X<T> {
        public T x;

        public X( T x ) {
            this.x = x;
        }

        @Override
        public String toString() {
            return String.valueOf( x );
        }
    }

    @Operator( "%" )
    private static X<String> op( X<String> a, X<String> b ) {
        return new X<String>( b.x );
    }

    public void test() {
        X<String> a = new X<>( "1" );
        X<String> b = new X<>( "2" );
        System.out.println( a % b );
    }

}
