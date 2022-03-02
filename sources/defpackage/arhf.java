package defpackage;

import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

/* renamed from: arhf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class arhf implements argv {
    protected int b = -1;
    protected int c;
    protected int d;
    final /* synthetic */ arhg e;

    protected arhf(arhg arhg) {
        this.e = arhg;
        arhl arhl = this.e.c;
        this.c = arhl.h;
        this.d = arhl.d;
    }

    public final void c() {
        if (this.e.c.d != this.d) {
            throw new ConcurrentModificationException();
        } else if (hasNext()) {
            int i = this.c;
            this.b = i;
            arhl arhl = this.e.c;
            if (i == arhl.i) {
                this.c = -1;
            } else {
                this.c = arhl.d(i);
            }
        } else {
            throw new NoSuchElementException();
        }
    }

    public final int d() {
        e();
        return this.b;
    }

    /* access modifiers changed from: protected */
    public final void e() {
        if (this.e.c.d != this.d) {
            throw new ConcurrentModificationException();
        } else if (this.b == -1) {
            throw new IllegalStateException();
        }
    }

    public final boolean hasNext() {
        return !this.e.c.f() && this.c != -1;
    }

    public final Object next() {
        c();
        return b();
    }

    public final void remove() {
        e();
        int i = this.e.c.i(this.b);
        this.b = i;
        if (this.c != -1) {
            this.c = this.e.c.d(i);
        }
        this.e.c.a(this.b, false);
        this.e.d.d(this.b);
        this.b = -1;
        this.d = this.e.c.d;
    }
}
