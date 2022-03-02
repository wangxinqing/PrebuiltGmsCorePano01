package defpackage;

import java.io.Serializable;

/* renamed from: anaw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class anaw implements Serializable {
    private static final long serialVersionUID = 0;
    final Object[] a;

    public anaw(Object[] objArr) {
        this.a = objArr;
    }

    /* access modifiers changed from: package-private */
    public Object readResolve() {
        return anax.a(this.a);
    }
}
