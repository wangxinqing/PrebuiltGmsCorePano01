package defpackage;

/* renamed from: axky  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class axky implements axkx {
    public static final agvx a;
    public static final agvx b;
    public static final agvx c;

    static {
        agvw agvw = new agvw(agvj.a("com.google.android.gms.gcm"));
        a = agvx.a(agvw, "gtalk_fallback_mobile_hostports", "alt1-mtalk.google.com:5228,alt2-mtalk.google.com:5228,alt3-mtalk.google.com:5228,alt4-mtalk.google.com:5228,alt5-mtalk.google.com:5228,alt6-mtalk.google.com:5228,alt7-mtalk.google.com:5228,alt8-mtalk.google.com:5228");
        b = agvx.a(agvw, "gtalk_fallback_wifi_hostports", "alt1-mtalk.google.com:443,alt2-mtalk.google.com:443,alt3-mtalk.google.com:443,alt4-mtalk.google.com:443,alt5-mtalk.google.com:5228,alt6-mtalk.google.com:5228,alt7-mtalk.google.com:5228,alt8-mtalk.google.com:5228");
        c = agvx.a(agvw, "gcm_fallback_reconnect_on_mobile", true);
    }

    public final String a() {
        return (String) a.c();
    }

    public final String b() {
        return (String) b.c();
    }

    public final boolean c() {
        return ((Boolean) c.c()).booleanValue();
    }
}
