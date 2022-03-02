package defpackage;

import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.events.internal.TransferProgressData;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: ksz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ksz {
    private static final ith a = new ith("GlobalTransferProgressS", "");
    private final Map b = new HashMap();
    private final Map c = new HashMap();

    private final Map a(int i) {
        if (i == 0) {
            return this.b;
        }
        if (i == 1) {
            return this.c;
        }
        throw new IllegalStateException("Unexpected transfer type");
    }

    public final synchronized TransferProgressData a(int i, DriveId driveId) {
        TransferProgressData transferProgressData;
        transferProgressData = (TransferProgressData) a(i).get(driveId);
        if (transferProgressData == null) {
            transferProgressData = new TransferProgressData(i, driveId);
        }
        return transferProgressData;
    }

    public final synchronized List a() {
        ArrayList arrayList;
        arrayList = new ArrayList(this.b.size() + this.c.size());
        arrayList.addAll(this.b.values());
        arrayList.addAll(this.c.values());
        return arrayList;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003a, code lost:
        if (r7.c == r0.c) goto L_0x003d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003c, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003d, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0041, code lost:
        if (r7.c == 0) goto L_0x0044;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0043, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0044, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean a(com.google.android.gms.drive.events.internal.TransferProgressData r7) {
        /*
            r6 = this;
            monitor-enter(r6)
            defpackage.iva.a((java.lang.Object) r7)     // Catch:{ all -> 0x0045 }
            int r0 = r7.a     // Catch:{ all -> 0x0045 }
            java.util.Map r0 = r6.a((int) r0)     // Catch:{ all -> 0x0045 }
            com.google.android.gms.drive.DriveId r1 = r7.b     // Catch:{ all -> 0x0045 }
            int r2 = r7.c     // Catch:{ all -> 0x0045 }
            if (r2 != 0) goto L_0x0017
            java.lang.Object r0 = r0.remove(r1)     // Catch:{ all -> 0x0045 }
            com.google.android.gms.drive.events.internal.TransferProgressData r0 = (com.google.android.gms.drive.events.internal.TransferProgressData) r0     // Catch:{ all -> 0x0045 }
            goto L_0x001d
        L_0x0017:
            java.lang.Object r0 = r0.put(r1, r7)     // Catch:{ all -> 0x0045 }
            com.google.android.gms.drive.events.internal.TransferProgressData r0 = (com.google.android.gms.drive.events.internal.TransferProgressData) r0     // Catch:{ all -> 0x0045 }
        L_0x001d:
            boolean r1 = r7.equals(r0)     // Catch:{ all -> 0x0045 }
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x0033
            ith r1 = a     // Catch:{ all -> 0x0045 }
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ all -> 0x0045 }
            r4[r3] = r0     // Catch:{ all -> 0x0045 }
            r4[r2] = r7     // Catch:{ all -> 0x0045 }
            java.lang.String r5 = "Unexpected transfer transition from [%s] to [%s]"
            r1.b((java.lang.String) r5, (java.lang.Object[]) r4)     // Catch:{ all -> 0x0045 }
        L_0x0033:
            if (r0 == 0) goto L_0x003e
            int r7 = r7.c     // Catch:{ all -> 0x0045 }
            int r0 = r0.c     // Catch:{ all -> 0x0045 }
            monitor-exit(r6)
            if (r7 == r0) goto L_0x003d
            return r2
        L_0x003d:
            return r3
        L_0x003e:
            int r7 = r7.c     // Catch:{ all -> 0x0045 }
            monitor-exit(r6)
            if (r7 == 0) goto L_0x0044
            return r2
        L_0x0044:
            return r3
        L_0x0045:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ksz.a(com.google.android.gms.drive.events.internal.TransferProgressData):boolean");
    }
}
