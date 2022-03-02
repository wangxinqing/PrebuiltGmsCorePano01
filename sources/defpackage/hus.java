package defpackage;

/* renamed from: hus  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class hus implements Comparable {
    public final String a;
    public final huk b;
    private final boolean c = false;

    public hus(String str, huk huk) {
        this.a = str;
        this.b = huk;
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        hus hus = (hus) obj;
        boolean z = hus.c;
        amrl.a(true);
        huk huk = this.b;
        if (huk == null) {
            return -1;
        }
        huk huk2 = hus.b;
        if (huk2 == null) {
            return 1;
        }
        return huk.compareTo(huk2);
    }
}
