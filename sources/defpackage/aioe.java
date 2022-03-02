package defpackage;

import android.app.PendingIntent;
import android.content.SharedPreferences;
import android.location.Location;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.os.WorkSource;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ClientIdentity;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.location.ActivityRecognitionRequest;
import com.google.android.gms.location.ActivityRecognitionResult;
import com.google.android.gms.location.ActivityTransition;
import com.google.android.gms.location.ActivityTransitionRequest;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.gms.location.LocationSettingsResult;
import com.google.android.gms.location.RemoveGeofencingRequest;
import com.google.android.gms.location.SleepSegmentRequest;
import com.google.android.gms.location.internal.FusedLocationProviderResult;
import com.google.android.gms.location.internal.LocationRequestInternal;
import com.google.android.gms.location.internal.LocationRequestUpdateData;
import java.util.Arrays;
import java.util.List;

/* renamed from: aioe  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aioe extends rgj {
    private static final List a = Arrays.asList(new String[]{"com.google.android.googlequicksearchbox", "com.google.android.apps.maps", "com.google.android.apps.gmm", "com.google.android.apps.gmm.fishfood", "com.google.android.apps.gmm.dev", "com.google.android.apps.gmm.dogfood", "com.android.chrome", "com.chrome.canary", "com.chrome.dev", "com.chrome.beta", "com.google.android.gms.common.uxtester"});
    private final aiod b;
    private final String c;

    public aioe(aiod aiod, String str) {
        this.b = aiod;
        this.c = str;
    }

    public final ActivityRecognitionResult a(String str) {
        ActivityRecognitionResult activityRecognitionResult;
        aiod aiod = this.b;
        ahjk.a(aiod.a, str);
        aiod.d();
        ahjj ahjj = aiod.e;
        if (ahjj.a.a()) {
            activityRecognitionResult = ahjj.b;
        } else {
            activityRecognitionResult = null;
        }
        if (activityRecognitionResult == null || !axwu.f() || ahjk.b(aiod.a, Binder.getCallingUid(), str)) {
            return activityRecognitionResult;
        }
        return null;
    }

    public final Location b() {
        return b((String) null);
    }

    public final int c() {
        return this.b.c();
    }

    @Deprecated
    public final Location d() {
        return b();
    }

    public final void e(PendingIntent pendingIntent, ifu ifu) {
        aiod aiod = this.b;
        String str = this.c;
        if (!ayfc.b()) {
            ahjk.a(aiod.a, str);
        }
        if (aiod.d()) {
            aiod.a(pendingIntent, str);
            atir atir = new atir(aiod.a.getPackageName());
            if (atir.a.hasExtra("com.google.android.location.internal.EXTRA_SLEEP_SEGMENT_TAG")) {
                atir.b();
            }
            atir.a.putExtra("com.google.android.location.internal.EXTRA_SLEEP_SEGMENT_PENDING_INTENT", pendingIntent);
            atir.a.putExtra("com.google.android.location.internal.EXTRA_SLEEP_SEGMENT_REMOVE", true);
            atir.a(aiod.a);
            if (ifu != null) {
                try {
                    ifu.a(Status.a);
                } catch (RemoteException e) {
                }
            }
        } else {
            throw new SecurityException("This API is not supported yet.");
        }
    }

    public final Location b(String str) {
        aiod aiod = this.b;
        String str2 = this.c;
        aiod.a(1);
        return aiod.b.a(Binder.getCallingUid(), str2, str, aiod.b(), aiod.d(), true);
    }

    public final LocationAvailability c(String str) {
        boolean z;
        aiod aiod = this.b;
        if (ajql.a(aiod.a) == 2) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            aiod.a(1);
        }
        return aiod.b.a(Binder.getCallingUid(), str, z);
    }

    public final void d(PendingIntent pendingIntent, ifu ifu) {
        ifu.a(this.b.a(pendingIntent, this.c, SleepSegmentRequest.a()));
    }

    public final void a(long j, boolean z, PendingIntent pendingIntent) {
        aiod aiod = this.b;
        ahjk.a(aiod.a, pendingIntent.getTargetPackage());
        boolean d = aiod.d();
        WorkSource a2 = jlr.a(Binder.getCallingUid(), pendingIntent.getTargetPackage());
        rck rck = new rck();
        rck.a(j);
        rck.c = z;
        rck.e = "GLMSImplProxy";
        rck.d = a2;
        atir atir = new atir(aiod.a.getPackageName());
        atir.a(rck.a(), pendingIntent);
        atir.a(d);
        atir.a(a2);
        atir.a(aiod.a);
    }

    @Deprecated
    public final void b(PendingIntent pendingIntent) {
        this.b.a(pendingIntent);
    }

    public final void c(PendingIntent pendingIntent) {
        aiod aiod = this.b;
        if (!aiod.b()) {
            throw new SecurityException("WifiScans usage requires the android.permission.ACCESS_FINE_LOCATION permission");
        } else if (aiod.e()) {
            atir atir = new atir(aiod.a.getPackageName());
            atir.a(aiod.d());
            atir.c(pendingIntent);
            atir.a(aiod.a);
        } else {
            throw new AssertionError("API should be hidden outside GmsCore");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0069, code lost:
        if (((long) r4) >= defpackage.axwi.a.a().floorChangeBaroFifoRequired()) goto L_0x006d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0073 A[SYNTHETIC, Splitter:B:18:0x0073] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00ad A[Catch:{ RemoteException -> 0x00b3 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(android.app.PendingIntent r13, defpackage.ifu r14) {
        /*
            r12 = this;
            aiod r0 = r12.b
            java.lang.String r1 = r12.c
            android.content.Context r2 = r0.a
            defpackage.ahjk.a((android.content.Context) r2, (java.lang.String) r1)
            boolean r2 = r0.d()
            if (r2 == 0) goto L_0x00ba
            r0.a((android.app.PendingIntent) r13, (java.lang.String) r1)
            int r1 = android.os.Binder.getCallingUid()
            java.lang.String r2 = r13.getTargetPackage()
            android.os.WorkSource r1 = defpackage.jlr.a((int) r1, (java.lang.String) r2)
            long r2 = android.os.Binder.clearCallingIdentity()
            int r4 = defpackage.jlo.h()     // Catch:{ all -> 0x00b5 }
            android.content.Context r5 = r0.a     // Catch:{ all -> 0x00b5 }
            boolean r6 = defpackage.axwi.c()     // Catch:{ all -> 0x00b5 }
            r7 = 0
            r8 = 1
            if (r6 != 0) goto L_0x006d
            boolean r6 = defpackage.axwi.b()     // Catch:{ all -> 0x00b5 }
            if (r6 == 0) goto L_0x006c
            r6 = 10
            if (r4 == r6) goto L_0x006c
            int r4 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x00b5 }
            java.lang.String r4 = "sensor"
            java.lang.Object r4 = r5.getSystemService(r4)     // Catch:{ all -> 0x00b5 }
            android.hardware.SensorManager r4 = (android.hardware.SensorManager) r4     // Catch:{ all -> 0x00b5 }
            int r5 = defpackage.ahjh.a(r4, r8)     // Catch:{ all -> 0x00b5 }
            r6 = 6
            int r4 = defpackage.ahjh.a(r4, r6)     // Catch:{ all -> 0x00b5 }
            long r5 = (long) r5     // Catch:{ all -> 0x00b5 }
            axwi r9 = defpackage.axwi.a     // Catch:{ all -> 0x00b5 }
            axwj r9 = r9.a()     // Catch:{ all -> 0x00b5 }
            long r9 = r9.floorChangeAccelFifoRequired()     // Catch:{ all -> 0x00b5 }
            int r11 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r11 < 0) goto L_0x006c
            long r4 = (long) r4     // Catch:{ all -> 0x00b5 }
            axwi r6 = defpackage.axwi.a     // Catch:{ all -> 0x00b5 }
            axwj r6 = r6.a()     // Catch:{ all -> 0x00b5 }
            long r9 = r6.floorChangeBaroFifoRequired()     // Catch:{ all -> 0x00b5 }
            int r6 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r6 >= 0) goto L_0x006d
            goto L_0x006e
        L_0x006c:
            goto L_0x006e
        L_0x006d:
            r7 = 1
        L_0x006e:
            android.os.Binder.restoreCallingIdentity(r2)
            if (r7 == 0) goto L_0x00ad
            atir r2 = new atir     // Catch:{ RemoteException -> 0x00b3 }
            android.content.Context r3 = r0.a     // Catch:{ RemoteException -> 0x00b3 }
            java.lang.String r3 = r3.getPackageName()     // Catch:{ RemoteException -> 0x00b3 }
            r2.<init>(r3)     // Catch:{ RemoteException -> 0x00b3 }
            java.lang.String r3 = "GLMSImplProxy"
            android.content.Intent r4 = r2.a     // Catch:{ RemoteException -> 0x00b3 }
            java.lang.String r5 = "com.google.android.location.internal.EXTRA_FLOOR_CHANGE_REMOVE"
            boolean r4 = r4.hasExtra(r5)     // Catch:{ RemoteException -> 0x00b3 }
            if (r4 != 0) goto L_0x008b
            goto L_0x008e
        L_0x008b:
            defpackage.atir.a()     // Catch:{ RemoteException -> 0x00b3 }
        L_0x008e:
            android.content.Intent r4 = r2.a     // Catch:{ RemoteException -> 0x00b3 }
            java.lang.String r5 = "com.google.android.location.internal.EXTRA_FLOOR_CHANGE_PENDING_INTENT"
            r4.putExtra(r5, r13)     // Catch:{ RemoteException -> 0x00b3 }
            android.content.Intent r13 = r2.a     // Catch:{ RemoteException -> 0x00b3 }
            java.lang.String r4 = "com.google.android.location.internal.EXTRA_FLOOR_CHANGE_TAG"
            r13.putExtra(r4, r3)     // Catch:{ RemoteException -> 0x00b3 }
            r2.a((boolean) r8)     // Catch:{ RemoteException -> 0x00b3 }
            r2.a((android.os.WorkSource) r1)     // Catch:{ RemoteException -> 0x00b3 }
            android.content.Context r13 = r0.a     // Catch:{ RemoteException -> 0x00b3 }
            r2.a((android.content.Context) r13)     // Catch:{ RemoteException -> 0x00b3 }
            com.google.android.gms.common.api.Status r13 = com.google.android.gms.common.api.Status.a     // Catch:{ RemoteException -> 0x00b3 }
            r14.a(r13)     // Catch:{ RemoteException -> 0x00b3 }
            return
        L_0x00ad:
            com.google.android.gms.common.api.Status r13 = com.google.android.gms.common.api.Status.e     // Catch:{ RemoteException -> 0x00b3 }
            r14.a(r13)     // Catch:{ RemoteException -> 0x00b3 }
            return
        L_0x00b3:
            r13 = move-exception
            return
        L_0x00b5:
            r13 = move-exception
            android.os.Binder.restoreCallingIdentity(r2)
            throw r13
        L_0x00ba:
            java.lang.SecurityException r13 = new java.lang.SecurityException
            java.lang.String r14 = "This API is not supported yet."
            r13.<init>(r14)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aioe.b(android.app.PendingIntent, ifu):void");
    }

    public final void c(PendingIntent pendingIntent, ifu ifu) {
        aiod aiod = this.b;
        String str = this.c;
        ahjk.a(aiod.a, str);
        if (aiod.d()) {
            aiod.a(pendingIntent, str);
            atir atir = new atir(aiod.a.getPackageName());
            if (atir.a.hasExtra("com.google.android.location.internal.EXTRA_FLOOR_CHANGE_TAG")) {
                atir.a();
            }
            atir.a.putExtra("com.google.android.location.internal.EXTRA_FLOOR_CHANGE_PENDING_INTENT", pendingIntent);
            atir.a.putExtra("com.google.android.location.internal.EXTRA_FLOOR_CHANGE_REMOVE", true);
            atir.a(aiod.a);
            if (ifu != null) {
                try {
                    ifu.a(Status.a);
                } catch (RemoteException e) {
                }
            }
        } else {
            throw new SecurityException("This API is not supported yet.");
        }
    }

    public final void a(PendingIntent pendingIntent) {
        aiod aiod = this.b;
        ahjk.a(aiod.a, pendingIntent.getTargetPackage());
        atir atir = new atir(aiod.a.getPackageName());
        atir.b(pendingIntent);
        atir.a(aiod.a);
    }

    public final void a(PendingIntent pendingIntent, SleepSegmentRequest sleepSegmentRequest, ifu ifu) {
        ifu.a(this.b.a(pendingIntent, this.c, sleepSegmentRequest));
    }

    public final void a(PendingIntent pendingIntent, ifu ifu) {
        aiod aiod = this.b;
        ahjk.a(aiod.a, pendingIntent.getTargetPackage());
        try {
            atir atir = new atir(aiod.a.getPackageName());
            if (atir.a.hasExtra("com.google.android.location.internal.EXTRA_ACTIVITY_TRANSITION_PENDING_INTENT")) {
                atir.c();
            }
            atir.a.putExtra("com.google.android.location.internal.EXTRA_ACTIVITY_TRANSITION_PENDING_INTENT", pendingIntent);
            atir.a.putExtra("com.google.android.location.internal.EXTRA_ACTIVITY_TRANSITION_REMOVE", true);
            atir.a(aiod.a);
            ifu.a(Status.a);
        } catch (RemoteException e) {
        }
    }

    @Deprecated
    public final void a(PendingIntent pendingIntent, rgh rgh, String str) {
        a(RemoveGeofencingRequest.a(pendingIntent), rgh);
    }

    public final void a(Location location) {
        aiod aiod = this.b;
        String str = this.c;
        aiei aiei = aiod.b;
        aiei.c(str);
        if (aiei.a(location)) {
            aiei.p.a(24, new aidv(aiei, location));
        }
    }

    public final void a(Location location, int i) {
        aiod aiod = this.b;
        aiod.a(2);
        if (aiod.d()) {
            aiei aiei = aiod.b;
            if (!aiei.a(location)) {
                String valueOf = String.valueOf(location);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 50);
                sb.append("Injected location object missing required fields: ");
                sb.append(valueOf);
                Log.wtf("GCoreFlp", new IllegalArgumentException(sb.toString()));
                return;
            }
            aiei.e.a(location, i);
            return;
        }
        throw new SecurityException("Client must be signed by Google to use injection API");
    }

    public final void a(ActivityRecognitionRequest activityRecognitionRequest, PendingIntent pendingIntent, ifu ifu) {
        boolean z;
        boolean z2;
        boolean z3;
        ActivityRecognitionRequest activityRecognitionRequest2 = activityRecognitionRequest;
        aiod aiod = this.b;
        ahjk.a(aiod.a, pendingIntent.getTargetPackage());
        boolean d = aiod.d();
        boolean e = aiod.e();
        WorkSource workSource = activityRecognitionRequest2.c;
        long j = activityRecognitionRequest2.a;
        boolean z4 = activityRecognitionRequest2.b;
        String str = activityRecognitionRequest2.d;
        int[] iArr = activityRecognitionRequest2.e;
        boolean z5 = activityRecognitionRequest2.f;
        String str2 = activityRecognitionRequest2.g;
        boolean z6 = true;
        if (!e) {
            if (!d) {
                if (iArr == null) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                iva.a(z3, (Object) "Illegal setting of nondefaultActivities");
            }
            if (workSource == null) {
                z = true;
            } else {
                z = false;
            }
            iva.a(z, (Object) "Illegal setting of workSource");
            iva.a(z4, (Object) "Illegal setting of triggerUpdate");
            if (str == null) {
                z2 = true;
            } else {
                z2 = false;
            }
            iva.a(z2, (Object) "Illegal setting of tag");
            iva.a(!z5, (Object) "Illegal setting of requestSensorData");
            if (str2 != null) {
                z6 = false;
            }
            iva.a(z6, (Object) "Illegal setting of accountName");
            str = "GLMSImplProxy";
        } else {
            if (str == null) {
                z6 = false;
            }
            iva.a(z6, (Object) "Tag is required for zero party clients.");
        }
        if (workSource == null) {
            workSource = jlr.a(Binder.getCallingUid(), pendingIntent.getTargetPackage());
        }
        rck rck = new rck();
        rck.a(j);
        rck.b(activityRecognitionRequest2.h);
        rck.c = z4;
        rck.d = workSource;
        rck.e = str;
        rck.f = z5;
        rck.g = str2;
        if (iArr != null) {
            for (int a2 : iArr) {
                rck.a(a2);
            }
        }
        atir atir = new atir(aiod.a.getPackageName());
        atir.a(rck.a(), pendingIntent);
        atir.a(d);
        atir.a(aiod.a);
        try {
            ifu.a(Status.a);
        } catch (RemoteException e2) {
        }
    }

    public final void a(ActivityTransitionRequest activityTransitionRequest, PendingIntent pendingIntent, ifu ifu) {
        aiod aiod = this.b;
        ahjk.a(aiod.a, pendingIntent.getTargetPackage());
        for (ActivityTransition activityTransition : activityTransitionRequest.b) {
            int i = activityTransition.a;
            int i2 = 0;
            if (!aiod.e() && !aiod.d()) {
                int[] iArr = aiod.l;
                int length = iArr.length;
                while (i2 < length) {
                    if (i != iArr[i2]) {
                        i2++;
                    }
                }
            } else {
                int[] iArr2 = aiod.m;
                int length2 = iArr2.length;
                while (i2 < length2) {
                    if (i != iArr2[i2]) {
                        i2++;
                    }
                }
            }
            throw new SecurityException("ActivityTransitionRequest specified an unsupported transition activity type.");
        }
        atir atir = new atir(aiod.a.getPackageName());
        IBinder asBinder = ifu.asBinder();
        if (atir.a.hasExtra("com.google.android.location.internal.EXTRA_ACTIVITY_TRANSITION_REMOVE")) {
            atir.c();
        }
        atir.a.putExtra("com.google.android.location.internal.EXTRA_ACTIVITY_TRANSITION_PENDING_INTENT", pendingIntent);
        Bundle bundle = new Bundle();
        fy.a(bundle, "com.google.android.location.internal.EXTRA_API_CALLBACK", asBinder);
        atir.a.putExtras(bundle);
        ivy.a((SafeParcelable) activityTransitionRequest, atir.a, "com.google.android.location.internal.EXTRA_ACTIVITY_TRANSITION_REQUEST");
        atir.a(aiod.d());
        atir.a(aiod.a);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: boolean} */
    /* JADX WARNING: type inference failed for: r4v0 */
    /* JADX WARNING: type inference failed for: r4v7 */
    /* JADX WARNING: type inference failed for: r4v8, types: [int] */
    /* JADX WARNING: type inference failed for: r4v10 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(com.google.android.gms.location.GeofencingRequest r8, android.app.PendingIntent r9, defpackage.rgh r10) {
        /*
            r7 = this;
            java.lang.String r0 = r7.c
            java.lang.String r1 = "com.google.android.gms"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0016
            com.google.android.gms.location.GeofencingRequest r0 = new com.google.android.gms.location.GeofencingRequest
            java.util.List r1 = r8.a
            int r8 = r8.b
            java.lang.String r2 = ""
            r0.<init>(r1, r8, r2)
            r8 = r0
        L_0x0016:
            aiod r0 = r7.b
            java.lang.String r1 = r7.c
            r0.a((android.app.PendingIntent) r9, (java.lang.String) r1)     // Catch:{ RuntimeException -> 0x00f3, RemoteException -> 0x00ea }
            android.content.Context r2 = r0.a     // Catch:{ RuntimeException -> 0x00f3, RemoteException -> 0x00ea }
            int r2 = defpackage.ajql.a(r2)     // Catch:{ RuntimeException -> 0x00f3, RemoteException -> 0x00ea }
            r3 = 2
            if (r2 < r3) goto L_0x00e2
            boolean r2 = defpackage.jkr.h()     // Catch:{ RuntimeException -> 0x00f3, RemoteException -> 0x00ea }
            r3 = 4
            r4 = 0
            if (r2 == 0) goto L_0x0078
            jhr r2 = r0.j     // Catch:{ RuntimeException -> 0x00f3, RemoteException -> 0x00ea }
            java.lang.String r5 = "android:monitor_location"
            int r6 = android.os.Binder.getCallingUid()     // Catch:{ RuntimeException -> 0x00f3, RemoteException -> 0x00ea }
            int r2 = r2.e(r5, r6, r1)     // Catch:{ RuntimeException -> 0x00f3, RemoteException -> 0x00ea }
            if (r2 == r3) goto L_0x003d
            goto L_0x0078
        L_0x003d:
            java.util.List r9 = r8.a()     // Catch:{ RuntimeException -> 0x00f3, RemoteException -> 0x00ea }
            int r9 = r9.size()     // Catch:{ RuntimeException -> 0x00f3, RemoteException -> 0x00ea }
            java.lang.String[] r0 = new java.lang.String[r9]     // Catch:{ RuntimeException -> 0x00f3, RemoteException -> 0x00ea }
        L_0x0047:
            if (r4 < r9) goto L_0x0067
            r8 = 1004(0x3ec, float:1.407E-42)
            r10.a((int) r8, (java.lang.String[]) r0)     // Catch:{ RuntimeException -> 0x00f3, RemoteException -> 0x00ea }
            java.lang.String r8 = "GLMSImpl"
            r9 = 5
            boolean r8 = android.util.Log.isLoggable(r8, r9)     // Catch:{ RuntimeException -> 0x00f3, RemoteException -> 0x00ea }
            if (r8 == 0) goto L_0x0066
            java.lang.String r8 = "GLMSImpl"
            java.lang.String r9 = java.lang.String.valueOf(r1)     // Catch:{ RuntimeException -> 0x00f3, RemoteException -> 0x00ea }
            java.lang.String r10 = " doesn't have sufficient location permission to request geofence."
            java.lang.String r9 = r9.concat(r10)     // Catch:{ RuntimeException -> 0x00f3, RemoteException -> 0x00ea }
            android.util.Log.w(r8, r9)     // Catch:{ RuntimeException -> 0x00f3, RemoteException -> 0x00ea }
        L_0x0066:
            return
        L_0x0067:
            java.util.List r2 = r8.a()     // Catch:{ RuntimeException -> 0x00f3, RemoteException -> 0x00ea }
            java.lang.Object r2 = r2.get(r4)     // Catch:{ RuntimeException -> 0x00f3, RemoteException -> 0x00ea }
            com.google.android.gms.location.internal.ParcelableGeofence r2 = (com.google.android.gms.location.internal.ParcelableGeofence) r2     // Catch:{ RuntimeException -> 0x00f3, RemoteException -> 0x00ea }
            java.lang.String r2 = r2.a     // Catch:{ RuntimeException -> 0x00f3, RemoteException -> 0x00ea }
            r0[r4] = r2     // Catch:{ RuntimeException -> 0x00f3, RemoteException -> 0x00ea }
            int r4 = r4 + 1
            goto L_0x0047
        L_0x0078:
            aimj r0 = r0.d     // Catch:{ RuntimeException -> 0x00f3, RemoteException -> 0x00ea }
            ainq r2 = new ainq     // Catch:{ RuntimeException -> 0x00f3, RemoteException -> 0x00ea }
            r2.<init>(r10)     // Catch:{ RuntimeException -> 0x00f3, RemoteException -> 0x00ea }
            if (r8 == 0) goto L_0x008d
            java.util.List r10 = r8.a     // Catch:{ RuntimeException -> 0x00f3, RemoteException -> 0x00ea }
            if (r10 == 0) goto L_0x008d
            int r10 = r10.size()     // Catch:{ RuntimeException -> 0x00f3, RemoteException -> 0x00ea }
            if (r10 <= 0) goto L_0x008d
            r4 = 1
            goto L_0x008e
        L_0x008d:
        L_0x008e:
            java.lang.String r10 = "Invalid GeofencingRequest request."
            defpackage.iva.b(r4, r10)     // Catch:{ RuntimeException -> 0x00f3, RemoteException -> 0x00ea }
            java.lang.String r10 = "PendingIntent not specified."
            defpackage.iva.a((java.lang.Object) r9, (java.lang.Object) r10)     // Catch:{ RuntimeException -> 0x00f3, RemoteException -> 0x00ea }
            java.lang.String r10 = "Package name not specified."
            defpackage.iva.a((java.lang.Object) r1, (java.lang.Object) r10)     // Catch:{ RuntimeException -> 0x00f3, RemoteException -> 0x00ea }
            aing r10 = r0.a     // Catch:{ RuntimeException -> 0x00f3, RemoteException -> 0x00ea }
            java.lang.Object r0 = r10.k     // Catch:{ RuntimeException -> 0x00f3, RemoteException -> 0x00ea }
            monitor-enter(r0)     // Catch:{ RuntimeException -> 0x00f3, RemoteException -> 0x00ea }
            java.lang.String r1 = "GeofencerStateMachine"
            boolean r1 = android.util.Log.isLoggable(r1, r3)     // Catch:{ all -> 0x00df }
            if (r1 == 0) goto L_0x00c9
            java.lang.String r1 = "GeofencerStateMachine"
            java.lang.String r3 = "addGeofences called by "
            java.lang.String r4 = defpackage.ajqj.a(r9)     // Catch:{ all -> 0x00df }
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x00df }
            int r5 = r4.length()     // Catch:{ all -> 0x00df }
            if (r5 != 0) goto L_0x00c2
            java.lang.String r4 = new java.lang.String     // Catch:{ all -> 0x00df }
            r4.<init>(r3)     // Catch:{ all -> 0x00df }
            goto L_0x00c6
        L_0x00c2:
            java.lang.String r4 = r3.concat(r4)     // Catch:{ all -> 0x00df }
        L_0x00c6:
            defpackage.aikq.a(r1, r4)     // Catch:{ all -> 0x00df }
        L_0x00c9:
            aily r1 = new aily     // Catch:{ all -> 0x00df }
            r1.<init>(r8, r9, r2)     // Catch:{ all -> 0x00df }
            boolean r8 = r10.u     // Catch:{ all -> 0x00df }
            if (r8 != 0) goto L_0x00da
            boolean r8 = defpackage.aikq.a     // Catch:{ all -> 0x00df }
            java.util.List r8 = r10.w     // Catch:{ all -> 0x00df }
            r8.add(r1)     // Catch:{ all -> 0x00df }
            goto L_0x00dd
        L_0x00da:
            r1.a((defpackage.aioa) r10)     // Catch:{ all -> 0x00df }
        L_0x00dd:
            monitor-exit(r0)     // Catch:{ all -> 0x00df }
            return
        L_0x00df:
            r8 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00df }
            throw r8     // Catch:{ RuntimeException -> 0x00f3, RemoteException -> 0x00ea }
        L_0x00e2:
            java.lang.SecurityException r8 = new java.lang.SecurityException     // Catch:{ RuntimeException -> 0x00f3, RemoteException -> 0x00ea }
            java.lang.String r9 = "Geofence usage requires ACCESS_FINE_LOCATION permission"
            r8.<init>(r9)     // Catch:{ RuntimeException -> 0x00f3, RemoteException -> 0x00ea }
            throw r8     // Catch:{ RuntimeException -> 0x00f3, RemoteException -> 0x00ea }
        L_0x00ea:
            r8 = move-exception
            java.lang.String r9 = "GLMSImpl"
            java.lang.String r10 = "remote exception when sending callback"
            android.util.Log.e(r9, r10, r8)
            return
        L_0x00f3:
            r8 = move-exception
            java.lang.String r9 = "GLMSImpl"
            java.lang.String r10 = "original addGeofence() exception (before parcelling)"
            android.util.Log.e(r9, r10, r8)
            goto L_0x00fd
        L_0x00fc:
            throw r8
        L_0x00fd:
            goto L_0x00fc
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aioe.a(com.google.android.gms.location.GeofencingRequest, android.app.PendingIntent, rgh):void");
    }

    @Deprecated
    public final void a(LocationRequest locationRequest, PendingIntent pendingIntent) {
        this.b.a(LocationRequestInternal.a((String) null, locationRequest), pendingIntent);
    }

    @Deprecated
    public final void a(LocationRequest locationRequest, ref ref) {
        this.b.a(locationRequest, ref, this.c);
    }

    @Deprecated
    public final void a(LocationRequest locationRequest, ref ref, String str) {
        this.b.a(locationRequest, ref, str);
    }

    public final void a(LocationSettingsRequest locationSettingsRequest, rgn rgn, String str) {
        if (str == null) {
            str = this.c;
        } else if (!this.c.equals("com.google.android.gms")) {
            throw new SecurityException("This API can only be called by GmsCore.");
        }
        if (locationSettingsRequest.c != null && !a.contains(str)) {
            locationSettingsRequest.b();
        }
        aiod aiod = this.b;
        int h = jlo.h();
        if (h == 8 || h == 10 || h == 13) {
            Log.w("GLMSImpl", "Not implemented on this platform.");
            try {
                rgn.a(new LocationSettingsResult(new Status(10, "Not implemented on this platform.")));
            } catch (RemoteException e) {
            }
        } else {
            if (locationSettingsRequest.c != null && !aiod.d()) {
                locationSettingsRequest.b();
            }
            aiop a2 = aiod.a();
            a2.c.execute(new aioo(a2, str, locationSettingsRequest, rgn));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x0058 A[Catch:{ RuntimeException -> 0x0070 }] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x005f A[Catch:{ RuntimeException -> 0x0070 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(com.google.android.gms.location.RemoveGeofencingRequest r6, defpackage.rgh r7) {
        /*
            r5 = this;
            java.lang.String r0 = r5.c
            java.lang.String r1 = "com.google.android.gms"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x000b
            goto L_0x0021
        L_0x000b:
            java.lang.String r0 = r6.c
            if (r0 == 0) goto L_0x0021
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0021
            com.google.android.gms.location.RemoveGeofencingRequest r0 = new com.google.android.gms.location.RemoveGeofencingRequest
            java.util.List r1 = r6.a
            android.app.PendingIntent r6 = r6.b
            java.lang.String r2 = ""
            r0.<init>(r1, r6, r2)
            r6 = r0
        L_0x0021:
            aiod r0 = r5.b
            java.lang.String r1 = r5.c
            android.app.PendingIntent r2 = r6.b     // Catch:{ RuntimeException -> 0x0070 }
            if (r2 != 0) goto L_0x002a
            goto L_0x002d
        L_0x002a:
            r0.a((android.app.PendingIntent) r2, (java.lang.String) r1)     // Catch:{ RuntimeException -> 0x0070 }
        L_0x002d:
            aimj r0 = r0.d     // Catch:{ RuntimeException -> 0x0070 }
            ainq r2 = new ainq     // Catch:{ RuntimeException -> 0x0070 }
            r2.<init>(r7)     // Catch:{ RuntimeException -> 0x0070 }
            r7 = 1
            r3 = 0
            if (r6 == 0) goto L_0x0049
            java.util.List r4 = r6.a     // Catch:{ RuntimeException -> 0x0070 }
            if (r4 == 0) goto L_0x0044
            int r4 = r4.size()     // Catch:{ RuntimeException -> 0x0070 }
            if (r4 > 0) goto L_0x0043
            goto L_0x0044
        L_0x0043:
            goto L_0x004a
        L_0x0044:
            android.app.PendingIntent r4 = r6.b     // Catch:{ RuntimeException -> 0x0070 }
            if (r4 == 0) goto L_0x0049
            goto L_0x004a
        L_0x0049:
            r7 = 0
        L_0x004a:
            java.lang.String r3 = "Invalid GeofencingRequest request."
            defpackage.iva.b(r7, r3)     // Catch:{ RuntimeException -> 0x0070 }
            java.lang.String r7 = "Package name not specified."
            defpackage.iva.a((java.lang.Object) r1, (java.lang.Object) r7)     // Catch:{ RuntimeException -> 0x0070 }
            android.app.PendingIntent r7 = r6.b     // Catch:{ RuntimeException -> 0x0070 }
            if (r7 != 0) goto L_0x005f
            ainr r7 = new ainr     // Catch:{ RuntimeException -> 0x0070 }
            r3 = 2
            r7.<init>(r3, r1, r2, r6)     // Catch:{ RuntimeException -> 0x0070 }
            goto L_0x006a
        L_0x005f:
            ainr r1 = new ainr     // Catch:{ RuntimeException -> 0x0070 }
            r3 = 3
            java.lang.String r7 = defpackage.ajqj.a(r7)     // Catch:{ RuntimeException -> 0x0070 }
            r1.<init>(r3, r7, r2, r6)     // Catch:{ RuntimeException -> 0x0070 }
            r7 = r1
        L_0x006a:
            aing r6 = r0.a     // Catch:{ RuntimeException -> 0x0070 }
            r6.a((defpackage.ainr) r7)     // Catch:{ RuntimeException -> 0x0070 }
            return
        L_0x0070:
            r6 = move-exception
            java.lang.String r7 = "GLMSImpl"
            java.lang.String r0 = "original removeGeofence() exception (before parcelling)"
            android.util.Log.e(r7, r0, r6)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aioe.a(com.google.android.gms.location.RemoveGeofencingRequest, rgh):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00f4  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0189  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x01aa  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(com.google.android.gms.location.internal.DeviceOrientationRequestUpdateData r19) {
        /*
            r18 = this;
            r1 = r18
            r0 = r19
            aiod r2 = r1.b
            java.lang.String r6 = r1.c
            int r3 = r0.a
            java.lang.String r10 = "GCoreFlp"
            r11 = 1
            r12 = 0
            if (r3 == r11) goto L_0x003a
            r4 = 2
            if (r3 == r4) goto L_0x002c
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r4 = 64
            r2.<init>(r4)
            java.lang.String r4 = "Received unknown device orientation request op code: "
            r2.append(r4)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            android.util.Log.e(r10, r2)
            r11 = 0
            goto L_0x01c1
        L_0x002c:
            rdz r3 = r0.c
            if (r3 == 0) goto L_0x0037
            aiib r2 = r2.c
            r2.a(r3)
            goto L_0x01c1
        L_0x0037:
            r11 = 0
            goto L_0x01c1
        L_0x003a:
            com.google.android.gms.location.internal.DeviceOrientationRequestInternal r3 = r0.b
            rdz r9 = r0.c
            if (r9 == 0) goto L_0x01c0
            aiib r2 = r2.c
            com.google.android.gms.location.internal.DeviceOrientationRequestInternal r13 = new com.google.android.gms.location.internal.DeviceOrientationRequestInternal
            com.google.android.gms.location.DeviceOrientationRequest r4 = r3.c
            java.util.ArrayList r5 = new java.util.ArrayList
            java.util.List r7 = r3.d
            r5.<init>(r7)
            java.lang.String r3 = r3.e
            r13.<init>(r4, r5, r3)
            android.content.Context r3 = r2.b
            int r4 = android.os.Binder.getCallingUid()
            r5 = 0
            if (r6 == 0) goto L_0x0090
            boolean r3 = defpackage.jll.a(r3, r4, r6)
            if (r3 != 0) goto L_0x0090
            int r3 = r6.length()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            int r3 = r3 + 115
            r7.<init>(r3)
            java.lang.String r3 = "Device Orientation client packageName:"
            r7.append(r3)
            r7.append(r6)
            java.lang.String r3 = " does not belong to the calling uid:"
            r7.append(r3)
            r7.append(r4)
            java.lang.String r3 = ". Setting package name as null"
            r7.append(r3)
            java.lang.String r3 = r7.toString()
            android.util.Log.e(r10, r3)
            boolean r3 = defpackage.ayaz.b()
            if (r3 == 0) goto L_0x0090
            r3 = r5
            goto L_0x0092
        L_0x0090:
            r3 = r6
        L_0x0092:
            boolean r7 = defpackage.ayaz.b()
            if (r7 == 0) goto L_0x009a
            r5 = r3
            goto L_0x009b
        L_0x009a:
        L_0x009b:
            java.util.List r3 = r13.d
            if (r3 != 0) goto L_0x00a0
            goto L_0x00a6
        L_0x00a0:
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L_0x00b4
        L_0x00a6:
            com.google.android.gms.common.internal.ClientIdentity r3 = new com.google.android.gms.common.internal.ClientIdentity
            r3.<init>(r4, r5)
            java.util.List r3 = java.util.Collections.singletonList(r3)
            defpackage.iva.a((java.lang.Object) r3)
            r13.d = r3
        L_0x00b4:
            int r5 = android.os.Binder.getCallingUid()
            aidg r14 = r2.d
            aihy r15 = new aihy
            r3 = r15
            r4 = r2
            r7 = r13
            r8 = r2
            r3.<init>(r4, r5, r6, r7, r8, r9)
            r3 = 30
            r14.a(r3, r15)
            aict r2 = r2.g
            boolean r3 = r2.a()
            if (r3 == 0) goto L_0x01bf
            double r3 = java.lang.Math.random()
            ayaz r5 = defpackage.ayaz.a
            ayba r5 = r5.a()
            double r5 = r5.fopRequestLogSamplingRate()
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 >= 0) goto L_0x01bf
            java.util.List r3 = r13.d
            java.lang.Object r3 = r3.get(r12)
            com.google.android.gms.common.internal.ClientIdentity r3 = (com.google.android.gms.common.internal.ClientIdentity) r3
            java.util.Map r4 = r2.d
            java.lang.String r5 = r3.b
            boolean r4 = r4.containsKey(r5)
            if (r4 != 0) goto L_0x017b
            java.util.Map r4 = r2.d
            java.lang.String r5 = r3.b
            anyx r6 = defpackage.anyx.d
            aucd r6 = r6.o()
            java.util.List r7 = r13.d
            if (r7 != 0) goto L_0x0103
            goto L_0x0152
        L_0x0103:
            boolean r8 = r7.isEmpty()
            if (r8 != 0) goto L_0x0152
            java.lang.Object r7 = r7.get(r12)
            com.google.android.gms.common.internal.ClientIdentity r7 = (com.google.android.gms.common.internal.ClientIdentity) r7
            if (r7 == 0) goto L_0x0152
            anyc r8 = defpackage.anyc.j
            aucd r8 = r8.o()
            java.lang.String r7 = r7.b
            if (r7 == 0) goto L_0x0133
            boolean r9 = r8.c
            if (r9 != 0) goto L_0x0120
            goto L_0x0125
        L_0x0120:
            r8.c()
            r8.c = r12
        L_0x0125:
            aucj r9 = r8.b
            anyc r9 = (defpackage.anyc) r9
            r7.getClass()
            int r13 = r9.a
            r13 = r13 | r11
            r9.a = r13
            r9.b = r7
        L_0x0133:
            aucj r7 = r8.i()
            anyc r7 = (defpackage.anyc) r7
            boolean r8 = r6.c
            if (r8 != 0) goto L_0x013e
            goto L_0x0143
        L_0x013e:
            r6.c()
            r6.c = r12
        L_0x0143:
            aucj r8 = r6.b
            anyx r8 = (defpackage.anyx) r8
            r7.getClass()
            r8.b = r7
            int r7 = r8.a
            r7 = r7 | 4
            r8.a = r7
        L_0x0152:
            boolean r7 = r6.c
            if (r7 != 0) goto L_0x0157
            goto L_0x015c
        L_0x0157:
            r6.c()
            r6.c = r12
        L_0x015c:
            aucj r7 = r6.b
            anyx r7 = (defpackage.anyx) r7
            int r8 = r7.a
            r8 = r8 | 8
            r7.a = r8
            r7.c = r12
            aucj r6 = r6.i()
            anyx r6 = (defpackage.anyx) r6
            r7 = 5
            java.lang.Object r7 = r6.c(r7)
            aucd r7 = (defpackage.aucd) r7
            r7.a((defpackage.aucj) r6)
            r4.put(r5, r7)
        L_0x017b:
            long r4 = android.os.SystemClock.elapsedRealtime()
            java.util.Map r6 = r2.c
            java.lang.String r7 = r3.b
            boolean r6 = r6.containsKey(r7)
            if (r6 == 0) goto L_0x01aa
            java.util.Map r4 = r2.c
            java.lang.String r5 = r3.b
            java.lang.Object r4 = r4.get(r5)
            android.util.Pair r4 = (android.util.Pair) r4
            java.lang.Object r5 = r4.first
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            int r5 = r5 + r11
            java.lang.Object r4 = r4.second
            java.lang.Long r4 = (java.lang.Long) r4
            long r6 = r4.longValue()
            r16 = r6
            r6 = r5
            r4 = r16
            goto L_0x01ab
        L_0x01aa:
            r6 = 1
        L_0x01ab:
            java.util.Map r2 = r2.c
            java.lang.String r3 = r3.b
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            android.util.Pair r4 = android.util.Pair.create(r6, r4)
            r2.put(r3, r4)
            goto L_0x01c1
        L_0x01bf:
            goto L_0x01c1
        L_0x01c0:
            r11 = 0
        L_0x01c1:
            rge r0 = r0.d     // Catch:{ RemoteException -> 0x01d6 }
            if (r0 == 0) goto L_0x01d5
            if (r11 != 0) goto L_0x01ca
            com.google.android.gms.common.api.Status r2 = com.google.android.gms.common.api.Status.e     // Catch:{ RemoteException -> 0x01d6 }
            goto L_0x01cc
        L_0x01ca:
            com.google.android.gms.common.api.Status r2 = com.google.android.gms.common.api.Status.a     // Catch:{ RemoteException -> 0x01d6 }
        L_0x01cc:
            com.google.android.gms.location.internal.FusedLocationProviderResult r3 = new com.google.android.gms.location.internal.FusedLocationProviderResult     // Catch:{ RemoteException -> 0x01d6 }
            r3.<init>(r2)     // Catch:{ RemoteException -> 0x01d6 }
            r0.a(r3)     // Catch:{ RemoteException -> 0x01d6 }
            return
        L_0x01d5:
            return
        L_0x01d6:
            r0 = move-exception
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r2 = java.lang.String.valueOf(r0)
            int r2 = r2.length()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            int r2 = r2 + 55
            r3.<init>(r2)
            java.lang.String r2 = "Client binder died before delivering operation result: "
            r3.append(r2)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            android.util.Log.e(r10, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aioe.a(com.google.android.gms.location.internal.DeviceOrientationRequestUpdateData):void");
    }

    @Deprecated
    public final void a(LocationRequestInternal locationRequestInternal, PendingIntent pendingIntent) {
        this.b.a(locationRequestInternal, pendingIntent);
    }

    @Deprecated
    public final void a(LocationRequestInternal locationRequestInternal, ref ref) {
        this.b.a(locationRequestInternal, ref, (rge) null, this.c);
    }

    public final void a(LocationRequestUpdateData locationRequestUpdateData) {
        aiod aiod = this.b;
        String str = this.c;
        int i = locationRequestUpdateData.a;
        if (i == 1) {
            LocationRequestInternal locationRequestInternal = locationRequestUpdateData.b;
            PendingIntent pendingIntent = locationRequestUpdateData.d;
            if (pendingIntent == null) {
                ref ref = locationRequestUpdateData.c;
                if (ref == null) {
                    rec rec = locationRequestUpdateData.e;
                    if (rec != null) {
                        rge rge = locationRequestUpdateData.f;
                        aiod.a(locationRequestInternal);
                        aiei aiei = aiod.b;
                        boolean b2 = aiod.b();
                        aiei.b(locationRequestInternal, str);
                        LocationRequestInternal b3 = LocationRequestInternal.b(locationRequestInternal);
                        boolean a2 = aiei.a(b3, str);
                        aiei.p.a(21, new aiec(aiei, Binder.getCallingUid(), str, b3, b2, a2, rec, rge));
                    }
                } else {
                    aiod.a(locationRequestInternal, ref, locationRequestUpdateData.f, str);
                }
            } else {
                aiod.a(locationRequestInternal, pendingIntent);
            }
        } else if (i != 2) {
            StringBuilder sb = new StringBuilder(54);
            sb.append("Received unknown location request op code: ");
            sb.append(i);
            Log.e("GCoreFlp", sb.toString());
        } else {
            PendingIntent pendingIntent2 = locationRequestUpdateData.d;
            if (pendingIntent2 == null) {
                ref ref2 = locationRequestUpdateData.c;
                if (ref2 == null) {
                    rec rec2 = locationRequestUpdateData.e;
                    if (rec2 != null) {
                        aiod.b.a(rec2);
                    }
                } else {
                    aiod.a(ref2);
                }
            } else {
                aiod.a(pendingIntent2);
            }
        }
        rge rge2 = locationRequestUpdateData.f;
        if (rge2 != null) {
            try {
                rge2.a(FusedLocationProviderResult.a);
            } catch (RemoteException e) {
                String valueOf = String.valueOf(e);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 55);
                sb2.append("Client binder died before delivering operation result: ");
                sb2.append(valueOf);
                Log.e("GCoreFlp", sb2.toString());
            }
        }
    }

    public final void a(ifu ifu) {
        aiod aiod = this.b;
        String packageName = aiod.a.getPackageName();
        ahjk.a(aiod.a, packageName);
        atir atir = new atir(packageName);
        IBinder asBinder = ifu.asBinder();
        atir.a.putExtra("com.google.android.location.internal.EXTRA_FLUSH_ACTIVITY_SAMPLES", 1);
        Bundle bundle = new Bundle();
        fy.a(bundle, "com.google.android.location.internal.EXTRA_API_CALLBACK", asBinder);
        atir.a.putExtras(bundle);
        atir.a(aiod.a);
    }

    public final void a(List list, PendingIntent pendingIntent, rgh rgh) {
        rdv rdv = new rdv();
        rdv.a(list);
        rdv.b(5);
        a(rdv.a(), pendingIntent, rgh);
    }

    @Deprecated
    public final void a(ref ref) {
        this.b.a(ref);
    }

    public final void a(rge rge) {
        aiod aiod = this.b;
        String str = this.c;
        aiod.a(1);
        aiei aiei = aiod.b;
        aiei.p.a(new aidw(aiei, new ClientIdentity(Binder.getCallingUid(), str), rge));
    }

    @Deprecated
    public final void a(rgh rgh) {
        aiod aiod = this.b;
        String str = this.c;
        try {
            aimj aimj = aiod.d;
            ainq ainq = new ainq(rgh);
            iva.a((Object) str, (Object) "Package name not specified.");
            aimj.a.a(ainr.a(str, ainq));
        } catch (RuntimeException e) {
            Log.e("GLMSImpl", "original removeAllGeofences() exception (before parcelling)", e);
            throw e;
        }
    }

    public final void a(boolean z) {
        aiod aiod = this.b;
        String str = this.c;
        aiei aiei = aiod.b;
        aiei.c(str);
        aiei.a(z);
    }

    @Deprecated
    public final void a(String[] strArr, rgh rgh, String str) {
        List asList = Arrays.asList(strArr);
        iva.a((Object) asList, (Object) "geofence can't be null.");
        iva.b(!asList.isEmpty(), "Geofences must contains at least one id.");
        a(new RemoveGeofencingRequest(asList, (PendingIntent) null, ""), rgh);
    }

    public final boolean a(int i) {
        aiod aiod = this.b;
        if (aiod.e()) {
            SharedPreferences sharedPreferences = aiod.a.getSharedPreferences("activityRecognitionAccuracyModeName", 0);
            if (sharedPreferences == null) {
                Log.e("GLMSImpl", "null pref for activity recognition accuracy mode was found ");
                return false;
            }
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putInt("arAccuracyModePref", i);
            boolean commit = edit.commit();
            if (commit) {
                ahol a2 = ahol.a(aiod.a);
                StringBuilder sb = new StringBuilder(57);
                sb.append("logging change in activity recognition mode = ");
                sb.append(i);
                sb.toString();
                aucd o = aree.d.o();
                long currentTimeMillis = System.currentTimeMillis();
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                aree aree = (aree) o.b;
                int i2 = aree.a | 2;
                aree.a = i2;
                aree.c = currentTimeMillis;
                if (i == 0) {
                    aree.b = 1;
                    aree.a = i2 | 1;
                } else {
                    if (i != 1) {
                        aree.b = 0;
                    } else {
                        aree.b = 2;
                    }
                    aree.a = i2 | 1;
                }
                aucd o2 = arec.q.o();
                if (o2.c) {
                    o2.c();
                    o2.c = false;
                }
                arec arec = (arec) o2.b;
                aree aree2 = (aree) o.i();
                aree2.getClass();
                arec.j = aree2;
                arec.a |= 512;
                hoi a3 = a2.a.a((audx) (arec) o2.i());
                a3.b(11);
                a3.b();
            } else {
                Log.e("GLMSImpl", "unable to write the activity mode to the shared preferences!");
            }
            return commit;
        }
        throw new SecurityException("Activity recognition  setActivityRecognitionMode is only available to zero party");
    }
}
