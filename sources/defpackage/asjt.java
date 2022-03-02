package defpackage;

/* renamed from: asjt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class asjt {
    private final asjt[] a;
    public final String e;

    public asjt(String str, asjt... asjtArr) {
        this.e = str;
        this.a = asjtArr;
    }

    public asjt a() {
        asjt[] asjtArr = this.a;
        if (asjtArr == null) {
            return null;
        }
        for (asjt asjt : asjtArr) {
            if (!asjt.b()) {
                return asjt;
            }
        }
        return null;
    }

    public abstract boolean b();

    public abstract boolean c();

    public abstract long d();
}
