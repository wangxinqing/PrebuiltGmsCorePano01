package defpackage;

/* renamed from: axzl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class axzl implements axzk {
    public static final agvx arAccessByteBufferDirectly;
    public static final agvx arCnnOneShotEnabled;
    public static final agvx arGruBurstBatchMaxAttemptsList;
    public static final agvx arGruBurstConfidenceThresholdEarlyExitList;
    public static final agvx arGruBurstEnabled;
    public static final agvx arGruBurstNonBatchMaxAttemptsList;
    public static final agvx arGruBurstNumOneShotsForSensorBatch;
    public static final agvx arRelabelModeGruBurst;
    public static final agvx arRelabelModeOneShot;
    public static final agvx arRoadVehicleClassificationEnabled;
    public static final agvx arTestingClassifiersEnabled;
    public static final agvx arVehicleExitOnFootConfidenceThreshold;
    public static final agvx enable2wheelerDetection;
    public static final agvx roadVehicleThresholdFor2wheelerDetection;

    static {
        agvw a = new agvw(agvj.a("com.google.android.location")).a("location:");
        arAccessByteBufferDirectly = agvx.a(a, "ar_access_byte_buffer_directly", true);
        arCnnOneShotEnabled = agvx.a(a, "ar_cnn_one_shot_enabled", false);
        arGruBurstBatchMaxAttemptsList = agvx.a(a, "ar_gru_burst_batch_max_attempts_list", "9:9:9:9:9:9");
        arGruBurstConfidenceThresholdEarlyExitList = agvx.a(a, "ar_gru_burst_confidence_threshold_early_exit_list", "0.85:0.85:0.85:0.85:0.85:0.85");
        arGruBurstEnabled = agvx.a(a, "ar_gru_burst_enabled", false);
        arGruBurstNonBatchMaxAttemptsList = agvx.a(a, "ar_gru_burst_non_batch_max_attempts_list", "3:3:3:3:3:3");
        arGruBurstNumOneShotsForSensorBatch = agvx.a(a, "ar_gru_burst_num_one_shots_for_sensor_batch", 9);
        arRelabelModeGruBurst = agvx.a(a, "ar_relabel_mode_gru_burst", 2);
        arRelabelModeOneShot = agvx.a(a, "ar_relabel_mode_one_shot", 2);
        arRoadVehicleClassificationEnabled = agvx.a(a, "ar_road_vehicle_classification_enabled", false);
        arTestingClassifiersEnabled = agvx.a(a, "ar_testing_classifiers_enabled", false);
        arVehicleExitOnFootConfidenceThreshold = agvx.a(a, "ar_vehicle_exit_on_foot_confidence_threshold", 60);
        enable2wheelerDetection = agvx.a(a, "enable_2wheeler_detection", true);
        roadVehicleThresholdFor2wheelerDetection = agvx.a(a, "road_vehicle_threshold_for_2wheeler_detection", 0.4d);
    }

    public boolean arAccessByteBufferDirectly() {
        return ((Boolean) arAccessByteBufferDirectly.c()).booleanValue();
    }

    public boolean arCnnOneShotEnabled() {
        return ((Boolean) arCnnOneShotEnabled.c()).booleanValue();
    }

    public String arGruBurstBatchMaxAttemptsList() {
        return (String) arGruBurstBatchMaxAttemptsList.c();
    }

    public String arGruBurstConfidenceThresholdEarlyExitList() {
        return (String) arGruBurstConfidenceThresholdEarlyExitList.c();
    }

    public boolean arGruBurstEnabled() {
        return ((Boolean) arGruBurstEnabled.c()).booleanValue();
    }

    public String arGruBurstNonBatchMaxAttemptsList() {
        return (String) arGruBurstNonBatchMaxAttemptsList.c();
    }

    public long arGruBurstNumOneShotsForSensorBatch() {
        return ((Long) arGruBurstNumOneShotsForSensorBatch.c()).longValue();
    }

    public long arRelabelModeGruBurst() {
        return ((Long) arRelabelModeGruBurst.c()).longValue();
    }

    public long arRelabelModeOneShot() {
        return ((Long) arRelabelModeOneShot.c()).longValue();
    }

    public boolean arRoadVehicleClassificationEnabled() {
        return ((Boolean) arRoadVehicleClassificationEnabled.c()).booleanValue();
    }

    public boolean arTestingClassifiersEnabled() {
        return ((Boolean) arTestingClassifiersEnabled.c()).booleanValue();
    }

    public long arVehicleExitOnFootConfidenceThreshold() {
        return ((Long) arVehicleExitOnFootConfidenceThreshold.c()).longValue();
    }

    public boolean compiled() {
        return true;
    }

    public boolean enable2wheelerDetection() {
        return ((Boolean) enable2wheelerDetection.c()).booleanValue();
    }

    public double roadVehicleThresholdFor2wheelerDetection() {
        return ((Double) roadVehicleThresholdFor2wheelerDetection.c()).doubleValue();
    }
}
