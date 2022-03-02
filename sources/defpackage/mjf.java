package defpackage;

import android.os.Bundle;
import com.google.android.chimera.Loader;
import com.google.android.chimera.LoaderManager;
import com.google.android.gms.family.v2.create.FamilyCreationChimeraActivity;
import com.google.android.gms.family.v2.model.ProfileData;

/* renamed from: mjf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class mjf implements LoaderManager.LoaderCallbacks {
    final /* synthetic */ FamilyCreationChimeraActivity a;

    public mjf(FamilyCreationChimeraActivity familyCreationChimeraActivity) {
        this.a = familyCreationChimeraActivity;
    }

    public final Loader onCreateLoader(int i, Bundle bundle) {
        FamilyCreationChimeraActivity familyCreationChimeraActivity = this.a;
        return new mly(familyCreationChimeraActivity, familyCreationChimeraActivity.a);
    }

    public final /* bridge */ /* synthetic */ void onLoadFinished(Loader loader, Object obj) {
        mhg mhg = (mhg) obj;
        if (!mhg.b) {
            this.a.r.a(3, 16);
            mfu.a(this.a, new mjd(this), new mje(this)).show();
            return;
        }
        FamilyCreationChimeraActivity familyCreationChimeraActivity = this.a;
        familyCreationChimeraActivity.o = (ProfileData) mhg.a;
        familyCreationChimeraActivity.a(5);
        this.a.z();
    }

    public final void onLoaderReset(Loader loader) {
    }
}
