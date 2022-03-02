package defpackage;

/* renamed from: axul  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class axul implements axuk {
    public static final agvx a;
    public static final agvx b;
    public static final agvx c;
    public static final agvx d;
    public static final agvx e;

    static {
        agvw a2 = new agvw(agvj.a("com.google.android.gms.instantapps")).a();
        agvx.a(a2, "Backend__app_branding_fetcher_use_dark_launch_header", false);
        agvx.a(a2, "Backend__app_branding_timeout_ms", 30000);
        agvx.a(a2, "Backend__app_branding_url_format", "https://play.google.com/api/v1/metadata/type/apps/package/%s");
        a = agvx.a(a2, "Backend__attach_side_channel_headers_to_requests", false);
        b = agvx.a(a2, "Backend__disable_domain_filter_retry", false);
        c = agvx.a(a2, "Backend__disable_domain_filter_retry_charging_and_unmetered", true);
        d = agvx.a(a2, "Backend__force_opt_in_sync_after_millis", 2592000000L);
        e = agvx.a(a2, "Backend__populate_package_versions", true);
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

    public final long d() {
        return ((Long) d.c()).longValue();
    }

    public final boolean e() {
        return ((Boolean) e.c()).booleanValue();
    }
}
