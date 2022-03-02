package defpackage;

/* renamed from: azdm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class azdm implements azdl {
    public static final agvx a;
    public static final agvx b;
    public static final agvx c;
    public static final agvx d;
    public static final agvx e;

    static {
        agvw a2 = new agvw(agvj.a("com.google.android.gms.recaptcha")).a();
        a = agvx.a(a2, "recaptcha:droidguard_handle_expiration_time_seconds", 300);
        b = agvx.a(a2, "recaptcha:https_connect_timeout_ms", 60000);
        c = agvx.a(a2, "recaptcha:https_read_timeout_ms", 60000);
        d = agvx.a(a2, "recaptcha:landing_token_expiration_time_seconds", 86400);
        e = agvx.a(a2, "recaptcha:recaptcha_http_endpoint", "https://www.google.com");
    }

    public final long a() {
        return ((Long) a.c()).longValue();
    }

    public final long b() {
        return ((Long) b.c()).longValue();
    }

    public final long c() {
        return ((Long) c.c()).longValue();
    }

    public final long d() {
        return ((Long) d.c()).longValue();
    }

    public final String e() {
        return (String) e.c();
    }
}
