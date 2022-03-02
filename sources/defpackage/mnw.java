package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.chimera.Activity;
import com.google.android.chimera.Loader;
import com.google.android.chimera.LoaderManager;
import com.google.android.gms.R;
import com.google.android.gms.family.model.InvitationDataModel;
import com.google.android.gms.family.model.MemberDataModel;
import com.google.android.gms.family.v2.model.PageData;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: mnw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class mnw implements LoaderManager.LoaderCallbacks {
    final /* synthetic */ mob a;

    public mnw(mob mob) {
        this.a = mob;
    }

    public final Loader onCreateLoader(int i, Bundle bundle) {
        Activity activity = this.a.getActivity();
        mob mob = this.a;
        return new mmv(activity, mob.d, mob.c.k(), this.a.c.j());
    }

    public final /* bridge */ /* synthetic */ void onLoadFinished(Loader loader, Object obj) {
        PageData pageData;
        String str;
        String str2;
        int i;
        int i2;
        aucx aucx;
        String str3;
        String str4;
        String str5;
        Long l;
        boolean z;
        int i3;
        mhg mhg = (mhg) obj;
        if (mhg.b) {
            this.a.a.setVisibility(0);
            mob mob = this.a;
            apjn apjn = (apjn) mhg.a;
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            String str6 = apjn.b;
            aucx aucx2 = apjn.h;
            int size = aucx2.size();
            int i4 = 0;
            while (i4 < size) {
                apis apis = (apis) aucx2.get(i4);
                if ((apis.a & 8) == 0) {
                    String valueOf = String.valueOf(apis.b);
                    if (valueOf.length() == 0) {
                        new String("Member profile is null for member: ");
                    } else {
                        "Member profile is null for member: ".concat(valueOf);
                    }
                    ith ith = mfv.a;
                    aucx = aucx2;
                    i2 = size;
                } else {
                    apit apit = apis.d;
                    if (apit == null) {
                        apit = apit.g;
                    }
                    String str7 = apit.d;
                    if (!TextUtils.isEmpty(str7)) {
                        str3 = str7;
                    } else {
                        apit apit2 = apis.d;
                        if (apit2 == null) {
                            apit2 = apit.g;
                        }
                        str3 = apit2.e;
                    }
                    apit apit3 = apis.d;
                    if (apit3 == null) {
                        apit3 = apit.g;
                    }
                    if (apit3.b.isEmpty()) {
                        apit apit4 = apis.d;
                        if (apit4 == null) {
                            apit4 = apit.g;
                        }
                        str4 = apit4.f;
                    } else {
                        apit apit5 = apis.d;
                        if (apit5 == null) {
                            apit5 = apit.g;
                        }
                        str4 = apit5.b;
                    }
                    apit apit6 = apis.d;
                    if (apit6 == null) {
                        apit6 = apit.g;
                    }
                    if (!apit6.c.isEmpty()) {
                        apit apit7 = apis.d;
                        if (apit7 == null) {
                            apit7 = apit.g;
                        }
                        str5 = apit7.c;
                    } else {
                        str5 = str4;
                    }
                    apix a2 = apix.a(apis.c);
                    if (a2 == null) {
                        a2 = apix.UNKNOWN_FAMILY_ROLE;
                    }
                    if (a2 == apix.UNCONFIRMED_MEMBER) {
                        apks apks = apis.i;
                        if (apks == null) {
                            apks = apks.b;
                        }
                        l = Long.valueOf(apks.a);
                    } else {
                        l = 0L;
                    }
                    String str8 = apis.b;
                    apit apit8 = apis.d;
                    if (apit8 == null) {
                        apit8 = apit.g;
                    }
                    String str9 = apit8.f;
                    String str10 = apis.e;
                    apix a3 = apix.a(apis.c);
                    if (a3 == null) {
                        a3 = apix.UNKNOWN_FAMILY_ROLE;
                    }
                    int i5 = a3.g;
                    apix a4 = apix.a(apis.c);
                    if (a4 == null) {
                        a4 = apix.UNKNOWN_FAMILY_ROLE;
                    }
                    aucx = aucx2;
                    if (a4 != apix.PARENT) {
                        i2 = size;
                        Iterator it = new aucu(apis.f, apis.g).iterator();
                        while (true) {
                            if (it.hasNext()) {
                                if (((apix) it.next()) == apix.PARENT) {
                                    z = true;
                                    break;
                                }
                            } else {
                                z = false;
                                break;
                            }
                        }
                    } else {
                        i2 = size;
                        z = true;
                    }
                    apkg apkg = apis.j;
                    if (apkg == null) {
                        apkg = apkg.b;
                    }
                    if (!apkg.a) {
                        apkh apkh = apis.h;
                        if (apkh == null) {
                            apkh = apkh.b;
                        }
                        if (!apkh.a) {
                            i3 = 1;
                            arrayList.add(new MemberDataModel(str8, str9, str4, str5, str3, str10, i5, z, i3, l));
                        }
                    }
                    i3 = 2;
                    arrayList.add(new MemberDataModel(str8, str9, str4, str5, str3, str10, i5, z, i3, l));
                }
                i4++;
                aucx2 = aucx;
                size = i2;
            }
            aucx aucx3 = apjn.i;
            int size2 = aucx3.size();
            int i6 = 0;
            while (i6 < size2) {
                apjv apjv = (apjv) aucx3.get(i6);
                apjx apjx = apjv.c;
                if (apjx == null) {
                    apjx = apjx.d;
                }
                if ((apjv.a & 4) != 0) {
                    apit apit9 = apjv.d;
                    if (apit9 == null) {
                        apit9 = apit.g;
                    }
                    String str11 = apit9.d;
                    if (TextUtils.isEmpty(str11)) {
                        apit apit10 = apjv.d;
                        if (apit10 == null) {
                            apit10 = apit.g;
                        }
                        str11 = apit10.e;
                    }
                    apit apit11 = apjv.d;
                    if (apit11 == null) {
                        apit11 = apit.g;
                    }
                    str = str11;
                    str2 = apit11.b;
                } else {
                    str2 = null;
                    str = null;
                }
                String str12 = apjv.b;
                String str13 = apjx.c;
                String str14 = apjx.b;
                int a5 = apju.a(apjv.i);
                if (a5 != 0) {
                    i = a5;
                } else {
                    i = 1;
                }
                arrayList2.add(new InvitationDataModel(str12, str2, str13, str14, str, i, Long.valueOf(apjv.f)));
                i6++;
                size2 = size2;
                aucx3 = aucx3;
            }
            if ((apjn.a & 32) != 0) {
                apkp apkp = apjn.f;
                if (apkp == null) {
                    apkp = apkp.e;
                }
                pageData = new PageData(apkp);
            } else {
                pageData = null;
            }
            int i7 = apjn.g;
            int a6 = apin.a(apjn.e);
            int i8 = a6 == 0 ? 1 : a6;
            apix apix = apix.UNKNOWN_FAMILY_ROLE;
            mob.h = new mhk(arrayList, arrayList2, i7, i8, str6, apjn.c, pageData);
            this.a.c();
            return;
        }
        this.a.d();
        akax a7 = akax.a(this.a.getView(), (int) R.string.fm_get_family_error, -2);
        a7.a(R.string.common_retry, new mnv(this));
        a7.c();
    }

    public final void onLoaderReset(Loader loader) {
    }
}
