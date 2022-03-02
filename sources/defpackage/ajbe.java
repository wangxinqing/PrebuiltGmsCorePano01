package defpackage;

/* renamed from: ajbe  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public enum ajbe {
    LOCATOR("NetworkLocationLocator", 1),
    ACTIVE_COLLECTOR("NetworkLocationActiveCollector", 1),
    BURST_COLLECTOR("NetworkLocationBurstCollector", 1),
    PASSIVE_COLLECTOR("NetworkLocationPassiveCollector", 1),
    CACHE_UPDATER("NetworkLocationCacheUpdater", 1),
    CALIBRATION_COLLECTOR("NetworkLocationCalibrationCollector", 1),
    SENSOR_COLLECTOR("NetworkLocationSCollector", 1),
    SENSOR_UPLOADER("NetworkLocationSensorUploader", 1),
    ACTIVITY_DETECTION("NetworkLocationActivityDetection", 0),
    IN_OUT_DOOR_COLLECTOR("NetworkLocationInOutCollector", 1),
    BURST_COLLECTION_TRIGGER("NetworkLocationBurstCollectionTrigger", 1),
    VEHICLE_EXIT_DETECTOR("NetworkLocationVehicleExitDetector", 0),
    GESTURE_DETECTOR("NetworkLocationGestureDetector", 0),
    GLS_QUERY("Gls-Query", 1),
    GLS_UPLOAD("Gls-Upload", 0),
    GLS_LOC_QUERY("Gls-LocQuery", 0),
    CALLBACK_RUNNER("CallbackRunner", 2),
    PENDING_INTENT("PendingIntentClient", 2),
    COLLECTIONLIB("CollectionLib", 2),
    COLLECTIONLIB_REPLAYER("CollectionLib-Replayer", 2),
    COLLECTIONLIB_SIG_COLLECTOR("CollectionLib-SigCollector", 2);
    
    public final String v;
    public final int w;

    private ajbe(String str, int i) {
        this.v = str;
        this.w = i;
    }

    public final boolean a() {
        return (this.w & 2) != 0;
    }
}
