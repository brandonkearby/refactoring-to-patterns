package refactorings.nullObject;

/**
 * @author Brandon Kearby
 *         January 05, 2016
 */
public class NullExportProgressListener implements ExportProgressListener {

    private NullExportProgressListener() {

    }

    public static NullExportProgressListener getInstance() {
        return INSTANCE;
    }

    private static final NullExportProgressListener INSTANCE = new NullExportProgressListener();

    @Override
    public void onStart() {

    }

    @Override
    public void progress(int totalItems, int itemsProcessed) {

    }

    @Override
    public void onEnd() {

    }
}
