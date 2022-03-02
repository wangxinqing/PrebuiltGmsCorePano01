package defpackage;

/* renamed from: ycz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ycz {
    public static ycz c;
    public final String a;
    public final nz b = new nz();

    public ycz(String str) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 2);
        sb.append(',');
        sb.append(str);
        sb.append(',');
        this.a = sb.toString();
    }
}
