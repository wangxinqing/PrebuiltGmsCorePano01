package defpackage;

/* renamed from: axmu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class axmu implements axmt {
    public static final agvx a;
    public static final agvx b;
    public static final agvx c;

    static {
        agvw a2 = new agvw(agvj.a("com.google.android.gms.googlehelp")).a();
        a = agvx.a(a2, "AndroidGoogleHelp__cancel_chat_polling_after_gcm_received", false);
        b = agvx.a(a2, "AndroidGoogleHelp__is_cbf_chat_enabled", true);
        c = agvx.a(a2, "AndroidGoogleHelp__use_most_recent_chat_version_for_polling", false);
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
}
