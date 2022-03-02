package defpackage;

/* renamed from: awpq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class awpq implements awpp {
    public static final agvx a;

    static {
        agvw agvw = new agvw(agvj.a("com.google.android.gms.auth_managed"));
        agvx.a(agvw, "auth_stop_enable_unknown_sources", true);
        a = agvx.a(agvw, "auth_managed_install_intent_flow", true);
    }

    public final boolean a() {
        return ((Boolean) a.c()).booleanValue();
    }
}
