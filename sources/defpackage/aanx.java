package defpackage;

import android.content.Context;
import android.os.Bundle;
import java.util.concurrent.CountDownLatch;

/* renamed from: aanx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aanx extends allp {
    public final CountDownLatch a = new CountDownLatch(1);
    public final Context b;
    public final int c;
    public final boolean d;
    public aanv e;
    public final aanw f = new aanw(this);

    public aanx(Context context, int i, boolean z) {
        this.b = context;
        this.c = i;
        this.d = z;
    }

    public final void a(boolean z, Bundle bundle) {
        CountDownLatch countDownLatch;
        if (z && bundle != null) {
            try {
                this.e = new aanv(bundle);
            } catch (RuntimeException e2) {
                countDownLatch = this.a;
            } catch (Throwable th) {
                this.a.countDown();
                throw th;
            }
        }
        countDownLatch = this.a;
        countDownLatch.countDown();
    }
}
