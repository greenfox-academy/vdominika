public class Colors {
    public static void main(String[] args) {

        String[][] colors = {
                {"lime", "forest green", "olive", "pale green", "spring green"},
                {"orange red", "red", "tomato", "", ""},
                {"orchid", "violet", "pink", "hot pink", ""}
        };

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                if (colors[i][j] != null) {
                    System.out.print(colors[i][j] + " ");
                }
            }
            System.out.print("\n");
        }
    }
}