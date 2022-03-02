package defpackage;

import java.util.concurrent.Future;

/* renamed from: aops  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aops implements Runnable {
    final /* synthetic */ aorr a;
    final /* synthetic */ int b;
    final /* synthetic */ aopv c;

    public aops(aopv aopv, aorr aorr, int i) {
        this.c = aopv;
        this.a = aorr;
        this.b = i;
    }

    public final void run() {
        try {
            if (!this.a.isCancelled()) {
                this.c.a(this.b, (Future) this.a);
            } else {
                aopv aopv = this.c;
                aopv.a = null;
                aopv.cancel(false);
            }
        } finally {
            this.c.a((amzn) null);
        }
    }
}
