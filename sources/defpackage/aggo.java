package defpackage;

/* renamed from: aggo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aggo {
    public amri a;
    public amri b;
    public amri c;
    public amri d;
    public amri e;
    public amri f;
    private bapu g;
    private amri h;
    private amri i;
    private amri j;
    private amri k;
    private amri l;

    aggo() {
    }

    public final aggp a() {
        String str = this.g == null ? " metricTransmitterProvider" : "";
        if (str.isEmpty()) {
            return new agdd(this.g, this.h, this.a, this.b, this.i, this.c, this.d, this.j, this.e, this.k, this.l, this.f);
        }
        throw new IllegalStateException(str.length() == 0 ? new String("Missing required properties:") : "Missing required properties:".concat(str));
    }

    public aggo(byte[] bArr) {
        this.h = ampu.a;
        this.a = ampu.a;
        this.b = ampu.a;
        this.i = ampu.a;
        this.c = ampu.a;
        this.d = ampu.a;
        this.j = ampu.a;
        this.e = ampu.a;
        this.k = ampu.a;
        this.l = ampu.a;
        this.f = ampu.a;
    }

    public final void a(bapu bapu) {
        if (bapu != null) {
            this.g = bapu;
            return;
        }
        throw new NullPointerException("Null metricTransmitterProvider");
    }
}
