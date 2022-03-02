package defpackage;

import android.net.Uri;
import androidx.slice.Slice;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: mtv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class mtv implements aod {
    final /* synthetic */ AtomicReference a;
    final /* synthetic */ CountDownLatch b;
    final /* synthetic */ aoe c;
    final /* synthetic */ Uri d;

    public mtv(AtomicReference atomicReference, CountDownLatch countDownLatch, aoe aoe, Uri uri) {
        this.a = atomicReference;
        this.b = countDownLatch;
        this.c = aoe;
        this.d = uri;
    }

    public final void a(Slice slice) {
        try {
            this.a.set(slice);
            this.b.countDown();
        } finally {
            this.c.b(this.d, this);
        }
    }
}
