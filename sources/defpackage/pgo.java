package defpackage;

import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.os.TransactionTooLargeException;
import com.google.android.gms.mdh.MdhFootprint;
import com.google.android.gms.mdh.SyncStatus;
import com.google.android.gms.mdh.TimeSeriesFootprintsSubscriptionFilter;
import com.google.android.gms.mdh.internal.MdhFootprintListSafeParcelable;
import java.util.ArrayDeque;
import java.util.Queue;

/* renamed from: pgo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class pgo extends ift {
    final /* synthetic */ pgr a;
    public final saw b;
    private final pgp c;
    private final Queue d = new ArrayDeque();
    private boolean e = false;

    public pgo(pgr pgr, pgp pgp, saw saw) {
        this.a = pgr;
        this.c = pgp;
        this.b = saw;
    }

    private final boolean b(pgq pgq) {
        int i = 0;
        while (i < 3) {
            try {
                aulf aulf = pgq.a;
                if (aulf != null) {
                    MdhFootprint mdhFootprint = pgq.b;
                    if (aulf.ordinal() == 1) {
                        saw saw = this.b;
                        MdhFootprintListSafeParcelable mdhFootprintListSafeParcelable = new MdhFootprintListSafeParcelable(amzy.a((Object) mdhFootprint));
                        Parcel aQ = saw.aQ();
                        bhx.a(aQ, (IInterface) this);
                        bhx.a(aQ, (Parcelable) mdhFootprintListSafeParcelable);
                        saw.c(2, aQ);
                    } else {
                        this.a.b.e("Listener re-set change type %s.", aulf);
                        throw new pgn();
                    }
                } else {
                    amzy amzy = pgq.d;
                    if (amzy == null) {
                        aesm aesm = pgq.e;
                        saw saw2 = this.b;
                        SyncStatus a2 = pcy.a(aesm);
                        Parcel aQ2 = saw2.aQ();
                        bhx.a(aQ2, (IInterface) this);
                        bhx.a(aQ2, (Parcelable) a2);
                        saw2.c(4, aQ2);
                    } else {
                        TimeSeriesFootprintsSubscriptionFilter timeSeriesFootprintsSubscriptionFilter = pgq.c;
                        saw saw3 = this.b;
                        MdhFootprintListSafeParcelable mdhFootprintListSafeParcelable2 = new MdhFootprintListSafeParcelable(amzy);
                        Parcel aQ3 = saw3.aQ();
                        bhx.a(aQ3, (IInterface) this);
                        bhx.a(aQ3, (Parcelable) timeSeriesFootprintsSubscriptionFilter);
                        bhx.a(aQ3, (Parcelable) mdhFootprintListSafeParcelable2);
                        saw3.c(1, aQ3);
                    }
                }
                return true;
            } catch (TransactionTooLargeException e2) {
                i++;
                this.a.b.d("Listener send attempt %d/%d (TransactionTooLargeException)", Integer.valueOf(i), 3);
                try {
                    Thread.sleep((long) Math.scalb(Math.random(), i));
                } catch (InterruptedException e3) {
                }
            } catch (RemoteException e4) {
                this.a.b.e("Listener send to %s failed", this.c.a);
                return false;
            } catch (pgn e5) {
                return false;
            }
        }
        this.a.b.e("Listener send to %s failed (too many attempts)", this.c.a);
        return false;
    }

    public final synchronized void a() {
        this.d.clear();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
        r2.c.a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0023, code lost:
        monitor-enter(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        r2.e = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0026, code lost:
        monitor-exit(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        monitor-exit(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0028, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x002f, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0017, code lost:
        if (b(r3) != false) goto L_0x002f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0019, code lost:
        r3 = r2.a.a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001d, code lost:
        monitor-enter(r3);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(com.google.android.gms.common.api.Status r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            java.util.Queue r3 = r2.d     // Catch:{ all -> 0x0034 }
            boolean r3 = r3.isEmpty()     // Catch:{ all -> 0x0034 }
            r0 = 0
            if (r3 != 0) goto L_0x0030
            java.util.Queue r3 = r2.d     // Catch:{ all -> 0x0034 }
            java.lang.Object r3 = r3.remove()     // Catch:{ all -> 0x0034 }
            pgq r3 = (defpackage.pgq) r3     // Catch:{ all -> 0x0034 }
            monitor-exit(r2)     // Catch:{ all -> 0x0034 }
            boolean r3 = r2.b(r3)
            if (r3 != 0) goto L_0x002f
            pgr r3 = r2.a
            java.util.Map r3 = r3.a
            monitor-enter(r3)
            pgp r1 = r2.c     // Catch:{ all -> 0x002c }
            r1.a()     // Catch:{ all -> 0x002c }
            monitor-enter(r2)     // Catch:{ all -> 0x002c }
            r2.e = r0     // Catch:{ all -> 0x0029 }
            monitor-exit(r2)     // Catch:{ all -> 0x0029 }
            monitor-exit(r3)     // Catch:{ all -> 0x002c }
            return
        L_0x0029:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0029 }
            throw r0     // Catch:{ all -> 0x002c }
        L_0x002c:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x002c }
            throw r0
        L_0x002f:
            return
        L_0x0030:
            r2.e = r0     // Catch:{ all -> 0x0034 }
            monitor-exit(r2)     // Catch:{ all -> 0x0034 }
            return
        L_0x0034:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0034 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pgo.a(com.google.android.gms.common.api.Status):void");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0025, code lost:
        if (b(r3) != false) goto L_0x0035;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0027, code lost:
        r2.c.a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002c, code lost:
        monitor-enter(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        r2.e = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0030, code lost:
        monitor-exit(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0031, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0035, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(defpackage.pgq r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.e     // Catch:{ all -> 0x0036 }
            if (r0 == 0) goto L_0x001d
            java.util.Queue r0 = r2.d     // Catch:{ all -> 0x0036 }
            int r0 = r0.size()     // Catch:{ all -> 0x0036 }
            r1 = 16
            if (r0 >= r1) goto L_0x0016
            java.util.Queue r0 = r2.d     // Catch:{ all -> 0x0036 }
            r0.add(r3)     // Catch:{ all -> 0x0036 }
            monitor-exit(r2)     // Catch:{ all -> 0x0036 }
            return
        L_0x0016:
            pgp r3 = r2.c     // Catch:{ all -> 0x0036 }
            r3.a()     // Catch:{ all -> 0x0036 }
            monitor-exit(r2)     // Catch:{ all -> 0x0036 }
            return
        L_0x001d:
            r0 = 1
            r2.e = r0     // Catch:{ all -> 0x0036 }
            monitor-exit(r2)     // Catch:{ all -> 0x0036 }
            boolean r3 = r2.b(r3)
            if (r3 != 0) goto L_0x0035
            pgp r3 = r2.c
            r3.a()
            monitor-enter(r2)
            r3 = 0
            r2.e = r3     // Catch:{ all -> 0x0032 }
            monitor-exit(r2)     // Catch:{ all -> 0x0032 }
            return
        L_0x0032:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0032 }
            throw r3
        L_0x0035:
            return
        L_0x0036:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0036 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pgo.a(pgq):void");
    }
}
