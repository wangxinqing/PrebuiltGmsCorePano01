package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.recaptcha.RecaptchaAction;
import com.google.android.gms.recaptcha.RecaptchaApiChimeraService;
import com.google.android.gms.recaptcha.RecaptchaHandle;
import com.google.android.gms.recaptcha.RecaptchaResultData;

/* renamed from: zpe  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class zpe extends zqp implements niz {
    private final RecaptchaApiChimeraService a;
    private final nix b;
    private final String c;

    public zpe(RecaptchaApiChimeraService recaptchaApiChimeraService, nix nix, String str) {
        this.a = recaptchaApiChimeraService;
        this.b = nix;
        this.c = str;
    }

    private final boolean a() {
        jix.h(this.a);
        return azdn.a.a().a();
    }

    public final void a(zqj zqj) {
        if (a()) {
            this.b.a(new zpy(this.a, zqj));
        } else {
            zqj.a(new Status(36004, "Feature off: close"), false);
        }
    }

    public final void a(zqm zqm, RecaptchaHandle recaptchaHandle, RecaptchaAction recaptchaAction) {
        if (a()) {
            this.b.a(new zqd(this.a, zqm, recaptchaHandle, recaptchaAction));
        } else {
            zqm.a(new Status(36004, "Feature off: execute"), (RecaptchaResultData) null);
        }
    }

    public final void a(zqm zqm, String str, String str2) {
        if (azdn.a.a().b()) {
            this.b.a(new zpx(zqm, str, str2));
        } else {
            zqm.a(new Status(36004, "Feature off: verifyWithRecaptcha"), (RecaptchaResultData) null);
        }
    }

    public final void a(zqn zqn, String str) {
        if (a()) {
            this.b.a(new zqf(this.a, zqn, str, this.c));
        } else {
            zqn.a(new Status(36004, "Feature off: init"), (RecaptchaHandle) null);
        }
    }
}
