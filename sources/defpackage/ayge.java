package defpackage;

/* renamed from: ayge  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ayge implements aygd {
    public static final agvx a;
    public static final agvx b;

    static {
        agvw a2 = new agvw("com.google.android.gms.lockbox").a("gms:lockbox:service");
        a = agvx.a(a2, "enable_task_info", true);
        b = agvx.a(a2, "logging_interval_millis", 60000);
    }

    public final boolean a() {
        return ((Boolean) a.c()).booleanValue();
    }

    public final long b() {
        return ((Long) b.c()).longValue();
    }
}
