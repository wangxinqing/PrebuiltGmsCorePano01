package defpackage;

/* renamed from: axkg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class axkg implements axkf {
    public static final agvx a;
    public static final agvx b;

    static {
        agvw agvw = new agvw(agvj.a("com.google.android.gms.gcm"));
        a = agvx.a(agvw, "gcm_check_for_different_iid_in_token", true);
        b = agvx.a(agvw, "nts.enable_tracing", true);
    }

    public final boolean a() {
        return ((Boolean) a.c()).booleanValue();
    }

    public final boolean b() {
        return ((Boolean) b.c()).booleanValue();
    }
}
