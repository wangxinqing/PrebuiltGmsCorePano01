package defpackage;

/* renamed from: ldp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ldp implements ldf {
    private final long a;
    private final int b;
    private final long c;
    private final String d;

    public ldp(String str, long j, int i, long j2) {
        boolean z = true;
        iva.b(j >= 0, "Duration must not be negative");
        iva.b(i >= 0, "Threshold must not be negative");
        iva.b(j2 < 0 ? false : z, "Window size must not be negative");
        iva.a((Object) str);
        this.d = str;
        this.a = j;
        this.b = i;
        this.c = j2;
    }

    public final String a() {
        return this.d;
    }

    public final boolean a(long j) {
        return j < this.a;
    }

    public boolean a(lde lde, long j) {
        long a2 = j - ((ldj) lde).b.a(this.b - 1);
        return a2 >= 0 && a2 <= this.c;
    }
}
