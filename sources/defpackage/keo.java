package defpackage;

import android.app.PendingIntent;
import android.content.IntentFilter;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.api.ApiChimeraService;
import com.google.android.gms.drive.api.RealtimeService$PauseCommunicationReceiver;
import com.google.android.gms.drive.realtime.internal.BeginCompoundOperationRequest;
import com.google.android.gms.drive.realtime.internal.ParcelableCollaborator;
import com.google.android.gms.drive.realtime.internal.ParcelableIndexReference;
import com.google.android.gms.drive.realtime.internal.event.ParcelableEventList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: keo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class keo extends lml implements IBinder.DeathRecipient, alsf, alom, niz {
    public static final ith a = new ith("RealtimeService", "");
    public final nix b;
    public final kec c;
    public final alny d;
    public final ljt e;
    public final lkk f;
    public final ExecutorService g;
    public boolean h = true;
    public final Runnable i = new kek(this);
    public final Runnable j = new kel(this);
    public final lgy k;
    public lmg l;
    private final ApiChimeraService m;
    private IBinder n;
    private final alsg o;
    private final lsm p;
    private final lni q;
    private boolean r;
    private boolean s = false;
    private final RealtimeService$PauseCommunicationReceiver t = new RealtimeService$PauseCommunicationReceiver(this);
    private final AtomicBoolean u = new AtomicBoolean(false);
    private int v = 0;
    private lmj w;
    private lmf x;

    public keo(ApiChimeraService apiChimeraService, nix nix, kec kec, alny alny, IBinder iBinder, ljt ljt, lkk lkk) {
        Integer num;
        this.m = apiChimeraService;
        this.b = nix;
        this.c = kec;
        this.n = iBinder;
        this.d = alny;
        this.o = alny.d;
        lsm lsm = kec.c;
        this.p = lsm;
        this.q = lni.a(lsm.b, lsm);
        this.e = ljt;
        lsm lsm2 = this.p;
        this.k = lsm2.G;
        this.f = lkk;
        khq khq = this.e.c;
        if (khq != null) {
            num = Integer.valueOf(khq.a(lsm2.b).b);
        } else {
            num = null;
        }
        this.g = new ljz(1, num);
        IntentFilter intentFilter = new IntentFilter("android.intent.action.SCREEN_ON");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        iBinder.linkToDeath(this, 0);
        this.m.registerReceiver(this.t, intentFilter);
        this.d.c.a((alom) this);
        alny alny2 = this.d;
        ((alul) alny2.d).d = this;
        if (!alny2.b()) {
            this.d.b.a(new ken(this));
        }
        if (this.k.a()) {
            ((jfz) this.g).submit(this.j);
        }
    }

    private final alsj a(String str) {
        return (alsj) ((alul) this.o).a(str);
    }

    private final alsl b(String str) {
        return (alsl) ((alul) this.o).a(str);
    }

    private final alsi c(String str) {
        return (alsi) ((alul) this.o).a(str);
    }

    private final alsp d(String str) {
        return (alsp) ((alul) this.o).a(str);
    }

    private final alsj e(String str) {
        return (alsj) ((alul) this.o).a(str);
    }

    public final void a(lmf lmf) {
        this.x = lmf;
    }

    public final void a(lmg lmg) {
        this.l = lmg;
    }

    public final void binderDied() {
        a();
    }

    public static ParcelableCollaborator a(alxk alxk) {
        return new ParcelableCollaborator(alxk.f, alxk.e, alxk.a, alxk.b, alxk.c, alxk.d, alxk.g);
    }

    private final void b() {
        lmj lmj = this.w;
        if (lmj != null) {
            try {
                lmj.a(0);
            } catch (RemoteException e2) {
                throw new RuntimeException(e2);
            }
        } else {
            this.r = true;
        }
    }

    private final void c() {
        if (this.v == 0) {
            ((alul) this.o).c.a(true);
        }
    }

    public final void d(lma lma) {
        boolean z;
        if (this.d.b.b == alyv.READ_ONLY) {
            z = true;
        } else {
            z = false;
        }
        lma.a(z);
    }

    public final void e(lma lma) {
        lma.a(!this.d.b());
    }

    private final List a(DataHolder dataHolder) {
        llw<amjf> llw = new llw(this.o, dataHolder);
        ArrayList arrayList = new ArrayList(dataHolder.h);
        for (amjf add : llw) {
            arrayList.add(add);
        }
        llw.c();
        return arrayList;
    }

    public final void c(String str, lmj lmj) {
        lmj.a(c(str).a());
    }

    public final void e(lmo lmo) {
        lmo.b();
    }

    public final void b(String str, String str2, lmd lmd) {
        DataHolder a2 = llt.a(this.o, Collections.singletonList(e(str).b(str2)));
        try {
            lmd.a(a2);
        } finally {
            a2.close();
        }
    }

    public final void c(lma lma) {
        lma.a(((alul) this.d.d).c.b());
    }

    private final void a(alse alse, DataHolder dataHolder, lme lme) {
        c();
        ljs ljs = new ljs(this.o);
        ljs.a(alse);
        ParcelableEventList a2 = ljs.a();
        try {
            Parcel aQ = lme.aQ();
            bhx.a(aQ, (Parcelable) dataHolder);
            bhx.a(aQ, (Parcelable) a2);
            lme.b(1, aQ);
        } finally {
            a(a2);
            dataHolder.close();
        }
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(defpackage.lmh r14) {
        /*
            r13 = this;
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ Exception -> 0x00a2 }
            r3.<init>()     // Catch:{ Exception -> 0x00a2 }
            alny r0 = r13.d     // Catch:{ Exception -> 0x00a2 }
            alop r8 = r0.c     // Catch:{ Exception -> 0x00a2 }
            long r0 = android.os.SystemClock.elapsedRealtime()     // Catch:{ Exception -> 0x00a2 }
            r4 = 5
            long r0 = r0 + r4
            ljs r9 = new ljs     // Catch:{ Exception -> 0x00a2 }
            alsg r2 = r13.o     // Catch:{ Exception -> 0x00a2 }
            r9.<init>(r2)     // Catch:{ Exception -> 0x00a2 }
            r2 = 0
            r4 = 0
        L_0x0019:
            boolean r5 = r8.c()     // Catch:{ Exception -> 0x00a2 }
            r6 = 1
            if (r5 == 0) goto L_0x0048
            int r4 = r4 + 1
            alse r5 = r8.b()     // Catch:{ Exception -> 0x00a2 }
            amiw r7 = r5.g     // Catch:{ Exception -> 0x00a2 }
            if (r7 != 0) goto L_0x002b
            goto L_0x002e
        L_0x002b:
            r3.add(r7)     // Catch:{ Exception -> 0x00a2 }
        L_0x002e:
            r9.a((defpackage.alse) r5)     // Catch:{ Exception -> 0x00a2 }
            long r10 = android.os.SystemClock.elapsedRealtime()     // Catch:{ Exception -> 0x00a2 }
            int r5 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r5 <= 0) goto L_0x0019
            ith r0 = a     // Catch:{ Exception -> 0x00a2 }
            java.lang.Object[] r1 = new java.lang.Object[r6]     // Catch:{ Exception -> 0x00a2 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)     // Catch:{ Exception -> 0x00a2 }
            r1[r2] = r5     // Catch:{ Exception -> 0x00a2 }
            java.lang.String r5 = "Returning to UI thread after applying %d changes (time limit exceeded)."
            r0.a((java.lang.String) r5, (java.lang.Object[]) r1)     // Catch:{ Exception -> 0x00a2 }
        L_0x0048:
            if (r4 <= 0) goto L_0x007e
            lkk r0 = r13.f     // Catch:{ Exception -> 0x00a2 }
            if (r0 == 0) goto L_0x007e
            alny r0 = r13.d     // Catch:{ Exception -> 0x00a2 }
            alsg r0 = r0.d     // Catch:{ Exception -> 0x00a2 }
            alul r0 = (defpackage.alul) r0     // Catch:{ Exception -> 0x00a2 }
            alsu r7 = r0.c     // Catch:{ Exception -> 0x00a2 }
            boolean r0 = r8.c()     // Catch:{ Exception -> 0x00a2 }
            if (r0 != 0) goto L_0x0064
            boolean r0 = r8.f()     // Catch:{ Exception -> 0x00a2 }
            if (r0 != 0) goto L_0x0064
            r10 = 0
            goto L_0x0065
        L_0x0064:
            r10 = 1
        L_0x0065:
            nix r11 = r13.b     // Catch:{ Exception -> 0x00a2 }
            lkv r12 = new lkv     // Catch:{ Exception -> 0x00a2 }
            lkk r1 = r13.f     // Catch:{ Exception -> 0x00a2 }
            lni r0 = r13.q     // Catch:{ Exception -> 0x00a2 }
            lkg r2 = r0.b     // Catch:{ Exception -> 0x00a2 }
            alrt r4 = r8.g()     // Catch:{ Exception -> 0x00a2 }
            alsw r5 = defpackage.alsw.b     // Catch:{ Exception -> 0x00a2 }
            r0 = r12
            r6 = r7
            r7 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ Exception -> 0x00a2 }
            r11.a(r12)     // Catch:{ Exception -> 0x00a2 }
        L_0x007e:
            alny r0 = r13.d     // Catch:{ Exception -> 0x00a2 }
            alop r0 = r0.c     // Catch:{ Exception -> 0x00a2 }
            boolean r0 = r0.f()     // Catch:{ Exception -> 0x00a2 }
            r13.a((boolean) r0)     // Catch:{ Exception -> 0x00a2 }
            com.google.android.gms.drive.realtime.internal.event.ParcelableEventList r0 = r9.a()     // Catch:{ Exception -> 0x00a2 }
            r14.a(r0)     // Catch:{ all -> 0x009d }
            a((com.google.android.gms.drive.realtime.internal.event.ParcelableEventList) r0)     // Catch:{ Exception -> 0x00a2 }
            boolean r14 = r8.c()     // Catch:{ Exception -> 0x00a2 }
            if (r14 == 0) goto L_0x009c
            r13.b()     // Catch:{ Exception -> 0x00a2 }
        L_0x009c:
            return
        L_0x009d:
            r14 = move-exception
            a((com.google.android.gms.drive.realtime.internal.event.ParcelableEventList) r0)     // Catch:{ Exception -> 0x00a2 }
            throw r14     // Catch:{ Exception -> 0x00a2 }
        L_0x00a2:
            r14 = move-exception
            ith r0 = a
            java.lang.String r1 = "Package-side exception caught in apply changes."
            r0.c(r1)
            goto L_0x00ac
        L_0x00ab:
            throw r14
        L_0x00ac:
            goto L_0x00ab
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.keo.c(lmh):void");
    }

    public final void d(lmh lmh) {
        a(this.o.a(), lmh);
    }

    public final void d(lmo lmo) {
        this.o.a();
        lmo.b();
    }

    private final void a(alse alse, lmh lmh) {
        c();
        ljs ljs = new ljs(this.o);
        ljs.a(alse);
        ParcelableEventList a2 = ljs.a();
        try {
            lmh.a(a2);
        } finally {
            a(a2);
        }
    }

    public final void b(String str, lmd lmd) {
        DataHolder a2 = llt.a(this.o, c(str).b());
        try {
            lmd.a(a2);
        } finally {
            a2.close();
        }
    }

    private static void a(ParcelableEventList parcelableEventList) {
        DataHolder dataHolder = parcelableEventList.b;
        if (dataHolder != null) {
            dataHolder.close();
        }
    }

    public final void b(String str, lmj lmj) {
        lmj.a(b(str).a());
    }

    private final void a(boolean z) {
        if (this.s != z) {
            this.s = z;
            lmf lmf = this.x;
            if (lmf != null) {
                try {
                    Parcel aQ = lmf.aQ();
                    bhx.a(aQ, z);
                    bhx.a(aQ, z);
                    lmf.b(1, aQ);
                } catch (RemoteException e2) {
                }
            }
        }
    }

    public final void b(String str, lmn lmn) {
        lmn.a(b(str).toString());
    }

    public final void b(lma lma) {
        lma.a(((alul) this.d.d).c.a());
    }

    public final ParcelableEventList a(String str, String str2, String str3) {
        alse a2 = a(str).a(str2, aluw.a((amic) new alze(str3).a((alzf) alsd.a)));
        c();
        ljs ljs = new ljs(this.o);
        ljs.a(a2, false);
        ParcelableEventList a3 = ljs.a();
        DataHolder dataHolder = a3.b;
        if (dataHolder != null) {
            dataHolder.j = false;
        }
        return a3;
    }

    public final void b(lmh lmh) {
        alus alus = (alus) ((alul) this.d.d).c;
        if (alus.b()) {
            alus.e.add(alsv.POP_REDO);
            a(alus.a.a((amiw) alus.c.pop(), alss.f), lmh);
            return;
        }
        throw new altf("Redo stack is empty.");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0052, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void a() {
        /*
            r5 = this;
            monitor-enter(r5)
            java.util.concurrent.atomic.AtomicBoolean r0 = r5.u     // Catch:{ all -> 0x0053 }
            r1 = 1
            r2 = 0
            boolean r0 = r0.compareAndSet(r2, r1)     // Catch:{ all -> 0x0053 }
            if (r0 == 0) goto L_0x0051
            lni r0 = r5.q     // Catch:{ Exception -> 0x0045 }
            ljr r0 = r0.e     // Catch:{ Exception -> 0x0045 }
            ljt r3 = r5.e     // Catch:{ Exception -> 0x0045 }
            r0.b(r3)     // Catch:{ Exception -> 0x0045 }
            com.google.android.gms.drive.api.ApiChimeraService r0 = r5.m     // Catch:{ Exception -> 0x0045 }
            com.google.android.gms.drive.api.RealtimeService$PauseCommunicationReceiver r3 = r5.t     // Catch:{ Exception -> 0x0045 }
            r0.unregisterReceiver(r3)     // Catch:{ Exception -> 0x0045 }
            kec r0 = r5.c     // Catch:{ Exception -> 0x0045 }
            r0.i()     // Catch:{ Exception -> 0x0045 }
            android.os.IBinder r0 = r5.n     // Catch:{ Exception -> 0x0045 }
            if (r0 != 0) goto L_0x0025
            goto L_0x002c
        L_0x0025:
            r0.unlinkToDeath(r5, r2)     // Catch:{ Exception -> 0x0045 }
            r0 = 0
            r5.n = r0     // Catch:{ Exception -> 0x0045 }
        L_0x002c:
            alny r0 = r5.d     // Catch:{ Exception -> 0x0045 }
            r0.a()     // Catch:{ Exception -> 0x0045 }
            lkk r0 = r5.f     // Catch:{ Exception -> 0x0045 }
            if (r0 == 0) goto L_0x0051
            nix r2 = r5.b     // Catch:{ Exception -> 0x0045 }
            lkd r3 = new lkd     // Catch:{ Exception -> 0x0045 }
            lsm r4 = r5.p     // Catch:{ Exception -> 0x0045 }
            lku r4 = r4.w     // Catch:{ Exception -> 0x0045 }
            r3.<init>(r0, r4, r1)     // Catch:{ Exception -> 0x0045 }
            r2.a(r3)     // Catch:{ Exception -> 0x0045 }
            monitor-exit(r5)
            return
        L_0x0045:
            r0 = move-exception
            ith r1 = a     // Catch:{ all -> 0x0053 }
            java.lang.String r2 = "RealtimeService"
            java.lang.String r3 = "Failed to close the document properly."
            r1.c(r2, r3, r0)     // Catch:{ all -> 0x0053 }
            monitor-exit(r5)
            return
        L_0x0051:
            monitor-exit(r5)
            return
        L_0x0053:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.keo.a():void");
    }

    public final void b(lmj lmj) {
        this.w = lmj;
        if (this.r) {
            b();
            this.r = false;
        }
    }

    public final void b(lmo lmo) {
        a();
        lmo.b();
    }

    public final void a(int i2, lmo lmo) {
        this.v = i2;
        boolean z = true;
        if (i2 == 0) {
            ((alul) this.d.d).c.a(true);
        }
        if (this.v != 2) {
            z = false;
        }
        ((alus) ((alul) this.d.d).c).f = z;
        lmo.b();
    }

    public final void c(lmo lmo) {
        a();
        this.q.a.a(Arrays.asList(new ljt[]{this.e}));
        try {
            lmo.b();
        } catch (RemoteException e2) {
        }
    }

    public final void a(alop alop) {
        b();
    }

    public final void a(alse alse) {
        amiw amiw = alse.f;
        if (amiw != null) {
            alrr a2 = this.d.c.a(amiw);
            lkk lkk = this.f;
            if (lkk != null) {
                lkk.c();
                this.b.a(new lkh(this.f, this.q.b, a2, alse.e, ((alul) this.d.d).c));
            }
        }
        a(this.d.c.f());
    }

    public final void a(DriveId driveId, lmo lmo) {
        try {
            if (this.q.a.a(new ljt(driveId, this.c.e()))) {
                try {
                    lmo.a(new Status(1501, "Online document already in local cache.", (PendingIntent) null));
                } catch (RemoteException e2) {
                }
            }
            this.d.a(driveId.a);
            this.d.c.a((alom) this);
            lkk lkk = this.f;
            String str = driveId.a;
            kpf kpf = lkk.a;
            kpf.d = str;
            kpf.t();
            if (this.k.a()) {
                this.d.d();
                this.h = false;
            }
            try {
                lmo.b();
            } catch (RemoteException e3) {
            }
        } catch (nja e4) {
            try {
                lmo.a(new Status(8, "Authorization revoked, reconnect Drive API client.", (PendingIntent) null));
            } catch (RemoteException e5) {
            }
        }
    }

    public final void a(BeginCompoundOperationRequest beginCompoundOperationRequest, lmo lmo) {
        if (beginCompoundOperationRequest.a) {
            ((alul) this.o).a("", altz.CREATION);
        } else {
            ((alul) this.o).a(beginCompoundOperationRequest.b, !beginCompoundOperationRequest.c ? altz.NORMAL_NO_UNDO : altz.NORMAL);
        }
        lmo.b();
    }

    public final void a(ParcelableIndexReference parcelableIndexReference, lmn lmn) {
        int i2;
        alul alul = (alul) this.o;
        altx b2 = alul.a(parcelableIndexReference.a);
        int i3 = parcelableIndexReference.b;
        int i4 = parcelableIndexReference.d;
        if (i4 == -1) {
            i2 = !parcelableIndexReference.c ? 1 : 3;
        } else {
            i2 = ljq.b(i4);
        }
        amii a2 = amii.a(ljq.a(i2));
        String b3 = alul.b.b();
        amiw a3 = aluv.a(b3, aluv.d);
        amio b4 = amip.b();
        b4.a = b2.d();
        b4.b = i3;
        b4.c = a2;
        amip a4 = b4.a();
        amid b5 = amie.b();
        b5.a(a3);
        b5.a(aluv.a(b3, a4));
        alul.a(aluv.a(b5), alss.d);
        lmn.a(((alsp) new alsm((alsp) alul.b.a(b3)).a).d());
    }

    public final void a(String str, int i2, int i3, lme lme) {
        alsi c2 = c(str);
        int i4 = i3 + i2;
        a(c2.a(i2, i4), llt.a(this.o, c2.b().subList(i2, i4)), lme);
    }

    public final void a(String str, int i2, int i3, lmh lmh) {
        a(b(str).a(i2, i3), lmh);
    }

    public final void a(String str, int i2, DataHolder dataHolder, lme lme) {
        int a2 = new llw(this.o, dataHolder).a();
        alsi c2 = c(str);
        a(c2.a(i2, a(dataHolder)), llt.a(this.o, c2.b().subList(i2, a2 + i2)), lme);
    }

    public final void a(String str, int i2, DataHolder dataHolder, lmh lmh) {
        a(c(str).a(i2, (Collection) a(dataHolder)), lmh);
    }

    public final void a(String str, int i2, String str2, int i3, lmh lmh) {
        a(c(str).a(i2, c(str2), i3), lmh);
    }

    public final void a(String str, int i2, String str2, lmh lmh) {
        a(b(str).a(i2, str2), lmh);
    }

    public final void a(String str, int i2, lmn lmn) {
        try {
            alxh alxh = new alxh(this.o);
            if (str != null) {
                alxh.c.c();
                alxh.c.a("appId");
                alxh.c.b(str);
                alxh.c.a("revision");
                alxh.c.a(i2);
                alxh.c.a("data");
            }
            alxh.a((alsk) alxh.a.c());
            if (str != null) {
                alxh.c.d();
            }
            lmn.a(alxh.b.toString());
        } catch (alry e2) {
            a.c("RealtimeService", "Failed to encode the model.", e2);
        }
    }

    public final void a(String str, int i2, lmo lmo) {
        d(str).a(i2);
        lmo.b();
    }

    public final void a(String str, DataHolder dataHolder, lmh lmh) {
        llx llx = new llx(this.o, dataHolder);
        HashMap hashMap = new HashMap(dataHolder.h);
        for (int i2 = 0; i2 < dataHolder.h; i2++) {
            hashMap.put(llx.a.c("key", i2, llx.a.a(i2)), llx.a(i2));
        }
        llx.c();
        a(a(str).a((Map) hashMap), lmh);
    }

    public final void a(String str, String str2, DataHolder dataHolder, lmh lmh) {
        alsj e2 = e(str);
        lls lls = new lls(this.o, dataHolder);
        amjf b2 = lls.a(0);
        lls.c();
        a(e2.a(str2, b2), lmh);
    }

    public final void a(String str, String str2, lmd lmd) {
        DataHolder a2 = llt.a(this.o, Collections.singletonList(a(str).b(str2)));
        try {
            lmd.a(a2);
        } finally {
            a2.close();
        }
    }

    public final void a(String str, String str2, lme lme) {
        alsj a2 = a(str);
        a(a2.a(str2), llt.a(this.o, Collections.singletonList(a2.b(str2))), lme);
    }

    public final void a(String str, String str2, lmh lmh) {
        a(b(str).a(str2), lmh);
    }

    public final void a(String str, lmd lmd) {
        alsg alsg = this.o;
        DataHolder a2 = new llv(alsg).a((Iterable) a(str).c());
        try {
            lmd.a(a2);
        } finally {
            a2.close();
        }
    }

    public final void a(String str, lmh lmh) {
        a(a(str).b(), lmh);
    }

    public final void a(String str, lmi lmi) {
        boolean z;
        alsp d2 = d(str);
        String a2 = d2.a();
        int b2 = d2.b();
        int b3 = ljq.b(d2.n().e);
        if (b3 == 3) {
            z = true;
        } else {
            z = false;
        }
        ParcelableIndexReference parcelableIndexReference = new ParcelableIndexReference(a2, b2, z, ljq.a(b3));
        Parcel aQ = lmi.aQ();
        bhx.a(aQ, (Parcelable) parcelableIndexReference);
        lmi.b(1, aQ);
    }

    public final void a(String str, lmj lmj) {
        lmj.a(a(str).a());
    }

    public final void a(String str, lmn lmn) {
        alul alul = (alul) this.o;
        lmn.a(alul.a(aluv.a(str), alul.b.b()).a.d());
    }

    public final void a(String str, lmo lmo) {
        ((alul) this.o).a(str).m();
        lmo.b();
    }

    public final void a(lma lma) {
        lma.a(this.o.b());
    }

    public final void a(lmb lmb) {
        if (!this.d.b()) {
            this.d.a.b = new kem(lmb);
        }
    }

    public final void a(lmc lmc) {
        Collection<alxk> collection;
        if (this.d.b()) {
            collection = Collections.emptyList();
        } else {
            collection = this.d.a.a();
        }
        ParcelableCollaborator[] parcelableCollaboratorArr = new ParcelableCollaborator[collection.size()];
        int i2 = 0;
        for (alxk a2 : collection) {
            parcelableCollaboratorArr[i2] = a(a2);
            i2++;
        }
        Parcel aQ = lmc.aQ();
        aQ.writeTypedArray(parcelableCollaboratorArr, 0);
        lmc.b(1, aQ);
    }

    public final void a(lmh lmh) {
        amiw amiw;
        alus alus = (alus) ((alul) this.d.d).c;
        if (alus.a()) {
            if (!alus.d.isEmpty()) {
                amiw = aluv.a((List) alus.d);
                alus.d.clear();
                alus.e.add(alsv.REFRESH_PENDING_BATCH);
            } else {
                alus.e.add(alsv.POP_UNDO);
                amiw = (amiw) alus.b.pop();
            }
            a(alus.a.a(amiw, alss.e), lmh);
            return;
        }
        throw new altf("Undo stack is empty.");
    }

    public final void a(lmj lmj) {
        lmj.a(((alul) this.o).b.f);
    }

    public final void a(lmo lmo) {
        alul alul = (alul) this.o;
        if (!alul.b() && alul.a) {
            alul.a(aluv.a, "root");
        }
        lmo.b();
    }

    public final void a(boolean z, lmo lmo) {
        ((alul) this.d.d).c.a(z);
        lmo.b();
    }
}
