package defpackage;

import java.io.IOException;
import java.security.GeneralSecurityException;

/* renamed from: aovp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aovp extends aoui {
    public aovp() {
        super(aoxr.class, new aovn(aotx.class));
    }

    public final String a() {
        return "type.googleapis.com/google.crypto.tink.AesEaxKey";
    }

    public final aoug c() {
        return new aovo(aoxs.class);
    }

    public final int d() {
        return 3;
    }

    public final /* bridge */ /* synthetic */ audx a(auay auay) {
        aubs b = aubs.b();
        aoxr aoxr = aoxr.d;
        try {
            aubc h = auay.h();
            aucj aucj = (aucj) aoxr.c(4);
            aueq a = aueh.a.a((Object) aucj);
            a.a(aucj, aubd.a(h), b);
            a.d(aucj);
            h.a(0);
            aucj.b(aucj);
            return (aoxr) aucj;
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
        aoxr aoxr = (aoxr) audx;
        apdc.c(aoxr.a);
        apdc.a(aoxr.c.a());
        aoxt aoxt = aoxr.b;
        if (aoxt == null) {
            aoxt = aoxt.b;
        }
        if (aoxt.a != 12) {
            aoxt aoxt2 = aoxr.b;
            if (aoxt2 == null) {
                aoxt2 = aoxt.b;
            }
            if (aoxt2.a != 16) {
                throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
            }
        }
    }
}
