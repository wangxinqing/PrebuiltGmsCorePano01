package defpackage;

/* renamed from: azel  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class azel implements azek {
    public static final agvx a;
    public static final agvx b;
    public static final agvx c;

    static {
        agvw agvw = new agvw(agvj.a("com.google.android.gms.romanesco"));
        a = agvx.a(agvw, "DeviceContactsConsentFeature__listen_to_both_facs_and_udc_setting_change", true);
        b = agvx.a(agvw, "DeviceContactsConsentFeature__listen_to_facs_cache_updated_enabled", false);
        agvx.a(agvw, "DeviceContactsConsentFeature__read_consent_bit_from_facs_cache", false);
        c = agvx.a(agvw, "DeviceContactsConsentFeature__use_device_contacts_bit", false);
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
