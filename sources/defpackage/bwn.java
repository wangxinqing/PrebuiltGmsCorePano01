package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Message;
import com.google.android.contextmanager.controller.EventHandler$AlarmSetter;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: bwn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class bwn extends cbe implements but {
    public final Context a;
    public final jfp b;
    public final bwl c;
    public final EventHandler$AlarmSetter d;
    public final boolean e;
    public volatile boolean f = false;
    public final Lock g = new ReentrantLock();

    public bwn(Context context, boolean z) {
        this.a = context;
        jfp jfp = new jfp("CMEventHandler", 10);
        this.b = jfp;
        jfp.start();
        this.c = new bwl(this, context, this.b);
        EventHandler$AlarmSetter eventHandler$AlarmSetter = new EventHandler$AlarmSetter(this);
        this.d = eventHandler$AlarmSetter;
        eventHandler$AlarmSetter.f.a.registerReceiver(eventHandler$AlarmSetter, new IntentFilter(eventHandler$AlarmSetter.d));
        this.e = z;
    }

    public final Executor a(bvp bvp) {
        return new bwi(this, bvp);
    }

    public final boolean b() {
        jfz jfz = this.b.a;
        jfz.d.lock();
        try {
            return jfz.b.contains(Thread.currentThread());
        } finally {
            jfz.d.unlock();
        }
    }

    public final void a() {
        iva.a(b(), (Object) "This method must run in the EventHandler's thread.");
    }

    public final void a(Runnable runnable) {
        if (b()) {
            this.d.a(runnable);
        } else {
            a(new bwj(this, runnable), bvq.a("EventHandler#cancel"));
        }
    }

    public final void a(Runnable runnable, long j, bvp bvp) {
        if (j >= 31536000000L) {
            ((anih) ((anih) bxk.a.c()).a("bwn", "a", 155, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[EventHandler] Dropping runnable, delay=%s, runnable=%s, workInfo=%s", (Object) Long.valueOf(j), (Object) runnable, (Object) bvp);
        } else if (b()) {
            this.d.a(runnable, j, bvp);
        } else {
            a(new bwh(this, runnable, j, bvp), bvq.a("EventHandler#postDelayed"));
        }
    }

    public final void a(Runnable runnable, bvp bvp) {
        bwl bwl = this.c;
        int i = bwl.b;
        iva.a((Object) runnable);
        iva.a((Object) bvp);
        clj D = cbi.D();
        bwl.a(D, bvp);
        Message message = new Message();
        message.obj = new bwm(runnable, bvp, bvp.e);
        bwn bwn = bwl.a;
        if (bwn.e) {
            bwn.g.lock();
            try {
                if (!bwl.a.f) {
                    bwl.sendMessage(message);
                }
            } finally {
                bwl.a.g.unlock();
            }
        } else if (!bwl.sendMessage(message)) {
            ((anih) ((anih) bxk.a.c()).a("bwl", "a", 362, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[EventHandler] Failed to send message %s", (Object) bvp.a);
            if (D != null) {
                String valueOf = String.valueOf(bvp.a);
                D.c(bvq.a(valueOf.length() == 0 ? new String("Failed-") : "Failed-".concat(valueOf)));
            }
            bwl.a(bvp);
        } else {
            D.a(bvp);
        }
    }
}
