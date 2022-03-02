package defpackage;

/* renamed from: axzx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class axzx implements axzw {
    public static final agvx enableDndExitOnfoot;
    public static final agvx enableDndNotificationBluetoothOnly;

    static {
        agvw a = new agvw(agvj.a("com.google.android.location")).a("location:");
        enableDndExitOnfoot = agvx.a(a, "enable_dnd_exit_onfoot", true);
        enableDndNotificationBluetoothOnly = agvx.a(a, "enable_dnd_notification_bluetooth_only", false);
    }

    public boolean compiled() {
        return true;
    }

    public boolean enableDndExitOnfoot() {
        return ((Boolean) enableDndExitOnfoot.c()).booleanValue();
    }

    public boolean enableDndNotificationBluetoothOnly() {
        return ((Boolean) enableDndNotificationBluetoothOnly.c()).booleanValue();
    }
}
