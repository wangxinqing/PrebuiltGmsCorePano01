package defpackage;

import java.io.IOException;
import java.security.GeneralSecurityException;

/* renamed from: aovv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aovv extends aoui {
    public aovv() {
        super(aoxw.class, new aovt(aotx.class));
    }

    public final String a() {
        return "type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key";
    }

    public final aoug c() {
        return new aovu(aoxx.class);
    }

    public final int d() {
        return 3;
    }

    public final /* bridge */ /* synthetic */ audx a(auay auay) {
        aubs b = aubs.b();
        aoxw aoxw = aoxw.c;
        try {
            aubc h = auay.h();
            aucj aucj = (aucj) aoxw.c(4);
            aueq a = aueh.a.a((Object) aucj);
            a.a(aucj, aubd.a(h), b);
            a.d(aucj);
            h.a(0);
            aucj.b(aucj);
            return (aoxw) aucj;
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
        aoxw aoxw = (aoxw) audx;
        apdc.c(aoxw.a);
        if (aoxw.b.a() != 32) {
            throw new GeneralSecurityException("invalid ChaCha20Poly1305Key: incorrect key length");
        }
    }
}
