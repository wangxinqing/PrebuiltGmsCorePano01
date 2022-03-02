package defpackage;

/* renamed from: azmf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class azmf implements azme {
    public static final agvx a;
    public static final agvx b;
    public static final agvx c;
    public static final agvx d;
    public static final agvx e;
    public static final agvx f;
    public static final agvx g;

    static {
        agvw agvw = new agvw(agvj.a("com.google.android.gms.smartdevice"));
        a = agvx.a(agvw, "enable_minute_maid_flow", false);
        b = agvx.a(agvw, "WifiD2d__google_restore_uri", "intent:#Intent;action=com.google.android.gms.backup.ACTION_WIFI_D2D;package=com.google.android.gms;end");
        c = agvx.a(agvw, "WifiD2d__is_oem_restore_enabled_on_source", false);
        d = agvx.a(agvw, "WifiD2d__resolve_package_name", false);
        e = agvx.a(agvw, "WifiD2d__set_post_transfer_action_for_wifi_d2d_only", true);
        f = agvx.a(agvw, "WifiD2d__target_set_module_version_in_bootstrap_options", true);
        g = agvx.a(agvw, "WifiD2d__use_new_d2d_copying_accounts_title", true);
    }

    public final boolean a() {
        return ((Boolean) a.c()).booleanValue();
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

    public final boolean e() {
        return ((Boolean) e.c()).booleanValue();
    }

    public final boolean f() {
        return ((Boolean) f.c()).booleanValue();
    }

    public final boolean g() {
        return ((Boolean) g.c()).booleanValue();
    }
}
