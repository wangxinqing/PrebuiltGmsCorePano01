package defpackage;

import android.content.Context;
import com.google.android.gms.leveldb.LevelDb;

/* renamed from: aasb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aasb extends aatv {
    private static aasb c = null;
    private LevelDb d;

    static {
        aasb.class.getSimpleName();
    }

    private aasb(Context context) {
        super(context);
        this.d = null;
        this.d = a(false, (LevelDb) null, "snet_dex_info");
    }

    public static synchronized aasb a(Context context) {
        aasb aasb;
        synchronized (aasb.class) {
            if (c == null) {
                c = new aasb(context);
            }
            aasb = c;
        }
        return aasb;
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final synchronized void c() {
        /*
            r2 = this;
            monitor-enter(r2)
            com.google.android.gms.leveldb.LevelDb r0 = r2.d     // Catch:{ Exception -> 0x000c, all -> 0x0009 }
            r1 = 0
            r0.deleteRange(r1, r1)     // Catch:{ Exception -> 0x000c, all -> 0x0009 }
        L_0x0007:
            monitor-exit(r2)
            return
        L_0x0009:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x000c:
            r0 = move-exception
            goto L_0x0007
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aasb.c():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x00a2, code lost:
        if (r1 != null) goto L_0x00a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00b2, code lost:
        if (r1 == null) goto L_0x00b5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized java.util.ArrayList a() {
        /*
            r10 = this;
            monitor-enter(r10)
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x00b7 }
            r0.<init>()     // Catch:{ all -> 0x00b7 }
            com.google.android.gms.leveldb.LevelDb r1 = r10.d     // Catch:{ all -> 0x00b7 }
            com.google.android.gms.leveldb.LevelDb$Iterator r1 = r1.iterator()     // Catch:{ all -> 0x00b7 }
            r1.seekToFirst()     // Catch:{ Exception -> 0x00b1, all -> 0x00a8 }
        L_0x000f:
            boolean r2 = r1.isValid()     // Catch:{ Exception -> 0x00b1, all -> 0x00a8 }
            if (r2 == 0) goto L_0x009f
            byte[] r2 = r1.key()     // Catch:{ Exception -> 0x00b1, all -> 0x00a8 }
            byte[] r3 = r1.value()     // Catch:{ Exception -> 0x00b1, all -> 0x00a8 }
            aasa r4 = defpackage.aasa.f     // Catch:{ Exception -> 0x00b1, all -> 0x00a8 }
            aucj r3 = defpackage.aucj.a((defpackage.aucj) r4, (byte[]) r3)     // Catch:{ Exception -> 0x00b1, all -> 0x00a8 }
            aasa r3 = (defpackage.aasa) r3     // Catch:{ Exception -> 0x00b1, all -> 0x00a8 }
            android.os.Bundle r4 = new android.os.Bundle     // Catch:{ Exception -> 0x00b1, all -> 0x00a8 }
            r4.<init>()     // Catch:{ Exception -> 0x00b1, all -> 0x00a8 }
            java.lang.String r5 = "digest"
            r4.putByteArray(r5, r2)     // Catch:{ Exception -> 0x00b1, all -> 0x00a8 }
            java.lang.String r2 = "package_name"
            java.lang.String r5 = r3.a     // Catch:{ Exception -> 0x00b1, all -> 0x00a8 }
            r4.putString(r2, r5)     // Catch:{ Exception -> 0x00b1, all -> 0x00a8 }
            java.lang.String r2 = "method_calls"
            aucx r5 = r3.c     // Catch:{ Exception -> 0x00b1, all -> 0x00a8 }
            r6 = 0
            java.lang.String[] r7 = new java.lang.String[r6]     // Catch:{ Exception -> 0x00b1, all -> 0x00a8 }
            java.lang.Object[] r5 = r5.toArray(r7)     // Catch:{ Exception -> 0x00b1, all -> 0x00a8 }
            java.lang.String[] r5 = (java.lang.String[]) r5     // Catch:{ Exception -> 0x00b1, all -> 0x00a8 }
            r4.putStringArray(r2, r5)     // Catch:{ Exception -> 0x00b1, all -> 0x00a8 }
            java.lang.String r2 = "class_names"
            aucx r5 = r3.d     // Catch:{ Exception -> 0x00b1, all -> 0x00a8 }
            java.lang.String[] r7 = new java.lang.String[r6]     // Catch:{ Exception -> 0x00b1, all -> 0x00a8 }
            java.lang.Object[] r5 = r5.toArray(r7)     // Catch:{ Exception -> 0x00b1, all -> 0x00a8 }
            java.lang.String[] r5 = (java.lang.String[]) r5     // Catch:{ Exception -> 0x00b1, all -> 0x00a8 }
            r4.putStringArray(r2, r5)     // Catch:{ Exception -> 0x00b1, all -> 0x00a8 }
            java.lang.String r2 = "constant_strings"
            aucx r5 = r3.b     // Catch:{ Exception -> 0x00b1, all -> 0x00a8 }
            java.lang.String[] r6 = new java.lang.String[r6]     // Catch:{ Exception -> 0x00b1, all -> 0x00a8 }
            java.lang.Object[] r5 = r5.toArray(r6)     // Catch:{ Exception -> 0x00b1, all -> 0x00a8 }
            java.lang.String[] r5 = (java.lang.String[]) r5     // Catch:{ Exception -> 0x00b1, all -> 0x00a8 }
            r4.putStringArray(r2, r5)     // Catch:{ Exception -> 0x00b1, all -> 0x00a8 }
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ Exception -> 0x00b1, all -> 0x00a8 }
            r2.<init>()     // Catch:{ Exception -> 0x00b1, all -> 0x00a8 }
            aucx r3 = r3.e     // Catch:{ Exception -> 0x00b1, all -> 0x00a8 }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ Exception -> 0x00b1, all -> 0x00a8 }
        L_0x006f:
            boolean r5 = r3.hasNext()     // Catch:{ Exception -> 0x00b1, all -> 0x00a8 }
            if (r5 == 0) goto L_0x0092
            java.lang.Object r5 = r3.next()     // Catch:{ Exception -> 0x00b1, all -> 0x00a8 }
            aarz r5 = (defpackage.aarz) r5     // Catch:{ Exception -> 0x00b1, all -> 0x00a8 }
            android.os.Bundle r6 = new android.os.Bundle     // Catch:{ Exception -> 0x00b1, all -> 0x00a8 }
            r6.<init>()     // Catch:{ Exception -> 0x00b1, all -> 0x00a8 }
            java.lang.String r7 = "sim_hash_type"
            int r8 = r5.a     // Catch:{ Exception -> 0x00b1, all -> 0x00a8 }
            r6.putInt(r7, r8)     // Catch:{ Exception -> 0x00b1, all -> 0x00a8 }
            java.lang.String r7 = "sim_hash_value"
            long r8 = r5.b     // Catch:{ Exception -> 0x00b1, all -> 0x00a8 }
            r6.putLong(r7, r8)     // Catch:{ Exception -> 0x00b1, all -> 0x00a8 }
            r2.add(r6)     // Catch:{ Exception -> 0x00b1, all -> 0x00a8 }
            goto L_0x006f
        L_0x0092:
            java.lang.String r3 = "sim_hashes"
            r4.putParcelableArrayList(r3, r2)     // Catch:{ Exception -> 0x00b1, all -> 0x00a8 }
            r0.add(r4)     // Catch:{ Exception -> 0x00b1, all -> 0x00a8 }
            r1.next()     // Catch:{ Exception -> 0x00b1, all -> 0x00a8 }
            goto L_0x000f
        L_0x009f:
            r10.c()     // Catch:{ Exception -> 0x00b1, all -> 0x00a8 }
            if (r1 == 0) goto L_0x00b5
        L_0x00a4:
            r1.close()     // Catch:{ all -> 0x00b7 }
            goto L_0x00b5
        L_0x00a8:
            r0 = move-exception
            if (r1 != 0) goto L_0x00ac
        L_0x00ab:
            goto L_0x00b0
        L_0x00ac:
            r1.close()     // Catch:{ all -> 0x00b7 }
            goto L_0x00ab
        L_0x00b0:
            throw r0     // Catch:{ all -> 0x00b7 }
        L_0x00b1:
            r2 = move-exception
            if (r1 == 0) goto L_0x00b5
            goto L_0x00a4
        L_0x00b5:
            monitor-exit(r10)
            return r0
        L_0x00b7:
            r0 = move-exception
            monitor-exit(r10)
            goto L_0x00bb
        L_0x00ba:
            throw r0
        L_0x00bb:
            goto L_0x00ba
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aasb.a():java.util.ArrayList");
    }
}
