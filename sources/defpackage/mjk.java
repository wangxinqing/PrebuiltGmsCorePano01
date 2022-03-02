package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import com.google.android.chimera.Loader;
import com.google.android.chimera.LoaderManager;
import com.google.android.gms.family.v2.create.FamilyCreationChimeraActivity;
import com.google.android.gms.family.v2.model.PageData;

/* renamed from: mjk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class mjk implements LoaderManager.LoaderCallbacks {
    final /* synthetic */ FamilyCreationChimeraActivity a;

    public mjk(FamilyCreationChimeraActivity familyCreationChimeraActivity) {
        this.a = familyCreationChimeraActivity;
    }

    private final void a() {
        mfu.a(this.a, new mjg(this), new mjh(this)).show();
    }

    public final Loader onCreateLoader(int i, Bundle bundle) {
        Context applicationContext = this.a.getApplicationContext();
        FamilyCreationChimeraActivity familyCreationChimeraActivity = this.a;
        return new mlz(applicationContext, familyCreationChimeraActivity.a, familyCreationChimeraActivity.s, familyCreationChimeraActivity.b, familyCreationChimeraActivity.q);
    }

    public final /* bridge */ /* synthetic */ void onLoadFinished(Loader loader, Object obj) {
        mhg mhg = (mhg) obj;
        if (mhg.b) {
            apkr apkr = (apkr) mhg.a;
            if (apkr.d) {
                if ((apkr.a & 16) != 0) {
                    if (this.a.o()) {
                        this.a.j();
                    }
                    FamilyCreationChimeraActivity familyCreationChimeraActivity = this.a;
                    apkp apkp = ((apkr) mhg.a).f;
                    if (apkp == null) {
                        apkp = apkp.e;
                    }
                    mfu.a(familyCreationChimeraActivity, new PageData(apkp), this.a.a, new mji(this, mhg), (DialogInterface.OnClickListener) null, false).show();
                    return;
                }
                this.a.r.a(3, 27);
                a();
            } else if (apkr.c) {
                this.a.getSupportLoaderManager().restartLoader(4, (Bundle) null, new mij(this.a));
                this.a.b(4);
            } else if ((apkr.a & 16) != 0) {
                if (this.a.o()) {
                    this.a.j();
                }
                FamilyCreationChimeraActivity familyCreationChimeraActivity2 = this.a;
                apkp apkp2 = ((apkr) mhg.a).f;
                if (apkp2 == null) {
                    apkp2 = apkp.e;
                }
                mfu.a(familyCreationChimeraActivity2, new PageData(apkp2), this.a.a, new mjj(this), (DialogInterface.OnClickListener) null, false).show();
            } else {
                this.a.r.a(3, 27);
                a();
            }
        } else {
            this.a.r.a(3, 18);
            a();
        }
    }

    public final void onLoaderReset(Loader loader) {
    }
}
