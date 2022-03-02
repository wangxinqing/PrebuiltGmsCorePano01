package defpackage;

/* renamed from: baez  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class baez extends bafs {
    public final azzi a;
    public final azyd b = azyd.a();
    final /* synthetic */ bafa c;

    public baez(bafa bafa, azzi azzi) {
        this.c = bafa;
        this.a = azzi;
    }

    public final void b(babj babj) {
        super.b(babj);
        synchronized (this.c.a) {
            bafa bafa = this.c;
            if (bafa.e != null) {
                boolean remove = bafa.g.remove(this);
                if (!this.c.a()) {
                    if (remove) {
                        bafa bafa2 = this.c;
                        bafa2.b.a(bafa2.d);
                        bafa bafa3 = this.c;
                        if (bafa3.h != null) {
                            bafa3.b.a(bafa3.e);
                            this.c.e = null;
                        }
                    }
                }
            }
        }
        this.c.b.a();
    }
}
