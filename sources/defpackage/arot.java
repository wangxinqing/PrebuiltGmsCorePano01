package defpackage;

import java.util.Locale;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: arot  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class arot extends arnv implements arnk {
    public final int b;
    public final CountDownLatch c = new CountDownLatch(1);
    public volatile int d;

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ arnu a(Object obj, Object obj2) {
        return new aros((arnj) obj, (Integer) obj2);
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ boolean b(Object obj) {
        Integer num = (Integer) obj;
        return num != null && num.intValue() == 1;
    }

    public final void run() {
        int unloadNanoApp;
        arnz arnz = this.a;
        synchronized (arnz.k) {
            unloadNanoApp = arnz.h.unloadNanoApp(this.b);
            if (unloadNanoApp == 0) {
                synchronized (arnz.k) {
                    if (arnz.m != null) {
                        Object[] objArr = {arnz.m, this};
                    }
                    arnz.m = this;
                }
            }
        }
        if (unloadNanoApp == 0) {
            try {
                if (!this.c.await(90, TimeUnit.SECONDS)) {
                    Locale locale = Locale.ENGLISH;
                    new Object[1][0] = 90L;
                    unloadNanoApp = -2147483647;
                } else {
                    unloadNanoApp = this.d;
                }
            } catch (InterruptedException e) {
                new Object[1][0] = e;
                unloadNanoApp = -1;
            }
        }
        c(Integer.valueOf(unloadNanoApp));
    }

    public arot(arnz arnz, String str, int i) {
        super(arnz, str);
        this.b = i;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object a() {
        return 1;
    }
}
