package defpackage;

/* renamed from: bvs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class bvs {
    private final String a;
    private bsz b;

    public bvs(bsz bsz) {
        this.a = bsz.b;
        this.b = bsz;
    }

    public final bsz a() {
        return g();
    }

    public final bsz g() {
        if (this.b == null) {
            cbi.y();
            this.b = bsx.b(this.a);
        }
        return this.b;
    }

    public bvs(String str) {
        iva.c(str);
        this.a = str;
        this.b = null;
    }
}
