package defpackage;

/* renamed from: aydw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aydw implements aydv {
    public static final agvx collectNlpApiUsage;
    public static final agvx eliminateAlarmsForCacheUpdater;
    public static final agvx enableNewPieWifirttmanagerApi;
    public static final agvx enableNlpQcmBug78491466Workaround;
    public static final agvx enableQTelephonyApis;
    public static final agvx enableQTelephonyExceptions;
    public static final agvx enableRttForNlpLocations;
    public static final agvx enableTestLogSensorIds;
    public static final agvx enableTestingFeatures;
    public static final agvx enforceThreadAffinity;
    public static final agvx fiveGMode;
    public static final agvx flpNlpUsageAuditLogEnabled;
    public static final agvx forcePendingIntentOperationsToNlpHandler;
    public static final agvx generatePlatformKeyLocally;
    public static final agvx googleLocationServer;
    public static final agvx logSuccessMetrics;
    public static final agvx moveClientRegisterToNlpThread;
    public static final agvx nlpClientStatsLog;
    public static final agvx nlpClientStatsOmitAppend;
    public static final agvx nlpSilentFeedbackEnabled;
    public static final agvx nlpSilentFeedbackIntervalMillis;
    public static final agvx nlpSilentFeedbackUseConnectionlessClient;
    public static final agvx omitWifiLockInNougat;
    public static final agvx reportSystemWideSettings;
    public static final agvx requirePackageManagerTelephonyCapability;
    public static final agvx rttHistoryRangeTimeToLiveSeconds;
    public static final agvx rttLocationModes;
    public static final agvx supplyRttLocations;
    public static final agvx uploadNlpDailyStats;
    public static final agvx useNanoHubForGlsQueries;
    public static final agvx useWifiBatchingForLocation;
    public static final agvx useWifiRtt;
    public static final agvx verifyGlocStatus;

    static {
        agvw a = new agvw(agvj.a("com.google.android.location")).a("location:");
        collectNlpApiUsage = agvx.a(a, "stats_collect_nlp_api", 1.0E-7d);
        eliminateAlarmsForCacheUpdater = agvx.a(a, "nlp_cu_e", false);
        enableNewPieWifirttmanagerApi = agvx.a(a, "nlp_rtt_p", false);
        enableNlpQcmBug78491466Workaround = agvx.a(a, "Nlp__enable_nlp_qcm_bug_78491466_workaround", true);
        enableQTelephonyApis = agvx.a(a, "tp_q_api", true);
        enableQTelephonyExceptions = agvx.a(a, "tp_q_ex", false);
        enableRttForNlpLocations = agvx.a(a, "nlp_req_rtt", false);
        enableTestLogSensorIds = agvx.a(a, "Nlp__enable_test_log_sensor_ids", false);
        enableTestingFeatures = agvx.a(a, "enable_testing_features", false);
        enforceThreadAffinity = agvx.a(a, "Nlp__enforce_thread_affinity", true);
        fiveGMode = agvx.a(a, "q_nr", true);
        flpNlpUsageAuditLogEnabled = agvx.a(a, "flp_nlp_usage_audit_log_enabled", false);
        forcePendingIntentOperationsToNlpHandler = agvx.a(a, "nlp_pi_rx", false);
        generatePlatformKeyLocally = agvx.a(a, "nlp_pk", false);
        googleLocationServer = agvx.a(a, "google_location_server", "");
        logSuccessMetrics = agvx.a(a, "Nlp__log_success_metrics", false);
        moveClientRegisterToNlpThread = agvx.a(a, "st_c_t", true);
        nlpClientStatsLog = agvx.a(a, "nlp_stats_log", false);
        nlpClientStatsOmitAppend = agvx.a(a, "nlp_stats_omit_append", false);
        nlpSilentFeedbackEnabled = agvx.a(a, "nlp_sf_enabled", true);
        nlpSilentFeedbackIntervalMillis = agvx.a(a, "nlp_sf_intrvl", 60000);
        nlpSilentFeedbackUseConnectionlessClient = agvx.a(a, "nlp_cl_f", true);
        omitWifiLockInNougat = agvx.a(a, "wf_wl_n", false);
        reportSystemWideSettings = agvx.a(a, "stats_collect_nlp_enabled", 0.01d);
        requirePackageManagerTelephonyCapability = agvx.a(a, "tp_rq_pm", false);
        rttHistoryRangeTimeToLiveSeconds = agvx.a(a, "Nlp__rtt_history_range_time_to_live_seconds", 4.5d);
        rttLocationModes = agvx.a(a, "nlp_rtt_m", 4294967295L);
        supplyRttLocations = agvx.a(a, "rttl", "");
        uploadNlpDailyStats = agvx.a(a, "upload_nlp_daily_stats", false);
        useNanoHubForGlsQueries = agvx.a(a, "nano_gls_server", true);
        useWifiBatchingForLocation = agvx.a(a, "use_wifi_batching", 20);
        useWifiRtt = agvx.a(a, "use_wifi_rtt", true);
        verifyGlocStatus = agvx.a(a, "clb_v_null", false);
    }

    public double collectNlpApiUsage() {
        return ((Double) collectNlpApiUsage.c()).doubleValue();
    }

    public boolean compiled() {
        return true;
    }

    public boolean eliminateAlarmsForCacheUpdater() {
        return ((Boolean) eliminateAlarmsForCacheUpdater.c()).booleanValue();
    }

    public boolean enableNewPieWifirttmanagerApi() {
        return ((Boolean) enableNewPieWifirttmanagerApi.c()).booleanValue();
    }

    public boolean enableNlpQcmBug78491466Workaround() {
        return ((Boolean) enableNlpQcmBug78491466Workaround.c()).booleanValue();
    }

    public boolean enableQTelephonyApis() {
        return ((Boolean) enableQTelephonyApis.c()).booleanValue();
    }

    public boolean enableQTelephonyExceptions() {
        return ((Boolean) enableQTelephonyExceptions.c()).booleanValue();
    }

    public boolean enableRttForNlpLocations() {
        return ((Boolean) enableRttForNlpLocations.c()).booleanValue();
    }

    public boolean enableTestLogSensorIds() {
        return ((Boolean) enableTestLogSensorIds.c()).booleanValue();
    }

    public boolean enableTestingFeatures() {
        return ((Boolean) enableTestingFeatures.c()).booleanValue();
    }

    public boolean enforceThreadAffinity() {
        return ((Boolean) enforceThreadAffinity.c()).booleanValue();
    }

    public boolean fiveGMode() {
        return ((Boolean) fiveGMode.c()).booleanValue();
    }

    public boolean flpNlpUsageAuditLogEnabled() {
        return ((Boolean) flpNlpUsageAuditLogEnabled.c()).booleanValue();
    }

    public boolean forcePendingIntentOperationsToNlpHandler() {
        return ((Boolean) forcePendingIntentOperationsToNlpHandler.c()).booleanValue();
    }

    public boolean generatePlatformKeyLocally() {
        return ((Boolean) generatePlatformKeyLocally.c()).booleanValue();
    }

    public String googleLocationServer() {
        return (String) googleLocationServer.c();
    }

    public boolean logSuccessMetrics() {
        return ((Boolean) logSuccessMetrics.c()).booleanValue();
    }

    public boolean moveClientRegisterToNlpThread() {
        return ((Boolean) moveClientRegisterToNlpThread.c()).booleanValue();
    }

    public boolean nlpClientStatsLog() {
        return ((Boolean) nlpClientStatsLog.c()).booleanValue();
    }

    public boolean nlpClientStatsOmitAppend() {
        return ((Boolean) nlpClientStatsOmitAppend.c()).booleanValue();
    }

    public boolean nlpSilentFeedbackEnabled() {
        return ((Boolean) nlpSilentFeedbackEnabled.c()).booleanValue();
    }

    public long nlpSilentFeedbackIntervalMillis() {
        return ((Long) nlpSilentFeedbackIntervalMillis.c()).longValue();
    }

    public boolean nlpSilentFeedbackUseConnectionlessClient() {
        return ((Boolean) nlpSilentFeedbackUseConnectionlessClient.c()).booleanValue();
    }

    public boolean omitWifiLockInNougat() {
        return ((Boolean) omitWifiLockInNougat.c()).booleanValue();
    }

    public double reportSystemWideSettings() {
        return ((Double) reportSystemWideSettings.c()).doubleValue();
    }

    public boolean requirePackageManagerTelephonyCapability() {
        return ((Boolean) requirePackageManagerTelephonyCapability.c()).booleanValue();
    }

    public double rttHistoryRangeTimeToLiveSeconds() {
        return ((Double) rttHistoryRangeTimeToLiveSeconds.c()).doubleValue();
    }

    public long rttLocationModes() {
        return ((Long) rttLocationModes.c()).longValue();
    }

    public String supplyRttLocations() {
        return (String) supplyRttLocations.c();
    }

    public boolean uploadNlpDailyStats() {
        return ((Boolean) uploadNlpDailyStats.c()).booleanValue();
    }

    public boolean useNanoHubForGlsQueries() {
        return ((Boolean) useNanoHubForGlsQueries.c()).booleanValue();
    }

    public long useWifiBatchingForLocation() {
        return ((Long) useWifiBatchingForLocation.c()).longValue();
    }

    public boolean useWifiRtt() {
        return ((Boolean) useWifiRtt.c()).booleanValue();
    }

    public boolean verifyGlocStatus() {
        return ((Boolean) verifyGlocStatus.c()).booleanValue();
    }
}
