package defpackage;

/* renamed from: jex  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class jex {
    public final nih a;
    public final String b;

    public jex(nih nih, String str) {
        this.a = nih;
        nie nie = nih.c;
        String str2 = (nie == null ? nie.e : nie).c;
        StringBuilder sb = new StringBuilder(str2.length() + str.length() + 1);
        sb.append(str2);
        sb.append('_');
        sb.append(str);
        this.b = sb.toString();
    }
}
