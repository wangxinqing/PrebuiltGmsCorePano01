package defpackage;

import java.io.IOException;
import java.io.OutputStream;

/* renamed from: auac  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class auac implements audx {
    public int S = 0;

    static final aufe m() {
        return new aufe();
    }

    public final void a(OutputStream outputStream) {
        aubk a = aubk.a(outputStream, aubk.f(p()));
        a(a);
        a.c();
    }

    public final auay au() {
        try {
            auat d = auay.d(p());
            a(d.a);
            return d.a();
        } catch (IOException e) {
            String name = getClass().getName();
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 72);
            sb.append("Serializing ");
            sb.append(name);
            sb.append(" to a ByteString threw an IOException (should never happen).");
            throw new RuntimeException(sb.toString(), e);
        }
    }

    public void b(int i) {
        throw null;
    }

    public final byte[] k() {
        try {
            byte[] bArr = new byte[p()];
            aubk a = aubk.a(bArr);
            a(a);
            a.d();
            return bArr;
        } catch (IOException e) {
            String name = getClass().getName();
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 72);
            sb.append("Serializing ");
            sb.append(name);
            sb.append(" to a byte array threw an IOException (should never happen).");
            throw new RuntimeException(sb.toString(), e);
        }
    }

    public int l() {
        throw null;
    }

    public final void b(OutputStream outputStream) {
        int p = p();
        aubk a = aubk.a(outputStream, aubk.f(aubk.k(p) + p));
        a.d(p);
        a(a);
        a.c();
    }
}
