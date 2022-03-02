package defpackage;

/* renamed from: aygy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aygy implements aygx {
    public static final agvx a;
    public static final agvx b;
    public static final agvx c;
    public static final agvx d;
    public static final agvx e;

    static {
        agvw a2 = new agvw(agvj.a("com.google.android.gms.mdisync")).a();
        a = agvx.a(a2, "CoreFeature__proto_data_store_dasu_sampling_interval", 0);
        b = agvx.a(a2, "PdsFeature__first_party_acl_fetcher_stats_sampling_interval", 0);
        c = agvx.a(a2, "PdsFeature__intent_delivery_timeout_secs", 10);
        d = agvx.a(a2, "PdsFeature__intent_success_sampling_interval", 0);
        e = agvx.a(a2, "CoreFeature__proto_data_store_intent_sampling_interval", 0);
    }

    public final long a() {
        return ((Long) a.c()).longValue();
    }

    public final long b() {
        return ((Long) b.c()).longValue();
    }

    public final long c() {
        return ((Long) c.c()).longValue();
    }

    public final long d() {
        return ((Long) d.c()).longValue();
    }

    public final long e() {
        return ((Long) e.c()).longValue();
    }
}
