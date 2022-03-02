package defpackage;

import com.google.android.gms.common.Feature;

/* renamed from: zoq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class zoq {
    public static final Feature a = new Feature("verify_with_recaptcha_v2_internal", 1);
    public static final Feature b = new Feature("init", 2);
    public static final Feature c = new Feature("execute", 4);
    public static final Feature d;
    public static final Feature[] e;

    static {
        Feature feature = new Feature("close", 2);
        d = feature;
        e = new Feature[]{a, b, c, feature};
    }
}
