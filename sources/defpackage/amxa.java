package defpackage;

import java.util.NoSuchElementException;

/* renamed from: amxa  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class amxa extends anhj {
    private Object a;

    protected amxa(Object obj) {
        this.a = obj;
    }

    /* access modifiers changed from: protected */
    public abstract Object a(Object obj);

    public final boolean hasNext() {
        return this.a != null;
    }

    public final Object next() {
        if (hasNext()) {
            try {
                Object obj = this.a;
                this.a = a(obj);
                return obj;
            } catch (Throwable th) {
                this.a = a(this.a);
                throw th;
            }
        } else {
            throw new NoSuchElementException();
        }
    }
}
