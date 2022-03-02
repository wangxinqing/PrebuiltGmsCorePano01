package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.RemoteException;
import com.google.android.cast.JGCastService;
import com.google.android.chimera.config.ModuleManager;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.safetynet.RecaptchaResultData;
import com.google.android.gms.security.recaptcha.RecaptchaChimeraActivity;
import com.google.android.gms.security.recaptcha.RecaptchaVerifyOperation$3;

/* renamed from: aaot  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aaot extends nis {
    private final zzw a;
    private final String b;
    private final String c;

    static {
        aaot.class.getSimpleName();
    }

    public aaot(zzw zzw, String str, String str2) {
        super(45, "recaptcha");
        this.a = zzw;
        this.b = str;
        this.c = str2;
    }

    public final void a(Context context) {
        if (!azfv.a.a().j()) {
            RecaptchaVerifyOperation$3 recaptchaVerifyOperation$3 = new RecaptchaVerifyOperation$3(this);
            Intent a2 = aann.a(context, RecaptchaChimeraActivity.class);
            a2.addFlags(JGCastService.FLAG_PRIVATE_DISPLAY);
            a2.addFlags(268435456);
            a2.addFlags(8388608);
            StringBuilder sb = new StringBuilder();
            aans.a(sb, "k", this.b);
            aans.a(sb, "di", String.valueOf(jhg.a(context)));
            aans.a(sb, "pk", this.c);
            aans.a(sb, "sv", String.valueOf(Build.VERSION.SDK_INT));
            aans.a(sb, "gv", "20.12.16 (080306-{{cl}})");
            try {
                aans.a(sb, "gm", String.valueOf(ModuleManager.get(context).getCurrentModule().moduleVersion));
            } catch (IllegalStateException e) {
            }
            aanl a3 = new aanm(context).a(this.c);
            if (a3 != null) {
                byte[] bArr = a3.a;
                if (bArr != null) {
                    aans.a(sb, "as", jhy.d(bArr));
                }
                byte[][] bArr2 = a3.b;
                if (bArr2 != null) {
                    for (byte[] d : bArr2) {
                        aans.a(sb, "ac", jhy.d(d));
                    }
                }
                aans.a(sb, "ip", a3.c);
                aans.a(sb, "av", String.valueOf(aann.c(context, this.c)));
                aans.a(sb, "si", a3.d);
            }
            a2.putExtra("params", sb.toString());
            a2.putExtra("result", recaptchaVerifyOperation$3);
            context.startActivity(a2);
            return;
        }
        zpt zpt = new zpt(context);
        String str = this.b;
        String str2 = this.c;
        iha b2 = ihb.b();
        b2.a = new zpr(str, str2);
        b2.b = new Feature[]{zoq.a};
        acwa a4 = zpt.a(b2.a());
        a4.a((acvv) new aaos(this));
        a4.a((acvs) new aaor(this));
    }

    public final void a(Status status) {
        this.a.a(status, (RecaptchaResultData) null);
    }

    public final void a(Status status, String str) {
        zzw zzw = this.a;
        if (zzw != null) {
            zzw.a(status, new RecaptchaResultData(str));
        }
    }

    public final void a(Exception exc) {
        Status status;
        try {
            if (!(exc instanceof ibr)) {
                status = new Status(13, "");
            } else {
                int a2 = ((ibr) exc).a();
                switch (a2) {
                    case 36000:
                        a2 = 12006;
                        break;
                    case 36001:
                        a2 = 12007;
                        break;
                    case 36002:
                        a2 = 12008;
                        break;
                    case 36003:
                        a2 = 12013;
                        break;
                    case 36004:
                        a2 = 36004;
                        break;
                }
                status = new Status(a2, ibt.a(a2));
            }
            a(status);
        } catch (RemoteException e) {
        }
    }
}
