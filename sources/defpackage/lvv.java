package defpackage;

/* renamed from: lvv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class lvv extends lut {
    final /* synthetic */ lvx a;

    public lvv(lvx lvx) {
        this.a = lvx;
    }

    public final void a() {
        if (!awqj.d() && !awqj.b()) {
            lvx lvx = this.a;
            lww.a();
            if (!lww.d(lvx.getContext()).a()) {
                lvx.m().c(new lvo());
            } else {
                lvx.a.a((lut) new lvw(lvx));
            }
        } else {
            lvx lvx2 = this.a;
            if (lvx2.b) {
                lvx2.g.a(anxx.DRIVING_MODE_FRX_INTRO, anxw.DRIVING_MODE_FRX_READY);
                this.a.a.b("com.google.android.projection.gearhead");
                lww.a();
                if (lww.h(this.a.getContext()).b()) {
                    this.a.a("com.google.android.projection.gearhead");
                } else {
                    this.a.m().c(new lvt());
                }
            } else {
                lvx2.m().c(new lvl());
            }
        }
    }
}
