package defpackage;

import android.content.DialogInterface;
import android.os.Bundle;
import com.google.android.chimera.Activity;
import com.google.android.chimera.Loader;
import com.google.android.chimera.LoaderManager;
import com.google.android.gms.family.v2.manage.FamilyManagementChimeraActivity;
import com.google.android.gms.family.v2.model.PageData;

/* renamed from: mnu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class mnu implements LoaderManager.LoaderCallbacks {
    final /* synthetic */ mob a;
    private final String b;
    private final apix c;

    public mnu(mob mob, String str, apix apix) {
        this.a = mob;
        this.b = str;
        this.c = apix;
    }

    public final Loader onCreateLoader(int i, Bundle bundle) {
        Activity activity = this.a.getActivity();
        mob mob = this.a;
        return new mpk(activity, mob.d, mob.c.k(), this.a.c.j(), this.b, this.c);
    }

    public final /* bridge */ /* synthetic */ void onLoadFinished(Loader loader, Object obj) {
        mhg mhg = (mhg) obj;
        this.a.g();
        if (mhg.b) {
            Object obj2 = mhg.a;
            if (obj2 != null) {
                aphj aphj = (aphj) obj2;
                if (aphj.a) {
                    apkp apkp = aphj.b;
                    if (apkp == null) {
                        apkp = apkp.e;
                    }
                    PageData pageData = new PageData(apkp);
                    mnz mnz = this.a.c;
                    if (mnz != null) {
                        mnz.a(pageData, this.b, this.c.g);
                        return;
                    }
                    return;
                }
            }
            apkp apkp2 = ((aphj) obj2).c;
            if (apkp2 == null) {
                apkp2 = apkp.e;
            }
            mfu.a((FamilyManagementChimeraActivity) this.a.getActivity(), new PageData(apkp2), this.a.d, new mnt(), (DialogInterface.OnClickListener) null, false).show();
            return;
        }
        this.a.e();
    }

    public final void onLoaderReset(Loader loader) {
    }
}
