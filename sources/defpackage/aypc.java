package defpackage;

/* renamed from: aypc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aypc implements aypb {
    public static final agvx a;
    public static final agvx b;
    public static final agvx c;
    public static final agvx d;
    public static final agvx e;
    public static final agvx f;
    public static final agvx g;
    public static final agvx h;
    public static final agvx i;
    public static final agvx j;
    public static final agvx k;
    public static final agvx l;
    public static final agvx m;

    static {
        agvw b2 = new agvw(agvj.a("com.google.android.gms.update")).a("update_installation_").b();
        a = agvx.a(b2, "allow_pause_automatic_reboot_for_phone_call", false);
        b = agvx.a(b2, "allow_pause_in_post_installation", false);
        c = agvx.a(b2, "installation_approval_check_frequency", 604800000);
        d = agvx.a(b2, "auto_reboot_device_encryption_types", "unencrypted");
        e = agvx.a(b2, "device_charger_only_period", 0);
        f = agvx.a(b2, "device_idle_extension", 1800000);
        g = agvx.a(b2, "device_idle_maintenance_battery_threshold_period", 0);
        h = agvx.a(b2, "device_idle_only_check_frequency", 21600000);
        i = agvx.a(b2, "device_idle_only_period", 0);
        j = agvx.a(b2, "install_tonight_window", "2300-0500");
        k = agvx.a(b2, "low_battery_delay", 3600000);
        l = agvx.a(b2, "installation_paused_by_user_check_frequency", 86400000);
        m = agvx.a(b2, "phone_call_in_progress_delay", 3600000);
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

    public final long e() {
        return ((Long) e.c()).longValue();
    }

    public final long f() {
        return ((Long) f.c()).longValue();
    }

    public final long g() {
        return ((Long) g.c()).longValue();
    }

    public final long h() {
        return ((Long) h.c()).longValue();
    }

    public final long i() {
        return ((Long) i.c()).longValue();
    }

    public final String j() {
        return (String) j.c();
    }

    public final long k() {
        return ((Long) k.c()).longValue();
    }

    public final long l() {
        return ((Long) l.c()).longValue();
    }

    public final long m() {
        return ((Long) m.c()).longValue();
    }
}
