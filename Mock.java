public class Mock {
    private String trainerName;
    private String sub;
    private String date;
    private String rating;

    public Mock(String trainerName, String sub, String date, String rating) {
        this.trainerName = trainerName;
        this.sub = sub;
        this.date = date;
        this.rating = rating;
    }

    public String getTrainerName() {
        return trainerName;
    }

    public void setTrainerName(String trainerName) {
        this.trainerName = trainerName;
    }

    public String getSub() {
        return sub;
    }

    public void setSub(String sub) {
        this.sub = sub;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date){
        this.date = date;
    }

    public String getRating(){
        return rating;
    }

    public void setRating(String rating){
        this.rating = rating;
    }

    void displayMockDetails()
    {
        System.out.println("MOCK DETAILS");
        System.out.println("Trainer : "+ trainerName);
        System.out.println("Subject : "+ sub);
        System.out.println("Date : "+date);
        System.out.println("Rating : "+ rating );
        

    }    

} 


