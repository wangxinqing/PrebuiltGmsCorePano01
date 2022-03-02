package defpackage;

import android.hardware.location.NanoApp;
import android.os.Build;
import java.util.Locale;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: aroq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aroq extends arnv implements arnk {
    public final long b;
    public final CountDownLatch c = new CountDownLatch(1);
    public volatile int d;
    private final arnd e;
    private final byte[] f;

    public aroq(arnz arnz, String str, arnd arnd, long j, byte[] bArr) {
        super(arnz, str);
        if (bArr.length != 0) {
            this.e = arnd;
            this.b = j;
            this.f = bArr;
            return;
        }
        throw new IllegalArgumentException("'nanoAppBinary' cannot be null or empty.");
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ arnu a(Object obj, Object obj2) {
        return new arop((arnj) obj, (Integer) obj2);
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ boolean b(Object obj) {
        Integer num = (Integer) obj;
        return num != null && num.intValue() == 1;
    }

    public final void run() {
        NanoApp nanoApp;
        int loadNanoApp;
        arnz arnz = this.a;
        int id = ((arnr) this.e).f.getId();
        byte[] bArr = this.f;
        synchronized (arnz.k) {
            if (Build.VERSION.SDK_INT >= 26) {
                nanoApp = new NanoApp(0, bArr);
            } else {
                nanoApp = new NanoApp(0, bArr);
            }
            loadNanoApp = arnz.h.loadNanoApp(id, nanoApp);
            if (loadNanoApp == 0) {
                synchronized (arnz.k) {
                    if (arnz.l != null) {
                        Object[] objArr = {arnz.l, this};
                    }
                    arnz.l = this;
                }
            }
        }
        if (loadNanoApp == 0) {
            try {
                if (!this.c.await(90, TimeUnit.SECONDS)) {
                    Locale locale = Locale.ENGLISH;
                    new Object[1][0] = 90L;
                    loadNanoApp = -2147483647;
                } else {
                    if (a(this.d)) {
                        Locale locale2 = Locale.ENGLISH;
                        new Object[1][0] = Integer.valueOf(this.d);
                    }
                    loadNanoApp = this.d;
                }
            } catch (InterruptedException e2) {
                new Object[1][0] = e2;
                loadNanoApp = -1;
            }
        }
        c(Integer.valueOf(loadNanoApp));
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object a() {
        return 1;
    }
}
