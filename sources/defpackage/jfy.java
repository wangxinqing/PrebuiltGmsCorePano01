package defpackage;

/* renamed from: jfy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class jfy implements Runnable {
    final /* synthetic */ jfz a;
    private Runnable b;
    private Thread c = null;
    private amko d;

    public jfy(jfz jfz, Runnable runnable, amko amko) {
        this.a = jfz;
        this.b = runnable;
        this.d = amko;
    }

    private final Runnable a(Runnable runnable) {
        if (runnable instanceof jey) {
            jey jey = (jey) runnable;
            this.d = jez.a(jey.a(), this.d);
            return jey.b();
        }
        a();
        return runnable;
    }

    private final void b() {
        this.a.d.lock();
        try {
            this.a.b.remove(this.c);
            Runnable runnable = (Runnable) this.a.c.poll();
            if (runnable != null) {
                jfz jfz = this.a;
                jfz.a.execute(new jfy(jfz, runnable, (amko) null));
            } else {
                jfz jfz2 = this.a;
                int i = jfz2.f - 1;
                jfz2.f = i;
                if (i == 0) {
                    jfz2.e.signalAll();
                }
            }
        } finally {
            this.a.d.unlock();
        }
    }

    public final void run() {
        amko amko = this.d;
        if (amko == null) {
            this.b = a(this.b);
        } else {
            amlv.a(amko, amlw.a);
        }
        try {
            this.c = Thread.currentThread();
            this.a.d.lock();
            jfz jfz = this.a;
            if (jfz.i) {
                this.b = null;
            }
            jfz.b.add(this.c);
            jfz jfz2 = this.a;
            jfz2.h = Math.max(jfz2.h, jfz2.b.size());
            this.a.d.unlock();
            Runnable runnable = this.b;
            if (runnable != null) {
                b(runnable);
                this.b = null;
            }
            while (true) {
                Runnable runnable2 = (Runnable) this.a.c.poll();
                if (runnable2 != null) {
                    b(a(runnable2));
                } else {
                    b();
                    a();
                    return;
                }
            }
        } catch (Throwable th) {
            a();
            throw th;
        }
    }

    private final void a() {
        jez.a(this.d);
        this.d = null;
    }

    private final void b(Runnable runnable) {
        if (Thread.interrupted()) {
            this.a.d.lock();
            try {
                jfz jfz = this.a;
                boolean z = jfz.i;
                jfz.d.unlock();
                if (z) {
                    Thread.currentThread().interrupt();
                }
            } catch (Throwable th) {
                this.a.d.unlock();
                throw th;
            }
        }
        try {
            this.a.beforeExecute(this.c, runnable);
            Throwable th2 = null;
            try {
                runnable.run();
                this.a.afterExecute(runnable, (Throwable) null);
                return;
            } catch (Throwable th3) {
                Throwable th4 = th;
                th = th3;
                th2 = th4;
            }
            this.a.afterExecute(runnable, th2);
            throw th;
        } finally {
            this.a.g.incrementAndGet();
        }
    }
}
