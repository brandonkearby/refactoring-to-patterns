package refactorings.nullObject;

/**
 * @author Brandon Kearby
 *         January 05, 2016
 */
public class ReportService {

    public Report exportReport() {
        return exportReport(NullExportProgressListener.getInstance());
    }

    public Report exportReport(ExportProgressListener listener) {
        listener.onStart();

        Report report = new Report("Sample Report");
        int totalItems = 1000;
        for (int i=0; i < totalItems; i++) {
            report.addRow("Foo-" + i);
            if (i % 10 == 0) {
                listener.progress(totalItems, i);
            }
        }

        listener.onEnd();

        return report;

    }
}
