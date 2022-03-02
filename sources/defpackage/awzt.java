package defpackage;

/* renamed from: awzt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class awzt implements awzs {
    public static final agvx a;
    public static final agvx b;
    public static final agvx c;
    public static final agvx d;

    static {
        agvw a2 = new agvw(agvj.a("com.google.android.gms")).a();
        a = agvx.a(a2, "GoogleSettings__enable_category_headers_fix", true);
        b = agvx.a(a2, "GoogleSettings__enable_debug_menu", false);
        c = agvx.a(a2, "GoogleSettings__enable_subcategories", false);
        d = agvx.a(a2, "GoogleSettings__override_up_action_behavior", false);
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

    public final boolean d() {
        return ((Boolean) d.c()).booleanValue();
    }
}
