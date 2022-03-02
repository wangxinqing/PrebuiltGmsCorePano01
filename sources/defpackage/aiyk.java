package defpackage;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.hardware.SensorManager;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.net.wifi.RttManager;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Looper;
import android.os.PowerManager;
import android.telephony.TelephonyManager;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: aiyk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class aiyk {
    public static final aiyk g;

    static {
        int i = Build.VERSION.SDK_INT;
        if (jkr.h()) {
            g = new aiyj();
        } else if (i >= 28) {
            g = new aiye();
        } else if (i >= 26) {
            g = new aiyb();
        } else if (i >= 24) {
            g = new aiya();
        } else if (i >= 23) {
            g = new aixz();
        } else if (i >= 22) {
            g = new aixy();
        } else {
            g = new aixx();
        }
    }

    protected aiyk() {
    }

    public int a(String str) {
        throw null;
    }

    public long a(Location location) {
        throw null;
    }

    public aibv a(RttManager.RttResult rttResult) {
        return null;
    }

    public aixs a(ScanResult scanResult) {
        throw null;
    }

    public aizo a(BluetoothDevice bluetoothDevice) {
        throw null;
    }

    public ajaj a(arnf arnf, Context context, ajbg ajbg, aicn aicn) {
        throw null;
    }

    public ajbi a(SensorManager sensorManager, ajbg ajbg, aicn aicn) {
        throw null;
    }

    public void a(aiax aiax) {
    }

    public void a(AlarmManager alarmManager, long j, long j2, PendingIntent pendingIntent, aizx aizx) {
        throw null;
    }

    public void a(Context context, aixt aixt, boolean z, aizx aizx, boolean z2, aicn aicn, Executor executor) {
        throw null;
    }

    public void a(Context context, aibp[] aibpArr, RttManager.RttListener rttListener, aicn aicn, Executor executor) {
    }

    public void a(Location location, float f) {
    }

    public void a(Location location, long j) {
    }

    public void a(TelephonyManager telephonyManager, int i, long j, aivo aivo, aizx aizx, Executor executor) {
        throw null;
    }

    public boolean a(Context context) {
        return false;
    }

    public boolean a(Context context, int i) {
        return false;
    }

    public boolean a(Context context, List list, RttManager.RttListener rttListener, aicn aicn, Executor executor) {
        return false;
    }

    public boolean a(SensorManager sensorManager, int i) {
        throw null;
    }

    public boolean a(WifiManager wifiManager, Context context) {
        throw null;
    }

    public boolean a(PowerManager powerManager) {
        throw null;
    }

    public int b(SensorManager sensorManager, int i) {
        throw null;
    }

    public aixl b(SensorManager sensorManager, ajbg ajbg, aicn aicn) {
        throw null;
    }

    public void b() {
    }

    public boolean b(Location location) {
        throw null;
    }

    public boolean b(PowerManager powerManager) {
        return false;
    }

    public int c(SensorManager sensorManager, int i) {
        throw null;
    }

    public ajbi c(SensorManager sensorManager, ajbg ajbg, aicn aicn) {
        return new ajbb();
    }

    public aiwi a() {
        return new aiwg();
    }

    public ajao a(ajbg ajbg, arnf arnf, Context context) {
        return new ajaz();
    }

    public void a(AlarmManager alarmManager, long j, PendingIntent pendingIntent) {
        alarmManager.set(2, j, pendingIntent);
    }

    public void a(AlarmManager alarmManager, long j, PendingIntent pendingIntent, aizx aizx) {
        try {
            alarmManager.set(2, j, pendingIntent);
        } catch (Exception e) {
        }
    }

    public void a(Context context, String str, LocationListener locationListener, Looper looper) {
        ((LocationManager) context.getSystemService("location")).requestLocationUpdates(str, 0, 0.0f, locationListener);
    }

    public void a(Context context, boolean z, long j, int i, aixt aixt, boolean z2) {
        throw new IllegalStateException("not supported!");
    }
}
