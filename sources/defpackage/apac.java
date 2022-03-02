package defpackage;

import java.io.IOException;
import java.security.GeneralSecurityException;

/* renamed from: apac  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class apac extends aoui {
    public apac() {
        super(aoym.class, new apab(aouv.class));
    }

    public static final void a(aoym aoym) {
        apdc.c(aoym.a);
        if (aoym.b.a() != 32) {
            throw new GeneralSecurityException("invalid Ed25519 public key: incorrect key length");
        }
    }

    public final String a() {
        return "type.googleapis.com/google.crypto.tink.Ed25519PublicKey";
    }

    public final int d() {
        return 5;
    }

    public final /* bridge */ /* synthetic */ audx a(auay auay) {
        aubs b = aubs.b();
        aoym aoym = aoym.c;
        try {
            aubc h = auay.h();
            aucj aucj = (aucj) aoym.c(4);
            aueq a = aueh.a.a((Object) aucj);
            a.a(aucj, aubd.a(h), b);
            a.d(aucj);
            h.a(0);
            aucj.b(aucj);
            return (aoym) aucj;
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
        a((aoym) audx);
    }
}
