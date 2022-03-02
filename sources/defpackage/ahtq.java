package defpackage;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: ahtq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ahtq extends ThreadPoolExecutor {
    final /* synthetic */ ahts a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ahtq(ahts ahts, TimeUnit timeUnit, BlockingQueue blockingQueue, RejectedExecutionHandler rejectedExecutionHandler) {
        super(1, 1, 60, timeUnit, blockingQueue, rejectedExecutionHandler);
        this.a = ahts;
    }

    /* access modifiers changed from: protected */
    public final void terminated() {
        ahts ahts = this.a;
        ajrh ajrh = ahts.i;
        ahuz ahuz = ahts.k;
        try {
            if (ahts.d) {
                if (ahuz != null) {
                    this.a.a(ahuz);
                    ajrh ajrh2 = this.a.i;
                }
            }
            String str = this.a.b;
            if (str != null) {
                ahuk.a.b(str);
            }
            ahts ahts2 = this.a;
            ahss ahss = ahts2.h;
            if (ahss != null) {
                ahss.a(ahts2.k);
            }
        } catch (Throwable th) {
            ahts ahts3 = this.a;
            ahss ahss2 = ahts3.h;
            if (ahss2 != null) {
                ahss2.a(ahts3.k);
            }
            throw th;
        }
    }
}
