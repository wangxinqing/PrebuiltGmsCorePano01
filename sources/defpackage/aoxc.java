package defpackage;

import java.io.IOException;
import java.security.GeneralSecurityException;

/* renamed from: aoxc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aoxc extends aoui {
    public aoxc() {
        super(aoxj.class, new aoxa(aoun.class));
    }

    public static void a(int i) {
        if (i != 32) {
            throw new GeneralSecurityException("AesCmacKey size wrong, must be 16 bytes");
        }
    }

    public final String a() {
        return "type.googleapis.com/google.crypto.tink.AesCmacKey";
    }

    public final aoug c() {
        return new aoxb(aoxk.class);
    }

    public final int d() {
        return 3;
    }

    public static void a(aoxl aoxl) {
        int i = aoxl.a;
        if (i < 10) {
            throw new GeneralSecurityException("tag size too short");
        } else if (i > 16) {
            throw new GeneralSecurityException("tag size too long");
        }
    }

    public final /* bridge */ /* synthetic */ audx a(auay auay) {
        aubs b = aubs.b();
        aoxj aoxj = aoxj.d;
        try {
            aubc h = auay.h();
            aucj aucj = (aucj) aoxj.c(4);
            aueq a = aueh.a.a((Object) aucj);
            a.a(aucj, aubd.a(h), b);
            a.d(aucj);
            h.a(0);
            aucj.b(aucj);
            return (aoxj) aucj;
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
        aoxj aoxj = (aoxj) audx;
        apdc.c(aoxj.a);
        a(aoxj.b.a());
        aoxl aoxl = aoxj.c;
        if (aoxl == null) {
            aoxl = aoxl.b;
        }
        a(aoxl);
    }
}
