package defpackage;

import android.os.Bundle;
import com.google.android.chimera.Loader;
import com.google.android.chimera.LoaderManager;
import com.google.android.gms.family.v2.create.FamilyCreationChimeraActivity;

/* renamed from: mis  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class mis implements LoaderManager.LoaderCallbacks {
    final /* synthetic */ FamilyCreationChimeraActivity a;

    public mis(FamilyCreationChimeraActivity familyCreationChimeraActivity) {
        this.a = familyCreationChimeraActivity;
    }

    public final Loader onCreateLoader(int i, Bundle bundle) {
        FamilyCreationChimeraActivity familyCreationChimeraActivity = this.a;
        return new mmv(familyCreationChimeraActivity, familyCreationChimeraActivity.a, familyCreationChimeraActivity.s, familyCreationChimeraActivity.b);
    }

    public final /* bridge */ /* synthetic */ void onLoadFinished(Loader loader, Object obj) {
        mhg mhg = (mhg) obj;
        if (mhg.b) {
            FamilyCreationChimeraActivity familyCreationChimeraActivity = this.a;
            apjn apjn = (apjn) mhg.a;
            familyCreationChimeraActivity.g = apjn.c;
            apix a2 = apix.a(apjn.d);
            if (a2 == null) {
                a2 = apix.UNKNOWN_FAMILY_ROLE;
            }
            familyCreationChimeraActivity.f = a2;
            this.a.a(7);
            this.a.z();
            return;
        }
        this.a.r.a(3, 26);
        mfu.a(this.a, new miq(this), new mir(this)).show();
    }

    public final void onLoaderReset(Loader loader) {
    }
}
