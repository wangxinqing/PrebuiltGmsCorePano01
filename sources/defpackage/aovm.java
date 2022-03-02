package defpackage;

import java.io.IOException;
import java.security.GeneralSecurityException;

/* renamed from: aovm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aovm extends aoui {
    public aovm() {
        super(aoxo.class, new aovk(apcs.class));
    }

    public static final void a(aoxq aoxq) {
        int i = aoxq.a;
        if (i < 12 || i > 16) {
            throw new GeneralSecurityException("invalid IV size");
        }
    }

    public final String a() {
        return "type.googleapis.com/google.crypto.tink.AesCtrKey";
    }

    public final aoug c() {
        return new aovl(aoxp.class);
    }

    public final int d() {
        return 3;
    }

    public final /* bridge */ /* synthetic */ audx a(auay auay) {
        aubs b = aubs.b();
        aoxo aoxo = aoxo.d;
        try {
            aubc h = auay.h();
            aucj aucj = (aucj) aoxo.c(4);
            aueq a = aueh.a.a((Object) aucj);
            a.a(aucj, aubd.a(h), b);
            a.d(aucj);
            h.a(0);
            aucj.b(aucj);
            return (aoxo) aucj;
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
        aoxo aoxo = (aoxo) audx;
        apdc.c(aoxo.a);
        apdc.a(aoxo.c.a());
        aoxq aoxq = aoxo.b;
        if (aoxq == null) {
            aoxq = aoxq.b;
        }
        a(aoxq);
    }
}
