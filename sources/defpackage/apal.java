package defpackage;

import java.io.IOException;
import java.math.BigInteger;

/* renamed from: apal  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class apal extends aoui {
    public apal() {
        super(aozm.class, new apak(aouv.class));
    }

    public final String a() {
        return "type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PublicKey";
    }

    public final int d() {
        return 5;
    }

    public final /* bridge */ /* synthetic */ audx a(auay auay) {
        aubs b = aubs.b();
        aozm aozm = aozm.e;
        try {
            aubc h = auay.h();
            aucj aucj = (aucj) aozm.c(4);
            aueq a = aueh.a.a((Object) aucj);
            a.a(aucj, aubd.a(h), b);
            a.d(aucj);
            h.a(0);
            aucj.b(aucj);
            return (aozm) aucj;
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
        aozm aozm = (aozm) audx;
        apdc.c(aozm.a);
        apdc.b(new BigInteger(1, aozm.c.k()).bitLength());
        aozk aozk = aozm.b;
        if (aozk == null) {
            aozk = aozk.b;
        }
        apar.a(aozk);
    }
}
