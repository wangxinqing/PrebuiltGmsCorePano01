package defpackage;

import android.hardware.location.ContextHubClient;
import android.hardware.location.ContextHubInfo;
import android.hardware.location.NanoAppMessage;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: aror  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aror implements Runnable, arnk {
    private final ContextHubInfo a;
    private final arnh b;
    private final int c;
    private final int d;
    private final int e;
    private final byte[] f;
    private final CountDownLatch g = new CountDownLatch(1);
    private int h;
    private arnj i;
    private final ContextHubClient j;

    private final synchronized void a() {
        arnj arnj = this.i;
        if (arnj != null) {
            arnj.a(this.h);
        }
    }

    private final synchronized void b() {
        this.g.countDown();
        a();
    }

    public final boolean cancel(boolean z) {
        return false;
    }

    public final /* bridge */ /* synthetic */ Object get() {
        this.g.await();
        return Integer.valueOf(this.h);
    }

    public final boolean isCancelled() {
        return false;
    }

    public final boolean isDone() {
        return this.g.getCount() == 0;
    }

    public final void run() {
        arom arom = new arom(this.f, this.c, this.d, this.e, this.a.getMaxPacketLengthBytes());
        this.h = 0;
        while (arom.a() && this.h == 0) {
            byte[] b2 = arom.b();
            this.h = this.j.sendMessageToNanoApp(NanoAppMessage.createMessageToNanoApp(((arns) this.b).a, this.d, b2)) != 0 ? -1 : 0;
        }
        b();
    }

    public aror(ContextHubClient contextHubClient, ContextHubInfo contextHubInfo, arnh arnh, int i2, int i3, int i4, byte[] bArr) {
        this.a = contextHubInfo;
        this.b = arnh;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = bArr;
        this.j = contextHubClient;
    }

    /* access modifiers changed from: private */
    public final synchronized void a(arnj arnj) {
        this.i = arnj;
        if (isDone()) {
            a();
        }
    }

    public final /* bridge */ /* synthetic */ Object get(long j2, TimeUnit timeUnit) {
        if (this.g.await(j2, timeUnit)) {
            return Integer.valueOf(this.h);
        }
        throw new TimeoutException("Timed out while waiting for message");
    }
}
