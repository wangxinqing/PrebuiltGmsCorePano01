package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.internal.ClientContext;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: wnu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
abstract class wnu implements wnv {
    final /* synthetic */ wnw b;

    public wnu(wnw wnw) {
        this.b = wnw;
    }

    /* access modifiers changed from: protected */
    public abstract wsr a();

    public final boolean a(Context context, xpk xpk, Bundle bundle) {
        Bundle bundle2 = bundle;
        wsr a = a();
        if (a == null) {
            return false;
        }
        xpr b2 = xpr.b(context);
        int size = this.b.d.size();
        Bundle[] bundleArr = new Bundle[size];
        try {
            b2.d();
            int i = 0;
            for (int i2 = 0; i2 < size; i2++) {
                if (a((String) this.b.d.get(i2), this.b.e.e)) {
                    Bundle bundle3 = this.b.e.e;
                    ClientContext clientContext = xpk.a;
                    Bundle bundle4 = new Bundle();
                    wne.a(b2, a, bundle3, clientContext, new wns(bundle4, a), new wnt());
                    bundleArr[i2] = bundle4;
                    i++;
                }
            }
            if (i > 0) {
                if (bundle2.containsKey("get.server_blob")) {
                    ArrayList parcelableArrayList = bundle2.getParcelableArrayList("get.server_blob");
                    for (int i3 = 0; i3 < parcelableArrayList.size(); i3++) {
                        Bundle bundle5 = (Bundle) parcelableArrayList.get(i3);
                        if (bundle5 != null) {
                            if (!bundle5.isEmpty()) {
                                bundleArr[i3] = bundle5;
                            }
                        }
                    }
                }
                long ac = aywy.a.a().ac();
                TimeUnit timeUnit = TimeUnit.SECONDS;
                iyq f = b2.f();
                if (f != null) {
                    if (!f.d.await(ac, timeUnit)) {
                        Log.e("BasePeopleOperation", "Timed out waiting for server response.");
                    }
                }
                bundle2.putParcelableArrayList("get.server_blob", new ArrayList(Arrays.asList(bundleArr)));
                return true;
            }
            b2.f();
            return false;
        } catch (TimeoutException e) {
            Log.e("BasePeopleOperation", "Request Timed Out", e);
            return false;
        }
    }

    /* access modifiers changed from: protected */
    public abstract boolean a(String str, Bundle bundle);
}
