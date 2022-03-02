package defpackage;

/* renamed from: yex  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class yex implements igp {
    private final String a;
    private final String b;

    public yex(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final void a(Object obj, Object obj2) {
        String str = this.a;
        String str2 = this.b;
        ygi ygi = new ygi((acwd) obj2);
        StringBuilder sb = new StringBuilder(str2.length() + 9 + str.length());
        sb.append("CURRENT:");
        sb.append(str2);
        sb.append(":");
        sb.append(str);
        ((ygm) ((ygn) obj).x()).b(ygi, sb.toString());
    }
}
