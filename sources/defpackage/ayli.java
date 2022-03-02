package defpackage;

/* renamed from: ayli  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ayli implements aylh {
    public static final agvx a;
    public static final agvx b;
    public static final agvx c;
    public static final agvx d;
    public static final agvx e;
    public static final agvx f;
    public static final agvx g;
    public static final agvx h;

    static {
        agvw agvw = new agvw(agvj.a("com.google.android.gms.measurement"));
        a = agvx.a(agvw, "measurement.service.audience.scoped_filters_v27", true);
        b = agvx.a(agvw, "measurement.service.audience.session_scoped_user_engagement", true);
        c = agvx.a(agvw, "measurement.client.audience.scoped_engagement_removal_when_session_expired", true);
        d = agvx.a(agvw, "measurement.service.audience.scoped_engagement_removal_when_session_expired", true);
        e = agvx.a(agvw, "measurement.service.audience.session_scoped_event_aggregates", true);
        f = agvx.a(agvw, "measurement.service.audience.use_bundle_timestamp_for_property_filters", true);
        agvx.a(agvw, "measurement.id.scoped_audience_filters", 0);
        g = agvx.a(agvw, "measurement.service.audience.fix_prepending_previous_sequence_timestamp", true);
        h = agvx.a(agvw, "measurement.service.audience.remove_disabled_session_scoped_user_engagement", false);
    }

    public final boolean a() {
        return true;
    }

    public final boolean b() {
        return ((Boolean) a.c()).booleanValue();
    }

    public final boolean c() {
        return ((Boolean) b.c()).booleanValue();
    }

    public final boolean d() {
        return ((Boolean) c.c()).booleanValue();
    }

    public final boolean e() {
        return ((Boolean) d.c()).booleanValue();
    }

    public final boolean f() {
        return ((Boolean) e.c()).booleanValue();
    }

    public final boolean g() {
        return ((Boolean) f.c()).booleanValue();
    }

    public final boolean h() {
        return ((Boolean) g.c()).booleanValue();
    }

    public final boolean i() {
        return ((Boolean) h.c()).booleanValue();
    }
}
