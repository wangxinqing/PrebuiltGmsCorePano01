package defpackage;

import android.os.Bundle;
import com.google.android.chimera.Loader;
import com.google.android.chimera.LoaderManager;
import com.google.android.gms.family.v2.model.ProfileData;

/* renamed from: mkw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class mkw implements LoaderManager.LoaderCallbacks {
    final /* synthetic */ mkx a;

    public mkw(mkx mkx) {
        this.a = mkx;
    }

    public final Loader onCreateLoader(int i, Bundle bundle) {
        return new mly(this.a.getActivity(), this.a.b);
    }

    public final /* bridge */ /* synthetic */ void onLoadFinished(Loader loader, Object obj) {
        mhg mhg = (mhg) obj;
        if (!mhg.b) {
            this.a.a.b().a(3, 16, "InvitationIntroFragment");
            mfu.a(this.a.getActivity(), new mku(this), new mkv(this)).show();
            return;
        }
        mkx mkx = this.a;
        mkx.f = (ProfileData) mhg.a;
        mkx.a();
    }

    public final void onLoaderReset(Loader loader) {
    }
}
