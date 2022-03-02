package defpackage;

import com.google.android.gms.common.Feature;

/* renamed from: myr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class myr {
    public static final Feature a = new Feature("is_user_verifying_platform_authenticator_available", 1);
    public static final Feature b = new Feature("is_user_verifying_platform_authenticator_available_for_credential", 1);
    public static final Feature c = new Feature("zero_party_api_sign", 1);
    public static final Feature d;
    public static final Feature[] e;

    static {
        Feature feature = new Feature("zero_party_api_register", 1);
        d = feature;
        e = new Feature[]{a, b, c, feature};
    }
}
