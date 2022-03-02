package defpackage;

import android.net.Uri;
import android.text.TextUtils;

/* renamed from: yse  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class yse {
    public final zcs a;
    public final zda b;
    public final zav c;

    public yse(zcs zcs, zda zda, zav zav) {
        this.a = zcs;
        this.b = zda;
        this.c = zav;
    }

    public static String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        Uri parse = Uri.parse(str);
        return TextUtils.isEmpty(parse.getPath()) ? parse.buildUpon().appendPath("").build().toString() : str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00dc, code lost:
        if (r0.equals(r6.getAsString("profile_image_url")) == false) goto L_0x00de;
     */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0152  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.ysy a(android.content.Context r18, com.google.android.gms.common.internal.ClientContext r19) {
        /*
            r17 = this;
            java.lang.String r0 = "plus_accounts"
            java.lang.String r1 = "signedUp"
            java.lang.String r2 = "display_name"
            java.lang.String r3 = "profile_image_url"
            r4 = 0
            android.content.pm.PackageManager r5 = r18.getPackageManager()     // Catch:{ all -> 0x014d }
            r12 = r19
            java.lang.String r6 = r12.e     // Catch:{ all -> 0x014d }
            java.lang.String r5 = defpackage.zak.a(r5, r6)     // Catch:{ all -> 0x014d }
            r13 = r17
            zcs r6 = r13.a     // Catch:{ all -> 0x014b }
            r14 = 1
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r14)     // Catch:{ all -> 0x014b }
            java.lang.String r8 = "native:android_app"
            java.lang.String r9 = "plusones/getsignupstate"
            if (r5 != 0) goto L_0x0025
            goto L_0x002f
        L_0x0025:
            java.lang.String r10 = "container"
            java.lang.String r5 = defpackage.iyv.a(r5)     // Catch:{ all -> 0x014b }
            java.lang.String r9 = defpackage.iyv.a((java.lang.String) r9, (java.lang.String) r10, (java.lang.String) r5)     // Catch:{ all -> 0x014b }
        L_0x002f:
            java.lang.String r5 = "nolog"
            java.lang.String r7 = java.lang.String.valueOf(r7)     // Catch:{ all -> 0x014b }
            java.lang.String r5 = defpackage.iyv.a((java.lang.String) r9, (java.lang.String) r5, (java.lang.String) r7)     // Catch:{ all -> 0x014b }
            java.lang.String r7 = "source"
            java.lang.String r8 = defpackage.iyv.a(r8)     // Catch:{ all -> 0x014b }
            java.lang.String r9 = defpackage.iyv.a((java.lang.String) r5, (java.lang.String) r7, (java.lang.String) r8)     // Catch:{ all -> 0x014b }
            izb r6 = r6.a     // Catch:{ all -> 0x014b }
            java.lang.Class<com.google.android.gms.plus.service.pos.GetsignupstateEntity> r11 = com.google.android.gms.plus.service.pos.GetsignupstateEntity.class
            r8 = 0
            r10 = 0
            r7 = r19
            jag r5 = r6.a((com.google.android.gms.common.internal.ClientContext) r7, (int) r8, (java.lang.String) r9, (java.lang.Object) r10, (java.lang.Class) r11)     // Catch:{ all -> 0x014b }
            com.google.android.gms.plus.service.pos.GetsignupstateEntity r5 = (com.google.android.gms.plus.service.pos.GetsignupstateEntity) r5     // Catch:{ all -> 0x014b }
            android.content.ContentValues r6 = new android.content.ContentValues     // Catch:{ all -> 0x014b }
            r6.<init>()     // Catch:{ all -> 0x014b }
            java.lang.String r7 = r5.c     // Catch:{ all -> 0x014b }
            r6.put(r2, r7)     // Catch:{ all -> 0x014b }
            boolean r7 = r5.f     // Catch:{ all -> 0x014b }
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)     // Catch:{ all -> 0x014b }
            r6.put(r1, r7)     // Catch:{ all -> 0x014b }
            iqu r7 = new iqu     // Catch:{ all -> 0x014b }
            java.lang.String r5 = r5.e     // Catch:{ all -> 0x014b }
            r7.<init>(r5)     // Catch:{ all -> 0x014b }
            iqt r5 = r7.b     // Catch:{ all -> 0x014b }
            android.content.res.Resources r8 = r18.getResources()     // Catch:{ all -> 0x014b }
            r9 = 2131166965(0x7f0706f5, float:1.794819E38)
            int r8 = r8.getDimensionPixelSize(r9)     // Catch:{ all -> 0x014b }
            r5.a((int) r8)     // Catch:{ all -> 0x014b }
            java.lang.String r5 = r7.a()     // Catch:{ all -> 0x014b }
            r6.put(r3, r5)     // Catch:{ all -> 0x014b }
            java.lang.String r5 = "account_name"
            java.lang.String r7 = r19.b()     // Catch:{ all -> 0x014b }
            r6.put(r5, r7)     // Catch:{ all -> 0x014b }
            android.content.ContentResolver r5 = r18.getContentResolver()     // Catch:{ all -> 0x014b }
            java.lang.String r7 = r19.b()     // Catch:{ all -> 0x014b }
            java.lang.String r8 = "com.google.android.gms.plus"
            android.content.ContentProviderClient r8 = r5.acquireContentProviderClient(r8)     // Catch:{ all -> 0x014b }
            com.google.android.chimera.ContentProvider r9 = com.google.android.chimera.ContentProvider.getLocalContentProvider(r8)     // Catch:{ all -> 0x0146 }
            com.google.android.gms.plus.provider.PlusChimeraContentProvider r9 = (com.google.android.gms.plus.provider.PlusChimeraContentProvider) r9     // Catch:{ all -> 0x0146 }
            android.content.ContentValues r10 = new android.content.ContentValues     // Catch:{ all -> 0x0146 }
            r10.<init>(r6)     // Catch:{ all -> 0x0146 }
            java.lang.String r11 = "updated"
            long r15 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0146 }
            java.lang.Long r15 = java.lang.Long.valueOf(r15)     // Catch:{ all -> 0x0146 }
            r10.put(r11, r15)     // Catch:{ all -> 0x0146 }
            zai r11 = r9.b     // Catch:{ all -> 0x0146 }
            android.database.sqlite.SQLiteDatabase r11 = r11.getWritableDatabase()     // Catch:{ all -> 0x0146 }
            r11.beginTransactionWithListener(r9)     // Catch:{ all -> 0x0146 }
            java.lang.String[] r15 = new java.lang.String[r14]     // Catch:{ all -> 0x0141 }
            r16 = 0
            r15[r16] = r7     // Catch:{ all -> 0x0141 }
            java.lang.String r14 = "account_name=?"
            int r14 = r11.update(r0, r10, r14, r15)     // Catch:{ all -> 0x0141 }
            if (r14 == 0) goto L_0x00ef
            android.content.ContentValues r0 = r9.b(r7, r11)     // Catch:{ all -> 0x0141 }
            java.lang.String r0 = r0.getAsString(r3)     // Catch:{ all -> 0x0141 }
            if (r0 != 0) goto L_0x00d3
            goto L_0x00de
        L_0x00d3:
            java.lang.String r6 = r6.getAsString(r3)     // Catch:{ all -> 0x0141 }
            boolean r0 = r0.equals(r6)     // Catch:{ all -> 0x0141 }
            if (r0 != 0) goto L_0x00f3
        L_0x00de:
            java.io.File r0 = new java.io.File     // Catch:{ all -> 0x0141 }
            java.io.File r6 = r9.c     // Catch:{ all -> 0x0141 }
            r0.<init>(r6, r7)     // Catch:{ all -> 0x0141 }
            boolean r6 = r0.exists()     // Catch:{ all -> 0x0141 }
            if (r6 == 0) goto L_0x00f3
            r0.delete()     // Catch:{ all -> 0x0141 }
            goto L_0x00f3
        L_0x00ef:
            r11.insert(r0, r4, r10)     // Catch:{ all -> 0x0141 }
        L_0x00f3:
            r11.setTransactionSuccessful()     // Catch:{ all -> 0x0141 }
            r11.endTransaction()     // Catch:{ all -> 0x0146 }
            r8.release()     // Catch:{ all -> 0x014b }
            java.lang.String r0 = r19.b()     // Catch:{ all -> 0x014b }
            android.database.Cursor r4 = defpackage.zaj.a(r5, r0)     // Catch:{ all -> 0x014b }
            boolean r0 = r4.moveToFirst()     // Catch:{ all -> 0x013f }
            if (r0 == 0) goto L_0x0132
            int r0 = r4.getColumnIndex(r2)     // Catch:{ all -> 0x013f }
            java.lang.String r0 = r4.getString(r0)     // Catch:{ all -> 0x013f }
            int r2 = r4.getColumnIndex(r3)     // Catch:{ all -> 0x013f }
            java.lang.String r2 = r4.getString(r2)     // Catch:{ all -> 0x013f }
            int r1 = r4.getColumnIndex(r1)     // Catch:{ all -> 0x013f }
            int r1 = r4.getInt(r1)     // Catch:{ all -> 0x013f }
            if (r1 == 0) goto L_0x0126
            r14 = 1
            goto L_0x0127
        L_0x0126:
            r14 = 0
        L_0x0127:
            ysy r1 = new ysy     // Catch:{ all -> 0x013f }
            r1.<init>(r0, r2, r14)     // Catch:{ all -> 0x013f }
            if (r4 == 0) goto L_0x0131
            r4.close()
        L_0x0131:
            return r1
        L_0x0132:
            java.lang.String r0 = "PosAgent"
            java.lang.String r1 = "Hit data removed condition"
            android.util.Log.e(r0, r1)     // Catch:{ all -> 0x013f }
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x013f }
            r0.<init>()     // Catch:{ all -> 0x013f }
            throw r0     // Catch:{ all -> 0x013f }
        L_0x013f:
            r0 = move-exception
            goto L_0x0150
        L_0x0141:
            r0 = move-exception
            r11.endTransaction()     // Catch:{ all -> 0x0146 }
            throw r0     // Catch:{ all -> 0x0146 }
        L_0x0146:
            r0 = move-exception
            r8.release()     // Catch:{ all -> 0x014b }
            throw r0     // Catch:{ all -> 0x014b }
        L_0x014b:
            r0 = move-exception
            goto L_0x0150
        L_0x014d:
            r0 = move-exception
            r13 = r17
        L_0x0150:
            if (r4 == 0) goto L_0x0155
            r4.close()
        L_0x0155:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yse.a(android.content.Context, com.google.android.gms.common.internal.ClientContext):ysy");
    }
}
