package defpackage;

/* renamed from: ccj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ccj {
    public final cch a;
    public final String b;
    public final int[] c;
    public final int[] d;
    public final boolean e;

    public ccj(cch cch, String str, int[] iArr, int[] iArr2) {
        this(cch, str, iArr, iArr2, false);
    }

    public int a(int i) {
        return !jhx.a(this.c, i) ? 1 : 0;
    }

    public ccj(cch cch, String str, int[] iArr, int[] iArr2, boolean z) {
        iva.a((Object) cch);
        this.a = cch;
        iva.c(str);
        this.b = str;
        iva.a((Object) iArr);
        iva.b(iArr.length > 0);
        this.c = iArr;
        this.d = iArr2;
        this.e = z;
    }
}
