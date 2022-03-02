package defpackage;

/* renamed from: imt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class imt {
    public final String a;
    public final long b;
    public final long c;

    public imt(String str, long j) {
        this(str, j, -1);
    }

    /* access modifiers changed from: protected */
    public abstract boolean a(inb inb);

    /* access modifiers changed from: protected */
    public abstract inb b(inb inb);

    /* access modifiers changed from: package-private */
    public final inb c(inb inb) {
        try {
            return b(inb);
        } catch (RuntimeException e) {
            ims.a(e, inb, this.a);
            ina d = inb.d();
            d.a(this, 5);
            return d.a();
        }
    }

    public imt(String str, long j, long j2) {
        iva.b(j >= 0, "secondsFixIsValid must be >= 0");
        iva.c(str);
        this.a = str;
        this.b = j;
        this.c = j2;
    }
}
