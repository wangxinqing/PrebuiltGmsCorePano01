package defpackage;

import android.content.DialogInterface;
import android.os.Bundle;
import com.google.android.chimera.Activity;
import com.google.android.chimera.Loader;
import com.google.android.chimera.LoaderManager;
import com.google.android.gms.family.v2.manage.FamilyManagementChimeraActivity;
import com.google.android.gms.family.v2.model.PageData;

/* renamed from: mot  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class mot implements LoaderManager.LoaderCallbacks {
    final /* synthetic */ mow a;
    private final String b;
    private final apix c;

    public mot(mow mow, String str, apix apix) {
        this.a = mow;
        apix apix2 = apix.UNKNOWN_FAMILY_ROLE;
        this.b = str;
        this.c = apix;
    }

    public final Loader onCreateLoader(int i, Bundle bundle) {
        Activity activity = this.a.getActivity();
        mow mow = this.a;
        return new mpk(activity, mow.b, mow.d.k(), this.a.d.j(), this.b, this.c);
    }

    public final /* bridge */ /* synthetic */ void onLoadFinished(Loader loader, Object obj) {
        Object obj2;
        mhg mhg = (mhg) obj;
        this.a.c();
        mow mow = this.a;
        if (mow.d == null) {
            return;
        }
        if (!mhg.b || (obj2 = mhg.a) == null) {
            mow.e();
            this.a.d();
            return;
        }
        aphj aphj = (aphj) obj2;
        if (aphj.a) {
            apkp apkp = aphj.b;
            if (apkp == null) {
                apkp = apkp.e;
            }
            this.a.d.a(new PageData(apkp), this.b, this.c.g);
            return;
        }
        apkp apkp2 = aphj.c;
        if (apkp2 == null) {
            apkp2 = apkp.e;
        }
        this.a.e();
        mfu.a((FamilyManagementChimeraActivity) this.a.getActivity(), new PageData(apkp2), this.a.b, new mos(), (DialogInterface.OnClickListener) null, false).show();
    }

    public final void onLoaderReset(Loader loader) {
    }
}
