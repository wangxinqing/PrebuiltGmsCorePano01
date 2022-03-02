package defpackage;

import java.io.IOException;

/* renamed from: aovy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aovy extends aoui {
    public aovy() {
        super(aozd.class, new aovw(aotx.class));
    }

    public final String a() {
        return "type.googleapis.com/google.crypto.tink.KmsAeadKey";
    }

    public final aoug c() {
        return new aovx(aoze.class);
    }

    public final int d() {
        return 6;
    }

    public final /* bridge */ /* synthetic */ audx a(auay auay) {
        aubs b = aubs.b();
        aozd aozd = aozd.c;
        try {
            aubc h = auay.h();
            aucj aucj = (aucj) aozd.c(4);
            aueq a = aueh.a.a((Object) aucj);
            a.a(aucj, aubd.a(h), b);
            a.d(aucj);
            h.a(0);
            aucj.b(aucj);
            return (aozd) aucj;
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
        apdc.c(((aozd) audx).a);
    }
}
