package defpackage;

import android.content.Context;
import android.os.Bundle;
import com.google.android.chimera.Fragment;
import java.util.ArrayList;
import java.util.Collection;

/* renamed from: czv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class czv extends des {
    public did a;
    public czw b;
    crx c;

    public static czv a(aqsr aqsr, dih dih, String str) {
        czv czv = new czv();
        Bundle bundle = new Bundle();
        bundle.putByteArray("initialScreenKey", csm.b(aqsr));
        if (dio.a(dih)) {
            bundle.putString("initialAccountName", dih.a);
        }
        bundle.putString("callingAndroidApp", str);
        czv.setArguments(bundle);
        return czv;
    }

    public final void onCreate(Bundle bundle) {
        dhk dhk;
        int i;
        dhk dhk2;
        dhh dhh;
        Object obj;
        Bundle bundle2 = bundle;
        super.onCreate(bundle);
        setRetainInstance(true);
        if (this.c == null) {
            this.c = crv.a(this.l);
        }
        Context applicationContext = getActivity().getApplicationContext();
        this.b = new czw(applicationContext, (cuj) this.c.a.a());
        cvm a2 = cvm.a(getArguments().getString("callingAndroidApp"));
        if (bundle2 != null) {
            czw czw = this.b;
            cuj cuj = czw.a;
            ctf ctf = czw.b;
            djs djs = czw.c;
            dih a3 = dio.a(bundle2.getString("accountName"));
            aqsr a4 = csm.a(bundle2.getByteArray("navStackHead"));
            ArrayList parcelableArrayList = bundle2.getParcelableArrayList("navStackTail");
            ArrayList arrayList = new ArrayList();
            int size = parcelableArrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Bundle bundle3 = (Bundle) parcelableArrayList.get(i2);
                ArrayList arrayList2 = parcelableArrayList;
                aqsr a5 = csm.a(bundle3.getByteArray("screenKey"));
                aqsr b2 = csm.b(bundle3.getByteArray("topNavKey"));
                aqsr b3 = csm.b(bundle3.getByteArray("bottomNavKey"));
                aqsr b4 = csm.b(bundle3.getByteArray("bottomNavSelection"));
                Bundle bundle4 = (Bundle) bundle3.getParcelable("fragmentState");
                if (bundle4 != null) {
                    i = size;
                    dhk2 = dhk;
                    dhh = new dhh(bundle4.getString("className"), (Fragment.SavedState) bundle4.getParcelable("savedState"), bundle4.getBoolean("headerCollapsed"));
                } else {
                    i = size;
                    dhk2 = dhk;
                    dhh = null;
                }
                new dhk(a5, b2, b3, b4, dhh);
                arrayList.add(obj);
                i2++;
                parcelableArrayList = arrayList2;
                size = i;
            }
            this.a = new did(applicationContext, cuj, a3, a2, a4, arrayList, dia.values()[bundle2.getInt("splashScreenUIState")], djs, ctf);
            return;
        }
        aqsr a6 = csm.a(getArguments().getByteArray("initialScreenKey"));
        czw czw2 = this.b;
        this.a = new did(applicationContext, czw2.a, dio.a(getArguments().getString("initialAccountName")), a2, a6, amzy.h(), dia.BRANDING, czw2.c, czw2.b);
    }

    public final void onDestroy() {
        this.b.b();
        super.onDestroy();
    }

    public final void onSaveInstanceState(Bundle bundle) {
        Bundle bundle2;
        super.onSaveInstanceState(bundle);
        did did = this.a;
        if (dio.a(did.a.b())) {
            bundle.putString("accountName", did.a.b().a);
        }
        bundle.putByteArray("navStackHead", csm.b(did.c.b()));
        amzy a2 = amzy.a((Collection) did.c.c);
        ArrayList arrayList = new ArrayList();
        int size = a2.size();
        for (int i = 0; i < size; i++) {
            dhk dhk = (dhk) a2.get(i);
            Bundle bundle3 = new Bundle();
            bundle3.putByteArray("screenKey", csm.b(dhk.a));
            bundle3.putByteArray("topNavKey", csm.c(dhk.b));
            bundle3.putByteArray("bottomNavKey", csm.c(dhk.c));
            bundle3.putByteArray("bottomNavSelection", csm.c(dhk.d));
            dhh dhh = dhk.e;
            if (dhh != null) {
                bundle2 = new Bundle();
                bundle2.putString("className", dhh.a);
                bundle2.putParcelable("savedState", dhh.b);
                bundle2.putBoolean("headerCollapsed", dhh.c);
            } else {
                bundle2 = null;
            }
            bundle3.putParcelable("fragmentState", bundle2);
            arrayList.add(bundle3);
        }
        bundle.putParcelableArrayList("navStackTail", arrayList);
        bundle.putInt("splashScreenUIState", did.f.a().ordinal());
    }
}
