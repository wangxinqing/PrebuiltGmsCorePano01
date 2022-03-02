package defpackage;

import java.util.PriorityQueue;

/* renamed from: hui  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class hui extends PriorityQueue {
    long a = 0;
    long b;
    long c = 0;
    final /* synthetic */ huv d;

    public hui(huv huv, long j) {
        this.d = huv;
        this.b = j;
    }

    public final void a() {
        while (true) {
            if ((!isEmpty() && this.b <= this.c - ((huh) peek()).b) || size() > 1500) {
                this.c -= ((huh) poll()).b;
            } else {
                return;
            }
        }
    }

    public final void clear() {
        super.clear();
        this.c = 0;
    }

    /* access modifiers changed from: package-private */
    public final void a(long j) {
        long a2 = this.b - this.d.a(j);
        this.b = a2;
        if (a2 <= 0) {
            clear();
            this.b = 0;
        }
        a();
    }
}
