package defpackage;

import android.os.CountDownTimer;
import com.google.android.gms.update.pano.SystemUpdateTvMainChimeraActivity;

/* renamed from: adon  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class adon extends CountDownTimer {
    final /* synthetic */ SystemUpdateTvMainChimeraActivity a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public adon(SystemUpdateTvMainChimeraActivity systemUpdateTvMainChimeraActivity, long j) {
        super(j, 20);
        this.a = systemUpdateTvMainChimeraActivity;
    }

    public final void onFinish() {
        SystemUpdateTvMainChimeraActivity systemUpdateTvMainChimeraActivity = this.a;
        iwd iwd = SystemUpdateTvMainChimeraActivity.a;
        if (systemUpdateTvMainChimeraActivity.b == null && !systemUpdateTvMainChimeraActivity.isFinishing()) {
            SystemUpdateTvMainChimeraActivity.a.d("Not receiving any status update in 1 minute. Finishing.", new Object[0]);
            this.a.finish();
        }
    }

    public final void onTick(long j) {
    }
}
