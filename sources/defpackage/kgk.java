package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.internal.LoadRealtimeRequest;
import java.util.EnumSet;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: kgk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class kgk extends key {
    public static final ith f = new ith("LoadRealtimeOperation", "");
    public final kef g;
    public final LoadRealtimeRequest h;
    public final lsm i;
    public final lni j;
    private final int k;
    private final ljy l;

    public kgk(kec kec, kef kef, LoadRealtimeRequest loadRealtimeRequest, kwg kwg, int i2) {
        super("LoadRealtimeOperation", kec, kwg);
        this.g = kef;
        this.h = loadRealtimeRequest;
        this.k = i2;
        lsm lsm = kec.c;
        this.i = lsm;
        lni a = lni.a(lsm.b, lsm);
        this.j = a;
        this.l = a.c;
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0072  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void a(defpackage.ljt r23, defpackage.alpg r24, defpackage.ljw r25) {
        /*
            r22 = this;
            r1 = r22
            r8 = r23
            r7 = r25
            lni r0 = r1.j
            ljr r0 = r0.e
            boolean r0 = r0.c(r8)
            r2 = 10
            r3 = 0
            if (r0 == 0) goto L_0x001e
            com.google.android.gms.common.api.Status r0 = new com.google.android.gms.common.api.Status
            java.lang.String r4 = "This document is already opened. Documents may not be opened more than once."
            r0.<init>(r2, r4, r3)
            r7.a(r0)
            return
        L_0x001e:
            com.google.android.gms.drive.internal.LoadRealtimeRequest r0 = r1.h
            com.google.android.gms.common.data.DataHolder r0 = r0.d
            r4 = 0
            if (r0 == 0) goto L_0x0043
            lmw r5 = new lmw
            r5.<init>(r0)
            int r0 = r5.a()     // Catch:{ all -> 0x003e }
            if (r0 <= 0) goto L_0x003a
            java.lang.Object r0 = r5.a(r4)     // Catch:{ all -> 0x003e }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x003e }
            r5.c()
            goto L_0x0045
        L_0x003a:
            r5.c()
            goto L_0x0044
        L_0x003e:
            r0 = move-exception
            r5.c()
            throw r0
        L_0x0043:
        L_0x0044:
            r0 = r3
        L_0x0045:
            ljy r5 = r1.l
            com.google.android.gms.drive.internal.LoadRealtimeRequest r6 = r1.h
            boolean r9 = r6.b
            r10 = 1
            if (r9 != 0) goto L_0x0054
            boolean r6 = r6.c
            if (r6 != 0) goto L_0x0054
            r6 = 0
            goto L_0x0055
        L_0x0054:
            r6 = 1
        L_0x0055:
            int r9 = r1.k
            agvx r11 = defpackage.jzq.aq
            java.lang.Object r11 = r11.c()
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r11 = r11.intValue()
            r12 = 13
            if (r9 >= r11) goto L_0x0072
            com.google.android.gms.common.api.Status r0 = new com.google.android.gms.common.api.Status
            java.lang.String r2 = "Client version is no longer supported, update to a more recent version."
            r0.<init>(r12, r2, r3)
            r7.a(r0)
            return
        L_0x0072:
            int r11 = r5.g
            agvx r13 = defpackage.jzq.ar
            java.lang.Object r13 = r13.c()
            java.lang.Integer r13 = (java.lang.Integer) r13
            int r13 = r13.intValue()
            if (r11 >= r13) goto L_0x008d
            com.google.android.gms.common.api.Status r0 = new com.google.android.gms.common.api.Status
            java.lang.String r2 = "The installed version of Google Play Services is out of date and cannotopen this document. Update to a more recent version."
            r0.<init>(r12, r2, r3)
            r7.a(r0)
            return
        L_0x008d:
            ith r11 = defpackage.ljy.a
            java.lang.Object[] r12 = new java.lang.Object[r10]
            r12[r4] = r8
            java.lang.String r13 = "Loading file %s"
            r11.a((java.lang.String) r13, (java.lang.Object[]) r12)
            alrh r11 = new alrh
            java.util.concurrent.ScheduledExecutorService r12 = defpackage.ljy.b
            r11.<init>(r12)
            khq r12 = r8.c
            if (r12 == 0) goto L_0x00b0
            android.content.Context r13 = r5.d
            com.google.android.gms.common.internal.ClientContext r12 = r12.a((android.content.Context) r13)
            int r12 = r12.b
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            goto L_0x00b1
        L_0x00b0:
            r12 = r3
        L_0x00b1:
            ljz r13 = new ljz
            r14 = 2147483647(0x7fffffff, float:NaN)
            r13.<init>(r14, r12)
            aloz r12 = new aloz
            agvx r14 = defpackage.jzq.at
            java.lang.Object r14 = r14.c()
            r15 = r14
            java.lang.String r15 = (java.lang.String) r15
            java.lang.String r17 = java.lang.Integer.toString(r9)
            ljx r9 = new ljx
            r9.<init>(r7)
            alrc r14 = new alrc
            r14.<init>(r13)
            java.lang.String r16 = "android"
            r13 = r14
            r14 = r12
            r18 = r24
            r19 = r9
            r20 = r13
            r21 = r11
            r14.<init>(r15, r16, r17, r18, r19, r20, r21)
            if (r0 == 0) goto L_0x00e5
            goto L_0x018b
        L_0x00e5:
            if (r6 != 0) goto L_0x018b
            lkm r0 = r5.e
            lkk r6 = r0.a(r8, r10)
            boolean r0 = r6.a()
            java.lang.String r2 = "RealtimeLoader"
            if (r0 == 0) goto L_0x012e
            ith r0 = defpackage.ljy.a
            java.lang.String r9 = "Loading document from cache."
            r0.b(r9)
            alns r0 = r6.b()     // Catch:{ Exception -> 0x011e }
            aloo r9 = defpackage.ljy.c     // Catch:{ Exception -> 0x011e }
            alny r0 = defpackage.alny.a(r12, r0, r9)     // Catch:{ Exception -> 0x011e }
            kpf r9 = r6.a     // Catch:{ Exception -> 0x011e }
            java.lang.String r9 = r9.d     // Catch:{ Exception -> 0x011e }
            if (r9 == 0) goto L_0x011a
            ith r11 = defpackage.ljy.a     // Catch:{ Exception -> 0x011e }
            java.lang.Object[] r13 = new java.lang.Object[r10]     // Catch:{ Exception -> 0x011e }
            r13[r4] = r9     // Catch:{ Exception -> 0x011e }
            java.lang.String r14 = "Attached Realtime document to Drive ID: %s"
            r11.a((java.lang.String) r2, (java.lang.String) r14, (java.lang.Object[]) r13)     // Catch:{ Exception -> 0x011e }
            r0.a(r9)     // Catch:{ Exception -> 0x011e }
        L_0x011a:
            r7.a(r6, r0, r8)     // Catch:{ Exception -> 0x011e }
            return
        L_0x011e:
            r0 = move-exception
            ith r9 = defpackage.ljy.a
            java.lang.Object[] r10 = new java.lang.Object[r10]
            r10[r4] = r8
            java.lang.String r4 = "Unable to load %s from cache; trying network..."
            java.lang.String r4 = java.lang.String.format(r4, r10)
            r9.b((java.lang.String) r2, (java.lang.String) r4, (java.lang.Throwable) r0)
        L_0x012e:
            com.google.android.gms.drive.DriveId r0 = r8.a
            if (r0 != 0) goto L_0x0161
            ith r0 = defpackage.ljy.a
            java.lang.String r4 = "Creating new empty offline document."
            r0.b(r4)
            alrs r3 = r5.a(r3)     // Catch:{ alry -> 0x013e }
            goto L_0x0147
        L_0x013e:
            r0 = move-exception
            r4 = r0
            ith r0 = defpackage.ljy.a
            java.lang.String r9 = "JSON error while parsing null json."
            r0.c(r2, r9, r4)
        L_0x0147:
            lkf r0 = new lkf
            lkg r2 = r5.f
            r0.<init>(r6, r2, r3)
            android.content.Context r2 = r5.d
            r0.a((android.content.Context) r2)
            alns r0 = defpackage.alns.a(r3)
            aloo r2 = defpackage.ljy.c
            alny r0 = defpackage.alny.a(r12, r0, r2)
            r7.a(r6, r0, r8)
            return
        L_0x0161:
            lgy r0 = r5.h
            boolean r0 = r0.a()
            if (r0 == 0) goto L_0x017f
            com.google.android.gms.drive.DriveId r0 = r8.a
            java.lang.String r0 = r0.a
            ljv r9 = new ljv
            r2 = r9
            r3 = r5
            r4 = r6
            r5 = r12
            r6 = r0
            r7 = r25
            r8 = r23
            r2.<init>(r3, r4, r5, r6, r7, r8)
            r12.a((java.lang.String) r0, (defpackage.alpi) r9)
            return
        L_0x017f:
            com.google.android.gms.common.api.Status r0 = new com.google.android.gms.common.api.Status
            r2 = 7
            java.lang.String r4 = "Realtime document is not available offline."
            r0.<init>(r2, r4, r3)
            r7.a(r0)
            return
        L_0x018b:
            ith r4 = defpackage.ljy.a
            java.lang.String r6 = "Creating empty in-memory document."
            r4.b(r6)
            alrs r0 = r5.a(r0)     // Catch:{ alry -> 0x01a4 }
            alns r0 = defpackage.alns.a(r0)     // Catch:{ alry -> 0x01a4 }
            aloo r4 = defpackage.ljy.c     // Catch:{ alry -> 0x01a4 }
            alny r0 = defpackage.alny.a(r12, r0, r4)     // Catch:{ alry -> 0x01a4 }
            r7.a(r3, r0, r8)     // Catch:{ alry -> 0x01a4 }
            return
        L_0x01a4:
            r0 = move-exception
            com.google.android.gms.common.api.Status r0 = new com.google.android.gms.common.api.Status
            java.lang.String r3 = "The provided JSON string is not formatted correctly and cannot be parsed."
            r0.<init>(r2, r3)
            r7.a(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kgk.a(ljt, alpg, ljw):void");
    }

    public final void b(Context context) {
        ljt ljt;
        khq b = b();
        ljp ljp = new ljp(context, b);
        LoadRealtimeRequest loadRealtimeRequest = this.h;
        DriveId driveId = loadRealtimeRequest.a;
        if (driveId != null) {
            ljt = new ljt(driveId, b);
        } else {
            String str = loadRealtimeRequest.e;
            if (str != null) {
                ljt = new ljt(str, b);
            } else {
                throw new IllegalArgumentException("One of drive ID or local ID is required.");
            }
        }
        kgi kgi = new kgi(this, ljt);
        DriveId driveId2 = this.h.a;
        if (driveId2 != null) {
            if (driveId2.a != null) {
                a(ljt, ljp, kgi);
                return;
            } else if (a(ljp, kgi)) {
                return;
            }
        }
        LoadRealtimeRequest loadRealtimeRequest2 = this.h;
        if (loadRealtimeRequest2.a == null && loadRealtimeRequest2.e != null) {
            a(ljt, ljp, kgi);
        } else if (!this.i.G.a()) {
            a(new Status(7, "getRealtimeDocument requires an active network connection.", (PendingIntent) null));
        } else {
            CountDownLatch countDownLatch = new CountDownLatch(1);
            kgj kgj = new kgj(this, countDownLatch);
            this.a.l.a(this.h.a, 0, (kwj) kgj);
            try {
                countDownLatch.await(10, TimeUnit.SECONDS);
            } catch (InterruptedException e) {
            }
            this.a.l.a(this.h.a, (kwj) kgj);
            if (!a(ljp, kgi)) {
                a(new Status(7, "getRealtimeDocument requires an active network connection.", (PendingIntent) null));
            }
        }
    }

    private final boolean a(alpg alpg, ljw ljw) {
        DriveId g2 = this.a.b(this.h.a).g();
        if (g2.a == null) {
            return false;
        }
        a(new ljt(g2, b()), alpg, ljw);
        return true;
    }

    public final Set a() {
        return EnumSet.of(jzl.FULL, jzl.FILE, jzl.APPDATA);
    }
}
