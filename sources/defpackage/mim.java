package defpackage;

import android.content.Context;
import android.os.Bundle;
import com.google.android.chimera.Loader;
import com.google.android.chimera.LoaderManager;
import com.google.android.gms.family.v2.create.FamilyCreationChimeraActivity;

/* renamed from: mim  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class mim implements LoaderManager.LoaderCallbacks {
    final /* synthetic */ FamilyCreationChimeraActivity a;

    public mim(FamilyCreationChimeraActivity familyCreationChimeraActivity) {
        this.a = familyCreationChimeraActivity;
    }

    public final Loader onCreateLoader(int i, Bundle bundle) {
        Context applicationContext = this.a.getApplicationContext();
        FamilyCreationChimeraActivity familyCreationChimeraActivity = this.a;
        return new mls(applicationContext, familyCreationChimeraActivity.a, familyCreationChimeraActivity.s, familyCreationChimeraActivity.b);
    }

    public final /* bridge */ /* synthetic */ void onLoadFinished(Loader loader, Object obj) {
        if (!((mhg) obj).b) {
            this.a.r.a(3, 43);
            mfu.a(this.a, new mik(this), new mil(this)).show();
            return;
        }
        this.a.j();
        this.a.x = true;
        this.a.k();
    }

    public final void onLoaderReset(Loader loader) {
    }
}
