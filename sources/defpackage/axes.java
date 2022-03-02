package defpackage;

/* renamed from: axes  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class axes implements axer {
    public static final agvx a;
    public static final agvx b;

    static {
        agvw agvw = new agvw(agvj.a("com.google.android.gms.droidguard"));
        a = agvx.a(agvw, "gms:droidguard:backend_address", "https://www.googleapis.com");
        b = agvx.a(agvw, "gms:droidguard:enable_key_override", false);
    }

    public final String a() {
        return (String) a.c();
    }

    public final boolean b() {
        return ((Boolean) b.c()).booleanValue();
    }
}
