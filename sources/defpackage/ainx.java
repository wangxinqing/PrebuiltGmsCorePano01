package defpackage;

/* renamed from: ainx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ainx {
    ains a;
    ainx b;
    boolean c;

    public final String toString() {
        String g = this.a.g();
        boolean z = this.c;
        StringBuilder sb = new StringBuilder(String.valueOf(g).length() + 31);
        sb.append("state=");
        sb.append(g);
        sb.append(",active=");
        sb.append(z);
        sb.append(",parent=null");
        return sb.toString();
    }
}
