package defpackage;

/* renamed from: oq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class oq {
    public final Object a;
    public final Object b;

    public oq(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public static oq a(Object obj, Object obj2) {
        return new oq(obj, obj2);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof oq) {
            oq oqVar = (oq) obj;
            if (!op.a(oqVar.a, this.a) || !op.a(oqVar.b, this.b)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.a;
        int i = 0;
        int hashCode = obj != null ? obj.hashCode() : 0;
        Object obj2 = this.b;
        if (obj2 != null) {
            i = obj2.hashCode();
        }
        return hashCode ^ i;
    }

    public final String toString() {
        return "Pair{" + String.valueOf(this.a) + " " + String.valueOf(this.b) + "}";
    }
}
