package defpackage;

import java.io.IOException;
import java.security.GeneralSecurityException;

/* renamed from: aoxf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aoxf extends aoui {
    public aoxf() {
        super(aoyq.class, new aoxd(aoun.class));
    }

    public static void a(aoys aoys) {
        if (aoys.b >= 10) {
            int b = aoyp.b(aoys.a);
            if (b == 0) {
                b = 1;
            }
            int i = b - 2;
            if (i != 1) {
                if (i != 3) {
                    if (i != 4) {
                        throw new GeneralSecurityException("unknown hash type");
                    } else if (aoys.b > 64) {
                        throw new GeneralSecurityException("tag size too big");
                    }
                } else if (aoys.b > 32) {
                    throw new GeneralSecurityException("tag size too big");
                }
            } else if (aoys.b > 20) {
                throw new GeneralSecurityException("tag size too big");
            }
        } else {
            throw new GeneralSecurityException("tag size too small");
        }
    }

    public final String a() {
        return "type.googleapis.com/google.crypto.tink.HmacKey";
    }

    public final aoug c() {
        return new aoxe(aoyr.class);
    }

    public final int d() {
        return 3;
    }

    public final /* bridge */ /* synthetic */ audx a(auay auay) {
        aubs b = aubs.b();
        aoyq aoyq = aoyq.d;
        try {
            aubc h = auay.h();
            aucj aucj = (aucj) aoyq.c(4);
            aueq a = aueh.a.a((Object) aucj);
            a.a(aucj, aubd.a(h), b);
            a.d(aucj);
            h.a(0);
            aucj.b(aucj);
            return (aoyq) aucj;
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
        aoyq aoyq = (aoyq) audx;
        apdc.c(aoyq.a);
        if (aoyq.c.a() >= 16) {
            aoys aoys = aoyq.b;
            if (aoys == null) {
                aoys = aoys.c;
            }
            a(aoys);
            return;
        }
        throw new GeneralSecurityException("key too short");
    }
}
