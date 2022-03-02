package defpackage;

import android.content.Context;
import android.service.persistentdata.PersistentDataBlockManager;
import java.io.IOException;
import java.lang.ref.WeakReference;

/* renamed from: ell  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ell implements elk {
    private static final iwd a = ehv.a("DataBlockManagerHelper");
    private static WeakReference b = new WeakReference((Object) null);
    private final PersistentDataBlockManager c;
    private final Object d = new Object();

    public ell(PersistentDataBlockManager persistentDataBlockManager) {
        this.c = persistentDataBlockManager;
    }

    public static synchronized elk a(Context context) {
        elk elk;
        synchronized (ell.class) {
            elk = (elk) b.get();
            awkh.c();
            if (elk == null) {
                elk = new ell(jkr.a() ? (PersistentDataBlockManager) context.getApplicationContext().getSystemService("persistent_data_block") : null);
                b = new WeakReference(elk);
            }
        }
        return elk;
    }

    public final boolean a() {
        return this.c != null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0024, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.fyw b() {
        /*
            r5 = this;
            boolean r0 = r5.a()
            r1 = 0
            if (r0 == 0) goto L_0x0034
            java.lang.Object r0 = r5.d     // Catch:{ Exception -> 0x0028 }
            monitor-enter(r0)     // Catch:{ Exception -> 0x0028 }
            android.service.persistentdata.PersistentDataBlockManager r2 = r5.c     // Catch:{ all -> 0x0025 }
            byte[] r2 = r2.read()     // Catch:{ all -> 0x0025 }
            if (r2 == 0) goto L_0x0023
            int r3 = r2.length     // Catch:{ all -> 0x0025 }
            if (r3 == 0) goto L_0x0023
            aubs r3 = defpackage.aubs.c()     // Catch:{ all -> 0x0025 }
            fyw r4 = defpackage.fyw.d     // Catch:{ all -> 0x0025 }
            aucj r2 = defpackage.aucj.a((defpackage.aucj) r4, (byte[]) r2, (defpackage.aubs) r3)     // Catch:{ all -> 0x0025 }
            fyw r2 = (defpackage.fyw) r2     // Catch:{ all -> 0x0025 }
            monitor-exit(r0)     // Catch:{ all -> 0x0025 }
            return r2
        L_0x0023:
            monitor-exit(r0)     // Catch:{ all -> 0x0025 }
            return r1
        L_0x0025:
            r2 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0025 }
            throw r2     // Catch:{ Exception -> 0x0028 }
        L_0x0028:
            r0 = move-exception
            iwd r2 = a
            r3 = 0
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.String r4 = "Failed to read data from DataBlockManager."
            r2.e(r4, r0, r3)
            return r1
        L_0x0034:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ell.b():fyw");
    }

    public final long a(fyw fyw) {
        byte[] bArr;
        if (a()) {
            if (fyw == null) {
                a.d("Supplied DataBlockContainer is null. Proceeding to erase stored data.", new Object[0]);
                bArr = new byte[0];
            } else {
                bArr = fyw.k();
            }
            synchronized (this.d) {
                try {
                    long maximumDataBlockSize = this.c.getMaximumDataBlockSize();
                    if (maximumDataBlockSize == -1) {
                        throw new IOException("Error when getting data block maximum capacity.");
                    } else if (((long) bArr.length) > maximumDataBlockSize) {
                        return -1;
                    } else {
                        long write = (long) this.c.write(bArr);
                        if (write != -1) {
                            long j = maximumDataBlockSize - write;
                            return j;
                        }
                        throw new IOException("Error when writing to data block.");
                    }
                } catch (Exception e) {
                    throw new IOException("Unable to write data to DataBlockManager.", e);
                }
            }
        } else {
            throw new IOException("DataBlockManager is not supported on current device.");
        }
    }
}
