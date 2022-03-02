package defpackage;

import java.io.IOException;
import java.io.InputStream;

/* renamed from: auae  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class auae implements auef {
    private static final aubs a = aubs.b();

    private static final void a(audx audx) {
        aufe aufe;
        if (audx != null && !audx.az()) {
            if (audx instanceof auac) {
                auac auac = (auac) audx;
                aufe = auac.m();
            } else if (audx instanceof auad) {
                auad auad = (auad) audx;
                throw null;
            } else {
                aufe = new aufe();
            }
            throw aufe.a();
        }
    }

    public audx a(byte[] bArr, int i, int i2, aubs aubs) {
        throw null;
    }

    /* renamed from: b */
    public final audx d(InputStream inputStream, aubs aubs) {
        audx a2 = a(inputStream, aubs);
        a(a2);
        return a2;
    }

    /* renamed from: b */
    public final audx c(byte[] bArr, int i, int i2, aubs aubs) {
        audx a2 = a(bArr, i, i2, aubs);
        a(a2);
        return a2;
    }

    public final /* bridge */ /* synthetic */ Object c(InputStream inputStream, aubs aubs) {
        audx audx;
        try {
            int read = inputStream.read();
            if (read != -1) {
                audx = a((InputStream) new auaa(inputStream, aubc.a(read, inputStream)), aubs);
            } else {
                audx = null;
            }
            a(audx);
            return audx;
        } catch (IOException e) {
            throw new auda(e);
        }
    }

    /* renamed from: a */
    public final audx b(auay auay, aubs aubs) {
        try {
            aubc h = auay.h();
            audx audx = (audx) b(h, aubs);
            h.a(0);
            a(audx);
            return audx;
        } catch (auda e) {
            throw e;
        } catch (auda e2) {
            throw e2;
        }
    }

    public final audx a(InputStream inputStream, aubs aubs) {
        aubc a2 = aubc.a(inputStream);
        audx audx = (audx) b(a2, aubs);
        try {
            a2.a(0);
            return audx;
        } catch (auda e) {
            throw e;
        }
    }

    /* renamed from: a */
    public final audx b(byte[] bArr, aubs aubs) {
        return c(bArr, 0, bArr.length, aubs);
    }

    public final /* bridge */ /* synthetic */ Object a(auay auay) {
        return b(auay, a);
    }

    public final /* bridge */ /* synthetic */ Object a(aubc aubc) {
        return (audx) b(aubc, a);
    }

    public final /* bridge */ /* synthetic */ Object a(aubc aubc, aubs aubs) {
        audx audx = (audx) b(aubc, aubs);
        a(audx);
        return audx;
    }

    public final /* bridge */ /* synthetic */ Object a(InputStream inputStream) {
        return d(inputStream, a);
    }

    public final /* bridge */ /* synthetic */ Object a(byte[] bArr) {
        return b(bArr, a);
    }

    public final /* bridge */ /* synthetic */ Object a(byte[] bArr, int i, int i2) {
        return c(bArr, i, i2, a);
    }
}
