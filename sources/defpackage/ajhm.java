package defpackage;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.os.SystemClock;
import com.google.android.ulr.ApiActivationChange;
import com.google.android.ulr.ApiBleScanReport;
import com.google.android.ulr.ApiDeviceConnectivitySetting;
import com.google.android.ulr.ApiInternalState;
import com.google.android.ulr.ApiLocationStatus;
import com.google.android.ulr.ApiMetadata;
import com.google.android.ulr.ApiPlaceInferenceResult;
import com.google.android.ulr.ApiPlaceReport;
import com.google.android.ulr.ApiRate;
import com.google.android.ulr.ApiStepCountsEntry;
import com.google.android.ulr.ApiWifiConnectivityStatus;
import com.google.android.ulr.LocationHistorianBatchData;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: ajhm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ajhm implements SensorEventListener {
    final /* synthetic */ ajhn a;

    public ajhm(ajhn ajhn) {
        this.a = ajhn;
    }

    public final void onAccuracyChanged(Sensor sensor, int i) {
        if (sensor.getType() == 19) {
            ajhn.d = i;
            int i2 = ajhn.d;
            StringBuilder sb = new StringBuilder(37);
            sb.append("Current sensor status is: ");
            sb.append(i2);
            sb.toString();
        }
    }

    public final void onSensorChanged(SensorEvent sensorEvent) {
        int length;
        SensorEvent sensorEvent2 = sensorEvent;
        if (sensorEvent2.sensor.getType() != 19) {
            int type = sensorEvent2.sensor.getType();
            StringBuilder sb = new StringBuilder(32);
            sb.append("Not step count event:");
            sb.append(type);
            sb.toString();
            return;
        }
        ajhn ajhn = this.a;
        long j = sensorEvent2.timestamp;
        float[] fArr = sensorEvent2.values;
        if (fArr == null || (length = fArr.length) == 0) {
            ajix.c("GCoreUlr", "Get invalid step counts update!");
            return;
        }
        int i = (int) fArr[length - 1];
        StringBuilder sb2 = new StringBuilder(72);
        sb2.append("Get ");
        sb2.append(length);
        sb2.append(" step counts updates and latest step count is ");
        sb2.append(i);
        sb2.toString();
        if (ajhn.e == -1) {
            ajhn.e = SystemClock.elapsedRealtime();
        } else if (SystemClock.elapsedRealtime() - ajhn.e >= TimeUnit.SECONDS.toMillis(azsm.b())) {
            List b = ajhn.b.b();
            if (b.isEmpty()) {
                ajix.a("GCoreUlr", "There is no active accounts!");
                return;
            }
            int i2 = ajhn.d;
            ApiMetadata apiMetadata = r7;
            ApiMetadata apiMetadata2 = new ApiMetadata((ApiActivationChange) null, (ApiBleScanReport) null, (ApiDeviceConnectivitySetting) null, (ApiInternalState) null, (LocationHistorianBatchData) null, (ApiLocationStatus) null, (ApiPlaceInferenceResult) null, (ApiPlaceReport) null, (ApiRate) null, new ApiStepCountsEntry(i2 != -1 ? i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? "UNKNOWN" : "SENSOR_STATUS_ACCURACY_HIGH" : "SENSOR_STATUS_ACCURACY_MEDIUM" : "SENSOR_STATUS_ACCURACY_LOW" : "SENSOR_STATUS_UNRELIABLE" : "SENSOR_STATUS_NO_CONTACT", Integer.valueOf(ajhn.g)), Long.valueOf(ajhn.f), (ApiWifiConnectivityStatus) null, (ArrayList) null);
            ApiMetadata apiMetadata3 = apiMetadata;
            ajhn.a.a(b, apiMetadata3, "StepCountsMetaData");
            ajhn.e = SystemClock.elapsedRealtime();
            String valueOf = String.valueOf(apiMetadata3);
            long millis = TimeUnit.SECONDS.toMillis(azsm.b());
            StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf).length() + 61);
            sb3.append("Record new step count:");
            sb3.append(valueOf);
            sb3.append(" record period(ms):");
            sb3.append(millis);
            sb3.toString();
        }
        ajhn.f = System.currentTimeMillis() - (SystemClock.elapsedRealtime() - TimeUnit.NANOSECONDS.toMillis(j));
        ajhn.g = i;
    }
}
