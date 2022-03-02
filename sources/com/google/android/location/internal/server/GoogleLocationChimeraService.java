package com.google.android.location.internal.server;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Message;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.WorkSource;
import com.google.android.chimera.Service;
import com.google.android.gms.location.ActivityRecognitionRequest;
import com.google.android.gms.location.ActivityTransitionRequest;
import com.google.android.gms.location.SleepSegmentRequest;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CountDownLatch;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class GoogleLocationChimeraService extends Service {
    HandlerThread a;
    public aire b;
    public aipe c;
    private ikh d;
    private ikh e;
    private ikh f;
    private ikh g;
    private ikh h;
    private SharedPreferences i;
    private aiqp j;
    private boolean k = false;
    private final arnb l = new aipm(this);
    private ahzz m;

    private static final long a(Intent intent, String str, int i2) {
        if (!intent.hasExtra(str)) {
            return (long) i2;
        }
        long longExtra = intent.getLongExtra(str, -1);
        if (longExtra < 0) {
            longExtra = (long) intent.getIntExtra(str, -1);
        }
        return longExtra < 0 ? (long) i2 : longExtra;
    }

    private final synchronized boolean b() {
        return this.k;
    }

    public final IBinder onBind(Intent intent) {
        return null;
    }

    public final void onCreate() {
        HandlerThread handlerThread = new HandlerThread("GoogleLocationService", 9);
        this.a = handlerThread;
        handlerThread.start();
        this.d = a("com.google.android.location.internal.EXTRA_ACTIVITY_PENDING_INTENT", 0);
        this.e = a("com.google.android.location.internal.EXTRA_FLOOR_CHANGE_PENDING_INTENT", 2);
        this.f = a("com.google.android.location.internal.EXTRA_SLEEP_SEGMENT_PENDING_INTENT", 3);
        this.g = a("com.google.android.location.internal.EXTRA_ACTIVITY_TRANSITION_PENDING_INTENT", 4);
        this.h = ikh.a(this, "com.google.android.location.internal.server.GoogleLocationService", 6, new aipn());
        this.i = getSharedPreferences("activity.transitionStateSharedPreferences", 0);
        this.j = new aiqp(this.h);
        this.m = new ahzz(this.i);
        aipq aipq = new aipq();
        aire aire = new aire(this, aipq, this.a.getLooper(), this.d, this.e, this.f, this.g, this.j, this.m);
        this.b = aire;
        synchronized (aire.f) {
            aire.i = true;
            Message.obtain(aire, 1).sendToTarget();
            Message.obtain(aire, 2).sendToTarget();
            Message.obtain(aire, 3).sendToTarget();
            Message.obtain(aire, 5).sendToTarget();
            aire.s.a(aire);
        }
        arnd a2 = aipq.a(this);
        a2.a(5147455389092024324L, this.l, new qvr(Looper.myLooper()));
        aipe a3 = aipe.a(this, this.b, a2);
        this.c = a3;
        a3.a();
    }

    public final void onDestroy() {
        aire aire = this.b;
        synchronized (aire.f) {
            aire.i = false;
            aixc aixc = aire.j;
            if (aixc != null) {
                aixc.c.a();
            }
            if (!aire.c) {
                Message.obtain(aire, 3).sendToTarget();
            }
            ServiceThread$LogRequestReceiver serviceThread$LogRequestReceiver = aire.t;
            if (serviceThread$LogRequestReceiver != null) {
                aire.a.unregisterReceiver(serviceThread$LogRequestReceiver);
                aire.t = null;
            }
            aire.b();
            aire.s.a();
            Message.obtain(aire, 4).sendToTarget();
            ajrf.a((ajrg) null);
            aire.g = null;
        }
        super.onDestroy();
        this.c.b();
        new aipq().a(this).a(this.l);
    }

    public final void onStart(Intent intent, int i2) {
        arkj arkj;
        long[] jArr;
        long[] jArr2;
        Intent intent2 = intent;
        if (intent2 != null) {
            try {
                int i3 = 4;
                int i4 = 3;
                ikh ikh = null;
                if (ikh.a(intent)) {
                    int b2 = ikh.b(intent);
                    if (b2 == 0) {
                        ikh = this.d;
                        ikh.c(intent2);
                    } else if (b2 == 6) {
                        this.h.c(intent2);
                        int size = this.h.d().size();
                        StringBuilder sb = new StringBuilder(39);
                        sb.append("NLP_PERSISTENT, data length ");
                        sb.append(size);
                        sb.toString();
                        this.j.c();
                    } else if (b2 == 2) {
                        ikh = this.e;
                        ikh.c(intent2);
                    } else if (b2 == 3) {
                        ikh = this.f;
                        ikh.c(intent2);
                    } else if (b2 != 4) {
                        StringBuilder sb2 = new StringBuilder(31);
                        sb2.append("Unknown cache type: ");
                        sb2.append(b2);
                        sb2.toString();
                    } else {
                        ikh = this.g;
                        ikh.c(intent2);
                    }
                    if (b()) {
                        a();
                    } else if (ikh != null) {
                        for (Intent a2 : ikh.d()) {
                            a(a2, false);
                        }
                        StringBuilder sb3 = new StringBuilder(73);
                        sb3.append("Finished initializing clients from pending intent cache, type=");
                        sb3.append(b2);
                        sb3.toString();
                    }
                } else if (intent2.hasExtra("com.google.android.location.internal.CACHE_REQUEST_PROTO")) {
                    if (intent2.hasExtra("com.google.android.location.internal.CACHE_REQUEST_PROTO")) {
                        long id = Thread.currentThread().getId();
                        StringBuilder sb4 = new StringBuilder(65);
                        sb4.append("LocationService thread handler, thread ID is ");
                        sb4.append(id);
                        sb4.toString();
                        byte[] byteArrayExtra = intent2.getByteArrayExtra("com.google.android.location.internal.CACHE_REQUEST_PROTO");
                        int length = byteArrayExtra.length;
                        StringBuilder sb5 = new StringBuilder(39);
                        sb5.append("cache query proto is length ");
                        sb5.append(length);
                        sb5.toString();
                        try {
                            arma arma = (arma) aucj.a((aucj) arma.c, byteArrayExtra);
                            int size2 = arma.a.size();
                            int size3 = arma.b.size();
                            StringBuilder sb6 = new StringBuilder(59);
                            sb6.append("query bssid count is ");
                            sb6.append(size2);
                            sb6.append(", cell count is ");
                            sb6.append(size3);
                            sb6.toString();
                            jArr2 = new long[arma.a.size()];
                            jArr = new long[arma.b.size()];
                            int i5 = 0;
                            for (armd armd : arma.a) {
                                jArr2[i5] = armd.a;
                                i5++;
                            }
                            int i6 = 0;
                            for (arlx arlx : arma.b) {
                                int i7 = i6 + 1;
                                jArr[i6] = arlx.a;
                                i6 = i7;
                            }
                        } catch (auda e2) {
                            jArr2 = new long[0];
                            jArr = jArr2;
                        }
                        PendingIntent pendingIntent = (PendingIntent) intent2.getParcelableExtra("com.google.android.location.internal.EXTRA_PENDING_INTENT");
                        aire aire = this.b;
                        aipp aipp = new aipp(this, pendingIntent);
                        synchronized (aire.f) {
                            aixc aixc = aire.j;
                            if (aixc != null) {
                                aixc.c.a(6, 0, new aivj(jArr2, jArr, aipp), false);
                            } else {
                                a(getApplicationContext(), pendingIntent, 2, new HashMap(), new HashMap());
                            }
                        }
                    }
                } else if (!intent2.hasExtra("com.google.android.location.internal.EXTRA_COMPUTE_WIFI_LOCATIONS_REQUEST")) {
                    a(intent2, true);
                } else if (axxm.a.a().nlpEnableComputeWifiLocations()) {
                    Context applicationContext = getApplicationContext();
                    aire aire2 = this.b;
                    byte[] byteArrayExtra2 = intent2.getByteArrayExtra("com.google.android.location.internal.EXTRA_COMPUTE_WIFI_LOCATIONS_REQUEST");
                    ArrayList arrayList = new ArrayList();
                    if (byteArrayExtra2 != null) {
                        try {
                            for (arjk arjk : ((arjm) aucj.a((aucj) arjm.b, byteArrayExtra2)).a) {
                                if (arjj.a(arjk.a) == i4) {
                                    if (arjk.a == i3) {
                                        arkj = (arkj) arjk.b;
                                    } else {
                                        arkj = arkj.b;
                                    }
                                    long j2 = arjk.c / 1000000;
                                    aibq aibq = new aibq(j2, arkj.a.size());
                                    for (arki arki : arkj.a) {
                                        aibq.a(arki.a, (byte) arki.b, 0, j2);
                                    }
                                    arrayList.add(aibq.a((aibv[]) null, false));
                                    i3 = 4;
                                    i4 = 3;
                                } else {
                                    i3 = 4;
                                    i4 = 3;
                                }
                            }
                        } catch (auda e3) {
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        aipj aipj = new aipj(intent2, applicationContext);
                        synchronized (aire2.f) {
                            aixc aixc2 = aire2.j;
                            if (aixc2 != null) {
                                aixc2.c.a(9, 0, new aivk(arrayList, aipj), false);
                            } else {
                                aipk.a(intent2, applicationContext);
                            }
                        }
                    } else {
                        aipk.a(intent2, applicationContext);
                    }
                } else {
                    aipk.a(intent2, getApplicationContext());
                }
            } catch (Exception e4) {
                long nlpSilentFeedbackIntervalMillis = aydu.a.a().nlpSilentFeedbackIntervalMillis();
                if (nlpSilentFeedbackIntervalMillis != -1) {
                    boolean nlpSilentFeedbackEnabled = aydu.a.a().nlpSilentFeedbackEnabled();
                    StringBuilder sb7 = new StringBuilder(31);
                    sb7.append("reportToFeedback; enabled=");
                    sb7.append(nlpSilentFeedbackEnabled);
                    sb7.toString();
                    if (nlpSilentFeedbackEnabled) {
                        synchronized (airg.class) {
                            long elapsedRealtime = SystemClock.elapsedRealtime();
                            if (airg.a == 0 || elapsedRealtime - airg.a >= nlpSilentFeedbackIntervalMillis) {
                                airg.a = elapsedRealtime;
                                new airf(e4).start();
                                return;
                            }
                            StringBuilder sb8 = new StringBuilder(62);
                            sb8.append("reportToFeedback; throttled for interval: ");
                            sb8.append(elapsedRealtime - airg.a);
                            sb8.toString();
                            return;
                        }
                    }
                    return;
                }
                throw e4;
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        aixc aixc;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long currentTimeMillis = System.currentTimeMillis();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM-dd HH:mm:ss.SSS", Locale.US);
        String format = simpleDateFormat.format(new Date(currentTimeMillis));
        printWriter.print("elapsedRealtime ");
        printWriter.print(elapsedRealtime);
        printWriter.print(" is time ");
        printWriter.println(format);
        aire aire = this.b;
        synchronized (aire.f) {
            long j2 = aire.k;
            StringBuilder sb = new StringBuilder(53);
            sb.append("NLP-Period (millis) is currently ");
            sb.append(j2);
            printWriter.println(sb.toString());
            boolean z = aire.b;
            StringBuilder sb2 = new StringBuilder(21);
            sb2.append("NLP operational ");
            sb2.append(z);
            printWriter.println(sb2.toString());
            boolean a2 = aire.a();
            StringBuilder sb3 = new StringBuilder(26);
            sb3.append("location permission? ");
            sb3.append(a2);
            printWriter.println(sb3.toString());
            boolean a3 = aire.r.a("network");
            StringBuilder sb4 = new StringBuilder(17);
            sb4.append("nlpEnabled? ");
            sb4.append(a3);
            printWriter.println(sb4.toString());
            boolean a4 = rns.a((Context) aire.a);
            StringBuilder sb5 = new StringBuilder(18);
            sb5.append("userConsent? ");
            sb5.append(a4);
            printWriter.println(sb5.toString());
            aipv aipv = aire.l;
            long a5 = aipv.b.a() / 1000;
            StringBuilder sb6 = new StringBuilder(53);
            sb6.append(a5);
            sb6.append(" sec. (");
            sb6.append(a5 / 60);
            sb6.append(" min.)");
            String valueOf = String.valueOf(sb6.toString());
            printWriter.println(valueOf.length() == 0 ? new String("####NLP Location Client Stats: ") : "####NLP Location Client Stats: ".concat(valueOf));
            printWriter.println(aipv.b);
        }
        printWriter.println();
        aire aire2 = this.b;
        synchronized (aire2.f) {
            aiov aiov = aire2.n;
            long a6 = aiov.h.a() / 1000;
            StringBuilder sb7 = new StringBuilder(53);
            sb7.append(a6);
            sb7.append(" sec. (");
            sb7.append(a6 / 60);
            sb7.append(" min.)");
            String valueOf2 = String.valueOf(sb7.toString());
            printWriter.println(valueOf2.length() == 0 ? new String("####Activity Client Stats: ") : "####Activity Client Stats: ".concat(valueOf2));
            printWriter.println(aiov.h);
        }
        printWriter.println();
        this.b.o.a(printWriter);
        printWriter.println();
        this.b.p.a(printWriter);
        printWriter.println();
        this.b.q.a(printWriter);
        printWriter.println();
        aire aire3 = this.b;
        synchronized (aire3.f) {
            printWriter.print("GMS collection is ");
            Boolean bool = aire3.h;
            if (bool != null) {
                printWriter.println(!bool.booleanValue() ? "disabled" : "enabled");
            } else {
                printWriter.println("not yet set.");
            }
            if (aire3.j != null) {
                printWriter.println("RealOs stats:");
                aixc aixc2 = aire3.j;
                ahyk ahyk = aixc2.n;
                aizy aizy = aixc2.f;
                ahyk.a((Format) simpleDateFormat, ajbt.e(), printWriter);
                printWriter.println();
            }
            aiyo.a.a(printWriter, SystemClock.elapsedRealtime());
        }
        aire aire4 = this.b;
        synchronized (aire4.f) {
            aixc = aire4.j;
        }
        if (aixc != null) {
            aivu aivu = aixc.c;
            CountDownLatch countDownLatch = new CountDownLatch(1);
            aivu.a((Runnable) new aive(aivu, printWriter, countDownLatch));
            while (true) {
                try {
                    countDownLatch.await();
                    break;
                } catch (InterruptedException e2) {
                }
            }
        }
        this.d.a(printWriter);
        this.e.a(printWriter);
        this.f.a(printWriter);
        this.g.a(printWriter);
        printWriter.flush();
    }

    private final ajrb a(Intent intent, String str) {
        ajrc a2 = ajrc.a(intent, "com.google.android.location.internal.EXTRA_LOCATION_WORK_SOURCE");
        if (a2 != null) {
            if (jni.b(this).a("android.permission.UPDATE_DEVICE_STATS", getPackageName()) == 0) {
                if (jni.b(this).a("android.permission.UPDATE_DEVICE_STATS", str) != 0) {
                    List b2 = a2.b();
                    if (b2.size() != 1 || !((String) b2.get(0)).equals(str)) {
                        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 47);
                        sb.append("package ");
                        sb.append(str);
                        sb.append(" doesn't have permission for WorkSource");
                        sb.toString();
                    }
                }
            }
            return null;
        }
        return a2;
    }

    private static final ifu a(Intent intent) {
        IBinder a2 = fy.a(intent.getExtras(), "com.google.android.location.internal.EXTRA_API_CALLBACK");
        if (a2 == null) {
            return null;
        }
        IInterface queryLocalInterface = a2.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
        if (queryLocalInterface instanceof ifu) {
            return (ifu) queryLocalInterface;
        }
        return new ifs(a2);
    }

    private final ikh a(String str, int i2) {
        return ikh.b(this, "com.google.android.location.internal.server.GoogleLocationService", i2, new aipo(str));
    }

    static void a(Context context, PendingIntent pendingIntent, int i2, int i3, Map map, Map map2) {
        aucd o = armc.f.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        armc armc = (armc) o.b;
        armc.b = i2 - 1;
        int i4 = armc.a | 1;
        armc.a = i4;
        armc.c = i3 - 1;
        armc.a = i4 | 2;
        for (Map.Entry entry : map.entrySet()) {
            Long l2 = (Long) entry.getKey();
            aibe aibe = (aibe) entry.getValue();
            int i5 = 94;
            if (aibe.b == 0 && aibe.c == 0 && aibe.d == 0) {
                i5 = -1;
            }
            aucd o2 = arme.h.o();
            long longValue = l2.longValue();
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            arme arme = (arme) o2.b;
            int i6 = arme.a | 1;
            arme.a = i6;
            arme.b = longValue;
            int i7 = aibe.b;
            int i8 = i6 | 2;
            arme.a = i8;
            arme.c = i7;
            int i9 = aibe.c;
            int i10 = i8 | 4;
            arme.a = i10;
            arme.d = i9;
            int i11 = aibe.d;
            int i12 = i10 | 8;
            arme.a = i12;
            arme.e = i11;
            int i13 = i12 | 16;
            arme.a = i13;
            arme.f = 20000;
            arme.a = i13 | 32;
            arme.g = i5;
            if (o.c) {
                o.c();
                o.c = false;
            }
            armc armc2 = (armc) o.b;
            arme arme2 = (arme) o2.i();
            arme2.getClass();
            if (!armc2.d.a()) {
                armc2.d = aucj.a(armc2.d);
            }
            armc2.d.add(arme2);
        }
        for (Map.Entry entry2 : map2.entrySet()) {
            aibe aibe2 = (aibe) entry2.getValue();
            aucd o3 = arly.f.o();
            long longValue2 = ((Long) entry2.getKey()).longValue();
            if (o3.c) {
                o3.c();
                o3.c = false;
            }
            arly arly = (arly) o3.b;
            int i14 = arly.a | 1;
            arly.a = i14;
            arly.b = longValue2;
            int i15 = aibe2.b;
            int i16 = i14 | 2;
            arly.a = i16;
            arly.c = i15;
            int i17 = aibe2.c;
            int i18 = i16 | 4;
            arly.a = i18;
            arly.d = i17;
            int i19 = aibe2.d;
            arly.a = i18 | 8;
            arly.e = i19;
            if (o.c) {
                o.c();
                o.c = false;
            }
            armc armc3 = (armc) o.b;
            arly arly2 = (arly) o3.i();
            arly2.getClass();
            if (!armc3.e.a()) {
                armc3.e = aucj.a(armc3.e);
            }
            armc3.e.add(arly2);
        }
        byte[] k2 = ((armc) o.i()).k();
        Intent intent = new Intent();
        intent.putExtra("com.google.android.location.internal.CACHE_RESULT_PROTO", k2);
        try {
            jjy.a(pendingIntent, context, 0, intent, (PendingIntent.OnFinished) null);
        } catch (Exception e2) {
        }
    }

    public static void a(Context context, PendingIntent pendingIntent, int i2, Map map, Map map2) {
        int size = map.size();
        int size2 = map2.size();
        StringBuilder sb = new StringBuilder(71);
        sb.append("Sending cache response, wifi size ");
        sb.append(size);
        sb.append(", cell size is ");
        sb.append(size2);
        sb.toString();
        int size3 = map.size();
        HashMap hashMap = new HashMap(14);
        Map map3 = map2;
        int i3 = 2;
        for (Map.Entry entry : map.entrySet()) {
            hashMap.put((Long) entry.getKey(), (aibe) entry.getValue());
            size3--;
            if (hashMap.size() == 14) {
                if (size3 == 0) {
                    i3 = 1;
                } else {
                    i3 = 2;
                }
                a(context, pendingIntent, i2, i3, hashMap, map3);
                Map emptyMap = Collections.emptyMap();
                hashMap.clear();
                map3 = emptyMap;
            }
        }
        if (i3 == 2) {
            a(context, pendingIntent, i2, 1, hashMap, map3);
        }
    }

    private final void a(Intent intent, boolean z) {
        aixc aixc;
        ActivityTransitionRequest activityTransitionRequest;
        SleepSegmentRequest sleepSegmentRequest;
        ifu a2;
        PendingIntent pendingIntent;
        WorkSource workSource;
        Intent intent2 = intent;
        String valueOf = String.valueOf(intent);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 29);
        sb.append("handleClientRequestIntent is ");
        sb.append(valueOf);
        sb.toString();
        if (intent2.hasExtra("com.google.android.location.internal.EXTRA_PENDING_INTENT")) {
            PendingIntent pendingIntent2 = (PendingIntent) intent2.getParcelableExtra("com.google.android.location.internal.EXTRA_PENDING_INTENT");
            boolean booleanExtra = intent2.getBooleanExtra("com.google.android.location.internal.EXTRA_LOCATION_LOW_POWER", false);
            boolean booleanExtra2 = intent2.getBooleanExtra("com.google.android.location.internal.EXTRA_LOCATION_REMOVE", false);
            long a3 = a(intent2, "com.google.android.location.internal.EXTRA_PERIOD_MILLIS", -1);
            long a4 = a(intent2, "com.google.android.location.internal.EXTRA_BATCH_DURATION_MILLIS", 0);
            boolean booleanExtra3 = intent2.getBooleanExtra("com.google.android.location.internal.EXTRA_LOCATION_FORCE_NOW", true);
            boolean booleanExtra4 = intent2.getBooleanExtra("locationSettingsIgnored", false);
            String stringExtra = intent2.getStringExtra("com.google.android.location.internal.EXTRA_LOCATION_TAG");
            if (pendingIntent2 != null) {
                if (booleanExtra2) {
                    String valueOf2 = String.valueOf(pendingIntent2);
                    StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 32);
                    sb2.append("Client canceled location update ");
                    sb2.append(valueOf2);
                    sb2.toString();
                    aire aire = this.b;
                    synchronized (aire.f) {
                        String valueOf3 = String.valueOf(Integer.toHexString(pendingIntent2.hashCode()));
                        if (valueOf3.length() == 0) {
                            new String("removing location pending intent: ");
                        } else {
                            "removing location pending intent: ".concat(valueOf3);
                        }
                        aipv aipv = aire.l;
                        aicn aicn = aipv.c;
                        if (aicn != null) {
                            aicn.a(aico.LOCATION_PENDING_INTENT_REMOVED, pendingIntent2.hashCode(), pendingIntent2.getTargetPackage());
                        }
                        aipt aipt = (aipt) aipv.a.remove(pendingIntent2);
                        if (aipt != null) {
                            aipt.a();
                            aipv.a(aipv.a.values());
                        }
                        aire.c(false);
                        aire.a(aire.l.g);
                    }
                } else if (a3 >= 0) {
                    String targetPackage = pendingIntent2.getTargetPackage();
                    String valueOf4 = String.valueOf(pendingIntent2);
                    boolean a5 = ikh.a(intent);
                    StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf4).length() + 75 + String.valueOf(targetPackage).length() + String.valueOf(stringExtra).length());
                    sb3.append("received pending intent. pendingIntent=");
                    sb3.append(valueOf4);
                    sb3.append(", packageName=");
                    sb3.append(targetPackage);
                    sb3.append(", tag=");
                    sb3.append(stringExtra);
                    sb3.append(", isCache? ");
                    sb3.append(a5);
                    sb3.toString();
                    ajrb a6 = a(intent2, targetPackage);
                    aire aire2 = this.b;
                    aiqy aiqy = new aiqy(aire2, pendingIntent2, stringExtra, a3, booleanExtra3, a4, booleanExtra, a6, booleanExtra4);
                    if (!aydu.d()) {
                        synchronized (aire2.f) {
                            aixc aixc2 = aire2.j;
                            if (aixc2 != null) {
                                aixc2.a((Runnable) aiqy);
                            } else {
                                aiqy.run();
                            }
                        }
                    } else {
                        aire2.post(aiqy);
                    }
                }
            }
        }
        if (intent2.hasExtra("com.google.android.location.internal.EXTRA_ACTIVITY_PENDING_INTENT") && (pendingIntent = (PendingIntent) intent2.getParcelableExtra("com.google.android.location.internal.EXTRA_ACTIVITY_PENDING_INTENT")) != null) {
            String targetPackage2 = pendingIntent.getTargetPackage();
            String valueOf5 = String.valueOf(pendingIntent);
            StringBuilder sb4 = new StringBuilder(String.valueOf(targetPackage2).length() + 39 + String.valueOf(valueOf5).length());
            sb4.append("received activity pending intent from ");
            sb4.append(targetPackage2);
            sb4.append(" ");
            sb4.append(valueOf5);
            sb4.toString();
            if (intent2.getBooleanExtra("com.google.android.location.internal.EXTRA_ACTIVITY_REMOVE", false)) {
                String valueOf6 = String.valueOf(pendingIntent);
                StringBuilder sb5 = new StringBuilder(String.valueOf(valueOf6).length() + 35);
                sb5.append("Client canceled activity detection ");
                sb5.append(valueOf6);
                sb5.toString();
                this.b.a(pendingIntent);
                if (z) {
                    this.d.b((Parcelable) intent2);
                }
            } else {
                boolean booleanExtra5 = intent2.getBooleanExtra("com.google.android.location.internal.EXTRA_IS_FROM_FIRST_PARTY", false);
                ActivityRecognitionRequest activityRecognitionRequest = (intent2 == null || !intent2.hasExtra("com.google.android.location.internal.EXTRA_ACTIVITY_RECOGNITION_REQUEST")) ? null : (ActivityRecognitionRequest) ivy.a(intent2, "com.google.android.location.internal.EXTRA_ACTIVITY_RECOGNITION_REQUEST", ActivityRecognitionRequest.CREATOR);
                if (activityRecognitionRequest == null) {
                    long a7 = a(intent2, "com.google.android.location.internal.EXTRA_ACTIVITY_PERIOD_MILLIS", 180000);
                    boolean booleanExtra6 = intent2.getBooleanExtra("com.google.android.location.internal.EXTRA_ACTIVITY_FORCE_DETECTION_NOW", true);
                    ajrb a8 = a(intent2, targetPackage2);
                    String stringExtra2 = intent2.getStringExtra("com.google.android.location.internal.EXTRA_ACTIVITY_TAG");
                    int[] intArrayExtra = intent2.getIntArrayExtra("com.google.android.location.internal.EXTRA_NONDEFAULT_ACTIVITY_TYPES");
                    boolean booleanExtra7 = intent2.getBooleanExtra("com.google.android.location.internal.EXTRA_REQUEST_SENSOR_DATA_FOR_ACTIVITY", false);
                    rck rck = new rck();
                    rck.a(Math.max(a7, 0));
                    rck.c = booleanExtra6;
                    if (a8 != null) {
                        workSource = ((ajrc) a8).a;
                    } else {
                        workSource = null;
                    }
                    rck.d = workSource;
                    rck.e = stringExtra2;
                    rck.f = booleanExtra7;
                    if (intArrayExtra != null) {
                        for (int a9 : intArrayExtra) {
                            rck.a(a9);
                        }
                    }
                    activityRecognitionRequest = rck.a();
                }
                aire aire3 = this.b;
                aiqz aiqz = new aiqz(aire3, pendingIntent, activityRecognitionRequest, booleanExtra5);
                if (aydu.d()) {
                    aire3.post(aiqz);
                } else {
                    synchronized (aire3.f) {
                        aixc aixc3 = aire3.j;
                        if (aixc3 != null) {
                            aixc3.a((Runnable) aiqz);
                        } else {
                            aiqz.run();
                        }
                    }
                }
                if (z) {
                    this.d.a((Parcelable) intent2);
                }
                if (ayee.b()) {
                    aire aire4 = this.b;
                    synchronized (aire4.f) {
                        aixc aixc4 = aire4.j;
                        if (aixc4 != null) {
                            if (intent2 != null) {
                                String str = activityRecognitionRequest.g;
                                if (str != null) {
                                    new Object[1][0] = str;
                                    aixc4.q = str;
                                }
                            }
                        }
                    }
                }
            }
        }
        if (intent2.hasExtra("com.google.android.location.internal.EXTRA_FLUSH_ACTIVITY_SAMPLES") && (a2 = a(intent)) != null) {
            aire aire5 = this.b;
            synchronized (aire5.f) {
                aire5.n.i.add(a2);
                aixc aixc5 = aire5.j;
                if (aixc5 != null) {
                    aixc5.c.a(41, 0, (Object) null, true);
                } else {
                    aire5.a(ahzw.b);
                }
            }
        }
        if (intent2.hasExtra("com.google.android.location.internal.EXTRA_FLOOR_CHANGE_PENDING_INTENT")) {
            PendingIntent pendingIntent3 = (PendingIntent) intent2.getParcelableExtra("com.google.android.location.internal.EXTRA_FLOOR_CHANGE_PENDING_INTENT");
            airj airj = this.b.o;
            if (pendingIntent3 != null) {
                String targetPackage3 = pendingIntent3.getTargetPackage();
                String valueOf7 = String.valueOf(pendingIntent3);
                StringBuilder sb6 = new StringBuilder(String.valueOf(targetPackage3).length() + 43 + String.valueOf(valueOf7).length());
                sb6.append("Received floor change pending intent from ");
                sb6.append(targetPackage3);
                sb6.append(" ");
                sb6.append(valueOf7);
                sb6.toString();
                if (intent2.getBooleanExtra("com.google.android.location.internal.EXTRA_FLOOR_CHANGE_REMOVE", false)) {
                    String valueOf8 = String.valueOf(pendingIntent3);
                    StringBuilder sb7 = new StringBuilder(String.valueOf(valueOf8).length() + 39);
                    sb7.append("Client canceled floor change detection ");
                    sb7.append(valueOf8);
                    sb7.toString();
                    this.b.a((aiph) airj, pendingIntent3);
                    if (z) {
                        this.e.b((Parcelable) intent2);
                    }
                } else {
                    ajrb a10 = a(intent2, targetPackage3);
                    boolean booleanExtra8 = intent2.getBooleanExtra("com.google.android.location.internal.EXTRA_IS_FROM_FIRST_PARTY", false);
                    String stringExtra3 = intent2.getStringExtra("com.google.android.location.internal.EXTRA_FLOOR_CHANGE_TAG");
                    String valueOf9 = String.valueOf(a10);
                    StringBuilder sb8 = new StringBuilder(String.valueOf(targetPackage3).length() + 95 + String.valueOf(valueOf9).length() + String.valueOf(stringExtra3).length());
                    sb8.append("Adding/updating floor change detection client: package=");
                    sb8.append(targetPackage3);
                    sb8.append(" workSource=");
                    sb8.append(valueOf9);
                    sb8.append(" tag=");
                    sb8.append(stringExtra3);
                    sb8.append(" isFromFirstParty=");
                    sb8.append(booleanExtra8);
                    sb8.toString();
                    this.b.a(airj, pendingIntent3, Boolean.TRUE, booleanExtra8, a10, stringExtra3, (ifu) null);
                    if (z) {
                        this.e.a((Parcelable) intent2);
                    }
                }
            }
        }
        if (intent2.hasExtra("com.google.android.location.internal.EXTRA_SLEEP_SEGMENT_PENDING_INTENT")) {
            PendingIntent pendingIntent4 = (PendingIntent) intent2.getParcelableExtra("com.google.android.location.internal.EXTRA_SLEEP_SEGMENT_PENDING_INTENT");
            airj airj2 = this.b.q;
            if (pendingIntent4 != null) {
                String targetPackage4 = pendingIntent4.getTargetPackage();
                String valueOf10 = String.valueOf(pendingIntent4);
                StringBuilder sb9 = new StringBuilder(String.valueOf(targetPackage4).length() + 44 + String.valueOf(valueOf10).length());
                sb9.append("Received sleep segment pending intent from ");
                sb9.append(targetPackage4);
                sb9.append(" ");
                sb9.append(valueOf10);
                sb9.toString();
                if (intent2.getBooleanExtra("com.google.android.location.internal.EXTRA_SLEEP_SEGMENT_REMOVE", false)) {
                    String valueOf11 = String.valueOf(pendingIntent4);
                    StringBuilder sb10 = new StringBuilder(String.valueOf(valueOf11).length() + 40);
                    sb10.append("Client canceled sleep segment detection ");
                    sb10.append(valueOf11);
                    sb10.toString();
                    this.b.a((aiph) airj2, pendingIntent4);
                    if (z) {
                        this.f.b((Parcelable) intent2);
                    }
                } else {
                    if (intent2 == null || !intent2.hasExtra("com.google.android.location.internal.EXTRA_SLEEP_SEGMENT_REQUEST")) {
                        sleepSegmentRequest = null;
                    } else {
                        sleepSegmentRequest = (SleepSegmentRequest) ivy.a(intent2, "com.google.android.location.internal.EXTRA_SLEEP_SEGMENT_REQUEST", SleepSegmentRequest.CREATOR);
                    }
                    ajrb a11 = a(intent2, targetPackage4);
                    boolean booleanExtra9 = intent2.getBooleanExtra("com.google.android.location.internal.EXTRA_IS_FROM_FIRST_PARTY", false);
                    String stringExtra4 = intent2.getStringExtra("com.google.android.location.internal.EXTRA_SLEEP_SEGMENT_TAG");
                    String valueOf12 = String.valueOf(a11);
                    StringBuilder sb11 = new StringBuilder(String.valueOf(targetPackage4).length() + 96 + String.valueOf(valueOf12).length() + String.valueOf(stringExtra4).length());
                    sb11.append("Adding/updating sleep segment detection client: package=");
                    sb11.append(targetPackage4);
                    sb11.append(" workSource=");
                    sb11.append(valueOf12);
                    sb11.append(" tag=");
                    sb11.append(stringExtra4);
                    sb11.append(" isFromFirstParty=");
                    sb11.append(booleanExtra9);
                    sb11.toString();
                    this.b.a(airj2, pendingIntent4, sleepSegmentRequest, booleanExtra9, a11, stringExtra4, a(intent));
                    if (z) {
                        this.f.a((Parcelable) intent2);
                    }
                }
            }
        }
        if (intent2.hasExtra("com.google.android.location.internal.EXTRA_ACTIVITY_TRANSITION_PENDING_INTENT")) {
            PendingIntent pendingIntent5 = (PendingIntent) intent2.getParcelableExtra("com.google.android.location.internal.EXTRA_ACTIVITY_TRANSITION_PENDING_INTENT");
            airj airj3 = this.b.p;
            if (pendingIntent5 != null) {
                String targetPackage5 = pendingIntent5.getTargetPackage();
                String valueOf13 = String.valueOf(pendingIntent5);
                StringBuilder sb12 = new StringBuilder(String.valueOf(targetPackage5).length() + 50 + String.valueOf(valueOf13).length());
                sb12.append("Received activity transition pending intent from ");
                sb12.append(targetPackage5);
                sb12.append(" ");
                sb12.append(valueOf13);
                sb12.toString();
                if (intent2.getBooleanExtra("com.google.android.location.internal.EXTRA_ACTIVITY_TRANSITION_REMOVE", false)) {
                    String valueOf14 = String.valueOf(pendingIntent5);
                    StringBuilder sb13 = new StringBuilder(String.valueOf(valueOf14).length() + 46);
                    sb13.append("Client canceled activity transition detection ");
                    sb13.append(valueOf14);
                    sb13.toString();
                    this.b.a((aiph) airj3, pendingIntent5);
                    if (z) {
                        this.g.b((Parcelable) intent2);
                    }
                } else {
                    if (intent2 == null || !intent2.hasExtra("com.google.android.location.internal.EXTRA_ACTIVITY_TRANSITION_REQUEST")) {
                        activityTransitionRequest = null;
                    } else {
                        activityTransitionRequest = (ActivityTransitionRequest) ivy.a(intent2, "com.google.android.location.internal.EXTRA_ACTIVITY_TRANSITION_REQUEST", ActivityTransitionRequest.CREATOR);
                    }
                    if (activityTransitionRequest != null) {
                        String valueOf15 = String.valueOf(activityTransitionRequest);
                        StringBuilder sb14 = new StringBuilder(String.valueOf(valueOf15).length() + 38);
                        sb14.append("Received activity transition request: ");
                        sb14.append(valueOf15);
                        sb14.toString();
                        this.b.a(airj3, pendingIntent5, activityTransitionRequest, intent2.getBooleanExtra("com.google.android.location.internal.EXTRA_IS_FROM_FIRST_PARTY", false), new ajrc(), activityTransitionRequest.c, a(intent));
                        intent.getExtras().remove("com.google.android.location.internal.EXTRA_API_CALLBACK");
                        if (z) {
                            this.g.a((Parcelable) intent2);
                        }
                    }
                }
            }
        }
        if (intent2.hasExtra("nlp.FLUSH_BATCH_INTENT") && (aixc = this.b.j) != null) {
            aixc.c.a(2, 0, (Object) null, true);
        }
        if (intent2.hasExtra("nlp.WIFI_SCAN_INTENT")) {
            PendingIntent pendingIntent6 = (PendingIntent) intent2.getParcelableExtra("nlp.WIFI_SCAN_INTENT");
            String valueOf16 = String.valueOf(pendingIntent6);
            StringBuilder sb15 = new StringBuilder(String.valueOf(valueOf16).length() + 26);
            sb15.append("wifiScan pendingIntent is ");
            sb15.append(valueOf16);
            sb15.toString();
            boolean booleanExtra10 = intent2.getBooleanExtra("com.google.android.location.internal.EXTRA_LOCATION_REMOVE", false);
            if (pendingIntent6 == null) {
                return;
            }
            if (!booleanExtra10) {
                aire aire6 = this.b;
                aire6.m.a(aire6.d(), pendingIntent6);
                return;
            }
            this.b.m.a(pendingIntent6);
        }
    }

    public final synchronized void a() {
        if (this.d.a()) {
            if (this.f.a()) {
                stopSelf();
                return;
            }
        }
        this.k = true;
    }
}
