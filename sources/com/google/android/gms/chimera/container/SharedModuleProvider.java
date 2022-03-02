package com.google.android.gms.chimera.container;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.UserManager;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class SharedModuleProvider extends ContentProvider {
    private UserManager a = null;
    private Context b;

    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00f5, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized android.os.Bundle call(java.lang.String r5, java.lang.String r6, android.os.Bundle r7) {
        /*
            r4 = this;
            monitor-enter(r4)
            boolean r6 = defpackage.awxo.b()     // Catch:{ all -> 0x00f6 }
            r0 = 0
            if (r6 == 0) goto L_0x0009
        L_0x0008:
            goto L_0x0010
        L_0x0009:
            boolean r6 = defpackage.awxo.i()     // Catch:{ all -> 0x00f6 }
            if (r6 == 0) goto L_0x00f4
            goto L_0x0008
        L_0x0010:
            android.os.UserManager r6 = r4.a     // Catch:{ all -> 0x00f6 }
            if (r6 == 0) goto L_0x00f4
            android.os.UserHandle r1 = android.os.Binder.getCallingUserHandle()     // Catch:{ all -> 0x00f6 }
            long r1 = r6.getSerialNumberForUser(r1)     // Catch:{ all -> 0x00f6 }
            java.lang.String r6 = "exchangeInfo"
            boolean r6 = r6.equals(r5)     // Catch:{ all -> 0x00f6 }
            if (r6 != 0) goto L_0x004e
            java.lang.String r6 = java.lang.String.valueOf(r5)     // Catch:{ all -> 0x00f6 }
            int r6 = r6.length()     // Catch:{ all -> 0x00f6 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x00f6 }
            int r6 = r6 + 52
            r7.<init>(r6)     // Catch:{ all -> 0x00f6 }
            java.lang.String r6 = "Unknown method call: "
            r7.append(r6)     // Catch:{ all -> 0x00f6 }
            r7.append(r5)     // Catch:{ all -> 0x00f6 }
            java.lang.String r5 = " from user "
            r7.append(r5)     // Catch:{ all -> 0x00f6 }
            r7.append(r1)     // Catch:{ all -> 0x00f6 }
            java.lang.String r5 = "SharedModuleProvider"
            java.lang.String r6 = r7.toString()     // Catch:{ all -> 0x00f6 }
            android.util.Log.e(r5, r6)     // Catch:{ all -> 0x00f6 }
            monitor-exit(r4)
            return r0
        L_0x004e:
            if (r7 != 0) goto L_0x006a
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x00f6 }
            r6 = 48
            r5.<init>(r6)     // Catch:{ all -> 0x00f6 }
            java.lang.String r6 = "null bundle input from user "
            r5.append(r6)     // Catch:{ all -> 0x00f6 }
            r5.append(r1)     // Catch:{ all -> 0x00f6 }
            java.lang.String r6 = "SharedModuleProvider"
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x00f6 }
            android.util.Log.e(r6, r5)     // Catch:{ all -> 0x00f6 }
            monitor-exit(r4)
            return r0
        L_0x006a:
            java.lang.String r5 = "UpdateRequest"
            byte[] r5 = r7.getByteArray(r5)     // Catch:{ all -> 0x00f6 }
            if (r5 == 0) goto L_0x00dc
            aubs r6 = defpackage.aubs.b()     // Catch:{ auda -> 0x00ad }
            hgt r3 = defpackage.hgt.d     // Catch:{ auda -> 0x00ad }
            aucj r5 = defpackage.aucj.a((defpackage.aucj) r3, (byte[]) r5, (defpackage.aubs) r6)     // Catch:{ auda -> 0x00ad }
            hgt r5 = (defpackage.hgt) r5     // Catch:{ auda -> 0x00ad }
            android.content.Context r6 = r4.b     // Catch:{ all -> 0x00f6 }
            hgr r6 = defpackage.hgr.a(r6)     // Catch:{ all -> 0x00f6 }
            hgt r5 = r6.a(r5, r1)     // Catch:{ all -> 0x00f6 }
            if (r5 == 0) goto L_0x00ab
            java.lang.String r6 = "UrgentFeatures"
            byte[] r6 = r7.getByteArray(r6)     // Catch:{ all -> 0x00f6 }
            if (r6 == 0) goto L_0x009d
            android.content.Context r1 = r4.b     // Catch:{ all -> 0x00f6 }
            android.content.Intent r6 = defpackage.ble.a(r1, r6, r0, r0)     // Catch:{ all -> 0x00f6 }
            android.content.Context r0 = r4.b     // Catch:{ all -> 0x00f6 }
            r0.startService(r6)     // Catch:{ all -> 0x00f6 }
        L_0x009d:
            r7.clear()     // Catch:{ all -> 0x00f6 }
            java.lang.String r6 = "UpdateRequest"
            byte[] r5 = r5.k()     // Catch:{ all -> 0x00f6 }
            r7.putByteArray(r6, r5)     // Catch:{ all -> 0x00f6 }
            monitor-exit(r4)
            return r7
        L_0x00ab:
            monitor-exit(r4)
            return r0
        L_0x00ad:
            r5 = move-exception
            java.lang.String r5 = r5.getMessage()     // Catch:{ all -> 0x00f6 }
            java.lang.String r6 = java.lang.String.valueOf(r5)     // Catch:{ all -> 0x00f6 }
            int r6 = r6.length()     // Catch:{ all -> 0x00f6 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x00f6 }
            int r6 = r6 + 61
            r7.<init>(r6)     // Catch:{ all -> 0x00f6 }
            java.lang.String r6 = "error parsing update request from user "
            r7.append(r6)     // Catch:{ all -> 0x00f6 }
            r7.append(r1)     // Catch:{ all -> 0x00f6 }
            java.lang.String r6 = ": "
            r7.append(r6)     // Catch:{ all -> 0x00f6 }
            r7.append(r5)     // Catch:{ all -> 0x00f6 }
            java.lang.String r5 = "SharedModuleProvider"
            java.lang.String r6 = r7.toString()     // Catch:{ all -> 0x00f6 }
            android.util.Log.e(r5, r6)     // Catch:{ all -> 0x00f6 }
            monitor-exit(r4)
            return r0
        L_0x00dc:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x00f6 }
            r6 = 50
            r5.<init>(r6)     // Catch:{ all -> 0x00f6 }
            java.lang.String r6 = "null module request from user "
            r5.append(r6)     // Catch:{ all -> 0x00f6 }
            r5.append(r1)     // Catch:{ all -> 0x00f6 }
            java.lang.String r6 = "SharedModuleProvider"
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x00f6 }
            android.util.Log.e(r6, r5)     // Catch:{ all -> 0x00f6 }
        L_0x00f4:
            monitor-exit(r4)
            return r0
        L_0x00f6:
            r5 = move-exception
            monitor-exit(r4)
            goto L_0x00fa
        L_0x00f9:
            throw r5
        L_0x00fa:
            goto L_0x00f9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.chimera.container.SharedModuleProvider.call(java.lang.String, java.lang.String, android.os.Bundle):android.os.Bundle");
    }

    public final int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    public final String getType(Uri uri) {
        return null;
    }

    public final Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    public final boolean onCreate() {
        Context context = getContext();
        amtf.a((Object) context);
        this.b = context;
        int i = Build.VERSION.SDK_INT;
        this.a = (UserManager) context.getSystemService("user");
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x004d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.os.ParcelFileDescriptor openFile(android.net.Uri r5, java.lang.String r6) {
        /*
            r4 = this;
            android.content.Context r6 = r4.b
            blu r6 = defpackage.blu.a((android.content.Context) r6)
            anaf r6 = r6.e()
            r0 = 0
            if (r6 == 0) goto L_0x005f
            java.lang.String r5 = r5.getPath()
            if (r5 == 0) goto L_0x005f
            r1 = 1
            java.lang.String r5 = r5.substring(r1)
            android.net.Uri r5 = android.net.Uri.parse(r5)
            java.lang.String r2 = r5.getScheme()
            java.lang.String r3 = "moduleapk-identifier"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0046
            java.util.List r5 = r5.getPathSegments()
            int r2 = r5.size()
            r3 = 2
            if (r2 != r3) goto L_0x0046
            bmr r2 = new bmr
            r3 = 0
            java.lang.Object r3 = r5.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r5 = r5.get(r1)
            java.lang.String r5 = (java.lang.String) r5
            r2.<init>(r3, r5)
            goto L_0x0047
        L_0x0046:
            r2 = r0
        L_0x0047:
            boolean r5 = r6.containsKey(r2)
            if (r5 == 0) goto L_0x005f
            java.io.File r5 = new java.io.File
            java.lang.Object r6 = r6.get(r2)
            java.lang.String r6 = (java.lang.String) r6
            r5.<init>(r6)
            r6 = 268435456(0x10000000, float:2.5243549E-29)
            android.os.ParcelFileDescriptor r5 = android.os.ParcelFileDescriptor.open(r5, r6)
            return r5
        L_0x005f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.chimera.container.SharedModuleProvider.openFile(android.net.Uri, java.lang.String):android.os.ParcelFileDescriptor");
    }

    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }
}
