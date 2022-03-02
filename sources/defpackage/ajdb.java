package defpackage;

import android.content.Context;
import android.location.Location;
import android.os.Build;
import java.io.IOException;
import java.util.TimeZone;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;

/* renamed from: ajdb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ajdb {
    public static final /* synthetic */ int d = 0;
    public final Context a;
    public final ajda b;
    public ajcz c;
    private ExecutorService e;

    static {
        iyc iyc = iyc.UNKNOWN;
    }

    public ajdb(Context context) {
        ajda ajda = new ajda(context);
        this.a = context;
        this.b = ajda;
    }

    static synchronized aqek a(Location location) {
        aqek aqek;
        synchronized (ajdb.class) {
            aqek = new aqek(ajck.X);
            aqek aqek2 = new aqek(ajck.O);
            aqek2.g(1, aell.b(location.getLatitude()));
            aqek2.g(2, aell.b(location.getLongitude()));
            aqek.b(1, (Object) aqek2);
            if (location.hasAccuracy()) {
                aqek.g(3, (int) location.getAccuracy());
            }
            if (location.hasAltitude()) {
                aqek.g(10, (int) location.getAltitude());
            }
            if (location.hasBearing()) {
                aqek.g(13, (int) location.getBearing());
            }
            if (location.hasSpeed()) {
                aqek.b(16, location.getSpeed());
            }
            if ("gps".equals(location.getProvider())) {
                aqek.g(8, 0);
            } else if ("network".equals(location.getProvider())) {
                aqek.g(8, 32);
            } else {
                aqek.g(8, 15);
            }
            aqek.b(6, location.getTime());
        }
        return aqek;
    }

    public final synchronized void b() {
        ExecutorService executorService = this.e;
        if (executorService != null) {
            executorService.execute(new ajcx(this));
            this.e.shutdown();
        }
    }

    public static aqek a(aqek aqek, aqek aqek2) {
        String str;
        String str2;
        aqek aqek3 = new aqek(ajck.al);
        aqek aqek4 = new aqek(ajck.ae);
        int seismicDeviceTypePrecision = (int) ayek.a.a().seismicDeviceTypePrecision();
        if (seismicDeviceTypePrecision == 1) {
            str = Build.MANUFACTURER;
        } else if (seismicDeviceTypePrecision == 2) {
            String str3 = Build.BRAND;
            String str4 = Build.DEVICE;
            StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 1 + String.valueOf(str4).length());
            sb.append(str3);
            sb.append("/");
            sb.append(str4);
            str = sb.toString();
        } else if (seismicDeviceTypePrecision != 3) {
            str = "";
        } else {
            str = Build.FINGERPRINT;
        }
        aqek4.b(2, (Object) str);
        aqek4.b(9, (Object) Integer.toString(jlo.b()));
        aqek4.b(11, (Object) TimeZone.getDefault().getID());
        aqek3.b(1, (Object) aqek4);
        aqek aqek5 = new aqek(ajck.ak);
        long currentTimeMillis = System.currentTimeMillis();
        aqek5.b(1, currentTimeMillis);
        aqek5.b(4, currentTimeMillis);
        aqek5.g(3, 0);
        String uuid = UUID.randomUUID().toString();
        if (ayek.l()) {
            String valueOf = String.valueOf(uuid);
            str2 = valueOf.length() == 0 ? new String("@debug.") : "@debug.".concat(valueOf);
        } else {
            String valueOf2 = String.valueOf(uuid);
            str2 = valueOf2.length() == 0 ? new String("@") : "@".concat(valueOf2);
        }
        aqek5.b(2, (Object) str2);
        aqek3.a(6, (Object) aqek5);
        aqek aqek6 = new aqek(ajck.af);
        aqek6.b(1, (Object) "sglclt/com.google.android.apps.location.quake");
        aqek3.a(2, (Object) aqek6);
        aqek aqek7 = new aqek(ajck.ah);
        try {
            aqek7.a(7, (Object) aqek.b());
        } catch (IOException e2) {
        }
        aqek7.a(6, 6);
        if (aqek2 != null) {
            aqek7.b(9, (Object) aqek2);
        }
        aqek3.a(4, (Object) aqek7);
        return aqek3;
    }

    public final synchronized void a() {
        if (this.e == null) {
            aoru b2 = jfm.b(10);
            this.e = b2;
            b2.execute(new ajcw(this));
        }
    }

    public final synchronized void a(aqek aqek) {
        ExecutorService executorService = this.e;
        if (executorService != null) {
            try {
                executorService.execute(new ajcy(this, aqek));
            } catch (RejectedExecutionException e2) {
            }
        }
    }
}
