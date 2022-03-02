package defpackage;

/* renamed from: axxx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class axxx implements axxw {
    public static final agvx burstCollectorActiveModeEnabled;
    public static final agvx burstCollectorPassiveModeActivityCheckEnabled;
    public static final agvx burstCollectorPassiveModeEnabled;

    static {
        agvw a = new agvw(agvj.a("com.google.android.location")).a("location:");
        burstCollectorActiveModeEnabled = agvx.a(a, "burst_collector_active_mode_enabled", true);
        burstCollectorPassiveModeActivityCheckEnabled = agvx.a(a, "burst_collector_passive_mode_activity_check_enabled", false);
        burstCollectorPassiveModeEnabled = agvx.a(a, "burst_collector_passive_mode_enabled", true);
    }

    public boolean burstCollectorActiveModeEnabled() {
        return ((Boolean) burstCollectorActiveModeEnabled.c()).booleanValue();
    }

    public boolean burstCollectorPassiveModeActivityCheckEnabled() {
        return ((Boolean) burstCollectorPassiveModeActivityCheckEnabled.c()).booleanValue();
    }

    public boolean burstCollectorPassiveModeEnabled() {
        return ((Boolean) burstCollectorPassiveModeEnabled.c()).booleanValue();
    }

    public boolean compiled() {
        return true;
    }
}
