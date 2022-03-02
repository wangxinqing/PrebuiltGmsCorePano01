package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.PowerManager;
import android.os.SystemClock;
import com.google.android.location.reporting.collectors.LocationHistorianDataRetriever$LogDataReceiver;

/* renamed from: ajhf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ajhf {
    public static final Object a = new Object();
    public LocationHistorianDataRetriever$LogDataReceiver b;
    public final Context c;
    private final ajmn d;
    private final SharedPreferences e;
    private final ConnectivityManager f;
    private final ajhe g;

    public ajhf(Context context, ajmn ajmn, SharedPreferences sharedPreferences, ConnectivityManager connectivityManager, ajhe ajhe, LocationHistorianDataRetriever$LogDataReceiver locationHistorianDataRetriever$LogDataReceiver) {
        this.c = context;
        this.d = ajmn;
        this.e = sharedPreferences;
        this.f = connectivityManager;
        this.g = ajhe;
        this.b = locationHistorianDataRetriever$LogDataReceiver;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.google.android.location.internal.server.SEND_LOG_DATA_ACTION");
        this.c.registerReceiver(this.b, intentFilter);
    }

    public final void a(boolean z) {
        if (b() != null) {
            StringBuilder sb = new StringBuilder(39);
            sb.append("location historian data uploaded: ");
            sb.append(z);
            sb.toString();
            ajjb.a("UlrLocationHistorianUploadSuccess", z);
            if (z) {
                synchronized (a) {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    long j = this.e.getLong("last_upload_timestamp", -1);
                    if (j > 0) {
                        ajjb.b("UlrLocationHistorianUploadInterval", elapsedRealtime - j);
                    }
                    ajhc b2 = b();
                    this.e.edit().putLong("boot_time", b2.b).putLong("last_event_time", b2.c).putLong("last_upload_timestamp", j).apply();
                }
            }
            this.b.a = null;
        }
    }

    public final ajhc b() {
        LocationHistorianDataRetriever$LogDataReceiver locationHistorianDataRetriever$LogDataReceiver = this.b;
        if (locationHistorianDataRetriever$LogDataReceiver != null) {
            return locationHistorianDataRetriever$LogDataReceiver.a;
        }
        return null;
    }

    public final void c() {
        Intent intent = new Intent("com.google.android.location.reporting.DUMP_LOG_BROADCAST_ACTION");
        intent.putExtra("boot_time", this.e.getLong("boot_time", 0));
        intent.putExtra("last_event_time", this.e.getLong("last_event_time", 0));
        intent.putExtra("current_time_key", SystemClock.elapsedRealtime());
        intent.putExtra("max_location_historian_events", (int) aztb.a.a().bi());
        this.c.sendBroadcast(intent);
    }

    public final boolean a() {
        boolean z;
        boolean z2;
        NetworkInfo activeNetworkInfo;
        if (aztb.a.a().an()) {
            ConnectivityManager connectivityManager = this.f;
            boolean z3 = (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null || !activeNetworkInfo.isConnected()) ? false : !ml.a(this.f);
            boolean a2 = ajnn.a(this.d.g);
            ajhe ajhe = this.g;
            int i = Build.VERSION.SDK_INT;
            PowerManager powerManager = ajhe.a;
            boolean z4 = powerManager != null ? !powerManager.isInteractive() : true;
            long j = this.e.getLong("last_upload_timestamp", -1);
            if (j >= 0) {
                z = System.currentTimeMillis() - j > aztb.a.a().aT();
            } else {
                z = true;
            }
            StringBuilder sb = new StringBuilder(93);
            sb.append("shouldUploadHistorianEvents: eligibleNetwor=");
            sb.append(z3);
            sb.append(" powered=");
            sb.append(a2);
            sb.append(" idle=");
            sb.append(z4);
            sb.append(" timeToUpload=");
            sb.append(z);
            sb.toString();
            if (ajjb.c()) {
                if (a2) {
                    z2 = z3 | true;
                } else {
                    z2 = z3;
                }
                if (z4) {
                    z2 |= true;
                }
                if (z) {
                    z2 |= true;
                }
                ajjb.a("UlrLocationHistorianUploadAvailability", z2 ? 1 : 0);
            }
            return z && z3 && a2 && z4;
        }
    }
}
