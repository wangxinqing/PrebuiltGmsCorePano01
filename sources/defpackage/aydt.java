package defpackage;

/* renamed from: aydt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aydt implements ayds {
    public static final agvx bugFixUseLifecycleCallbacksInFloorChange;
    public static final agvx chreArLifecycleEnabled;
    public static final agvx enableAdditionalVerboseNanoappLogging;
    public static final agvx enableContexthubApiWrapper;
    public static final agvx nanoAppClearcutEnabled;
    public static final agvx nanoAppGroupList;
    public static final agvx nanoAppMddTimeoutMs;
    public static final agvx nanoAppNewVersionCheckPeriodSec;
    public static final agvx nanoAppNewVersionIdleCheckPeriodSec;
    public static final agvx nanoAppUploadEnabled;

    static {
        agvw a = new agvw(agvj.a("com.google.android.location")).a("location:");
        bugFixUseLifecycleCallbacksInFloorChange = agvx.a(a, "bug_fix_use_lifecycle_callbacks_in_floor_change", true);
        chreArLifecycleEnabled = agvx.a(a, "chre_ar_lifecycle_enabled", true);
        enableAdditionalVerboseNanoappLogging = agvx.a(a, "enable_additional_verbose_nanoapp_logging", false);
        enableContexthubApiWrapper = agvx.a(a, "enable_contexthub_api_wrapper", false);
        nanoAppClearcutEnabled = agvx.a(a, "nano_app_clearcut_enabled", false);
        nanoAppGroupList = agvx.a(a, "nano_app_group_list", "chre.nanoapps.loc,chre.nanoapps.gf,chre.nanoapps.ar,chre.nanoapps.extra,chre.nanoapps.test");
        nanoAppMddTimeoutMs = agvx.a(a, "nano_app_mdd_timeout_ms", 60000);
        nanoAppNewVersionCheckPeriodSec = agvx.a(a, "nano_app_new_version_check_period_sec", 14400);
        nanoAppNewVersionIdleCheckPeriodSec = agvx.a(a, "nano_app_new_version_idle_check_period_sec", 43200);
        nanoAppUploadEnabled = agvx.a(a, "nano_app_upload_enabled", false);
    }

    public boolean bugFixUseLifecycleCallbacksInFloorChange() {
        return ((Boolean) bugFixUseLifecycleCallbacksInFloorChange.c()).booleanValue();
    }

    public boolean chreArLifecycleEnabled() {
        return ((Boolean) chreArLifecycleEnabled.c()).booleanValue();
    }

    public boolean compiled() {
        return true;
    }

    public boolean enableAdditionalVerboseNanoappLogging() {
        return ((Boolean) enableAdditionalVerboseNanoappLogging.c()).booleanValue();
    }

    public boolean enableContexthubApiWrapper() {
        return ((Boolean) enableContexthubApiWrapper.c()).booleanValue();
    }

    public boolean nanoAppClearcutEnabled() {
        return ((Boolean) nanoAppClearcutEnabled.c()).booleanValue();
    }

    public String nanoAppGroupList() {
        return (String) nanoAppGroupList.c();
    }

    public long nanoAppMddTimeoutMs() {
        return ((Long) nanoAppMddTimeoutMs.c()).longValue();
    }

    public long nanoAppNewVersionCheckPeriodSec() {
        return ((Long) nanoAppNewVersionCheckPeriodSec.c()).longValue();
    }

    public long nanoAppNewVersionIdleCheckPeriodSec() {
        return ((Long) nanoAppNewVersionIdleCheckPeriodSec.c()).longValue();
    }

    public boolean nanoAppUploadEnabled() {
        return ((Boolean) nanoAppUploadEnabled.c()).booleanValue();
    }
}
