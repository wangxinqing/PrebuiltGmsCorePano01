package com.google.android.gms.ads.measurement;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.ads.internal.util.client.c;
import com.google.android.gms.ads.measurement.service.b;
import com.google.android.gms.common.internal.GetServiceRequest;
import com.google.android.gms.measurement.module.Analytics;
import java.util.Collections;
import java.util.Set;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class a extends irg {
    final /* synthetic */ GmpConversionTrackingBrokerChimeraService a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    protected a(GmpConversionTrackingBrokerChimeraService gmpConversionTrackingBrokerChimeraService, Context context) {
        super(context, 95, new int[0]);
        this.a = gmpConversionTrackingBrokerChimeraService;
    }

    /* access modifiers changed from: protected */
    public final Set a() {
        return Collections.emptySet();
    }

    /* access modifiers changed from: protected */
    public final void a(isv isv, GetServiceRequest getServiceRequest) {
        b bVar;
        hya.a(this.d).a(getServiceRequest.d);
        GmpConversionTrackingBrokerChimeraService gmpConversionTrackingBrokerChimeraService = this.a;
        synchronized (b.a) {
            if (b.b == null) {
                if (gmpConversionTrackingBrokerChimeraService.getApplicationContext() != null) {
                    gmpConversionTrackingBrokerChimeraService.getApplicationContext();
                }
                b.b = new b(Analytics.getInstance(gmpConversionTrackingBrokerChimeraService), svv.a((Context) gmpConversionTrackingBrokerChimeraService));
            }
            bVar = b.b;
        }
        try {
            isv.a(0, (IBinder) bVar, (Bundle) null);
        } catch (RemoteException e) {
            if (c.a(5)) {
                Log.w("Ads", "Client died while brokering conversion tracking service.", e);
            }
        }
    }
}
