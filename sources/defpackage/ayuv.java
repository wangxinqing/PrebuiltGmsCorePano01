package defpackage;

/* renamed from: ayuv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ayuv implements ayuu {
    public static final agvx a;

    static {
        agvw agvw = new agvw(agvj.a("com.google.android.gms.people"));
        agvx.a(agvw, "MenagerieContactsSyncApiFeature__is_sync_to_contacts_enabled_api_disabled", 2);
        agvx.a(agvw, "MenagerieContactsSyncApiFeature__is_sync_to_contacts_enabled_api_logging_enabled", true);
        a = agvx.a(agvw, "MenagerieContactsSyncApiFeature__is_sync_to_contacts_enabled_sample_rate", 1.0d);
        agvx.a(agvw, "MenagerieContactsSyncApiFeature__on_sync_to_contacts_enabled_operation_disabled", 1);
        agvx.a(agvw, "MenagerieContactsSyncApiFeature__set_sync_to_contacts_settings_operation_disabled", 2);
        agvx.a(agvw, "MenagerieContactsSyncApiFeature__sync_raw_contact_operation_disabled", 2);
    }

    public final double a() {
        return ((Double) a.c()).doubleValue();
    }
}
