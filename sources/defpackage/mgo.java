package defpackage;

/* renamed from: mgo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class mgo implements Comparable {
    final long a;
    final String b;
    final int c;

    public mgo(long j, String str, int i) {
        this.a = j;
        this.b = str;
        this.c = i;
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.c - ((mgo) obj).c;
    }
}
