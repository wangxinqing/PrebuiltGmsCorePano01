package defpackage;

/* renamed from: awod  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class awod implements awoc {
    public static final agvx a;
    public static final agvx b;

    static {
        agvw agvw = new agvw(agvj.a("com.google.android.gms.auth.api.credentials"));
        a = agvx.a(agvw, "GisGalServerSettings__hostname", "accountlinking-pa.googleapis.com");
        b = agvx.a(agvw, "GisGalServerSettings__port", 443);
    }

    public final String a() {
        return (String) a.c();
    }

    public final long b() {
        return ((Long) b.c()).longValue();
    }
}
