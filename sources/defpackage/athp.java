package defpackage;

/* renamed from: athp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class athp implements athu {
    private Exception a;
    private aqeo b;
    private int c;

    protected athp() {
        l();
    }

    private final synchronized void a(int i) {
        this.c = i;
    }

    private final synchronized void b(Exception exc) {
        this.a = exc;
    }

    public final synchronized void a(aqeo aqeo) {
        this.b = aqeo;
    }

    /* access modifiers changed from: protected */
    public final synchronized void bp() {
        if (this.c != 2) {
            throw new IllegalStateException("state != STATE_COMPLETED");
        }
    }

    public final synchronized int bq() {
        return this.c;
    }

    /* access modifiers changed from: protected */
    public final synchronized void br() {
        a(1);
    }

    /* access modifiers changed from: protected */
    public final synchronized void bs() {
        a(2);
        m();
    }

    /* access modifiers changed from: protected */
    public final synchronized void bt() {
        a(4);
    }

    public final synchronized Exception c() {
        return this.a;
    }

    public final synchronized boolean d() {
        return this.a != null;
    }

    public final synchronized boolean f() {
        return this.c == 1;
    }

    public final synchronized boolean g() {
        int i;
        i = this.c;
        return i == 2 || i == 3;
    }

    /* access modifiers changed from: protected */
    public synchronized void i() {
        m();
    }

    public final synchronized void l() {
        this.c = 0;
    }

    /* access modifiers changed from: protected */
    public final synchronized void m() {
        aqeo aqeo = this.b;
        if (aqeo != null) {
            aqeo.a.a(aqeo);
        }
    }

    public synchronized void b() {
        bt();
    }

    /* access modifiers changed from: protected */
    public final synchronized void a(Exception exc) {
        a(3);
        b(exc);
        m();
    }
}
