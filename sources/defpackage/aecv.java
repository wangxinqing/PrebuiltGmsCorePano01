package defpackage;

/* renamed from: aecv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aecv {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;

    public aecv(int i, int i2, int i3, int i4, int i5) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
    }

    public final int a() {
        if (this.a == 2) {
            return (this.d + this.c) - this.e;
        }
        throw new NoSuchMethodException("Can't call this method of non length delimited field");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            aecv aecv = (aecv) obj;
            return this.a == aecv.a && this.b == aecv.b && this.c == aecv.c && this.d == aecv.d && this.e == aecv.e;
        }
    }

    public final int hashCode() {
        return (((((((this.a * 31) + this.b) * 31) + this.c) * 31) + this.d) * 31) + this.e;
    }

    public final String toString() {
        int i = this.a;
        int i2 = this.b;
        int i3 = this.c;
        int i4 = this.d;
        int i5 = this.e;
        StringBuilder sb = new StringBuilder(117);
        sb.append("ProtoField{wireType=");
        sb.append(i);
        sb.append(", id=");
        sb.append(i2);
        sb.append(", size=");
        sb.append(i3);
        sb.append(", beginningIndex=");
        sb.append(i4);
        sb.append(", childSize=");
        sb.append(i5);
        sb.append('}');
        return sb.toString();
    }
}
