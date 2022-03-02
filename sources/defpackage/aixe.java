package defpackage;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.location.LocationManager;
import android.os.Handler;
import com.google.android.location.collectionlib.RealCollectorConfig;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: aixe  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aixe implements ajbf {
    public final Object a = new Object();
    public final ajbg b;
    public final Map c = new HashMap();
    public final SensorManager d;
    public final Context e;
    public Handler f;
    private final aizz g;
    private final boolean h;
    private final LocationManager i;

    public aixe(Context context, ajbg ajbg, aizz aizz, boolean z) {
        this.e = context;
        this.b = ajbg;
        this.d = (SensorManager) context.getSystemService("sensor");
        this.i = (LocationManager) context.getSystemService("location");
        this.g = aizz;
        this.h = z;
    }

    public final ahtm a(String str, ahry ahry, String str2) {
        String b2 = aiwa.b(this.e.getApplicationContext());
        if (b2 == null) {
            return null;
        }
        return new ahrs(this.e, this.b, str, b2, this.g.b(), ahry, this.f.getLooper(), new ajrh(str2));
    }

    public final boolean b() {
        boolean z;
        boolean z2;
        List<String> allProviders;
        SensorManager sensorManager = this.d;
        LocationManager locationManager = this.i;
        if (sensorManager != null) {
            List<Sensor> sensorList = sensorManager.getSensorList(4);
            if (sensorList == null || sensorList.isEmpty()) {
                z = false;
            } else {
                z = true;
            }
            List<Sensor> sensorList2 = sensorManager.getSensorList(1);
            if (sensorList2 == null || sensorList2.isEmpty()) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (locationManager == null || (allProviders = locationManager.getAllProviders()) == null || !allProviders.contains("gps") || !z || !z2) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int c(ahup ahup) {
        Integer num = (Integer) RealCollectorConfig.a.get(ahup);
        if (num != null) {
            return aiyk.g.b(this.d, num.intValue());
        }
        return 0;
    }

    public final boolean a() {
        List<Sensor> sensorList = this.d.getSensorList(1);
        return sensorList != null && sensorList.size() > 0;
    }

    public final boolean b(ahup ahup) {
        Integer num = (Integer) RealCollectorConfig.a.get(ahup);
        if (num == null) {
            return false;
        }
        if (this.h) {
            if (!axwx.a.a().sensorBatchingOnWatchEnabled()) {
                return false;
            }
        } else if (!axwx.a.a().sensorBatchingEnabled()) {
            return false;
        }
        return aiyk.g.a(this.d, num.intValue());
    }

    public final boolean a(ahup ahup) {
        List<Sensor> sensorList;
        Integer num = (Integer) RealCollectorConfig.a.get(ahup);
        if (num != null) {
            SensorManager sensorManager = this.d;
            int intValue = num.intValue();
            if (sensorManager == null || (sensorList = sensorManager.getSensorList(intValue)) == null || sensorList.size() <= 0) {
                return false;
            }
            return true;
        }
        return false;
    }
}
