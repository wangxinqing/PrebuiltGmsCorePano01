package com.google.android.location.movement;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.location.ActivityRecognitionResult;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ActivityDetector$Receiver extends nla {
    final /* synthetic */ aisl a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ActivityDetector$Receiver(aisl aisl) {
        super("location");
        this.a = aisl;
    }

    public final void a(Context context, Intent intent) {
        synchronized (this.a.h) {
            String action = intent.getAction();
            if (asvl.a("com.google.android.location.internal.action.GEOFENCER_AR_RESULT").equals(action)) {
                ActivityRecognitionResult b = ActivityRecognitionResult.b(intent);
                intent.getBooleanExtra("is_mock_for_testing", false);
                boolean z = this.a.a;
                this.a.g.a(b);
            } else if ("com.google.android.location.internal.server.ACTION_RESTARTED".equals(action)) {
                aisl aisl = this.a;
                int i = aisl.j;
                if (i > 0) {
                    aisl.a(i, true, aisl.k);
                }
            } else {
                boolean z2 = aikq.a;
            }
        }
    }
}
