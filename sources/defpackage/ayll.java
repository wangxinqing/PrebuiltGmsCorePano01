package defpackage;

/* renamed from: ayll  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ayll implements aylk {
    public static final agvx a;
    public static final agvx b;
    public static final agvx c;

    static {
        agvw agvw = new agvw(agvj.a("com.google.android.gms.measurement"));
        a = agvx.a(agvw, "measurement.service.sessions.remove_disabled_session_number", true);
        b = agvx.a(agvw, "measurement.service.sessions.session_number_enabled", true);
        c = agvx.a(agvw, "measurement.service.sessions.session_number_backfill_enabled", true);
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
