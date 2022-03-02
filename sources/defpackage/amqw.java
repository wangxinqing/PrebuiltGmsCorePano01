package defpackage;

/* renamed from: amqw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class amqw {
    protected amqw() {
    }

    /* access modifiers changed from: protected */
    public abstract int a(Object obj);

    /* access modifiers changed from: protected */
    public abstract boolean a(Object obj, Object obj2);

    public final int b(Object obj) {
        if (obj != null) {
            return a(obj);
        }
        return 0;
    }

    public final boolean b(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj == null || obj2 == null) {
            return false;
        }
        return a(obj, obj2);
    }
}
