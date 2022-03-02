package defpackage;

/* renamed from: ayen  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ayen implements ayem {
    public static final agvx quakeApiAccelHeadMs;
    public static final agvx quakeApiAccelQuantizedLsbMs2;
    public static final agvx quakeApiAccelTailMs;
    public static final agvx quakeApiAccelTriggeringMs;
    public static final agvx quakeApiAlarmManagerEnable;
    public static final agvx quakeApiAlarmOnlineMs;
    public static final agvx quakeApiBackoffEnable;
    public static final agvx quakeApiBackoffMaxMs;
    public static final agvx quakeApiClientIdExpireMs;
    public static final agvx quakeApiDroidguardHandleTimeoutMs;
    public static final agvx quakeApiDroidguardOfflineEnable;
    public static final agvx quakeApiDroidguardOnlineEnable;
    public static final agvx quakeApiDroidguardTriggeringEnable;
    public static final agvx quakeApiEnable;
    public static final agvx quakeApiScope;
    public static final agvx quakeApiServerDeadlineMs;
    public static final agvx quakeApiServerHost;
    public static final agvx quakeApiSessionAccelMaxS;
    public static final agvx quakeApiSessionCooldownS;
    public static final agvx quakeApiSessionThrottlerConfig;
    public static final agvx quakeApiUsePersistentThrottler;
    public static final agvx quakeApiV2Enable;
    public static final agvx quakeTimeExpireAgeMs;
    public static final agvx seismicSendQuakeApiNodeOffline;
    public static final agvx seismicSendQuakeApiNodeOnline;
    public static final agvx seismicSendQuakeApiNodeTriggering;

    static {
        agvw a = new agvw(agvj.a("com.google.android.location")).a("location:");
        quakeApiAccelHeadMs = agvx.a(a, "quake_api_accel_head_ms", 15000);
        quakeApiAccelQuantizedLsbMs2 = agvx.a(a, "quake_api_accel_quantized_lsb_ms2", 0.0015d);
        quakeApiAccelTailMs = agvx.a(a, "quake_api_accel_tail_ms", 15000);
        quakeApiAccelTriggeringMs = agvx.a(a, "quake_api_accel_triggering_ms", 5000);
        quakeApiAlarmManagerEnable = agvx.a(a, "quake_api_alarm_manager_enable", false);
        quakeApiAlarmOnlineMs = agvx.a(a, "quake_api_alarm_online_ms", 3600000);
        quakeApiBackoffEnable = agvx.a(a, "quake_api_backoff_enable", false);
        quakeApiBackoffMaxMs = agvx.a(a, "quake_api_backoff_max_ms", 604800000);
        quakeApiClientIdExpireMs = agvx.a(a, "quake_api_client_id_expire_ms", 259200000);
        quakeApiDroidguardHandleTimeoutMs = agvx.a(a, "quake_api_droidguard_handle_timeout_ms", 60000);
        quakeApiDroidguardOfflineEnable = agvx.a(a, "quake_api_droidguard_offline_enable", false);
        quakeApiDroidguardOnlineEnable = agvx.a(a, "quake_api_droidguard_online_enable", false);
        quakeApiDroidguardTriggeringEnable = agvx.a(a, "quake_api_droidguard_triggering_enable", false);
        quakeApiEnable = agvx.a(a, "quake_api_enable", false);
        quakeApiScope = agvx.a(a, "quake_api_scope", "https://www.googleapis.com/auth/lc.anonymous");
        quakeApiServerDeadlineMs = agvx.a(a, "quake_api_server_deadline_ms", 10000);
        quakeApiServerHost = agvx.a(a, "quake_api_server_host", "quake-pa.googleapis.com");
        quakeApiSessionAccelMaxS = agvx.a(a, "quake_api_trigger_session_max_s", 120);
        quakeApiSessionCooldownS = agvx.a(a, "quake_api_session_cooldown_s", 120);
        quakeApiSessionThrottlerConfig = agvx.a(a, "quake_api_session_throttler_config", "120:2,900:4,3600:10,86400:50");
        quakeApiUsePersistentThrottler = agvx.a(a, "quake_api_use_persistent_throttler", false);
        quakeApiV2Enable = agvx.a(a, "quake_api_v2_enable", false);
        quakeTimeExpireAgeMs = agvx.a(a, "quake_time_expire_age_ms", 43200000);
        seismicSendQuakeApiNodeOffline = agvx.a(a, "seismic_send_quake_api_node_offline", false);
        seismicSendQuakeApiNodeOnline = agvx.a(a, "seismic_send_quake_api_node_online", false);
        seismicSendQuakeApiNodeTriggering = agvx.a(a, "seismic_send_quake_api_node_triggering", false);
    }

    public boolean compiled() {
        return true;
    }

    public long quakeApiAccelHeadMs() {
        return ((Long) quakeApiAccelHeadMs.c()).longValue();
    }

    public double quakeApiAccelQuantizedLsbMs2() {
        return ((Double) quakeApiAccelQuantizedLsbMs2.c()).doubleValue();
    }

    public long quakeApiAccelTailMs() {
        return ((Long) quakeApiAccelTailMs.c()).longValue();
    }

    public long quakeApiAccelTriggeringMs() {
        return ((Long) quakeApiAccelTriggeringMs.c()).longValue();
    }

    public boolean quakeApiAlarmManagerEnable() {
        return ((Boolean) quakeApiAlarmManagerEnable.c()).booleanValue();
    }

    public long quakeApiAlarmOnlineMs() {
        return ((Long) quakeApiAlarmOnlineMs.c()).longValue();
    }

    public boolean quakeApiBackoffEnable() {
        return ((Boolean) quakeApiBackoffEnable.c()).booleanValue();
    }

    public long quakeApiBackoffMaxMs() {
        return ((Long) quakeApiBackoffMaxMs.c()).longValue();
    }

    public long quakeApiClientIdExpireMs() {
        return ((Long) quakeApiClientIdExpireMs.c()).longValue();
    }

    public long quakeApiDroidguardHandleTimeoutMs() {
        return ((Long) quakeApiDroidguardHandleTimeoutMs.c()).longValue();
    }

    public boolean quakeApiDroidguardOfflineEnable() {
        return ((Boolean) quakeApiDroidguardOfflineEnable.c()).booleanValue();
    }

    public boolean quakeApiDroidguardOnlineEnable() {
        return ((Boolean) quakeApiDroidguardOnlineEnable.c()).booleanValue();
    }

    public boolean quakeApiDroidguardTriggeringEnable() {
        return ((Boolean) quakeApiDroidguardTriggeringEnable.c()).booleanValue();
    }

    public boolean quakeApiEnable() {
        return ((Boolean) quakeApiEnable.c()).booleanValue();
    }

    public String quakeApiScope() {
        return (String) quakeApiScope.c();
    }

    public long quakeApiServerDeadlineMs() {
        return ((Long) quakeApiServerDeadlineMs.c()).longValue();
    }

    public String quakeApiServerHost() {
        return (String) quakeApiServerHost.c();
    }

    public long quakeApiSessionAccelMaxS() {
        return ((Long) quakeApiSessionAccelMaxS.c()).longValue();
    }

    public long quakeApiSessionCooldownS() {
        return ((Long) quakeApiSessionCooldownS.c()).longValue();
    }

    public String quakeApiSessionThrottlerConfig() {
        return (String) quakeApiSessionThrottlerConfig.c();
    }

    public boolean quakeApiUsePersistentThrottler() {
        return ((Boolean) quakeApiUsePersistentThrottler.c()).booleanValue();
    }

    public boolean quakeApiV2Enable() {
        return ((Boolean) quakeApiV2Enable.c()).booleanValue();
    }

    public long quakeTimeExpireAgeMs() {
        return ((Long) quakeTimeExpireAgeMs.c()).longValue();
    }

    public boolean seismicSendQuakeApiNodeOffline() {
        return ((Boolean) seismicSendQuakeApiNodeOffline.c()).booleanValue();
    }

    public boolean seismicSendQuakeApiNodeOnline() {
        return ((Boolean) seismicSendQuakeApiNodeOnline.c()).booleanValue();
    }

    public boolean seismicSendQuakeApiNodeTriggering() {
        return ((Boolean) seismicSendQuakeApiNodeTriggering.c()).booleanValue();
    }
}
