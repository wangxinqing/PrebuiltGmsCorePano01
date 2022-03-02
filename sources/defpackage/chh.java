package defpackage;

import java.util.List;

/* renamed from: chh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class chh implements Comparable {
    public final long a;
    public final long b;
    public final List c;

    public chh(long j) {
        this.a = j;
        this.b = j;
        this.c = null;
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        long j = this.a;
        long j2 = ((chh) obj).a;
        if (j >= j2) {
            return j == j2 ? 0 : 1;
        }
        return -1;
    }

    public chh(long j, long j2, List list) {
        this.a = j;
        this.b = j2;
        this.c = list;
    }
}
