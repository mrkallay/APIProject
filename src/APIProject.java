public class APIProject {
    public static void main(String[] args) {

        APIUserInterface ui = new APIUserInterface();
        Request myRequest = new Request();
        while(true)
        {
            String mainResponse = ui.mainMenuPrompt();
            if (mainResponse.equals("Q"))
            {
                System.out.println("Bye");
                break;
            }
            else
            {
                myRequest.setName(mainResponse);
                String apiResponse = myRequest.getData();
                System.out.println("API Response: "  + apiResponse);
            }
        }
    }
}
