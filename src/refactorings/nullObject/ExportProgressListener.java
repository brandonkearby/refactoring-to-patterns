package refactorings.nullObject;

/**
 * @author Brandon Kearby
 *         January 05, 2016
 */
public interface ExportProgressListener {


    void onStart();

    void progress(int totalItems, int itemsProcessed);

    void onEnd();
}
