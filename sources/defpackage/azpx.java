package defpackage;

/* renamed from: azpx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class azpx implements azpw {
    public static final agvx a;
    public static final agvx b;
    public static final agvx c;
    public static final agvx d;
    public static final agvx e;
    public static final agvx f;
    public static final agvx g;
    public static final agvx h;
    public static final agvx i;
    public static final agvx j;

    static {
        agvw agvw = new agvw(agvj.a("com.google.android.gms.subscribedfeeds"));
        agvx.a(agvw, "blocked_target_sdk_version", 0);
        a = agvx.a(agvw, "blocked_target_sdk_version_delete", 0);
        b = agvx.a(agvw, "blocked_target_sdk_version_insert_update", 0);
        c = agvx.a(agvw, "SubscribedFeedsFeatures__content_resolver_timeout_millis", 30000);
        d = agvx.a(agvw, "enable_content_provider_streamz", false);
        e = agvx.a(agvw, "SubscribedFeedsFeatures__enable_logging_content_resolver_timeouts", false);
        f = agvx.a(agvw, "subscribedfeeds_gms_oauth2_enabled", 0);
        g = agvx.a(agvw, "subscribedfeeds_log_to_event_log", true);
        h = agvx.a(agvw, "subscribedfeeds_noop_gms_sync_adapter", true);
        i = agvx.a(agvw, "subscribedfeeds_proxy_to_gsf_provider", true);
        j = agvx.a(agvw, "SubscribedFeedsFeatures__streamz_auto_log_delay_millis", 30000);
        agvx.a(agvw, "wearable_enable_subscribed_feeds", true);
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

    public final boolean d() {
        return ((Boolean) d.c()).booleanValue();
    }

    public final boolean e() {
        return ((Boolean) e.c()).booleanValue();
    }

    public final long f() {
        return ((Long) f.c()).longValue();
    }

    public final boolean g() {
        return ((Boolean) g.c()).booleanValue();
    }

    public final boolean h() {
        return ((Boolean) h.c()).booleanValue();
    }

    public final boolean i() {
        return ((Boolean) i.c()).booleanValue();
    }

    public final long j() {
        return ((Long) j.c()).longValue();
    }
}
