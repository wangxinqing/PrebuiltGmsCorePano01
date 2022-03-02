package defpackage;

import android.content.Context;
import android.os.Bundle;
import com.google.android.chimera.Loader;
import com.google.android.chimera.LoaderManager;
import com.google.android.gms.family.v2.create.FamilyCreationChimeraActivity;
import com.google.android.gms.family.v2.model.SetupParams;

/* renamed from: miz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class miz implements LoaderManager.LoaderCallbacks {
    final /* synthetic */ FamilyCreationChimeraActivity a;

    public miz(FamilyCreationChimeraActivity familyCreationChimeraActivity) {
        this.a = familyCreationChimeraActivity;
    }

    private final void a() {
        mfu.a(this.a, new mix(this), new miy(this)).show();
    }

    public final Loader onCreateLoader(int i, Bundle bundle) {
        String str;
        int i2;
        Context applicationContext = this.a.getApplicationContext();
        FamilyCreationChimeraActivity familyCreationChimeraActivity = this.a;
        String str2 = familyCreationChimeraActivity.a;
        mfp mfp = familyCreationChimeraActivity.s;
        mfr mfr = familyCreationChimeraActivity.b;
        boolean z = familyCreationChimeraActivity.i;
        if (z) {
            str = familyCreationChimeraActivity.d;
        } else {
            str = null;
        }
        if (z) {
            i2 = familyCreationChimeraActivity.t;
        } else {
            i2 = 0;
        }
        return new mlw(applicationContext, str2, mfp, mfr, str, i2);
    }

    public final /* bridge */ /* synthetic */ void onLoadFinished(Loader loader, Object obj) {
        mhg mhg = (mhg) obj;
        if (mhg.b) {
            this.a.n = new SetupParams((apjp) mhg.a);
            FamilyCreationChimeraActivity familyCreationChimeraActivity = this.a;
            if (familyCreationChimeraActivity.q != null) {
                familyCreationChimeraActivity.b(true);
                this.a.getFragmentManager().executePendingTransactions();
                this.a.q = null;
            } else if (!familyCreationChimeraActivity.q()) {
                a();
            }
        } else {
            this.a.r.a(3, 21);
            a();
        }
    }

    public final void onLoaderReset(Loader loader) {
    }
}
