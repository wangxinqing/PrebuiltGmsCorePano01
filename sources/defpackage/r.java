package defpackage;

import java.lang.reflect.Method;

/* renamed from: r  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class r {
    final int a;
    final Method b;

    public r(int i, Method method) {
        this.a = i;
        this.b = method;
        method.setAccessible(true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof r) {
            r rVar = (r) obj;
            return this.a == rVar.a && this.b.getName().equals(rVar.b.getName());
        }
    }

    public final int hashCode() {
        return (this.a * 31) + this.b.getName().hashCode();
    }
}
