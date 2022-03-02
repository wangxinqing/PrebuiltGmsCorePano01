package defpackage;

import android.os.Bundle;
import android.os.SystemClock;
import com.google.android.gms.location.ActivityRecognitionResult;
import com.google.android.gms.location.DetectedActivity;
import java.util.Locale;

/* renamed from: aiww  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aiww implements Runnable {
    final /* synthetic */ arnh a;
    final /* synthetic */ aiwx b;
    final /* synthetic */ arnt c;

    public aiww(aiwx aiwx, arnh arnh, arnt arnt) {
        this.b = aiwx;
        this.a = arnh;
        this.c = arnt;
    }

    public final void run() {
        Locale locale = Locale.ENGLISH;
        int i = 0;
        new Object[1][0] = Long.valueOf(this.a.a());
        armk armk = (armk) this.c.a((auef) armk.b.c(7));
        if (armk != null) {
            String valueOf = String.valueOf(armk);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 35);
            sb.append("onMessageReceived: offBodyResult = ");
            sb.append(valueOf);
            sb.toString();
            ajan ajan = this.b.a.b;
            if (ajan != null) {
                boolean z = armk.a;
                ahix ahix = (ahix) ajan;
                ajao ajao = ahix.av;
                if (ajao != null && ajao.c) {
                    if (z) {
                        i = 100;
                    }
                    ahix.a(new ActivityRecognitionResult(new DetectedActivity(9, i), System.currentTimeMillis(), SystemClock.elapsedRealtime(), ahnk.WATCH_HARDWARE_OFF_BODY_GCORE_V6.am, (Bundle) null));
                    ahix.am = SystemClock.elapsedRealtime();
                    ahix.q.C();
                    StringBuilder sb2 = new StringBuilder(42);
                    sb2.append("reported OFF_BODY confidence = ");
                    sb2.append(i);
                    sb2.toString();
                }
            }
        }
    }
}
