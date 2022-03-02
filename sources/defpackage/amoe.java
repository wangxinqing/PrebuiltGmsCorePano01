package defpackage;

import java.io.IOException;

/* renamed from: amoe  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class amoe implements amoq, amof {
    protected final amog a;
    public final amop b;
    public final amok c = new amok();
    public boolean d = false;
    public int e;
    private final amod f = new amod(this);
    private final amol g = new amol();
    private final amok h = new amok();
    private boolean i = false;

    public amoe(amog amog, amop amop) {
        this.a = amog;
        this.b = amop;
        amog.a(this);
    }

    public final synchronized void a() {
        if (!this.i) {
            this.i = true;
            c(amoj.a(2, 0)).a(new amoc(this));
        }
    }

    /* access modifiers changed from: protected */
    public abstract void a(amoj amoj);

    public final synchronized amoo b(byte[] bArr) {
        return this.f.a(bArr);
    }

    /* access modifiers changed from: protected */
    public final synchronized amoo c(amoj amoj) {
        return this.f.a(amoj);
    }

    public final boolean c() {
        return this.d;
    }

    /* access modifiers changed from: protected */
    public boolean d() {
        return this.d;
    }

    public final void e() {
        b();
    }

    /* access modifiers changed from: protected */
    public synchronized void b() {
        boolean d2 = d();
        this.d = false;
        if (d2) {
            this.b.b();
        }
        this.f.b();
        this.g.a();
        this.c.b();
        this.h.b();
    }

    public final synchronized void a(int i2) {
        this.e = i2;
        boolean z = this.d;
        this.d = true;
        this.i = false;
        if (!z) {
            this.b.a();
        }
        this.f.a();
    }

    /* access modifiers changed from: protected */
    public final synchronized void b(amoj amoj) {
        try {
            byte[] a2 = this.g.a(amoj);
            if (a2 != null) {
                this.b.a(a2);
            }
        } catch (amom e2) {
            a((IOException) e2);
        }
    }

    public final synchronized void a(amon amon) {
        this.f.a(amon);
        if (!amon.b()) {
            a(amon.a);
        }
    }

    public final synchronized void a(IOException iOException) {
        a();
        this.b.a(iOException);
    }

    public final synchronized void a(byte[] bArr) {
        if (bArr != null) {
            if (bArr.length != 0) {
                amoj a2 = amoj.a(bArr);
                int c2 = a2.c();
                int a3 = this.h.a();
                boolean z = true;
                if (c2 != a3) {
                    this.b.a((IOException) new amom(String.format("expected remote packet counter %s but found %s for packet %s", new Object[]{Integer.valueOf(a3), Integer.valueOf(c2), a2})));
                    z = false;
                }
                if ((a2.a[0] & Byte.MIN_VALUE) != 0) {
                    if (!z) {
                        this.h.a(a2.c());
                    }
                    a(a2);
                    return;
                } else if (!z) {
                    a();
                    return;
                } else {
                    b(a2);
                    return;
                }
            }
        }
        a(new IOException("received empty packet"));
    }
}
