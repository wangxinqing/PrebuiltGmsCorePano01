package defpackage;

/* renamed from: drl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class drl implements icm {
    final /* synthetic */ drm a;

    public drl(drm drm) {
        this.a = drm;
    }

    public final /* bridge */ /* synthetic */ void a(icl icl) {
        kuv kuv = (kuv) icl;
        if (kuv.a.c()) {
            drm drm = this.a;
            drm.a = kuv.b;
            drm.e();
            this.a.b.a(true);
            return;
        }
        this.a.b.a(false);
    }
}
