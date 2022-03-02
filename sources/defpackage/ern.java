package defpackage;

import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import com.google.android.gms.auth.account.otp.OtpChimeraActivity;

/* renamed from: ern  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ern implements AdapterView.OnItemSelectedListener {
    final /* synthetic */ OtpChimeraActivity a;

    public ern(OtpChimeraActivity otpChimeraActivity) {
        this.a = otpChimeraActivity;
    }

    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        String a2 = this.a.a.a();
        if (!TextUtils.equals(this.a.c, a2)) {
            OtpChimeraActivity otpChimeraActivity = this.a;
            otpChimeraActivity.c = a2;
            otpChimeraActivity.b.a(otpChimeraActivity.a.a(), this.a.d);
        }
    }

    public final void onNothingSelected(AdapterView adapterView) {
    }
}
