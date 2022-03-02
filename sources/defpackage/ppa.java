package defpackage;

/* renamed from: ppa  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ppa implements Comparable {
    public String a;
    public String b;
    public String c;

    /* renamed from: a */
    public final int compareTo(ppa ppa) {
        int compareTo = this.a.compareTo(ppa.a);
        if (compareTo == 0) {
            String str = this.b;
            String str2 = ppa.b;
            if (str != str2) {
                compareTo = str != null ? str2 != null ? str.compareTo(str2) : 1 : -1;
            } else {
                compareTo = 0;
            }
            if (compareTo == 0) {
                return a().compareTo(ppa.a());
            }
        }
        return compareTo;
    }

    public final String a() {
        String str = this.c;
        return str == null ? "none" : str;
    }
}
