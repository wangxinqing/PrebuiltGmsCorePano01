package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.recaptcha.RecaptchaAction;
import com.google.android.gms.recaptcha.RecaptchaApiChimeraService;
import com.google.android.gms.recaptcha.RecaptchaHandle;
import com.google.android.gms.recaptcha.RecaptchaResultData;
import java.util.concurrent.Executor;

/* renamed from: zqd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class zqd extends nis {
    final RecaptchaApiChimeraService a;
    public final zqm b;
    final String c;
    final String d;
    final String e;
    public final String f;
    public final Bundle g;
    public final zqv h;
    public final aoru i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zqd(RecaptchaApiChimeraService recaptchaApiChimeraService, zqm zqm, RecaptchaHandle recaptchaHandle, RecaptchaAction recaptchaAction) {
        super(205, "RecaptchaV3Execute");
        String str;
        zqv a2 = zqw.a();
        this.a = recaptchaApiChimeraService;
        this.b = zqm;
        this.c = recaptchaHandle.b;
        this.d = recaptchaHandle.a;
        if (!"other".equals(recaptchaAction.a.a)) {
            str = recaptchaAction.a.a;
        } else {
            str = recaptchaAction.b;
        }
        this.e = str;
        this.f = recaptchaAction.d;
        this.g = recaptchaAction.c;
        this.h = a2;
        this.i = jfm.a(9);
    }

    public final void b(Status status) {
        try {
            a(status);
        } catch (RemoteException e2) {
        }
    }

    public final void a(Context context) {
        aorl.a(aopr.a(aooz.a(zox.a(context).a(this.d, this.c), Exception.class, amll.a(zpz.a), (Executor) aoqm.a), amll.a((aoqb) new zqa(this)), (Executor) this.i), new zqc(this), this.i);
    }

    public final void a(Status status) {
        zqm zqm = this.b;
        if (zqm != null) {
            zqm.a(status, (RecaptchaResultData) null);
        }
    }
}
