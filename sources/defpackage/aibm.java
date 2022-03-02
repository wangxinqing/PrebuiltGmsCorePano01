package defpackage;

/* renamed from: aibm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aibm {
    public final Object a;
    public final Object b;
    public final Object c;

    public aibm(Object obj, Object obj2, Object obj3) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    public static aibm a(Object obj, Object obj2, Object obj3) {
        return new aibm(obj, obj2, obj3);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aibm) {
            aibm aibm = (aibm) obj;
            return a(this.a, aibm.a) && a(this.b, aibm.b) && a(this.c, aibm.c);
        }
    }

    public final int hashCode() {
        Object obj = this.a;
        int i = 0;
        int hashCode = ((obj != null ? obj.hashCode() : 0) + 527) * 31;
        Object obj2 = this.b;
        int hashCode2 = (hashCode + (obj2 != null ? obj2.hashCode() : 0)) * 31;
        Object obj3 = this.c;
        if (obj3 != null) {
            i = obj3.hashCode();
        }
        return hashCode2 + i;
    }

    private static boolean a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }
}
