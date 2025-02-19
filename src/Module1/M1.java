package Module1;

public class M1 {
    public static void main (String[] args) {

        String star = "*";
        for (int i = 0; i < 4; i++)
        {
            String output = "";
            for (int j = 0; j <= i; j++)
            {
                output = output.concat(star);
            }
            System.out.println(output);
        }
    }
}
