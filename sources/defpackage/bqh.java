package defpackage;

/* renamed from: bqh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class bqh implements Comparable {
    private final String a;
    private final long b;

    public bqh(String str, long j) {
        this.a = str;
        this.b = j;
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        bqh bqh = (bqh) obj;
        return amya.b.a((Comparable) this.a, (Comparable) bqh.a).a(this.b, bqh.b).a();
    }
}
