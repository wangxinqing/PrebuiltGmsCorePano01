package defpackage;

/* renamed from: awhz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class awhz implements awhy {
    public static final agvx a;
    public static final agvx b;
    public static final agvx c;

    static {
        agvw a2 = new agvw(agvj.a("com.google.android.gms.appstate")).a();
        a = agvx.a(a2, "Turndown__call_callback_synchronously", false);
        agvx.a(a2, "Turndown__disable_sync", false);
        agvx.a(a2, "Turndown__enable", true);
        b = agvx.a(a2, "Turndown__remove_content_provider", false);
        c = agvx.a(a2, "Turndown__remove_database", false);
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
