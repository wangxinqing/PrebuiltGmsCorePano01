package defpackage;

/* renamed from: eo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class eo implements Comparable {
    final int a;
    final int b;
    final String c;
    final String d;

    public eo(int i, int i2, String str, String str2) {
        this.a = i;
        this.b = i2;
        this.c = str;
        this.d = str2;
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        eo eoVar = (eo) obj;
        int i = this.a - eoVar.a;
        return i == 0 ? this.b - eoVar.b : i;
    }
}
