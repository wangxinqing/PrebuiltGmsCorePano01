package defpackage;

/* renamed from: cbm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class cbm extends bum {
    private final String a;
    private final String b;
    private final Object[] c;

    public cbm(String str, String str2, Object... objArr) {
        cbi.i().b();
        this.a = str;
        this.b = str2;
        this.c = objArr;
    }

    public void a(int i) {
        bxk.a(this.a, "Failed %s: network status=%s", String.format(this.b, this.c), Integer.toString(i));
    }

    public abstract void a(Object obj);
}
