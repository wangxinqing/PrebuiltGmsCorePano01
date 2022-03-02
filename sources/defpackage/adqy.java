package defpackage;

import java.lang.ref.Reference;

/* renamed from: adqy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class adqy {
    private Reference a = null;
    private final Object b = new Object();

    /* access modifiers changed from: protected */
    public abstract Object a();

    /* access modifiers changed from: protected */
    public abstract Reference a(Object obj);

    public final Object b() {
        Object obj;
        Reference reference = this.a;
        Object obj2 = null;
        if (reference != null) {
            obj = reference.get();
        } else {
            obj = null;
        }
        if (obj != null) {
            return obj;
        }
        synchronized (this.b) {
            Reference reference2 = this.a;
            if (reference2 != null) {
                obj2 = reference2.get();
            }
            if (obj2 == null) {
                obj2 = a();
                this.a = a(obj2);
            }
        }
        return obj2;
    }
}
