package defpackage;

/* renamed from: vvl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class vvl {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;

    public vvl(String str, String str2, String str3, String str4, String str5, String str6) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
    }

    public final String toString() {
        return String.format("ConsentText<title=%s, description=%s, footer=%s, learnMoreDescription=%s, positiveButtonText=%s, negativeButtonText=%s>", new Object[]{this.a, this.b, this.c, this.d, this.e, this.f});
    }
}
