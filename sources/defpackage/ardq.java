package defpackage;

import java.util.Comparator;

/* renamed from: ardq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ardq {
    public static final Comparator c = new ardp();
    public final int a;
    public final int b;

    public ardq(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ardq) {
            ardq ardq = (ardq) obj;
            if (this.a == ardq.a && this.b == ardq.b) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }
}
