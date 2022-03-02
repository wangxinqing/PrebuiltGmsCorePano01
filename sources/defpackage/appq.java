package defpackage;

import android.content.Context;
import android.text.TextUtils;

/* renamed from: appq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class appq implements acvp {
    final /* synthetic */ Context a;
    final /* synthetic */ apud b;
    final /* synthetic */ apts c;
    final /* synthetic */ aptt d;

    public appq(aptt aptt, Context context, apud apud, apts apts) {
        this.d = aptt;
        this.a = context;
        this.b = apud;
        this.c = apts;
    }

    public final void a(acwa acwa) {
        if (acwa.b()) {
            apue apue = (apue) acwa.d();
            if (!TextUtils.isEmpty(apue.c) && !TextUtils.isEmpty(apue.d)) {
                apox.a.a(this.a, apue.d, apue.c, apue.e * 1000);
            }
            appg.c(this.d.b.a, this.b.a);
            apox.a.c(this.a, this.b.a);
            this.c.a(apue);
            return;
        }
        if (acwa.e().getMessage() != null && acwa.e().getMessage().equals("INVALID_VERIFICATION_PROOF")) {
            apox.a.d(this.a, this.b.b);
        }
        this.c.a(acwa.e().getMessage());
    }
}
