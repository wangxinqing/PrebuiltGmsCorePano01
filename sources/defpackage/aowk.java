package defpackage;

import java.io.IOException;

/* renamed from: aowk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aowk extends aoui {
    public aowk() {
        super(aoyi.class, new aowj(aoub.class));
    }

    public final String a() {
        return "type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey";
    }

    public final int d() {
        return 5;
    }

    public final /* bridge */ /* synthetic */ audx a(auay auay) {
        aubs b = aubs.b();
        aoyi aoyi = aoyi.e;
        try {
            aubc h = auay.h();
            aucj aucj = (aucj) aoyi.c(4);
            aueq a = aueh.a.a((Object) aucj);
            a.a(aucj, aubd.a(h), b);
            a.d(aucj);
            h.a(0);
            aucj.b(aucj);
            return (aoyi) aucj;
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
        aoyi aoyi = (aoyi) audx;
        apdc.c(aoyi.a);
        aoyg aoyg = aoyi.b;
        if (aoyg == null) {
            aoyg = aoyg.d;
        }
        aows.a(aoyg);
    }
}
