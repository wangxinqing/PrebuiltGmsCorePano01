package defpackage;

/* renamed from: ym  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ym {
    public int a;
    public int b;
    Object c;
    public int d;

    public ym(int i, int i2, int i3, Object obj) {
        this.a = i;
        this.b = i2;
        this.d = i3;
        this.c = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ym) {
            ym ymVar = (ym) obj;
            int i = this.a;
            if (i == ymVar.a) {
                if (i == 8 && Math.abs(this.d - this.b) == 1 && this.d == ymVar.b && this.b == ymVar.d) {
                    return true;
                }
                if (this.d == ymVar.d && this.b == ymVar.b) {
                    Object obj2 = this.c;
                    if (obj2 != null) {
                        if (!obj2.equals(ymVar.c)) {
                            return false;
                        }
                    } else if (ymVar.c != null) {
                        return false;
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.a * 31) + this.b) * 31) + this.d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[");
        int i = this.a;
        sb.append(i != 1 ? i != 2 ? i != 4 ? i != 8 ? "??" : "mv" : "up" : "rm" : "add");
        sb.append(",s:");
        sb.append(this.b);
        sb.append("c:");
        sb.append(this.d);
        sb.append(",p:");
        sb.append(this.c);
        sb.append("]");
        return sb.toString();
    }
}
