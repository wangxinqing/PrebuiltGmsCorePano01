package defpackage;

/* renamed from: agji  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class agji {
    public final String a;
    public final int b;
    final /* synthetic */ agjj c;

    public agji(agjj agjj) {
        this.c = agjj;
        this.a = "";
        this.b = 0;
    }

    public agji(agjj agjj, agji agji, String str) {
        this.c = agjj;
        if (agji.b != 0) {
            String str2 = agji.a;
            StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 1 + String.valueOf(str).length());
            sb.append(str2);
            sb.append('/');
            sb.append(str);
            str = sb.toString();
        }
        this.a = str;
        this.b = agji.b + 1;
    }
}
