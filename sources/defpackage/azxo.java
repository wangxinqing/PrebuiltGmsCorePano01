package defpackage;

/* renamed from: azxo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class azxo extends azym {
    public azxl a;

    protected azxo(azxl azxl) {
        this.a = azxl;
    }

    /* access modifiers changed from: protected */
    public final azxl a() {
        return this.a;
    }

    /* access modifiers changed from: protected */
    public abstract void b(azxk azxk, baaf baaf);

    public final void a(azxk azxk, baaf baaf) {
        try {
            b(azxk, baaf);
        } catch (Exception e) {
            this.a = azxq.a;
            azxk.a(babj.a((Throwable) e), new baaf());
        }
    }
}
