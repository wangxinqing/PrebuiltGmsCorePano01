package defpackage;

/* renamed from: amij  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class amij {
    public int a = 0;
    public int b = 0;

    public amij() {
    }

    public final amik a() {
        amik amik = new amik(this);
        this.a = 0;
        this.b = 0;
        return amik;
    }

    public amij(amik amik) {
        this.a = amik.b;
        this.b = amik.c;
    }
}
