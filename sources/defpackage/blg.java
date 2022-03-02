package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.util.Log;
import com.google.android.chimera.config.ModuleManager;
import java.util.ArrayList;
import java.util.List;

/* renamed from: blg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class blg extends bjx {
    private static volatile blg e;

    public blg(Context context) {
        super(context, "current_features.fb");
    }

    public static Intent a(ModuleManager.FeatureList featureList) {
        return new Intent("com.google.android.chimera.container.REQUEST_FEATURES_WITH_UI").putExtra("chimera.FEATURE_LIST", featureList.getProtoBytes());
    }

    public final List d() {
        return a((String) null);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00b6 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.apxg e() {
        /*
            r9 = this;
            java.io.File r0 = r9.b
            boolean r1 = r9.c()
            if (r1 == 0) goto L_0x0012
            android.content.Context r0 = r9.a
            android.content.Context r0 = defpackage.blb.a(r0)
            java.io.File r0 = defpackage.bkq.a((android.content.Context) r0)
        L_0x0012:
            monitor-enter(r9)
            java.lang.String r1 = "current_features.fb"
            java.io.File r0 = defpackage.bjx.a(r0, r1)     // Catch:{ all -> 0x00b7 }
            r1 = 0
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ IOException -> 0x0068, InvalidConfigException -> 0x0066 }
            r2.<init>(r0)     // Catch:{ IOException -> 0x0068, InvalidConfigException -> 0x0066 }
            apxg r0 = defpackage.bkq.b(r2)     // Catch:{ all -> 0x0052 }
            int r3 = r0.R()     // Catch:{ all -> 0x0050 }
            r4 = 1
            if (r3 == r4) goto L_0x0047
            int r3 = r0.R()     // Catch:{ all -> 0x0050 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0050 }
            r5 = 46
            r4.<init>(r5)     // Catch:{ all -> 0x0050 }
            java.lang.String r5 = "Wrong version: expects 1 but found "
            r4.append(r5)     // Catch:{ all -> 0x0050 }
            r4.append(r3)     // Catch:{ all -> 0x0050 }
            java.lang.String r3 = "FeatureMgr"
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x0050 }
            android.util.Log.e(r3, r4)     // Catch:{ all -> 0x0050 }
            goto L_0x0048
        L_0x0047:
            r1 = r0
        L_0x0048:
            r2.close()     // Catch:{ IOException -> 0x004e, InvalidConfigException -> 0x004c }
            goto L_0x0093
        L_0x004c:
            r0 = move-exception
            goto L_0x0069
        L_0x004e:
            r0 = move-exception
            goto L_0x0069
        L_0x0050:
            r1 = move-exception
            goto L_0x0056
        L_0x0052:
            r0 = move-exception
            r8 = r1
            r1 = r0
            r0 = r8
        L_0x0056:
            r2.close()     // Catch:{ all -> 0x005a }
            goto L_0x005e
        L_0x005a:
            r2 = move-exception
            defpackage.apev.a((java.lang.Throwable) r1, (java.lang.Throwable) r2)     // Catch:{ IOException -> 0x0061, InvalidConfigException -> 0x005f }
        L_0x005e:
            throw r1     // Catch:{ IOException -> 0x0061, InvalidConfigException -> 0x005f }
        L_0x005f:
            r1 = move-exception
            goto L_0x0062
        L_0x0061:
            r1 = move-exception
        L_0x0062:
            r8 = r1
            r1 = r0
            r0 = r8
            goto L_0x0069
        L_0x0066:
            r0 = move-exception
            goto L_0x0069
        L_0x0068:
            r0 = move-exception
        L_0x0069:
            java.lang.String r2 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x00b7 }
            java.lang.String r3 = java.lang.String.valueOf(r2)     // Catch:{ all -> 0x00b7 }
            int r3 = r3.length()     // Catch:{ all -> 0x00b7 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x00b7 }
            int r3 = r3 + 31
            r4.<init>(r3)     // Catch:{ all -> 0x00b7 }
            java.lang.String r3 = "Failed to read feature config: "
            r4.append(r3)     // Catch:{ all -> 0x00b7 }
            r4.append(r2)     // Catch:{ all -> 0x00b7 }
            java.lang.String r2 = r4.toString()     // Catch:{ all -> 0x00b7 }
            boolean r0 = r0 instanceof java.io.FileNotFoundException     // Catch:{ all -> 0x00b7 }
            if (r0 != 0) goto L_0x0092
            java.lang.String r0 = "FeatureMgr"
            android.util.Log.w(r0, r2)     // Catch:{ all -> 0x00b7 }
            goto L_0x0093
        L_0x0092:
        L_0x0093:
            monitor-exit(r9)     // Catch:{ all -> 0x00b7 }
            if (r1 != 0) goto L_0x00b6
            apxe r0 = new apxe
            r1 = 100
            r0.<init>(r1)
            r3 = 1
            r4 = 0
            r5 = 0
            r6 = -1
            r2 = r0
            int r1 = defpackage.apxg.a(r2, r3, r4, r5, r6)
            defpackage.apxg.a((defpackage.apxe) r0, (int) r1)
            java.nio.ByteBuffer r0 = r0.f()
            r0.remaining()
            apxg r0 = defpackage.apxg.b((java.nio.ByteBuffer) r0)
            return r0
        L_0x00b6:
            return r1
        L_0x00b7:
            r0 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x00b7 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.blg.e():apxg");
    }

    public static blg a(Context context) {
        blg blg = e;
        if (blg == null) {
            synchronized (blg.class) {
                blg = e;
                if (blg == null) {
                    blg = new blg(context);
                    e = blg;
                }
            }
        }
        return blg;
    }

    public final List a(String str) {
        ob obVar = new ob();
        bkn.b();
        String f = awxo.a.a().f();
        if (!f.isEmpty()) {
            for (String add : f.split(",")) {
                obVar.add(add);
            }
        }
        bkn.b();
        boolean h = awxo.h();
        apxg e2 = e();
        int v = e2.v();
        ArrayList arrayList = new ArrayList(v);
        apxg apxg = new apxg();
        for (int i = 0; i < v; i++) {
            e2.b(apxg, i);
            String y = apxg.y();
            String A = apxg.A();
            if (str == null || str.equals(A)) {
                if (A.equals(":server_requester")) {
                    bkn.b();
                    if (!awxs.d()) {
                    }
                }
                if (!A.equals("system_image") || (h && !obVar.contains(y))) {
                    aucd o = boc.d.o();
                    if (o.c) {
                        o.c();
                        o.c = false;
                    }
                    boc boc = (boc) o.b;
                    y.getClass();
                    boc.a |= 1;
                    boc.b = y;
                    long z = apxg.z();
                    if (o.c) {
                        o.c();
                        o.c = false;
                    }
                    boc boc2 = (boc) o.b;
                    boc2.a |= 2;
                    boc2.c = z;
                    arrayList.add((boc) o.i());
                }
            }
        }
        return arrayList;
    }

    public final void a(List list, long j, bkw bkw) {
        blf blf;
        ArrayList arrayList;
        long j2 = j;
        if (j2 != -1) {
            apxg e2 = e();
            ArrayList arrayList2 = new ArrayList();
            blf blf2 = null;
            try {
                boy w = e2.w();
                long x = e2.x();
                if (w == null) {
                    bkw bkw2 = bkw;
                } else if (bkw.a(w)) {
                    arrayList = arrayList2;
                    blf = blf2;
                    a(":server_requester", list, arrayList, false, false, (boj) null, (String) null, blf);
                }
                if (x != j2) {
                    blf blf3 = new blf(bkw.g(), j2);
                    try {
                        ArrayList arrayList3 = new ArrayList();
                        for (int i = 0; i < e2.v(); i++) {
                            apxg b = e2.b(new apxg(), i);
                            if (b.A().equals(":server_requester")) {
                                arrayList3.add(b.y());
                            }
                        }
                        arrayList2 = arrayList3;
                        blf2 = blf3;
                    } catch (PackageManager.NameNotFoundException e3) {
                        blf2 = blf3;
                        Log.e("FeatureMgr", "Installed container APK's timestamp or version code weren't set. No features will be removed.");
                        arrayList = arrayList2;
                        blf = blf2;
                        a(":server_requester", list, arrayList, false, false, (boj) null, (String) null, blf);
                    }
                }
                arrayList = arrayList2;
                blf = blf2;
            } catch (PackageManager.NameNotFoundException e4) {
                Log.e("FeatureMgr", "Installed container APK's timestamp or version code weren't set. No features will be removed.");
                arrayList = arrayList2;
                blf = blf2;
                a(":server_requester", list, arrayList, false, false, (boj) null, (String) null, blf);
            }
            a(":server_requester", list, arrayList, false, false, (boj) null, (String) null, blf);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0224, code lost:
        if (r28 == false) goto L_0x0251;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0226, code lost:
        r2 = r1.a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x022c, code lost:
        if (r25.isEmpty() != false) goto L_0x0245;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x022e, code lost:
        r3 = defpackage.bod.b.o();
        r3.i((java.lang.Iterable) r25);
        r3 = ((defpackage.bod) r3.i()).k();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0245, code lost:
        r1.a.startService(defpackage.ble.a(r2, r3, r0, r30));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0251, code lost:
        if (r0 == null) goto L_0x0256;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0253, code lost:
        defpackage.bpx.a(r0, r7 ? 1 : 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0256, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(java.lang.String r24, java.util.Collection r25, java.util.Collection r26, boolean r27, boolean r28, defpackage.boj r29, java.lang.String r30, defpackage.blf r31) {
        /*
            r23 = this;
            r1 = r23
            r0 = r29
            r2 = r31
            java.nio.ByteBuffer r3 = defpackage.bog.a((java.lang.String) r24)
            ou r4 = new ou
            int r5 = r25.size()
            r4.<init>(r5)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.util.Iterator r6 = r25.iterator()
        L_0x001c:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x0062
            java.lang.Object r7 = r6.next()
            boc r7 = (defpackage.boc) r7
            java.lang.String r8 = r7.b
            java.nio.ByteBuffer r8 = defpackage.bog.a((java.lang.String) r8)
            long r9 = r7.c
            java.lang.Long r9 = java.lang.Long.valueOf(r9)
            r4.put(r8, r9)
            java.lang.String r8 = r7.b
            long r9 = r7.c
            java.lang.String r7 = java.lang.String.valueOf(r8)
            int r7 = r7.length()
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            int r7 = r7 + 22
            r11.<init>(r7)
            java.lang.String r7 = "+"
            r11.append(r7)
            r11.append(r8)
            java.lang.String r7 = ":"
            r11.append(r7)
            r11.append(r9)
            java.lang.String r7 = r11.toString()
            r5.append(r7)
            goto L_0x001c
        L_0x0062:
            ob r6 = new ob
            int r7 = r26.size()
            r6.<init>((int) r7)
            java.util.Iterator r7 = r26.iterator()
        L_0x006f:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x00c8
            java.lang.Object r8 = r7.next()
            java.lang.String r8 = (java.lang.String) r8
            java.nio.ByteBuffer r9 = defpackage.bog.a((java.lang.String) r8)
            boolean r10 = r4.containsKey(r9)
            if (r10 != 0) goto L_0x00a2
            r6.add(r9)
            java.lang.String r8 = java.lang.String.valueOf(r8)
            java.lang.String r9 = "-"
            int r10 = r8.length()
            if (r10 != 0) goto L_0x009a
            java.lang.String r8 = new java.lang.String
            r8.<init>(r9)
            goto L_0x009e
        L_0x009a:
            java.lang.String r8 = r9.concat(r8)
        L_0x009e:
            r5.append(r8)
            goto L_0x006f
        L_0x00a2:
            java.lang.String r9 = java.lang.String.valueOf(r8)
            int r9 = r9.length()
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            int r9 = r9 + 74
            r10.<init>(r9)
            java.lang.String r9 = "Attempted to request and unrequest the same feature: "
            r10.append(r9)
            r10.append(r8)
            java.lang.String r8 = ". Ignoring unrequest."
            r10.append(r8)
            java.lang.String r8 = r10.toString()
            java.lang.String r9 = "FeatureMgr"
            android.util.Log.w(r9, r8)
            goto L_0x006f
        L_0x00c8:
            monitor-enter(r23)
            apxg r7 = r23.e()     // Catch:{ all -> 0x0257 }
            int r8 = r7.v()     // Catch:{ all -> 0x0257 }
            int r9 = r4.h     // Catch:{ all -> 0x0257 }
            int r9 = r9 + r8
            apxe r14 = new apxe     // Catch:{ all -> 0x0257 }
            int r10 = r9 * 32
            int r10 = r10 + 132
            r14.<init>(r10)     // Catch:{ all -> 0x0257 }
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch:{ all -> 0x0257 }
            r10.<init>(r9)     // Catch:{ all -> 0x0257 }
            apxg r9 = new apxg     // Catch:{ all -> 0x0257 }
            r9.<init>()     // Catch:{ all -> 0x0257 }
            r11 = 0
            r12 = 0
        L_0x00e9:
            r13 = 4
            r16 = 1
            if (r11 >= r8) goto L_0x0161
            r7.b((defpackage.apxg) r9, (int) r11)     // Catch:{ all -> 0x0257 }
            r15 = 8
            java.nio.ByteBuffer r15 = r9.i(r15)     // Catch:{ all -> 0x0257 }
            java.nio.ByteBuffer r13 = r9.i(r13)     // Catch:{ all -> 0x0257 }
            long r17 = r9.z()     // Catch:{ all -> 0x0257 }
            boolean r19 = r6.contains(r13)     // Catch:{ all -> 0x0257 }
            if (r19 == 0) goto L_0x011c
            boolean r19 = r15.equals(r3)     // Catch:{ all -> 0x0257 }
            if (r19 == 0) goto L_0x0112
            r19 = r6
            r26 = r8
            r6 = r9
            r12 = 1
            goto L_0x0159
        L_0x0112:
            if (r27 != 0) goto L_0x0115
            goto L_0x011c
        L_0x0115:
            r19 = r6
            r26 = r8
            r6 = r9
            r12 = 1
            goto L_0x0159
        L_0x011c:
            boolean r19 = r15.equals(r3)     // Catch:{ all -> 0x0257 }
            if (r19 == 0) goto L_0x0146
            r19 = r6
            int r6 = r4.a((java.lang.Object) r13)     // Catch:{ all -> 0x0257 }
            if (r6 < 0) goto L_0x0148
            java.lang.Object r20 = r4.c(r6)     // Catch:{ all -> 0x0257 }
            java.lang.Long r20 = (java.lang.Long) r20     // Catch:{ all -> 0x0257 }
            long r20 = r20.longValue()     // Catch:{ all -> 0x0257 }
            int r22 = (r20 > r17 ? 1 : (r20 == r17 ? 0 : -1))
            if (r22 == 0) goto L_0x0139
            goto L_0x013b
        L_0x0139:
            r16 = 0
        L_0x013b:
            r12 = r12 | r16
            r4.d(r6)     // Catch:{ all -> 0x0257 }
            r26 = r8
            r6 = r9
            r8 = r20
            goto L_0x014e
        L_0x0146:
            r19 = r6
        L_0x0148:
            r26 = r8
            r6 = r9
            r8 = r17
        L_0x014e:
            int r8 = defpackage.bog.a(r14, r13, r8, r15)     // Catch:{ all -> 0x0257 }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x0257 }
            r10.add(r8)     // Catch:{ all -> 0x0257 }
        L_0x0159:
            int r11 = r11 + 1
            r8 = r26
            r9 = r6
            r6 = r19
            goto L_0x00e9
        L_0x0161:
            r6 = 0
        L_0x0162:
            int r8 = r4.h     // Catch:{ all -> 0x0257 }
            if (r6 >= r8) goto L_0x0185
            java.lang.Object r8 = r4.b((int) r6)     // Catch:{ all -> 0x0257 }
            java.nio.ByteBuffer r8 = (java.nio.ByteBuffer) r8     // Catch:{ all -> 0x0257 }
            java.lang.Object r9 = r4.c(r6)     // Catch:{ all -> 0x0257 }
            java.lang.Long r9 = (java.lang.Long) r9     // Catch:{ all -> 0x0257 }
            long r11 = r9.longValue()     // Catch:{ all -> 0x0257 }
            int r8 = defpackage.bog.a(r14, r8, r11, r3)     // Catch:{ all -> 0x0257 }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x0257 }
            r10.add(r8)     // Catch:{ all -> 0x0257 }
            int r6 = r6 + 1
            r12 = 1
            goto L_0x0162
        L_0x0185:
            r3 = 0
            if (r12 == 0) goto L_0x01ef
            int r4 = r10.size()     // Catch:{ all -> 0x0257 }
            int[] r6 = new int[r4]     // Catch:{ all -> 0x0257 }
            r8 = 0
        L_0x018f:
            if (r8 >= r4) goto L_0x01a0
            java.lang.Object r9 = r10.get(r8)     // Catch:{ all -> 0x0257 }
            java.lang.Integer r9 = (java.lang.Integer) r9     // Catch:{ all -> 0x0257 }
            int r9 = r9.intValue()     // Catch:{ all -> 0x0257 }
            r6[r8] = r9     // Catch:{ all -> 0x0257 }
            int r8 = r8 + 1
            goto L_0x018f
        L_0x01a0:
            if (r2 == 0) goto L_0x01ad
            boy r8 = r2.a     // Catch:{ all -> 0x0257 }
            int r8 = defpackage.bog.a((defpackage.apxe) r14, (defpackage.boy) r8)     // Catch:{ all -> 0x0257 }
            long r9 = r2.b     // Catch:{ all -> 0x0257 }
            r17 = r9
            goto L_0x01bc
        L_0x01ad:
            boy r2 = r7.w()     // Catch:{ all -> 0x0257 }
            int r2 = defpackage.bog.a((defpackage.apxe) r14, (defpackage.boy) r2)     // Catch:{ all -> 0x0257 }
            long r8 = r7.x()     // Catch:{ all -> 0x0257 }
            r17 = r8
            r8 = r2
        L_0x01bc:
            int r11 = r7.R()     // Catch:{ all -> 0x0257 }
            r14.a((int) r13, (int) r4, (int) r13)     // Catch:{ all -> 0x0257 }
            int r4 = r4 + -1
        L_0x01c5:
            if (r4 >= 0) goto L_0x01e4
            int r12 = r14.b()     // Catch:{ all -> 0x0257 }
            r10 = r14
            r13 = r8
            r2 = r14
            r7 = 0
            r14 = r17
            int r4 = defpackage.apxg.a(r10, r11, r12, r13, r14)     // Catch:{ all -> 0x0257 }
            defpackage.apxg.a((defpackage.apxe) r2, (int) r4)     // Catch:{ all -> 0x0257 }
            java.nio.ByteBuffer r2 = r2.f()     // Catch:{ all -> 0x0257 }
            r2.remaining()     // Catch:{ all -> 0x0257 }
            apxg r2 = defpackage.apxg.b((java.nio.ByteBuffer) r2)     // Catch:{ all -> 0x0257 }
            goto L_0x01f1
        L_0x01e4:
            r2 = r14
            r7 = 0
            r9 = r6[r4]     // Catch:{ all -> 0x0257 }
            r2.c(r9)     // Catch:{ all -> 0x0257 }
            int r4 = r4 + -1
            r14 = r2
            goto L_0x01c5
        L_0x01ef:
            r7 = 0
            r2 = r3
        L_0x01f1:
            if (r2 == 0) goto L_0x0223
            java.io.File r4 = r1.b     // Catch:{ all -> 0x0257 }
            java.lang.String r6 = "current_features.fb"
            java.io.File r10 = defpackage.bjx.a(r4, r6)     // Catch:{ all -> 0x0257 }
            java.io.File r4 = r1.b     // Catch:{ all -> 0x0257 }
            java.lang.String r6 = "pending_features.fb"
            java.io.File r9 = defpackage.bjx.a(r4, r6)     // Catch:{ all -> 0x0257 }
            bkp r11 = new bkp     // Catch:{ all -> 0x0257 }
            r11.<init>()     // Catch:{ all -> 0x0257 }
            java.nio.ByteBuffer r8 = r2.d     // Catch:{ all -> 0x0257 }
            r12 = 0
            r13 = 1
            java.io.FileInputStream r2 = defpackage.bkq.a(r8, r9, r10, r11, r12, r13)     // Catch:{ all -> 0x0257 }
            if (r2 == 0) goto L_0x0221
            defpackage.bma.a((java.io.Closeable) r2)     // Catch:{ all -> 0x0257 }
            android.content.Context r2 = r1.a     // Catch:{ all -> 0x0257 }
            java.lang.String r4 = r5.toString()     // Catch:{ all -> 0x0257 }
            r5 = 54
            defpackage.bla.a(r2, r5, r4)     // Catch:{ all -> 0x0257 }
            goto L_0x0223
        L_0x0221:
            monitor-exit(r23)     // Catch:{ all -> 0x0257 }
            return r7
        L_0x0223:
            monitor-exit(r23)     // Catch:{ all -> 0x0257 }
            if (r28 == 0) goto L_0x0251
            android.content.Context r2 = r1.a
            boolean r4 = r25.isEmpty()
            if (r4 != 0) goto L_0x0244
            bod r3 = defpackage.bod.b
            aucd r3 = r3.o()
            r4 = r25
            r3.i((java.lang.Iterable) r4)
            aucj r3 = r3.i()
            bod r3 = (defpackage.bod) r3
            byte[] r3 = r3.k()
            goto L_0x0245
        L_0x0244:
        L_0x0245:
            r4 = r30
            android.content.Intent r0 = defpackage.ble.a(r2, r3, r0, r4)
            android.content.Context r2 = r1.a
            r2.startService(r0)
            goto L_0x0256
        L_0x0251:
            if (r0 == 0) goto L_0x0256
            defpackage.bpx.a((defpackage.boj) r0, (int) r7)
        L_0x0256:
            return r16
        L_0x0257:
            r0 = move-exception
            monitor-exit(r23)     // Catch:{ all -> 0x0257 }
            goto L_0x025b
        L_0x025a:
            throw r0
        L_0x025b:
            goto L_0x025a
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.blg.a(java.lang.String, java.util.Collection, java.util.Collection, boolean, boolean, boj, java.lang.String, blf):boolean");
    }
}
