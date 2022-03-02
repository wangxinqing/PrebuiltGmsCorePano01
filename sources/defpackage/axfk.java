package defpackage;

/* renamed from: axfk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class axfk implements axfj {
    public static final agvx a;
    public static final agvx b;
    public static final agvx c;
    public static final agvx d;

    static {
        agvw a2 = new agvw(agvj.a("com.google.android.gms.dynamiclinks")).a("gms:firebase_dynamic_links:");
        a = agvx.a(a2, "get_dynamic_link_client_logging.enabled", true);
        b = agvx.a(a2, "get_dynamic_link.filter.scheme.https_only", true);
        c = agvx.a(a2, "shorten_dynamic_link.enabled", true);
        d = agvx.a(a2, "shorten_dynamic_link.format_url", "https://firebasedynamiclinks.googleapis.com/v1/shortLinks?key=%s");
    }

    public final boolean a() {
        return ((Boolean) a.c()).booleanValue();
    }

    public final boolean b() {
        return ((Boolean) b.c()).booleanValue();
    }

    public final boolean c() {
        return ((Boolean) c.c()).booleanValue();
    }

    public final String d() {
        return (String) d.c();
    }
}
