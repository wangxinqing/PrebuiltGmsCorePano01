package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.location.ActivityRecognitionResult;

/* renamed from: aiwk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aiwk extends BroadcastReceiver {
    final /* synthetic */ aiwl a;

    public aiwk(aiwl aiwl) {
        this.a = aiwl;
    }

    public final void onReceive(Context context, Intent intent) {
        ActivityRecognitionResult b = ActivityRecognitionResult.b(intent);
        ahpm ahpm = this.a.a;
        String valueOf = String.valueOf(b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 31);
        sb.append("Received the activity result = ");
        sb.append(valueOf);
        sb.toString();
        if (ahpo.b.g == null) {
            String valueOf2 = String.valueOf(b);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 63);
            sb2.append("Current transition request is null but received an AR result = ");
            sb2.append(valueOf2);
            sb2.toString();
        } else if (axxa.g()) {
            ahpo.b.a(b, false);
            ahpo ahpo = ahpo.b;
            if (axxa.a.a().enableAdaptiveWifiSampling() && ahpo.h) {
                aiwl aiwl = ahpo.i;
                aizy aizy = ahpo.c;
                if (System.currentTimeMillis() - ahpo.e > axxa.a.a().minContinuousTimeIntervalWithConnectedWifi() && ahpo.d && !ahpo.a()) {
                    ahpo.i.a();
                    long d = axwx.d();
                    ahpo.f = d;
                    ahpo.i.a(d);
                } else if (!ahpo.d && ahpo.a()) {
                    ahpo.i.a();
                    long k = axwx.k();
                    ahpo.f = k;
                    ahpo.i.a(k);
                }
            }
        }
    }
}
