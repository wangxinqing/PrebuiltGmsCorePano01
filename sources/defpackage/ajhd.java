package defpackage;

import android.content.Context;
import android.content.Intent;
import com.google.android.location.reporting.collectors.LocationHistorianDataRetriever$LogDataReceiver;

/* renamed from: ajhd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ajhd implements Runnable {
    final /* synthetic */ Context a;
    final /* synthetic */ Intent b;
    final /* synthetic */ LocationHistorianDataRetriever$LogDataReceiver c;

    public ajhd(LocationHistorianDataRetriever$LogDataReceiver locationHistorianDataRetriever$LogDataReceiver, Context context, Intent intent) {
        this.c = locationHistorianDataRetriever$LogDataReceiver;
        this.a = context;
        this.b = intent;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x007a, code lost:
        r10 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x007c, code lost:
        r10 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x007e, code lost:
        r2 = th;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:6:0x0022, B:12:0x0056] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x007e A[ExcHandler: all (th java.lang.Throwable), Splitter:B:6:0x0022] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x009e A[SYNTHETIC, Splitter:B:40:0x009e] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00ed A[SYNTHETIC, Splitter:B:60:0x00ed] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0101  */
    /* JADX WARNING: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r15 = this;
            java.lang.String r0 = "Problem encountered while trying to close contentUri inputStream"
            java.lang.String r1 = "GCoreUlr"
            com.google.android.location.reporting.collectors.LocationHistorianDataRetriever$LogDataReceiver r2 = r15.c
            android.content.Context r3 = r15.a
            android.content.Intent r4 = r15.b
            java.lang.String r5 = "content_uri_key"
            java.lang.String r5 = r4.getStringExtra(r5)
            r6 = 0
            if (r5 == 0) goto L_0x00f8
            android.net.Uri r5 = android.net.Uri.parse(r5)
            r7 = -1
            android.content.ContentResolver r8 = r3.getContentResolver()     // Catch:{ FileNotFoundException -> 0x00a7, IOException -> 0x008c, all -> 0x0089 }
            java.io.InputStream r8 = r8.openInputStream(r5)     // Catch:{ FileNotFoundException -> 0x00a7, IOException -> 0x008c, all -> 0x0089 }
            if (r8 != 0) goto L_0x004e
            java.lang.String r9 = java.lang.String.valueOf(r5)     // Catch:{ FileNotFoundException -> 0x0085, IOException -> 0x0081, all -> 0x007e }
            java.lang.String r10 = java.lang.String.valueOf(r9)     // Catch:{ FileNotFoundException -> 0x0085, IOException -> 0x0081, all -> 0x007e }
            int r10 = r10.length()     // Catch:{ FileNotFoundException -> 0x0085, IOException -> 0x0081, all -> 0x007e }
            int r10 = r10 + 31
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x0085, IOException -> 0x0081, all -> 0x007e }
            r11.<init>(r10)     // Catch:{ FileNotFoundException -> 0x0085, IOException -> 0x0081, all -> 0x007e }
            java.lang.String r10 = "Failed to open input stream at "
            r11.append(r10)     // Catch:{ FileNotFoundException -> 0x0085, IOException -> 0x0081, all -> 0x007e }
            r11.append(r9)     // Catch:{ FileNotFoundException -> 0x0085, IOException -> 0x0081, all -> 0x007e }
            java.lang.String r9 = r11.toString()     // Catch:{ FileNotFoundException -> 0x0085, IOException -> 0x0081, all -> 0x007e }
            defpackage.ajix.c(r1, r9)     // Catch:{ FileNotFoundException -> 0x0085, IOException -> 0x0081, all -> 0x007e }
            android.content.ContentResolver r0 = r3.getContentResolver()
            r0.delete(r5, r6, r6)
            r14 = r6
            goto L_0x00c5
        L_0x004e:
            java.io.ByteArrayOutputStream r9 = new java.io.ByteArrayOutputStream     // Catch:{ FileNotFoundException -> 0x0085, IOException -> 0x0081, all -> 0x007e }
            r9.<init>()     // Catch:{ FileNotFoundException -> 0x0085, IOException -> 0x0081, all -> 0x007e }
            r10 = 200000(0x30d40, float:2.8026E-40)
            byte[] r11 = new byte[r10]     // Catch:{ FileNotFoundException -> 0x007c, IOException -> 0x007a, all -> 0x007e }
        L_0x0058:
            r12 = 0
            int r13 = r8.read(r11, r12, r10)     // Catch:{ FileNotFoundException -> 0x007c, IOException -> 0x007a, all -> 0x007e }
            if (r13 != r7) goto L_0x0075
            r9.flush()     // Catch:{ FileNotFoundException -> 0x007c, IOException -> 0x007a, all -> 0x007e }
            android.content.ContentResolver r3 = r3.getContentResolver()
            r3.delete(r5, r6, r6)
            r8.close()     // Catch:{ IOException -> 0x0070, IllegalArgumentException -> 0x006e }
            goto L_0x00bc
        L_0x006e:
            r3 = move-exception
            goto L_0x0071
        L_0x0070:
            r3 = move-exception
        L_0x0071:
            defpackage.ajix.b((java.lang.String) r1, (java.lang.String) r0, (java.lang.Throwable) r3)
            goto L_0x00bc
        L_0x0075:
            r9.write(r11, r12, r13)     // Catch:{ FileNotFoundException -> 0x007c, IOException -> 0x007a, all -> 0x007e }
            goto L_0x0058
        L_0x007a:
            r10 = move-exception
            goto L_0x0090
        L_0x007c:
            r10 = move-exception
            goto L_0x00ab
        L_0x007e:
            r2 = move-exception
            goto L_0x00e4
        L_0x0081:
            r9 = move-exception
            r10 = r9
            r9 = r6
            goto L_0x0090
        L_0x0085:
            r9 = move-exception
            r10 = r9
            r9 = r6
            goto L_0x00ab
        L_0x0089:
            r2 = move-exception
            r8 = r6
            goto L_0x00e4
        L_0x008c:
            r8 = move-exception
            r10 = r8
            r8 = r6
            r9 = r8
        L_0x0090:
            java.lang.String r11 = "IOException when trying to read contentUri inputStream"
            defpackage.ajix.b((java.lang.String) r1, (java.lang.String) r11, (java.lang.Throwable) r10)     // Catch:{ all -> 0x00e3 }
            android.content.ContentResolver r3 = r3.getContentResolver()
            r3.delete(r5, r6, r6)
            if (r8 == 0) goto L_0x00a6
            r8.close()     // Catch:{ IOException -> 0x00a4, IllegalArgumentException -> 0x00a2 }
            goto L_0x00bc
        L_0x00a2:
            r3 = move-exception
            goto L_0x0071
        L_0x00a4:
            r3 = move-exception
            goto L_0x0071
        L_0x00a6:
            goto L_0x00bc
        L_0x00a7:
            r8 = move-exception
            r10 = r8
            r8 = r6
            r9 = r8
        L_0x00ab:
            java.lang.String r11 = "ContentUri file not found"
            defpackage.ajix.b((java.lang.String) r1, (java.lang.String) r11, (java.lang.Throwable) r10)     // Catch:{ all -> 0x00e3 }
            android.content.ContentResolver r3 = r3.getContentResolver()
            r3.delete(r5, r6, r6)
            if (r8 == 0) goto L_0x00a6
            r8.close()     // Catch:{ IOException -> 0x00a4, IllegalArgumentException -> 0x00a2 }
        L_0x00bc:
            if (r9 == 0) goto L_0x00c4
            byte[] r0 = r9.toByteArray()
            r14 = r0
            goto L_0x00c5
        L_0x00c4:
            r14 = r6
        L_0x00c5:
            if (r14 == 0) goto L_0x00e2
            ajhc r6 = new ajhc
            java.lang.String r0 = "data_version_key"
            int r9 = r4.getIntExtra(r0, r7)
            java.lang.String r0 = "boot_time"
            r7 = -1
            long r10 = r4.getLongExtra(r0, r7)
            java.lang.String r0 = "last_event_time"
            long r12 = r4.getLongExtra(r0, r7)
            r8 = r6
            r8.<init>(r9, r10, r12, r14)
            goto L_0x00f9
        L_0x00e2:
            goto L_0x00f9
        L_0x00e3:
            r2 = move-exception
        L_0x00e4:
            android.content.ContentResolver r3 = r3.getContentResolver()
            r3.delete(r5, r6, r6)
            if (r8 == 0) goto L_0x00f7
            r8.close()     // Catch:{ IOException -> 0x00f3, IllegalArgumentException -> 0x00f1 }
            goto L_0x00f7
        L_0x00f1:
            r3 = move-exception
            goto L_0x00f4
        L_0x00f3:
            r3 = move-exception
        L_0x00f4:
            defpackage.ajix.b((java.lang.String) r1, (java.lang.String) r0, (java.lang.Throwable) r3)
        L_0x00f7:
            throw r2
        L_0x00f8:
        L_0x00f9:
            r2.a = r6
            com.google.android.location.reporting.collectors.LocationHistorianDataRetriever$LogDataReceiver r0 = r15.c
            ajhc r0 = r0.a
            if (r0 == 0) goto L_0x0115
            long r0 = r0.c
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = 71
            r2.<init>(r3)
            java.lang.String r3 = "location historian data broadcast; last timestamp: "
            r2.append(r3)
            r2.append(r0)
            r2.toString()
        L_0x0115:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajhd.run():void");
    }
}
