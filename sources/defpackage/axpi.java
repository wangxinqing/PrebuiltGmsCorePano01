package defpackage;

/* renamed from: axpi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class axpi implements axph {
    public static final agvx a;

    static {
        agvw a2 = new agvw(agvj.a("com.google.android.gms.googlehelp")).a();
        agvx.a(a2, "AndroidGoogleHelp__enable_community_card", true);
        agvx.a(a2, "AndroidGoogleHelp__enable_material_2_chat", false);
        a = agvx.a(a2, "AndroidGoogleHelp__enable_open_to_smart_journey", false);
    }

    public final boolean a() {
        return ((Boolean) a.c()).booleanValue();
    }
}
