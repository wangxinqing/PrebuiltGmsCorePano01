package defpackage;

/* renamed from: amif  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class amif {
    public amig a = amig.KIND_NOT_SET;
    public Object b = null;

    public final amih a() {
        amih amih = new amih(this);
        if (this.a == amig.MAP) {
            this.a = amig.KIND_NOT_SET;
            this.b = null;
        }
        if (this.a == amig.LIST) {
            this.a = amig.KIND_NOT_SET;
            this.b = null;
        }
        if (this.a == amig.STRING) {
            this.a = amig.KIND_NOT_SET;
            this.b = null;
        }
        if (this.a == amig.INDEX_REFERENCE) {
            this.a = amig.KIND_NOT_SET;
            this.b = null;
        }
        if (this.a == amig.CUSTOM) {
            this.a = amig.KIND_NOT_SET;
            this.b = null;
        }
        return amih;
    }
}
