package defpackage;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SignatureException;
import javax.crypto.SecretKey;

/* renamed from: aurx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class aurx {
    protected aurx() {
    }

    static aush a(byte[] bArr, int i) {
        aucd o = aush.d.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        aush aush = (aush) o.b;
        aush.a |= 2;
        aush.c = i;
        auay a = auay.a(bArr);
        if (o.c) {
            o.c();
            o.c = false;
        }
        aush aush2 = (aush) o.b;
        a.getClass();
        aush2.a |= 1;
        aush2.b = a;
        return (aush) o.i();
    }

    public abstract byte[] a();

    /* access modifiers changed from: protected */
    public abstract void b();

    public final byte[] b(byte[] bArr) {
        try {
            ausv a = ausa.a(bArr, g());
            if (a.b == 14) {
                aush aush = (aush) aucj.a((aucj) aush.d, a.a);
                c();
                if (aush.c == e()) {
                    return aush.b.k();
                }
                throw new SignatureException("Incorrect sequence number");
            }
            throw new SignatureException("wrong message type in device-to-device message");
        } catch (InvalidKeyException e) {
            throw new SignatureException(e);
        } catch (NoSuchAlgorithmException e2) {
            throw new RuntimeException(e2);
        } catch (auda e3) {
            throw new SignatureException(e3);
        }
    }

    /* access modifiers changed from: protected */
    public abstract void c();

    public abstract int d();

    public abstract int e();

    public abstract SecretKey f();

    public abstract SecretKey g();

    public final byte[] a(byte[] bArr) {
        b();
        try {
            return ausa.a(new ausv(14, a(bArr, d()).k()), f());
        } catch (InvalidKeyException e) {
            throw new RuntimeException(e);
        } catch (NoSuchAlgorithmException e2) {
            throw new RuntimeException(e2);
        }
    }
}
