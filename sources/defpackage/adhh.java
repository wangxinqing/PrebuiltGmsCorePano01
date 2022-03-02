package defpackage;

/* renamed from: adhh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class adhh {
    final String a;
    final String b;
    final String c;

    public adhh(String str) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 28);
        sb.append(str);
        sb.append(":UdcConsistencyTokenPrefsHas");
        this.a = sb.toString();
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 30);
        sb2.append(str);
        sb2.append(":UdcConsistencyTokenPrefsToken");
        this.b = sb2.toString();
        StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 28);
        sb3.append(str);
        sb3.append(":UdcConsistencyTokenPrefsAge");
        this.c = sb3.toString();
    }
}
