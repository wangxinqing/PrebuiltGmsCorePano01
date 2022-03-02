package defpackage;

/* renamed from: amjd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class amjd {
    public amje a = amje.KIND_NOT_SET;
    public Object b = null;

    public final amjf a() {
        amjf amjf = new amjf(this);
        if (this.a == amje.JSON) {
            this.a = amje.KIND_NOT_SET;
            this.b = null;
        }
        if (this.a == amje.REFERENCED_ID) {
            this.a = amje.KIND_NOT_SET;
            this.b = null;
        }
        if (this.a == amje.MAP) {
            this.a = amje.KIND_NOT_SET;
            this.b = null;
        }
        if (this.a == amje.LIST) {
            this.a = amje.KIND_NOT_SET;
            this.b = null;
        }
        if (this.a == amje.STRING) {
            this.a = amje.KIND_NOT_SET;
            this.b = null;
        }
        if (this.a == amje.INDEX_REFERENCE) {
            this.a = amje.KIND_NOT_SET;
            this.b = null;
        }
        if (this.a == amje.CUSTOM) {
            this.a = amje.KIND_NOT_SET;
            this.b = null;
        }
        return amjf;
    }

    public final void a(amic amic) {
        this.a = amje.JSON;
        this.b = amic;
    }

    public final void a(String str) {
        this.a = amje.REFERENCED_ID;
        this.b = str;
    }
}
