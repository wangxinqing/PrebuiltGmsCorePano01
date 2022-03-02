package defpackage;

/* renamed from: qeu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class qeu {
    private String a;
    private int b;
    private byte[] c;

    /* access modifiers changed from: package-private */
    public final synchronized byte[] a(String str, int i) {
        if (i == this.b) {
            if (str.equals(this.a)) {
                return this.c;
            }
        }
        this.a = str;
        this.b = i;
        aucd o = allv.d.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        allv allv = (allv) o.b;
        str.getClass();
        int i2 = allv.a | 1;
        allv.a = i2;
        allv.b = str;
        allv.a = i2 | 2;
        allv.c = i;
        byte[] k = ((allv) o.i()).k();
        this.c = k;
        return k;
    }
}
