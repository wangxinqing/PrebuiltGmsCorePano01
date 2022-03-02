package defpackage;

/* renamed from: apcc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class apcc implements aouv {
    public apcc(byte[] bArr) {
        if (bArr.length == 32) {
            apcr.a(bArr);
        } else {
            throw new IllegalArgumentException(String.format("Given public key's length is not %s.", new Object[]{32}));
        }
    }
}
