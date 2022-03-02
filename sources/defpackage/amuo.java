package defpackage;

import java.io.Serializable;

/* renamed from: amuo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class amuo implements Serializable, amth {
    private static final long serialVersionUID = 1;
    public final amvo a;

    public amuo(amvo amvo) {
        this.a = amvo;
    }

    public final void a(Object obj, Object obj2) {
        this.a.put(obj, obj2);
    }

    public final Object b(Object obj) {
        amvo amvo = this.a;
        amrl.a(obj);
        int a2 = amvo.a(obj);
        return amvo.a(a2).a(obj, a2);
    }

    public final void c(Object obj) {
        amrl.a(obj);
        this.a.remove(obj);
    }

    public final long d() {
        return this.a.j();
    }

    /* access modifiers changed from: package-private */
    public Object writeReplace() {
        return new amup(this.a);
    }
}
