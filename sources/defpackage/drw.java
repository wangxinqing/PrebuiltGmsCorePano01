package defpackage;

import android.os.Message;
import com.google.android.gms.app.settings.OpenSourceLicensesChimeraActivity;

/* renamed from: drw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class drw extends qvr {
    final /* synthetic */ OpenSourceLicensesChimeraActivity a;

    public drw(OpenSourceLicensesChimeraActivity openSourceLicensesChimeraActivity) {
        this.a = openSourceLicensesChimeraActivity;
    }

    public final void handleMessage(Message message) {
        CharSequence charSequence = message.getData().getCharSequence("license");
        OpenSourceLicensesChimeraActivity openSourceLicensesChimeraActivity = this.a;
        amzy amzy = OpenSourceLicensesChimeraActivity.a;
        openSourceLicensesChimeraActivity.d.setText(charSequence);
    }
}
