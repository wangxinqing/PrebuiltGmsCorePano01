package defpackage;

/* renamed from: wwj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class wwj {
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;
    public final boolean e;
    public final wwa f;
    public final int g;
    private final String[] h;

    public wwj(String str, String str2, String str3, int i, String[] strArr, boolean z, boolean z2, wwa wwa) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.h = strArr;
        this.d = z;
        this.e = z2;
        this.f = wwa;
        this.g = i;
    }

    public final String a(int i) {
        String[] strArr = this.h;
        if (i < strArr.length) {
            return strArr[i];
        }
        return null;
    }
}
