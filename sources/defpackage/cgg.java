package defpackage;

import android.location.GpsSatellite;
import android.location.GpsStatus;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: cgg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class cgg implements Runnable {
    private final cgj a;
    private final GpsStatus b;

    public cgg(cgj cgj, GpsStatus gpsStatus) {
        this.a = cgj;
        this.b = gpsStatus;
    }

    public final void run() {
        cgj cgj = this.a;
        GpsStatus gpsStatus = this.b;
        long nanos = TimeUnit.MILLISECONDS.toNanos(System.currentTimeMillis());
        if (gpsStatus != null) {
            cgu cgu = new cgu();
            for (GpsSatellite next : gpsStatus.getSatellites()) {
                int prn = next.getPrn();
                float snr = next.getSnr();
                boolean usedInFix = next.usedInFix();
                if (prn > 0 && prn <= 31) {
                    cgu.a.add(Float.valueOf(snr));
                    if (usedInFix) {
                        cgu.b++;
                    }
                }
            }
            List list = cgu.a;
            Float valueOf = Float.valueOf(-5.0f);
            ArrayList arrayList = new ArrayList(list);
            Collections.sort(arrayList, Collections.reverseOrder());
            cgt cgt = new cgt(nanos, cgw.a(arrayList, valueOf), cgu.b);
            if (cgt.b.isEmpty() || ((Float) cgt.b.get(0)).floatValue() != 0.0f) {
                cgj.d = 0;
            } else {
                int i = cgj.d + 1;
                cgj.d = i;
                if (i <= 4) {
                    return;
                }
            }
            cgj.c = cgt;
            cgm cgm = cgj.f;
            cgt cgt2 = cgj.c;
            cgm.a.a();
            return;
        }
        Log.e("IndoorOutdoorPredictor", "", new IllegalStateException("Null scan results found inside onGpsStatusChanged()"));
    }
}
