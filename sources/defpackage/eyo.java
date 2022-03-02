package defpackage;

import android.accounts.Account;
import android.graphics.Bitmap;
import java.util.concurrent.Executor;

/* renamed from: eyo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class eyo implements aoqb {
    private final ezb a;

    public eyo(ezb ezb) {
        this.a = ezb;
    }

    public final aorr a(Object obj) {
        aorr aorr;
        ezb ezb = this.a;
        if (!((Boolean) obj).booleanValue()) {
            return fce.b(qct.UPDATE_DEFAULT_GOOGLE_ACCOUNT);
        }
        aorr a2 = ((ezi) ezb.d.a()).a(ezb.f, ezb.b.c);
        Bitmap bitmap = ezb.b.l;
        if (bitmap == null) {
            eyh eyh = (eyh) ezb.e.a();
            aorr = aopr.a(qbc.a(eyh.b.a(((Account) ezb.b.h.b()).name, eyh.a, 1)), (amqy) new eyg(eyh), (Executor) ezb.f);
        } else {
            aorr = aorl.a((Object) amri.b(bitmap));
        }
        aorl.b(a2, aorr).a((Runnable) new eyq(ezb, a2, aorr), (Executor) ezb.f);
        return ezb.a.a(qct.RECORD_CONSENT_GRANT);
    }
}
