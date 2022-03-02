package com.google.android.location.fused;

import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.os.WorkSource;
import android.util.Log;
import com.google.android.gms.location.ActivityRecognitionResult;
import com.google.android.gms.location.NetworkLocationStatus;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class NlpRequestHelper$DataReceiver extends nla {
    final /* synthetic */ aifw a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NlpRequestHelper$DataReceiver(aifw aifw) {
        super("location");
        this.a = aifw;
    }

    public final void a(Context context, Intent intent) {
        ArrayList arrayList;
        List list;
        WorkSource workSource;
        aifw aifw = this.a;
        if (aifw.h && (workSource = aifw.k) != null) {
            aifw.f.c(workSource);
        }
        String action = intent.getAction();
        if (action.equals(asvl.a("com.google.android.location.internal.action.FLP_AR_RESULT"))) {
            ActivityRecognitionResult b = ActivityRecognitionResult.b(intent);
            if (b != null) {
                this.a.e.a(3, 0, 0, 0, b);
            }
        } else if (action.equals(asvl.a("com.google.android.location.internal.action.ACTION_FLP_COMPUTE_WIFI_LOCATIONS_RESULT"))) {
            this.a.e.a(32, 4, -1, -1, intent.getParcelableArrayListExtra("com.google.android.location.internal.EXTRA_COMPUTE_WIFI_LOCATIONS_RESPONSE_PARCELABLE_ARRAY_LIST"));
        } else if (action.equals(asvl.a("com.google.android.location.internal.action.FLP_FULL_POWER_LOCATION_RESULT")) && intent.hasExtra("com.google.android.location.internal.LOCATION_STATUS")) {
            ArrayList b2 = ivy.b(intent, "com.google.android.location.internal.LOCATION_STATUS", NetworkLocationStatus.CREATOR);
            if (b2 != null) {
                this.a.e.a(4, 2, -1, -1, (NetworkLocationStatus[]) b2.toArray(new NetworkLocationStatus[b2.size()]));
            }
        } else if (action.equals(asvl.a("com.google.android.location.internal.action.FLP_LOW_POWER_LOCATION_RESULT"))) {
            if (intent.hasExtra("com.google.android.location.internal.EXTRA_LOCATION_LIST")) {
                arrayList = intent.getParcelableArrayListExtra("com.google.android.location.internal.EXTRA_LOCATION_LIST");
            } else {
                Location a2 = atiq.a(intent);
                atiq.a(a2, false);
                if (a2 != null) {
                    if (rev.i(a2) == 3 && !rev.d(a2, "wifiScan")) {
                        String valueOf = String.valueOf(a2);
                        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 33);
                        sb.append("No debug info returned from NLP: ");
                        sb.append(valueOf);
                        Log.wtf("GCoreFlp", new IllegalStateException(sb.toString()));
                    }
                    list = Collections.singletonList(a2);
                } else {
                    list = null;
                }
                arrayList = list;
            }
            if (arrayList != null) {
                this.a.e.a(5, 1, 0, 0, arrayList);
            }
            aifw aifw2 = this.a;
            if (aifw2.m) {
                aifw2.m = false;
                aifw2.e.a(5, 3, 0, 0, (Object) null);
            }
        }
    }
}
