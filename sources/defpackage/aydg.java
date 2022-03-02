package defpackage;

/* renamed from: aydg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public interface aydg {
    boolean addAggregateFlpStatsToDumpsys();

    boolean disableLoggingTtffInTheAggregateLog();

    boolean disablePositiveNumberCheckForS2CellId();

    boolean enableLoggingGnssStatus();

    boolean enableLoggingTtffInLatencyLogSample();

    boolean fixTimeSinceLocationEnabledForOldVersion();

    long gnssStatusStatsMaxSatelliteCount();

    double gnssStatusStatsSamplingRate();

    double locationLocationAvailabilitySamplingRate();

    double locationQualityBatteryUsageLogsSamplingRate();

    double locationQualityFlpSampleLogsSamplingRate();

    long locationQualityFlpStatsCollectionPeriodMs();

    double locationQualityFlpStatsSamplingRate();

    double locationQualityFlpTtffSampleLogsSamplingRate();

    long locationQualityJumpSpeedThreshold();

    long locationQualitySampleLogsMaxPerPeriod();

    boolean removeAvailabilityLogging();
}
