package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.os.Build;
import android.os.Looper;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.measurement.internal.AppMetadata;
import com.google.android.gms.measurement.internal.ConditionalUserPropertyParcel;
import com.google.android.gms.measurement.internal.EventParcel;
import com.google.android.gms.measurement.internal.UserAttributeParcel;
import java.util.ArrayList;
import java.util.List;

/* renamed from: sye  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class sye extends sot {
    public final syd b;
    public sug c;
    public volatile Boolean d;
    private final spm e;
    private final syt f;
    private final List g = new ArrayList();
    private final spm h;

    public sye(svv svv) {
        super(svv);
        this.f = new syt(svv.l);
        this.b = new syd(this);
        this.e = new sxs(this, svv);
        this.h = new sxt(this, svv);
    }

    public final void D() {
        h();
        E().k.a("Processing queued up service tasks", Integer.valueOf(this.g.size()));
        List list = this.g;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            try {
                ((Runnable) list.get(i)).run();
            } catch (Exception e2) {
                E().c.a("Task exception while flushing queue", e2);
            }
        }
        this.g.clear();
        this.h.c();
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0112  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x013b  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x013d  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0174  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0181  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0193  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0198  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.measurement.internal.AppMetadata a(boolean r35) {
        /*
            r34 = this;
            spc r0 = r34.u()
            boolean r0 = r0.a
            if (r0 != 0) goto L_0x01bd
            suh r2 = r34.e()
            if (r35 == 0) goto L_0x0018
            sut r0 = r34.E()
            java.lang.String r0 = r0.c()
            r14 = r0
            goto L_0x0019
        L_0x0018:
            r14 = 0
        L_0x0019:
            r2.h()
            r2.i()
            com.google.android.gms.measurement.internal.AppMetadata r31 = new com.google.android.gms.measurement.internal.AppMetadata
            java.lang.String r4 = r2.o()
            java.lang.String r5 = r2.p()
            r2.l()
            java.lang.String r6 = r2.c
            int r0 = r2.r()
            long r7 = (long) r0
            r2.l()
            java.lang.String r9 = r2.e
            long r10 = r2.s()
            r2.l()
            r2.h()
            long r12 = r2.f
            r15 = 0
            int r0 = (r12 > r15 ? 1 : (r12 == r15 ? 0 : -1))
            if (r0 != 0) goto L_0x0062
            svv r0 = r2.x
            szj r0 = r0.f()
            android.content.Context r3 = r2.z()
            android.content.Context r12 = r2.z()
            java.lang.String r12 = r12.getPackageName()
            long r12 = r0.a((android.content.Context) r3, (java.lang.String) r12)
            r2.f = r12
        L_0x0062:
            svv r0 = r2.x
            boolean r17 = r0.q()
            svf r0 = r2.w()
            boolean r0 = r0.s
            r3 = 1
            r20 = r0 ^ 1
            r2.h()
            r2.i()
            svv r0 = r2.x
            boolean r0 = r0.q()
            r15 = 0
            if (r0 == 0) goto L_0x00e8
            aylr r0 = defpackage.aylr.a
            r0.a()
            android.content.Context r0 = r2.z()     // Catch:{ ClassNotFoundException -> 0x00e7 }
            java.lang.ClassLoader r0 = r0.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x00e7 }
            java.lang.String r1 = "com.google.firebase.analytics.FirebaseAnalytics"
            java.lang.Class r0 = r0.loadClass(r1)     // Catch:{ ClassNotFoundException -> 0x00e7 }
            if (r0 == 0) goto L_0x00e8
            java.lang.Class[] r1 = new java.lang.Class[r3]     // Catch:{ Exception -> 0x00d7 }
            java.lang.Class<android.content.Context> r21 = android.content.Context.class
            r1[r15] = r21     // Catch:{ Exception -> 0x00d7 }
            java.lang.String r15 = "getInstance"
            java.lang.reflect.Method r1 = r0.getDeclaredMethod(r15, r1)     // Catch:{ Exception -> 0x00d7 }
            java.lang.Object[] r15 = new java.lang.Object[r3]     // Catch:{ Exception -> 0x00d7 }
            android.content.Context r21 = r2.z()     // Catch:{ Exception -> 0x00d7 }
            r3 = 0
            r15[r3] = r21     // Catch:{ Exception -> 0x00d7 }
            r3 = 0
            java.lang.Object r1 = r1.invoke(r3, r15)     // Catch:{ Exception -> 0x00d7 }
            if (r1 == 0) goto L_0x00e8
            java.lang.String r3 = "getFirebaseInstanceId"
            r21 = r14
            r15 = 0
            java.lang.Class[] r14 = new java.lang.Class[r15]     // Catch:{ Exception -> 0x00c5 }
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r3, r14)     // Catch:{ Exception -> 0x00c5 }
            java.lang.Object[] r3 = new java.lang.Object[r15]     // Catch:{ Exception -> 0x00c5 }
            java.lang.Object r0 = r0.invoke(r1, r3)     // Catch:{ Exception -> 0x00c5 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x00c5 }
            goto L_0x00eb
        L_0x00c5:
            r0 = move-exception
            goto L_0x00ca
        L_0x00c7:
            r0 = move-exception
            r21 = r14
        L_0x00ca:
            sut r0 = r2.E()
            sur r0 = r0.h
            java.lang.String r1 = "Failed to retrieve Firebase Instance Id"
            r0.a(r1)
            r0 = 0
            goto L_0x00eb
        L_0x00d7:
            r0 = move-exception
            r21 = r14
            sut r0 = r2.E()
            sur r0 = r0.g
            java.lang.String r1 = "Failed to obtain Firebase Analytics instance"
            r0.a(r1)
            r0 = 0
            goto L_0x00eb
        L_0x00e7:
            r0 = move-exception
        L_0x00e8:
            r21 = r14
            r0 = 0
        L_0x00eb:
            svv r1 = r2.x
            svf r3 = r1.a()
            svc r3 = r3.i
            long r14 = r3.a()
            java.lang.Long r3 = java.lang.Long.valueOf(r14)
            long r14 = r3.longValue()
            r18 = 0
            int r23 = (r14 > r18 ? 1 : (r14 == r18 ? 0 : -1))
            if (r23 == 0) goto L_0x0112
            long r14 = r1.x
            r23 = r0
            long r0 = r3.longValue()
            long r0 = java.lang.Math.min(r14, r0)
            goto L_0x0116
        L_0x0112:
            r23 = r0
            long r0 = r1.x
        L_0x0116:
            int r24 = r2.t()
            spg r3 = r2.v()
            java.lang.Boolean r3 = r3.f()
            boolean r25 = r3.booleanValue()
            spg r3 = r2.v()
            r3.i()
            java.lang.String r14 = "google_analytics_ssaid_collection_enabled"
            java.lang.Boolean r3 = r3.b(r14)
            if (r3 == 0) goto L_0x013d
            boolean r3 = r3.booleanValue()
            if (r3 != 0) goto L_0x013d
            r3 = 0
            goto L_0x013e
        L_0x013d:
            r3 = 1
        L_0x013e:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            boolean r26 = r3.booleanValue()
            svf r3 = r2.w()
            r3.h()
            android.content.SharedPreferences r3 = r3.c()
            java.lang.String r14 = "deferred_analytics_collection"
            r15 = 0
            boolean r27 = r3.getBoolean(r14, r15)
            java.lang.String r28 = r2.q()
            spg r3 = r2.v()
            suc r14 = defpackage.sud.U
            boolean r3 = r3.a((defpackage.suc) r14)
            if (r3 == 0) goto L_0x0181
            spg r3 = r2.v()
            java.lang.String r14 = "google_analytics_default_allow_ad_personalization_signals"
            java.lang.Boolean r3 = r3.b(r14)
            if (r3 == 0) goto L_0x0181
            boolean r3 = r3.booleanValue()
            r14 = 1
            r3 = r3 ^ r14
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            r29 = r3
            goto L_0x0183
        L_0x0181:
            r29 = 0
        L_0x0183:
            long r14 = r2.g
            spg r3 = r2.v()
            r32 = r14
            suc r14 = defpackage.sud.ac
            boolean r3 = r3.a((defpackage.suc) r14)
            if (r3 == 0) goto L_0x0198
            java.util.List r2 = r2.h
            r30 = r2
            goto L_0x019a
        L_0x0198:
            r30 = 0
        L_0x019a:
            defpackage.ayjy.c()
            r18 = 0
            r3 = r31
            r14 = r21
            r15 = r17
            r16 = r20
            r17 = r23
            r20 = r0
            r22 = r24
            r23 = r25
            r24 = r26
            r25 = r27
            r26 = r28
            r27 = r29
            r28 = r32
            r3.<init>(r4, r5, r6, r7, r9, r10, r12, r14, r15, r16, r17, r18, r20, r22, r23, r24, r25, r26, r27, r28, r30)
            return r31
        L_0x01bd:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sye.a(boolean):com.google.android.gms.measurement.internal.AppMetadata");
    }

    /* access modifiers changed from: protected */
    public final boolean n() {
        return false;
    }

    public final boolean o() {
        h();
        l();
        return this.c != null;
    }

    public final boolean p() {
        int i = Build.VERSION.SDK_INT;
        return !u().a;
    }

    public final void q() {
        h();
        this.f.a();
        spm spm = this.e;
        v();
        spm.a(((Long) sud.G.a()).longValue());
    }

    /* access modifiers changed from: package-private */
    public final void r() {
        List<ResolveInfo> queryIntentServices;
        String str;
        h();
        l();
        if (o()) {
            return;
        }
        if (s()) {
            syd syd = this.b;
            syd.c.h();
            Context z = syd.c.z();
            synchronized (syd) {
                if (syd.a) {
                    syd.c.E().k.a("Connection attempt already in progress");
                    return;
                }
                if (syd.b != null) {
                    if (!syd.b.m()) {
                        if (syd.b.l()) {
                        }
                    }
                    syd.c.E().k.a("Already awaiting connection attempt");
                    return;
                }
                syd.b = new sul(z, Looper.getMainLooper(), syd, syd);
                syd.c.E().k.a("Connecting to remote service");
                syd.a = true;
                syd.b.t();
            }
        } else if (v().k()) {
        } else {
            if (u().a || (queryIntentServices = z().getPackageManager().queryIntentServices(new Intent().setClassName(z(), "com.google.android.gms.measurement.AppMeasurementService"), 65536)) == null || queryIntentServices.size() <= 0) {
                E().c.a("Unable to use remote or local measurement implementation. Please register the AppMeasurementService service in the app manifest");
                return;
            }
            Intent intent = new Intent("com.google.android.gms.measurement.START");
            Context z2 = z();
            if (!u().a) {
                str = "com.google.android.gms.measurement.AppMeasurementService";
            } else {
                str = "com.google.android.gms.measurement.PackageMeasurementService";
            }
            intent.setComponent(new ComponentName(z2, str));
            syd syd2 = this.b;
            syd2.c.h();
            Context z3 = syd2.c.z();
            jca a = jca.a();
            synchronized (syd2) {
                if (!syd2.a) {
                    syd2.c.E().k.a("Using local app measurement service");
                    syd2.a = true;
                    a.a(z3, intent, syd2.c.b, 129);
                    return;
                }
                syd2.c.E().k.a("Connection attempt already in progress");
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00f8  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0104  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean s() {
        /*
            r6 = this;
            r6.h()
            r6.l()
            java.lang.Boolean r0 = r6.d
            if (r0 != 0) goto L_0x0122
            r6.h()
            r6.l()
            svf r0 = r6.w()
            r0.h()
            android.content.SharedPreferences r1 = r0.c()
            java.lang.String r2 = "use_service"
            boolean r1 = r1.contains(r2)
            r3 = 0
            if (r1 == 0) goto L_0x0031
            android.content.SharedPreferences r0 = r0.c()
            boolean r0 = r0.getBoolean(r2, r3)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            goto L_0x0032
        L_0x0031:
            r0 = 0
        L_0x0032:
            r1 = 1
            if (r0 != 0) goto L_0x0036
            goto L_0x003e
        L_0x0036:
            boolean r4 = r0.booleanValue()
            if (r4 == 0) goto L_0x003e
            goto L_0x011c
        L_0x003e:
            spc r4 = r6.u()
            boolean r4 = r4.a
            if (r4 != 0) goto L_0x00ea
            suh r4 = r6.e()
            int r4 = r4.t()
            if (r4 == r1) goto L_0x00ea
            sut r4 = r6.E()
            sur r4 = r4.k
            java.lang.String r5 = "Checking service availability"
            r4.a(r5)
            szj r4 = r6.x()
            hxk r5 = defpackage.hxk.d
            android.content.Context r4 = r4.z()
            int r4 = r5.b(r4)
            if (r4 == 0) goto L_0x00de
            if (r4 == r1) goto L_0x00d2
            r5 = 2
            if (r4 == r5) goto L_0x00b3
            r0 = 3
            if (r4 == r0) goto L_0x00a6
            r0 = 9
            if (r4 == r0) goto L_0x0099
            r0 = 18
            if (r4 == r0) goto L_0x008c
            sut r0 = r6.E()
            sur r0 = r0.f
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
            java.lang.String r4 = "Unexpected service status"
            r0.a(r4, r1)
            r1 = 0
            goto L_0x00ec
        L_0x008c:
            sut r0 = r6.E()
            sur r0 = r0.f
            java.lang.String r3 = "Service updating"
            r0.a(r3)
            r3 = 1
            goto L_0x00ec
        L_0x0099:
            sut r0 = r6.E()
            sur r0 = r0.f
            java.lang.String r1 = "Service invalid"
            r0.a(r1)
            r1 = 0
            goto L_0x00ec
        L_0x00a6:
            sut r0 = r6.E()
            sur r0 = r0.f
            java.lang.String r1 = "Service disabled"
            r0.a(r1)
            r1 = 0
            goto L_0x00ec
        L_0x00b3:
            sut r4 = r6.E()
            sur r4 = r4.j
            java.lang.String r5 = "Service container out of date"
            r4.a(r5)
            szj r4 = r6.x()
            int r4 = r4.n()
            r5 = 17443(0x4423, float:2.4443E-41)
            if (r4 >= r5) goto L_0x00cb
            goto L_0x00ec
        L_0x00cb:
            if (r0 != 0) goto L_0x00ce
            goto L_0x00cf
        L_0x00ce:
            r1 = 0
        L_0x00cf:
            r3 = r1
            r1 = 0
            goto L_0x00ec
        L_0x00d2:
            sut r0 = r6.E()
            sur r0 = r0.k
            java.lang.String r4 = "Service missing"
            r0.a(r4)
            goto L_0x00ec
        L_0x00de:
            sut r0 = r6.E()
            sur r0 = r0.k
            java.lang.String r3 = "Service available"
            r0.a(r3)
            goto L_0x00eb
        L_0x00ea:
        L_0x00eb:
            r3 = 1
        L_0x00ec:
            if (r3 != 0) goto L_0x0104
            spg r0 = r6.v()
            boolean r0 = r0.k()
            if (r0 == 0) goto L_0x0104
            sut r0 = r6.E()
            sur r0 = r0.c
            java.lang.String r1 = "No way to upload. Consider using the full version of Analytics"
            r0.a(r1)
            goto L_0x011b
        L_0x0104:
            if (r1 == 0) goto L_0x011b
            svf r0 = r6.w()
            r0.h()
            android.content.SharedPreferences r0 = r0.c()
            android.content.SharedPreferences$Editor r0 = r0.edit()
            r0.putBoolean(r2, r3)
            r0.apply()
        L_0x011b:
            r1 = r3
        L_0x011c:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            r6.d = r0
        L_0x0122:
            java.lang.Boolean r0 = r6.d
            boolean r0 = r0.booleanValue()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sye.s():boolean");
    }

    public final void t() {
        h();
        l();
        syd syd = this.b;
        if (syd.b != null && (syd.b.l() || syd.b.m())) {
            syd.b.j();
        }
        syd.b = null;
        try {
            jca.a().a(z(), (ServiceConnection) this.b);
        } catch (IllegalArgumentException | IllegalStateException e2) {
        }
        this.c = null;
    }

    public final void a(ComponentName componentName) {
        h();
        if (this.c != null) {
            this.c = null;
            E().k.a("Disconnected from device MeasurementService", componentName);
            h();
            r();
        }
    }

    /* access modifiers changed from: protected */
    public final void a(ConditionalUserPropertyParcel conditionalUserPropertyParcel) {
        boolean z;
        iva.a((Object) conditionalUserPropertyParcel);
        h();
        l();
        boolean z2 = !u().a;
        if (z2) {
            suj b2 = b();
            byte[] a = b2.x().a((Parcelable) conditionalUserPropertyParcel);
            if (a.length > 131072) {
                b2.E().d.a("Conditional user property too long for local database. Sending directly to service");
                z = false;
            } else if (b2.a(2, a)) {
                z = true;
            }
            a((Runnable) new sxv(this, z2, z, new ConditionalUserPropertyParcel(conditionalUserPropertyParcel), a(true), conditionalUserPropertyParcel));
        }
        z = false;
        a((Runnable) new sxv(this, z2, z, new ConditionalUserPropertyParcel(conditionalUserPropertyParcel), a(true), conditionalUserPropertyParcel));
    }

    public final void a(Runnable runnable) {
        h();
        if (o()) {
            runnable.run();
            return;
        }
        int size = this.g.size();
        v();
        if (((long) size) >= 1000) {
            E().c.a("Discarding data. Max runnable queue size reached");
            return;
        }
        this.g.add(runnable);
        this.h.a(60000);
        r();
    }

    /* access modifiers changed from: protected */
    public final void a(sug sug) {
        h();
        iva.a((Object) sug);
        this.c = sug;
        q();
        D();
    }

    /* access modifiers changed from: package-private */
    public final void a(sug sug, AbstractSafeParcelable abstractSafeParcelable, AppMetadata appMetadata) {
        int i;
        List r;
        h();
        i();
        l();
        boolean p = p();
        v();
        int i2 = 0;
        int i3 = 100;
        while (i2 < 1001 && i3 == 100) {
            ArrayList arrayList = new ArrayList();
            if (!p || (r = b().r()) == null) {
                i = 0;
            } else {
                arrayList.addAll(r);
                i = r.size();
            }
            if (abstractSafeParcelable != null && i < 100) {
                arrayList.add(abstractSafeParcelable);
            }
            int size = arrayList.size();
            for (int i4 = 0; i4 < size; i4++) {
                AbstractSafeParcelable abstractSafeParcelable2 = (AbstractSafeParcelable) arrayList.get(i4);
                if (abstractSafeParcelable2 instanceof EventParcel) {
                    try {
                        sug.a((EventParcel) abstractSafeParcelable2, appMetadata);
                    } catch (RemoteException e2) {
                        E().c.a("Failed to send event to the service", e2);
                    }
                } else if (abstractSafeParcelable2 instanceof UserAttributeParcel) {
                    try {
                        sug.a((UserAttributeParcel) abstractSafeParcelable2, appMetadata);
                    } catch (RemoteException e3) {
                        E().c.a("Failed to send user property to the service", e3);
                    }
                } else if (abstractSafeParcelable2 instanceof ConditionalUserPropertyParcel) {
                    try {
                        sug.a((ConditionalUserPropertyParcel) abstractSafeParcelable2, appMetadata);
                    } catch (RemoteException e4) {
                        E().c.a("Failed to send conditional user property to the service", e4);
                    }
                } else {
                    E().c.a("Discarding data. Unrecognized parcel type.");
                }
            }
            i2++;
            i3 = i;
        }
    }

    /* access modifiers changed from: protected */
    public final void a(sxk sxk) {
        h();
        l();
        a((Runnable) new sxr(this, sxk));
    }
}
