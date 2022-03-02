package defpackage;

import android.util.Pair;
import java.io.File;

/* renamed from: ofw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ofw extends jfx {
    final /* synthetic */ File a;
    final /* synthetic */ Pair e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ofw(File file, Pair pair) {
        super(10);
        this.a = file;
        this.e = pair;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0056 A[Catch:{ all -> 0x007f }] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x005c A[Catch:{ all -> 0x007f }] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0065 A[SYNTHETIC, Splitter:B:28:0x0065] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x007e A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0085 A[SYNTHETIC, Splitter:B:39:0x0085] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r6 = this;
            java.lang.String r0 = "IOException "
            java.lang.String r1 = "gH_SharedFbUtils"
            r2 = 0
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x0043, all -> 0x0041 }
            java.io.File r4 = r6.a     // Catch:{ IOException -> 0x0043, all -> 0x0041 }
            r3.<init>(r4)     // Catch:{ IOException -> 0x0043, all -> 0x0041 }
            android.util.Pair r2 = r6.e     // Catch:{ IOException -> 0x003f, all -> 0x003a }
            java.lang.Object r2 = r2.second     // Catch:{ IOException -> 0x003f, all -> 0x003a }
            android.util.Pair r2 = (android.util.Pair) r2     // Catch:{ IOException -> 0x003f, all -> 0x003a }
            java.lang.Object r2 = r2.second     // Catch:{ IOException -> 0x003f, all -> 0x003a }
            byte[] r2 = (byte[]) r2     // Catch:{ IOException -> 0x003f, all -> 0x003a }
            r3.write(r2)     // Catch:{ IOException -> 0x003f, all -> 0x003a }
            r3.close()     // Catch:{ IOException -> 0x001d }
            return
        L_0x001d:
            r2 = move-exception
            java.lang.String r2 = r2.getMessage()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            int r3 = r2.length()
            if (r3 != 0) goto L_0x0032
            java.lang.String r2 = new java.lang.String
            r2.<init>(r0)
            goto L_0x0036
        L_0x0032:
            java.lang.String r2 = r0.concat(r2)
        L_0x0036:
            android.util.Log.e(r1, r2)
            return
        L_0x003a:
            r2 = move-exception
            r5 = r3
            r3 = r2
            r2 = r5
            goto L_0x0083
        L_0x003f:
            r2 = move-exception
            goto L_0x0047
        L_0x0041:
            r3 = move-exception
            goto L_0x0083
        L_0x0043:
            r3 = move-exception
            r5 = r3
            r3 = r2
            r2 = r5
        L_0x0047:
            java.lang.String r2 = r2.getMessage()     // Catch:{ all -> 0x007f }
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch:{ all -> 0x007f }
            int r4 = r2.length()     // Catch:{ all -> 0x007f }
            if (r4 != 0) goto L_0x005c
            java.lang.String r2 = new java.lang.String     // Catch:{ all -> 0x007f }
            r2.<init>(r0)     // Catch:{ all -> 0x007f }
            goto L_0x0060
        L_0x005c:
            java.lang.String r2 = r0.concat(r2)     // Catch:{ all -> 0x007f }
        L_0x0060:
            android.util.Log.e(r1, r2)     // Catch:{ all -> 0x007f }
            if (r3 == 0) goto L_0x007e
            r3.close()     // Catch:{ IOException -> 0x0069 }
            return
        L_0x0069:
            r2 = move-exception
            java.lang.String r2 = r2.getMessage()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            int r3 = r2.length()
            if (r3 != 0) goto L_0x0032
            java.lang.String r2 = new java.lang.String
            r2.<init>(r0)
            goto L_0x0036
        L_0x007e:
            return
        L_0x007f:
            r2 = move-exception
            r5 = r3
            r3 = r2
            r2 = r5
        L_0x0083:
            if (r2 == 0) goto L_0x00a5
            r2.close()     // Catch:{ IOException -> 0x0089 }
            goto L_0x00a5
        L_0x0089:
            r2 = move-exception
            java.lang.String r2 = r2.getMessage()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            int r4 = r2.length()
            if (r4 != 0) goto L_0x009e
            java.lang.String r2 = new java.lang.String
            r2.<init>(r0)
            goto L_0x00a2
        L_0x009e:
            java.lang.String r2 = r0.concat(r2)
        L_0x00a2:
            android.util.Log.e(r1, r2)
        L_0x00a5:
            goto L_0x00a7
        L_0x00a6:
            throw r3
        L_0x00a7:
            goto L_0x00a6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ofw.run():void");
    }
}
