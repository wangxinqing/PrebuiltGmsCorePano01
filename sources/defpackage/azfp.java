package defpackage;

/* renamed from: azfp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class azfp implements azfo {
    public static final agvx a;

    static {
        agvw b = new agvw(agvj.a("com.google.android.gms.security")).a("mdm.").b();
        agvx.a(b, "ring_my_phone_sidewinder", false);
        a = agvx.a(b, "show_location_notification", true);
        agvx.a(b, "wearable_obstruction_enabled", false);
    }

    public final boolean a() {
        return ((Boolean) a.c()).booleanValue();
    }
}
