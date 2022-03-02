package defpackage;

import java.util.NoSuchElementException;

/* renamed from: amvu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class amvu extends anhj {
    private Object a;
    private int b = 2;

    protected amvu() {
    }

    /* access modifiers changed from: protected */
    public abstract Object a();

    /* access modifiers changed from: protected */
    public final Object d() {
        this.b = 3;
        return null;
    }

    public final boolean hasNext() {
        boolean z;
        if (this.b != 4) {
            z = true;
        } else {
            z = false;
        }
        amrl.b(z);
        int i = this.b;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        } else if (i2 == 0) {
            return true;
        } else {
            if (i2 != 2) {
                this.b = 4;
                this.a = a();
                if (this.b != 3) {
                    this.b = 1;
                    return true;
                }
            }
            return false;
        }
    }

    public final Object next() {
        if (hasNext()) {
            this.b = 2;
            Object obj = this.a;
            this.a = null;
            return obj;
        }
        throw new NoSuchElementException();
    }
}
