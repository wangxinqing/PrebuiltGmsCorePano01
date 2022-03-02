package defpackage;

/* renamed from: azic  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class azic implements azib {
    public static final agvx a;
    public static final agvx b;
    public static final agvx c;

    static {
        agvw a2 = new agvw(agvj.a("com.google.android.gms.smart_profile")).a();
        a = agvx.a(a2, "BugFixesW42Feature__enable_catch_theme_color_unsupported_op_exception", true);
        b = agvx.a(a2, "BugFixesW42Feature__enable_network_connection_snackbar_color_fix", true);
        c = agvx.a(a2, "BugFixesW42Feature__enable_network_connection_snackbar_talkback_fix", true);
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
