package com.google.android.gms.common.download;

import com.google.android.chimera.IntentOperation;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class DownloadCompleteIntentOperation extends IntentOperation {
    /* JADX WARNING: Removed duplicated region for block: B:68:0x016b A[SYNTHETIC, Splitter:B:68:0x016b] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0170 A[Catch:{ IOException -> 0x017b }] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0177 A[Catch:{ IOException -> 0x017b }] */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x017f A[Catch:{ IOException -> 0x017b }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onHandleIntent(android.content.Intent r14) {
        /*
            r13 = this;
            java.lang.String r0 = "DownloadCompleteIntOp"
            java.lang.String r1 = r14.getAction()
            java.lang.String r2 = "android.intent.action.DOWNLOAD_COMPLETE"
            boolean r1 = r2.equals(r1)
            defpackage.irk.a((boolean) r1)
            java.lang.String r1 = "extra_download_id"
            r2 = -1
            long r4 = r14.getLongExtra(r1, r2)
            int r14 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r14 == 0) goto L_0x01a9
            com.google.android.gms.common.download.DownloadDetails r14 = defpackage.ipt.a((android.content.Context) r13, (long) r4)
            if (r14 == 0) goto L_0x01a9
            java.lang.String r1 = "download"
            java.lang.Object r1 = r13.getSystemService(r1)
            android.app.DownloadManager r1 = (android.app.DownloadManager) r1
            android.app.DownloadManager$Query r2 = new android.app.DownloadManager$Query
            r2.<init>()
            r3 = 1
            long[] r6 = new long[r3]
            r7 = 0
            r6[r7] = r4
            android.app.DownloadManager$Query r2 = r2.setFilterById(r6)
            android.database.Cursor r2 = defpackage.ipt.a((android.app.DownloadManager) r1, (android.app.DownloadManager.Query) r2)
            if (r2 == 0) goto L_0x019a
            int r6 = r2.getCount()     // Catch:{ all -> 0x01a2 }
            if (r6 == 0) goto L_0x019a
            boolean r6 = r2.moveToFirst()     // Catch:{ all -> 0x01a2 }
            if (r6 == 0) goto L_0x005f
            java.lang.String r6 = "status"
            int r6 = r2.getColumnIndexOrThrow(r6)     // Catch:{ all -> 0x01a2 }
            int r6 = r2.getInt(r6)     // Catch:{ all -> 0x01a2 }
            r8 = 8
            if (r6 == r8) goto L_0x005f
            defpackage.ipt.b((android.content.Context) r13, (long) r4)     // Catch:{ all -> 0x01a2 }
        L_0x005b:
            r2.close()
            return
        L_0x005f:
            r2.close()
            android.os.ParcelFileDescriptor r1 = r1.openDownloadedFile(r4)     // Catch:{ FileNotFoundException -> 0x0195, SecurityException -> 0x018e }
            if (r1 == 0) goto L_0x0188
            r2 = 0
            java.lang.String r6 = r14.e     // Catch:{ IOException -> 0x0162, all -> 0x015f }
            if (r6 == 0) goto L_0x0079
            java.io.File r6 = new java.io.File     // Catch:{ IOException -> 0x0162, all -> 0x015f }
            java.io.File r8 = r13.getFilesDir()     // Catch:{ IOException -> 0x0162, all -> 0x015f }
            java.lang.String r9 = r14.e     // Catch:{ IOException -> 0x0162, all -> 0x015f }
            r6.<init>(r8, r9)     // Catch:{ IOException -> 0x0162, all -> 0x015f }
            goto L_0x0082
        L_0x0079:
            java.io.File r6 = new java.io.File     // Catch:{ IOException -> 0x0162, all -> 0x015f }
            java.lang.String r8 = defpackage.ipu.b(r13)     // Catch:{ IOException -> 0x0162, all -> 0x015f }
            r6.<init>(r8)     // Catch:{ IOException -> 0x0162, all -> 0x015f }
        L_0x0082:
            boolean r8 = r6.exists()     // Catch:{ IOException -> 0x0162, all -> 0x015f }
            if (r8 == 0) goto L_0x0089
            goto L_0x008c
        L_0x0089:
            r6.mkdirs()     // Catch:{ IOException -> 0x0162, all -> 0x015f }
        L_0x008c:
            java.io.File r8 = new java.io.File     // Catch:{ IOException -> 0x0162, all -> 0x015f }
            java.lang.String r9 = r14.a     // Catch:{ IOException -> 0x0162, all -> 0x015f }
            r8.<init>(r6, r9)     // Catch:{ IOException -> 0x0162, all -> 0x015f }
            java.io.File r6 = new java.io.File     // Catch:{ IOException -> 0x0162, all -> 0x015f }
            java.lang.String r9 = r8.getAbsolutePath()     // Catch:{ IOException -> 0x0162, all -> 0x015f }
            java.lang.String r9 = java.lang.String.valueOf(r9)     // Catch:{ IOException -> 0x0162, all -> 0x015f }
            java.lang.String r10 = ".tmp"
            java.lang.String r9 = r9.concat(r10)     // Catch:{ IOException -> 0x0162, all -> 0x015f }
            r6.<init>(r9)     // Catch:{ IOException -> 0x0162, all -> 0x015f }
            android.os.ParcelFileDescriptor$AutoCloseInputStream r9 = new android.os.ParcelFileDescriptor$AutoCloseInputStream     // Catch:{ IOException -> 0x0162, all -> 0x015f }
            r9.<init>(r1)     // Catch:{ IOException -> 0x0162, all -> 0x015f }
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x015b, all -> 0x0157 }
            r1.<init>(r6)     // Catch:{ IOException -> 0x015b, all -> 0x0157 }
            r10 = 4096(0x1000, float:5.74E-42)
            byte[] r10 = new byte[r10]     // Catch:{ IOException -> 0x0155, all -> 0x0153 }
        L_0x00b4:
            int r11 = r9.read(r10)     // Catch:{ IOException -> 0x0155, all -> 0x0153 }
            r12 = -1
            if (r11 != r12) goto L_0x014d
            java.io.FileDescriptor r10 = r1.getFD()     // Catch:{ IOException -> 0x0155, all -> 0x0153 }
            r10.sync()     // Catch:{ IOException -> 0x0155, all -> 0x0153 }
            r9.close()     // Catch:{ IOException -> 0x017b }
            r1.close()     // Catch:{ IOException -> 0x017b }
            java.lang.String r1 = com.google.android.gms.common.download.DownloadIntentOperation.a((java.io.File) r6)
            java.lang.String r9 = r14.d
            boolean r1 = r1.equals(r9)
            if (r1 == 0) goto L_0x0141
            boolean r1 = r6.renameTo(r8)
            if (r1 == 0) goto L_0x013a
            r8.setExecutable(r7)
            r8.setWritable(r7)
            java.lang.String r14 = r14.a
            android.net.Uri r0 = defpackage.ipt.a((java.lang.String) r14)
            android.content.ContentValues r1 = new android.content.ContentValues
            r6 = 4
            r1.<init>(r6)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r7)
            java.lang.String r7 = "retries"
            r1.put(r7, r6)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.String r6 = "enabled"
            r1.put(r6, r3)
            java.lang.String r3 = "notificationTitle"
            r1.putNull(r3)
            java.lang.String r3 = "notificationDescription"
            r1.putNull(r3)
            android.content.ContentResolver r3 = r13.getContentResolver()
            int r0 = r3.update(r0, r1, r2, r2)
            if (r0 == 0) goto L_0x0114
            goto L_0x0183
        L_0x0114:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = java.lang.String.valueOf(r14)
            int r1 = r1.length()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            int r1 = r1 + 34
            r2.<init>(r1)
            java.lang.String r1 = "'"
            r2.append(r1)
            r2.append(r14)
            java.lang.String r14 = "' was not in the DownloadService."
            r2.append(r14)
            java.lang.String r14 = r2.toString()
            r0.<init>(r14)
            throw r0
        L_0x013a:
            java.lang.String r14 = "Failed to move file."
            android.util.Log.e(r0, r14)
            goto L_0x0183
        L_0x0141:
            java.lang.String r1 = "SHA-1 of downloaded file does not match request"
            android.util.Log.w(r0, r1)
            java.lang.String r14 = r14.a
            defpackage.ipt.a((android.content.Context) r13, (java.lang.String) r14)
            goto L_0x0183
        L_0x014d:
            r1.write(r10, r7, r11)     // Catch:{ IOException -> 0x0155, all -> 0x0153 }
            goto L_0x00b4
        L_0x0153:
            r14 = move-exception
            goto L_0x0159
        L_0x0155:
            r0 = move-exception
            goto L_0x015d
        L_0x0157:
            r14 = move-exception
            r1 = r2
        L_0x0159:
            r2 = r9
            goto L_0x0175
        L_0x015b:
            r0 = move-exception
            r1 = r2
        L_0x015d:
            r2 = r9
            goto L_0x0164
        L_0x015f:
            r14 = move-exception
            r1 = r2
            goto L_0x0175
        L_0x0162:
            r0 = move-exception
            r1 = r2
        L_0x0164:
            java.lang.String r14 = r14.a     // Catch:{ all -> 0x0174 }
            defpackage.ipt.a((android.content.Context) r13, (java.lang.String) r14)     // Catch:{ all -> 0x0174 }
            if (r2 == 0) goto L_0x016e
            r2.close()     // Catch:{ IOException -> 0x017b }
        L_0x016e:
            if (r1 == 0) goto L_0x0183
            r1.close()     // Catch:{ IOException -> 0x017b }
            goto L_0x0183
        L_0x0174:
            r14 = move-exception
        L_0x0175:
            if (r2 == 0) goto L_0x017d
            r2.close()     // Catch:{ IOException -> 0x017b }
            goto L_0x017d
        L_0x017b:
            r14 = move-exception
            goto L_0x0183
        L_0x017d:
            if (r1 == 0) goto L_0x0187
            r1.close()     // Catch:{ IOException -> 0x017b }
            goto L_0x0187
        L_0x0183:
            defpackage.ipt.b((android.content.Context) r13, (long) r4)
            return
        L_0x0187:
            throw r14
        L_0x0188:
            java.io.FileNotFoundException r14 = new java.io.FileNotFoundException     // Catch:{ FileNotFoundException -> 0x0195, SecurityException -> 0x018e }
            r14.<init>()     // Catch:{ FileNotFoundException -> 0x0195, SecurityException -> 0x018e }
            throw r14     // Catch:{ FileNotFoundException -> 0x0195, SecurityException -> 0x018e }
        L_0x018e:
            r14 = move-exception
            java.lang.String r1 = "Caught Exception"
            android.util.Log.e(r0, r1, r14)
            return
        L_0x0195:
            r14 = move-exception
            defpackage.ipt.b((android.content.Context) r13, (long) r4)
            return
        L_0x019a:
            defpackage.ipt.b((android.content.Context) r13, (long) r4)     // Catch:{ all -> 0x01a2 }
            if (r2 == 0) goto L_0x01a1
            goto L_0x005b
        L_0x01a1:
            return
        L_0x01a2:
            r14 = move-exception
            if (r2 == 0) goto L_0x01a8
            r2.close()
        L_0x01a8:
            throw r14
        L_0x01a9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.download.DownloadCompleteIntentOperation.onHandleIntent(android.content.Intent):void");
    }
}
