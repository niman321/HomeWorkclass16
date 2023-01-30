package Class16;

public class Language {

    String sayHello(String countryName){
        switch (countryName){
            case "usa":
                return "Hello";

            case "Kazakhestan":
                return "selam";
            case "italy":
                return "ciao";
            case "china":
                return "ni hao";
            default:
                return "country not supported";

        }
    }
}
