package defpackage;

import java.util.Collection;
import java.util.concurrent.TimeUnit;

/* renamed from: afjb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class afjb implements aora {
    final /* synthetic */ afjc a;

    public afjb(afjc afjc) {
        this.a = afjc;
    }

    public final /* bridge */ /* synthetic */ void a(Object obj) {
        aeph aeph = (aeph) obj;
        afjc afjc = this.a;
        if (aeph.b().c() != 0) {
            boolean z = false;
            for (afhu afhu : (Collection) aeph.a()) {
                afiz afiz = afjc.a;
                aeph.b();
                int seconds = (int) TimeUnit.MICROSECONDS.toSeconds(afhu.c);
                byte[] bArr = afhu.a;
                if (bArr == null) {
                    aknr aknr = (aknr) afiz;
                    aknr.a(new astv[0], new astz[0], seconds, 0, aknr.a, 2);
                    aklz.a().c("Null personalized places data.");
                    z = true;
                } else {
                    int length = bArr.length;
                    if (length == 0) {
                        ((aknr) afiz).a(atta.c, seconds, 0);
                        z = true;
                    } else {
                        try {
                            ((aknr) afiz).a((atta) afhu.a(), seconds, length);
                            z = true;
                        } catch (auda e) {
                            aknr aknr2 = (aknr) afiz;
                            aknr2.a(new astv[0], new astz[0], seconds, bArr.length, aknr2.a, 2);
                            aklz.a().a("Failure parsing personalized places proto.", e);
                            z = true;
                        }
                    }
                }
            }
            if (!z) {
                afiz afiz2 = afjc.a;
                aeph.b();
                ((aknr) afiz2).a(atta.c, 0, 0);
            }
        }
    }

    public final void a(Throwable th) {
        afiz afiz = this.a.a;
        aklz.a().a("Failure reading Footprints.", th);
        aknr aknr = (aknr) afiz;
        aknr.a(aknr.a);
    }
}
