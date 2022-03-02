package defpackage;

import android.content.Context;
import android.text.TextUtils;

/* renamed from: appn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class appn implements acvp {
    final /* synthetic */ Context a;
    final /* synthetic */ apts b;
    final /* synthetic */ apub c;
    final /* synthetic */ aptt d;

    public appn(aptt aptt, Context context, apts apts, apub apub) {
        this.d = aptt;
        this.a = context;
        this.b = apts;
        this.c = apub;
    }

    public final void a(acwa acwa) {
        if (acwa.b()) {
            apuc apuc = (apuc) acwa.d();
            if (!TextUtils.isEmpty(apuc.c) && !TextUtils.isEmpty(apuc.d)) {
                apox.a.a(this.a, apuc.d, apuc.c, apuc.e * 1000);
            }
            appg.b(this.d.b.a, apuc.d);
            this.b.a(apuc);
            return;
        }
        if (acwa.e().getMessage() != null && acwa.e().getMessage().equals("INVALID_VERIFICATION_PROOF")) {
            apox.a.d(this.a, this.c.b);
        }
        this.b.a(acwa.e().getMessage());
    }
}
