package defpackage;

import android.os.SystemClock;
import android.view.Choreographer;

/* renamed from: aic  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aic implements Choreographer.FrameCallback {
    final /* synthetic */ aib a;

    public aic(aib aib) {
        this.a = aib;
    }

    public final void doFrame(long j) {
        ahz ahz = this.a.a;
        ahz.a.d = SystemClock.uptimeMillis();
        aid aid = ahz.a;
        long j2 = aid.d;
        long uptimeMillis = SystemClock.uptimeMillis();
        for (int i = 0; i < aid.c.size(); i++) {
            aia aia = (aia) aid.c.get(i);
            if (aia != null) {
                Long l = (Long) aid.b.get(aia);
                if (l != null) {
                    if (l.longValue() < uptimeMillis) {
                        aid.b.remove(aia);
                    }
                }
                aia.a(j2);
            }
        }
        if (aid.e) {
            for (int size = aid.c.size() - 1; size >= 0; size--) {
                if (aid.c.get(size) == null) {
                    aid.c.remove(size);
                }
            }
            aid.e = false;
        }
        if (ahz.a.c.size() > 0) {
            ahz.a.b().a();
        }
    }
}
