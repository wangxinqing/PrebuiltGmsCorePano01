package defpackage;

import java.lang.ref.Reference;

/* renamed from: qcc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class qcc {
    private volatile Reference a = a((Object) null);
    private final amsv b;
    private final Object c;

    public qcc(amsv amsv) {
        this.b = amsv;
        this.c = new Object();
    }

    public final Object a() {
        Object obj;
        Object obj2 = this.a.get();
        if (obj2 != null) {
            return obj2;
        }
        synchronized (this.c) {
            obj = this.a.get();
            if (obj == null) {
                obj = this.b.a();
                this.a = a(obj);
            }
        }
        return obj;
    }

    /* access modifiers changed from: protected */
    public abstract Reference a(Object obj);
}
