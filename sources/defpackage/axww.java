package defpackage;

/* renamed from: axww  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class axww implements axwv {
    public static final agvx activityRecognitionRuntimeOp;
    public static final agvx activityRecognitionRuntimePermission;
    public static final agvx activityRecognitionRuntimePermissionWhitelist;
    public static final agvx addClientListenerByDefaultV27;
    public static final agvx checkPermissionBeforeNoteopV27;
    public static final agvx enableActivityRecognitionRuntimePermission;
    public static final agvx enableNoteopForActivityReport;

    static {
        agvw a = new agvw(agvj.a("com.google.android.location")).a("location:");
        activityRecognitionRuntimeOp = agvx.a(a, "activity_recognition_runtime_op", "android:activity_recognition");
        activityRecognitionRuntimePermission = agvx.a(a, "activity_recognition_runtime_permission", "android.permission.ACTIVITY_RECOGNITION");
        activityRecognitionRuntimePermissionWhitelist = agvx.a(a, "activity_recognition_runtime_permission_whitelist", "");
        addClientListenerByDefaultV27 = agvx.a(a, "add_client_listener_by_default_v27", true);
        checkPermissionBeforeNoteopV27 = agvx.a(a, "check_permission_before_noteop_v27", true);
        enableActivityRecognitionRuntimePermission = agvx.a(a, "enable_activity_recognition_runtime_permission", true);
        enableNoteopForActivityReport = agvx.a(a, "enable_noteop_for_activity_report", true);
    }

    public String activityRecognitionRuntimeOp() {
        return (String) activityRecognitionRuntimeOp.c();
    }

    public String activityRecognitionRuntimePermission() {
        return (String) activityRecognitionRuntimePermission.c();
    }

    public String activityRecognitionRuntimePermissionWhitelist() {
        return (String) activityRecognitionRuntimePermissionWhitelist.c();
    }

    public boolean addClientListenerByDefaultV27() {
        return ((Boolean) addClientListenerByDefaultV27.c()).booleanValue();
    }

    public boolean checkPermissionBeforeNoteopV27() {
        return ((Boolean) checkPermissionBeforeNoteopV27.c()).booleanValue();
    }

    public boolean compiled() {
        return true;
    }

    public boolean enableActivityRecognitionRuntimePermission() {
        return ((Boolean) enableActivityRecognitionRuntimePermission.c()).booleanValue();
    }

    public boolean enableNoteopForActivityReport() {
        return ((Boolean) enableNoteopForActivityReport.c()).booleanValue();
    }
}
