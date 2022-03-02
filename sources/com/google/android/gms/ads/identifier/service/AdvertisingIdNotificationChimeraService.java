package com.google.android.gms.ads.identifier.service;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.ads.identifier.settings.e;
import com.google.android.gms.ads.internal.b;
import com.google.android.gms.ads.internal.config.n;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.framework.tracing.wrapper.TracingIntentService;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Semaphore;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class AdvertisingIdNotificationChimeraService extends TracingIntentService {
    private e a = e.a((Context) ihs.b());
    private final Semaphore b = new Semaphore(1);

    public AdvertisingIdNotificationChimeraService() {
        super("AdvertisingIdNS");
        n.a(ihs.b());
    }

    public final void a(Intent intent) {
        Semaphore semaphore;
        if (awhh.a.a().r()) {
            long longExtra = intent.getLongExtra("time_since_last_update", -1);
            Bundle bundle = new Bundle();
            bundle.putString("lat", !this.a.i() ? "0" : "1");
            bundle.putString("tslu", Long.toString(longExtra));
            b.a().a(this, (String) null, "gmob-apps", bundle);
        }
        List<ResolveInfo> queryIntentServices = getPackageManager().queryIntentServices(new Intent("com.google.android.gms.ads.identifier.BIND_LISTENER"), 0);
        HashSet<String> hashSet = new HashSet<>();
        for (ResolveInfo resolveInfo : queryIntentServices) {
            hashSet.add(resolveInfo.serviceInfo.packageName);
        }
        for (String str : hashSet) {
            a aVar = new a(str, this.a, this, this.b);
            if (!awhh.a.a().p() || hya.a(aVar.c).b(aVar.a)) {
                ClientContext clientContext = new ClientContext();
                String str2 = aVar.a;
                clientContext.e = str2;
                clientContext.b = jhg.i(aVar.c, str2);
                if (ixk.a(aVar.c, clientContext).a("com.google.android.gms.permission.AD_ID_NOTIFICATION") == 0) {
                    List<ResolveInfo> queryIntentServices2 = aVar.c.getPackageManager().queryIntentServices(aVar.b, 0);
                    if (queryIntentServices2.size() > 1) {
                        String str3 = aVar.a;
                        StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 76);
                        sb.append("Unable to pick AdvertisingIdListenerService for ");
                        sb.append(str3);
                        sb.append(", too many services defined.");
                        Log.w("AdvertisingIdNS", sb.toString());
                    }
                    if (queryIntentServices2.size() == 1) {
                        try {
                            aVar.d.acquire();
                            try {
                                if (jca.a().a(aVar.c, aVar.b, aVar, 1)) {
                                }
                            } catch (SecurityException e) {
                                String str4 = aVar.a;
                                String message = e.getMessage();
                                StringBuilder sb2 = new StringBuilder(String.valueOf(str4).length() + 26 + String.valueOf(message).length());
                                sb2.append("Fail to bind to package ");
                                sb2.append(str4);
                                sb2.append(". ");
                                sb2.append(message);
                                Log.v("AdvertisingIdNS", sb2.toString());
                            }
                            aVar.d.release();
                        } catch (InterruptedException e2) {
                        }
                    } else {
                        String valueOf = String.valueOf(str);
                        Log.w("AdvertisingIdNS", valueOf.length() == 0 ? new String("Does not have proper listener service. Package ") : "Does not have proper listener service. Package ".concat(valueOf));
                    }
                }
            }
            String valueOf2 = String.valueOf(str);
            Log.w("AdvertisingIdNS", valueOf2.length() == 0 ? new String("Permission denied. Package ") : "Permission denied. Package ".concat(valueOf2));
        }
        try {
            this.b.acquire(1);
            semaphore = this.b;
        } catch (InterruptedException e3) {
            semaphore = this.b;
        } catch (Throwable th) {
            this.b.release(1);
            throw th;
        }
        semaphore.release(1);
    }
}
