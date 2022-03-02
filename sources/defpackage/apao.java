package defpackage;

import java.io.IOException;
import java.math.BigInteger;
import java.nio.charset.Charset;

/* renamed from: apao  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class apao extends aout {
    public static final byte[] c = "Tink and Wycheproof.".getBytes(Charset.forName("UTF-8"));

    public apao() {
        super(aozp.class, new apam(aouu.class));
    }

    public final String a() {
        return "type.googleapis.com/google.crypto.tink.RsaSsaPssPrivateKey";
    }

    public final /* bridge */ /* synthetic */ audx b(audx audx) {
        aozq aozq = ((aozp) audx).b;
        return aozq == null ? aozq.e : aozq;
    }

    public final aoug c() {
        return new apan(aozn.class);
    }

    public final int d() {
        return 4;
    }

    public final /* bridge */ /* synthetic */ audx a(auay auay) {
        aubs b = aubs.b();
        aozp aozp = aozp.i;
        try {
            aubc h = auay.h();
            aucj aucj = (aucj) aozp.c(4);
            aueq a = aueh.a.a((Object) aucj);
            a.a(aucj, aubd.a(h), b);
            a.d(aucj);
            h.a(0);
            aucj.b(aucj);
            return (aozp) aucj;
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
        aozp aozp = (aozp) audx;
        apdc.c(aozp.a);
        aozq aozq = aozp.b;
        if (aozq == null) {
            aozq = aozq.e;
        }
        apdc.b(new BigInteger(1, aozq.c.k()).bitLength());
        aozq aozq2 = aozp.b;
        if (aozq2 == null) {
            aozq2 = aozq.e;
        }
        aozo aozo = aozq2.b;
        if (aozo == null) {
            aozo = aozo.d;
        }
        apar.a(aozo);
    }
}
