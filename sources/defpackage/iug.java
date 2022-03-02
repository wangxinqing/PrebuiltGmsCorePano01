package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;

/* renamed from: iug  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class iug extends bhw implements iuh {
    private final Context a;

    public iug() {
        super("com.google.android.gms.common.internal.ISharedPreferencesService");
    }

    private final void a(String str, String str2) {
        Intent intent = new Intent();
        intent.setPackage("com.google.android.gms");
        intent.setAction("com.google.android.gms.common.internal.SHARED_PREFERENCES_CHANGED");
        String valueOf = String.valueOf(str);
        intent.addCategory(valueOf.length() == 0 ? new String("com.google.android.gms.common.internal.SHARED_PREFERENCES:") : "com.google.android.gms.common.internal.SHARED_PREFERENCES:".concat(valueOf));
        intent.putExtra("KEY_NAME", str2);
        this.a.sendBroadcast(intent, "com.google.android.gms.common.internal.SHARED_PREFERENCES_PERMISSION");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: android.os.Bundle} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: ivi} */
    /* JADX WARNING: type inference failed for: r2v3 */
    /* JADX WARNING: type inference failed for: r2v6 */
    /* JADX WARNING: type inference failed for: r2v8 */
    /* JADX WARNING: type inference failed for: r2v10 */
    /* JADX WARNING: type inference failed for: r2v12 */
    /* JADX WARNING: type inference failed for: r2v14 */
    /* JADX WARNING: type inference failed for: r2v16 */
    /* JADX WARNING: type inference failed for: r2v18 */
    /* JADX WARNING: type inference failed for: r2v19 */
    /* JADX WARNING: type inference failed for: r2v21, types: [java.util.Set] */
    /* JADX WARNING: type inference failed for: r2v33 */
    /* JADX WARNING: type inference failed for: r2v35 */
    /* JADX WARNING: type inference failed for: r2v36 */
    /* JADX WARNING: type inference failed for: r2v37 */
    /* JADX WARNING: type inference failed for: r2v38 */
    /* JADX WARNING: type inference failed for: r2v39 */
    /* JADX WARNING: type inference failed for: r2v40 */
    /* JADX WARNING: type inference failed for: r2v41 */
    /* JADX WARNING: type inference failed for: r2v42 */
    /* JADX WARNING: type inference failed for: r2v43 */
    /* JADX WARNING: type inference failed for: r2v44 */
    /* JADX WARNING: type inference failed for: r2v45 */
    /* JADX WARNING: type inference failed for: r2v46 */
    /* JADX WARNING: type inference failed for: r2v47 */
    /* JADX WARNING: type inference failed for: r2v48 */
    /* JADX WARNING: type inference failed for: r2v49 */
    /* JADX WARNING: type inference failed for: r2v50 */
    /* JADX WARNING: type inference failed for: r2v51 */
    /* JADX WARNING: type inference failed for: r2v52 */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.os.Bundle a(java.lang.String r20, int r21, android.os.Bundle r22) {
        /*
            r19 = this;
            r1 = r19
            r0 = r20
            r2 = r22
            r3 = 0
            java.lang.String r4 = "FUNCTION_NAME"
            java.lang.String r4 = r2.getString(r4)     // Catch:{ Exception -> 0x043c }
            java.lang.String r5 = "KEY_NAME"
            java.lang.String r5 = r2.getString(r5)     // Catch:{ Exception -> 0x043c }
            java.lang.String r6 = "isDirectBoot"
            boolean r6 = r2.getBoolean(r6, r3)     // Catch:{ Exception -> 0x043c }
            if (r6 == 0) goto L_0x0022
            android.content.Context r7 = r1.a     // Catch:{ Exception -> 0x043c }
            android.content.Context r7 = defpackage.aekv.d(r7)     // Catch:{ Exception -> 0x043c }
            goto L_0x0024
        L_0x0022:
            android.content.Context r7 = r1.a     // Catch:{ Exception -> 0x043c }
        L_0x0024:
            if (r0 == 0) goto L_0x002d
            r8 = r21
            android.content.SharedPreferences r8 = r7.getSharedPreferences(r0, r8)     // Catch:{ Exception -> 0x043c }
            goto L_0x0031
        L_0x002d:
            android.content.SharedPreferences r8 = android.preference.PreferenceManager.getDefaultSharedPreferences(r7)     // Catch:{ Exception -> 0x043c }
        L_0x0031:
            boolean r9 = defpackage.awyg.c()     // Catch:{ Exception -> 0x043c }
            if (r9 != 0) goto L_0x0038
            goto L_0x003e
        L_0x0038:
            ivi r9 = new ivi     // Catch:{ Exception -> 0x043c }
            r9.<init>(r8)     // Catch:{ Exception -> 0x043c }
            r8 = r9
        L_0x003e:
            int r9 = r4.hashCode()
            java.lang.String r10 = "getFloat"
            java.lang.String r11 = "getBoolean"
            java.lang.String r12 = "getString"
            java.lang.String r13 = "moveSharedPreferencesFrom"
            java.lang.String r14 = "edit"
            java.lang.String r15 = "getLong"
            java.lang.String r3 = "getStringSet"
            java.lang.String r2 = "contains"
            r16 = r5
            java.lang.String r5 = "getInt"
            r21 = r8
            java.lang.String r8 = "getAll"
            r17 = 1
            switch(r9) {
                case -2018571198: goto L_0x0120;
                case -1354815177: goto L_0x0115;
                case -1249367445: goto L_0x010d;
                case -1249359687: goto L_0x0105;
                case -976920992: goto L_0x00fa;
                case -934610812: goto L_0x00ef;
                case -567445985: goto L_0x00e7;
                case -462997504: goto L_0x00dc;
                case -219689429: goto L_0x00d1;
                case -198897701: goto L_0x00c9;
                case -75354382: goto L_0x00c0;
                case 3108362: goto L_0x00b6;
                case 93029230: goto L_0x00aa;
                case 94746189: goto L_0x009e;
                case 219124812: goto L_0x0094;
                case 478450201: goto L_0x0088;
                case 804029191: goto L_0x007f;
                case 1101572082: goto L_0x0076;
                case 1773932685: goto L_0x006a;
                case 1953351846: goto L_0x0061;
                default: goto L_0x005f;
            }
        L_0x005f:
            goto L_0x012b
        L_0x0061:
            boolean r9 = r4.equals(r10)
            if (r9 == 0) goto L_0x012b
            r9 = 3
            goto L_0x012c
        L_0x006a:
            java.lang.String r9 = "putFloat"
            boolean r9 = r4.equals(r9)
            if (r9 == 0) goto L_0x012b
            r9 = 13
            goto L_0x012c
        L_0x0076:
            boolean r9 = r4.equals(r11)
            if (r9 == 0) goto L_0x012b
            r9 = 2
            goto L_0x012c
        L_0x007f:
            boolean r9 = r4.equals(r12)
            if (r9 == 0) goto L_0x012b
            r9 = 6
            goto L_0x012c
        L_0x0088:
            java.lang.String r9 = "putBoolean"
            boolean r9 = r4.equals(r9)
            if (r9 == 0) goto L_0x012b
            r9 = 12
            goto L_0x012c
        L_0x0094:
            boolean r9 = r4.equals(r13)
            if (r9 == 0) goto L_0x012b
            r9 = 19
            goto L_0x012c
        L_0x009e:
            java.lang.String r9 = "clear"
            boolean r9 = r4.equals(r9)
            if (r9 == 0) goto L_0x012b
            r9 = 9
            goto L_0x012c
        L_0x00aa:
            java.lang.String r9 = "apply"
            boolean r9 = r4.equals(r9)
            if (r9 == 0) goto L_0x012b
            r9 = 10
            goto L_0x012c
        L_0x00b6:
            boolean r9 = r4.equals(r14)
            if (r9 == 0) goto L_0x012b
            r9 = 8
            goto L_0x012c
        L_0x00c0:
            boolean r9 = r4.equals(r15)
            if (r9 == 0) goto L_0x012b
            r9 = 5
            goto L_0x012c
        L_0x00c9:
            boolean r9 = r4.equals(r3)
            if (r9 == 0) goto L_0x012b
            r9 = 7
            goto L_0x012c
        L_0x00d1:
            java.lang.String r9 = "putLong"
            boolean r9 = r4.equals(r9)
            if (r9 == 0) goto L_0x012b
            r9 = 15
            goto L_0x012c
        L_0x00dc:
            java.lang.String r9 = "putString"
            boolean r9 = r4.equals(r9)
            if (r9 == 0) goto L_0x012b
            r9 = 16
            goto L_0x012c
        L_0x00e7:
            boolean r9 = r4.equals(r2)
            if (r9 == 0) goto L_0x012b
            r9 = 0
            goto L_0x012c
        L_0x00ef:
            java.lang.String r9 = "remove"
            boolean r9 = r4.equals(r9)
            if (r9 == 0) goto L_0x012b
            r9 = 18
            goto L_0x012c
        L_0x00fa:
            java.lang.String r9 = "putInt"
            boolean r9 = r4.equals(r9)
            if (r9 == 0) goto L_0x012b
            r9 = 14
            goto L_0x012c
        L_0x0105:
            boolean r9 = r4.equals(r5)
            if (r9 == 0) goto L_0x012b
            r9 = 4
            goto L_0x012c
        L_0x010d:
            boolean r9 = r4.equals(r8)
            if (r9 == 0) goto L_0x012b
            r9 = 1
            goto L_0x012c
        L_0x0115:
            java.lang.String r9 = "commit"
            boolean r9 = r4.equals(r9)
            if (r9 == 0) goto L_0x012b
            r9 = 11
            goto L_0x012c
        L_0x0120:
            java.lang.String r9 = "putStringSet"
            boolean r9 = r4.equals(r9)
            if (r9 == 0) goto L_0x012b
            r9 = 17
            goto L_0x012c
        L_0x012b:
            r9 = -1
        L_0x012c:
            java.lang.String r0 = "value"
            r18 = r2
            r2 = 0
            switch(r9) {
                case 0: goto L_0x0404;
                case 1: goto L_0x03e4;
                case 2: goto L_0x03c8;
                case 3: goto L_0x03ab;
                case 4: goto L_0x038e;
                case 5: goto L_0x0370;
                case 6: goto L_0x0351;
                case 7: goto L_0x0325;
                case 8: goto L_0x023d;
                case 9: goto L_0x022a;
                case 10: goto L_0x0222;
                case 11: goto L_0x0222;
                case 12: goto L_0x020b;
                case 13: goto L_0x01f4;
                case 14: goto L_0x01dd;
                case 15: goto L_0x01c6;
                case 16: goto L_0x01af;
                case 17: goto L_0x0186;
                case 18: goto L_0x0175;
                case 19: goto L_0x013c;
                default: goto L_0x0134;
            }
        L_0x0134:
            r6 = r20
            r7 = r16
            java.lang.String r0 = "SharedPrefsSvc"
            goto L_0x041b
        L_0x013c:
            boolean r0 = defpackage.aekv.a()     // Catch:{ Exception -> 0x043c }
            if (r0 != 0) goto L_0x014a
            r6 = r20
            r7 = r16
            r17 = 0
            goto L_0x0436
        L_0x014a:
            if (r6 == 0) goto L_0x016d
            android.content.Context r0 = r1.a     // Catch:{ Exception -> 0x043c }
            boolean r0 = defpackage.aekv.b(r0)     // Catch:{ Exception -> 0x043c }
            if (r0 == 0) goto L_0x016d
            android.content.Context r0 = r1.a     // Catch:{ Exception -> 0x043c }
            boolean r0 = r0.isDeviceProtectedStorage()     // Catch:{ Exception -> 0x043c }
            if (r0 != 0) goto L_0x016d
            android.os.Bundle r2 = new android.os.Bundle     // Catch:{ Exception -> 0x043c }
            r2.<init>()     // Catch:{ Exception -> 0x043c }
            android.content.Context r0 = r1.a     // Catch:{ Exception -> 0x043c }
            r6 = r20
            boolean r0 = r7.moveSharedPreferencesFrom(r0, r6)     // Catch:{ Exception -> 0x043c }
            r2.putBoolean(r13, r0)     // Catch:{ Exception -> 0x043c }
            goto L_0x016f
        L_0x016d:
            r6 = r20
        L_0x016f:
            r7 = r16
            r17 = 0
            goto L_0x0436
        L_0x0175:
            r6 = r20
            android.content.SharedPreferences$Editor r0 = r21.edit()     // Catch:{ Exception -> 0x043c }
            r7 = r16
            android.content.SharedPreferences$Editor r0 = r0.remove(r7)     // Catch:{ Exception -> 0x043c }
            r0.apply()     // Catch:{ Exception -> 0x043c }
            goto L_0x0436
        L_0x0186:
            r6 = r20
            r7 = r16
            r3 = r22
            java.lang.String[] r0 = r3.getStringArray(r0)     // Catch:{ Exception -> 0x043c }
            if (r0 == 0) goto L_0x019e
            int r3 = r0.length     // Catch:{ Exception -> 0x043c }
            if (r3 <= 0) goto L_0x019e
            ob r3 = new ob     // Catch:{ Exception -> 0x043c }
            r3.<init>()     // Catch:{ Exception -> 0x043c }
            java.util.Collections.addAll(r3, r0)     // Catch:{ Exception -> 0x043c }
            goto L_0x01a2
        L_0x019e:
            java.util.Set r3 = java.util.Collections.emptySet()     // Catch:{ Exception -> 0x043c }
        L_0x01a2:
            android.content.SharedPreferences$Editor r0 = r21.edit()     // Catch:{ Exception -> 0x043c }
            android.content.SharedPreferences$Editor r0 = r0.putStringSet(r7, r3)     // Catch:{ Exception -> 0x043c }
            r0.apply()     // Catch:{ Exception -> 0x043c }
            goto L_0x0436
        L_0x01af:
            r6 = r20
            r3 = r22
            r7 = r16
            android.content.SharedPreferences$Editor r4 = r21.edit()     // Catch:{ Exception -> 0x043c }
            java.lang.String r0 = r3.getString(r0)     // Catch:{ Exception -> 0x043c }
            android.content.SharedPreferences$Editor r0 = r4.putString(r7, r0)     // Catch:{ Exception -> 0x043c }
            r0.apply()     // Catch:{ Exception -> 0x043c }
            goto L_0x0436
        L_0x01c6:
            r6 = r20
            r3 = r22
            r7 = r16
            android.content.SharedPreferences$Editor r4 = r21.edit()     // Catch:{ Exception -> 0x043c }
            long r8 = r3.getLong(r0)     // Catch:{ Exception -> 0x043c }
            android.content.SharedPreferences$Editor r0 = r4.putLong(r7, r8)     // Catch:{ Exception -> 0x043c }
            r0.apply()     // Catch:{ Exception -> 0x043c }
            goto L_0x0436
        L_0x01dd:
            r6 = r20
            r3 = r22
            r7 = r16
            android.content.SharedPreferences$Editor r4 = r21.edit()     // Catch:{ Exception -> 0x043c }
            int r0 = r3.getInt(r0)     // Catch:{ Exception -> 0x043c }
            android.content.SharedPreferences$Editor r0 = r4.putInt(r7, r0)     // Catch:{ Exception -> 0x043c }
            r0.apply()     // Catch:{ Exception -> 0x043c }
            goto L_0x0436
        L_0x01f4:
            r6 = r20
            r3 = r22
            r7 = r16
            android.content.SharedPreferences$Editor r4 = r21.edit()     // Catch:{ Exception -> 0x043c }
            float r0 = r3.getFloat(r0)     // Catch:{ Exception -> 0x043c }
            android.content.SharedPreferences$Editor r0 = r4.putFloat(r7, r0)     // Catch:{ Exception -> 0x043c }
            r0.apply()     // Catch:{ Exception -> 0x043c }
            goto L_0x0436
        L_0x020b:
            r6 = r20
            r3 = r22
            r7 = r16
            android.content.SharedPreferences$Editor r4 = r21.edit()     // Catch:{ Exception -> 0x043c }
            boolean r0 = r3.getBoolean(r0)     // Catch:{ Exception -> 0x043c }
            android.content.SharedPreferences$Editor r0 = r4.putBoolean(r7, r0)     // Catch:{ Exception -> 0x043c }
            r0.apply()     // Catch:{ Exception -> 0x043c }
            goto L_0x0436
        L_0x0222:
            r6 = r20
            r7 = r16
        L_0x0226:
            r17 = 0
            goto L_0x0436
        L_0x022a:
            r6 = r20
            r7 = r16
            android.content.SharedPreferences$Editor r0 = r21.edit()     // Catch:{ Exception -> 0x043c }
            android.content.SharedPreferences$Editor r0 = r0.clear()     // Catch:{ Exception -> 0x043c }
            r0.apply()     // Catch:{ Exception -> 0x043c }
            r17 = 0
            goto L_0x0436
        L_0x023d:
            r6 = r20
            r3 = r22
            r7 = r16
            r0 = -1
            java.lang.String r4 = "KEY_COMMIT"
            r5 = 0
            boolean r4 = r3.getBoolean(r4, r5)     // Catch:{ Exception -> 0x043c }
            java.lang.String r5 = "KEY_VALUES"
            android.os.Bundle r5 = r3.getBundle(r5)     // Catch:{ Exception -> 0x043c }
            java.lang.String r8 = "KEY_TYPES"
            android.os.Bundle r8 = r3.getBundle(r8)     // Catch:{ Exception -> 0x043c }
            java.lang.String r9 = "KEY_CLEAR"
            r10 = 0
            boolean r3 = r3.getBoolean(r9, r10)     // Catch:{ Exception -> 0x043c }
            android.content.SharedPreferences$Editor r9 = r21.edit()     // Catch:{ Exception -> 0x043c }
            if (r3 == 0) goto L_0x0267
            r9.clear()     // Catch:{ Exception -> 0x043c }
        L_0x0267:
            if (r8 != 0) goto L_0x026b
            goto L_0x02f3
        L_0x026b:
            if (r5 == 0) goto L_0x02f2
            java.util.Set r2 = r8.keySet()     // Catch:{ Exception -> 0x043c }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ Exception -> 0x043c }
        L_0x0275:
            boolean r3 = r2.hasNext()     // Catch:{ Exception -> 0x043c }
            if (r3 == 0) goto L_0x02ee
            java.lang.Object r3 = r2.next()     // Catch:{ Exception -> 0x043c }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ Exception -> 0x043c }
            int r10 = r8.getInt(r3, r0)     // Catch:{ Exception -> 0x043c }
            switch(r10) {
                case 0: goto L_0x02bf;
                case 1: goto L_0x02af;
                case 2: goto L_0x02a7;
                case 3: goto L_0x029f;
                case 4: goto L_0x0297;
                case 5: goto L_0x028f;
                case 6: goto L_0x028b;
                default: goto L_0x0288;
            }     // Catch:{ Exception -> 0x043c }
        L_0x0288:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ Exception -> 0x043c }
            goto L_0x02c7
        L_0x028b:
            r9.remove(r3)     // Catch:{ Exception -> 0x043c }
            goto L_0x0275
        L_0x028f:
            boolean r10 = r5.getBoolean(r3)     // Catch:{ Exception -> 0x043c }
            r9.putBoolean(r3, r10)     // Catch:{ Exception -> 0x043c }
            goto L_0x0275
        L_0x0297:
            float r10 = r5.getFloat(r3)     // Catch:{ Exception -> 0x043c }
            r9.putFloat(r3, r10)     // Catch:{ Exception -> 0x043c }
            goto L_0x0275
        L_0x029f:
            long r10 = r5.getLong(r3)     // Catch:{ Exception -> 0x043c }
            r9.putLong(r3, r10)     // Catch:{ Exception -> 0x043c }
            goto L_0x0275
        L_0x02a7:
            int r10 = r5.getInt(r3)     // Catch:{ Exception -> 0x043c }
            r9.putInt(r3, r10)     // Catch:{ Exception -> 0x043c }
            goto L_0x0275
        L_0x02af:
            ob r10 = new ob     // Catch:{ Exception -> 0x043c }
            r10.<init>()     // Catch:{ Exception -> 0x043c }
            java.lang.String[] r11 = r5.getStringArray(r3)     // Catch:{ Exception -> 0x043c }
            java.util.Collections.addAll(r10, r11)     // Catch:{ Exception -> 0x043c }
            r9.putStringSet(r3, r10)     // Catch:{ Exception -> 0x043c }
            goto L_0x0275
        L_0x02bf:
            java.lang.String r10 = r5.getString(r3)     // Catch:{ Exception -> 0x043c }
            r9.putString(r3, r10)     // Catch:{ Exception -> 0x043c }
            goto L_0x0275
        L_0x02c7:
            java.lang.String r2 = java.lang.String.valueOf(r3)     // Catch:{ Exception -> 0x043c }
            int r2 = r2.length()     // Catch:{ Exception -> 0x043c }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x043c }
            int r2 = r2 + 39
            r4.<init>(r2)     // Catch:{ Exception -> 0x043c }
            java.lang.String r2 = "Key "
            r4.append(r2)     // Catch:{ Exception -> 0x043c }
            r4.append(r3)     // Catch:{ Exception -> 0x043c }
            java.lang.String r2 = " has unknown value type "
            r4.append(r2)     // Catch:{ Exception -> 0x043c }
            r4.append(r10)     // Catch:{ Exception -> 0x043c }
            java.lang.String r2 = r4.toString()     // Catch:{ Exception -> 0x043c }
            r0.<init>(r2)     // Catch:{ Exception -> 0x043c }
            throw r0     // Catch:{ Exception -> 0x043c }
        L_0x02ee:
            java.util.Set r2 = r8.keySet()     // Catch:{ Exception -> 0x043c }
        L_0x02f2:
        L_0x02f3:
            if (r4 == 0) goto L_0x02fc
            boolean r17 = r9.commit()     // Catch:{ Exception -> 0x043c }
            r0 = r17
            goto L_0x0300
        L_0x02fc:
            r9.apply()     // Catch:{ Exception -> 0x043c }
            r0 = 1
        L_0x0300:
            if (r0 != 0) goto L_0x0303
            goto L_0x0319
        L_0x0303:
            if (r2 == 0) goto L_0x0319
            java.util.Iterator r2 = r2.iterator()     // Catch:{ Exception -> 0x043c }
        L_0x0309:
            boolean r3 = r2.hasNext()     // Catch:{ Exception -> 0x043c }
            if (r3 == 0) goto L_0x0319
            java.lang.Object r3 = r2.next()     // Catch:{ Exception -> 0x043c }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ Exception -> 0x043c }
            r1.a(r6, r3)     // Catch:{ Exception -> 0x043c }
            goto L_0x0309
        L_0x0319:
            android.os.Bundle r2 = new android.os.Bundle     // Catch:{ Exception -> 0x043c }
            r2.<init>()     // Catch:{ Exception -> 0x043c }
            r2.putBoolean(r14, r0)     // Catch:{ Exception -> 0x043c }
            r17 = 0
            goto L_0x0436
        L_0x0325:
            r6 = r20
            r7 = r16
            r9 = r21
            boolean r0 = r9.contains(r7)     // Catch:{ Exception -> 0x043c }
            if (r0 == 0) goto L_0x034d
            android.os.Bundle r2 = new android.os.Bundle     // Catch:{ Exception -> 0x043c }
            r2.<init>()     // Catch:{ Exception -> 0x043c }
            java.util.Set r0 = java.util.Collections.emptySet()     // Catch:{ Exception -> 0x043c }
            java.util.Set r0 = r9.getStringSet(r7, r0)     // Catch:{ Exception -> 0x043c }
            int r4 = r0.size()     // Catch:{ Exception -> 0x043c }
            java.lang.String[] r4 = new java.lang.String[r4]     // Catch:{ Exception -> 0x043c }
            java.lang.Object[] r0 = r0.toArray(r4)     // Catch:{ Exception -> 0x043c }
            java.lang.String[] r0 = (java.lang.String[]) r0     // Catch:{ Exception -> 0x043c }
            r2.putStringArray(r3, r0)     // Catch:{ Exception -> 0x043c }
        L_0x034d:
            r17 = 0
            goto L_0x0436
        L_0x0351:
            r6 = r20
            r9 = r21
            r7 = r16
            boolean r0 = r9.contains(r7)     // Catch:{ Exception -> 0x043c }
            if (r0 == 0) goto L_0x036b
            android.os.Bundle r0 = new android.os.Bundle     // Catch:{ Exception -> 0x043c }
            r0.<init>()     // Catch:{ Exception -> 0x043c }
            java.lang.String r2 = r9.getString(r7, r2)     // Catch:{ Exception -> 0x043c }
            r0.putString(r12, r2)     // Catch:{ Exception -> 0x043c }
            r2 = r0
            goto L_0x036c
        L_0x036b:
        L_0x036c:
            r17 = 0
            goto L_0x0436
        L_0x0370:
            r6 = r20
            r9 = r21
            r7 = r16
            boolean r0 = r9.contains(r7)     // Catch:{ Exception -> 0x043c }
            if (r0 == 0) goto L_0x038a
            android.os.Bundle r2 = new android.os.Bundle     // Catch:{ Exception -> 0x043c }
            r2.<init>()     // Catch:{ Exception -> 0x043c }
            r3 = 0
            long r3 = r9.getLong(r7, r3)     // Catch:{ Exception -> 0x043c }
            r2.putLong(r15, r3)     // Catch:{ Exception -> 0x043c }
        L_0x038a:
            r17 = 0
            goto L_0x0436
        L_0x038e:
            r6 = r20
            r9 = r21
            r7 = r16
            boolean r0 = r9.contains(r7)     // Catch:{ Exception -> 0x043c }
            if (r0 == 0) goto L_0x03a7
            android.os.Bundle r2 = new android.os.Bundle     // Catch:{ Exception -> 0x043c }
            r2.<init>()     // Catch:{ Exception -> 0x043c }
            r3 = 0
            int r0 = r9.getInt(r7, r3)     // Catch:{ Exception -> 0x043c }
            r2.putInt(r5, r0)     // Catch:{ Exception -> 0x043c }
        L_0x03a7:
            r17 = 0
            goto L_0x0436
        L_0x03ab:
            r6 = r20
            r9 = r21
            r7 = r16
            boolean r0 = r9.contains(r7)     // Catch:{ Exception -> 0x043c }
            if (r0 == 0) goto L_0x03c4
            android.os.Bundle r2 = new android.os.Bundle     // Catch:{ Exception -> 0x043c }
            r2.<init>()     // Catch:{ Exception -> 0x043c }
            r0 = 0
            float r0 = r9.getFloat(r7, r0)     // Catch:{ Exception -> 0x043c }
            r2.putFloat(r10, r0)     // Catch:{ Exception -> 0x043c }
        L_0x03c4:
            r17 = 0
            goto L_0x0436
        L_0x03c8:
            r6 = r20
            r9 = r21
            r7 = r16
            boolean r0 = r9.contains(r7)     // Catch:{ Exception -> 0x043c }
            if (r0 == 0) goto L_0x03e1
            android.os.Bundle r2 = new android.os.Bundle     // Catch:{ Exception -> 0x043c }
            r2.<init>()     // Catch:{ Exception -> 0x043c }
            r3 = 0
            boolean r0 = r9.getBoolean(r7, r3)     // Catch:{ Exception -> 0x043c }
            r2.putBoolean(r11, r0)     // Catch:{ Exception -> 0x043c }
        L_0x03e1:
            r17 = 0
            goto L_0x0436
        L_0x03e4:
            r6 = r20
            r9 = r21
            r7 = r16
            java.util.Map r0 = r9.getAll()     // Catch:{ Exception -> 0x043c }
            java.util.HashMap r3 = new java.util.HashMap     // Catch:{ Exception -> 0x043c }
            r3.<init>(r0)     // Catch:{ Exception -> 0x043c }
            int r0 = r0.size()     // Catch:{ Exception -> 0x043c }
            if (r0 <= 0) goto L_0x0401
            android.os.Bundle r2 = new android.os.Bundle     // Catch:{ Exception -> 0x043c }
            r2.<init>()     // Catch:{ Exception -> 0x043c }
            r2.putSerializable(r8, r3)     // Catch:{ Exception -> 0x043c }
        L_0x0401:
            r17 = 0
            goto L_0x0436
        L_0x0404:
            r6 = r20
            r9 = r21
            r7 = r16
            r0 = r18
            android.os.Bundle r2 = new android.os.Bundle     // Catch:{ Exception -> 0x043c }
            r2.<init>()     // Catch:{ Exception -> 0x043c }
            boolean r3 = r9.contains(r7)     // Catch:{ Exception -> 0x043c }
            r2.putBoolean(r0, r3)     // Catch:{ Exception -> 0x043c }
            r17 = 0
            goto L_0x0436
        L_0x041b:
            java.lang.String r3 = "Unknown function name: "
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ Exception -> 0x043c }
            int r5 = r4.length()     // Catch:{ Exception -> 0x043c }
            if (r5 != 0) goto L_0x042d
            java.lang.String r4 = new java.lang.String     // Catch:{ Exception -> 0x043c }
            r4.<init>(r3)     // Catch:{ Exception -> 0x043c }
            goto L_0x0431
        L_0x042d:
            java.lang.String r4 = r3.concat(r4)     // Catch:{ Exception -> 0x043c }
        L_0x0431:
            android.util.Log.e(r0, r4)     // Catch:{ Exception -> 0x043c }
            goto L_0x0226
        L_0x0436:
            if (r17 == 0) goto L_0x043b
            r1.a(r6, r7)     // Catch:{ Exception -> 0x043c }
        L_0x043b:
            return r2
        L_0x043c:
            r0 = move-exception
            android.content.Context r2 = r1.a
            r3 = 0
            defpackage.jis.a(r2, r0, r3)
            goto L_0x0445
        L_0x0444:
            throw r0
        L_0x0445:
            goto L_0x0444
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iug.a(java.lang.String, int, android.os.Bundle):android.os.Bundle");
    }

    public iug(Context context) {
        super("com.google.android.gms.common.internal.ISharedPreferencesService");
        this.a = context;
    }

    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        Bundle a2 = a(parcel.readString(), parcel.readInt(), (Bundle) bhx.a(parcel, Bundle.CREATOR));
        parcel2.writeNoException();
        bhx.b(parcel2, a2);
        return true;
    }
}
