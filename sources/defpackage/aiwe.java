package defpackage;

import com.android.location.provider.ActivityRecognitionProvider;
import com.android.location.provider.ActivityRecognitionProviderClient;

/* renamed from: aiwe  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aiwe extends ActivityRecognitionProviderClient {
    public final void onProviderChanged(boolean z, ActivityRecognitionProvider activityRecognitionProvider) {
        synchronized (aiwf.a) {
            StringBuilder sb = new StringBuilder(36);
            sb.append("onProviderChanged: isSupported=");
            sb.append(z);
            sb.toString();
            aiwf.b = activityRecognitionProvider;
        }
    }
}
