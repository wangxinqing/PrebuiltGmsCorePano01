package defpackage;

/* renamed from: ayrp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ayrp implements ayro {
    public static final agvx a;
    public static final agvx b;
    public static final agvx c;
    public static final agvx d;
    public static final agvx e;
    public static final agvx f;
    public static final agvx g;
    public static final agvx h;

    static {
        agvw agvw = new agvw(agvj.a("com.google.android.gms.people"));
        a = agvx.a(agvw, "FsaBackupAndSyncOptInValidator__periodic_interval_seconds", 86400);
        b = agvx.a(agvw, "FsaBackupAndSyncOptInValidator__periodic_task_flex_seconds", 600);
        c = agvx.a(agvw, "FsaBackupAndSyncOptInValidator__periodic_task_is_enabled", true);
        d = agvx.a(agvw, "FsaBackupAndSyncOptInValidator__periodic_task_persisted", true);
        e = agvx.a(agvw, "FsaBackupAndSyncOptInValidator__periodic_task_requires_charging", true);
        f = agvx.a(agvw, "FsaBackupAndSyncOptInValidator__periodic_task_requires_device_idle", false);
        g = agvx.a(agvw, "FsaBackupAndSyncOptInValidator__periodic_task_use_flex", false);
        h = agvx.a(agvw, "FsaBackupAndSyncOptInValidator__service_enabled", true);
    }

    public final long a() {
        return ((Long) a.c()).longValue();
    }

    public final long b() {
        return ((Long) b.c()).longValue();
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

    public final boolean f() {
        return ((Boolean) f.c()).booleanValue();
    }

    public final boolean g() {
        return ((Boolean) g.c()).booleanValue();
    }

    public final boolean h() {
        return ((Boolean) h.c()).booleanValue();
    }
}
