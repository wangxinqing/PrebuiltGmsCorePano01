package defpackage;

/* renamed from: jcg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class jcg {
    public static final agvw a;
    public static final agvx b;
    public static final agvx c = agvx.a(a, "upload_network_stats_interval", 0);
    public static final agvx d = agvx.a(a, "stats:max_num_of_events", 100);
    public static final agvx e = agvx.a(a, "stats:max_chunk_size", 100);
    public static final agvx f = agvx.a(a, "stats:writer:timeout_millis", 60000);
    public static final agvx g = agvx.a(a, "stats:writer:buffer_size", 20480);
    public static final agvx h = agvx.a(a, "stats:allow_non_googler_upload", false);

    static {
        agvw a2 = new agvw("direct_boot:gms_chimera_phenotype_flags").a("gms:common:");
        a = a2;
        b = agvx.a(a2, "upload_internal_stats_interval", 0);
    }
}
