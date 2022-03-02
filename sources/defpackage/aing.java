package defpackage;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.location.Location;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.os.WorkSource;
import android.util.Log;
import com.google.android.chimera.Service;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.location.geofencer.service.GeofencerStateMachine$AlarmListener;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import org.chromium.net.UrlRequest;

/* renamed from: aing  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aing extends aioa implements PendingIntent.OnFinished, aijw, aikj {
    static volatile aing A;
    public static final /* synthetic */ int E = 0;
    public final aimg B;
    public final aucd C;
    public final aucd D;
    private final aina M;
    private final GeofencerStateMachine$AlarmListener N;
    private final jhr O;
    private final ajqr P;
    public final aimz a;
    public final aimu b;
    public final aimx c;
    public final aind d;
    public final aine e;
    public final ainb f;
    public final ainf g;
    public final aimv h;
    public final aimo i;
    public final aimt j;
    public final Object k;
    public final Context l;
    public final aiml m;
    public final jkb n;
    public final jgy o;
    public long p;
    public final aikk q;
    public final ArrayDeque r;
    public final IntentFilter s;
    final BroadcastReceiver t;
    public volatile boolean u;
    public volatile boolean v;
    public final List w;
    public final aink x;
    public boolean y;
    public final ajbi z;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public aing(android.content.Context r17, defpackage.aekn r18) {
        /*
            r16 = this;
            r8 = r16
            r9 = r17
            ajqr r10 = new ajqr
            r10.<init>(r9)
            aoau r0 = defpackage.aoau.d
            aucd r7 = r0.o()
            boolean r0 = defpackage.jgu.f(r17)
            boolean r1 = r7.c
            r11 = 0
            if (r1 != 0) goto L_0x0019
            goto L_0x001e
        L_0x0019:
            r7.c()
            r7.c = r11
        L_0x001e:
            aucj r1 = r7.b
            aoau r1 = (defpackage.aoau) r1
            int r2 = r1.a
            r12 = 1
            r2 = r2 | r12
            r1.a = r2
            r1.b = r0
            boolean r0 = defpackage.jhg.f()
            boolean r1 = r7.c
            if (r1 == 0) goto L_0x0037
            r7.c()
            r7.c = r11
        L_0x0037:
            aucj r1 = r7.b
            aoau r1 = (defpackage.aoau) r1
            int r2 = r1.a
            r2 = r2 | 2
            r1.a = r2
            r1.c = r0
            if (r9 == 0) goto L_0x02e8
            acrz r13 = new acrz
            r2 = 1
            r4 = 0
            java.lang.String r3 = "Wakeful StateMachine: GeofencerStateMachine"
            java.lang.String r5 = "com.google.android.gms"
            java.lang.String r6 = "LOCATION"
            r0 = r13
            r1 = r17
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r13.a((boolean) r11)
            java.lang.String r14 = "GeofencerStateMachine"
            r8.<init>(r14, r13)
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r8.k = r0
            r0 = -1
            r8.p = r0
            java.util.ArrayDeque r0 = new java.util.ArrayDeque
            r0.<init>()
            r8.r = r0
            r8.u = r11
            r8.v = r12
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r8.w = r0
            r8.y = r11
            r8.l = r9
            jkb r0 = defpackage.jkb.a((android.content.Context) r17)
            r8.n = r0
            aybu r0 = defpackage.aybu.a
            aybv r0 = r0.a()
            boolean r0 = r0.enableClearCutLogs()
            r13 = 0
            if (r0 == 0) goto L_0x00ae
            aucd r0 = e()
            r8.C = r0
            aucd r0 = e()
            r8.D = r0
            aikk r6 = new aikk
            aucd r2 = r8.C
            aucd r3 = r8.D
            r0 = r6
            r1 = r17
            r4 = r7
            r5 = r16
            r0.<init>(r1, r2, r3, r4, r5)
            r7 = r6
            goto L_0x00b3
        L_0x00ae:
            r8.C = r13
            r8.D = r13
            r7 = r13
        L_0x00b3:
            r8.q = r7
            aiml r15 = new aiml
            ainy r3 = r8.K
            java.lang.String r5 = "com.google.android.location.internal.GoogleLocationManagerService"
            r0 = r15
            r1 = r18
            r2 = r17
            r4 = r16
            r6 = r16
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r8.m = r15
            aina r0 = new aina
            aiml r1 = r8.m
            r0.<init>(r8, r1)
            r8.M = r0
            aimu r0 = new aimu
            aiml r1 = r8.m
            r0.<init>(r8, r1)
            r8.b = r0
            aimz r0 = new aimz
            aiml r1 = r8.m
            r0.<init>(r8, r1)
            r8.a = r0
            aimx r0 = new aimx
            aiml r1 = r8.m
            r0.<init>(r8, r1)
            r8.c = r0
            aind r0 = new aind
            aiml r1 = r8.m
            r0.<init>(r8, r1)
            r8.d = r0
            aine r0 = new aine
            aiml r1 = r8.m
            r0.<init>(r8, r1)
            r8.e = r0
            ainb r0 = new ainb
            aiml r1 = r8.m
            r0.<init>(r8, r1)
            r8.f = r0
            ainf r0 = new ainf
            aiml r1 = r8.m
            r0.<init>(r8, r1)
            r8.g = r0
            aimv r0 = new aimv
            aiml r1 = r8.m
            r0.<init>(r8, r1)
            r8.h = r0
            aimo r0 = new aimo
            aiml r1 = r8.m
            r0.<init>(r8, r1)
            r8.i = r0
            aimt r0 = new aimt
            aiml r1 = r8.m
            r0.<init>(r8, r1)
            r8.j = r0
            jgy r0 = defpackage.jgy.a((android.content.Context) r17)
            r8.o = r0
            com.google.android.location.geofencer.service.GeofencerStateMachine$AlarmListener r0 = new com.google.android.location.geofencer.service.GeofencerStateMachine$AlarmListener
            r0.<init>(r8)
            r8.N = r0
            boolean r0 = defpackage.aikq.a
            ainy r0 = r8.K
            if (r0 != 0) goto L_0x0140
            goto L_0x0142
        L_0x0140:
            r0.a = r11
        L_0x0142:
            boolean r0 = defpackage.aikq.a
            ainy r0 = r8.K
            ainu r0 = r0.c
            r0.d()
            com.google.android.location.geofencer.service.GeofencerStateMachine$Receiver r0 = new com.google.android.location.geofencer.service.GeofencerStateMachine$Receiver
            r0.<init>(r8)
            r8.t = r0
            android.content.IntentFilter r0 = new android.content.IntentFilter
            r0.<init>()
            java.lang.String r1 = "android.intent.action.ACTION_POWER_CONNECTED"
            r0.addAction(r1)
            java.lang.String r1 = "android.intent.action.ACTION_POWER_DISCONNECTED"
            r0.addAction(r1)
            java.lang.String r1 = "android.intent.action.SCREEN_OFF"
            r0.addAction(r1)
            java.lang.String r1 = "android.intent.action.SCREEN_ON"
            r0.addAction(r1)
            r8.s = r0
            aina r0 = r8.M
            r8.a((defpackage.ains) r0)
            aimu r0 = r8.b
            r8.a((defpackage.ains) r0)
            aimz r0 = r8.a
            r8.a((defpackage.ains) r0)
            aimx r0 = r8.c
            r8.a((defpackage.ains) r0)
            aind r0 = r8.d
            r8.a((defpackage.ains) r0)
            aine r0 = r8.e
            r8.a((defpackage.ains) r0)
            ainb r0 = r8.f
            r8.a((defpackage.ains) r0)
            ainf r0 = r8.g
            r8.a((defpackage.ains) r0)
            aimv r0 = r8.h
            r8.a((defpackage.ains) r0)
            aimo r0 = r8.i
            r8.a((defpackage.ains) r0)
            aimt r0 = r8.j
            r8.a((defpackage.ains) r0)
            aina r0 = r8.M
            ainy r1 = r8.K
            boolean r2 = r1.a
            r1.k = r0
            android.content.pm.PackageManager r0 = r17.getPackageManager()
            aimm r1 = new aimm
            qvr r2 = new qvr
            r2.<init>()
            java.lang.String r3 = "location"
            r1.<init>(r8, r3, r14, r2)
            aink r2 = new aink
            r2.<init>(r9, r1)
            aucd r1 = r8.C
            if (r1 != 0) goto L_0x01c7
            goto L_0x023c
        L_0x01c7:
            aucd r3 = r8.D
            if (r3 == 0) goto L_0x023c
            java.lang.String r3 = "android.hardware.location.gps"
            boolean r3 = r0.hasSystemFeature(r3)
            boolean r4 = r1.c
            if (r4 == 0) goto L_0x01da
            r1.c()
            r1.c = r11
        L_0x01da:
            aucj r1 = r1.b
            aoal r1 = (defpackage.aoal) r1
            aoal r4 = defpackage.aoal.g
            int r4 = r1.a
            r4 = r4 | r12
            r1.a = r4
            r1.b = r3
            aucd r1 = r8.C
            java.lang.String r3 = "android.hardware.location.network"
            boolean r0 = r0.hasSystemFeature(r3)
            boolean r3 = r1.c
            if (r3 != 0) goto L_0x01f4
            goto L_0x01f9
        L_0x01f4:
            r1.c()
            r1.c = r11
        L_0x01f9:
            aucj r1 = r1.b
            aoal r1 = (defpackage.aoal) r1
            int r3 = r1.a
            r3 = r3 | 2
            r1.a = r3
            r1.c = r0
            aucd r0 = r8.D
            boolean r1 = r2.b()
            boolean r3 = r0.c
            if (r3 != 0) goto L_0x0210
            goto L_0x0215
        L_0x0210:
            r0.c()
            r0.c = r11
        L_0x0215:
            aucj r0 = r0.b
            aoal r0 = (defpackage.aoal) r0
            int r3 = r0.a
            r3 = r3 | r12
            r0.a = r3
            r0.b = r1
            aucd r0 = r8.D
            boolean r1 = r2.a()
            boolean r3 = r0.c
            if (r3 != 0) goto L_0x022b
            goto L_0x0230
        L_0x022b:
            r0.c()
            r0.c = r11
        L_0x0230:
            aucj r0 = r0.b
            aoal r0 = (defpackage.aoal) r0
            int r3 = r0.a
            r3 = r3 | 2
            r0.a = r3
            r0.c = r1
        L_0x023c:
            r8.x = r2
            r8.P = r10
            java.lang.String r0 = "sensor"
            java.lang.Object r0 = r9.getSystemService(r0)
            android.hardware.SensorManager r0 = (android.hardware.SensorManager) r0
            int r1 = android.os.Build.VERSION.SDK_INT
            ajbr r1 = new ajbr
            boolean r2 = defpackage.axwx.o()
            r1.<init>(r0, r2)
            aucd r0 = r8.C
            if (r0 != 0) goto L_0x0258
            goto L_0x0292
        L_0x0258:
            aucd r2 = r8.D
            if (r2 == 0) goto L_0x0292
            boolean r2 = r1.d
            boolean r3 = r0.c
            if (r3 != 0) goto L_0x0263
            goto L_0x0268
        L_0x0263:
            r0.c()
            r0.c = r11
        L_0x0268:
            aucj r0 = r0.b
            aoal r0 = (defpackage.aoal) r0
            aoal r3 = defpackage.aoal.g
            int r3 = r0.a
            r3 = r3 | 4
            r0.a = r3
            r0.d = r2
            aucd r0 = r8.D
            boolean r2 = r1.b()
            boolean r3 = r0.c
            if (r3 != 0) goto L_0x0281
            goto L_0x0286
        L_0x0281:
            r0.c()
            r0.c = r11
        L_0x0286:
            aucj r0 = r0.b
            aoal r0 = (defpackage.aoal) r0
            int r3 = r0.a
            r3 = r3 | 4
            r0.a = r3
            r0.d = r2
        L_0x0292:
            r8.z = r1
            jhr r0 = defpackage.jhr.a((android.content.Context) r17)
            r8.O = r0
            aimg r0 = new aimg
            boolean r1 = defpackage.ayca.b()
            if (r1 == 0) goto L_0x02be
            ayca r1 = defpackage.ayca.a
            aycb r1 = r1.a()
            long r1 = r1.geofencerSpecialEventBurstEvents()
            int r2 = (int) r1
            ixy r1 = new ixy
            ayca r3 = defpackage.ayca.a
            aycb r3 = r3.a()
            long r3 = r3.geofencerSpecialEventIntervalSeconds()
            int r4 = (int) r3
            r1.<init>(r4, r2, r2)
            goto L_0x02bf
        L_0x02be:
            r1 = r13
        L_0x02bf:
            boolean r2 = defpackage.ayca.b()
            if (r2 == 0) goto L_0x02e1
            ayca r2 = defpackage.ayca.a
            aycb r2 = r2.a()
            long r2 = r2.geofencerUpdateDetectorBurstEvents()
            int r3 = (int) r2
            ixy r13 = new ixy
            ayca r2 = defpackage.ayca.a
            aycb r2 = r2.a()
            long r4 = r2.geofencerUpdateDetectorIntervalSeconds()
            int r2 = (int) r4
            r13.<init>(r2, r3, r3)
            goto L_0x02e2
        L_0x02e1:
        L_0x02e2:
            r0.<init>(r1, r13)
            r8.B = r0
            return
        L_0x02e8:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Context can not be null in a wakeful state machine."
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aing.<init>(android.content.Context, aekn):void");
    }

    public static int a(aisp aisp) {
        aisp aisp2 = aisp.UNAVAILABLE;
        int ordinal = aisp.ordinal();
        if (ordinal == 0) {
            return 3;
        }
        if (ordinal == 2) {
            return 4;
        }
        if (ordinal != 3) {
            return ordinal != 4 ? 2 : 6;
        }
        return 5;
    }

    private static final aucd e() {
        aucd o2 = aoal.g.o();
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        aoal aoal = (aoal) o2.b;
        int i2 = aoal.a | 1;
        aoal.a = i2;
        aoal.b = false;
        int i3 = i2 | 2;
        aoal.a = i3;
        aoal.c = false;
        int i4 = i3 | 4;
        aoal.a = i4;
        aoal.d = false;
        int i5 = i4 | 8;
        aoal.a = i5;
        aoal.e = false;
        aoal.a = i5 | 16;
        aoal.f = false;
        return o2;
    }

    public final void b(aijq aijq, Location location) {
        aijq aijq2 = aijq;
        Location location2 = location;
        ((aimr) c()).a(aijq2);
        if (this.r.isEmpty()) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (this.p == -1 || aycd.b() == 0 || elapsedRealtime - this.p > aycd.b()) {
                this.p = elapsedRealtime;
                a(aijq, location);
                return;
            }
            long j2 = this.p;
            long b2 = aycd.b();
            this.r.add(new ainc(aijq2, location2));
            this.o.a("GeofencerStateMachine", 2, j2 + b2, (jgw) this.N, (Handler) this.K, (WorkSource) null);
            return;
        }
        this.r.add(new ainc(aijq2, location2));
    }

    public final void onSendFinished(PendingIntent pendingIntent, Intent intent, int i2, String str, Bundle bundle) {
        this.m.f();
    }

    /* JADX WARNING: Removed duplicated region for block: B:101:0x031f  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x033e  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x02eb  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void a(java.util.List r27, int r28, android.location.Location r29) {
        /*
            r26 = this;
            r1 = r26
            r2 = r28
            r3 = r29
            jkb r0 = r1.n
            boolean r0 = r0.a()
            if (r0 == 0) goto L_0x0344
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            int r4 = r27.size()
            r5 = 0
            r6 = 0
        L_0x0019:
            if (r6 >= r4) goto L_0x003d
            r7 = r27
            java.lang.Object r8 = r7.get(r6)
            aijt r8 = (defpackage.aijt) r8
            android.app.PendingIntent r9 = r8.b
            java.lang.Object r10 = r0.get(r9)
            java.util.ArrayList r10 = (java.util.ArrayList) r10
            if (r10 != 0) goto L_0x0036
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            r0.put(r9, r10)
            goto L_0x0037
        L_0x0036:
        L_0x0037:
            r10.add(r8)
            int r6 = r6 + 1
            goto L_0x0019
        L_0x003d:
            android.content.Context r4 = r1.l
            r4.getPackageManager()
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r4 = r0.iterator()
        L_0x004a:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0344
            java.lang.Object r0 = r4.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r6 = r0.getKey()
            android.app.PendingIntent r6 = (android.app.PendingIntent) r6
            java.lang.String r7 = defpackage.ajqj.a(r6)
            android.content.Context r8 = r1.l
            jnh r8 = defpackage.jni.b(r8)
            java.lang.String r9 = "android.permission.ACCESS_FINE_LOCATION"
            int r8 = r8.a((java.lang.String) r9, (java.lang.String) r7)
            r10 = -1
            if (r8 != r10) goto L_0x0072
            boolean r0 = defpackage.aikq.a
            goto L_0x004a
        L_0x0072:
            android.content.Context r8 = r1.l     // Catch:{ NameNotFoundException -> 0x0313 }
            jnh r8 = defpackage.jni.b(r8)     // Catch:{ NameNotFoundException -> 0x0313 }
            android.content.pm.ApplicationInfo r8 = r8.a((java.lang.String) r7, (int) r5)     // Catch:{ NameNotFoundException -> 0x0313 }
            int r8 = r8.uid     // Catch:{ NameNotFoundException -> 0x0313 }
            jhr r10 = r1.O     // Catch:{ NameNotFoundException -> 0x0313 }
            java.lang.String r11 = "android:fine_location"
            int r8 = r10.c(r11, r8, r7)     // Catch:{ NameNotFoundException -> 0x0313 }
            if (r8 != 0) goto L_0x0307
            java.lang.Object r0 = r0.getValue()
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            boolean r8 = defpackage.aybx.b()
            if (r8 == 0) goto L_0x00a3
            aikp r8 = defpackage.aiko.a
            aikt r10 = new aikt
            ou r11 = r8.a
            aucd r12 = r8.b
            r10.<init>(r0, r3, r11, r12)
            r8.a((defpackage.aiky) r10)
            goto L_0x00ad
        L_0x00a3:
            aikp r8 = defpackage.aiko.a
            aikf r10 = new aikf
            r10.<init>(r0, r2, r3)
            r8.a((defpackage.aikn) r10)
        L_0x00ad:
            android.content.Intent r8 = new android.content.Intent
            r8.<init>()
            java.lang.String r10 = "com.google.android.location.intent.extra.transition"
            r8.putExtra(r10, r2)
            java.util.ArrayList r10 = new java.util.ArrayList
            int r11 = r0.size()
            r10.<init>(r11)
            int r11 = r0.size()
            r12 = 0
        L_0x00c5:
            if (r12 >= r11) goto L_0x00d5
            java.lang.Object r13 = r0.get(r12)
            aijt r13 = (defpackage.aijt) r13
            com.google.android.gms.location.internal.ParcelableGeofence r13 = r13.a
            r10.add(r13)
            int r12 = r12 + 1
            goto L_0x00c5
        L_0x00d5:
            java.util.ArrayList r11 = new java.util.ArrayList
            int r12 = r10.size()
            r11.<init>(r12)
            int r12 = r10.size()
            r13 = 0
        L_0x00e3:
            if (r13 >= r12) goto L_0x00ff
            java.lang.Object r14 = r10.get(r13)
            com.google.android.gms.location.internal.ParcelableGeofence r14 = (com.google.android.gms.location.internal.ParcelableGeofence) r14
            android.os.Parcel r15 = android.os.Parcel.obtain()
            defpackage.rgy.a(r14, r15)
            byte[] r14 = r15.marshall()
            r15.recycle()
            r11.add(r14)
            int r13 = r13 + 1
            goto L_0x00e3
        L_0x00ff:
            java.lang.String r10 = "com.google.android.location.intent.extra.geofence_list"
            r8.putExtra(r10, r11)
            if (r3 == 0) goto L_0x011f
            ajqr r10 = r1.P
            int r10 = r10.a(r7)
            r11 = 5000000(0x4c4b40, float:7.006492E-39)
            if (r10 < r11) goto L_0x011f
            boolean r10 = defpackage.rev.j(r29)
            android.location.Location r10 = defpackage.aifj.a(r3, r10)
            java.lang.String r11 = "com.google.android.location.intent.extra.triggering_location"
            r8.putExtra(r11, r10)
        L_0x011f:
            aikk r10 = r1.q
            if (r10 != 0) goto L_0x012b
            r16 = r4
            r23 = r6
            r20 = r8
            goto L_0x028e
        L_0x012b:
            int r10 = r0.size()
            r11 = 0
        L_0x0130:
            if (r11 >= r10) goto L_0x0288
            java.lang.Object r12 = r0.get(r11)
            aijt r12 = (defpackage.aijt) r12
            r13 = 1
            float[] r14 = new float[r13]
            com.google.android.gms.location.internal.ParcelableGeofence r15 = r12.a
            r16 = r14
            double r13 = r15.d
            r23 = r6
            double r5 = r15.e
            double r18 = r29.getLatitude()
            double r20 = r29.getLongitude()
            r25 = r0
            r0 = r15
            r24 = r16
            r14 = r13
            r16 = r5
            r22 = r24
            android.location.Location.distanceBetween(r14, r16, r18, r20, r22)
            aikk r5 = r1.q
            java.lang.String r6 = r12.c
            ains r13 = r26.c()
            aimr r13 = (defpackage.aimr) r13
            aoaq r13 = r13.a()
            float r0 = r0.f
            float r14 = r29.getAccuracy()
            r15 = 0
            r3 = r24[r15]
            boolean r15 = r5.d()
            r16 = r4
            if (r15 == 0) goto L_0x01f4
            aucd r15 = r5.e()
            aoah r18 = defpackage.aoah.h
            aucd r4 = r18.o()
            java.lang.String r6 = defpackage.aikk.a((java.lang.String) r7, (java.lang.String) r6)
            r18 = r10
            boolean r10 = r4.c
            if (r10 == 0) goto L_0x0193
            r4.c()
            r10 = 0
            r4.c = r10
        L_0x0193:
            aucj r10 = r4.b
            aoah r10 = (defpackage.aoah) r10
            r6.getClass()
            r20 = r8
            int r8 = r10.a
            r21 = 1
            r8 = r8 | 1
            r10.a = r8
            r10.b = r6
            int r6 = r13.m
            r10.c = r6
            r6 = 2
            r8 = r8 | r6
            r10.a = r8
            r6 = 4
            r8 = r8 | r6
            r10.a = r8
            r10.d = r2
            r6 = r8 | 8
            r10.a = r6
            r10.e = r0
            r0 = r6 | 16
            r10.a = r0
            r10.f = r14
            r0 = r0 | 32
            r10.a = r0
            r10.g = r3
            aucj r0 = r4.i()
            aoah r0 = (defpackage.aoah) r0
            boolean r3 = r15.c
            if (r3 != 0) goto L_0x01d1
            goto L_0x01d7
        L_0x01d1:
            r15.c()
            r3 = 0
            r15.c = r3
        L_0x01d7:
            aucj r3 = r15.b
            aoar r3 = (defpackage.aoar) r3
            aoar r4 = defpackage.aoar.m
            r0.getClass()
            r3.l = r0
            int r0 = r3.a
            r0 = r0 | 1024(0x400, float:1.435E-42)
            r3.a = r0
            aikh r0 = r5.a
            aucj r3 = r15.i()
            aoar r3 = (defpackage.aoar) r3
            r0.a(r3)
            goto L_0x01f8
        L_0x01f4:
            r20 = r8
            r18 = r10
        L_0x01f8:
            aikk r0 = r1.q
            java.lang.String r3 = r12.c
            r0.a()
            java.lang.String r3 = defpackage.aikk.a((java.lang.String) r7, (java.lang.String) r3)
            aiki r0 = r0.a((java.lang.String) r3)
            aucd r0 = r0.b
            r3 = 1
            if (r2 == r3) goto L_0x0256
            r4 = 2
            if (r2 == r4) goto L_0x0234
            r4 = 4
            if (r2 == r4) goto L_0x0213
            goto L_0x0277
        L_0x0213:
            aucj r4 = r0.b
            aoaj r4 = (defpackage.aoaj) r4
            int r4 = r4.g
            int r4 = r4 + r3
            boolean r3 = r0.c
            if (r3 != 0) goto L_0x021f
            goto L_0x0225
        L_0x021f:
            r0.c()
            r3 = 0
            r0.c = r3
        L_0x0225:
            aucj r0 = r0.b
            aoaj r0 = (defpackage.aoaj) r0
            aoaj r3 = defpackage.aoaj.j
            int r3 = r0.a
            r3 = r3 | 32
            r0.a = r3
            r0.g = r4
            goto L_0x0277
        L_0x0234:
            aucj r3 = r0.b
            aoaj r3 = (defpackage.aoaj) r3
            int r3 = r3.f
            r4 = 1
            int r3 = r3 + r4
            boolean r4 = r0.c
            if (r4 != 0) goto L_0x0241
            goto L_0x0247
        L_0x0241:
            r0.c()
            r4 = 0
            r0.c = r4
        L_0x0247:
            aucj r0 = r0.b
            aoaj r0 = (defpackage.aoaj) r0
            aoaj r4 = defpackage.aoaj.j
            int r4 = r0.a
            r4 = r4 | 16
            r0.a = r4
            r0.f = r3
            goto L_0x0277
        L_0x0256:
            aucj r3 = r0.b
            aoaj r3 = (defpackage.aoaj) r3
            int r3 = r3.e
            r4 = 1
            int r3 = r3 + r4
            boolean r4 = r0.c
            if (r4 != 0) goto L_0x0263
            goto L_0x0269
        L_0x0263:
            r0.c()
            r4 = 0
            r0.c = r4
        L_0x0269:
            aucj r0 = r0.b
            aoaj r0 = (defpackage.aoaj) r0
            aoaj r4 = defpackage.aoaj.j
            int r4 = r0.a
            r4 = r4 | 8
            r0.a = r4
            r0.e = r3
        L_0x0277:
            int r11 = r11 + 1
            r3 = r29
            r4 = r16
            r10 = r18
            r8 = r20
            r6 = r23
            r0 = r25
            r5 = 0
            goto L_0x0130
        L_0x0288:
            r16 = r4
            r23 = r6
            r20 = r8
        L_0x028e:
            aiml r3 = r1.m
            java.lang.String r0 = defpackage.ajqj.a(r23)
            android.content.Context r4 = r3.l     // Catch:{ NameNotFoundException -> 0x02b5 }
            jnh r4 = defpackage.jni.b(r4)     // Catch:{ NameNotFoundException -> 0x02b5 }
            r5 = 0
            android.content.pm.ApplicationInfo r4 = r4.a((java.lang.String) r0, (int) r5)     // Catch:{ NameNotFoundException -> 0x02b3 }
            android.content.Context r6 = r3.l     // Catch:{ NameNotFoundException -> 0x02b3 }
            boolean r6 = defpackage.jlr.a((android.content.Context) r6)     // Catch:{ NameNotFoundException -> 0x02b3 }
            if (r6 == 0) goto L_0x02b7
            int r4 = r4.uid     // Catch:{ NameNotFoundException -> 0x02b3 }
            android.os.WorkSource r0 = defpackage.jlr.a((int) r4, (java.lang.String) r0)     // Catch:{ NameNotFoundException -> 0x02b3 }
            acrz r4 = r3.g     // Catch:{ NameNotFoundException -> 0x02b3 }
            r4.c((android.os.WorkSource) r0)     // Catch:{ NameNotFoundException -> 0x02b3 }
            goto L_0x02b7
        L_0x02b3:
            r0 = move-exception
            goto L_0x02b7
        L_0x02b5:
            r0 = move-exception
            r5 = 0
        L_0x02b7:
            acrz r0 = r3.g
            r3 = 10000(0x2710, double:4.9407E-320)
            r0.a((long) r3)
            android.content.Context r0 = r1.l     // Catch:{ CanceledException -> 0x02cf }
            r3 = r20
            r6 = r23
            defpackage.jjy.a((android.app.PendingIntent) r6, (android.content.Context) r0, (android.content.Intent) r3, (android.app.PendingIntent.OnFinished) r1, (java.lang.String) r9)     // Catch:{ CanceledException -> 0x02cd }
            r3 = r29
            r4 = r16
            goto L_0x004a
        L_0x02cd:
            r0 = move-exception
            goto L_0x02d2
        L_0x02cf:
            r0 = move-exception
            r6 = r23
        L_0x02d2:
            boolean r0 = defpackage.aikq.a
            aiml r0 = r1.m
            ainr r3 = new ainr
            r4 = 3
            java.lang.String r7 = defpackage.ajqj.a(r6)
            r8 = 0
            com.google.android.gms.location.RemoveGeofencingRequest r9 = com.google.android.gms.location.RemoveGeofencingRequest.a(r6)
            r3.<init>(r4, r7, r8, r9)
            android.util.Pair r0 = r0.a((defpackage.ainr) r3)
            if (r0 == 0) goto L_0x02fc
            ains r3 = r26.c()
            aimr r3 = (defpackage.aimr) r3
            java.lang.String r4 = defpackage.ajqj.a(r6)
            java.lang.Object r0 = r0.second
            java.util.List r0 = (java.util.List) r0
            r3.a(r4, r0)
        L_0x02fc:
            aiml r0 = r1.m
            r0.f()
            r3 = r29
            r4 = r16
            goto L_0x004a
        L_0x0307:
            r16 = r4
            boolean r0 = defpackage.aikq.a     // Catch:{ NameNotFoundException -> 0x0311 }
            r3 = r29
            r4 = r16
            goto L_0x004a
        L_0x0311:
            r0 = move-exception
            goto L_0x0316
        L_0x0313:
            r0 = move-exception
            r16 = r4
        L_0x0316:
            r0 = 6
            java.lang.String r3 = "GeofencerStateMachine"
            boolean r0 = android.util.Log.isLoggable(r3, r0)
            if (r0 == 0) goto L_0x033e
            java.lang.String r0 = java.lang.String.valueOf(r7)
            java.lang.String r4 = "Failed to retrieve Uid for package: "
            int r6 = r0.length()
            if (r6 != 0) goto L_0x0331
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4)
            goto L_0x0335
        L_0x0331:
            java.lang.String r0 = r4.concat(r0)
        L_0x0335:
            defpackage.aikq.b(r3, r0)
            r3 = r29
            r4 = r16
            goto L_0x004a
        L_0x033e:
            r3 = r29
            r4 = r16
            goto L_0x004a
        L_0x0344:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aing.a(java.util.List, int, android.location.Location):void");
    }

    public final void b(boolean z2) {
        synchronized (this.k) {
            boolean z3 = aikq.a;
            b(153, Boolean.valueOf(z2));
        }
    }

    /* access modifiers changed from: protected */
    public final String a(int i2) {
        if (i2 == 97) {
            return "SM_LOCATION_AVAILABILITY_CHANGED";
        }
        if (i2 == 98) {
            return "SM_SEND_AND_WAIT_FOR_TEST_CMD";
        }
        switch (i2) {
            case 1:
                return "SM_QUERY_LOCATION_OPT_IN_CMD";
            case 2:
                return "SM_INITIALIZE_CMD";
            case 3:
                return "SM_STOP_CMD";
            case 4:
                return "SM_ADD_GEOFENCE_LIST_CMD";
            case 5:
                return "SM_REMOVE_GEOFENCE_CMD";
            case 6:
                return "SM_LOCATION_CMD";
            case 7:
                return "SM_ACTIVITY_CMD";
            case 8:
                return "SM_UPDATE_DETECTOR_REQUIREMENT_CMD";
            case 9:
                return "SM_SYSTEM_EVENT_CMD";
            case 10:
                return "SM_SAVE_ACTIVITY_STATE_CMD";
            case 11:
                return "SM_USER_SWITCH_CMD";
            case 12:
                return "SM_HARDWARE_GEOFENCE_CHANGED_CMD";
            case UrlRequest.Status.WAITING_FOR_RESPONSE /*13*/:
                return "SM_HARDWARE_GEFOENCE_AVAILABILITY_CMD";
            case UrlRequest.Status.READING_RESPONSE /*14*/:
                return "SM_AR_DEEP_STILL_MODE";
            case Service.START_CONTINUATION_MASK:
                return "SM_SIGNIFICANT_MOTION_CMD";
            case 16:
                return "SM_REGISTERED_GEOFENCES_CHANGED_CMD";
            default:
                switch (i2) {
                    case 101:
                        return "SM_WIFI_CONNECTIVITY_CHANGED";
                    case 102:
                        return "SM_DUMP_NON_CHRE_CMD";
                    case 103:
                        return "SM_DUMP_CHRE_CMD";
                    default:
                        switch (i2) {
                            case 150:
                                return "SM_SEND_GEOFENCE_REQUEST";
                            case 151:
                                return "SM_PROCESS_TRANSITION";
                            case 152:
                                return "SM_PROCESS_RESPONSE";
                            case 153:
                                return "SM_CHRE_GEOFENCE_AVAILABILITY_CMD";
                            case 154:
                                return "SM_CHRE_RESTARTED";
                            default:
                                StringBuilder sb = new StringBuilder(50);
                                sb.append(i2);
                                sb.append(" (Message not named in getWhatToString)");
                                return sb.toString();
                        }
                }
        }
    }

    /* access modifiers changed from: protected */
    public final void a() {
        boolean z2 = aikq.a;
        aink aink = this.x;
        aink.a.getContentResolver().unregisterContentObserver(aink.b);
        this.l.getApplicationContext().unregisterReceiver(this.t);
    }

    public final void a(aijq aijq, Location location) {
        ArrayList arrayList = aijq.a;
        if (arrayList != null) {
            a((List) arrayList, 1, location);
        }
        ArrayList arrayList2 = aijq.b;
        if (arrayList2 != null) {
            a((List) arrayList2, 2, location);
        }
        ArrayList arrayList3 = aijq.c;
        if (arrayList3 != null) {
            a((List) arrayList3, 4, location);
        }
    }

    public final void a(ainr ainr) {
        synchronized (this.k) {
            if (Log.isLoggable("GeofencerStateMachine", 4)) {
                String valueOf = String.valueOf(ainr);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 31);
                sb.append("removeGeofences: removeRequest=");
                sb.append(valueOf);
                aikq.a("GeofencerStateMachine", sb.toString());
            }
            if (!this.u) {
                boolean z2 = aikq.a;
                this.w.add(ainr);
            } else {
                ainr.a((aioa) this);
            }
        }
    }

    public final void a(Intent intent) {
        String schemeSpecificPart;
        Uri data = intent.getData();
        if (data != null && (schemeSpecificPart = data.getSchemeSpecificPart()) != null) {
            boolean z2 = aikq.a;
            a(ainr.a(schemeSpecificPart, (ainq) null));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00a7, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(android.location.Location r9, java.util.Map r10, boolean r11) {
        /*
            r8 = this;
            java.lang.Object r0 = r8.k
            monitor-enter(r0)
            double r1 = r9.getLatitude()     // Catch:{ all -> 0x00a8 }
            r3 = 4636033603912859648(0x4056800000000000, double:90.0)
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 <= 0) goto L_0x0011
            goto L_0x0079
        L_0x0011:
            double r1 = r9.getLatitude()     // Catch:{ all -> 0x00a8 }
            r3 = -4587338432941916160(0xc056800000000000, double:-90.0)
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 < 0) goto L_0x0079
            double r1 = r9.getLongitude()     // Catch:{ all -> 0x00a8 }
            r3 = 4640537203540230144(0x4066800000000000, double:180.0)
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 > 0) goto L_0x0079
            double r1 = r9.getLongitude()     // Catch:{ all -> 0x00a8 }
            r3 = -4582834833314545664(0xc066800000000000, double:-180.0)
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 < 0) goto L_0x0079
            boolean r1 = defpackage.aybx.b()     // Catch:{ all -> 0x00a8 }
            r2 = 4
            if (r1 != 0) goto L_0x004f
            aikp r1 = defpackage.aiko.a     // Catch:{ all -> 0x00a8 }
            aikm r3 = new aikm     // Catch:{ all -> 0x00a8 }
            r4 = -321842505(0xffffffffecd112b7, float:-2.022031E27)
            java.lang.String r5 = "Received a new transition"
            r3.<init>(r4, r9, r5)     // Catch:{ all -> 0x00a8 }
            r1.a((defpackage.aikn) r3)     // Catch:{ all -> 0x00a8 }
            goto L_0x0057
        L_0x004f:
            aikp r1 = defpackage.aiko.a     // Catch:{ all -> 0x00a8 }
            r3 = -305592401(0xffffffffedc907af, float:-7.776972E27)
            r1.a((int) r3, (android.location.Location) r9, (int) r2)     // Catch:{ all -> 0x00a8 }
        L_0x0057:
            java.lang.String r1 = "GeofencerStateMachine"
            boolean r1 = android.util.Log.isLoggable(r1, r2)     // Catch:{ all -> 0x00a8 }
            if (r1 == 0) goto L_0x0066
            java.lang.String r1 = "GeofencerStateMachine"
            java.lang.String r2 = "sendNewTransitions called."
            defpackage.aikq.a(r1, r2)     // Catch:{ all -> 0x00a8 }
        L_0x0066:
            aimy r7 = new aimy     // Catch:{ all -> 0x00a8 }
            long r2 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x00a8 }
            r1 = r7
            r4 = r9
            r5 = r10
            r6 = r11
            r1.<init>(r2, r4, r5, r6)     // Catch:{ all -> 0x00a8 }
            r9 = 6
            r8.b(r9, r7)     // Catch:{ all -> 0x00a8 }
            monitor-exit(r0)     // Catch:{ all -> 0x00a8 }
            return
        L_0x0079:
            java.lang.String r10 = "GeofencerStateMachine"
            r11 = 5
            boolean r10 = android.util.Log.isLoggable(r10, r11)     // Catch:{ all -> 0x00a8 }
            if (r10 == 0) goto L_0x00a6
            java.lang.String r10 = "GeofencerStateMachine"
            java.lang.String r9 = java.lang.String.valueOf(r9)     // Catch:{ all -> 0x00a8 }
            java.lang.String r11 = java.lang.String.valueOf(r9)     // Catch:{ all -> 0x00a8 }
            int r11 = r11.length()     // Catch:{ all -> 0x00a8 }
            int r11 = r11 + 26
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00a8 }
            r1.<init>(r11)     // Catch:{ all -> 0x00a8 }
            java.lang.String r11 = "Invalid location dropped: "
            r1.append(r11)     // Catch:{ all -> 0x00a8 }
            r1.append(r9)     // Catch:{ all -> 0x00a8 }
            java.lang.String r9 = r1.toString()     // Catch:{ all -> 0x00a8 }
            defpackage.aikq.c(r10, r9)     // Catch:{ all -> 0x00a8 }
        L_0x00a6:
            monitor-exit(r0)     // Catch:{ all -> 0x00a8 }
            return
        L_0x00a8:
            r9 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00a8 }
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aing.a(android.location.Location, java.util.Map, boolean):void");
    }

    public final void a(LocationAvailability locationAvailability) {
        if (Log.isLoggable("GeofencerStateMachine", 4)) {
            String valueOf = String.valueOf(locationAvailability);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 42);
            sb.append("sendNewLocationAvailability: availability=");
            sb.append(valueOf);
            aikq.a("GeofencerStateMachine", sb.toString());
        }
        b(97, locationAvailability);
    }

    public final void a(boolean z2) {
        if (Log.isLoggable("GeofencerStateMachine", 4)) {
            StringBuilder sb = new StringBuilder(47);
            sb.append("sendWifiConnectivityChanged: connectivity=");
            sb.append(z2);
            aikq.a("GeofencerStateMachine", sb.toString());
        }
        b(101, Boolean.valueOf(z2));
    }
}
