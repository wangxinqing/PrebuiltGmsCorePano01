package defpackage;

/* renamed from: bke  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class bke {
    public final int a;
    public final String b;

    public bke(int i) {
        this(i, (String) null);
    }

    public final String toString() {
        int i = this.a;
        String str = this.b;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 14);
        sb.append("[");
        sb.append(i);
        sb.append("] ");
        sb.append(str);
        return sb.toString();
    }

    public bke(int i, String str) {
        this.a = i;
        this.b = str;
    }
}
