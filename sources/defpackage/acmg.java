package defpackage;

import android.hardware.fingerprint.FingerprintManager;
import com.google.android.gms.R;

/* renamed from: acmg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class acmg extends FingerprintManager.AuthenticationCallback {
    final /* synthetic */ acmj a;

    public acmg(acmj acmj) {
        this.a = acmj;
    }

    public final void onAuthenticationError(int i, CharSequence charSequence) {
        acmj.a.b(charSequence.toString(), new Object[0]);
        if (i != 5) {
            this.a.b.k();
        }
    }

    public final void onAuthenticationFailed() {
        acmj.a.b("Fingerprint scanned, but not recognized", new Object[0]);
        acmj acmj = this.a;
        acmj.a(acmj.getString(R.string.smartdevice_d2d_fingerprint_not_recognized_text));
    }

    public final void onAuthenticationHelp(int i, CharSequence charSequence) {
        acmj.a.b(charSequence.toString(), new Object[0]);
        this.a.a(charSequence.toString());
    }

    public final void onAuthenticationSucceeded(FingerprintManager.AuthenticationResult authenticationResult) {
        iwd iwd = acmj.a;
        String valueOf = String.valueOf(authenticationResult);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 49);
        sb.append("Fingerprint recognized! AuthenticationResult is: ");
        sb.append(valueOf);
        iwd.b(sb.toString(), new Object[0]);
        this.a.b.e();
    }
}
