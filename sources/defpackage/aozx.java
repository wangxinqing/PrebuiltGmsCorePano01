package defpackage;

import java.io.IOException;

/* renamed from: aozx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aozx extends aoui {
    public aozx() {
        super(aoyc.class, new aozw(aouv.class));
    }

    public final String a() {
        return "type.googleapis.com/google.crypto.tink.EcdsaPublicKey";
    }

    public final int d() {
        return 5;
    }

    public final /* bridge */ /* synthetic */ audx a(auay auay) {
        aubs b = aubs.b();
        aoyc aoyc = aoyc.e;
        try {
            aubc h = auay.h();
            aucj aucj = (aucj) aoyc.c(4);
            aueq a = aueh.a.a((Object) aucj);
            a.a(aucj, aubd.a(h), b);
            a.d(aucj);
            h.a(0);
            aucj.b(aucj);
            return (aoyc) aucj;
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
        aoyc aoyc = (aoyc) audx;
        apdc.c(aoyc.a);
        aoya aoya = aoyc.b;
        if (aoya == null) {
            aoya = aoya.d;
        }
        apar.a(aoya);
    }
}
