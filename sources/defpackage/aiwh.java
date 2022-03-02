package defpackage;

import android.os.IBinder;
import com.android.location.provider.ActivityRecognitionProvider;
import com.android.location.provider.ActivityRecognitionProviderWatcher;

/* renamed from: aiwh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aiwh implements aiwi {
    public final IBinder a() {
        return ActivityRecognitionProviderWatcher.getInstance().getBinder();
    }

    public final ActivityRecognitionProvider b() {
        return ActivityRecognitionProviderWatcher.getInstance().getActivityRecognitionProvider();
    }
}
