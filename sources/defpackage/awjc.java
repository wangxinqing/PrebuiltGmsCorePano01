package defpackage;

/* renamed from: awjc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class awjc implements awjb {
    public static final agvx a;
    public static final agvx b;
    public static final agvx c;
    public static final agvx d;
    public static final agvx e;

    static {
        agvw agvw = new agvw(agvj.a("com.google.android.gms.auth_account"));
        agvx.a(agvw, "BugFixFeatures__fix_frp_alert_dialog", true);
        a = agvx.a(agvw, "BugFixFeatures__prevent_get_result_on_failed_tasks", true);
        b = agvx.a(agvw, "BugFixFeatures__send_dmstatus_to_dpc", true);
        c = agvx.a(agvw, "BugFixFeatures__set_update_current_task_only_if_different_for_device_cert", false);
        d = agvx.a(agvw, "BugFixFeatures__uncertified_devices_remove_permissions", true);
        e = agvx.a(agvw, "BugFixFeatures__use_work_account_client_is_whitelisted", true);
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

    public final boolean d() {
        return ((Boolean) d.c()).booleanValue();
    }

    public final boolean e() {
        return ((Boolean) e.c()).booleanValue();
    }
}
