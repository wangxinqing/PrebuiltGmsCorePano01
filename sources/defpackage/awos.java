package defpackage;

/* renamed from: awos  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class awos implements awor {
    public static final agvx a;
    public static final agvx b;

    static {
        agvw agvw = new agvw(agvj.a("com.google.android.gms.auth_api_proxy"));
        a = agvx.a(agvw, "auth_proxy_api_sample_percentage", 0.0d);
        b = agvx.a(agvw, "auth_proxy_apiary_url_pattern", "((^https:\\/\\/(?:[\\w\\-\\_]+\\.)+corp\\.google\\.com\\/)|(^https:\\/\\/(?:[\\w\\-\\_]+\\.)+googleplex\\.com\\/)|(^https:\\/\\/(?:[\\w\\-\\_]+\\.)+googleapis\\.com\\/))(\\/(?:(?:[a-zA-Z -퟿豈-﷏ﷰ-￯\\;\\/\\?\\:\\@\\&\\=\\#\\~\\-\\.\\+\\!\\*\\'\\(\\)\\,\\_])|(?:\\%[a-fA-F0-9]{2}))*)?(?:\\b|$)");
    }

    public final double a() {
        return ((Double) a.c()).doubleValue();
    }

    public final String b() {
        return (String) b.c();
    }
}
