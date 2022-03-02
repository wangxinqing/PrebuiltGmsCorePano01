package defpackage;

/* renamed from: azdy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class azdy implements azdx {
    public static final agvx a;
    public static final agvx b;

    static {
        agvw agvw = new agvw(agvj.a("com.google.android.gms.romanesco"));
        a = agvx.a(agvw, "ContactsLoggerBugFixesY2019w45__log_backup_sync_opt_in_state_enabled", true);
        b = agvx.a(agvw, "ContactsLoggerBugFixesY2019w45__log_sync_info_enabled", true);
    }

    public final boolean a() {
        return ((Boolean) a.c()).booleanValue();
    }

    public final boolean b() {
        return ((Boolean) b.c()).booleanValue();
    }
}
