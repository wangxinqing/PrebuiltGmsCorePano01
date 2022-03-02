package defpackage;

/* renamed from: ozm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ozm {
    public final int a;
    public final oqy b;

    public ozm(int i, oqy oqy) {
        this.a = i;
        this.b = oqy;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof ozm) && this.a == ((ozm) obj).a;
        }
        return true;
    }

    public final int hashCode() {
        return this.a;
    }
}
