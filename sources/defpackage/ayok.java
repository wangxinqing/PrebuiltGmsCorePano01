package defpackage;

/* renamed from: ayok  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ayok implements ayoj {
    public static final agvx a;
    public static final agvx b;
    public static final agvx c;
    public static final agvx d;
    public static final agvx e;

    static {
        agvw b2 = new agvw(agvj.a("com.google.android.gms.update")).b();
        a = agvx.a(b2, "overdue_dialog_escalation_phases", "");
        b = agvx.a(b2, "overdue_dialog_retry_delay_period_phases", "");
        c = agvx.a(b2, "device_update_detail_url", "");
        d = agvx.a(b2, "display_dialog_window_period", "");
        e = agvx.a(b2, "enable_aggressive_reminder_on_power_connected", false);
    }

    public final String a() {
        return (String) a.c();
    }

    public final String b() {
        return (String) b.c();
    }

    public final String c() {
        return (String) c.c();
    }

    public final String d() {
        return (String) d.c();
    }

    public final boolean e() {
        return ((Boolean) e.c()).booleanValue();
    }
}
