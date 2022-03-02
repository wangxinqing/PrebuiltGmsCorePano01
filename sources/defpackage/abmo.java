package defpackage;

import com.google.android.gms.common.Feature;

/* renamed from: abmo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class abmo {
    public static final Feature a = new Feature("post_setup_pair", 4);
    public static final Feature b = new Feature("managed_account_setup", 2);
    public static final Feature c = new Feature("esim_activation_setup", 2);
    public static final Feature d = new Feature("source_bootstrap_api", 2);
    public static final Feature e = new Feature("source_direct_transfer_api", 1);
    public static final Feature f = new Feature("target_direct_transfer_api", 1);
    public static final Feature g = new Feature("post_setup_api", 1);
    public static final Feature h = new Feature("source_direct_transfer_with_progress_api", 1);
    public static final Feature i;
    public static final Feature[] j;

    static {
        Feature feature = new Feature("target_direct_transfer_with_progress_api", 1);
        i = feature;
        j = new Feature[]{a, b, c, d, e, f, g, h, feature};
    }
}
