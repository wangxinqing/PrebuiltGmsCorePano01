package defpackage;

/* renamed from: axso  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class axso implements axsn {
    public static final agvx a;
    public static final agvx b;
    public static final agvx c;
    public static final agvx d;
    public static final agvx e;
    public static final agvx f;
    public static final agvx g;
    public static final agvx h;

    static {
        agvw agvw = new agvw(agvj.a("com.google.android.gms.icing"));
        a = agvx.a(agvw, "enable_predefined_typeconfig_schema_changes_during_maintenance", false);
        b = agvx.a(agvw, "unified_indexing_commit_per_num_requests", 32);
        c = agvx.a(agvw, "unified_indexing_enable_handle_low_storage_state", -1);
        d = agvx.a(agvw, "unified_indexing_max_drain_delay_sec", 30);
        e = agvx.a(agvw, "unified_indexing_min_drain_delay_sec", 10);
        f = agvx.a(agvw, "unified_indexing_package_whitelist", "");
        g = agvx.a(agvw, "unified_indexing_request_queue", false);
        h = agvx.a(agvw, "unified_indexing_request_queue_items_per_shard", 32);
        agvx.a(agvw, "unified_indexing_use_gcm_task", true);
    }

    public final boolean a() {
        return ((Boolean) a.c()).booleanValue();
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

    public final String f() {
        return (String) f.c();
    }

    public final boolean g() {
        return ((Boolean) g.c()).booleanValue();
    }

    public final long h() {
        return ((Long) h.c()).longValue();
    }
}
