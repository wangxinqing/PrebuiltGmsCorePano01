package defpackage;

import java.io.IOException;
import java.security.GeneralSecurityException;

/* renamed from: apaa  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class apaa extends aout {
    public apaa() {
        super(aoyl.class, new aozy(aouu.class));
    }

    public final String a() {
        return "type.googleapis.com/google.crypto.tink.Ed25519PrivateKey";
    }

    public final /* bridge */ /* synthetic */ audx b(audx audx) {
        aoym aoym = ((aoyl) audx).c;
        return aoym == null ? aoym.c : aoym;
    }

    public final aoug c() {
        return new aozz(aoyk.class);
    }

    public final int d() {
        return 4;
    }

    public final /* bridge */ /* synthetic */ audx a(auay auay) {
        aubs b = aubs.b();
        aoyl aoyl = aoyl.d;
        try {
            aubc h = auay.h();
            aucj aucj = (aucj) aoyl.c(4);
            aueq a = aueh.a.a((Object) aucj);
            a.a(aucj, aubd.a(h), b);
            a.d(aucj);
            h.a(0);
            aucj.b(aucj);
            return (aoyl) aucj;
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
        aoyl aoyl = (aoyl) audx;
        apdc.c(aoyl.a);
        new apac();
        aoym aoym = aoyl.c;
        if (aoym == null) {
            aoym = aoym.c;
        }
        apac.a(aoym);
        if (aoyl.b.a() != 32) {
            throw new GeneralSecurityException("invalid Ed25519 private key: incorrect key length");
        }
    }
}
