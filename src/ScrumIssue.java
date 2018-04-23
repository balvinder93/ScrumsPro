
public class ScrumIssue {
    private String title;
    private double storyPoints;

    public ScrumIssue(String title, double points){
        this.title = title;
        this.storyPoints = points;

    }

    public String getTitle() {
        return title;
    }


    @Override
    public String toString() {
        return this.title+" "+this.storyPoints;
    }
}
