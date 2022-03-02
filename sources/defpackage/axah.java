package defpackage;

/* renamed from: axah  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class axah implements axag {
    public static final agvx a;
    public static final agvx b;
    public static final agvx c;

    static {
        agvw a2 = new agvw(agvj.a("com.google.android.gms")).a();
        a = agvx.a(a2, "Notifications__blocked_modules", "");
        b = agvx.a(a2, "Notifications__counters_enabled", false);
        c = agvx.a(a2, "Notifications__manager_enabled", true);
    }

    public final String a() {
        return (String) a.c();
    }

    public final boolean b() {
        return ((Boolean) b.c()).booleanValue();
    }

    public final boolean c() {
        return ((Boolean) c.c()).booleanValue();
    }
}
