package defpackage;

/* renamed from: ayrv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ayrv implements ayru {
    public static final agvx a;
    public static final agvx b;
    public static final agvx c;
    public static final agvx d;
    public static final agvx e;
    public static final agvx f;
    public static final agvx g;
    public static final agvx h;

    static {
        agvw agvw = new agvw(agvj.a("com.google.android.gms.people"));
        a = agvx.a(agvw, "FsaBatteryFeature__contacts_sync_on_charging_event_logging_enabled", true);
        b = agvx.a(agvw, "FsaBatteryFeature__disallow_trigger_sync_on_charging_when_full_synced_recently", true);
        c = agvx.a(agvw, "FsaBatteryFeature__log_battery_state_enabled", true);
        d = agvx.a(agvw, "FsaBatteryFeature__request_full_sync_on_charging_interval_seconds", 604800);
        e = agvx.a(agvw, "FsaBatteryFeature__request_sync_on_charging_interval_seconds", 86400);
        f = agvx.a(agvw, "FsaBatteryFeature__require_wifi_to_trigger_sync_on_charging", true);
        g = agvx.a(agvw, "FsaBatteryFeature__skip_sync_on_charging_logging_enabled", true);
        h = agvx.a(agvw, "FsaBatteryFeature__skip_sync_on_charging_max_logging_frequency_in_seconds", 300);
    }

    public final boolean a() {
        return ((Boolean) a.c()).booleanValue();
    }

    public final boolean b() {
        return ((Boolean) b.c()).booleanValue();
    }

    public final boolean c() {
        return ((Boolean) c.c()).booleanValue();
    }

    public final long d() {
        return ((Long) d.c()).longValue();
    }

    public final long e() {
        return ((Long) e.c()).longValue();
    }

    public final boolean f() {
        return ((Boolean) f.c()).booleanValue();
    }

    public final boolean g() {
        return ((Boolean) g.c()).booleanValue();
    }

    public final long h() {
        return ((Long) h.c()).longValue();
    }
}
