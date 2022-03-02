package defpackage;

/* renamed from: aybw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aybw implements aybv {
    public static final agvx enableClearCutLogs;
    public static final agvx geofencerEventsPerDeviceSamplingRate;
    public static final agvx geofencerEventsSamplingRate;
    public static final agvx geofencerMaximumEventsPerPeriod;
    public static final agvx geofencerStatsCollectionPeriodMillis;
    public static final agvx geofencerStatsSamplingRate;

    static {
        agvw a = new agvw(agvj.a("com.google.android.location")).a("location:");
        enableClearCutLogs = agvx.a(a, "GeofencerClearCutLogs__enable_clear_cut_logs", false);
        geofencerEventsPerDeviceSamplingRate = agvx.a(a, "GeofencerClearCutLogs__geofencer_events_per_device_sampling_rate", 0.01d);
        geofencerEventsSamplingRate = agvx.a(a, "GeofencerClearCutLogs__geofencer_events_sampling_rate", 0.001d);
        geofencerMaximumEventsPerPeriod = agvx.a(a, "GeofencerClearCutLogs__geofencer_maximum_events_per_period", 20);
        geofencerStatsCollectionPeriodMillis = agvx.a(a, "GeofencerClearCutLogs__geofencer_stats_collection_period_millis", 86400000);
        geofencerStatsSamplingRate = agvx.a(a, "GeofencerClearCutLogs__geofencer_stats_sampling_rate", 0.001d);
    }

    public boolean compiled() {
        return true;
    }

    public boolean enableClearCutLogs() {
        return ((Boolean) enableClearCutLogs.c()).booleanValue();
    }

    public double geofencerEventsPerDeviceSamplingRate() {
        return ((Double) geofencerEventsPerDeviceSamplingRate.c()).doubleValue();
    }

    public double geofencerEventsSamplingRate() {
        return ((Double) geofencerEventsSamplingRate.c()).doubleValue();
    }

    public long geofencerMaximumEventsPerPeriod() {
        return ((Long) geofencerMaximumEventsPerPeriod.c()).longValue();
    }

    public long geofencerStatsCollectionPeriodMillis() {
        return ((Long) geofencerStatsCollectionPeriodMillis.c()).longValue();
    }

    public double geofencerStatsSamplingRate() {
        return ((Double) geofencerStatsSamplingRate.c()).doubleValue();
    }
}
