package defpackage;

/* renamed from: azkx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class azkx implements azkw {
    public static final agvx a;
    public static final agvx b;
    public static final agvx c;

    static {
        agvw agvw = new agvw(agvj.a("com.google.android.gms.smartdevice"));
        a = agvx.a(agvw, "is_magic_wand_enabled", false);
        b = agvx.a(agvw, "magic_wand_host", "cryptauthpublicchallenge-pa.googleapis.com");
        c = agvx.a(agvw, "use_risk_signals_v2", false);
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
}
