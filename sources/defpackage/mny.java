package defpackage;

import android.os.Bundle;
import com.google.android.chimera.Activity;
import com.google.android.chimera.Loader;
import com.google.android.chimera.LoaderManager;
import com.google.android.gms.R;
import com.google.android.gms.family.model.DashboardDataModel;
import com.google.android.gms.family.model.ViewerDataModel;
import com.google.android.gms.family.v2.model.ContactPickerOptionsData;
import com.google.android.gms.family.v2.model.PageData;
import com.google.android.gms.family.v2.model.PageDataMap;
import java.util.Iterator;

/* renamed from: mny  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class mny implements LoaderManager.LoaderCallbacks {
    final /* synthetic */ mob a;

    public mny(mob mob) {
        this.a = mob;
    }

    public final Loader onCreateLoader(int i, Bundle bundle) {
        Activity activity = this.a.getActivity();
        mob mob = this.a;
        return new mmw(activity, mob.d, mob.c.k(), this.a.c.j(), this.a.e);
    }

    public final /* bridge */ /* synthetic */ void onLoadFinished(Loader loader, Object obj) {
        Object obj2;
        PageData pageData;
        boolean z;
        apix apix;
        int i;
        mhg mhg = (mhg) obj;
        if (!mhg.b || (obj2 = mhg.a) == null) {
            this.a.d();
            mfv.c("FamilyDashboardFragment", "Response for getFamilyAppConfig is null", new Object[0]);
            akax a2 = akax.a(this.a.getView(), (int) R.string.fm_get_family_error, -2);
            a2.a(R.string.common_retry, new mnx(this));
            a2.c();
            return;
        }
        mob mob = this.a;
        apiq apiq = ((apjc) obj2).c;
        if (apiq == null) {
            apiq = apiq.i;
        }
        apiy apiy = apiq.d;
        if (apiy == null) {
            apiy = apiy.c;
        }
        if ((apiy.a & 1) != 0) {
            apiy apiy2 = apiq.d;
            if (apiy2 == null) {
                apiy2 = apiy.c;
            }
            apkp apkp = apiy2.b;
            if (apkp == null) {
                apkp = apkp.e;
            }
            pageData = new PageData(apkp);
        } else {
            pageData = null;
        }
        if ((apiq.a & 1) != 0) {
            apgz apgz = apiq.b;
            if (apgz == null) {
                apgz = apgz.b;
            }
            int a3 = apgy.a(apgz.a);
            z = a3 == 0 ? false : a3 == 3;
        } else {
            z = false;
        }
        if (apiq.e.size() > 0) {
            apix = (apix) apiq.f.a(Integer.valueOf(apiq.e.c(0)));
        } else {
            apix = apix.MEMBER;
        }
        apkp[] apkpArr = (apkp[]) apiq.g.toArray(new apkp[0]);
        PageDataMap pageDataMap = new PageDataMap();
        if (apkpArr != null) {
            for (apkp apkp2 : apkpArr) {
                int a4 = apko.a(apkp2.a);
                if (a4 == 0) {
                    a4 = 1;
                }
                pageDataMap.a(a4 - 1, new PageData(apkp2));
            }
        }
        ob obVar = new ob();
        ob obVar2 = new ob();
        ob obVar3 = new ob();
        ViewerDataModel viewerDataModel = new ViewerDataModel();
        if (apiq != null) {
            apkf apkf = apiq.c;
            if (apkf == null) {
                apkf = apkf.d;
            }
            if ((apiq.a & 2) != 0) {
                for (apka ordinal : new aucu(apkf.a, apkf.b)) {
                    apkd apkd = apkd.UNKNOWN_CAPABILITY;
                    apka apka = apka.UNKNOWN_MANAGE_FAMILY_CAPABILITY;
                    int ordinal2 = ordinal.ordinal();
                    if (ordinal2 == 1) {
                        viewerDataModel.b(0);
                    } else if (ordinal2 == 2) {
                        viewerDataModel.b(1);
                    } else if (ordinal2 == 3) {
                        viewerDataModel.b(2);
                    } else if (ordinal2 == 4) {
                        viewerDataModel.b(3);
                    } else if (ordinal2 == 5) {
                        viewerDataModel.b(4);
                    }
                }
                aucx aucx = apkf.c;
                int size = aucx.size();
                int i2 = 0;
                while (i2 < size) {
                    apke apke = (apke) aucx.get(i2);
                    aucx aucx2 = aucx;
                    int i3 = size;
                    Iterator it = new aucu(apke.b, apke.c).iterator();
                    while (true) {
                        i = i2 + 1;
                        if (!it.hasNext()) {
                            break;
                        }
                        apkd apkd2 = apkd.UNKNOWN_CAPABILITY;
                        apka apka2 = apka.UNKNOWN_MANAGE_FAMILY_CAPABILITY;
                        int ordinal3 = ((apkd) it.next()).ordinal();
                        if (ordinal3 == 1) {
                            obVar.add(apke.a);
                            obVar2.add(apke.a);
                        } else if (ordinal3 == 2) {
                            obVar2.add(apke.a);
                        } else if (ordinal3 == 3) {
                            obVar3.add(apke.a);
                        }
                    }
                    i2 = i;
                    aucx = aucx2;
                    size = i3;
                }
                viewerDataModel.a = obVar2;
                viewerDataModel.b = obVar;
                viewerDataModel.c = obVar3;
            }
        }
        mob.i = new DashboardDataModel(z, pageDataMap, viewerDataModel, apix, pageData);
        apiq apiq2 = ((apjc) mhg.a).c;
        if (apiq2 == null) {
            apiq2 = apiq.i;
        }
        if ((apiq2.a & 8) != 0) {
            apiq apiq3 = ((apjc) mhg.a).c;
            if (apiq3 == null) {
                apiq3 = apiq.i;
            }
            apjw apjw = apiq3.h;
            if (apjw == null) {
                apjw = apjw.c;
            }
            if ((apjw.a & 2) != 0) {
                mnz mnz = this.a.c;
                apiq apiq4 = ((apjc) mhg.a).c;
                if (apiq4 == null) {
                    apiq4 = apiq.i;
                }
                apjw apjw2 = apiq4.h;
                if (apjw2 == null) {
                    apjw2 = apjw.c;
                }
                aphs aphs = apjw2.b;
                if (aphs == null) {
                    aphs = aphs.j;
                }
                mnz.a(new ContactPickerOptionsData(aphs));
                this.a.c();
                return;
            }
        }
    }

    public final void onLoaderReset(Loader loader) {
    }
}
