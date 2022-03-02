package defpackage;

/* renamed from: ayfd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public interface ayfd {
    boolean allowMissingWindowsDetection();

    boolean bedtimeFirstPartyWhitelistedAppEnabled();

    boolean chreSleepAudioEnabled();

    boolean chreSleepDetectionEnabled();

    boolean gmsSleepClassificationEventLoggingEnabled();

    boolean logSleepApiStats();

    long minAwakeCountBeforeSegment();

    long minAwakeHsmmParam();

    long minBedtimeSupportedGmscoreVersion();

    long minSegmentedSleepHours();

    long minSleepHsmmParam();

    long minTotalEpochsBeforeSegment();

    String preferredSleepTimeWhitelist();

    boolean segmentSleepBeforeWindowEnds();

    long segmentSleepEndHour();

    long segmentSleepStartHour();

    boolean sendSleepSegmentUponRegister();

    boolean setAllowIdleAlarmForSleep();

    long sleepActivityDetectionIdleIntervalMillis();

    long sleepActivityDetectionIntervalMillis();

    boolean sleepAlarmRingBugFix();

    String sleepApiWhitelist();

    long sleepClockAlarmConfidenceOverwriteMinutes();

    long sleepConfidenceFromMotion();

    boolean sleepDetectionAlarmAllowIdle();

    boolean sleepDetectionFirstPartyOnly();

    long sleepHighConfidenceAwakeThreshold();

    long sleepMissingDataMaxGapEpochs();

    boolean sleepSegmentDetectionEnabled();

    boolean sleepWindowEpochCalculationBugFix();

    boolean truncateSleepInUserWindow();

    long writeSleepClassifyIntervalMinutes();
}
