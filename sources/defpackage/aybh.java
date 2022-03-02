package defpackage;

/* renamed from: aybh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aybh implements aybg {
    public static final agvx geocoderCacheCellLevel;
    public static final agvx geocoderCacheMaxEntries;
    public static final agvx geocoderCacheMaxTtlSecs;
    public static final agvx geocoderCacheMinManagementTtlSecs;
    public static final agvx geocoderLogCacheStats;
    public static final agvx geocoderLogCacheStatsIntervalSecs;
    public static final agvx geocoderLogErrorStats;
    public static final agvx geocoderLogErrorStatsIntervalSecs;
    public static final agvx geocoderRpcTimeout;
    public static final agvx geocoderServerName;
    public static final agvx geocoderTraceRequests;

    static {
        agvw a = new agvw(agvj.a("com.google.android.location")).a("location:");
        geocoderCacheCellLevel = agvx.a(a, "geocoder_cache_cell_level", 21);
        geocoderCacheMaxEntries = agvx.a(a, "geocoder_cache_max_entries", 100);
        geocoderCacheMaxTtlSecs = agvx.a(a, "geocoder_cache_max_ttl_secs", 259200);
        geocoderCacheMinManagementTtlSecs = agvx.a(a, "geocoder_cache_min_mgmt_secs", 43200);
        geocoderLogCacheStats = agvx.a(a, "geocoder_log_cache_stats", true);
        geocoderLogCacheStatsIntervalSecs = agvx.a(a, "geocoder_log_cache_stats_secs", 86400);
        geocoderLogErrorStats = agvx.a(a, "geocoder_log_error_stats", true);
        geocoderLogErrorStatsIntervalSecs = agvx.a(a, "geocoder_log_error_stats_secs", 86400);
        geocoderRpcTimeout = agvx.a(a, "geocoder_rpc_timeout_ms", 5000);
        geocoderServerName = agvx.a(a, "geocoder_server_name", "geomobileservices-pa.googleapis.com");
        geocoderTraceRequests = agvx.a(a, "geofencer_trace_requests", false);
    }

    public boolean compiled() {
        return true;
    }

    public long geocoderCacheCellLevel() {
        return ((Long) geocoderCacheCellLevel.c()).longValue();
    }

    public long geocoderCacheMaxEntries() {
        return ((Long) geocoderCacheMaxEntries.c()).longValue();
    }

    public long geocoderCacheMaxTtlSecs() {
        return ((Long) geocoderCacheMaxTtlSecs.c()).longValue();
    }

    public long geocoderCacheMinManagementTtlSecs() {
        return ((Long) geocoderCacheMinManagementTtlSecs.c()).longValue();
    }

    public boolean geocoderLogCacheStats() {
        return ((Boolean) geocoderLogCacheStats.c()).booleanValue();
    }

    public long geocoderLogCacheStatsIntervalSecs() {
        return ((Long) geocoderLogCacheStatsIntervalSecs.c()).longValue();
    }

    public boolean geocoderLogErrorStats() {
        return ((Boolean) geocoderLogErrorStats.c()).booleanValue();
    }

    public long geocoderLogErrorStatsIntervalSecs() {
        return ((Long) geocoderLogErrorStatsIntervalSecs.c()).longValue();
    }

    public long geocoderRpcTimeout() {
        return ((Long) geocoderRpcTimeout.c()).longValue();
    }

    public String geocoderServerName() {
        return (String) geocoderServerName.c();
    }

    public boolean geocoderTraceRequests() {
        return ((Boolean) geocoderTraceRequests.c()).booleanValue();
    }
}
