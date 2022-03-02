package defpackage;

import java.io.Serializable;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: anlx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class anlx extends ankv implements Serializable {
    private final MessageDigest a;
    private final int b;
    private final boolean c;
    private final String d;

    public anlx(String str, int i, String str2) {
        amrl.a((Object) str2);
        this.d = str2;
        MessageDigest a2 = a(str);
        this.a = a2;
        int digestLength = a2.getDigestLength();
        boolean z = false;
        if (i >= 4 && i <= digestLength) {
            z = true;
        }
        amrl.a(z, "bytes (%s) must be >= 4 and < %s", i, digestLength);
        this.b = i;
        this.c = a(this.a);
    }

    private static MessageDigest a(String str) {
        try {
            return MessageDigest.getInstance(str);
        } catch (NoSuchAlgorithmException e) {
            throw new AssertionError(e);
        }
    }

    public final String toString() {
        return this.d;
    }

    /* access modifiers changed from: package-private */
    public Object writeReplace() {
        return new anlw(this.a.getAlgorithm(), this.b, this.d);
    }

    public anlx(String str, String str2) {
        MessageDigest a2 = a(str);
        this.a = a2;
        this.b = a2.getDigestLength();
        amrl.a((Object) str2);
        this.d = str2;
        this.c = a(this.a);
    }

    private static boolean a(MessageDigest messageDigest) {
        try {
            messageDigest.clone();
            return true;
        } catch (CloneNotSupportedException e) {
            return false;
        }
    }

    public final anlj a() {
        if (this.c) {
            try {
                return new anlv((MessageDigest) this.a.clone(), this.b);
            } catch (CloneNotSupportedException e) {
            }
        }
        return new anlv(a(this.a.getAlgorithm()), this.b);
    }
}
