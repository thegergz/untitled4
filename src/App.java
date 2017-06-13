

public class App {

    public static void main(String[] args) {


        //inefficient
        String info = "";

        info+= "my name is bob    ";

        info+= "i am a builder";

        System.out.println(info);


        StringBuilder sb = new StringBuilder("");

        sb.append("My name is Sue   ");
        sb.append("i am a lion tamer");

        System.out.println(sb.toString());

        StringBuilder s = new StringBuilder();

        s.append("my name is roger")
                .append("")
                .append("i am a skydiver");

        System.out.println(s.toString());

    //FUCK



    }


}
