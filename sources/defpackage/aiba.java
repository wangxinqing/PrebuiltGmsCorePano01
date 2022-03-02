package defpackage;

/* renamed from: aiba  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aiba {
    public final Object a;
    public final Object b;

    public aiba(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public static aiba a(Object obj, Object obj2) {
        return new aiba(obj, obj2);
    }

    public final boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (obj instanceof aiba) {
            try {
                aiba aiba = (aiba) obj;
                Object obj2 = this.a;
                if (obj2 != null) {
                    z = obj2.equals(aiba.a);
                }
                Object obj3 = this.b;
                return obj3 != null ? obj3.equals(aiba.b) & z : z;
            } catch (ClassCastException e) {
            }
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.a;
        int i = 17;
        if (obj != null) {
            i = (obj.hashCode() + 31) * 17;
        }
        Object obj2 = this.b;
        return obj2 != null ? i * (obj2.hashCode() + 31) : i;
    }
}
