package defpackage;

/* renamed from: alwd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class alwd {
    public final void a(alze alze, Object obj) {
        alze.c();
        int b = alze.b();
        if (b == 0) {
            b(alze, obj);
            alze.d();
            return;
        }
        StringBuilder sb = new StringBuilder(33);
        sb.append("Unexpected type code: ");
        sb.append(b);
        throw new IllegalStateException(sb.toString());
    }

    /* access modifiers changed from: protected */
    public abstract void a(Object obj, Object obj2);

    /* access modifiers changed from: package-private */
    public final void b(alze alze, Object obj) {
        while (alze.a) {
            a(obj, alve.a(alze));
        }
    }
}
