package defpackage;

/* renamed from: anjd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class anjd {
    public final ankm a;
    public final String b;

    public anjd(ankm ankm, String str) {
        ankq.a(ankm, "parser");
        this.a = ankm;
        ankq.a(str, "message");
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof anjd) {
            anjd anjd = (anjd) obj;
            return this.a.equals(anjd.a) && this.b.equals(anjd.b);
        }
    }

    public final int hashCode() {
        return this.a.hashCode() ^ this.b.hashCode();
    }
}
