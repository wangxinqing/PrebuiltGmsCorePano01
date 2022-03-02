package com.google.android.gms.update.pano.api;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.internal.GetServiceRequest;
import java.util.Set;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class SystemUpdateTvApiChimeraService extends nio {
    private static final iwd a = adnt.i("SystemUpdateTvApiChimeraService");

    /* access modifiers changed from: protected */
    public final void a(nit nit, GetServiceRequest getServiceRequest) {
        a.a("onGetService", new Object[0]);
        if (ayqb.a.a().a()) {
            String str = getServiceRequest.d;
            boolean contains = ayqb.a.a().b().a.contains(str);
            boolean b = hya.a((Context) this).b(str);
            if (contains && b) {
                iwd iwd = a;
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 28);
                sb.append("Package ");
                sb.append(str);
                sb.append(" is allowed to bind.");
                iwd.a(sb.toString(), new Object[0]);
                a.a("Client is valid. Connecting.", new Object[0]);
                nit.a(new adop(this));
                return;
            }
            iwd iwd2 = a;
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 32);
            sb2.append("Package ");
            sb2.append(str);
            sb2.append(" is not allowed to bind.");
            iwd2.e(sb2.toString(), new Object[0]);
            a.d("Client is invalid.", new Object[0]);
            nit.a(16, new Bundle());
            return;
        }
        a.d("Feature is not enabled.", new Object[0]);
        nit.a(16, new Bundle());
    }

    public SystemUpdateTvApiChimeraService() {
        super(207, "com.google.android.gms.update.START_TV_API_SERVICE", (Set) anfv.a, 1, 9);
    }
}
