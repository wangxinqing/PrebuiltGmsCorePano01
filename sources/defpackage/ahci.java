package defpackage;

import java.io.InputStream;

/* renamed from: ahci  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ahci implements agzr {
    public aubs a = aubs.b();
    private final auef b;

    public ahci(auef auef) {
        this.b = auef;
    }

    public final /* bridge */ /* synthetic */ Object a(agzq agzq) {
        InputStream b2 = ahcj.b(agzq);
        try {
            audx audx = (audx) this.b.d(b2, this.a);
            if (b2 != null) {
                b2.close();
            }
            return audx;
        } catch (Throwable th) {
            apev.a(th, th);
        }
        throw th;
    }
}
