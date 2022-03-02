package defpackage;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.os.Looper;
import com.google.android.location.collectionlib.RealCollectorConfig;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: ahut  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ahut extends ahuo {
    public final ahuu a;
    private final Map b;
    private final ahvk c;
    private final ahus d = new ahus(this);
    private final ahtn e;

    public ahut(Context context, ahvk ahvk, Map map, ahuu ahuu, ahsr ahsr, ahss ahss, ajrh ajrh) {
        super(ahsr, ahss, ajrh);
        amrl.a((Object) context);
        amrl.a((Object) map);
        this.c = ahvk;
        this.b = new HashMap(map);
        this.e = new ahtn(context);
        this.a = ahuu;
    }

    public static ahup a(int i) {
        ahup ahup = (ahup) RealCollectorConfig.b.get(Integer.valueOf(i));
        return ahup == null ? ahup.UNKNOWN : ahup;
    }

    /* access modifiers changed from: protected */
    public final void b() {
        if (this.c == null) {
            try {
                this.e.a((SensorEventListener) this.d);
            } catch (IllegalArgumentException e2) {
            }
        }
        ahss ahss = this.i;
        if (ahss != null) {
            ahss.e();
        }
    }

    /* access modifiers changed from: protected */
    public final void a() {
        if (this.e != null) {
            for (Map.Entry entry : this.b.entrySet()) {
                ahtn ahtn = this.e;
                List<Sensor> sensorList = ahtn.a.getSensorList(((Integer) entry.getKey()).intValue());
                if (sensorList != null && sensorList.size() > 0) {
                    Sensor sensor = sensorList.get(0);
                    ahvk ahvk = this.c;
                    if (ahvk != null) {
                        ahus ahus = this.d;
                        Object obj = this.h;
                        if (ahus != null) {
                            synchronized (ahvk.a) {
                                if (obj == null) {
                                    obj = new qvr(Looper.getMainLooper());
                                }
                                ahvk.e.put(Integer.valueOf(sensor.getType()), aiba.a(ahus, obj));
                            }
                        } else {
                            continue;
                        }
                    } else if (!this.e.a(this.d, sensor, ((Integer) entry.getValue()).intValue(), this.h)) {
                        String valueOf = String.valueOf(entry.getKey());
                        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 27);
                        sb.append("Failed to listen to sensor ");
                        sb.append(valueOf);
                        sb.toString();
                    }
                }
            }
        }
        ahss ahss = this.i;
        if (ahss != null) {
            ahss.f();
        }
    }
}
