package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.location.Location;
import android.os.Build;
import android.os.Handler;
import android.os.PowerManager;
import android.os.SystemClock;
import android.os.WorkSource;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.internal.ClientIdentity;
import com.google.android.gms.location.RemoveGeofencingRequest;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: aiml  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aiml implements aijv {
    public int a = Integer.MAX_VALUE;
    public int b = Integer.MAX_VALUE;
    public final aikc c = new aikc();
    final aisl d;
    final ainj e;
    final aiju f;
    final acrz g;
    final aiso h;
    public int i = ((int) (System.currentTimeMillis() % 8192));
    public final TreeMap j = new TreeMap();
    public final aimd k;
    public final Context l;
    public aime m;
    public final ajpm n;
    private final aini o;

    public aiml(aekn aekn, Context context, Handler handler, aing aing, String str, aijw aijw, aikk aikk) {
        Context context2 = context;
        aing aing2 = aing;
        ainh ainh = null;
        try {
            int i2 = Build.VERSION.SDK_INT;
            ainh = ainh.a;
        } catch (NoClassDefFoundError | VerifyError e2) {
        }
        this.o = ainh;
        int i3 = Build.VERSION.SDK_INT;
        int i4 = Build.VERSION.SDK_INT;
        this.m = new ainp(aing2, aycg.a.c().flpGeofenceEnableHalDebugMode() ? 1 : 0);
        Context context3 = context;
        this.k = new aimd(context3, aing, new jbs(context), jgy.a(context), aikk);
        this.h = new aiso(((PowerManager) context.getSystemService("power")).isScreenOn());
        acrz acrz = new acrz(context3, 1, "GeofencePendingIntentWakeLock", (String) null, "com.google.android.gms");
        this.g = acrz;
        acrz.a(true);
        this.d = new aisl(context, this.h, new aimk(aing2), "geofencer_ad_state");
        aikk aikk2 = aikk;
        this.e = new ainj(context, aing2, new rom(context), aikk2);
        this.n = new ajpm(context);
        this.f = new aiju(aekn, context, handler, this.g, aijw, str, this, aikk2);
        this.l = context2;
    }

    public static final boolean a(List list) {
        return list == null || list.size() == 0;
    }

    /* access modifiers changed from: package-private */
    public final boolean a() {
        return this.a == Integer.MAX_VALUE;
    }

    /* access modifiers changed from: package-private */
    public final List b() {
        aijx aijx = this.f.e;
        return aijx.g.a((Iterable) aijx.c());
    }

    /* access modifiers changed from: package-private */
    public final boolean b(double d2) {
        int i2 = this.a;
        return i2 != Integer.MAX_VALUE && ((double) i2) > d2;
    }

    /* access modifiers changed from: package-private */
    public final boolean c() {
        return this.f.c() > 0;
    }

    /* access modifiers changed from: package-private */
    public final int d() {
        return this.f.c();
    }

    /* access modifiers changed from: package-private */
    public final void e() {
        this.e.a();
        this.d.a();
        aiko.a.a(1038980360, -1);
    }

    /* access modifiers changed from: package-private */
    public final void f() {
        this.g.c((WorkSource) null);
        if (this.g.e()) {
            this.g.c();
        }
    }

    /* access modifiers changed from: package-private */
    public final void g() {
        aisl aisl = this.d;
        aucd e2 = aisl.g.e();
        if (e2 != null) {
            try {
                aisl.i.a((audx) (ailr) e2.i());
                boolean z = aikq.a;
            } catch (IOException e3) {
                boolean z2 = aikq.a;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final aisp h() {
        return this.d.g.b();
    }

    public final void i() {
        aimh aimh = null;
        if (!aybo.a.a().swallowNpeFromGpsHardwareGeofencer()) {
            aime aime = this.m;
            aini aini = this.o;
            if (aini != null) {
                aimh = aini.a();
            }
            aime.a(aimh);
            return;
        }
        try {
            aime aime2 = this.m;
            aini aini2 = this.o;
            if (aini2 != null) {
                aimh = aini2.a();
            }
            aime2.a(aimh);
        } catch (NullPointerException e2) {
            String valueOf = String.valueOf(e2);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 41);
            sb.append("Failed to update GNSS Geofence hardware: ");
            sb.append(valueOf);
            aikq.b("GeofencerStateInfo", sb.toString());
            this.m = new ainl();
        }
    }

    public final void j() {
        aijx aijx = this.f.e;
        if (aijx.i != null) {
            int i2 = 0;
            for (aikb aikb : aijx.c()) {
                aikk aikk = aijx.i;
                String k2 = aikb.k();
                String c2 = aikb.c();
                List<aijt> unmodifiableList = Collections.unmodifiableList(aikb.c);
                aiki a2 = aikk.a(k2, c2, unmodifiableList.size());
                for (aijt aijt : unmodifiableList) {
                    aikk.a(a2, aijt.a.g, aijt.d);
                }
                i2 += aikb.a();
            }
            aijx.i.a(i2);
        }
    }

    /* access modifiers changed from: package-private */
    public final int a(String str, String str2) {
        for (aikb aikb : this.f.e.c()) {
            if (aikb.k().equals(str)) {
                String c2 = aikb.c();
                if (!TextUtils.isEmpty(str2) ? str2.equals(c2) : TextUtils.isEmpty(c2)) {
                    return aikb.a();
                }
            }
        }
        return 0;
    }

    /* access modifiers changed from: package-private */
    public final List b(int i2) {
        aijx aijx = this.f.e;
        return aijx.g.b(aijx.c(), i2);
    }

    public final aijq a(long j2, Location location, boolean z, double d2, Map map) {
        Pair pair;
        long j3;
        if (!z) {
            Location location2 = location;
        } else {
            aikc aikc = this.c;
            Pair pair2 = new Pair(Long.valueOf(j2), location);
            if (pair2.second != null) {
                aikc.b = pair2;
                if (aikc.a.size() != 0) {
                    LinkedList linkedList = aikc.a;
                    pair = (Pair) linkedList.get(linkedList.size() - 1);
                } else {
                    pair = null;
                }
                if (pair != null) {
                    j3 = ((Long) pair.first).longValue();
                } else {
                    j3 = -1;
                }
                if (pair != null && Math.abs(((Long) pair2.first).longValue() - j3) < 10000) {
                    if (((Location) pair.second).getAccuracy() <= ((Location) pair2.second).getAccuracy()) {
                        boolean z2 = aikq.a;
                    } else {
                        boolean z3 = aikq.a;
                        aikc.a.removeLast();
                    }
                }
                if (aikc.a.size() >= 100) {
                    aikc.a.remove(0);
                }
                long longValue = ((Long) pair2.first).longValue();
                int size = aikc.a.size() - 1;
                while (size >= 0 && longValue < ((Long) ((Pair) aikc.a.get(size)).first).longValue()) {
                    size--;
                }
                aikc.a.add(size + 1, pair2);
            }
        }
        aiju aiju = this.f;
        aijx aijx = aiju.e;
        aijq a2 = aijx.g.a(aijx.c(), aijx.j(), j2, location, d2, map);
        if (a2 != null) {
            try {
                aiju.b();
            } catch (IOException e2) {
            }
        }
        a(d2);
        return a2;
    }

    /* access modifiers changed from: package-private */
    public final Pair a(ainr ainr) {
        boolean z;
        List list;
        boolean z2;
        List list2;
        List list3;
        boolean z3;
        List list4;
        int i2 = ainr.a;
        if (i2 == 1) {
            aiju aiju = this.f;
            String str = ainr.b;
            aiju.e.i();
            aijx aijx = aiju.e;
            aijx.b = true;
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (aikb aikb : aijx.e()) {
                if (aikb.k().equals(str)) {
                    arrayList.addAll(aikb.b());
                    arrayList2.add(aikb.b);
                }
            }
            if (arrayList2.size() > 0) {
                int size = arrayList2.size();
                for (int i3 = 0; i3 < size; i3++) {
                    aijx.a((Object) (aijy) arrayList2.get(i3));
                }
            }
            aijx.b = false;
            if (!arrayList.isEmpty()) {
                aijx.a(2);
            }
            if (!arrayList.isEmpty()) {
                try {
                    aiju.b();
                    z = false;
                } catch (IOException e2) {
                    z = true;
                }
            } else {
                z = false;
            }
            if (z) {
                aiju.e.g();
            }
            aiju.e.h();
            if (!z) {
                return Pair.create(0, arrayList);
            }
            return Pair.create(1, (Object) null);
        } else if (i2 != 2) {
            aiju aiju2 = this.f;
            RemoveGeofencingRequest removeGeofencingRequest = ainr.c;
            PendingIntent pendingIntent = removeGeofencingRequest.b;
            String str2 = removeGeofencingRequest.c;
            aiju2.e.i();
            String a2 = ajqj.a(pendingIntent);
            if (str2 == null || str2.isEmpty()) {
                aijx aijx2 = aiju2.e;
                aijx2.b = true;
                ArrayList arrayList3 = new ArrayList();
                if (pendingIntent != null) {
                    String a3 = ajqj.a(pendingIntent);
                    List list5 = null;
                    for (aikb aikb2 : aijx2.e()) {
                        List a4 = aikb2.a(pendingIntent);
                        if (a3.equals(aikb2.k()) && !a4.isEmpty() && aikb2.a() == 0) {
                            arrayList3.add(aikb2.b);
                        }
                        list5 = a4;
                    }
                    list4 = list5;
                } else {
                    list4 = null;
                }
                if (arrayList3.size() > 0) {
                    int size2 = arrayList3.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        aijx2.a((Object) (aijy) arrayList3.get(i4));
                    }
                }
                aijx2.b = false;
                if (list3 != null && !list3.isEmpty()) {
                    aijx2.a(2);
                }
            } else {
                aijy aijy = new aijy(a2, str2);
                aijx aijx3 = aiju2.e;
                aijx3.b = true;
                aikb aikb3 = (aikb) aijx3.b((Object) aijy);
                if (aikb3 != null) {
                    list3 = aikb3.a(pendingIntent);
                    if (!list3.isEmpty() && aikb3.a() == 0) {
                        aijx3.a((Object) aikb3.b);
                    }
                } else {
                    list3 = null;
                }
                aijx3.b = false;
                if (list3 != null && !list3.isEmpty()) {
                    aijx3.a(2);
                }
            }
            if (list3 == null || list3.isEmpty()) {
                z3 = false;
            } else {
                try {
                    aiju2.b();
                    z3 = false;
                } catch (IOException e3) {
                    z3 = true;
                }
            }
            if (z3) {
                aiju2.e.g();
            }
            aiju2.e.h();
            if (z3) {
                return Pair.create(1, (Object) null);
            }
            return Pair.create(0, list3);
        } else {
            aiju aiju3 = this.f;
            String str3 = ainr.b;
            RemoveGeofencingRequest removeGeofencingRequest2 = ainr.c;
            List list6 = removeGeofencingRequest2.a;
            String str4 = removeGeofencingRequest2.c;
            aiju3.e.i();
            if (str4 != null && !str4.isEmpty()) {
                list = aiju3.e.a(new aijy(str3, str4), list6);
            } else {
                aijx aijx4 = aiju3.e;
                aijx4.b = true;
                ArrayList arrayList4 = new ArrayList();
                if (str3 != null) {
                    list2 = null;
                    for (aikb aikb4 : aijx4.e()) {
                        List a5 = aikb4.a(list6);
                        if (aikb4.k().equals(str3) && !a5.isEmpty() && aikb4.a() == 0) {
                            arrayList4.add(aikb4.b);
                        }
                        list2 = a5;
                    }
                } else {
                    list2 = null;
                }
                if (arrayList4.size() > 0) {
                    int size3 = arrayList4.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        aijx4.a((Object) (aijy) arrayList4.get(i5));
                    }
                }
                aijx4.b = false;
                if (list2 != null && !list2.isEmpty()) {
                    aijx4.a(2);
                }
                list = list2;
            }
            if (list == null || list.isEmpty()) {
                z2 = false;
            } else {
                try {
                    aiju3.b();
                    z2 = false;
                } catch (IOException e4) {
                    z2 = true;
                }
            }
            if (z2) {
                aiju3.e.g();
            }
            aiju3.e.h();
            if (!z2) {
                return Pair.create(0, list);
            }
            return Pair.create(1, (Object) null);
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0227  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0229 A[SYNTHETIC, Splitter:B:66:0x0229] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0232  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x023e  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0248 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.util.Pair a(com.google.android.gms.location.GeofencingRequest r19, android.app.PendingIntent r20) {
        /*
            r18 = this;
            r0 = r19
            java.util.List r1 = r0.a
            int r1 = r1.size()
            r2 = 0
            r3 = 0
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            if (r1 == 0) goto L_0x0249
            r1 = r18
            aiju r5 = r1.f
            aijx r6 = r5.e
            r6.i()
            aijx r6 = r5.e
            java.lang.String r7 = defpackage.ajqj.a(r20)
            java.lang.String r14 = r0.c
            aijy r8 = new aijy
            r8.<init>(r7, r14)
            ayca r7 = defpackage.ayca.a
            aycb r7 = r7.a()
            boolean r7 = r7.enableAddGeofencesThrottling()
            if (r7 == 0) goto L_0x0072
            nz r7 = r6.j
            java.lang.Object r7 = r7.get(r8)
            ixy r7 = (defpackage.ixy) r7
            if (r7 != 0) goto L_0x005d
            ayca r7 = defpackage.ayca.a
            aycb r7 = r7.a()
            long r9 = r7.geofencerAddGeofencesBurstEvents()
            int r7 = (int) r9
            ixy r9 = new ixy
            ayca r10 = defpackage.ayca.a
            aycb r10 = r10.a()
            long r10 = r10.geofencerAddGeofencesIntervalSeconds()
            int r11 = (int) r10
            r9.<init>(r11, r7, r7)
            nz r7 = r6.j
            r7.put(r8, r9)
            r7 = r9
        L_0x005d:
            boolean r7 = r7.a()
            if (r7 == 0) goto L_0x0064
            goto L_0x0072
        L_0x0064:
            r0 = 1005(0x3ed, float:1.408E-42)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            android.util.Pair r0 = android.util.Pair.create(r0, r2)
            r1 = r0
            r3 = 1
            goto L_0x021d
        L_0x0072:
            java.util.List r7 = r0.a
            nz r9 = new nz
            int r10 = r7.size()
            r9.<init>((int) r10)
            int r10 = r7.size()
            r11 = 0
            r12 = 0
        L_0x0083:
            if (r11 >= r10) goto L_0x00a1
            java.lang.Object r13 = r7.get(r11)
            com.google.android.gms.location.internal.ParcelableGeofence r13 = (com.google.android.gms.location.internal.ParcelableGeofence) r13
            if (r13 == 0) goto L_0x009c
            java.lang.String r2 = r13.a
            java.lang.Object r2 = r9.put(r2, r13)
            com.google.android.gms.location.internal.ParcelableGeofence r2 = (com.google.android.gms.location.internal.ParcelableGeofence) r2
            if (r12 == 0) goto L_0x0098
            goto L_0x009c
        L_0x0098:
            if (r2 != 0) goto L_0x009c
            r12 = 0
            goto L_0x009d
        L_0x009c:
            r12 = 1
        L_0x009d:
            int r11 = r11 + 1
            r2 = 0
            goto L_0x0083
        L_0x00a1:
            if (r12 == 0) goto L_0x00ad
            java.util.ArrayList r7 = new java.util.ArrayList
            java.util.Collection r2 = r9.values()
            r7.<init>(r2)
            goto L_0x00ae
        L_0x00ad:
        L_0x00ae:
            java.util.ArrayList r2 = new java.util.ArrayList
            int r9 = r7.size()
            r2.<init>(r9)
            int r9 = r7.size()
            r10 = 0
        L_0x00bc:
            if (r10 >= r9) goto L_0x00cc
            java.lang.Object r11 = r7.get(r10)
            com.google.android.gms.location.internal.ParcelableGeofence r11 = (com.google.android.gms.location.internal.ParcelableGeofence) r11
            java.lang.String r11 = r11.a
            r2.add(r11)
            int r10 = r10 + 1
            goto L_0x00bc
        L_0x00cc:
            r6.a(r8, r2)
            jio r2 = r6.b((java.lang.Object) r8)
            aikb r2 = (defpackage.aikb) r2
            r10 = 5
            java.lang.String r11 = "GeofenceByPackageAndTag"
            if (r2 == 0) goto L_0x013a
            java.util.HashSet r12 = new java.util.HashSet
            r12.<init>()
            java.util.ArrayList r13 = r2.c
            int r15 = r13.size()
        L_0x00e5:
            if (r3 >= r15) goto L_0x00f7
            java.lang.Object r17 = r13.get(r3)
            r9 = r17
            aijt r9 = (defpackage.aijt) r9
            android.app.PendingIntent r9 = r9.b
            r12.add(r9)
            int r3 = r3 + 1
            goto L_0x00e5
        L_0x00f7:
            r3 = r20
            boolean r9 = r12.contains(r3)
            if (r9 != 0) goto L_0x013c
            int r9 = r12.size()
            if (r9 >= r10) goto L_0x0106
            goto L_0x013c
        L_0x0106:
            boolean r0 = android.util.Log.isLoggable(r11, r10)
            if (r0 == 0) goto L_0x012b
            java.util.Locale r0 = java.util.Locale.ENGLISH
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]
            aijy r2 = r2.b
            java.lang.String r2 = r2.toString()
            r4 = 0
            r3[r4] = r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r10)
            r4 = 1
            r3[r4] = r2
            java.lang.String r2 = "Too many PendingIntent from package: %s. At most %d allowed."
            java.lang.String r0 = java.lang.String.format(r0, r2, r3)
            defpackage.aikq.c(r11, r0)
        L_0x012b:
            r0 = 1002(0x3ea, float:1.404E-42)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2 = 0
            android.util.Pair r0 = android.util.Pair.create(r0, r2)
            r1 = r0
            r3 = 1
            goto L_0x021d
        L_0x013a:
            r3 = r20
        L_0x013c:
            jio r2 = r6.b((java.lang.Object) r8)
            aikb r2 = (defpackage.aikb) r2
            int r9 = r7.size()
            r12 = 100
            if (r2 == 0) goto L_0x018f
            java.util.ArrayList r13 = r2.c
            int r13 = r13.size()
            int r15 = r13 + r9
            if (r15 <= r12) goto L_0x018d
            boolean r0 = android.util.Log.isLoggable(r11, r10)
            if (r0 == 0) goto L_0x0189
            java.util.Locale r0 = java.util.Locale.ENGLISH
            r3 = 4
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r13)
            r15 = 0
            r3[r15] = r4
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)
            r6 = 1
            r3[r6] = r4
            aijy r2 = r2.b
            java.lang.String r2 = r2.toString()
            r4 = 2
            r3[r4] = r2
            r2 = 3
            java.lang.Integer r4 = java.lang.Integer.valueOf(r12)
            r3[r2] = r4
            java.lang.String r2 = "Too many geofences (%d + %d) from package %s. At most %d allowed."
            java.lang.String r0 = java.lang.String.format(r0, r2, r3)
            defpackage.aikq.c(r11, r0)
            r3 = 1
            goto L_0x0211
        L_0x0189:
            r15 = 0
            r3 = 1
            goto L_0x0211
        L_0x018d:
            r15 = 0
            goto L_0x0192
        L_0x018f:
            r15 = 0
            if (r9 > r12) goto L_0x0210
        L_0x0192:
            aikb r2 = r6.a((defpackage.aijy) r8)
            if (r2 != 0) goto L_0x01a6
            r2 = 1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            r2 = 0
            android.util.Pair r0 = android.util.Pair.create(r0, r2)
            r1 = r0
            r3 = 1
            goto L_0x021d
        L_0x01a6:
            java.util.ArrayList r13 = new java.util.ArrayList
            int r8 = r7.size()
            r13.<init>(r8)
            int r12 = r7.size()
            r11 = 0
        L_0x01b4:
            if (r11 >= r12) goto L_0x0208
            java.lang.Object r8 = r7.get(r11)
            r9 = r8
            com.google.android.gms.location.internal.ParcelableGeofence r9 = (com.google.android.gms.location.internal.ParcelableGeofence) r9
            aijt r10 = new aijt
            int r8 = r0.b
            aijv r15 = r6.h
        L_0x01c3:
            r0 = r15
            aiml r0 = (defpackage.aiml) r0
            java.util.TreeMap r1 = r0.j
            int r3 = r0.i
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            boolean r1 = r1.containsKey(r3)
            if (r1 == 0) goto L_0x01e3
            int r1 = r0.i
            r3 = 1
            int r1 = r1 + r3
            int r1 = r1 % 8192
            r0.i = r1
            r1 = r18
            r0 = r19
            r3 = r20
            goto L_0x01c3
        L_0x01e3:
            r3 = 1
            int r0 = r0.i
            r1 = r8
            r8 = r10
            r15 = r10
            r10 = r1
            r1 = r11
            r11 = r20
            r16 = r12
            r12 = r0
            r0 = r13
            r13 = r14
            r8.<init>(r9, r10, r11, r12, r13)
            r0.add(r15)
            r2.a((defpackage.aijt) r15)
            int r11 = r1 + 1
            r1 = r18
            r3 = r20
            r13 = r0
            r12 = r16
            r15 = 0
            r0 = r19
            goto L_0x01b4
        L_0x0208:
            r0 = r13
            r3 = 1
            android.util.Pair r0 = android.util.Pair.create(r4, r0)
            r1 = r0
            goto L_0x021d
        L_0x0210:
            r3 = 1
        L_0x0211:
            r0 = 1001(0x3e9, float:1.403E-42)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1 = 0
            android.util.Pair r0 = android.util.Pair.create(r0, r1)
            r1 = r0
        L_0x021d:
            java.lang.Object r0 = r1.first
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            if (r0 == 0) goto L_0x0229
            r3 = r0
            goto L_0x022f
        L_0x0229:
            r5.b()     // Catch:{ IOException -> 0x022e }
            r3 = 0
            goto L_0x022f
        L_0x022e:
            r0 = move-exception
        L_0x022f:
            if (r3 != 0) goto L_0x0232
            goto L_0x0237
        L_0x0232:
            aijx r0 = r5.e
            r0.g()
        L_0x0237:
            aijx r0 = r5.e
            r0.h()
            if (r3 == 0) goto L_0x0248
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            r1 = 0
            android.util.Pair r0 = android.util.Pair.create(r0, r1)
            return r0
        L_0x0248:
            return r1
        L_0x0249:
            r1 = r2
            android.util.Pair r0 = android.util.Pair.create(r4, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aiml.a(com.google.android.gms.location.GeofencingRequest, android.app.PendingIntent):android.util.Pair");
    }

    /* access modifiers changed from: package-private */
    public final void a(double d2) {
        int i2;
        boolean z = aikq.a;
        List a2 = this.f.a(d2, 1);
        int i3 = Integer.MAX_VALUE;
        if (a2 == null || a2.size() != 1) {
            i2 = Integer.MAX_VALUE;
        } else {
            i2 = ((aijt) a2.get(0)).a(d2);
        }
        this.a = i2;
        List b2 = this.f.b(1);
        if (b2 != null && b2.size() == 1) {
            i3 = ((aijt) b2.get(0)).d();
        }
        this.b = i3;
        boolean z2 = aikq.a;
    }

    public final void a(int i2) {
        if (((aijt) this.j.remove(Integer.valueOf(i2))) == null && Log.isLoggable("GeofencerStateInfo", 5) && Log.isLoggable("GeofencerStateInfo", 6)) {
            StringBuilder sb = new StringBuilder(54);
            sb.append("Trying to remove an ID that doesn't exist: ");
            sb.append(i2);
            aikq.b("GeofencerStateInfo", sb.toString());
        }
    }

    public final void a(int i2, aijt aijt) {
        if (Log.isLoggable("GeofencerStateInfo", 5) && this.j.containsKey(Integer.valueOf(i2)) && Log.isLoggable("GeofencerStateInfo", 6)) {
            StringBuilder sb = new StringBuilder(60);
            sb.append("ID already exists. Overwriting the previous one: ");
            sb.append(i2);
            aikq.b("GeofencerStateInfo", sb.toString());
        }
        this.j.put(Integer.valueOf(i2), aijt);
    }

    /* access modifiers changed from: package-private */
    public final void a(int i2, boolean z, Collection collection, int i3, Collection collection2, boolean z2) {
        boolean z3;
        if (i2 <= 0) {
            this.e.a();
        } else {
            this.e.a(i2, z, collection, z2);
        }
        if (i3 > 0) {
            aisl aisl = this.d;
            StringBuilder sb = new StringBuilder(56);
            sb.append("Activity update interval should be positive: ");
            sb.append(i3);
            irk.a(true, (Object) sb.toString());
            if (collection2 == null) {
                boolean z4 = aikq.a;
                collection2 = Collections.singletonList(new ClientIdentity(aisl.c, aisl.d));
            }
            synchronized (aisl.h) {
                if (i3 == aisl.j) {
                    Collection collection3 = aisl.k;
                    if (collection3 != null && collection3.equals(collection2)) {
                        boolean z5 = aikq.a;
                    }
                }
                long a2 = aisl.g.a();
                if (a2 < 0 || SystemClock.elapsedRealtime() - a2 > 90000) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (aisl.j == -1) {
                    aisl.g.a(true);
                }
                aisl.j = i3;
                aisl.k = collection2;
                aisl.a(i3, z3, collection2);
            }
            aiko.a.a(-1165682797, i3);
            return;
        }
        this.d.a();
        aiko.a.a(-1206718418, -1);
    }

    /* access modifiers changed from: package-private */
    public final void a(Intent intent) {
        aiso aiso = this.h;
        String action = intent.getAction();
        if ("android.intent.action.SCREEN_OFF".equals(action)) {
            aiso.a(false);
        } else if ("android.intent.action.SCREEN_ON".equals(action)) {
            aiso.a(true);
        } else if ("android.intent.action.ACTION_POWER_CONNECTED".equals(action)) {
            aiso.a();
        } else if ("android.intent.action.ACTION_POWER_DISCONNECTED".equals(action)) {
            aiso.a();
        }
    }

    public final void a(Collection collection, PendingIntent pendingIntent) {
        if (pendingIntent != null) {
            try {
                String a2 = ajqj.a(pendingIntent);
                collection.add(new ClientIdentity(jni.b(this.l).a(a2, 0).uid, a2));
            } catch (PackageManager.NameNotFoundException e2) {
            }
        } else {
            collection.add(ajqg.a(this.l));
        }
    }
}
