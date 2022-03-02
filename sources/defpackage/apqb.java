package defpackage;

import android.content.Context;
import android.text.TextUtils;

/* renamed from: apqb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class apqb implements acvp {
    final /* synthetic */ Context a;
    final /* synthetic */ apts b;
    final /* synthetic */ apvm c;
    final /* synthetic */ aptt d;

    public apqb(aptt aptt, Context context, apts apts, apvm apvm) {
        this.d = aptt;
        this.a = context;
        this.b = apts;
        this.c = apvm;
    }

    public final void a(acwa acwa) {
        if (acwa.b()) {
            apvn apvn = (apvn) acwa.d();
            if (!TextUtils.isEmpty(apvn.f)) {
                apox.a.a(this.a, apvn.h, apvn.f, apvn.g * 1000);
            }
            appg.a(this.d.b.a, apvn.h);
            this.b.a(apvn);
            return;
        }
        Exception e = acwa.e();
        if (e.getMessage() != null && e.getMessage().equals("INVALID_VERIFICATION_PROOF")) {
            apox.a.d(this.a, this.c.b);
        }
        this.b.a(e.getMessage());
    }
}
