package defpackage;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: amdo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class amdo {
    public static final char[] b = "0123456789abcdef".toCharArray();
    public final MessageDigest a;

    public amdo() {
        try {
            this.a = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException e) {
            throw new AssertionError(e);
        }
    }

    public final void a(byte[] bArr, int i, int i2) {
        this.a.update(bArr, i, i2);
    }
}
