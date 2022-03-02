package defpackage;

import com.google.android.gms.common.Feature;

/* renamed from: eia  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class eia {
    public static final Feature a = new Feature("account_data_service", 6);
    public static final Feature b = new Feature("account_data_service_legacy", 1);
    public static final Feature c = new Feature("account_data_service_token", 2);
    public static final Feature d = new Feature("google_auth_service_token", 3);
    public static final Feature e = new Feature("google_auth_service_accounts", 2);
    public static final Feature f = new Feature("work_account_client_is_whitelisted", 1);
    public static final Feature g;

    static {
        Feature feature = new Feature("config_sync", 1);
        g = feature;
        Feature[] featureArr = {a, b, c, d, e, f, feature};
    }
}
