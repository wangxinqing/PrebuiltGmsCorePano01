package defpackage;

/* renamed from: awwg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class awwg implements awwf {
    public static final agvx a;
    public static final agvx b;
    public static final agvx c;

    static {
        agvw a2 = new agvw(agvj.a("com.google.android.gms.contextmanager")).a();
        a = agvx.a(a2, "is_test_user", false);
        b = agvx.a(a2, "server_api_path", "/usercontext/v1/controllerhub/");
        c = agvx.a(a2, "server_url", "https://www.googleapis.com");
    }

    public final boolean a() {
        return ((Boolean) a.c()).booleanValue();
    }

    public final String b() {
        return (String) b.c();
    }

    public final String c() {
        return (String) c.c();
    }
}
