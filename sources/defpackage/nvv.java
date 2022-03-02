package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;

/* renamed from: nvv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class nvv {
    private static nvv b;
    public final Context a;
    private final qwq c;
    private final nsp d;

    public nvv(Context context, qwq qwq, nsp nsp) {
        this.a = context.getApplicationContext();
        this.c = qwq;
        this.d = nsp;
    }

    public static synchronized nvv a(Context context) {
        nvv nvv;
        synchronized (nvv.class) {
            if (b == null) {
                b = new nvv(context, qwq.a(context), nsp.a(context));
            }
            nvv = b;
        }
        return nvv;
    }

    private static final List b(SharedPreferences sharedPreferences) {
        ArrayList arrayList = new ArrayList();
        String string = sharedPreferences.getString("accountList", (String) null);
        if (!TextUtils.isEmpty(string)) {
            for (String add : string.split("\\|")) {
                arrayList.add(add);
            }
        }
        return arrayList;
    }

    private final boolean c() {
        return nvu.a(this.a) != null;
    }

    public static final void a(SharedPreferences sharedPreferences) {
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putInt("groups_state", 3);
        edit.remove("accountList");
        edit.apply();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0182, code lost:
        return false;
     */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x012e A[SYNTHETIC, Splitter:B:47:0x012e] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0135 A[Catch:{ IOException -> 0x00a9 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean b() {
        /*
            r18 = this;
            r1 = r18
            monitor-enter(r18)
            boolean r0 = r18.c()     // Catch:{ all -> 0x0184 }
            if (r0 == 0) goto L_0x0181
            android.content.Context r0 = r1.a     // Catch:{ all -> 0x0184 }
            android.content.SharedPreferences r3 = defpackage.nsm.b(r0)     // Catch:{ all -> 0x0184 }
            java.util.List r4 = b(r3)     // Catch:{ all -> 0x0184 }
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ all -> 0x0184 }
            r5.<init>()     // Catch:{ all -> 0x0184 }
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ all -> 0x0184 }
            r6.<init>()     // Catch:{ all -> 0x0184 }
            r1.a(r4, r5, r6)     // Catch:{ all -> 0x0184 }
            axlc r0 = defpackage.axlc.a     // Catch:{ all -> 0x0184 }
            axld r0 = r0.a()     // Catch:{ all -> 0x0184 }
            long r7 = r0.C()     // Catch:{ all -> 0x0184 }
            r9 = 1
            int r0 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r0 != 0) goto L_0x003e
            android.content.Context r0 = r1.a     // Catch:{ all -> 0x0184 }
            java.lang.String r0 = defpackage.nvu.a(r0)     // Catch:{ all -> 0x0184 }
            boolean r7 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x0184 }
            if (r7 != 0) goto L_0x0181
            r7 = r0
            goto L_0x0040
        L_0x003e:
            r0 = 0
            r7 = r0
        L_0x0040:
            axlc r0 = defpackage.axlc.a     // Catch:{ all -> 0x0184 }
            axld r0 = r0.a()     // Catch:{ all -> 0x0184 }
            java.lang.String r8 = r0.B()     // Catch:{ all -> 0x0184 }
            long r9 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0184 }
            r11 = 1000(0x3e8, double:4.94E-321)
            long r9 = r9 / r11
            java.lang.String r9 = java.lang.Long.toString(r9)     // Catch:{ all -> 0x0184 }
            int r10 = r6.size()     // Catch:{ all -> 0x0184 }
            r0 = 0
            r11 = 0
            r12 = 0
            r13 = 0
        L_0x005d:
            if (r11 >= r10) goto L_0x00b9
            java.lang.Object r15 = r6.get(r11)     // Catch:{ all -> 0x0184 }
            java.lang.String r15 = (java.lang.String) r15     // Catch:{ all -> 0x0184 }
            int r16 = r0 + 1
            java.lang.String r17 = java.lang.String.valueOf(r9)     // Catch:{ all -> 0x0184 }
            int r17 = r17.length()     // Catch:{ all -> 0x0184 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0184 }
            int r14 = r17 + 12
            r2.<init>(r14)     // Catch:{ all -> 0x0184 }
            r2.append(r9)     // Catch:{ all -> 0x0184 }
            java.lang.String r14 = "-"
            r2.append(r14)     // Catch:{ all -> 0x0184 }
            r2.append(r0)     // Catch:{ all -> 0x0184 }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x0184 }
            android.os.Bundle r2 = new android.os.Bundle     // Catch:{ all -> 0x0184 }
            r2.<init>()     // Catch:{ all -> 0x0184 }
            java.lang.String r14 = "a"
            r2.putString(r14, r15)     // Catch:{ all -> 0x0184 }
            if (r7 == 0) goto L_0x0096
            java.lang.String r14 = "id"
            r2.putString(r14, r7)     // Catch:{ all -> 0x0184 }
        L_0x0096:
            java.lang.String r14 = "r"
            r17 = r6
            java.lang.String r6 = "1"
            r2.putString(r14, r6)     // Catch:{ all -> 0x0184 }
            nsp r6 = r1.d     // Catch:{ IOException -> 0x00a9 }
            r6.a(r8, r0, r2)     // Catch:{ IOException -> 0x00a9 }
            r4.remove(r15)     // Catch:{ all -> 0x0184 }
            r13 = 1
            goto L_0x00b2
        L_0x00a9:
            r0 = move-exception
            java.lang.String r2 = "GCM-GMS"
            java.lang.String r6 = "Failed to send remove message"
            android.util.Log.i(r2, r6, r0)     // Catch:{ all -> 0x0184 }
            r12 = 1
        L_0x00b2:
            int r11 = r11 + 1
            r0 = r16
            r6 = r17
            goto L_0x005d
        L_0x00b9:
            int r2 = r5.size()     // Catch:{ all -> 0x0184 }
            r6 = 0
        L_0x00be:
            if (r6 >= r2) goto L_0x0149
            java.lang.Object r10 = r5.get(r6)     // Catch:{ all -> 0x0184 }
            android.accounts.Account r10 = (android.accounts.Account) r10     // Catch:{ all -> 0x0184 }
            int r11 = r0 + 1
            java.lang.String r14 = java.lang.String.valueOf(r9)     // Catch:{ all -> 0x0184 }
            int r14 = r14.length()     // Catch:{ all -> 0x0184 }
            java.lang.StringBuilder r15 = new java.lang.StringBuilder     // Catch:{ all -> 0x0184 }
            int r14 = r14 + 12
            r15.<init>(r14)     // Catch:{ all -> 0x0184 }
            r15.append(r9)     // Catch:{ all -> 0x0184 }
            java.lang.String r14 = "-"
            r15.append(r14)     // Catch:{ all -> 0x0184 }
            r15.append(r0)     // Catch:{ all -> 0x0184 }
            java.lang.String r14 = r15.toString()     // Catch:{ all -> 0x0184 }
            android.os.Bundle r15 = new android.os.Bundle     // Catch:{ all -> 0x0184 }
            r15.<init>()     // Catch:{ all -> 0x0184 }
            java.lang.String r0 = "a"
            r16 = r2
            java.lang.String r2 = r10.name     // Catch:{ all -> 0x0184 }
            r15.putString(r0, r2)     // Catch:{ all -> 0x0184 }
            if (r7 != 0) goto L_0x00f7
            goto L_0x00fc
        L_0x00f7:
            java.lang.String r0 = "id"
            r15.putString(r0, r7)     // Catch:{ all -> 0x0184 }
        L_0x00fc:
            java.lang.String r0 = "t"
            android.content.Context r2 = r1.a     // Catch:{ IOException -> 0x0113, eif -> 0x0111 }
            r17 = r5
            java.lang.String r5 = "oauth2:https://www.googleapis.com/auth/gcm"
            java.lang.String r2 = defpackage.eig.a((android.content.Context) r2, (android.accounts.Account) r10, (java.lang.String) r5)     // Catch:{ IOException -> 0x010f, eif -> 0x010d }
            r15.putString(r0, r2)     // Catch:{ IOException -> 0x010f, eif -> 0x010d }
            r0 = 1
            goto L_0x0127
        L_0x010d:
            r0 = move-exception
            goto L_0x0116
        L_0x010f:
            r0 = move-exception
            goto L_0x0116
        L_0x0111:
            r0 = move-exception
            goto L_0x0114
        L_0x0113:
            r0 = move-exception
        L_0x0114:
            r17 = r5
        L_0x0116:
            java.lang.String r2 = "e"
            java.lang.String r5 = r0.getMessage()     // Catch:{ all -> 0x0184 }
            r15.putString(r2, r5)     // Catch:{ all -> 0x0184 }
            java.lang.String r2 = "GCM-GMS"
            java.lang.String r5 = "Failed to subscribe to group."
            android.util.Log.i(r2, r5, r0)     // Catch:{ all -> 0x0184 }
            r0 = 0
        L_0x0127:
            nsp r2 = r1.d     // Catch:{ IOException -> 0x0137 }
            r2.a(r8, r14, r15)     // Catch:{ IOException -> 0x0137 }
            if (r0 == 0) goto L_0x0135
            java.lang.String r0 = r10.name     // Catch:{ all -> 0x0184 }
            r4.add(r0)     // Catch:{ all -> 0x0184 }
            r13 = 1
            goto L_0x0140
        L_0x0135:
            r12 = 1
            goto L_0x0140
        L_0x0137:
            r0 = move-exception
            java.lang.String r2 = "GCM-GMS"
            java.lang.String r5 = "Failed to send add message"
            android.util.Log.i(r2, r5, r0)     // Catch:{ all -> 0x0184 }
            r12 = 1
        L_0x0140:
            int r6 = r6 + 1
            r0 = r11
            r2 = r16
            r5 = r17
            goto L_0x00be
        L_0x0149:
            android.content.SharedPreferences$Editor r0 = r3.edit()     // Catch:{ all -> 0x0184 }
            if (r12 == 0) goto L_0x015d
            java.lang.String r2 = "groups_state"
            r3 = 2
            r0.putInt(r2, r3)     // Catch:{ all -> 0x0184 }
            java.lang.String r2 = "GCM-GMS"
            java.lang.String r3 = "Groups upload failed"
            android.util.Log.i(r2, r3)     // Catch:{ all -> 0x0184 }
            goto L_0x016c
        L_0x015d:
            java.lang.String r2 = "groups_state"
            r3 = 1
            r0.putInt(r2, r3)     // Catch:{ all -> 0x0184 }
            java.lang.String r2 = "groups_last_upload"
            long r5 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0184 }
            r0.putLong(r2, r5)     // Catch:{ all -> 0x0184 }
        L_0x016c:
            if (r13 == 0) goto L_0x0179
            java.lang.String r2 = "accountList"
            java.lang.String r3 = "|"
            java.lang.String r3 = android.text.TextUtils.join(r3, r4)     // Catch:{ all -> 0x0184 }
            r0.putString(r2, r3)     // Catch:{ all -> 0x0184 }
        L_0x0179:
            r0.apply()     // Catch:{ all -> 0x0184 }
            if (r12 != 0) goto L_0x0181
            monitor-exit(r18)
            r2 = 1
            return r2
        L_0x0181:
            monitor-exit(r18)
            r2 = 0
            return r2
        L_0x0184:
            r0 = move-exception
            monitor-exit(r18)
            goto L_0x0188
        L_0x0187:
            throw r0
        L_0x0188:
            goto L_0x0187
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nvv.b():boolean");
    }

    private final void a(List list, List list2, List list3) {
        try {
            Account[] d2 = eig.d(this.a, "com.google");
            int size = list.size();
            for (int i = 0; i < size; i++) {
                String str = (String) list.get(i);
                int length = d2.length;
                int i2 = 0;
                while (true) {
                    if (i2 < length) {
                        if (str.equals(d2[i2].name)) {
                            break;
                        }
                        i2++;
                    } else {
                        list3.add(str);
                        break;
                    }
                }
            }
            for (Account account : d2) {
                if (!list.contains(account.name)) {
                    list2.add(account);
                }
            }
        } catch (RemoteException | hxw | hxx e) {
        }
    }

    public final void a() {
        if (c()) {
            SharedPreferences b2 = nsm.b(this.a);
            int i = b2.getInt("groups_state", 0);
            if (i != 0) {
                if (i == 1) {
                    long D = axlc.a.a().D();
                    if (D > 0) {
                        if (System.currentTimeMillis() > b2.getLong("groups_last_upload", -1) + (D * 1000)) {
                            a(b2);
                        }
                    }
                    List b3 = b(b2);
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    a(b3, arrayList, arrayList2);
                    if (arrayList.isEmpty() && arrayList2.isEmpty()) {
                        return;
                    }
                } else if (!(i == 2 || i == 3)) {
                    StringBuilder sb = new StringBuilder(33);
                    sb.append("Unknown groups state: ");
                    sb.append(i);
                    Log.e("GCM-GMS", sb.toString());
                }
            }
            qxf qxf = new qxf();
            qxf.k = "groups_upload";
            qxf.i = "com.google.android.gms.gcm.gmsproc.GcmInGmsTaskService";
            qxf.a(0, 30);
            qxf.a(0, 0);
            qxf.a(0);
            qxf.n = true;
            this.c.a((qxx) qxf.b());
        }
    }
}
