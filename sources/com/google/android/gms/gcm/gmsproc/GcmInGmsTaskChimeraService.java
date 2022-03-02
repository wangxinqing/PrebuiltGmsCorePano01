package com.google.android.gms.gcm.gmsproc;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class GcmInGmsTaskChimeraService extends qwf {
    /* JADX WARNING: Removed duplicated region for block: B:18:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00e1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int a(defpackage.qxz r10) {
        /*
            r9 = this;
            java.lang.String r0 = "regId"
            java.lang.String r10 = r10.a
            int r1 = r10.hashCode()
            r2 = -1877394740(0xffffffff90193acc, float:-3.0219225E-29)
            r3 = 2
            r4 = 0
            r5 = 1
            if (r1 == r2) goto L_0x002f
            r2 = -1512919536(0xffffffffa5d2ae10, float:-3.6547142E-16)
            if (r1 == r2) goto L_0x0025
            r2 = -1394514069(0xfffffffface1676b, float:-6.4063663E-12)
            if (r1 == r2) goto L_0x001b
            goto L_0x0039
        L_0x001b:
            java.lang.String r1 = "gms_registration"
            boolean r1 = r10.equals(r1)
            if (r1 == 0) goto L_0x0039
            r1 = 0
            goto L_0x003a
        L_0x0025:
            java.lang.String r1 = "direct_boot_registration"
            boolean r1 = r10.equals(r1)
            if (r1 == 0) goto L_0x0039
            r1 = 2
            goto L_0x003a
        L_0x002f:
            java.lang.String r1 = "groups_upload"
            boolean r1 = r10.equals(r1)
            if (r1 == 0) goto L_0x0039
            r1 = 1
            goto L_0x003a
        L_0x0039:
            r1 = -1
        L_0x003a:
            java.lang.String r2 = "GCM-GMS"
            if (r1 == 0) goto L_0x00e1
            if (r1 == r5) goto L_0x00d5
            if (r1 == r3) goto L_0x005c
            java.lang.String r10 = java.lang.String.valueOf(r10)
            java.lang.String r0 = "Unknown task tag: "
            int r1 = r10.length()
            if (r1 != 0) goto L_0x0054
            java.lang.String r10 = new java.lang.String
            r10.<init>(r0)
            goto L_0x0058
        L_0x0054:
            java.lang.String r10 = r0.concat(r10)
        L_0x0058:
            android.util.Log.e(r2, r10)
            return r3
        L_0x005c:
            boolean r10 = defpackage.aekv.a()
            if (r10 == 0) goto L_0x00d4
            boolean r10 = defpackage.axkn.e()
            if (r10 == 0) goto L_0x00d4
            r10 = 4
            boolean r0 = android.util.Log.isLoggable(r2, r10)
            if (r0 == 0) goto L_0x0074
            java.lang.String r0 = "Registering GMS for direct boot."
            android.util.Log.i(r2, r0)
        L_0x0074:
            qdc r0 = defpackage.qdc.a((android.content.Context) r9)     // Catch:{ IOException -> 0x00a9 }
            java.lang.String r1 = defpackage.axlc.o()     // Catch:{ IOException -> 0x00a9 }
            axlc r3 = defpackage.axlc.a     // Catch:{ IOException -> 0x00a9 }
            axld r3 = r3.a()     // Catch:{ IOException -> 0x00a9 }
            java.lang.String r3 = r3.w()     // Catch:{ IOException -> 0x00a9 }
            java.lang.String r0 = r0.a(r1, r3)     // Catch:{ IOException -> 0x00a9 }
            android.content.SharedPreferences r1 = defpackage.nvu.c(r9)     // Catch:{ IOException -> 0x00a9 }
            android.content.SharedPreferences$Editor r1 = r1.edit()     // Catch:{ IOException -> 0x00a9 }
            java.lang.String r3 = "gcm_local_directboot_token"
            r1.putString(r3, r0)     // Catch:{ IOException -> 0x00a9 }
            boolean r10 = android.util.Log.isLoggable(r2, r10)     // Catch:{ IOException -> 0x00a9 }
            if (r10 == 0) goto L_0x00a2
            java.lang.String r10 = "Got GMS direct boot token."
            android.util.Log.i(r2, r10)     // Catch:{ IOException -> 0x00a9 }
        L_0x00a2:
            boolean r10 = r1.commit()     // Catch:{ IOException -> 0x00a9 }
            if (r10 != 0) goto L_0x00d4
            goto L_0x00d3
        L_0x00a9:
            r10 = move-exception
            r0 = 5
            boolean r0 = android.util.Log.isLoggable(r2, r0)
            if (r0 == 0) goto L_0x00d3
            java.lang.String r10 = java.lang.String.valueOf(r10)
            java.lang.String r0 = java.lang.String.valueOf(r10)
            int r0 = r0.length()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            int r0 = r0 + 33
            r1.<init>(r0)
            java.lang.String r0 = "Failed to get direct boot token: "
            r1.append(r0)
            r1.append(r10)
            java.lang.String r10 = r1.toString()
            android.util.Log.w(r2, r10)
        L_0x00d3:
            return r5
        L_0x00d4:
            return r4
        L_0x00d5:
            nvv r10 = defpackage.nvv.a((android.content.Context) r9)
            boolean r10 = r10.b()
            if (r10 == 0) goto L_0x00e0
            return r4
        L_0x00e0:
            return r5
        L_0x00e1:
            java.lang.String r10 = defpackage.axlc.o()
            java.lang.String r1 = java.lang.String.valueOf(r10)
            java.lang.String r3 = "Registering GMS "
            int r6 = r1.length()
            if (r6 != 0) goto L_0x00f7
            java.lang.String r1 = new java.lang.String
            r1.<init>(r3)
            goto L_0x00fb
        L_0x00f7:
            java.lang.String r1 = r3.concat(r1)
        L_0x00fb:
            android.util.Log.i(r2, r1)
            qdc r1 = defpackage.qdc.a((android.content.Context) r9)     // Catch:{ IOException -> 0x0156 }
            java.lang.String r3 = "GCM"
            java.lang.String r1 = r1.a(r10, r3)     // Catch:{ IOException -> 0x0156 }
            java.lang.String r3 = "Got GMS registration"
            android.util.Log.i(r2, r3)     // Catch:{ IOException -> 0x0156 }
            android.content.SharedPreferences r3 = defpackage.nsm.b(r9)     // Catch:{ IOException -> 0x0156 }
            java.lang.String r6 = ""
            java.lang.String r6 = r3.getString(r0, r6)     // Catch:{ IOException -> 0x0156 }
            android.content.SharedPreferences$Editor r3 = r3.edit()     // Catch:{ IOException -> 0x0156 }
            r3.putString(r0, r1)     // Catch:{ IOException -> 0x0156 }
            java.lang.String r0 = "sender"
            r3.putString(r0, r10)     // Catch:{ IOException -> 0x0156 }
            java.lang.String r10 = "GCM_V"
            r0 = 201216073(0xbfe5049, float:9.795804E-32)
            r3.putInt(r10, r0)     // Catch:{ IOException -> 0x0156 }
            java.lang.String r10 = "reg_time"
            long r7 = java.lang.System.currentTimeMillis()     // Catch:{ IOException -> 0x0156 }
            r3.putLong(r10, r7)     // Catch:{ IOException -> 0x0156 }
            boolean r10 = r3.commit()     // Catch:{ IOException -> 0x0156 }
            if (r10 != 0) goto L_0x0140
            java.lang.String r10 = "Failed to write GMS registration"
            android.util.Log.w(r2, r10)     // Catch:{ IOException -> 0x0156 }
            goto L_0x0155
        L_0x0140:
            boolean r10 = r1.equals(r6)     // Catch:{ IOException -> 0x0156 }
            if (r10 != 0) goto L_0x0155
            android.content.Intent r10 = new android.content.Intent     // Catch:{ IOException -> 0x0156 }
            java.lang.String r0 = "com.google.android.gms.gcm.REGISTERED"
            r10.<init>(r0)     // Catch:{ IOException -> 0x0156 }
            java.lang.String r0 = "com.google.android.gms"
            r10.setPackage(r0)     // Catch:{ IOException -> 0x0156 }
            r9.sendBroadcast(r10)     // Catch:{ IOException -> 0x0156 }
        L_0x0155:
            return r4
        L_0x0156:
            r10 = move-exception
            java.lang.String r10 = java.lang.String.valueOf(r10)
            java.lang.String r0 = java.lang.String.valueOf(r10)
            int r0 = r0.length()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            int r0 = r0 + 28
            r1.<init>(r0)
            java.lang.String r0 = "Failed to get registration: "
            r1.append(r0)
            r1.append(r10)
            java.lang.String r10 = r1.toString()
            android.util.Log.w(r2, r10)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.gcm.gmsproc.GcmInGmsTaskChimeraService.a(qxz):int");
    }
}
