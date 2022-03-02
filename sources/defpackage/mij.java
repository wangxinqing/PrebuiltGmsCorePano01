package defpackage;

import android.os.Bundle;
import com.google.android.chimera.Loader;
import com.google.android.chimera.LoaderManager;
import com.google.android.gms.family.v2.create.FamilyCreationChimeraActivity;
import com.google.android.gms.family.v2.model.CanCreateFamilyData;

/* renamed from: mij  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class mij implements LoaderManager.LoaderCallbacks {
    final /* synthetic */ FamilyCreationChimeraActivity a;

    public mij(FamilyCreationChimeraActivity familyCreationChimeraActivity) {
        this.a = familyCreationChimeraActivity;
    }

    public final Loader onCreateLoader(int i, Bundle bundle) {
        FamilyCreationChimeraActivity familyCreationChimeraActivity = this.a;
        return new mlr(familyCreationChimeraActivity, familyCreationChimeraActivity.a, familyCreationChimeraActivity.s, familyCreationChimeraActivity.b);
    }

    public final /* bridge */ /* synthetic */ void onLoadFinished(Loader loader, Object obj) {
        mhg mhg = (mhg) obj;
        if (!mhg.b) {
            this.a.r.a(3, 19);
            mfu.a(this.a, new mih(this), new mii(this)).show();
            return;
        }
        this.a.p = new CanCreateFamilyData((aphh) mhg.a);
        this.a.a(4);
        this.a.z();
    }

    public final void onLoaderReset(Loader loader) {
    }
}
