package defpackage;

/* renamed from: awgx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class awgx implements awgw {
    public static final agvx a;
    public static final agvx b;

    static {
        agvw a2 = new agvw(agvj.a("com.google.android.gms.accountsettings")).a("gms:accountsettings:");
        a = agvx.a(a2, "CronetSupport__quic_url_hint_hostnames", "www.gstatic.com,ssl.gstatic.com,lh1.googleusercontent.com,lh2.googleusercontent.com,lh3.googleusercontent.com,lh4.googleusercontent.com,lh5.googleusercontent.com,lh6.googleusercontent.com");
        b = agvx.a(a2, "CronetSupport__thread_priority_foreground_enabled", true);
    }

    public final String a() {
        return (String) a.c();
    }

    public final boolean b() {
        return ((Boolean) b.c()).booleanValue();
    }
}
