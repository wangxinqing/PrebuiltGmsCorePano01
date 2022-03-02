package defpackage;

/* renamed from: ayst  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ayst implements ayss {
    public static final agvx a;
    public static final agvx b;
    public static final agvx c;
    public static final agvx d;
    public static final agvx e;

    static {
        agvw agvw = new agvw(agvj.a("com.google.android.gms.people"));
        a = agvx.a(agvw, "FsaBugFixesY2019w45__filter_null_api_version_photos_for_hash_key_generation_enabled", true);
        b = agvx.a(agvw, "FsaBugFixesY2019w45__query_cp2_photos_limit", 100);
        c = agvx.a(agvw, "FsaBugFixesY2019w45__query_cp2_photos_max_retries", 20);
        d = agvx.a(agvw, "FsaBugFixesY2019w45__retry_when_gmscore_entry_sync_canceled", true);
        e = agvx.a(agvw, "FsaBugFixesY2019w45__set_limit_when_query_cp2_photos", true);
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

    public final boolean d() {
        return ((Boolean) d.c()).booleanValue();
    }

    public final boolean e() {
        return ((Boolean) e.c()).booleanValue();
    }
}
