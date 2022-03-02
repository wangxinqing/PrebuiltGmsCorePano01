package defpackage;

/* renamed from: aylo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aylo implements ayln {
    public static final agvx a;
    public static final agvx b;
    public static final agvx c;

    static {
        agvw agvw = new agvw(agvj.a("com.google.android.gms.measurement"));
        a = agvx.a(agvw, "measurement.client.sessions.background_sessions_enabled", true);
        agvx.a(agvw, "measurement.client.sessions.immediate_start_enabled_foreground", true);
        b = agvx.a(agvw, "measurement.client.sessions.remove_expired_session_properties_enabled", true);
        c = agvx.a(agvw, "measurement.client.sessions.session_id_enabled", true);
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
