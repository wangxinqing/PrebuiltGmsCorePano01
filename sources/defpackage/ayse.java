package defpackage;

/* renamed from: ayse  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ayse implements aysd {
    public static final agvx a;
    public static final agvx b;
    public static final agvx c;

    static {
        agvw agvw = new agvw(agvj.a("com.google.android.gms.people"));
        a = agvx.a(agvw, "FsaBugFixesY2019w28__enable_googlified_contacts_count_log_fix_enabled", false);
        b = agvx.a(agvw, "FsaBugFixesY2019w28__full_sync_when_star_group_not_synced_enabled", true);
        c = agvx.a(agvw, "FsaBugFixesY2019w28__set_group_notes_with_title_enabled", false);
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
}
