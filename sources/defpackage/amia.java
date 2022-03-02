package defpackage;

/* renamed from: amia  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class amia {
    public amib a = amib.KIND_NOT_SET;
    public Object b = null;

    public final amic a() {
        amic amic = new amic(this);
        if (this.a == amib.NULL_VALUE) {
            this.a = amib.KIND_NOT_SET;
            this.b = null;
        }
        if (this.a == amib.NUMBER_VALUE) {
            this.a = amib.KIND_NOT_SET;
            this.b = null;
        }
        if (this.a == amib.STRING_VALUE) {
            this.a = amib.KIND_NOT_SET;
            this.b = null;
        }
        if (this.a == amib.BOOL_VALUE) {
            this.a = amib.KIND_NOT_SET;
            this.b = null;
        }
        if (this.a == amib.STRUCT_VALUE) {
            this.a = amib.KIND_NOT_SET;
            this.b = null;
        }
        if (this.a == amib.LIST_VALUE) {
            this.a = amib.KIND_NOT_SET;
            this.b = null;
        }
        return amic;
    }

    public final void a(double d) {
        this.a = amib.NUMBER_VALUE;
        this.b = Double.valueOf(d);
    }

    public final void a(amhv amhv) {
        this.a = amib.NULL_VALUE;
        this.b = amhv;
    }

    public final void a(String str) {
        this.a = amib.STRING_VALUE;
        this.b = str;
    }
}
