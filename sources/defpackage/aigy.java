package defpackage;

import java.util.Deque;
import java.util.Iterator;
import java.util.concurrent.LinkedBlockingDeque;

/* renamed from: aigy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aigy {
    public final amsv a = amta.a(aigx.a);
    public final Deque b = new LinkedBlockingDeque();

    /* access modifiers changed from: package-private */
    public final boolean a() {
        long j;
        long j2;
        arjv arjv;
        long j3 = Long.MAX_VALUE;
        long j4 = 0;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        for (arjk arjk : this.b) {
            int a2 = arjj.a(arjk.a);
            int i4 = a2 - 1;
            if (a2 != 0) {
                if (i4 == 0) {
                    if (arjk.a == 2) {
                        arjv = (arjv) arjk.b;
                    } else {
                        arjv = arjv.c;
                    }
                    if (arjt.a(arjv.a) == 1) {
                        i3++;
                    }
                } else if (i4 == 1 || i4 == 2) {
                    i++;
                    j4 = arjk.c;
                } else if (i4 == 3) {
                    i2++;
                }
                j3 = arjk.c;
            } else {
                throw null;
            }
        }
        if (!this.b.isEmpty()) {
            j = j3;
            j2 = ((arjk) this.b.getLast()).c - ((arjk) this.b.getFirst()).c;
        } else {
            j = j3;
            j2 = 0;
        }
        return j2 > axxm.a.a().flpBluePixelBatchMinDurationNs() && ((long) i) >= axxm.e() && ((long) i2) >= axxm.a.a().flpBluePixelBatchMinStepElements() && ((long) i3) >= axxm.a.a().flpBluePixelBatchMinBearingElements() && ((axxm.e() > 0 ? 1 : (axxm.e() == 0 ? 0 : -1)) <= 0 || ((j - j4) > axxm.a.a().flpBluePixelBatchMaxTimeDeltaForLocationElementNanos() ? 1 : ((j - j4) == axxm.a.a().flpBluePixelBatchMaxTimeDeltaForLocationElementNanos() ? 0 : -1)) < 0);
    }

    /* access modifiers changed from: package-private */
    public final Iterator b() {
        return this.b.iterator();
    }

    /* access modifiers changed from: package-private */
    public final void c() {
        this.b.clear();
    }

    /* access modifiers changed from: package-private */
    public final boolean d() {
        return this.b.isEmpty();
    }
}
