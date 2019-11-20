
package hello;

import java.util.Properties;

/**
 *
 * @author Pieter van den Hombergh {@code p.vandehombergh@fontysvenlo.org}
 */
public class Hello {
    public static void main( String[] args ) {
        System.out.println( "Hello Hola World! from java" );
        
        Properties properties = System.getProperties();
        properties.entrySet().forEach( System.out::println);
    }
    
}
