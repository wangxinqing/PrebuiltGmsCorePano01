package defpackage;

import android.content.Context;
import android.os.Message;
import android.os.WorkSource;
import java.util.concurrent.locks.Lock;

/* renamed from: bwl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class bwl extends jfo implements ckq {
    public static final /* synthetic */ int b = 0;
    final /* synthetic */ bwn a;
    private final acrz f;
    private long g;
    private boolean h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bwl(bwn bwn, Context context, jfp jfp) {
        super(jfp);
        this.a = bwn;
        acrz acrz = new acrz(context, 1, "CMWakeLock", (String) null, "com.google.android.gms");
        this.f = acrz;
        acrz.a(true);
        b();
    }

    private final void a(Message message) {
        bwm bwm = (bwm) message.obj;
        bwm.b.b();
        try {
            bwm.a.run();
            if (bwm.c) {
                a(bwm.b);
            }
            bwm.b.c();
            clj D = cbi.D();
            if (D != null) {
                D.b(bwm.b);
            }
        } catch (Throwable th) {
            if (bwm.c) {
                a(bwm.b);
            }
            bwm.b.c();
            clj D2 = cbi.D();
            if (D2 != null) {
                D2.b(bwm.b);
            }
            throw th;
        }
    }

    public final void b() {
        this.g = awuw.a.a().a();
        this.h = awuz.a.a().S();
    }

    public final void handleMessage(Message message) {
        Lock lock;
        bwn bwn = this.a;
        if (bwn.e) {
            bwn.g.lock();
            try {
                new Object[1][0] = Boolean.valueOf(this.a.f);
                if (this.a.f) {
                    lock = this.a.g;
                } else {
                    a(message);
                    lock = this.a.g;
                }
                lock.unlock();
            } catch (Throwable th) {
                this.a.g.unlock();
                throw th;
            }
        } else {
            a(message);
        }
    }

    public final void a() {
        b();
    }

    public final void a(bvp bvp) {
        if (bvp.e) {
            synchronized (this.f) {
                if (!this.f.e()) {
                    new Object[1][0] = bvp.a;
                } else {
                    this.f.c(bvp.a);
                }
            }
        }
    }

    public final void a(clj clj, bvp bvp) {
        if (this.h && !bvp.d) {
            bvp.e = false;
            return;
        }
        synchronized (this.f) {
            WorkSource workSource = bvp.b;
            if (workSource != null) {
                this.f.c(workSource);
            }
            if (!this.f.e()) {
                if (clj != null) {
                    String valueOf = String.valueOf(bvp.a);
                    clj.c(bvq.a(valueOf.length() == 0 ? new String("FirstAcquire-") : "FirstAcquire-".concat(valueOf)));
                }
            }
            this.f.a(bvp.a, this.g);
            bvp.e = true;
        }
    }

    public final void a(Runnable runnable, bvp bvp) {
        iva.a((Object) runnable);
        iva.a((Object) bvp);
        clj D = cbi.D();
        a(D, bvp);
        Message message = new Message();
        message.obj = new bwm(runnable, bvp, bvp.e);
        bwn bwn = this.a;
        if (bwn.e) {
            bwn.g.lock();
            try {
                if (!this.a.f) {
                    sendMessage(message);
                }
            } finally {
                this.a.g.unlock();
            }
        } else if (!sendMessage(message)) {
            ((anih) ((anih) bxk.a.c()).a("bwl", "a", 362, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[EventHandler] Failed to send message %s", (Object) bvp.a);
            if (D != null) {
                String valueOf = String.valueOf(bvp.a);
                D.c(bvq.a(valueOf.length() == 0 ? new String("Failed-") : "Failed-".concat(valueOf)));
            }
            a(bvp);
        } else {
            D.a(bvp);
        }
    }
}
