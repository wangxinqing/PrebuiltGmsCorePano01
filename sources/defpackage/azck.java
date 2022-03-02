package defpackage;

/* renamed from: azck  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class azck implements azcj {
    public static final agvx a;
    public static final agvx b;
    public static final agvx c;
    public static final agvx d;
    public static final agvx e;
    public static final agvx f;
    public static final agvx g;

    static {
        agvw agvw = new agvw(agvj.a("com.google.android.gms.places"));
        a = agvx.a(agvw, "place_cache_expiration_millis", 1209600000);
        b = agvx.a(agvw, "place_cache_free_ratio", 0.5d);
        c = agvx.a(agvw, "place_cache_leveldb_enabled", true);
        d = agvx.a(agvw, "place_cache_max_num_entries", 1000);
        e = agvx.a(agvw, "place_cache_min_managing_interval_millis", 86400000);
        f = agvx.a(agvw, "current_place_last_location_max_age", 60000000000L);
        g = agvx.a(agvw, "enable_place_entity_cache", true);
    }

    public final long a() {
        return ((Long) a.c()).longValue();
    }

    public final double b() {
        return ((Double) b.c()).doubleValue();
    }

    public final boolean c() {
        return ((Boolean) c.c()).booleanValue();
    }

    public final long d() {
        return ((Long) d.c()).longValue();
    }

    public final long e() {
        return ((Long) e.c()).longValue();
    }

    public final long f() {
        return ((Long) f.c()).longValue();
    }

    public final boolean g() {
        return ((Boolean) g.c()).booleanValue();
    }
}
