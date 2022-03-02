package defpackage;

/* renamed from: auto  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public enum auto {
    HMAC_SHA256(1, "HmacSHA256", false),
    ECDSA_P256_SHA256(2, "SHA256withECDSA", true),
    RSA2048_SHA256(3, "SHA256withRSA", true);
    
    public final String d;
    public final boolean e;
    public final int f;

    private auto(int i, String str, boolean z) {
        this.f = i;
        this.d = str;
        this.e = z;
    }
}
