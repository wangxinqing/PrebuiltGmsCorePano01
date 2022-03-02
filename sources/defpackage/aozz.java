package defpackage;

import java.io.IOException;
import java.util.Arrays;

/* renamed from: aozz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aozz extends aoug {
    public aozz(Class cls) {
        super(cls);
    }

    public final /* bridge */ /* synthetic */ Object b(audx audx) {
        aoyk aoyk = (aoyk) audx;
        byte[] a = apcw.a(32);
        apca apca = new apca(apbx.a(apbx.b(a)), a);
        aucd o = aoym.c.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        ((aoym) o.b).a = 0;
        byte[] bArr = apca.a;
        auay a2 = auay.a(Arrays.copyOf(bArr, bArr.length));
        if (o.c) {
            o.c();
            o.c = false;
        }
        a2.getClass();
        ((aoym) o.b).b = a2;
        aoym aoym = (aoym) o.i();
        aucd o2 = aoyl.d.o();
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        ((aoyl) o2.b).a = 0;
        byte[] bArr2 = apca.b;
        auay a3 = auay.a(Arrays.copyOf(bArr2, bArr2.length));
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        aoyl aoyl = (aoyl) o2.b;
        a3.getClass();
        aoyl.b = a3;
        aoym.getClass();
        aoyl.c = aoym;
        return (aoyl) o2.i();
    }

    public final /* bridge */ /* synthetic */ audx a(auay auay) {
        aubs b = aubs.b();
        aoyk aoyk = aoyk.a;
        try {
            aubc h = auay.h();
            aucj aucj = (aucj) aoyk.c(4);
            aueq a = aueh.a.a((Object) aucj);
            a.a(aucj, aubd.a(h), b);
            a.d(aucj);
            h.a(0);
            aucj.b(aucj);
            return (aoyk) aucj;
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
        aoyk aoyk = (aoyk) audx;
    }
}
