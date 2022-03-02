package com.google.android.gms.security.snet;

import android.content.Context;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.common.internal.GetServiceRequest;
import com.google.android.gms.safetynet.HarmfulAppsData;
import com.google.android.gms.safetynet.HarmfulAppsInfo;
import java.util.HashSet;
import java.util.Set;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class SafetyNetClientChimeraService extends aarp {
    public static final Set b = new HashSet();

    public static void a(Context context) {
        context.startService(IntentOperation.getStartIntent(context, OperationLauncherIntentOperation.class, "com.google.android.gms.security.snet.XLB_UPDATE"));
    }

    public final void onDestroy() {
        if (aaum.b) {
            aaum.b();
        }
    }

    public static void a(HarmfulAppsInfo harmfulAppsInfo) {
        b.clear();
        if (harmfulAppsInfo != null) {
            for (HarmfulAppsData harmfulAppsData : harmfulAppsInfo.b) {
                b.add(oq.a(harmfulAppsData.a, new aaae(harmfulAppsData.b)));
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void a(nit nit, GetServiceRequest getServiceRequest) {
        nit.a(new aawo(this, nix.a(), getServiceRequest.d));
    }
}
