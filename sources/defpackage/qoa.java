package defpackage;

import android.content.Context;
import com.google.android.gms.ipa.base.IpaGcmTaskChimeraService;

/* renamed from: qoa  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class qoa implements Runnable {
    private final IpaGcmTaskChimeraService a;

    public qoa(IpaGcmTaskChimeraService ipaGcmTaskChimeraService) {
        this.a = ipaGcmTaskChimeraService;
    }

    public final void run() {
        qns a2 = qns.a((Context) this.a);
        if (a2 != null) {
            a2.b();
        }
    }
}
