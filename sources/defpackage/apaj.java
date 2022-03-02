package defpackage;

import java.io.IOException;
import java.math.BigInteger;
import java.nio.charset.Charset;

/* renamed from: apaj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class apaj extends aout {
    public static final byte[] c = "Tink and Wycheproof.".getBytes(Charset.forName("UTF-8"));

    public apaj() {
        super(aozl.class, new apah(aouu.class));
    }

    public final String a() {
        return "type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey";
    }

    public final /* bridge */ /* synthetic */ audx b(audx audx) {
        aozm aozm = ((aozl) audx).b;
        return aozm == null ? aozm.e : aozm;
    }

    public final aoug c() {
        return new apai(aozj.class);
    }

    public final int d() {
        return 4;
    }

    public final /* bridge */ /* synthetic */ audx a(auay auay) {
        aubs b = aubs.b();
        aozl aozl = aozl.i;
        try {
            aubc h = auay.h();
            aucj aucj = (aucj) aozl.c(4);
            aueq a = aueh.a.a((Object) aucj);
            a.a(aucj, aubd.a(h), b);
            a.d(aucj);
            h.a(0);
            aucj.b(aucj);
            return (aozl) aucj;
        } catch (IOException e) {
            if (!(e.getCause() instanceof auda)) {
                throw new auda(e.getMessage());
            }
            throw ((auda) e.getCause());
        } catch (RuntimeException e2) {
            if (e2.getCause() instanceof auda) {
                throw ((auda) e2.getCause());
            }
            throw e2;
        } catch (auda e3) {
            throw e3;
        } catch (auda e4) {
            throw e4;
        }
    }

    public final /* bridge */ /* synthetic */ void a(audx audx) {
        aozl aozl = (aozl) audx;
        apdc.c(aozl.a);
        aozm aozm = aozl.b;
        if (aozm == null) {
            aozm = aozm.e;
        }
        apdc.b(new BigInteger(1, aozm.c.k()).bitLength());
        aozm aozm2 = aozl.b;
        if (aozm2 == null) {
            aozm2 = aozm.e;
        }
        aozk aozk = aozm2.b;
        if (aozk == null) {
            aozk = aozk.b;
        }
        apar.a(aozk);
    }
}
