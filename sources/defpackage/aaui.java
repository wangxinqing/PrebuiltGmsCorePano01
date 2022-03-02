package defpackage;

import android.content.Context;
import com.google.android.gms.leveldb.LevelDb;

/* renamed from: aaui  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aaui extends aatv {
    private static aaui c = null;
    private LevelDb d;

    static {
        aaui.class.getSimpleName();
    }

    private aaui(Context context) {
        super(context);
        this.d = null;
        this.d = a(false, (LevelDb) null, "snet_pha");
    }

    static synchronized aaui a(Context context) {
        aaui aaui;
        synchronized (aaui.class) {
            if (c == null) {
                c = new aaui(context);
            }
            aaui = c;
        }
        return aaui;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized defpackage.aauh a(byte[] r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            r0 = 0
            if (r4 == 0) goto L_0x0027
            com.google.android.gms.leveldb.LevelDb r1 = r3.d     // Catch:{ Exception -> 0x002c, all -> 0x0029 }
            byte[] r4 = r1.get(r4)     // Catch:{ Exception -> 0x002c, all -> 0x0029 }
            if (r4 == 0) goto L_0x0027
            aaug r1 = defpackage.aaug.e     // Catch:{ Exception -> 0x002c, all -> 0x0029 }
            aucj r4 = defpackage.aucj.a((defpackage.aucj) r1, (byte[]) r4)     // Catch:{ Exception -> 0x002c, all -> 0x0029 }
            aaug r4 = (defpackage.aaug) r4     // Catch:{ Exception -> 0x002c, all -> 0x0029 }
            aauh r1 = new aauh     // Catch:{ Exception -> 0x002c, all -> 0x0029 }
            r1.<init>()     // Catch:{ Exception -> 0x002c, all -> 0x0029 }
            java.lang.String r2 = r4.b     // Catch:{ Exception -> 0x002c, all -> 0x0029 }
            r1.a = r2     // Catch:{ Exception -> 0x002c, all -> 0x0029 }
            java.lang.String r2 = r4.c     // Catch:{ Exception -> 0x002c, all -> 0x0029 }
            r1.b = r2     // Catch:{ Exception -> 0x002c, all -> 0x0029 }
            java.lang.String r4 = r4.d     // Catch:{ Exception -> 0x002c, all -> 0x0029 }
            r1.c = r4     // Catch:{ Exception -> 0x002c, all -> 0x0029 }
            monitor-exit(r3)
            return r1
        L_0x0027:
            monitor-exit(r3)
            return r0
        L_0x0029:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        L_0x002c:
            r4 = move-exception
            goto L_0x0027
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aaui.a(byte[]):aauh");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0061 A[SYNTHETIC, Splitter:B:21:0x0061] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x006c A[SYNTHETIC, Splitter:B:28:0x006c] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void a(byte[] r6, defpackage.aauh r7) {
        /*
            r5 = this;
            monitor-enter(r5)
            r0 = 0
            aaug r1 = defpackage.aaug.e     // Catch:{ Exception -> 0x0069, OutOfMemoryError -> 0x0067, all -> 0x005e }
            aucd r1 = r1.o()     // Catch:{ Exception -> 0x0069, OutOfMemoryError -> 0x0067, all -> 0x005e }
            java.lang.String r2 = r7.a     // Catch:{ Exception -> 0x0069, OutOfMemoryError -> 0x0067, all -> 0x005e }
            boolean r3 = r1.c     // Catch:{ Exception -> 0x0069, OutOfMemoryError -> 0x0067, all -> 0x005e }
            if (r3 != 0) goto L_0x000f
            goto L_0x0015
        L_0x000f:
            r1.c()     // Catch:{ Exception -> 0x0069, OutOfMemoryError -> 0x0067, all -> 0x005e }
            r3 = 0
            r1.c = r3     // Catch:{ Exception -> 0x0069, OutOfMemoryError -> 0x0067, all -> 0x005e }
        L_0x0015:
            aucj r3 = r1.b     // Catch:{ Exception -> 0x0069, OutOfMemoryError -> 0x0067, all -> 0x005e }
            aaug r3 = (defpackage.aaug) r3     // Catch:{ Exception -> 0x0069, OutOfMemoryError -> 0x0067, all -> 0x005e }
            r2.getClass()     // Catch:{ Exception -> 0x0069, OutOfMemoryError -> 0x0067, all -> 0x005e }
            int r4 = r3.a     // Catch:{ Exception -> 0x0069, OutOfMemoryError -> 0x0067, all -> 0x005e }
            r4 = r4 | 1
            r3.a = r4     // Catch:{ Exception -> 0x0069, OutOfMemoryError -> 0x0067, all -> 0x005e }
            r3.b = r2     // Catch:{ Exception -> 0x0069, OutOfMemoryError -> 0x0067, all -> 0x005e }
            java.lang.String r2 = r7.b     // Catch:{ Exception -> 0x0069, OutOfMemoryError -> 0x0067, all -> 0x005e }
            r2.getClass()     // Catch:{ Exception -> 0x0069, OutOfMemoryError -> 0x0067, all -> 0x005e }
            r4 = r4 | 2
            r3.a = r4     // Catch:{ Exception -> 0x0069, OutOfMemoryError -> 0x0067, all -> 0x005e }
            r3.c = r2     // Catch:{ Exception -> 0x0069, OutOfMemoryError -> 0x0067, all -> 0x005e }
            java.lang.String r7 = r7.c     // Catch:{ Exception -> 0x0069, OutOfMemoryError -> 0x0067, all -> 0x005e }
            r7.getClass()     // Catch:{ Exception -> 0x0069, OutOfMemoryError -> 0x0067, all -> 0x005e }
            r2 = r4 | 4
            r3.a = r2     // Catch:{ Exception -> 0x0069, OutOfMemoryError -> 0x0067, all -> 0x005e }
            r3.d = r7     // Catch:{ Exception -> 0x0069, OutOfMemoryError -> 0x0067, all -> 0x005e }
            aucj r7 = r1.i()     // Catch:{ Exception -> 0x0069, OutOfMemoryError -> 0x0067, all -> 0x005e }
            aaug r7 = (defpackage.aaug) r7     // Catch:{ Exception -> 0x0069, OutOfMemoryError -> 0x0067, all -> 0x005e }
            byte[] r7 = r7.k()     // Catch:{ Exception -> 0x0069, OutOfMemoryError -> 0x0067, all -> 0x005e }
            com.google.android.gms.leveldb.WriteBatch r0 = com.google.android.gms.leveldb.WriteBatch.create()     // Catch:{ Exception -> 0x0069, OutOfMemoryError -> 0x0067, all -> 0x005e }
            r0.put(r6, r7)     // Catch:{ Exception -> 0x005c, OutOfMemoryError -> 0x005a, all -> 0x0058 }
            com.google.android.gms.leveldb.LevelDb r6 = r5.d     // Catch:{ Exception -> 0x005c, OutOfMemoryError -> 0x005a, all -> 0x0058 }
            r6.write(r0)     // Catch:{ Exception -> 0x005c, OutOfMemoryError -> 0x005a, all -> 0x0058 }
            r0.close()     // Catch:{ Exception -> 0x0055 }
        L_0x0053:
            monitor-exit(r5)
            return
        L_0x0055:
            r6 = move-exception
        L_0x0056:
            monitor-exit(r5)
            return
        L_0x0058:
            r6 = move-exception
            goto L_0x005f
        L_0x005a:
            r6 = move-exception
            goto L_0x006a
        L_0x005c:
            r6 = move-exception
            goto L_0x006a
        L_0x005e:
            r6 = move-exception
        L_0x005f:
            if (r0 == 0) goto L_0x0066
            r0.close()     // Catch:{ Exception -> 0x0065 }
            goto L_0x0066
        L_0x0065:
            r7 = move-exception
        L_0x0066:
            throw r6     // Catch:{ all -> 0x0070 }
        L_0x0067:
            r6 = move-exception
            goto L_0x006a
        L_0x0069:
            r6 = move-exception
        L_0x006a:
            if (r0 == 0) goto L_0x0056
            r0.close()     // Catch:{ Exception -> 0x0055 }
            goto L_0x0053
        L_0x0070:
            r6 = move-exception
            monitor-exit(r5)
            goto L_0x0074
        L_0x0073:
            throw r6
        L_0x0074:
            goto L_0x0073
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aaui.a(byte[], aauh):void");
    }
}
