package defpackage;

/* renamed from: ayri  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ayri implements ayrh {
    public static final agvx a;
    public static final agvx b;
    public static final agvx c;
    public static final agvx d;

    static {
        agvw agvw = new agvw(agvj.a("com.google.android.gms.people"));
        agvx.a(agvw, "DataLayer__debug_icing_results_per_page", 1000);
        agvx.a(agvw, "DataLayer__debug_upload_corpus", "internal.3p:Contact_no_gsa");
        a = agvx.a(agvw, "DataLayer__limit_debug_upload_size", true);
        b = agvx.a(agvw, "DataLayer__new_style_avatar_reference_enabled", false);
        c = agvx.a(agvw, "DataLayer__populate_last_updated_timestamp_for_raw_contacts", false);
        agvx.a(agvw, "DataLayer__rethrow_sqlite_exception_when_getting_writable_people_database", false);
        d = agvx.a(agvw, "DataLayer__show_debug_upload_in_settings", false);
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

    public final boolean d() {
        return ((Boolean) d.c()).booleanValue();
    }
}
