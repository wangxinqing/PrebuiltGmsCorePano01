package com.google.android.location.activity;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.location.ActivityRecognitionResult;
import com.google.android.gms.location.DetectedActivity;
import java.util.ArrayList;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ActivityRecognitionHelper$LastActivityReceiver extends nla {
    final /* synthetic */ ahjj a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ActivityRecognitionHelper$LastActivityReceiver(ahjj ahjj) {
        super("location");
        this.a = ahjj;
    }

    public final void a(Context context, Intent intent) {
        if (ActivityRecognitionResult.a(intent)) {
            ActivityRecognitionResult b = ActivityRecognitionResult.b(intent);
            ArrayList arrayList = new ArrayList();
            for (DetectedActivity detectedActivity : b.a) {
                int a2 = detectedActivity.a();
                if (a2 == 0 || a2 == 1 || a2 == 2 || a2 == 3 || a2 == 4 || a2 == 7 || a2 == 8 || a2 == 16 || a2 == 17) {
                    arrayList.add(detectedActivity);
                }
            }
            if (!arrayList.isEmpty()) {
                this.a.b = new ActivityRecognitionResult(arrayList, b.b, b.c, b.c());
            }
        }
    }
}
