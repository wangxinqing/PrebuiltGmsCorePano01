package defpackage;

/* renamed from: azuh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class azuh implements azug {
    public static final agvx a;
    public static final agvx b;
    public static final agvx c;
    public static final agvx d;
    public static final agvx e;
    public static final agvx f;
    public static final agvx g;

    static {
        agvw b2 = new agvw(agvj.a("com.google.android.gms.usagereporting")).a("gms:usagereporting:").b();
        a = agvx.a(b2, "calling_package_white_list", "");
        b = agvx.a(b2, "cb_from_setup_wizard_package_whitelist", "com.google.android.setupwizard,com.google.android.gms.apitest");
        c = agvx.a(b2, "enable_calling_package_checker", false);
        d = agvx.a(b2, "platform_mnop", false);
        e = agvx.a(b2, "new_checkbox_gms_core_version_bound", 11200000);
        f = agvx.a(b2, "playpass_opt_in_package_whitelist", "com.android.vending,com.google.android.gms.apitest");
        g = agvx.a(b2, "use_secret_number", false);
    }

    public final String a() {
        return (String) a.c();
    }

    public final String b() {
        return (String) b.c();
    }

    public final boolean c() {
        return ((Boolean) c.c()).booleanValue();
    }

    public final boolean d() {
        return ((Boolean) d.c()).booleanValue();
    }

    public final long e() {
        return ((Long) e.c()).longValue();
    }

    public final String f() {
        return (String) f.c();
    }

    public final boolean g() {
        return ((Boolean) g.c()).booleanValue();
    }
}
