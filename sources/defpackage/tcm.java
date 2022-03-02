package defpackage;

import com.google.android.gms.common.Feature;

/* renamed from: tcm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class tcm {
    public static final Feature a = new Feature("nearby_sharing", 29);
    public static final Feature b;

    static {
        Feature feature = new Feature("nearby_connections", 3);
        b = feature;
        Feature[] featureArr = {a, feature};
    }
}
