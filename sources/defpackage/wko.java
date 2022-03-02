package defpackage;

import com.google.android.gms.common.Feature;

/* renamed from: wko  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class wko {
    public static final Feature a = new Feature("pay", 10);
    public static final Feature b = new Feature("pay_attestation_signal", 1);
    public static final Feature c = new Feature("pay_feature_check", 1);
    public static final Feature d = new Feature("pay_global_actions", 1);
    public static final Feature e = new Feature("pay_homescreen_sorting", 3);
    public static final Feature f = new Feature("pay_homescreen_bulletins", 1);
    public static final Feature g = new Feature("pay_onboarding", 2);
    public static final Feature h = new Feature("pay_passes_notifications", 2);
    public static final Feature i = new Feature("pay_payment_method", 1);
    public static final Feature j = new Feature("pay_payment_method_action_tokens", 2);
    public static final Feature k = new Feature("pay_payment_method_server_action", 1);
    public static final Feature l = new Feature("pay_request_module", 1);
    public static final Feature m = new Feature("pay_settings", 1);
    public static final Feature n;

    static {
        Feature feature = new Feature("pay_transactions", 6);
        n = feature;
        Feature[] featureArr = {a, b, c, d, e, f, g, h, i, j, k, l, m, feature};
    }
}
