package defpackage;

import android.content.Context;
import android.os.Build;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: asbg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class asbg implements asjb {
    public final Context a;
    public ampk b;
    public final Set c;
    public final asbo d;
    public asgs e;
    public final AtomicBoolean f;
    public final BlockingQueue g = new LinkedBlockingQueue();
    final CountDownLatch h = new CountDownLatch(1);

    public asbg(Context context) {
        this.a = context;
        this.d = (asbo) thl.a(context, asbo.class);
        this.c = new HashSet();
        this.f = new AtomicBoolean(false);
    }

    public static void a(Context context) {
        int i = Build.VERSION.SDK_INT;
        asda asda = (asda) thl.b(context, asda.class);
        if (asda == null || !asda.b()) {
            throw new asjk(asda.class, asbg.class);
        }
    }

    public final /* bridge */ /* synthetic */ audx c() {
        return asem.e;
    }

    public final ashq a(asgs asgs) {
        this.e = asgs;
        return new asbe(this);
    }

    public final void a() {
        ampk ampk = this.b;
        if (ampk != null) {
            ampk.a(true);
            this.b = null;
        }
        a(new IOException("Gatt server closed"));
        this.f.set(true);
    }

    public final void a(asiz asiz) {
        jjg jjg = asil.a;
        a();
        synchronized (this.c) {
            for (asbn b2 : this.c) {
                this.d.b((ashv) b2);
            }
        }
        asiz.a();
    }

    public final void a(IOException iOException) {
        try {
            this.g.put(new asbf(iOException));
        } catch (InterruptedException e2) {
            Thread.currentThread().interrupt();
            jjg jjg = asil.a;
        }
    }
}
