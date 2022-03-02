package defpackage;

/* renamed from: awhg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class awhg implements awhf {
    public static final agvx a;

    static {
        agvw agvw = new agvw(agvj.a("com.google.android.gms.admob"));
        a = agvx.a(agvw, "gads:debug_logging_feature:enable", false);
        agvx.a(agvw, "gads:debug_logging_feature:intercept_web_view", false);
    }

    public final boolean a() {
        return ((Boolean) a.c()).booleanValue();
    }
}
