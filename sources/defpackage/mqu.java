package defpackage;

/* renamed from: mqu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class mqu implements Comparable {
    final String a;
    final String b;

    public mqu(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return toString().compareTo(((mqu) obj).toString());
    }

    public final String toString() {
        String a2 = jlh.a(this.a);
        String a3 = jlh.a(this.b);
        StringBuilder sb = new StringBuilder(a2.length() + 1 + a3.length());
        sb.append(a2);
        sb.append(":");
        sb.append(a3);
        return sb.toString();
    }
}
