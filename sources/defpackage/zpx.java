package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import com.google.android.cast.JGCastService;
import com.google.android.chimera.config.ModuleManager;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.recaptcha.RecaptchaChimeraActivity;
import com.google.android.gms.recaptcha.RecaptchaResultData;
import com.google.android.gms.recaptcha.RecaptchaV2VerifyOperation$1;

/* renamed from: zpx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class zpx extends nis {
    public final zqm a;
    final String b;
    final String c;

    public zpx(zqm zqm, String str, String str2) {
        super(205, "RecaptchaV2Verify");
        this.a = zqm;
        this.b = str;
        this.c = str2;
    }

    public final void a(Context context) {
        RecaptchaV2VerifyOperation$1 recaptchaV2VerifyOperation$1 = new RecaptchaV2VerifyOperation$1(this);
        Intent a2 = aamr.a(context, RecaptchaChimeraActivity.class);
        a2.addFlags(JGCastService.FLAG_PRIVATE_DISPLAY);
        a2.addFlags(268435456);
        a2.addFlags(8388608);
        StringBuilder sb = new StringBuilder();
        zqg.a(sb, "k", this.b);
        zqg.a(sb, "di", String.valueOf(jhg.a(context)));
        zqg.a(sb, "pk", this.c);
        zqg.a(sb, "sv", String.valueOf(Build.VERSION.SDK_INT));
        zqg.a(sb, "gv", "20.12.16 (080306-{{cl}})");
        try {
            zqg.a(sb, "gm", String.valueOf(ModuleManager.get(context).getCurrentModule().moduleVersion));
        } catch (IllegalStateException e) {
        }
        aamp a3 = new aamq(context).a(this.c);
        if (a3 != null) {
            byte[] bArr = a3.a;
            if (bArr != null) {
                zqg.a(sb, "as", jhy.d(bArr));
            }
            byte[][] bArr2 = a3.b;
            if (bArr2 != null) {
                for (byte[] d : bArr2) {
                    zqg.a(sb, "ac", jhy.d(d));
                }
            }
            zqg.a(sb, "ip", a3.c);
            zqg.a(sb, "av", String.valueOf(aamr.a(context, this.c)));
            zqg.a(sb, "si", a3.d);
        }
        a2.putExtra("params", sb.toString());
        a2.putExtra("result", recaptchaV2VerifyOperation$1);
        context.startActivity(a2);
    }

    public final void a(Status status) {
        this.a.a(status, (RecaptchaResultData) null);
    }
}
