package defpackage;

import android.content.Context;

/* renamed from: appw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class appw implements acvp {
    final /* synthetic */ Context a;
    final /* synthetic */ apts b;

    public appw(Context context, apts apts) {
        this.a = context;
        this.b = apts;
    }

    public final void a(acwa acwa) {
        if (acwa.b()) {
            apvh apvh = (apvh) acwa.d();
            if (this.a != null && axif.b() && apvh.b()) {
                aptt.a(this.a, apvh.k, apvh.l);
            }
            this.b.a(apvh);
            return;
        }
        this.b.a(acwa.e().getMessage());
    }
}
