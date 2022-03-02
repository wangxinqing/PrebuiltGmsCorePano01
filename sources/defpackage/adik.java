package defpackage;

import android.os.Parcel;
import com.google.android.gms.update.SystemUpdateStatus;
import com.google.android.gms.update.pano.SystemUpdateTvMainChimeraActivity;
import java.lang.ref.WeakReference;

/* renamed from: adik  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class adik extends bhw implements adil {
    private final WeakReference a;

    public adik() {
        super("com.google.android.gms.update.ISystemUpdateStatusCallback");
    }

    public final void a(SystemUpdateStatus systemUpdateStatus) {
        SystemUpdateTvMainChimeraActivity systemUpdateTvMainChimeraActivity = (SystemUpdateTvMainChimeraActivity) this.a.get();
        if (systemUpdateTvMainChimeraActivity != null) {
            systemUpdateTvMainChimeraActivity.runOnUiThread(new adoo(systemUpdateStatus, systemUpdateTvMainChimeraActivity));
        }
    }

    public adik(SystemUpdateTvMainChimeraActivity systemUpdateTvMainChimeraActivity) {
        super("com.google.android.gms.update.ISystemUpdateStatusCallback");
        this.a = new WeakReference(systemUpdateTvMainChimeraActivity);
    }

    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        a((SystemUpdateStatus) bhx.a(parcel, SystemUpdateStatus.CREATOR));
        return true;
    }
}
