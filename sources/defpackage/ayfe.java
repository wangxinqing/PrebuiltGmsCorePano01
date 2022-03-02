package defpackage;

/* renamed from: ayfe  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ayfe implements ayfd {
    public static final agvx allowMissingWindowsDetection;
    public static final agvx bedtimeFirstPartyWhitelistedAppEnabled;
    public static final agvx chreSleepAudioEnabled;
    public static final agvx chreSleepDetectionEnabled;
    public static final agvx gmsSleepClassificationEventLoggingEnabled;
    public static final agvx logSleepApiStats;
    public static final agvx maxSleepHours;
    public static final agvx maxSleepSegmentCount;
    public static final agvx minAwakeCountBeforeSegment;
    public static final agvx minAwakeHsmmParam;
    public static final agvx minBedtimeSupportedGmscoreVersion;
    public static final agvx minSegmentedSleepHours;
    public static final agvx minSleepHsmmParam;
    public static final agvx minTotalEpochsBeforeSegment;
    public static final agvx preferredSleepTimeWhitelist;
    public static final agvx segmentSleepBeforeWindowEnds;
    public static final agvx segmentSleepEndHour;
    public static final agvx segmentSleepStartHour;
    public static final agvx sendSleepSegmentUponRegister;
    public static final agvx setAllowIdleAlarmForSleep;
    public static final agvx sleepAccelFeatureFromMotion;
    public static final agvx sleepActivityDetectionIdleIntervalMillis;
    public static final agvx sleepActivityDetectionIntervalMillis;
    public static final agvx sleepAlarmRingBugFix;
    public static final agvx sleepApiWhitelist;
    public static final agvx sleepClockAlarmConfidenceOverwriteMinutes;
    public static final agvx sleepConfidenceFromMotion;
    public static final agvx sleepDetectionAlarmAllowIdle;
    public static final agvx sleepDetectionFirstPartyOnly;
    public static final agvx sleepHighConfidenceAwakeThreshold;
    public static final agvx sleepMissingDataMaxGapEpochs;
    public static final agvx sleepSegmentDetectionEnabled;
    public static final agvx sleepWindowEpochCalculationBugFix;
    public static final agvx truncateSleepInUserWindow;
    public static final agvx writeSleepClassifyIntervalMinutes;

    static {
        agvw a = new agvw(agvj.a("com.google.android.location")).a("location:");
        allowMissingWindowsDetection = agvx.a(a, "allow_missing_windows_detection", true);
        bedtimeFirstPartyWhitelistedAppEnabled = agvx.a(a, "bedtime_first_party_whitelisted_app_enabled", true);
        chreSleepAudioEnabled = agvx.a(a, "chre_sleep_audio_enabled", false);
        chreSleepDetectionEnabled = agvx.a(a, "chre_sleep_detection_enabled", false);
        gmsSleepClassificationEventLoggingEnabled = agvx.a(a, "gms_sleep_classification_event_logging_enabled", true);
        logSleepApiStats = agvx.a(a, "log_sleep_api_stats", true);
        maxSleepHours = agvx.a(a, "max_sleep_hours", 12);
        maxSleepSegmentCount = agvx.a(a, "max_sleep_segment_count", 1);
        minAwakeCountBeforeSegment = agvx.a(a, "min_awake_count_before_segment", 1);
        minAwakeHsmmParam = agvx.a(a, "min_awake_hsmm_param", 30);
        minBedtimeSupportedGmscoreVersion = agvx.a(a, "min_bedtime_supported_gmscore_version", 200900000);
        minSegmentedSleepHours = agvx.a(a, "min_segmented_sleep_hours", 4);
        minSleepHsmmParam = agvx.a(a, "min_sleep_hsmm_param", 40);
        minTotalEpochsBeforeSegment = agvx.a(a, "min_total_epochs_before_segment", 60);
        preferredSleepTimeWhitelist = agvx.a(a, "preferred_sleep_time_whitelist", "com.google.android.apps.wellbeing,com.google.android.apps.location.context.activity.sleep,");
        segmentSleepBeforeWindowEnds = agvx.a(a, "segment_sleep_before_window_ends", true);
        segmentSleepEndHour = agvx.a(a, "segment_sleep_end_hour", 13);
        segmentSleepStartHour = agvx.a(a, "segment_sleep_start_hour", 6);
        sendSleepSegmentUponRegister = agvx.a(a, "send_sleep_segment_upon_register", true);
        setAllowIdleAlarmForSleep = agvx.a(a, "set_allow_idle_alarm_for_sleep", true);
        sleepAccelFeatureFromMotion = agvx.a(a, "sleep_accel_feature_from_motion", 1.0d);
        sleepActivityDetectionIdleIntervalMillis = agvx.a(a, "sleep_activity_detection_idle_interval_millis", 570000);
        sleepActivityDetectionIntervalMillis = agvx.a(a, "sleep_activity_detection_interval_millis", 360000);
        sleepAlarmRingBugFix = agvx.a(a, "sleep_alarm_ring_bug_fix", true);
        sleepApiWhitelist = agvx.a(a, "sleep_api_whitelist", "com.google.android.apps.fitness,com.google.android.apps.location.context.activity.sleep,com.google.android.apps.dreamliner,com.verily.myalo.scaleit,com.google.android.apps.wellbeing,com.google.android.apps.cerebra.dunlin,");
        sleepClockAlarmConfidenceOverwriteMinutes = agvx.a(a, "sleep_clock_alarm_confidence_overwrite_minutes", 12);
        sleepConfidenceFromMotion = agvx.a(a, "sleep_confidence_from_motion", 1);
        sleepDetectionAlarmAllowIdle = agvx.a(a, "sleep_detection_alarm_allow_idle", true);
        sleepDetectionFirstPartyOnly = agvx.a(a, "sleep_detection_first_party_only", false);
        sleepHighConfidenceAwakeThreshold = agvx.a(a, "sleep_high_confidence_awake_threshold", 20);
        sleepMissingDataMaxGapEpochs = agvx.a(a, "sleep_missing_data_max_gap_epochs", 4);
        sleepSegmentDetectionEnabled = agvx.a(a, "sleep_segment_detection_enabled", false);
        sleepWindowEpochCalculationBugFix = agvx.a(a, "sleep_window_epoch_calculation_bug_fix", true);
        truncateSleepInUserWindow = agvx.a(a, "truncate_sleep_in_user_window", true);
        writeSleepClassifyIntervalMinutes = agvx.a(a, "write_sleep_classify_interval_minutes", 5);
    }

    public boolean allowMissingWindowsDetection() {
        return ((Boolean) allowMissingWindowsDetection.c()).booleanValue();
    }

    public boolean bedtimeFirstPartyWhitelistedAppEnabled() {
        return ((Boolean) bedtimeFirstPartyWhitelistedAppEnabled.c()).booleanValue();
    }

    public boolean chreSleepAudioEnabled() {
        return ((Boolean) chreSleepAudioEnabled.c()).booleanValue();
    }

    public boolean chreSleepDetectionEnabled() {
        return ((Boolean) chreSleepDetectionEnabled.c()).booleanValue();
    }

    public boolean compiled() {
        return true;
    }

    public boolean gmsSleepClassificationEventLoggingEnabled() {
        return ((Boolean) gmsSleepClassificationEventLoggingEnabled.c()).booleanValue();
    }

    public boolean logSleepApiStats() {
        return ((Boolean) logSleepApiStats.c()).booleanValue();
    }

    public long maxSleepHours() {
        return ((Long) maxSleepHours.c()).longValue();
    }

    public long maxSleepSegmentCount() {
        return ((Long) maxSleepSegmentCount.c()).longValue();
    }

    public long minAwakeCountBeforeSegment() {
        return ((Long) minAwakeCountBeforeSegment.c()).longValue();
    }

    public long minAwakeHsmmParam() {
        return ((Long) minAwakeHsmmParam.c()).longValue();
    }

    public long minBedtimeSupportedGmscoreVersion() {
        return ((Long) minBedtimeSupportedGmscoreVersion.c()).longValue();
    }

    public long minSegmentedSleepHours() {
        return ((Long) minSegmentedSleepHours.c()).longValue();
    }

    public long minSleepHsmmParam() {
        return ((Long) minSleepHsmmParam.c()).longValue();
    }

    public long minTotalEpochsBeforeSegment() {
        return ((Long) minTotalEpochsBeforeSegment.c()).longValue();
    }

    public String preferredSleepTimeWhitelist() {
        return (String) preferredSleepTimeWhitelist.c();
    }

    public boolean segmentSleepBeforeWindowEnds() {
        return ((Boolean) segmentSleepBeforeWindowEnds.c()).booleanValue();
    }

    public long segmentSleepEndHour() {
        return ((Long) segmentSleepEndHour.c()).longValue();
    }

    public long segmentSleepStartHour() {
        return ((Long) segmentSleepStartHour.c()).longValue();
    }

    public boolean sendSleepSegmentUponRegister() {
        return ((Boolean) sendSleepSegmentUponRegister.c()).booleanValue();
    }

    public boolean setAllowIdleAlarmForSleep() {
        return ((Boolean) setAllowIdleAlarmForSleep.c()).booleanValue();
    }

    public double sleepAccelFeatureFromMotion() {
        return ((Double) sleepAccelFeatureFromMotion.c()).doubleValue();
    }

    public long sleepActivityDetectionIdleIntervalMillis() {
        return ((Long) sleepActivityDetectionIdleIntervalMillis.c()).longValue();
    }

    public long sleepActivityDetectionIntervalMillis() {
        return ((Long) sleepActivityDetectionIntervalMillis.c()).longValue();
    }

    public boolean sleepAlarmRingBugFix() {
        return ((Boolean) sleepAlarmRingBugFix.c()).booleanValue();
    }

    public String sleepApiWhitelist() {
        return (String) sleepApiWhitelist.c();
    }

    public long sleepClockAlarmConfidenceOverwriteMinutes() {
        return ((Long) sleepClockAlarmConfidenceOverwriteMinutes.c()).longValue();
    }

    public long sleepConfidenceFromMotion() {
        return ((Long) sleepConfidenceFromMotion.c()).longValue();
    }

    public boolean sleepDetectionAlarmAllowIdle() {
        return ((Boolean) sleepDetectionAlarmAllowIdle.c()).booleanValue();
    }

    public boolean sleepDetectionFirstPartyOnly() {
        return ((Boolean) sleepDetectionFirstPartyOnly.c()).booleanValue();
    }

    public long sleepHighConfidenceAwakeThreshold() {
        return ((Long) sleepHighConfidenceAwakeThreshold.c()).longValue();
    }

    public long sleepMissingDataMaxGapEpochs() {
        return ((Long) sleepMissingDataMaxGapEpochs.c()).longValue();
    }

    public boolean sleepSegmentDetectionEnabled() {
        return ((Boolean) sleepSegmentDetectionEnabled.c()).booleanValue();
    }

    public boolean sleepWindowEpochCalculationBugFix() {
        return ((Boolean) sleepWindowEpochCalculationBugFix.c()).booleanValue();
    }

    public boolean truncateSleepInUserWindow() {
        return ((Boolean) truncateSleepInUserWindow.c()).booleanValue();
    }

    public long writeSleepClassifyIntervalMinutes() {
        return ((Long) writeSleepClassifyIntervalMinutes.c()).longValue();
    }
}
