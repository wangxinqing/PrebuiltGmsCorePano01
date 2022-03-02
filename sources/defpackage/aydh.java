package defpackage;

/* renamed from: aydh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aydh implements aydg {
    public static final agvx addAggregateFlpStatsToDumpsys;
    public static final agvx disableLoggingTtffInTheAggregateLog;
    public static final agvx disablePositiveNumberCheckForS2CellId;
    public static final agvx enableLoggingGnssStatus;
    public static final agvx enableLoggingTtffInLatencyLogSample;
    public static final agvx fixTimeSinceLocationEnabledForOldVersion;
    public static final agvx gnssStatusStatsMaxSatelliteCount;
    public static final agvx gnssStatusStatsSamplingRate;
    public static final agvx locationLocationAvailabilitySamplingRate;
    public static final agvx locationQualityBatteryUsageLogsSamplingRate;
    public static final agvx locationQualityFlpSampleLogsSamplingRate;
    public static final agvx locationQualityFlpStatsCollectionPeriodMs;
    public static final agvx locationQualityFlpStatsSamplingRate;
    public static final agvx locationQualityFlpTtffSampleLogsSamplingRate;
    public static final agvx locationQualityJumpSpeedThreshold;
    public static final agvx locationQualitySampleLogsMaxPerPeriod;
    public static final agvx removeAvailabilityLogging;

    static {
        agvw a = new agvw(agvj.a("com.google.android.location")).a("location:");
        addAggregateFlpStatsToDumpsys = agvx.a(a, "add_aggregate_flp_stats_to_dumpsys", false);
        disableLoggingTtffInTheAggregateLog = agvx.a(a, "LocationLogs__disable_logging_ttff_in_the_aggregate_log", false);
        disablePositiveNumberCheckForS2CellId = agvx.a(a, "LocationLogs__disable_positive_number_check_for_s2_cell_id", false);
        enableLoggingGnssStatus = agvx.a(a, "LocationLogs__enable_logging_gnss_status", false);
        enableLoggingTtffInLatencyLogSample = agvx.a(a, "LocationLogs__enable_logging_ttff_in_latency_log_sample", true);
        fixTimeSinceLocationEnabledForOldVersion = agvx.a(a, "LocationLogs__fix_time_since_location_enabled_for_old_version", true);
        gnssStatusStatsMaxSatelliteCount = agvx.a(a, "LocationLogs__gnss_status_stats_max_satellite_count", 200);
        gnssStatusStatsSamplingRate = agvx.a(a, "LocationLogs__gnss_status_stats_sampling_rate", 0.001d);
        locationLocationAvailabilitySamplingRate = agvx.a(a, "location_quality_availability_sampling_rate", 0.01d);
        locationQualityBatteryUsageLogsSamplingRate = agvx.a(a, "location_quality_battery_usage_logs_sampling_rate", 0.1d);
        locationQualityFlpSampleLogsSamplingRate = agvx.a(a, "location_quality_flp_sample_logs_sampling_rate", 0.001d);
        locationQualityFlpStatsCollectionPeriodMs = agvx.a(a, "location_quality_flp_stats_collection_period_ms", 86400000);
        locationQualityFlpStatsSamplingRate = agvx.a(a, "location_quality_flp_stats_sampling_rate", 0.1d);
        locationQualityFlpTtffSampleLogsSamplingRate = agvx.a(a, "location_quality_flp_ttff_sample_logs_sampling_rate", 1.0d);
        locationQualityJumpSpeedThreshold = agvx.a(a, "location_quality_flp_jump_speed_threshold", 40);
        locationQualitySampleLogsMaxPerPeriod = agvx.a(a, "location_quality_flp_sample_logs_max_per_period", 15);
        removeAvailabilityLogging = agvx.a(a, "LocationLogs__remove_availability_logging", true);
    }

    public boolean addAggregateFlpStatsToDumpsys() {
        return ((Boolean) addAggregateFlpStatsToDumpsys.c()).booleanValue();
    }

    public boolean compiled() {
        return true;
    }

    public boolean disableLoggingTtffInTheAggregateLog() {
        return ((Boolean) disableLoggingTtffInTheAggregateLog.c()).booleanValue();
    }

    public boolean disablePositiveNumberCheckForS2CellId() {
        return ((Boolean) disablePositiveNumberCheckForS2CellId.c()).booleanValue();
    }

    public boolean enableLoggingGnssStatus() {
        return ((Boolean) enableLoggingGnssStatus.c()).booleanValue();
    }

    public boolean enableLoggingTtffInLatencyLogSample() {
        return ((Boolean) enableLoggingTtffInLatencyLogSample.c()).booleanValue();
    }

    public boolean fixTimeSinceLocationEnabledForOldVersion() {
        return ((Boolean) fixTimeSinceLocationEnabledForOldVersion.c()).booleanValue();
    }

    public long gnssStatusStatsMaxSatelliteCount() {
        return ((Long) gnssStatusStatsMaxSatelliteCount.c()).longValue();
    }

    public double gnssStatusStatsSamplingRate() {
        return ((Double) gnssStatusStatsSamplingRate.c()).doubleValue();
    }

    public double locationLocationAvailabilitySamplingRate() {
        return ((Double) locationLocationAvailabilitySamplingRate.c()).doubleValue();
    }

    public double locationQualityBatteryUsageLogsSamplingRate() {
        return ((Double) locationQualityBatteryUsageLogsSamplingRate.c()).doubleValue();
    }

    public double locationQualityFlpSampleLogsSamplingRate() {
        return ((Double) locationQualityFlpSampleLogsSamplingRate.c()).doubleValue();
    }

    public long locationQualityFlpStatsCollectionPeriodMs() {
        return ((Long) locationQualityFlpStatsCollectionPeriodMs.c()).longValue();
    }

    public double locationQualityFlpStatsSamplingRate() {
        return ((Double) locationQualityFlpStatsSamplingRate.c()).doubleValue();
    }

    public double locationQualityFlpTtffSampleLogsSamplingRate() {
        return ((Double) locationQualityFlpTtffSampleLogsSamplingRate.c()).doubleValue();
    }

    public long locationQualityJumpSpeedThreshold() {
        return ((Long) locationQualityJumpSpeedThreshold.c()).longValue();
    }

    public long locationQualitySampleLogsMaxPerPeriod() {
        return ((Long) locationQualitySampleLogsMaxPerPeriod.c()).longValue();
    }

    public boolean removeAvailabilityLogging() {
        return ((Boolean) removeAvailabilityLogging.c()).booleanValue();
    }
}
