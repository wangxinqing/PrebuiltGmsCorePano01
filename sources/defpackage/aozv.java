package defpackage;

import java.io.IOException;

/* renamed from: aozv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aozv extends aout {
    public aozv() {
        super(aoyb.class, new aozt(aouu.class));
    }

    public final String a() {
        return "type.googleapis.com/google.crypto.tink.EcdsaPrivateKey";
    }

    public final /* bridge */ /* synthetic */ audx b(audx audx) {
        aoyc aoyc = ((aoyb) audx).b;
        return aoyc == null ? aoyc.e : aoyc;
    }

    public final aoug c() {
        return new aozu(aoxz.class);
    }

    public final int d() {
        return 4;
    }

    public final /* bridge */ /* synthetic */ audx a(auay auay) {
        aubs b = aubs.b();
        aoyb aoyb = aoyb.d;
        try {
            aubc h = auay.h();
            aucj aucj = (aucj) aoyb.c(4);
            aueq a = aueh.a.a((Object) aucj);
            a.a(aucj, aubd.a(h), b);
            a.d(aucj);
            h.a(0);
            aucj.b(aucj);
            return (aoyb) aucj;
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
        aoyb aoyb = (aoyb) audx;
        apdc.c(aoyb.a);
        aoyc aoyc = aoyb.b;
        if (aoyc == null) {
            aoyc = aoyc.e;
        }
        aoya aoya = aoyc.b;
        if (aoya == null) {
            aoya = aoya.d;
        }
        apar.a(aoya);
    }
}
