package defpackage;

/* renamed from: axdf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class axdf implements axde {
    public static final agvx a;
    public static final agvx b;
    public static final agvx c;

    static {
        agvw a2 = new agvw(agvj.a("com.google.android.gms")).a("gms:app:");
        agvx.a(a2, "disable_google_help_register_toggle_for_test", false);
        a = agvx.a(a2, "enable_network_usage_activity_advanced", false);
        b = agvx.a(a2, "enable_settings_search_indexing", true);
        c = agvx.a(a2, "enable_usage_reporting", true);
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
}
