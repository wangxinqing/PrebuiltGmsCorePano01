package defpackage;

import com.google.android.gms.plus.audience.UpdateCirclesChimeraActivity;
import com.google.android.gms.plus.circles.AddToCircleConsentData;

/* renamed from: yqy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class yqy implements icm {
    final /* synthetic */ UpdateCirclesChimeraActivity a;

    public yqy(UpdateCirclesChimeraActivity updateCirclesChimeraActivity) {
        this.a = updateCirclesChimeraActivity;
    }

    public final /* bridge */ /* synthetic */ void a(icl icl) {
        AddToCircleConsentData addToCircleConsentData;
        wlf wlf = (wlf) icl;
        this.a.y = wlf.aO();
        UpdateCirclesChimeraActivity updateCirclesChimeraActivity = this.a;
        if (wlf.aO().c()) {
            addToCircleConsentData = new AddToCircleConsentData(wlf.b(), wlf.c(), wlf.d(), wlf.e());
        } else {
            addToCircleConsentData = null;
        }
        updateCirclesChimeraActivity.x = addToCircleConsentData;
        UpdateCirclesChimeraActivity updateCirclesChimeraActivity2 = this.a;
        if (updateCirclesChimeraActivity2.z) {
            updateCirclesChimeraActivity2.z = false;
            if (!updateCirclesChimeraActivity2.s()) {
                this.a.t();
            }
        }
    }
}
