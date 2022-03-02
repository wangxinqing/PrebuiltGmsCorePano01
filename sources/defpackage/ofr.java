package defpackage;

import android.graphics.Bitmap;
import android.os.AsyncTask;
import java.io.File;

/* renamed from: ofr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ofr extends AsyncTask {
    final /* synthetic */ File a;
    final /* synthetic */ Bitmap b;

    public ofr(File file, Bitmap bitmap) {
        this.a = file;
        this.b = bitmap;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0057 A[Catch:{ all -> 0x0080 }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x005d A[Catch:{ all -> 0x0080 }] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0066 A[SYNTHETIC, Splitter:B:26:0x0066] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0086 A[SYNTHETIC, Splitter:B:36:0x0086] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object doInBackground(java.lang.Object[] r9) {
        /*
            r8 = this;
            java.lang.String r0 = "IOException "
            java.lang.String r1 = "gH_Screenshot"
            java.lang.Void[] r9 = (java.lang.Void[]) r9
            r9 = 0
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x0045, all -> 0x0043 }
            java.io.File r3 = r8.a     // Catch:{ IOException -> 0x0045, all -> 0x0043 }
            r2.<init>(r3)     // Catch:{ IOException -> 0x0045, all -> 0x0043 }
            android.graphics.Bitmap r3 = r8.b     // Catch:{ IOException -> 0x0041, all -> 0x003c }
            android.graphics.Bitmap$CompressFormat r4 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ IOException -> 0x0041, all -> 0x003c }
            long r5 = defpackage.axgy.b()     // Catch:{ IOException -> 0x0041, all -> 0x003c }
            int r6 = (int) r5     // Catch:{ IOException -> 0x0041, all -> 0x003c }
            r3.compress(r4, r6, r2)     // Catch:{ IOException -> 0x0041, all -> 0x003c }
            r2.close()     // Catch:{ IOException -> 0x001f }
            goto L_0x007f
        L_0x001f:
            r2 = move-exception
            java.lang.String r2 = r2.getMessage()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            int r3 = r2.length()
            if (r3 != 0) goto L_0x0034
            java.lang.String r2 = new java.lang.String
            r2.<init>(r0)
            goto L_0x0038
        L_0x0034:
            java.lang.String r2 = r0.concat(r2)
        L_0x0038:
            android.util.Log.e(r1, r2)
            goto L_0x007f
        L_0x003c:
            r9 = move-exception
            r7 = r2
            r2 = r9
            r9 = r7
            goto L_0x0084
        L_0x0041:
            r3 = move-exception
            goto L_0x0048
        L_0x0043:
            r2 = move-exception
            goto L_0x0084
        L_0x0045:
            r2 = move-exception
            r3 = r2
            r2 = r9
        L_0x0048:
            java.lang.String r3 = r3.getMessage()     // Catch:{ all -> 0x0080 }
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x0080 }
            int r4 = r3.length()     // Catch:{ all -> 0x0080 }
            if (r4 != 0) goto L_0x005d
            java.lang.String r3 = new java.lang.String     // Catch:{ all -> 0x0080 }
            r3.<init>(r0)     // Catch:{ all -> 0x0080 }
            goto L_0x0061
        L_0x005d:
            java.lang.String r3 = r0.concat(r3)     // Catch:{ all -> 0x0080 }
        L_0x0061:
            android.util.Log.e(r1, r3)     // Catch:{ all -> 0x0080 }
            if (r2 == 0) goto L_0x007f
            r2.close()     // Catch:{ IOException -> 0x006a }
            goto L_0x007f
        L_0x006a:
            r2 = move-exception
            java.lang.String r2 = r2.getMessage()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            int r3 = r2.length()
            if (r3 != 0) goto L_0x0034
            java.lang.String r2 = new java.lang.String
            r2.<init>(r0)
            goto L_0x0038
        L_0x007f:
            return r9
        L_0x0080:
            r9 = move-exception
            r7 = r2
            r2 = r9
            r9 = r7
        L_0x0084:
            if (r9 == 0) goto L_0x00a6
            r9.close()     // Catch:{ IOException -> 0x008a }
            goto L_0x00a6
        L_0x008a:
            r9 = move-exception
            java.lang.String r9 = r9.getMessage()
            java.lang.String r9 = java.lang.String.valueOf(r9)
            int r3 = r9.length()
            if (r3 != 0) goto L_0x009f
            java.lang.String r9 = new java.lang.String
            r9.<init>(r0)
            goto L_0x00a3
        L_0x009f:
            java.lang.String r9 = r0.concat(r9)
        L_0x00a3:
            android.util.Log.e(r1, r9)
        L_0x00a6:
            goto L_0x00a8
        L_0x00a7:
            throw r2
        L_0x00a8:
            goto L_0x00a7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ofr.doInBackground(java.lang.Object[]):java.lang.Object");
    }
}
