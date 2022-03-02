package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import com.google.android.chimera.Activity;
import com.google.android.chimera.Loader;
import com.google.android.chimera.LoaderManager;
import com.google.android.gms.R;
import com.google.android.gms.family.v2.model.ContactPickerOptionsData;
import com.google.android.gms.family.v2.model.PageData;
import com.google.android.gms.family.v2.model.PageDataMap;

/* renamed from: mkr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class mkr implements LoaderManager.LoaderCallbacks {
    final /* synthetic */ mkx a;

    public mkr(mkx mkx) {
        this.a = mkx;
    }

    private final void a() {
        mfu.a(this.a.getActivity(), new mkp(this), new mkq(this)).show();
    }

    public final Loader onCreateLoader(int i, Bundle bundle) {
        apix apix;
        apix a2 = apix.a(this.a.d);
        if (a2 != null) {
            apix = a2;
        } else {
            apix = apix.UNKNOWN_FAMILY_ROLE;
        }
        Activity activity = this.a.getActivity();
        mkx mkx = this.a;
        return new mlu(activity, mkx.b, mkx.a.k(), this.a.a.j(), apix, this.a.g);
    }

    public final /* bridge */ /* synthetic */ void onLoadFinished(Loader loader, Object obj) {
        mhg mhg = (mhg) obj;
        if (mhg.b) {
            apja apja = (apja) mhg.a;
            if ((apja.a & 2) != 0) {
                apgz apgz = apja.d;
                if (apgz == null) {
                    apgz = apgz.b;
                }
                int a2 = apgy.a(apgz.a);
                if (a2 != 0 && a2 == 3) {
                    mfu.b(this.a.getActivity(), new mkn(this)).show();
                    return;
                }
            }
            if (!((apja) mhg.a).e.isEmpty()) {
                sr a3 = mfu.a((Context) this.a.getActivity());
                a3.a((CharSequence) ((apja) mhg.a).e);
                a3.b((int) R.string.common_got_it, (DialogInterface.OnClickListener) new mko(this));
                a3.b().show();
            } else if (((apja) mhg.a).c.size() == 0) {
                a();
            } else {
                this.a.e = new PageDataMap();
                aucx aucx = ((apja) mhg.a).c;
                int size = aucx.size();
                for (int i = 0; i < size; i++) {
                    apkp apkp = (apkp) aucx.get(i);
                    PageDataMap pageDataMap = this.a.e;
                    int a4 = apko.a(apkp.a);
                    if (a4 == 0) {
                        a4 = 1;
                    }
                    pageDataMap.a(a4 - 1, new PageData(apkp));
                }
                mkx mkx = this.a;
                mkx.a.a(mkx.e);
                apjw apjw = ((apja) mhg.a).f;
                if (apjw == null) {
                    apjw = apjw.c;
                }
                if ((apjw.a & 2) != 0) {
                    mkx mkx2 = this.a;
                    apjw apjw2 = ((apja) mhg.a).f;
                    if (apjw2 == null) {
                        apjw2 = apjw.c;
                    }
                    aphs aphs = apjw2.b;
                    if (aphs == null) {
                        aphs = aphs.j;
                    }
                    mkx2.h = new ContactPickerOptionsData(aphs);
                    mkx mkx3 = this.a;
                    mkx3.a.a(mkx3.h);
                    this.a.a();
                    return;
                }
                a();
            }
        } else {
            this.a.a.b().a(3, 22, "InvitationIntroFragment");
            a();
        }
    }

    public final void onLoaderReset(Loader loader) {
    }
}
