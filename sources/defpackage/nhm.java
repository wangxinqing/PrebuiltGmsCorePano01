package defpackage;

/* renamed from: nhm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class nhm {
    public final nfv a;

    public nhm(nfv nfv) {
        iva.a((Object) nfv, (Object) "directory");
        this.a = nfv;
    }

    public final nfz a(String str) {
        nfv nfv = this.a;
        int size = nfv.a.size();
        int i = 0;
        while (i < size) {
            int i2 = ((size - i) / 2) + i;
            nfz nfz = (nfz) nfv.a.get(i2);
            int compareTo = str.compareTo(nfz.b);
            if (compareTo > 0) {
                i = i2 + 1;
            } else if (compareTo >= 0) {
                return nfz;
            } else {
                size = i2;
            }
        }
        return null;
    }

    public final boolean a() {
        nfv nfv = this.a;
        return nfv.b == 0 && nfv.a.size() == 0;
    }
}
