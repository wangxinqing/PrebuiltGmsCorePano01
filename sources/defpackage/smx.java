package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.Vibrator;
import android.view.View;
import android.view.WindowManager;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.google.android.chimera.Service;

/* renamed from: smx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class smx extends Service implements View.OnTouchListener, Response.Listener, Response.ErrorListener, sne {
    public static final /* synthetic */ int n = 0;
    private static final long[] o = {0, 500, 500};
    protected BroadcastReceiver a = null;
    protected String b;
    protected boolean c;
    protected WindowManager d;
    protected View e;
    protected boolean f;
    public String g;
    protected sng h;
    protected Vibrator i;
    protected final Runnable j = a();
    protected qvr k;
    protected byte[] l;
    protected final Runnable m = new smw(this);

    public static void a(Context context) {
        context.stopService(aann.a(context, "com.google.android.gms.mdm.services.RingService"));
    }

    /* access modifiers changed from: protected */
    public abstract Runnable a();

    /* access modifiers changed from: protected */
    public abstract void a(Intent intent);

    /* access modifiers changed from: protected */
    public abstract avty b(Intent intent);

    public final void b() {
        stopSelf();
    }

    /* access modifiers changed from: protected */
    public abstract sng c();

    /* access modifiers changed from: protected */
    public abstract int d();

    /* access modifiers changed from: protected */
    public abstract int e();

    /* access modifiers changed from: protected */
    public abstract int f();

    /* access modifiers changed from: protected */
    public abstract boolean g();

    public final IBinder onBind(Intent intent) {
        return null;
    }

    public final void onErrorResponse(VolleyError volleyError) {
        snn.a("Failed to send the payload", volleyError);
    }

    public final /* bridge */ /* synthetic */ void onResponse(Object obj) {
        avul avul = (avul) obj;
        int i2 = crc.a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:77:0x021f A[Catch:{ all -> 0x0214 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int onStartCommand(android.content.Intent r18, int r19, int r20) {
        /*
            r17 = this;
            r11 = r17
            r12 = r18
            java.lang.String r13 = "echoServerToken"
            r14 = 2
            if (r12 != 0) goto L_0x000a
            goto L_0x0075
        L_0x000a:
            java.lang.String r0 = r18.getAction()
            java.lang.String r1 = "unpair"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0075
            java.lang.String r0 = r12.getStringExtra(r13)
            r11.g = r0
            java.lang.String r0 = "com.google.android.gms.nearby.discovery.ACCOUNT_KEY"
            byte[] r1 = r12.getByteArrayExtra(r0)
            r11.l = r1
            com.google.android.gms.mdm.services.BaseRingOrUnpairChimeraService$2 r1 = new com.google.android.gms.mdm.services.BaseRingOrUnpairChimeraService$2
            java.lang.String r2 = "security"
            r1.<init>(r11, r2)
            r11.a = r1
            android.content.IntentFilter r2 = new android.content.IntentFilter
            java.lang.String r3 = "android.bluetooth.device.action.ACL_DISCONNECTED"
            r2.<init>(r3)
            r11.registerReceiver(r1, r2)
            android.content.Intent r1 = new android.content.Intent
            r1.<init>()
            android.content.ComponentName r2 = new android.content.ComponentName
            java.lang.String r3 = r17.getPackageName()
            java.lang.String r4 = "com.google.android.gms.nearby.discovery.service.DiscoveryService"
            r2.<init>(r3, r4)
            android.content.Intent r1 = r1.setComponent(r2)
            java.lang.String r2 = "com.google.android.gms.nearby.discovery:ACTION_FAST_PAIR_UNPAIR"
            android.content.Intent r1 = r1.setAction(r2)
            byte[] r2 = r11.l
            android.content.Intent r0 = r1.putExtra(r0, r2)
            r11.startService(r0)
            qvr r0 = new qvr
            r0.<init>()
            r11.k = r0
            java.lang.Runnable r1 = r11.m
            azfk r2 = defpackage.azfk.a
            azfl r2 = r2.a()
            long r2 = r2.g()
            r0.postDelayed(r1, r2)
            defpackage.acrm.b(r17, r18)
            return r14
        L_0x0075:
            int r0 = r17.d()
            int r0 = defpackage.hdg.a(r11, r0)
            defpackage.snh.b(r17)
            boolean r1 = defpackage.jkr.e()
            if (r1 == 0) goto L_0x008e
            je r1 = new je
            java.lang.String r2 = "find_my_device"
            r1.<init>(r11, r2)
            goto L_0x0093
        L_0x008e:
            je r1 = new je
            r1.<init>(r11)
        L_0x0093:
            r1.b((int) r0)
            int r0 = r17.e()
            java.lang.String r0 = r11.getString(r0)
            r1.e(r0)
            r0 = 2131953237(0x7f130655, float:1.954294E38)
            java.lang.String r0 = r11.getString(r0)
            r1.b((java.lang.CharSequence) r0)
            android.content.Intent r0 = new android.content.Intent
            java.lang.Class<com.google.android.gms.mdm.receivers.StopRingReceiver> r2 = com.google.android.gms.mdm.receivers.StopRingReceiver.class
            r0.<init>(r11, r2)
            r2 = 1073741824(0x40000000, float:2.0)
            r15 = 0
            android.app.PendingIntent r0 = android.app.PendingIntent.getBroadcast(r11, r15, r0, r2)
            r1.f = r0
            r10 = 1
            r1.a((boolean) r10)
            int r0 = r17.f()
            int r0 = defpackage.kf.b(r11, r0)
            r1.u = r0
            r1.j = r14
            java.lang.String r0 = "alarm"
            r1.s = r0
            r1.e()
            r0 = 76182(0x12996, float:1.06754E-40)
            android.app.Notification r1 = r1.b()
            r11.startForeground(r0, r1)
            boolean r0 = r17.g()
            r11.f = r0
            if (r0 != 0) goto L_0x00ef
            java.lang.String r0 = "vibrator"
            java.lang.Object r0 = r11.getSystemService(r0)
            android.os.Vibrator r0 = (android.os.Vibrator) r0
            r11.i = r0
            goto L_0x00f9
        L_0x00ef:
            sng r0 = r11.h
            if (r0 != 0) goto L_0x00f9
            sng r0 = r17.c()
            r11.h = r0
        L_0x00f9:
            java.lang.String r0 = "window"
            java.lang.Object r0 = r11.getSystemService(r0)
            android.view.WindowManager r0 = (android.view.WindowManager) r0
            r11.d = r0
            java.lang.String r1 = "stopRinging"
            if (r12 == 0) goto L_0x015c
            java.lang.String r0 = r18.getAction()
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x015c
            android.view.View r0 = r11.e
            if (r0 == 0) goto L_0x0117
            goto L_0x0155
        L_0x0117:
            r2 = 0
        L_0x0118:
            r0 = 3
            if (r2 >= r0) goto L_0x0155
            android.view.WindowManager$LayoutParams r0 = new android.view.WindowManager$LayoutParams     // Catch:{ RuntimeException -> 0x014a }
            boolean r3 = defpackage.jkr.e()     // Catch:{ RuntimeException -> 0x014a }
            if (r3 != 0) goto L_0x0128
            r3 = 2010(0x7da, float:2.817E-42)
            r6 = 2010(0x7da, float:2.817E-42)
            goto L_0x012c
        L_0x0128:
            r3 = 2038(0x7f6, float:2.856E-42)
            r6 = 2038(0x7f6, float:2.856E-42)
        L_0x012c:
            r4 = -1
            r5 = -1
            r7 = 524480(0x800c0, float:7.34953E-40)
            r8 = -2
            r3 = r0
            r3.<init>(r4, r5, r6, r7, r8)     // Catch:{ RuntimeException -> 0x014a }
            android.view.View r3 = new android.view.View     // Catch:{ RuntimeException -> 0x014a }
            r3.<init>(r11)     // Catch:{ RuntimeException -> 0x014a }
            r11.e = r3     // Catch:{ RuntimeException -> 0x014a }
            r3.setOnTouchListener(r11)     // Catch:{ RuntimeException -> 0x014a }
            android.view.WindowManager r3 = r11.d     // Catch:{ RuntimeException -> 0x014a }
            android.view.View r4 = r11.e     // Catch:{ RuntimeException -> 0x014a }
            r3.addView(r4, r0)     // Catch:{ RuntimeException -> 0x014a }
            int r0 = defpackage.crc.a     // Catch:{ RuntimeException -> 0x014a }
            goto L_0x015c
        L_0x014a:
            r0 = move-exception
            java.lang.Object[] r3 = new java.lang.Object[r15]
            java.lang.String r4 = "Could not add view to stop rings"
            defpackage.snn.a(r0, r4, r3)
            int r2 = r2 + 1
            goto L_0x0118
        L_0x0155:
            java.lang.Object[] r0 = new java.lang.Object[r15]
            java.lang.String r2 = "Could not add view to stop rings."
            defpackage.snn.a(r2, r0)
        L_0x015c:
            r0 = 0
            java.lang.String r9 = "remote"
            if (r12 == 0) goto L_0x0204
            java.lang.String r2 = r18.getAction()     // Catch:{ SecurityException -> 0x0200 }
            boolean r1 = r1.equals(r2)     // Catch:{ SecurityException -> 0x0200 }
            if (r1 == 0) goto L_0x0182
            boolean r1 = r12.getBooleanExtra(r9, r15)     // Catch:{ SecurityException -> 0x0200 }
            if (r1 == 0) goto L_0x0182
            r11.c = r10     // Catch:{ SecurityException -> 0x0200 }
            java.lang.String r0 = r12.getStringExtra(r13)     // Catch:{ SecurityException -> 0x0200 }
            r11.g = r0     // Catch:{ SecurityException -> 0x0200 }
            int r0 = defpackage.crc.a     // Catch:{ SecurityException -> 0x0200 }
            r17.stopSelf()     // Catch:{ SecurityException -> 0x0200 }
            defpackage.acrm.b(r17, r18)
            return r14
        L_0x0182:
            boolean r1 = r11.f     // Catch:{ SecurityException -> 0x0200 }
            if (r1 != 0) goto L_0x019b
            qvr r1 = new qvr     // Catch:{ SecurityException -> 0x0200 }
            r1.<init>()     // Catch:{ SecurityException -> 0x0200 }
            java.lang.Runnable r2 = r11.j     // Catch:{ SecurityException -> 0x0200 }
            r3 = 300000(0x493e0, double:1.482197E-318)
            r1.postDelayed(r2, r3)     // Catch:{ SecurityException -> 0x0200 }
            android.os.Vibrator r1 = r11.i     // Catch:{ SecurityException -> 0x0200 }
            long[] r2 = o     // Catch:{ SecurityException -> 0x0200 }
            r1.vibrate(r2, r15)     // Catch:{ SecurityException -> 0x0200 }
            goto L_0x01b6
        L_0x019b:
            sng r1 = r11.h     // Catch:{ SecurityException -> 0x0200 }
            snd r2 = r1.e     // Catch:{ SecurityException -> 0x0200 }
            if (r2 != 0) goto L_0x01b6
            android.media.MediaPlayer r2 = new android.media.MediaPlayer     // Catch:{ SecurityException -> 0x0200 }
            r2.<init>()     // Catch:{ SecurityException -> 0x0200 }
            r1.c = r2     // Catch:{ SecurityException -> 0x0200 }
            snj r2 = new snj     // Catch:{ SecurityException -> 0x0200 }
            r2.<init>(r1)     // Catch:{ SecurityException -> 0x0200 }
            r1.e = r2     // Catch:{ SecurityException -> 0x0200 }
            snd r1 = r1.e     // Catch:{ SecurityException -> 0x0200 }
            java.lang.Void[] r2 = new java.lang.Void[r15]     // Catch:{ SecurityException -> 0x0200 }
            r1.execute(r2)     // Catch:{ SecurityException -> 0x0200 }
        L_0x01b6:
            boolean r1 = r12.getBooleanExtra(r9, r15)     // Catch:{ SecurityException -> 0x0200 }
            if (r1 == 0) goto L_0x01f7
            java.lang.String r1 = "includeBatteryStatus"
            boolean r1 = r12.getBooleanExtra(r1, r15)     // Catch:{ SecurityException -> 0x0200 }
            if (r1 == 0) goto L_0x01d3
            java.lang.String r0 = "batterymanager"
            java.lang.Object r0 = r11.getSystemService(r0)     // Catch:{ SecurityException -> 0x0200 }
            android.os.BatteryManager r0 = (android.os.BatteryManager) r0     // Catch:{ SecurityException -> 0x0200 }
            avtx r0 = defpackage.sni.a(r17)     // Catch:{ SecurityException -> 0x0200 }
            r3 = r0
            goto L_0x01d4
        L_0x01d3:
            r3 = r0
        L_0x01d4:
            avty r4 = r17.b(r18)     // Catch:{ SecurityException -> 0x0200 }
            java.lang.String r0 = r12.getStringExtra(r13)     // Catch:{ SecurityException -> 0x0200 }
            r11.g = r0     // Catch:{ SecurityException -> 0x0200 }
            avuj[] r1 = new defpackage.avuj[r10]     // Catch:{ SecurityException -> 0x0200 }
            avuj r0 = defpackage.avuj.SUCCESS     // Catch:{ SecurityException -> 0x0200 }
            r1[r15] = r0     // Catch:{ SecurityException -> 0x0200 }
            r2 = 0
            java.lang.String r5 = r11.g     // Catch:{ SecurityException -> 0x0200 }
            r6 = 0
            boolean r7 = defpackage.snh.a(r17)     // Catch:{ SecurityException -> 0x0200 }
            r8 = 0
            r16 = r9
            r9 = r17
            r10 = r17
            defpackage.smh.a(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)     // Catch:{ SecurityException -> 0x0216 }
            goto L_0x01fc
        L_0x01f7:
            r16 = r9
            r17.a((android.content.Intent) r18)     // Catch:{ SecurityException -> 0x0216 }
        L_0x01fc:
            defpackage.acrm.b(r17, r18)
            return r14
        L_0x0200:
            r0 = move-exception
            r16 = r9
            goto L_0x0217
        L_0x0204:
            r16 = r9
            java.lang.String r1 = "Service intent is null."
            java.lang.Object[] r2 = new java.lang.Object[r15]     // Catch:{ SecurityException -> 0x0216 }
            defpackage.snn.a(r1, r2)     // Catch:{ SecurityException -> 0x0216 }
            r17.stopSelf()     // Catch:{ SecurityException -> 0x0216 }
            defpackage.acrm.b(r11, r0)
            return r14
        L_0x0214:
            r0 = move-exception
            goto L_0x0242
        L_0x0216:
            r0 = move-exception
        L_0x0217:
            r1 = r16
            boolean r0 = r12.getBooleanExtra(r1, r15)     // Catch:{ all -> 0x0214 }
            if (r0 == 0) goto L_0x023e
            java.lang.String r0 = r12.getStringExtra(r13)     // Catch:{ all -> 0x0214 }
            r11.g = r0     // Catch:{ all -> 0x0214 }
            r1 = 1
            avuj[] r1 = new defpackage.avuj[r1]     // Catch:{ all -> 0x0214 }
            avuj r0 = defpackage.avuj.GMS_PERMISSION_DENIED     // Catch:{ all -> 0x0214 }
            r1[r15] = r0     // Catch:{ all -> 0x0214 }
            r2 = 0
            r3 = 0
            r4 = 0
            java.lang.String r5 = r11.g     // Catch:{ all -> 0x0214 }
            r6 = 0
            boolean r7 = defpackage.snh.a(r17)     // Catch:{ all -> 0x0214 }
            r8 = 0
            r9 = r17
            r10 = r17
            defpackage.smh.a(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)     // Catch:{ all -> 0x0214 }
        L_0x023e:
            defpackage.acrm.b(r17, r18)
            return r14
        L_0x0242:
            defpackage.acrm.b(r17, r18)
            goto L_0x0247
        L_0x0246:
            throw r0
        L_0x0247:
            goto L_0x0246
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.smx.onStartCommand(android.content.Intent, int, int):int");
    }

    public static void a(Context context, String str, boolean z, Boolean bool, boolean z2) {
        Intent a2 = aann.a(context, "com.google.android.gms.mdm.services.RingService");
        a2.putExtra("remote", true);
        a2.putExtra("echoServerToken", str);
        a2.putExtra("includeBatteryStatus", z);
        a2.putExtra("includeConnectivityStatus", bool);
        if (z2) {
            a2.setAction("stopRinging");
        }
        acrm.c(context, a2);
    }
}
