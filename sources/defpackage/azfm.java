package defpackage;

/* renamed from: azfm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class azfm implements azfl {
    public static final agvx a;
    public static final agvx b;
    public static final agvx c;
    public static final agvx d;
    public static final agvx e;
    public static final agvx f;
    public static final agvx g;

    static {
        agvw agvw = new agvw(agvj.a("com.google.android.gms.security"));
        agvx.a(agvw, "FmdFeature__disable_rmp_for_unsupported_devices", false);
        a = agvx.a(agvw, "find_my_device_master_switch_enabled", true);
        agvx.a(agvw, "get_serial_number", true);
        agvx.a(agvw, "get_signal_strength", true);
        agvx.a(agvw, "FmdFeature__handle_total_silence", true);
        b = agvx.a(agvw, "killswitch_allow_only_latin_ascii_for_passwords", false);
        c = agvx.a(agvw, "killswitch_disable_nfc_on_lock", false);
        d = agvx.a(agvw, "locate_optimization_enabled", true);
        e = agvx.a(agvw, "", true);
        f = agvx.a(agvw, "secure_nfc_on_lock_enabled", true);
        agvx.a(agvw, "support_unpair", true);
        g = agvx.a(agvw, "unpair_timeout_ms", 30000);
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

    public final boolean d() {
        return ((Boolean) d.c()).booleanValue();
    }

    public final boolean e() {
        return ((Boolean) e.c()).booleanValue();
    }

    public final boolean f() {
        return ((Boolean) f.c()).booleanValue();
    }

    public final long g() {
        return ((Long) g.c()).longValue();
    }
}
