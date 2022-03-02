package defpackage;

import android.content.Context;
import android.hardware.SensorManager;
import android.os.PowerManager;
import com.android.location.provider.ActivityRecognitionProviderWatcher;

/* renamed from: aixx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class aixx extends aixw {
    public aiwi a() {
        if (axwl.b()) {
            return new aiwg();
        }
        try {
            ActivityRecognitionProviderWatcher.class.getName();
            return new aiwh();
        } catch (NoClassDefFoundError e) {
            return super.a();
        }
    }

    public final aixl b(SensorManager sensorManager, ajbg ajbg, aicn aicn) {
        return new aixl(sensorManager, ajbg, aicn);
    }

    public final ajaj a(arnf arnf, Context context, ajbg ajbg, aicn aicn) {
        aizc a = aizc.a(arnf, context, ajbg, aicn);
        if (a != null) {
            return a;
        }
        try {
            return new aivz(ajbg, aicn);
        } catch (Exception e) {
            return new ajax();
        }
    }

    public final boolean a(PowerManager powerManager) {
        return powerManager.isPowerSaveMode();
    }
}
