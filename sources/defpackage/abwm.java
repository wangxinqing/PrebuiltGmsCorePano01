package defpackage;

import java.security.SignatureException;

/* renamed from: abwm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class abwm implements abwi {
    private final aurx b;

    public abwm(aurx aurx) {
        this.b = aurx;
    }

    public final byte[] a(byte[] bArr) {
        return this.b.a(bArr);
    }

    public final byte[] b(byte[] bArr) {
        try {
            return this.b.b(bArr);
        } catch (SignatureException e) {
            String valueOf = String.valueOf(e.getMessage());
            throw new SecurityException(valueOf.length() == 0 ? new String("SignatureException when decoding data with the Ukey2 protocol: ") : "SignatureException when decoding data with the Ukey2 protocol: ".concat(valueOf));
        }
    }
}
