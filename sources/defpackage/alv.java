package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import java.util.ArrayList;
import java.util.HashMap;

@Deprecated
/* renamed from: alv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class alv {
    private static final Object f = new Object();
    private static alv g;
    private final Context a;
    private final HashMap b = new HashMap();
    private final HashMap c = new HashMap();
    private final ArrayList d = new ArrayList();
    private final Handler e;

    private alv(Context context) {
        this.a = context;
        this.e = new als(this, context.getMainLooper());
    }

    public static alv a(Context context) {
        alv alv;
        synchronized (f) {
            if (g == null) {
                g = new alv(context.getApplicationContext());
            }
            alv = g;
        }
        return alv;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0025, code lost:
        if (r6 >= r5) goto L_0x003f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0027, code lost:
        r7 = (defpackage.alu) r4.b.get(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0031, code lost:
        if (r7.d != false) goto L_0x003c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0033, code lost:
        r7.b.onReceive(r10.a, r4.a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003c, code lost:
        r6 = r6 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003f, code lost:
        r3 = r3 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0018, code lost:
        r3 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001a, code lost:
        if (r3 >= r1) goto L_0x0000;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001c, code lost:
        r4 = r2[r3];
        r5 = r4.b.size();
        r6 = 0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a() {
        /*
            r10 = this;
        L_0x0000:
            java.util.HashMap r0 = r10.b
            monitor-enter(r0)
            java.util.ArrayList r1 = r10.d     // Catch:{ all -> 0x0044 }
            int r1 = r1.size()     // Catch:{ all -> 0x0044 }
            if (r1 <= 0) goto L_0x0042
            alt[] r2 = new defpackage.alt[r1]     // Catch:{ all -> 0x0044 }
            java.util.ArrayList r3 = r10.d     // Catch:{ all -> 0x0044 }
            r3.toArray(r2)     // Catch:{ all -> 0x0044 }
            java.util.ArrayList r3 = r10.d     // Catch:{ all -> 0x0044 }
            r3.clear()     // Catch:{ all -> 0x0044 }
            monitor-exit(r0)     // Catch:{ all -> 0x0044 }
            r0 = 0
            r3 = 0
        L_0x001a:
            if (r3 >= r1) goto L_0x0000
            r4 = r2[r3]
            java.util.ArrayList r5 = r4.b
            int r5 = r5.size()
            r6 = 0
        L_0x0025:
            if (r6 >= r5) goto L_0x003f
            java.util.ArrayList r7 = r4.b
            java.lang.Object r7 = r7.get(r6)
            alu r7 = (defpackage.alu) r7
            boolean r8 = r7.d
            if (r8 != 0) goto L_0x003c
            android.content.BroadcastReceiver r7 = r7.b
            android.content.Context r8 = r10.a
            android.content.Intent r9 = r4.a
            r7.onReceive(r8, r9)
        L_0x003c:
            int r6 = r6 + 1
            goto L_0x0025
        L_0x003f:
            int r3 = r3 + 1
            goto L_0x001a
        L_0x0042:
            monitor-exit(r0)     // Catch:{ all -> 0x0044 }
            return
        L_0x0044:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0044 }
            goto L_0x0048
        L_0x0047:
            throw r1
        L_0x0048:
            goto L_0x0047
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.alv.a():void");
    }

    public final void a(BroadcastReceiver broadcastReceiver) {
        synchronized (this.b) {
            ArrayList arrayList = (ArrayList) this.b.remove(broadcastReceiver);
            if (arrayList != null) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    alu alu = (alu) arrayList.get(size);
                    alu.d = true;
                    for (int i = 0; i < alu.a.countActions(); i++) {
                        String action = alu.a.getAction(i);
                        ArrayList arrayList2 = (ArrayList) this.c.get(action);
                        if (arrayList2 != null) {
                            for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
                                alu alu2 = (alu) arrayList2.get(size2);
                                if (alu2.b == broadcastReceiver) {
                                    alu2.d = true;
                                    arrayList2.remove(size2);
                                }
                            }
                            if (arrayList2.size() <= 0) {
                                this.c.remove(action);
                            }
                        }
                    }
                }
            }
        }
    }

    public final void a(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        synchronized (this.b) {
            alu alu = new alu(intentFilter, broadcastReceiver);
            ArrayList arrayList = (ArrayList) this.b.get(broadcastReceiver);
            if (arrayList == null) {
                arrayList = new ArrayList(1);
                this.b.put(broadcastReceiver, arrayList);
            }
            arrayList.add(alu);
            for (int i = 0; i < intentFilter.countActions(); i++) {
                String action = intentFilter.getAction(i);
                ArrayList arrayList2 = (ArrayList) this.c.get(action);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList(1);
                    this.c.put(action, arrayList2);
                }
                arrayList2.add(alu);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:56:0x014a, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x015b, code lost:
        return r11;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(android.content.Intent r22) {
        /*
            r21 = this;
            r1 = r21
            r0 = r22
            java.util.HashMap r2 = r1.b
            monitor-enter(r2)
            java.lang.String r10 = r22.getAction()     // Catch:{ all -> 0x015c }
            android.content.Context r3 = r1.a     // Catch:{ all -> 0x015c }
            android.content.ContentResolver r3 = r3.getContentResolver()     // Catch:{ all -> 0x015c }
            java.lang.String r11 = r0.resolveTypeIfNeeded(r3)     // Catch:{ all -> 0x015c }
            android.net.Uri r12 = r22.getData()     // Catch:{ all -> 0x015c }
            java.lang.String r13 = r22.getScheme()     // Catch:{ all -> 0x015c }
            java.util.Set r14 = r22.getCategories()     // Catch:{ all -> 0x015c }
            int r3 = r22.getFlags()     // Catch:{ all -> 0x015c }
            r15 = r3 & 8
            if (r15 == 0) goto L_0x0049
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x015c }
            r3.<init>()     // Catch:{ all -> 0x015c }
            java.lang.String r4 = "Resolving type "
            r3.append(r4)     // Catch:{ all -> 0x015c }
            r3.append(r11)     // Catch:{ all -> 0x015c }
            java.lang.String r4 = " scheme "
            r3.append(r4)     // Catch:{ all -> 0x015c }
            r3.append(r13)     // Catch:{ all -> 0x015c }
            java.lang.String r4 = " of intent "
            r3.append(r4)     // Catch:{ all -> 0x015c }
            r3.append(r0)     // Catch:{ all -> 0x015c }
            r3.toString()     // Catch:{ all -> 0x015c }
        L_0x0049:
            java.util.HashMap r3 = r1.c     // Catch:{ all -> 0x015c }
            java.lang.String r4 = r22.getAction()     // Catch:{ all -> 0x015c }
            java.lang.Object r3 = r3.get(r4)     // Catch:{ all -> 0x015c }
            r9 = r3
            java.util.ArrayList r9 = (java.util.ArrayList) r9     // Catch:{ all -> 0x015c }
            r8 = 0
            if (r9 != 0) goto L_0x005c
            r11 = 0
            goto L_0x015a
        L_0x005c:
            r3 = 0
            if (r15 == 0) goto L_0x0072
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x015c }
            r4.<init>()     // Catch:{ all -> 0x015c }
            java.lang.String r5 = "Action list: "
            r4.append(r5)     // Catch:{ all -> 0x015c }
            r4.append(r9)     // Catch:{ all -> 0x015c }
            r4.toString()     // Catch:{ all -> 0x015c }
            r7 = r3
            r6 = 0
            goto L_0x0074
        L_0x0072:
            r7 = r3
            r6 = 0
        L_0x0074:
            int r3 = r9.size()     // Catch:{ all -> 0x015c }
            if (r6 >= r3) goto L_0x0123
            java.lang.Object r3 = r9.get(r6)     // Catch:{ all -> 0x015c }
            r4 = r3
            alu r4 = (defpackage.alu) r4     // Catch:{ all -> 0x015c }
            if (r15 == 0) goto L_0x0095
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x015c }
            r3.<init>()     // Catch:{ all -> 0x015c }
            java.lang.String r5 = "Matching against filter "
            r3.append(r5)     // Catch:{ all -> 0x015c }
            android.content.IntentFilter r5 = r4.a     // Catch:{ all -> 0x015c }
            r3.append(r5)     // Catch:{ all -> 0x015c }
            r3.toString()     // Catch:{ all -> 0x015c }
        L_0x0095:
            boolean r3 = r4.c     // Catch:{ all -> 0x015c }
            if (r3 != 0) goto L_0x010b
            android.content.IntentFilter r3 = r4.a     // Catch:{ all -> 0x015c }
            java.lang.String r17 = "LocalBroadcastManager"
            r5 = r4
            r4 = r10
            r18 = r10
            r0 = 1
            r10 = r5
            r5 = r11
            r16 = r6
            r6 = r13
            r0 = r7
            r7 = r12
            r19 = r11
            r11 = 0
            r8 = r14
            r20 = r9
            r9 = r17
            int r3 = r3.match(r4, r5, r6, r7, r8, r9)     // Catch:{ all -> 0x015c }
            if (r3 >= 0) goto L_0x00e5
            if (r15 != 0) goto L_0x00ba
            goto L_0x0115
        L_0x00ba:
            r4 = -4
            if (r3 == r4) goto L_0x00d2
            r4 = -3
            if (r3 == r4) goto L_0x00cf
            r4 = -2
            if (r3 == r4) goto L_0x00cc
            r4 = -1
            if (r3 == r4) goto L_0x00c9
            java.lang.String r3 = "unknown reason"
            goto L_0x00d4
        L_0x00c9:
            java.lang.String r3 = "type"
            goto L_0x00d4
        L_0x00cc:
            java.lang.String r3 = "data"
            goto L_0x00d4
        L_0x00cf:
            java.lang.String r3 = "action"
            goto L_0x00d4
        L_0x00d2:
            java.lang.String r3 = "category"
        L_0x00d4:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x015c }
            r4.<init>()     // Catch:{ all -> 0x015c }
            java.lang.String r5 = "  Filter did not match: "
            r4.append(r5)     // Catch:{ all -> 0x015c }
            r4.append(r3)     // Catch:{ all -> 0x015c }
            r4.toString()     // Catch:{ all -> 0x015c }
            goto L_0x0115
        L_0x00e5:
            if (r15 == 0) goto L_0x00fb
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x015c }
            r4.<init>()     // Catch:{ all -> 0x015c }
            java.lang.String r5 = "  Filter matched!  match=0x"
            r4.append(r5)     // Catch:{ all -> 0x015c }
            java.lang.String r3 = java.lang.Integer.toHexString(r3)     // Catch:{ all -> 0x015c }
            r4.append(r3)     // Catch:{ all -> 0x015c }
            r4.toString()     // Catch:{ all -> 0x015c }
        L_0x00fb:
            if (r0 == 0) goto L_0x00ff
            r7 = r0
            goto L_0x0104
        L_0x00ff:
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ all -> 0x015c }
            r7.<init>()     // Catch:{ all -> 0x015c }
        L_0x0104:
            r7.add(r10)     // Catch:{ all -> 0x015c }
            r3 = 1
            r10.c = r3     // Catch:{ all -> 0x015c }
            goto L_0x0116
        L_0x010b:
            r16 = r6
            r0 = r7
            r20 = r9
            r18 = r10
            r19 = r11
            r11 = 0
        L_0x0115:
            r7 = r0
        L_0x0116:
            int r6 = r16 + 1
            r0 = r22
            r10 = r18
            r11 = r19
            r9 = r20
            r8 = 0
            goto L_0x0074
        L_0x0123:
            r0 = r7
            r3 = 1
            r11 = 0
            if (r0 == 0) goto L_0x015a
            r8 = 0
        L_0x0129:
            int r4 = r0.size()     // Catch:{ all -> 0x015c }
            if (r8 < r4) goto L_0x014b
            java.util.ArrayList r4 = r1.d     // Catch:{ all -> 0x015c }
            alt r5 = new alt     // Catch:{ all -> 0x015c }
            r3 = r22
            r6 = 1
            r5.<init>(r3, r0)     // Catch:{ all -> 0x015c }
            r4.add(r5)     // Catch:{ all -> 0x015c }
            android.os.Handler r0 = r1.e     // Catch:{ all -> 0x015c }
            boolean r0 = r0.hasMessages(r6)     // Catch:{ all -> 0x015c }
            if (r0 != 0) goto L_0x0149
            android.os.Handler r0 = r1.e     // Catch:{ all -> 0x015c }
            r0.sendEmptyMessage(r6)     // Catch:{ all -> 0x015c }
        L_0x0149:
            monitor-exit(r2)     // Catch:{ all -> 0x015c }
            return r6
        L_0x014b:
            r3 = r22
            r6 = 1
            java.lang.Object r4 = r0.get(r8)     // Catch:{ all -> 0x015c }
            alu r4 = (defpackage.alu) r4     // Catch:{ all -> 0x015c }
            r4.c = r11     // Catch:{ all -> 0x015c }
            int r8 = r8 + 1
            r3 = 1
            goto L_0x0129
        L_0x015a:
            monitor-exit(r2)     // Catch:{ all -> 0x015c }
            return r11
        L_0x015c:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x015c }
            goto L_0x0160
        L_0x015f:
            throw r0
        L_0x0160:
            goto L_0x015f
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.alv.a(android.content.Intent):boolean");
    }
}
