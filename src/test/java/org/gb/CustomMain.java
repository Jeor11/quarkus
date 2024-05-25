package org.gb;
import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;

@QuarkusMain
public class CustomMain {

    public static void main(String ... args){
        System.out.println("Running desde el metodo main");
        Quarkus.run(args);
    }

    public static class CustomApp implements QuarkusApplication{

        @Override
        public int run(String... args) throws Exception{
            return 0;
        }
    }
}
