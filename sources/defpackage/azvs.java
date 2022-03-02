package defpackage;

/* renamed from: azvs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class azvs implements azvr {
    public static final agvx a;
    public static final agvx b;

    static {
        agvw a2 = new agvw("com.google.android.westworld").a("gms:westworld:");
        a = agvx.a(a2, "incident_enabled", false);
        b = agvx.a(a2, "incident_log_source", "INCIDENT_REPORT");
    }

    public final boolean a() {
        return ((Boolean) a.c()).booleanValue();
    }

    public final String b() {
        return (String) b.c();
    }
}
