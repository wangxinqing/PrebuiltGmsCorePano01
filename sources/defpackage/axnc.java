package defpackage;

/* renamed from: axnc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class axnc implements axnb {
    public static final agvx a;
    public static final agvx b;

    static {
        agvw a2 = new agvw(agvj.a("com.google.android.gms.googlehelp")).a();
        a = agvx.a(a2, "AndroidGoogleHelp__force_disable_all_flags", false);
        b = agvx.a(a2, "AndroidGoogleHelp__force_enable_legacy_contact_options", false);
        agvx.a(a2, "AndroidGoogleHelp__unified_rapi_url_mendel_ids", "");
    }

    public final boolean a() {
        return ((Boolean) a.c()).booleanValue();
    }

    public final boolean b() {
        return ((Boolean) b.c()).booleanValue();
    }
}
