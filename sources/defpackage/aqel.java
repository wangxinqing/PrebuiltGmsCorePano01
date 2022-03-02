package defpackage;

/* renamed from: aqel  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aqel {
    public final int a;
    public final Object b;

    public aqel(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof aqel)) {
            return false;
        }
        aqel aqel = (aqel) obj;
        if (this.a == aqel.a) {
            Object obj2 = this.b;
            Object obj3 = aqel.b;
            if (obj2 == obj3) {
                return true;
            }
            if (obj2 == null || !obj2.equals(obj3)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        int i = this.a;
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 33);
        sb.append("TypeInfo{type=");
        sb.append(i);
        sb.append(", data=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
