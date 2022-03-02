package defpackage;

import android.content.SyncResult;
import android.os.SystemClock;
import java.util.HashSet;
import java.util.Set;

/* renamed from: xvp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class xvp {
    public Exception a;
    public final yaz b;
    private final xwr c;
    private final Object d = new Object();
    private final Set e = new HashSet();

    public xvp(xwr xwr, yaz yaz) {
        this.c = xwr;
        this.b = yaz;
        a(Thread.currentThread());
    }

    private final boolean b() {
        return this.a != null;
    }

    public static final void c(Thread thread) {
        if (thread != null) {
            thread.getId();
        }
    }

    public final void a() {
        synchronized (this.d) {
            if (!b()) {
                xwr xwr = this.c;
                if (xwr != null) {
                    SyncResult syncResult = ((ybh) this.b).a;
                    synchronized (xwr.a) {
                        if (xwr.b != null) {
                            long elapsedRealtime = SystemClock.elapsedRealtime();
                            if (elapsedRealtime - xwr.e > 2000) {
                                xwr.a(xwr.b, "still-working", syncResult);
                                xwr.e = elapsedRealtime;
                            }
                        }
                    }
                }
            } else {
                throw new xye(this.a);
            }
        }
    }

    public final void b(Thread thread) {
        synchronized (this.d) {
            if (thread != null) {
                if (this.e.remove(thread)) {
                    thread.getId();
                    this.e.size();
                }
            }
        }
    }

    public final void a(Exception exc) {
        iva.a((Object) exc);
        synchronized (this.d) {
            if (!b()) {
                this.a = exc;
                if (this.e.size() > 0) {
                    for (Thread interrupt : this.e) {
                        interrupt.interrupt();
                    }
                    this.e.size();
                    this.e.clear();
                }
            }
        }
    }

    public final void a(Thread thread) {
        synchronized (this.d) {
            if (!b()) {
                if (thread != null) {
                    if (!this.e.contains(thread)) {
                        this.e.add(thread);
                        thread.getId();
                        this.e.size();
                    }
                }
            }
        }
    }
}
