package defpackage;

/* renamed from: aytt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aytt implements ayts {
    public static final agvx a;
    public static final agvx b;
    public static final agvx c;

    static {
        agvw agvw = new agvw(agvj.a("com.google.android.gms.people"));
        a = agvx.a(agvw, "FsaGuardianFeature__group_syncer_guardian_enabled", false);
        b = agvx.a(agvw, "FsaGuardianFeature__max_group_title_length", 1024);
        c = agvx.a(agvw, "FsaGuardianFeature__retry_throttling_for_groups_enabled", false);
    }

    public final boolean a() {
        return ((Boolean) a.c()).booleanValue();
    }

    public final long b() {
        return ((Long) b.c()).longValue();
    }

    public final boolean c() {
        return ((Boolean) c.c()).booleanValue();
    }
}
