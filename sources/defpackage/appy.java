package defpackage;

import android.content.Context;

/* renamed from: appy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class appy implements acvp {
    final /* synthetic */ Context a;
    final /* synthetic */ apts b;

    public appy(Context context, apts apts) {
        this.a = context;
        this.b = apts;
    }

    public final void a(acwa acwa) {
        if (acwa.b()) {
            apvl apvl = (apvl) acwa.d();
            if (axif.b() && apvl.b()) {
                aptt.a(this.a, apvl.d, apvl.e);
            }
            this.b.a(apvl);
            return;
        }
        this.b.a(acwa.e().getMessage());
    }
}
