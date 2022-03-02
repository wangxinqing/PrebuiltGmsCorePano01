package defpackage;

/* renamed from: aykf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aykf implements ayke {
    public static final agvx a;
    public static final agvx b;
    public static final agvx c;
    public static final agvx d;
    public static final agvx e;

    static {
        agvw agvw = new agvw(agvj.a("com.google.android.gms.measurement"));
        a = agvx.a(agvw, "measurement.sdk.collection.enable_extend_user_property_size", true);
        b = agvx.a(agvw, "measurement.sdk.collection.last_deep_link_referrer2", true);
        c = agvx.a(agvw, "measurement.sdk.collection.last_deep_link_referrer_campaign2", false);
        d = agvx.a(agvw, "measurement.sdk.collection.last_gclid_from_referrer2", false);
        e = agvx.a(agvw, "measurement.sdk.collection.worker_thread_referrer", true);
        agvx.a(agvw, "measurement.id.sdk.collection.last_deep_link_referrer2", 0);
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
}
