package defpackage;

/* renamed from: amio  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class amio {
    public String a = "";
    public int b = 0;
    public amii c = amii.SHIFT_AFTER_DELETE;

    public amio() {
    }

    public final amip a() {
        amip amip = new amip(this);
        this.a = "";
        this.b = 0;
        this.c = amii.SHIFT_AFTER_DELETE;
        return amip;
    }

    public amio(amip amip) {
        this.a = amip.b;
        this.b = amip.c;
        this.c = amip.d;
    }
}
