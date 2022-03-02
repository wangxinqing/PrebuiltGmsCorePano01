package defpackage;

import java.io.Serializable;

/* renamed from: anlz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class anlz extends ankv implements Serializable {
    static final anli a = new anlz(0);
    private static final long serialVersionUID = 0;
    private final int b;

    static {
        new anlz(anln.a);
    }

    public anlz(int i) {
        this.b = i;
    }

    public final anlj a() {
        return new anly(this.b);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof anlz) && this.b == ((anlz) obj).b;
    }

    public final int hashCode() {
        return getClass().hashCode() ^ this.b;
    }

    public final String toString() {
        int i = this.b;
        StringBuilder sb = new StringBuilder(32);
        sb.append("Hashing.murmur3_128(");
        sb.append(i);
        sb.append(")");
        return sb.toString();
    }
}
