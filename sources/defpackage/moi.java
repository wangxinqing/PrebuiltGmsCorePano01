package defpackage;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Toast;
import com.google.android.chimera.Loader;
import com.google.android.chimera.LoaderManager;
import com.google.android.gms.R;
import com.google.android.gms.family.v2.manage.FamilyManagementChimeraActivity;
import com.google.android.gms.family.v2.model.PageData;

/* renamed from: moi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class moi implements LoaderManager.LoaderCallbacks {
    final /* synthetic */ FamilyManagementChimeraActivity a;

    public moi(FamilyManagementChimeraActivity familyManagementChimeraActivity) {
        this.a = familyManagementChimeraActivity;
    }

    public final Loader onCreateLoader(int i, Bundle bundle) {
        FamilyManagementChimeraActivity familyManagementChimeraActivity = this.a;
        return new mpl(familyManagementChimeraActivity, familyManagementChimeraActivity.a, familyManagementChimeraActivity.e, familyManagementChimeraActivity.b);
    }

    public final /* bridge */ /* synthetic */ void onLoadFinished(Loader loader, Object obj) {
        mhg mhg = (mhg) obj;
        ProgressDialog progressDialog = this.a.d;
        if (progressDialog != null) {
            progressDialog.dismiss();
            this.a.d = null;
        }
        if (mhg.b) {
            Object obj2 = mhg.a;
            if (obj2 != null && (((aphy) obj2).a & 2) == 0) {
                FamilyManagementChimeraActivity familyManagementChimeraActivity = this.a;
                familyManagementChimeraActivity.c.a(12);
                Toast.makeText(familyManagementChimeraActivity, R.string.fm_delete_family_successful_message, 0).show();
                familyManagementChimeraActivity.g();
                familyManagementChimeraActivity.setResult(8, familyManagementChimeraActivity.q());
                familyManagementChimeraActivity.finish();
                this.a.getSupportLoaderManager().destroyLoader(0);
            } else if (obj2 != null) {
                aphy aphy = (aphy) obj2;
                if ((aphy.a & 2) != 0) {
                    FamilyManagementChimeraActivity familyManagementChimeraActivity2 = this.a;
                    apkp apkp = aphy.c;
                    if (apkp == null) {
                        apkp = apkp.e;
                    }
                    mfu.a(familyManagementChimeraActivity2, new PageData(apkp), this.a.a, new moh(this), (DialogInterface.OnClickListener) null, false).show();
                    this.a.getSupportLoaderManager().destroyLoader(0);
                }
            }
        }
        this.a.p();
        this.a.getSupportLoaderManager().destroyLoader(0);
    }

    public final void onLoaderReset(Loader loader) {
    }
}
