package com.google.android.gms.mdi.mobstore;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.internal.GetServiceRequest;
import java.util.Arrays;
import java.util.Collections;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class MobStoreFileService extends nio {
    public Context a;
    private sdw b;

    public MobStoreFileService() {
        super(160, "com.google.android.mobstore.service.START", Collections.emptySet(), 3, 9);
    }

    /* access modifiers changed from: protected */
    public final void a(nit nit, GetServiceRequest getServiceRequest) {
        int i;
        if (axsv.a.a().j()) {
            String str = getServiceRequest.d;
            amsv a2 = amta.a((amsv) new seb(this));
            if (!jhg.b()) {
                hya a3 = hya.a(this.a);
                this.a.getPackageManager();
                i = a3.b(str) ? 1 : 2;
            } else {
                i = 0;
            }
            see see = new see(a2, str, i);
            agzz a4 = ahaa.a(this.a);
            a4.a("mobstore");
            a4.b("mobstore_accounts.pb");
            nit.a(new sec(this, nix.a(), this.b, str, see, new ahan(new agzs(Arrays.asList(new ahcn[]{agzx.a(this.a).a()})), a4.a())));
            return;
        }
        if (Log.isLoggable("MDD", 4)) {
            Log.i("MDD", afsh.a("%s: is disabled", "MobStoreFileService"));
        }
        nit.a(16, (Bundle) null);
    }

    public final void onCreate() {
        this.a = getApplicationContext();
        Context context = this.a;
        this.b = new scd(context, new afsu(context), sce.a(this.a));
    }
}
