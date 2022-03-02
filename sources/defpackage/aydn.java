package defpackage;

/* renamed from: aydn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aydn implements aydm {
    public static final agvx backoffGrowthFactor;
    public static final agvx enabled;
    public static final agvx logSamplingRate;
    public static final agvx lowdExpId;
    public static final agvx maxBackoffMs;
    public static final agvx minBackoffMs;
    public static final agvx minBatteryLevelPct;

    static {
        agvw a = new agvw(agvj.a("com.google.android.location")).a("location:");
        backoffGrowthFactor = agvx.a(a, "lowd_backoff_growth_factor", 2);
        enabled = agvx.a(a, "enable_location_off_warning_dialog", true);
        logSamplingRate = agvx.a(a, "lowd_clearcut_sampling_rate", 0.1d);
        lowdExpId = agvx.a(a, "lowd_exp_id", "");
        maxBackoffMs = agvx.a(a, "lowd_max_backoff_millis", 2592000000L);
        minBackoffMs = agvx.a(a, "lowd_min_backoff_millis", 86400000);
        minBatteryLevelPct = agvx.a(a, "lowd_min_battery_level_pct", 0.3d);
    }

    public long backoffGrowthFactor() {
        return ((Long) backoffGrowthFactor.c()).longValue();
    }

    public boolean compiled() {
        return true;
    }

    public boolean enabled() {
        return ((Boolean) enabled.c()).booleanValue();
    }

    public double logSamplingRate() {
        return ((Double) logSamplingRate.c()).doubleValue();
    }

    public String lowdExpId() {
        return (String) lowdExpId.c();
    }

    public long maxBackoffMs() {
        return ((Long) maxBackoffMs.c()).longValue();
    }

    public long minBackoffMs() {
        return ((Long) minBackoffMs.c()).longValue();
    }

    public double minBatteryLevelPct() {
        return ((Double) minBatteryLevelPct.c()).doubleValue();
    }
}
