package defpackage;

import com.google.android.gms.common.Feature;

/* renamed from: mdh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class mdh {
    public static final Feature a = new Feature("enterprise", 1);
    public static final Feature b;

    static {
        Feature feature = new Feature("enterprise_loader", 1);
        b = feature;
        Feature[] featureArr = {a, feature};
    }
}
