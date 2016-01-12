package refactorings.nullObject;

/**
 * @author Brandon Kearby
 *         January 05, 2016
 */
public class Report {


    private String title;

    public Report(String title) {

        this.title = title;
    }

    public void addRow(String item) {
        // add row...
    }

    public String getTitle() {
        return title;
    }
}
