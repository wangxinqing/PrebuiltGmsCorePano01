package defpackage;

import com.google.android.gms.common.Feature;

/* renamed from: qdv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qdv {
    public static final Feature a = new Feature("device_enabled_api", 1);
    public static final Feature b = new Feature("instant_app_removed_api", 1);
    public static final Feature c = new Feature("instant_app_installed_api", 1);
    public static final Feature d;

    static {
        Feature feature = new Feature("instant_app_uninstalled_api", 1);
        d = feature;
        Feature[] featureArr = {a, b, c, feature};
    }
}
