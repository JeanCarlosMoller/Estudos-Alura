public class TestaContaComExecaoChecked {
    public static void main(String[] args) {

        Conta c = new Conta();
        try {
            c.deposita();
        } catch (Exception e) {
            System.out.println("tratamento ....");
        }

    }
}
