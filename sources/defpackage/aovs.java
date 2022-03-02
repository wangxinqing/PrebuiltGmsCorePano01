package defpackage;

import java.io.IOException;

/* renamed from: aovs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aovs extends aoui {
    public aovs() {
        super(aoxu.class, new aovq(aotx.class));
    }

    public final String a() {
        return "type.googleapis.com/google.crypto.tink.AesGcmKey";
    }

    public final aoug c() {
        return new aovr(aoxv.class);
    }

    public final int d() {
        return 3;
    }

    public final /* bridge */ /* synthetic */ audx a(auay auay) {
        aubs b = aubs.b();
        aoxu aoxu = aoxu.c;
        try {
            aubc h = auay.h();
            aucj aucj = (aucj) aoxu.c(4);
            aueq a = aueh.a.a((Object) aucj);
            a.a(aucj, aubd.a(h), b);
            a.d(aucj);
            h.a(0);
            aucj.b(aucj);
            return (aoxu) aucj;
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
        aoxu aoxu = (aoxu) audx;
        apdc.c(aoxu.a);
        apdc.a(aoxu.b.a());
    }
}
