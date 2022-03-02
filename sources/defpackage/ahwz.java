package defpackage;

/* renamed from: ahwz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ahwz implements Comparable {
    final long a;
    final long b;
    final int c;
    final Integer d;

    public ahwz(long j, long j2, int i, Integer num) {
        this.a = j;
        this.b = j2;
        this.c = i;
        this.d = num;
    }

    /* access modifiers changed from: package-private */
    public final aqek a() {
        aqek aqek = new aqek(ajck.cb);
        aqek.b(1, this.a);
        aqek.b(2, this.b);
        aqek.g(4, this.c);
        Integer num = this.d;
        if (num != null) {
            aqek.g(5, num.intValue());
        }
        return aqek;
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return (this.a > ((ahwz) obj).a ? 1 : (this.a == ((ahwz) obj).a ? 0 : -1));
    }
}
