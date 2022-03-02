package defpackage;

/* renamed from: awoj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class awoj implements awoi {
    public static final agvx a;
    public static final agvx b;

    static {
        agvw agvw = new agvw(agvj.a("com.google.android.gms.auth.api.credentials"));
        a = agvx.a(agvw, "SaveConfirmationDialogStrategy__use_proactive_disabling_from_autofill", true);
        b = agvx.a(agvw, "SaveConfirmationDialogStrategy__yolo_save_confirmation_dialog_disable_timeout_millis", 3600000);
    }

    public final boolean a() {
        return ((Boolean) a.c()).booleanValue();
    }

    public final long b() {
        return ((Long) b.c()).longValue();
    }
}
