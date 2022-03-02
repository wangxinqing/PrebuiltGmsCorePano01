package defpackage;

/* renamed from: azeb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class azeb implements azea {
    public static final agvx a;
    public static final agvx b;
    public static final agvx c;

    static {
        agvw agvw = new agvw(agvj.a("com.google.android.gms.romanesco"));
        a = agvx.a(agvw, "ContactsLoggerBugFixesY2019w49__log_data_set_enabled", true);
        b = agvx.a(agvw, "ContactsLoggerBugFixesY2019w49__log_raw_contact_dirty_field_enabled", true);
        c = agvx.a(agvw, "ContactsLoggerBugFixesY2019w49__log_sync_info_for_google_account", true);
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
