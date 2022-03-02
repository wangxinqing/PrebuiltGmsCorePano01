package defpackage;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.recaptcha.RecaptchaApiChimeraService;
import com.google.android.gms.recaptcha.RecaptchaHandle;

/* renamed from: zqf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class zqf extends nis {
    final RecaptchaApiChimeraService a;
    final String b;
    final String c;
    public final zqn d;

    public final void a(Context context) {
        this.a.a();
        aorl.a(zox.a(context).a(this.b, this.c), new zqe(this), jfm.a(9));
    }

    public final void b(Status status) {
        try {
            a(status);
        } catch (RemoteException e) {
        }
    }

    public zqf(RecaptchaApiChimeraService recaptchaApiChimeraService, zqn zqn, String str, String str2) {
        super(205, "RecaptchaV3Init");
        this.a = recaptchaApiChimeraService;
        this.d = zqn;
        this.b = str;
        this.c = str2;
    }

    public final void a(Status status) {
        zqn zqn = this.d;
        if (zqn != null) {
            zqn.a(status, (RecaptchaHandle) null);
        }
    }
}
