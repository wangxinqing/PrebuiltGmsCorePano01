package defpackage;

import com.google.android.gms.smartdevice.d2d.TargetConnectionArgs;
import com.google.android.gms.smartdevice.d2d.VerificationInfo;

/* renamed from: abqr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class abqr extends tim {
    final /* synthetic */ abqw a;

    public abqr(abqw abqw) {
        this.a = abqw;
    }

    public final void a(String str) {
        this.a.a(str);
    }

    public final void a(String str, til til) {
        String str2 = this.a.g;
        if (str2 != null && str2.equals(str)) {
            iwd iwd = abqw.b;
            String str3 = til.a;
            StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 36 + String.valueOf(str).length());
            sb.append("Connection initiated from device:");
            sb.append(str3);
            sb.append(" (");
            sb.append(str);
            sb.append(")");
            iwd.a(sb.toString(), new Object[0]);
            String a2 = acbz.a(til.b, this.a.i);
            iwd iwd2 = abqw.b;
            StringBuilder sb2 = new StringBuilder(String.valueOf(a2).length() + 42);
            sb2.append("Forwarding pin (");
            sb2.append(a2);
            sb2.append(") to bootstrap controller.");
            iwd2.a(sb2.toString(), new Object[0]);
            if (azjt.c()) {
                VerificationInfo verificationInfo = new VerificationInfo(a2, this.a.i.g);
                acau acau = this.a.e;
                if (acau != null) {
                    acau.a(verificationInfo);
                    return;
                }
                return;
            }
            acau acau2 = this.a.e;
            if (acau2 != null) {
                acau2.a(a2);
                return;
            }
            return;
        }
        iwd iwd3 = abqw.b;
        String str4 = this.a.g;
        StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 84 + String.valueOf(str4).length());
        sb3.append("Connection endpoint id (");
        sb3.append(str);
        sb3.append(") does not match endpoint ID we connected with (");
        sb3.append(str4);
        sb3.append(")! Skipping.");
        iwd3.d(sb3.toString(), new Object[0]);
    }

    public final void a(String str, tip tip) {
        String str2 = this.a.g;
        if (str2 == null || !str2.equals(str)) {
            iwd iwd = abqw.b;
            String str3 = this.a.g;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 84 + String.valueOf(str3).length());
            sb.append("Connection endpoint id (");
            sb.append(str);
            sb.append(") does not match endpoint ID we connected with (");
            sb.append(str3);
            sb.append(")! Skipping.");
            iwd.d(sb.toString(), new Object[0]);
        } else if (!tip.a.c()) {
            abqw.b.e("Unsuccessful connection.", new Object[0]);
            acau acau = this.a.e;
            if (acau != null) {
                acau.a(10584);
            }
        } else {
            abqw abqw = this.a;
            abom a2 = abqw.k.a();
            a2.a = true;
            abqw.k = a2.a();
            abqw.b.a("Connection complete.", new Object[0]);
            abvt abvt = new abvt(this.a.c, str);
            acau acau2 = this.a.e;
            if (acau2 != null) {
                acau2.a(abvt, (TargetConnectionArgs) null);
            }
        }
    }
}
