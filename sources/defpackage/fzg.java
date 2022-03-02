package defpackage;

import java.lang.ref.Reference;

/* renamed from: fzg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class fzg {
    private final Object a = new Object();
    private volatile Reference b = null;

    /* access modifiers changed from: protected */
    public abstract Object a();

    /* access modifiers changed from: protected */
    public abstract Reference a(Object obj);

    public final Object b() {
        Object obj;
        Object obj2 = null;
        if (this.b != null) {
            obj = this.b.get();
        } else {
            obj = null;
        }
        if (obj != null) {
            return obj;
        }
        synchronized (this.a) {
            if (this.b != null) {
                obj2 = this.b.get();
            }
            if (obj2 == null) {
                obj2 = a();
                this.b = a(obj2);
            }
        }
        return obj2;
    }
}
