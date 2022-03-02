package defpackage;

/* renamed from: awql  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class awql implements awqk {
    public static final agvx a;
    public static final agvx b;
    public static final agvx c;

    static {
        agvw agvw = new agvw(agvj.a("com.google.android.gms.car"));
        a = agvx.a(agvw, "morris_support_enabled", false);
        b = agvx.a(agvw, "none_behavior_enabled", false);
        c = agvx.a(agvw, "show_gearhead_in_frx", false);
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
