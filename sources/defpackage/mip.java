package defpackage;

import android.content.Context;
import android.os.Bundle;
import com.google.android.chimera.Loader;
import com.google.android.chimera.LoaderManager;
import com.google.android.gms.family.v2.create.FamilyCreationChimeraActivity;

/* renamed from: mip  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class mip implements LoaderManager.LoaderCallbacks {
    final /* synthetic */ FamilyCreationChimeraActivity a;

    public mip(FamilyCreationChimeraActivity familyCreationChimeraActivity) {
        this.a = familyCreationChimeraActivity;
    }

    public final Loader onCreateLoader(int i, Bundle bundle) {
        Context applicationContext = this.a.getApplicationContext();
        FamilyCreationChimeraActivity familyCreationChimeraActivity = this.a;
        return new mlt(applicationContext, familyCreationChimeraActivity.a, familyCreationChimeraActivity.s, familyCreationChimeraActivity.b, familyCreationChimeraActivity.n, familyCreationChimeraActivity.c);
    }

    public final /* bridge */ /* synthetic */ void onLoadFinished(Loader loader, Object obj) {
        if (!((mhg) obj).b) {
            this.a.r.a(3, 29);
            mfu.a(this.a, new min(this), new mio(this)).show();
            return;
        }
        FamilyCreationChimeraActivity familyCreationChimeraActivity = this.a;
        familyCreationChimeraActivity.h = true;
        familyCreationChimeraActivity.x = true;
        this.a.r.b(5);
        this.a.l();
    }

    public final void onLoaderReset(Loader loader) {
    }
}
