package defpackage;

/* renamed from: azpf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class azpf implements azpe {
    public static final agvx a;

    static {
        agvw a2 = new agvw("com.google.android.metrics").a("gms:stats:");
        agvx.a(a2, "clearcut_dropbox_background_allowed_data_app_anr", false);
        agvx.a(a2, "clearcut_dropbox_background_allowed_data_app_crash", false);
        agvx.a(a2, "clearcut_dropbox_background_allowed_data_app_native_crash", false);
        agvx.a(a2, "clearcut_dropbox_background_allowed_system_app_anr", false);
        agvx.a(a2, "clearcut_dropbox_background_allowed_system_app_crash", false);
        agvx.a(a2, "clearcut_dropbox_background_allowed_system_app_native_crash", false);
        agvx.a(a2, "clearcut_dropbox_background_allowed_SYSTEM_CRASH_REPORT", false);
        agvx.a(a2, "clearcut_dropbox_background_allowed_SYSTEM_LAST_KMSG", false);
        agvx.a(a2, "clearcut_dropbox_background_allowed_system_server_anr", false);
        agvx.a(a2, "clearcut_dropbox_background_allowed_system_server_crash", false);
        agvx.a(a2, "clearcut_dropbox_background_allowed_system_server_native_crash", false);
        agvx.a(a2, "clearcut_dropbox_background_allowed_system_server_watchdog", false);
        agvx.a(a2, "clearcut_dropbox_background_allowed_SYTEM_TOMBSTONE", false);
        a = agvx.a(a2, "fix_get_qos_tier", false);
    }

    public final boolean a() {
        return ((Boolean) a.c()).booleanValue();
    }
}
