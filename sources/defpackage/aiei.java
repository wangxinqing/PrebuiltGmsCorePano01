package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.location.Location;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.os.SystemClock;
import android.provider.Settings;
import android.util.Log;
import com.android.volley.toolbox.ImageRequest;
import com.google.android.gms.common.internal.ClientIdentity;
import com.google.android.gms.common.util.PackageResetHelper;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.internal.LocationRequestInternal;
import com.google.android.location.fused.FusedLocationServiceHelper$1;
import com.google.android.location.fused.FusedLocationServiceHelper$AlarmListener;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* renamed from: aiei  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aiei implements jki, rni, rnh, jhk {
    public static final String[] a = {"android:monitor_location", "android:monitor_location_high_power"};
    public static final String[] b = {"android:monitor_location"};
    static final LocationAvailability c = LocationAvailability.a(ImageRequest.DEFAULT_IMAGE_TIMEOUT_MS, 1, 1, 0);
    public final PackageResetHelper A;
    private final hya B;
    private final jhl C;
    private final aifs D;
    private final Looper E;
    final aifo d;
    public final aiex e;
    public final Context f;
    public final jkb g;
    public final ArrayList h = new ArrayList();
    public final ArrayList i = new ArrayList();
    public final aieg j;
    public final rns k;
    public final aicu l;
    public final Handler m;
    final FusedLocationServiceHelper$AlarmListener n;
    public final jgy o;
    public final aidg p;
    public final jkl q;
    public final ikh r;
    public final aifj s;
    public final jhr t;
    public final aidf u;
    public final ajqf v;
    public volatile LocationAvailability w = LocationAvailability.a(ImageRequest.DEFAULT_IMAGE_TIMEOUT_MS, 1, 1, 0);
    public volatile LocationAvailability x = this.w;
    public boolean y = false;
    public boolean z = false;

    public aiei(Context context, jhr jhr, aifs aifs, hya hya, rns rns, ajqf ajqf, jkn jkn, jhl jhl, aicu aicu, ikh ikh, jgy jgy, jkb jkb, Looper looper, aiii aiii) {
        aifl aifl;
        Context context2 = context;
        aifs aifs2 = aifs;
        rns rns2 = rns;
        Looper looper2 = looper;
        this.f = context2;
        this.t = jhr;
        this.k = rns2;
        this.v = ajqf;
        this.D = aifs2;
        this.l = aicu;
        this.o = jgy;
        this.g = jkb;
        this.E = looper2;
        this.m = new qvr(this.E);
        this.n = new FusedLocationServiceHelper$AlarmListener(this);
        this.u = aieo.b();
        this.p = new aidg(new qvr(looper2), aieo.a(context));
        this.q = new jkl();
        this.B = hya;
        Context context3 = this.f;
        Looper a2 = this.p.a();
        aicw aicw = new aicw();
        aien aien = new aien(context3, a2, this.u, aicw, aiii);
        if (!aydf.b()) {
            aifi aifi = aien.j;
            iva.a((Object) context3);
            iva.a((Object) context3);
            aicy aicy = new aicy(new ajpn(new hol(context3, "LE", (String) null)));
            aicy aicy2 = aicy;
            aicw aicw2 = aicw;
            aifc aifc = r7;
            aifc aifc2 = new aifc(aicy2, aicw2, context3, aifi, jhl.a(context3, (Handler) new qvr(aieo.a())), new ahyl(context3));
            aifl = new aifl(aien, context3, a2, aifc);
        } else {
            aifi aifi2 = aien.j;
            iby b2 = adrz.b(context3);
            iva.a((Object) context3);
            aicy aicy3 = new aicy(new ajpn(new hol(context3, "LE", (String) null)), b2);
            aieq aieq = new aieq(aicy3);
            iva.a((Object) context3);
            aicy aicy4 = aicy3;
            aicw aicw3 = aicw;
            aifl = new aifl(aien, context3, a2, new aifc(aicy4, aicw3, context3, aifi2, jhl.a(context3, (Handler) new qvr(aieo.a())), new ahyl(context3)), aieq);
        }
        aief aief = new aief(this);
        aicr aicr = new aicr(aifl, context3, a2, this.u);
        int i2 = Build.VERSION.SDK_INT;
        aifo aifo = new aifo(new aigl(new aify(new aigw(new aifm(context3, a2, aicr), context3, a2, this.u), context3, this.p.c, this.u), this.E, aieo.a(context3)), aifs2);
        aifo.b.a((aiew) aief);
        this.d = aifo;
        this.e = aifo.b;
        this.r = ikh;
        this.s = new aifj(context2, rns2, looper2);
        this.A = new PackageResetHelper(this.f, this, true);
        this.C = jhl;
        this.j = new aieg(this, context2, this.p.c, jkn);
        int i3 = Build.VERSION.SDK_INT;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.USER_BACKGROUND");
        intentFilter.addAction("android.intent.action.USER_FOREGROUND");
        context2.registerReceiver(new FusedLocationServiceHelper$1(this, "location"), intentFilter, (String) null, this.p.c);
        this.e.a();
    }

    public static PendingIntent a(Bundle bundle) {
        return (PendingIntent) bundle.getParcelable("pi");
    }

    public static final void b(LocationRequestInternal locationRequestInternal, String str) {
        String str2 = locationRequestInternal.d;
        if ((str2 == null || str2.isEmpty()) && "com.google.android.gms".equals(str)) {
            Log.e("GCoreFlp", "Location requests inside Google Play services must contain a tag to aid in debugging.  Use LocationRequestInternal.create to wrap your LocationRequest, and pass it to requestLocationUpdates.");
        }
    }

    private static boolean c(aidd aidd) {
        String str = aidd.b;
        LocationRequestInternal locationRequestInternal = aidd.c;
        if (!axxg.b()) {
            return true;
        }
        if ("com.google.android.gms".equals(str)) {
            String str2 = locationRequestInternal.h;
            if (locationRequestInternal.g) {
                return ajpl.a(axxg.a.a().flpBackgroundWhitelistGcoreModules(), str2);
            }
        }
        return ajpl.a(axxg.a.a().flpBackgroundThrottleWhiteListApps(), str);
    }

    static Bundle a(LocationRequest locationRequest, PendingIntent pendingIntent) {
        Bundle bundle = new Bundle(2);
        bundle.putParcelable("lr", locationRequest);
        bundle.putParcelable("pi", pendingIntent);
        return bundle;
    }

    private final boolean b(aidd aidd) {
        if (c(aidd)) {
            return false;
        }
        LocationRequest locationRequest = aidd.c.b;
        boolean c2 = locationRequest.c();
        if (locationRequest.b < ajpl.a(c2) || locationRequest.b() < ajpl.b(c2) || (this.k.a("network") && locationRequest.a == 100)) {
            return true;
        }
        return false;
    }

    private final String a(int i2, String str) {
        String[] a2 = jni.b(this.f).a(i2);
        if (a2 == null) {
            return str;
        }
        if (r0 == 1) {
            return a2[0];
        }
        if (str == null) {
            return str;
        }
        for (String equals : a2) {
            if (str.equals(equals)) {
                return str;
            }
        }
        String arrays = Arrays.toString(a2);
        StringBuilder sb = new StringBuilder(str.length() + 69 + String.valueOf(arrays).length());
        sb.append("Client passed in package name ");
        sb.append(str);
        sb.append(" which isn't in list of know packages: ");
        sb.append(arrays);
        Log.e("GCoreFlp", sb.toString());
        return null;
    }

    public final void b() {
        this.C.a();
        this.z = false;
    }

    public final boolean b(String str) {
        for (aidd aidd : this.j.e()) {
            if (str.equals(aidd.b)) {
                return true;
            }
        }
        return false;
    }

    public final Collection c() {
        ArrayList arrayList = new ArrayList(this.j.c().size());
        for (aidd aidd : this.j.c()) {
            LocationRequestInternal locationRequestInternal = aidd.c;
            if (!aidd.l && b(aidd)) {
                locationRequestInternal = LocationRequestInternal.b(locationRequestInternal);
                LocationRequest locationRequest = locationRequestInternal.b;
                if (this.k.a("network") && locationRequest.a == 100) {
                    locationRequest.c(102);
                }
                boolean c2 = locationRequest.c();
                long a2 = ajpl.a(c2);
                if (locationRequest.b < a2) {
                    locationRequest.c(a2);
                }
                long b2 = ajpl.b(c2);
                if (locationRequest.b() < b2) {
                    locationRequest.d(b2);
                }
            }
            arrayList.add(locationRequestInternal);
        }
        return arrayList;
    }

    public static final void a(aidd aidd, PrintWriter printWriter) {
        String str;
        printWriter.print("  ");
        printWriter.print(aidd.c);
        printWriter.print(" numDeliveries=");
        printWriter.print(aidd.i);
        printWriter.print(" lastDelivery(ERT)=");
        long j2 = aidd.h;
        StringBuilder sb = new StringBuilder(23);
        sb.append(j2);
        sb.append("ms ");
        printWriter.print(sb.toString());
        if (!aidd.l && axxg.b()) {
            str = !c(aidd) ? "background_throttled" : "background_exempt";
        } else {
            str = "foreground";
        }
        printWriter.println(str);
    }

    public static final boolean a(Location location) {
        if (location.getProvider() == null) {
            Log.e("GCoreFlp", "Location is incomplete because provider not set.");
            return false;
        } else if (!location.hasAccuracy()) {
            Log.e("GCoreFlp", "Location is incomplete because accuracy not set.");
            return false;
        } else if (location.getTime() != 0) {
            int i2 = Build.VERSION.SDK_INT;
            if (location.getElapsedRealtimeNanos() != 0) {
                return true;
            }
            Log.e("GCoreFlp", "Location is incomplete because elapsed realtime nanos not set.");
            return false;
        } else {
            Log.e("GCoreFlp", "Location is incomplete because time not set.");
            return false;
        }
    }

    public final void c(String str) {
        aifs aifs = this.D;
        int callingUid = Binder.getCallingUid();
        if (jkr.b()) {
            if (aifs.c.d("android:mock_location", callingUid, str) == 0) {
                return;
            }
        } else if (Settings.Secure.getString(aifs.a.getContentResolver(), "mock_location").contentEquals("1") && jni.b(aifs.a).a("android.permission.ACCESS_MOCK_LOCATION", str) == 0) {
            return;
        }
        if (!jkr.b()) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 166);
            sb.append("In order to use mock mode functionality app ");
            sb.append(str);
            sb.append(" must have the ACCESS_MOCK_LOCATION permission and the Settings.Secure.ALLOW_MOCK_LOCATION system setting must be enabled.");
            throw new SecurityException(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 117);
        sb2.append("In order to use mock mode functionality app ");
        sb2.append(str);
        sb2.append(" must be selected as the mock location application in developer settings.");
        throw new SecurityException(sb2.toString());
    }

    public final Location a(int i2, String str, String str2, boolean z2, boolean z3, boolean z4) {
        String str3;
        if (!this.g.a()) {
            return null;
        }
        Location a2 = this.s.a(this.e.a(!z2), z3, z2);
        String str4 = "android:coarse_location";
        if (jkr.h()) {
            if (!z2) {
                str3 = str4;
            } else {
                str3 = "android:fine_location";
            }
            if (this.t.e(str3, i2, str) == 4 && a2 != null && SystemClock.elapsedRealtime() - TimeUnit.NANOSECONDS.toMillis(a2.getElapsedRealtimeNanos()) > ayff.b()) {
                a2 = null;
            }
        }
        if (a2 == null) {
            return a2;
        }
        String a3 = a(i2, str);
        if (jkr.h() && !z4) {
            if (z2) {
                str4 = "android:fine_location";
            }
            if (this.t.d(str4, i2, a3) != 0) {
                return null;
            }
        } else if (!a(i2, a3, str2, z2)) {
            return null;
        }
        return a2;
    }

    public final LocationAvailability a(int i2, String str, boolean z2) {
        if (this.t.d("android:coarse_location", i2, str) != 0 || a(i2, str, (String) null, z2, false, false) == null) {
            return c;
        }
        return this.B.b(str) ? this.w : this.x;
    }

    public final void a() {
        this.C.a((jhk) this);
        this.z = true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:66:0x003b A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x002a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(int r17, boolean r18) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            aieg r2 = r0.j
            java.util.Collection r2 = r2.c()
            java.util.Iterator r2 = r2.iterator()
            r3 = 0
            r5 = 0
        L_0x0010:
            boolean r6 = r2.hasNext()
            if (r6 == 0) goto L_0x0109
            java.lang.Object r6 = r2.next()
            aidd r6 = (defpackage.aidd) r6
            com.google.android.gms.location.internal.LocationRequestInternal r7 = r6.c
            java.util.List r7 = r7.c
            java.util.Iterator r7 = r7.iterator()
        L_0x0024:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x003b
            java.lang.Object r8 = r7.next()
            com.google.android.gms.common.internal.ClientIdentity r8 = (com.google.android.gms.common.internal.ClientIdentity) r8
            r9 = -1000(0xfffffffffffffc18, float:NaN)
            if (r1 == r9) goto L_0x0038
            int r9 = r8.a
            if (r9 != r1) goto L_0x0024
        L_0x0038:
            java.lang.String r7 = r8.b
            goto L_0x003c
        L_0x003b:
            r7 = 0
        L_0x003c:
            if (r7 == 0) goto L_0x0010
            if (r18 == 0) goto L_0x0048
            com.google.android.gms.location.internal.LocationRequestInternal r8 = r6.c
            boolean r7 = defpackage.ajpl.a((java.lang.String) r7, (com.google.android.gms.location.internal.LocationRequestInternal) r8)
            if (r7 == 0) goto L_0x0050
        L_0x0048:
            boolean r7 = r0.a((defpackage.aidd) r6)
            if (r7 != 0) goto L_0x0050
            r7 = 0
            goto L_0x0051
        L_0x0050:
            r7 = 1
        L_0x0051:
            boolean r8 = r6.l
            if (r8 == r7) goto L_0x0010
            r6.l = r7
            boolean r8 = r0.b((defpackage.aidd) r6)
            if (r8 == 0) goto L_0x0010
            java.lang.String[] r5 = r6.m()
            if (r7 != 0) goto L_0x006f
            rns r8 = r0.k
            java.lang.String r9 = "network"
            boolean r8 = r8.a((java.lang.String) r9)
            if (r8 == 0) goto L_0x006f
            r8 = 0
            goto L_0x0070
        L_0x006f:
            r8 = 1
        L_0x0070:
            r6.m = r8
            java.lang.String[] r8 = r6.m()
            if (r5 == r8) goto L_0x00fd
            aieg r9 = r0.j
            int r10 = r5.length
            r11 = 0
        L_0x007c:
            if (r11 >= r10) goto L_0x00ba
            r12 = r5[r11]
            java.lang.String[] r13 = r9.f
            boolean r13 = defpackage.jip.a((java.lang.String[]) r13, (java.lang.String) r12)
            if (r13 != 0) goto L_0x0089
        L_0x0088:
            goto L_0x00b7
        L_0x0089:
            boolean r13 = defpackage.jip.a((java.lang.String[]) r8, (java.lang.String) r12)
            if (r13 != 0) goto L_0x0088
            r9.t(r12)
            boolean r13 = defpackage.awyg.d()
            if (r13 == 0) goto L_0x00aa
            jhr r13 = r9.e
            int r14 = r6.j()
            java.lang.String r15 = r6.k()
            java.lang.String r4 = r6.l()
            r13.a(r12, r14, r15, r4)
            goto L_0x00b7
        L_0x00aa:
            jhr r4 = r9.e
            int r13 = r6.j()
            java.lang.String r14 = r6.k()
            r4.b(r12, r13, r14)
        L_0x00b7:
            int r11 = r11 + 1
            goto L_0x007c
        L_0x00ba:
            int r4 = r8.length
            r10 = 0
        L_0x00bc:
            if (r10 >= r4) goto L_0x00fa
            r11 = r8[r10]
            java.lang.String[] r12 = r9.f
            boolean r12 = defpackage.jip.a((java.lang.String[]) r12, (java.lang.String) r11)
            if (r12 != 0) goto L_0x00c9
        L_0x00c8:
            goto L_0x00f7
        L_0x00c9:
            boolean r12 = defpackage.jip.a((java.lang.String[]) r5, (java.lang.String) r11)
            if (r12 != 0) goto L_0x00c8
            r9.t(r11)
            boolean r12 = defpackage.awyg.d()
            if (r12 == 0) goto L_0x00ea
            jhr r12 = r9.e
            int r13 = r6.j()
            java.lang.String r14 = r6.k()
            java.lang.String r15 = r6.l()
            r12.c(r11, r13, r14, r15)
            goto L_0x00f7
        L_0x00ea:
            jhr r12 = r9.e
            int r13 = r6.j()
            java.lang.String r14 = r6.k()
            r12.a((java.lang.String) r11, (int) r13, (java.lang.String) r14)
        L_0x00f7:
            int r10 = r10 + 1
            goto L_0x00bc
        L_0x00fa:
            r9.f()
        L_0x00fd:
            aidf r4 = r0.u
            com.google.android.gms.location.internal.LocationRequestInternal r5 = r6.c
            java.util.List r5 = r5.c
            r4.a(r7, r5)
            r5 = 1
            goto L_0x0010
        L_0x0109:
            if (r5 == 0) goto L_0x0114
            aiex r1 = r0.e
            java.util.Collection r2 = r16.c()
            r1.a((java.util.Collection) r2, (boolean) r3)
        L_0x0114:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aiei.a(int, boolean):void");
    }

    public final void a(PendingIntent pendingIntent) {
        if (pendingIntent == null) {
            aihr.a("Received null PendingIntent to remove uid:%s packages:%s", Integer.valueOf(Binder.getCallingUid()), Arrays.toString(jni.b(this.f).a(Binder.getCallingUid())));
            return;
        }
        this.p.a(22, new aidu(this, pendingIntent));
    }

    public final void a(LocationRequestInternal locationRequestInternal, PendingIntent pendingIntent, boolean z2) {
        if (pendingIntent == null) {
            aihr.a("Received null PendingIntent to add uid:%s packages:%s request: %s", Integer.valueOf(Binder.getCallingUid()), Arrays.toString(jni.b(this.f).a(Binder.getCallingUid())), locationRequestInternal);
            return;
        }
        String targetPackage = pendingIntent.getTargetPackage();
        try {
            int i2 = jni.b(this.f).a(targetPackage, 0).uid;
            b(locationRequestInternal, targetPackage);
            LocationRequestInternal b2 = LocationRequestInternal.b(locationRequestInternal);
            List list = b2.c;
            if (list == null || list.isEmpty()) {
                b2.a(Collections.singletonList(new ClientIdentity(i2, targetPackage)));
            }
            this.p.a(21, new aids(this, b2, pendingIntent, z2, i2, targetPackage, this.B.b(pendingIntent.getTargetPackage())));
        } catch (PackageManager.NameNotFoundException e2) {
            String valueOf = String.valueOf(e2);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 20);
            sb.append("Package not found: \n");
            sb.append(valueOf);
            aihr.a(sb.toString(), new Object[0]);
        }
    }

    public final void a(PrintWriter printWriter, String str) {
        aidy aidy;
        printWriter.println("Location Request History By Package:");
        if (str != null) {
            aidy = new aidy(str);
        } else {
            aidy = null;
        }
        printWriter.println(this.q.a(aidy));
    }

    public final void a(Object obj) {
        if (obj == null) {
            aihr.a("Received null listener to remove", new Object[0]);
        } else {
            this.j.c(obj);
        }
    }

    public final void a(Object obj, aidd aidd) {
        LocationRequest locationRequest = aidd.c.b;
        if (locationRequest.a != 100 && locationRequest.b < aydy.b()) {
            locationRequest.c(aydy.b());
        }
        if (locationRequest.a != 105) {
            double locationRequestFastestIntervalFactor = aydc.a.a().locationRequestFastestIntervalFactor();
            if (locationRequestFastestIntervalFactor > 0.0d && (!aydc.a.a().disableFastestIntervalFactorWhenFastestIntervalExplicitlySet() || !locationRequest.d)) {
                double d2 = (double) locationRequest.b;
                double max = Math.max(2.0d, locationRequestFastestIntervalFactor);
                Double.isNaN(d2);
                locationRequest.b((long) Math.max((double) locationRequest.c, d2 / max));
            }
        } else {
            locationRequest.b(Math.max(locationRequest.c, aydc.a.a().noPowerMinFastestIntervalMillis()));
        }
        if (!aidd.d) {
            if (locationRequest.b < 600000) {
                locationRequest.c(600000);
            }
            if (locationRequest.c < 600000) {
                locationRequest.b(600000);
            }
        }
        if (axxg.b()) {
            boolean a2 = a(aidd);
            aidd.l = a2;
            if (!a2 && b(aidd)) {
                aidd.m = !this.k.a("network");
                this.u.a(false, aidd.c.c);
            }
        }
        aidd aidd2 = (aidd) this.j.a(obj, (jio) aidd);
        if (aidd2 != null) {
            aidd.k = aidd2.k;
        }
    }

    public final void a(String str) {
        for (aidd aidd : this.j.e()) {
            if (str.equals(aidd.b)) {
                aidd.c();
            }
        }
    }

    public final void a(String str, boolean z2) {
        String[] strArr;
        if ("gps".equals(str)) {
            this.u.a(z2);
            aieg aieg = this.j;
            if (!z2) {
                strArr = b;
            } else {
                strArr = a;
            }
            aieg.a(strArr);
        }
        if ("network".equals(str)) {
            this.u.b(z2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00f3, code lost:
        if (defpackage.rev.i(r9) == 3) goto L_0x00f5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0106, code lost:
        if (r9.getAccuracy() > ((float) defpackage.ayat.a.b().maxNetworkLocationAccuracy())) goto L_0x00be;
     */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x013a A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:107:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0167  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x016e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.util.List r18, defpackage.aidd r19) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            boolean r3 = r18.isEmpty()
            if (r3 != 0) goto L_0x01b7
            boolean r3 = defpackage.jkr.h()
            if (r3 == 0) goto L_0x0028
            com.google.android.gms.location.internal.LocationRequestInternal r3 = r2.c
            boolean r4 = r3.e
            if (r4 != 0) goto L_0x0028
            int r4 = r2.a
            java.lang.String r5 = r2.b
            java.lang.String r3 = r3.k
            boolean r6 = r2.d
            boolean r3 = r0.a(r4, r5, r3, r6)
            if (r3 == 0) goto L_0x0027
            goto L_0x0028
        L_0x0027:
            return
        L_0x0028:
            java.util.ArrayList r3 = new java.util.ArrayList
            int r4 = r18.size()
            r3.<init>(r4)
            r3.clear()
            r4 = 3
            r5 = 2
            r7 = 1
            if (r1 == 0) goto L_0x013c
            boolean r8 = r18.isEmpty()
            if (r8 != 0) goto L_0x013c
            com.google.android.gms.location.internal.LocationRequestInternal r8 = r2.c
            com.google.android.gms.location.LocationRequest r8 = r8.b
            int r9 = r18.size()
            if (r9 <= r7) goto L_0x0067
            long r9 = r8.b()
            long r11 = r8.b
            int r8 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r8 > 0) goto L_0x0064
            int r8 = r18.size()
            int r8 = r8 + -1
            java.lang.Object r8 = r1.get(r8)
            android.location.Location r8 = (android.location.Location) r8
            java.util.List r8 = java.util.Collections.singletonList(r8)
            goto L_0x0069
        L_0x0064:
            int r8 = android.os.Build.VERSION.SDK_INT
            goto L_0x0068
        L_0x0067:
        L_0x0068:
            r8 = r1
        L_0x0069:
            java.util.Iterator r8 = r8.iterator()
        L_0x006d:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x013a
            java.lang.Object r9 = r8.next()
            android.location.Location r9 = (android.location.Location) r9
            java.util.concurrent.TimeUnit r10 = java.util.concurrent.TimeUnit.NANOSECONDS
            long r11 = defpackage.aicu.a(r9)
            long r10 = r10.toMillis(r11)
            com.google.android.gms.location.internal.LocationRequestInternal r12 = r2.c
            com.google.android.gms.location.LocationRequest r12 = r12.b
            long r13 = r12.e
            int r15 = (r10 > r13 ? 1 : (r10 == r13 ? 0 : -1))
            if (r15 >= 0) goto L_0x0138
            int r10 = r12.f
            int r11 = r2.i
            if (r11 >= r10) goto L_0x0136
            java.util.concurrent.TimeUnit r10 = java.util.concurrent.TimeUnit.NANOSECONDS
            long r11 = defpackage.aicu.a(r9)
            long r10 = r10.toMillis(r11)
            long r12 = r2.k
            int r14 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r14 < 0) goto L_0x00a4
            goto L_0x00ab
        L_0x00a4:
            boolean r12 = defpackage.rev.j(r9)
            if (r12 != 0) goto L_0x00ab
            goto L_0x006d
        L_0x00ab:
            com.google.android.gms.location.internal.LocationRequestInternal r12 = r2.c
            com.google.android.gms.location.LocationRequest r12 = r12.b
            long r13 = r2.h
            long r13 = r10 - r13
            int r15 = r2.i
            if (r15 <= 0) goto L_0x00c0
            long r6 = r12.c
            int r16 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r16 < 0) goto L_0x00be
            goto L_0x00c0
        L_0x00be:
            r7 = 1
            goto L_0x006d
        L_0x00c0:
            ayat r6 = defpackage.ayat.a
            ayau r6 = r6.a()
            boolean r6 = r6.enabled()
            if (r6 != 0) goto L_0x00cd
            goto L_0x0109
        L_0x00cd:
            com.google.android.gms.location.internal.LocationRequestInternal r6 = r2.c
            boolean r6 = r6.j
            if (r6 == 0) goto L_0x0109
            int r6 = r2.i
            if (r6 != 0) goto L_0x0109
            aiev r6 = r2.g
            int r7 = r12.a
            r13 = 100
            if (r7 != r13) goto L_0x0109
            long r13 = android.os.SystemClock.elapsedRealtime()
            long r6 = r6.a
            int r16 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r16 >= 0) goto L_0x0109
            int r6 = defpackage.rev.i(r9)
            if (r6 == r5) goto L_0x00f5
            int r6 = defpackage.rev.i(r9)
            if (r6 != r4) goto L_0x0109
        L_0x00f5:
            float r6 = r9.getAccuracy()
            ayat r7 = defpackage.ayat.a
            ayau r7 = r7.a()
            long r13 = r7.maxNetworkLocationAccuracy()
            float r7 = (float) r13
            int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r6 <= 0) goto L_0x0109
            goto L_0x00be
        L_0x0109:
            float r6 = r12.g
            android.location.Location r7 = r2.j
            if (r7 == 0) goto L_0x011b
            float r7 = r7.distanceTo(r9)
            int r7 = (r7 > r6 ? 1 : (r7 == r6 ? 0 : -1))
            if (r7 < 0) goto L_0x0118
            goto L_0x011b
        L_0x0118:
            r7 = 1
            goto L_0x006d
        L_0x011b:
            r7 = 0
            int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r6 > 0) goto L_0x0121
            goto L_0x0128
        L_0x0121:
            android.location.Location r6 = new android.location.Location
            r6.<init>(r9)
            r2.j = r6
        L_0x0128:
            r2.h = r10
            int r6 = r2.i
            r7 = 1
            int r6 = r6 + r7
            r2.i = r6
            r3.add(r9)
            r7 = 1
            goto L_0x006d
        L_0x0136:
            r6 = 1
            goto L_0x013d
        L_0x0138:
            r6 = 1
            goto L_0x013d
        L_0x013a:
            r6 = 0
            goto L_0x013d
        L_0x013c:
            r6 = 0
        L_0x013d:
            com.google.android.gms.location.internal.LocationRequestInternal r7 = r2.c
            com.google.android.gms.location.LocationRequest r7 = r7.b
            int r7 = r7.f
            if (r6 != 0) goto L_0x014c
            int r8 = r2.i
            if (r8 >= r7) goto L_0x014a
            goto L_0x014c
        L_0x014a:
            r7 = 1
            goto L_0x014d
        L_0x014c:
            r7 = r6
        L_0x014d:
            boolean r6 = r3.isEmpty()
            if (r6 != 0) goto L_0x0164
            int r3 = r2.a((java.util.List) r3)
            boolean r6 = r2.a((int) r3)
            if (r6 != 0) goto L_0x015e
            goto L_0x015f
        L_0x015e:
            r7 = 1
        L_0x015f:
            r6 = 1
            if (r3 != r6) goto L_0x0164
            r6 = 1
            goto L_0x0165
        L_0x0164:
            r6 = 0
        L_0x0165:
            if (r7 == 0) goto L_0x016c
            aicz r3 = r2.o
            r3.a()
        L_0x016c:
            if (r6 == 0) goto L_0x01b6
            boolean r3 = defpackage.jkr.h()
            if (r3 != 0) goto L_0x0185
            com.google.android.gms.location.internal.LocationRequestInternal r3 = r2.c
            boolean r6 = r3.e
            if (r6 != 0) goto L_0x0185
            int r6 = r2.a
            java.lang.String r7 = r2.b
            java.lang.String r3 = r3.k
            boolean r8 = r2.d
            r0.a(r6, r7, r3, r8)
        L_0x0185:
            aidf r3 = r0.u
            com.google.android.gms.location.internal.LocationRequestInternal r2 = r2.c
            java.util.List r2 = r2.c
            int r6 = r18.size()
            int r6 = r6 + -1
            java.lang.Object r1 = r1.get(r6)
            android.location.Location r1 = (android.location.Location) r1
            int r1 = defpackage.rev.i(r1)
            r6 = 1
            if (r1 == r6) goto L_0x01ab
            if (r1 == r5) goto L_0x01a8
            if (r1 == r4) goto L_0x01a5
            r1 = 15
            goto L_0x01ad
        L_0x01a5:
            r1 = 13
            goto L_0x01ad
        L_0x01a8:
            r1 = 14
            goto L_0x01ad
        L_0x01ab:
            r1 = 12
        L_0x01ad:
            aide r4 = r3.k
            int r2 = r4.a((java.lang.Object) r2)
            r3.a(r1, r2)
        L_0x01b6:
            return
        L_0x01b7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aiei.a(java.util.List, aidd):void");
    }

    public final void a(Set set) {
        String[] strArr;
        if (set.contains("gps")) {
            boolean a2 = this.k.a("gps");
            this.u.a(a2);
            aieg aieg = this.j;
            if (!a2) {
                strArr = b;
            } else {
                strArr = a;
            }
            aieg.a(strArr);
        }
        if (set.contains("network")) {
            this.u.b(this.k.a("network"));
        }
    }

    public final void a(rec rec) {
        this.p.a(22, new aidt(this, rec));
    }

    public final void a(ref ref) {
        if (ref == null) {
            aihr.a("Received null listener to remove uid:%s packages:%s", Integer.valueOf(Binder.getCallingUid()), Arrays.toString(jni.b(this.f).a(Binder.getCallingUid())));
            return;
        }
        this.p.a(22, new aied(this, ref));
    }

    public final void a(rge rge, String str) {
        if (ayap.a.a().sendCallbackOnRemoval() && rge != null && ((long) new ajqr(this.f).a(str)) >= ayap.a.a().minSdkForRemovalCallback()) {
            try {
                rge.a();
            } catch (RemoteException e2) {
            }
        }
    }

    public final void a(boolean z2) {
        this.p.a(23, new aiee(this, z2));
    }

    /* access modifiers changed from: package-private */
    public final boolean a(int i2, String str, String str2, boolean z2) {
        return this.t.b(!z2 ? "android:coarse_location" : "android:fine_location", i2, str, str2) == 0;
    }

    public final boolean a(aidd aidd) {
        LocationRequestInternal locationRequestInternal = aidd.c;
        for (ClientIdentity clientIdentity : locationRequestInternal.c) {
            LocationRequest locationRequest = locationRequestInternal.b;
            if (!jkr.e() && locationRequest.a < 102) {
                return true;
            }
            if (!ajpl.a(clientIdentity.b, locationRequestInternal) && this.C.a(clientIdentity.a)) {
                return true;
            }
        }
        return false;
    }

    public final boolean a(LocationRequestInternal locationRequestInternal, String str) {
        int callingUid = Binder.getCallingUid();
        String a2 = a(callingUid, str);
        List list = locationRequestInternal.c;
        if (list == null || list.isEmpty()) {
            locationRequestInternal.a(Collections.singletonList(new ClientIdentity(callingUid, a2)));
        }
        if (a2 != null) {
            return this.B.b(a2);
        }
        return false;
    }
}
