package defpackage;

import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.recaptcha.RecaptchaApiChimeraService;

/* renamed from: zpy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class zpy extends nis {
    final RecaptchaApiChimeraService a;
    private final zqj b;

    public zpy(RecaptchaApiChimeraService recaptchaApiChimeraService, zqj zqj) {
        super(205, "RecaptchaV3Close");
        this.a = recaptchaApiChimeraService;
        this.b = zqj;
    }

    public final void a(Context context) {
        boolean b2 = this.a.b();
        zqj zqj = this.b;
        if (zqj != null) {
            zqj.a(new Status(0), b2);
        }
    }

    public final void a(Status status) {
        zqj zqj = this.b;
        if (zqj != null) {
            zqj.a(status, false);
        }
    }
}
