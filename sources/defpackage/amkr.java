package defpackage;

/* renamed from: amkr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class amkr implements Runnable, amky {
    private amkw a;
    private amkw b;
    private final boolean c = agzj.a();
    private boolean d;
    private boolean e;

    public amkr(amkw amkw) {
        this.a = amkw;
        this.b = amkw;
    }

    private final void a() {
        boolean z = true;
        this.d = true;
        amkw amkw = this.a;
        if (!this.c || this.e || !agzj.a()) {
            z = false;
        }
        amkw.a(z);
        this.a = null;
    }

    public final void close() {
        amkw amkw = this.b;
        this.b = null;
        try {
            if (!this.e) {
                if (!this.d) {
                    a();
                } else {
                    throw new IllegalStateException("Span was already closed!");
                }
            }
        } finally {
            amlv.a(amkw);
        }
    }

    public final void run() {
        if (!this.d && this.e) {
            a();
        } else {
            agzj.a(amkq.a);
        }
    }

    public final void a(aorr aorr) {
        if (this.d) {
            throw new IllegalStateException("Span was already closed. Did you attach it to a future after calling Tracer.endSpan()?");
        } else if (!this.e) {
            this.e = true;
            aorr.a(this, aoqm.a);
        } else {
            throw new IllegalStateException("Signal is already attached to future");
        }
    }
}
