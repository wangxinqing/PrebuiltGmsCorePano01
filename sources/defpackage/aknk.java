package defpackage;

import android.os.SystemClock;

/* renamed from: aknk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aknk {
    public final akma a;
    public aklo b;
    public akke c;
    private final akim d;

    public aknk(akim akim, akma akma) {
        this.d = akim;
        this.a = akma;
    }

    public final void a(long[] jArr, boolean z) {
        int length = jArr.length;
        if (length > 0) {
            akim akim = this.d;
            aknj aknj = new aknj(this, SystemClock.elapsedRealtime(), length);
            if (!azda.d()) {
                akim.c.a(new aksk(akim.a, jArr), new akii(aknj, z));
            } else {
                akim.c.a(new aktq(akim.b, jArr), new akij(aknj, z));
            }
        } else {
            aklz.a();
        }
    }
}
