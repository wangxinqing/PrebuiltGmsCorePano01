package defpackage;

/* renamed from: awjx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class awjx implements awjw {
    public static final agvx a;
    public static final agvx b;

    static {
        agvw agvw = new agvw(agvj.a("com.google.android.gms.auth_account"));
        a = agvx.a(agvw, "auth_droidguard_burst_window_millis", 0);
        b = agvx.a(agvw, "auth_droidguard_timeout_millis", 60000);
    }

    public final long a() {
        return ((Long) a.c()).longValue();
    }

    public final long b() {
        return ((Long) b.c()).longValue();
    }
}
