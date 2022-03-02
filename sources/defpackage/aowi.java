package defpackage;

import java.io.IOException;
import java.security.GeneralSecurityException;

/* renamed from: aowi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aowi extends aout {
    public aowi() {
        super(aoyh.class, new aowg(aoua.class));
    }

    public final String a() {
        return "type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey";
    }

    public final /* bridge */ /* synthetic */ audx b(audx audx) {
        aoyi aoyi = ((aoyh) audx).b;
        return aoyi == null ? aoyi.e : aoyi;
    }

    public final aoug c() {
        return new aowh(aoyf.class);
    }

    public final int d() {
        return 4;
    }

    public final /* bridge */ /* synthetic */ audx a(auay auay) {
        aubs b = aubs.b();
        aoyh aoyh = aoyh.d;
        try {
            aubc h = auay.h();
            aucj aucj = (aucj) aoyh.c(4);
            aueq a = aueh.a.a((Object) aucj);
            a.a(aucj, aubd.a(h), b);
            a.d(aucj);
            h.a(0);
            aucj.b(aucj);
            return (aoyh) aucj;
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
        aoyh aoyh = (aoyh) audx;
        if (!aoyh.c.j()) {
            apdc.c(aoyh.a);
            aoyi aoyi = aoyh.b;
            if (aoyi == null) {
                aoyi = aoyi.e;
            }
            aoyg aoyg = aoyi.b;
            if (aoyg == null) {
                aoyg = aoyg.d;
            }
            aows.a(aoyg);
            return;
        }
        throw new GeneralSecurityException("invalid ECIES private key");
    }
}
