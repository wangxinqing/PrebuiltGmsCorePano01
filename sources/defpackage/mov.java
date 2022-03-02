package defpackage;

import android.os.Bundle;
import com.google.android.chimera.Activity;
import com.google.android.chimera.Loader;
import com.google.android.chimera.LoaderManager;
import com.google.android.gms.family.model.MemberDataModel;
import java.util.ArrayList;
import java.util.List;

/* renamed from: mov  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class mov implements LoaderManager.LoaderCallbacks {
    final /* synthetic */ mow a;
    private final String b;
    private final apix c;

    public mov(mow mow, String str, apix apix) {
        this.a = mow;
        apix apix2 = apix.UNKNOWN_FAMILY_ROLE;
        this.b = str;
        this.c = apix;
    }

    public final Loader onCreateLoader(int i, Bundle bundle) {
        Activity activity = this.a.getActivity();
        mow mow = this.a;
        return new mpq(activity, mow.b, mow.d.k(), this.a.d.j(), this.b, this.c);
    }

    public final /* bridge */ /* synthetic */ void onLoadFinished(Loader loader, Object obj) {
        mhg mhg = (mhg) obj;
        this.a.c();
        mow mow = this.a;
        mou mou = mow.d;
        if (mou != null) {
            if (mhg.b) {
                mou.h();
                ArrayList arrayList = this.a.c;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    MemberDataModel memberDataModel = (MemberDataModel) arrayList.get(i);
                    if (memberDataModel.a.equals(this.b)) {
                        memberDataModel.g = this.c.g;
                    } else if (this.c == apix.PARENT && memberDataModel.g == 2) {
                        memberDataModel.g = 3;
                    }
                }
            } else {
                mow.e();
                this.a.d();
            }
            this.a.a.c();
            mow mow2 = this.a;
            mor mor = mow2.a;
            mor.a = mow2.c;
            mor.g = null;
            List list = mor.a;
            int size2 = list.size();
            for (int i2 = 0; i2 < size2; i2++) {
                MemberDataModel memberDataModel2 = (MemberDataModel) list.get(i2);
                if (memberDataModel2.g == 2) {
                    mor.g = memberDataModel2;
                    String valueOf = String.valueOf(memberDataModel2.c);
                    mfv.c("ManageParentsAdapter", valueOf.length() == 0 ? new String("Updating currentParent to ") : "Updating currentParent to ".concat(valueOf), new Object[0]);
                }
            }
        }
    }

    public final void onLoaderReset(Loader loader) {
    }
}
