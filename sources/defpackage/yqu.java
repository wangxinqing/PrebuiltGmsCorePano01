package defpackage;

import com.google.android.gms.plus.audience.UpdateActionOnlyChimeraActivity;
import com.google.android.gms.plus.circles.AddToCircleConsentData;

/* renamed from: yqu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class yqu implements icm {
    final /* synthetic */ UpdateActionOnlyChimeraActivity a;

    public yqu(UpdateActionOnlyChimeraActivity updateActionOnlyChimeraActivity) {
        this.a = updateActionOnlyChimeraActivity;
    }

    public final /* bridge */ /* synthetic */ void a(icl icl) {
        wlf wlf = (wlf) icl;
        UpdateActionOnlyChimeraActivity updateActionOnlyChimeraActivity = this.a;
        updateActionOnlyChimeraActivity.b = wlf;
        if (!wlf.aO().c()) {
            updateActionOnlyChimeraActivity.a = null;
            updateActionOnlyChimeraActivity.a(wlf.aO());
            return;
        }
        updateActionOnlyChimeraActivity.a = new AddToCircleConsentData(wlf.b(), wlf.c(), wlf.d(), wlf.e());
        AddToCircleConsentData addToCircleConsentData = updateActionOnlyChimeraActivity.a;
        if (addToCircleConsentData.a) {
            updateActionOnlyChimeraActivity.startActivityForResult(ysf.a(updateActionOnlyChimeraActivity.c, updateActionOnlyChimeraActivity.d, addToCircleConsentData.b, addToCircleConsentData.c, addToCircleConsentData.d, updateActionOnlyChimeraActivity.a()), 2000);
        } else {
            updateActionOnlyChimeraActivity.b();
        }
    }
}
