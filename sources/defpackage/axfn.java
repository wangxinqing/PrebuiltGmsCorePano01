package defpackage;

/* renamed from: axfn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class axfn implements axfm {
    public static final agvx a;
    public static final agvx b;
    public static final agvx c;
    public static final agvx d;
    public static final agvx e;

    static {
        agvw a2 = new agvw(agvj.a("com.google.android.gms.enterprise")).a();
        a = agvx.a(a2, "ZeroTouchFeature__bypass_device_conditions_check", false);
        agvx.a(a2, "ZeroTouchFeature__enable_forced_factory_reset", false);
        agvx.a(a2, "ZeroTouchFeature__enable_full_auto_load_in_loader", false);
        b = agvx.a(a2, "ZeroTouchFeature__enable_zero_touch_in_auth", false);
        c = agvx.a(a2, "ZeroTouchFeature__feature_request_timeout_in_seconds", 120);
        d = agvx.a(a2, "ZeroTouchFeature__log_source", "");
        agvx.a(a2, "ZeroTouchFeature__provisioning_extended_logging", false);
        agvx.a(a2, "ZeroTouchFeature__provisioning_server_network_timeout_ms", 60000);
        agvx.a(a2, "ZeroTouchFeature__provisioning_server_suw_network_timeout_ms", 30000);
        agvx.a(a2, "ZeroTouchFeature__provisioning_server_url", "https://staging-afwprovisioning-pa.sandbox.googleapis.com");
        e = agvx.a(a2, "ZeroTouchFeature__zero_touch_config_present", false);
    }

    public final boolean a() {
        return ((Boolean) a.c()).booleanValue();
    }

    public final boolean b() {
        return ((Boolean) b.c()).booleanValue();
    }

    public final long c() {
        return ((Long) c.c()).longValue();
    }

    public final String d() {
        return (String) d.c();
    }

    public final boolean e() {
        return ((Boolean) e.c()).booleanValue();
    }
}
