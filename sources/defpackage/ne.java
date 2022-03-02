package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Handler;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: ne  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ne {
    static final oi a = new oi(16);
    static final Object b = new Object();
    static final ou c = new ou();
    private static final nk d = new nk("fonts");
    private static final Comparator e = new na();

    public static Typeface a(Context context, mw mwVar, lg lgVar, boolean z, int i, int i2) {
        ReentrantLock reentrantLock;
        Object obj;
        String str = mwVar.e + "-" + i2;
        Typeface typeface = (Typeface) a.a((Object) str);
        if (typeface != null) {
            lgVar.a(typeface);
            return typeface;
        } else if (z && i == -1) {
            nd a2 = a(context, mwVar, i2);
            int i3 = a2.b;
            if (i3 == 0) {
                lgVar.b(a2.a);
            } else {
                lgVar.b(i3);
            }
            return a2.a;
        } else {
            mx mxVar = new mx(context, mwVar, i2, str);
            if (!z) {
                my myVar = new my(lgVar);
                synchronized (b) {
                    ArrayList arrayList = (ArrayList) c.get(str);
                    if (arrayList == null) {
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add(myVar);
                        c.put(str, arrayList2);
                        d.a(new nh(mxVar, new Handler(), new mz(str)));
                        return null;
                    }
                    arrayList.add(myVar);
                    return null;
                }
            }
            try {
                nk nkVar = d;
                reentrantLock = new ReentrantLock();
                Condition newCondition = reentrantLock.newCondition();
                AtomicReference atomicReference = new AtomicReference();
                AtomicBoolean atomicBoolean = new AtomicBoolean(true);
                nkVar.a(new ni(atomicReference, mxVar, reentrantLock, atomicBoolean, newCondition));
                reentrantLock.lock();
                if (atomicBoolean.get()) {
                    long nanos = TimeUnit.MILLISECONDS.toNanos((long) i);
                    while (true) {
                        try {
                            nanos = newCondition.awaitNanos(nanos);
                        } catch (InterruptedException e2) {
                        }
                        if (!atomicBoolean.get()) {
                            obj = atomicReference.get();
                            break;
                        } else if (nanos <= 0) {
                            throw new InterruptedException("timeout");
                        }
                    }
                } else {
                    obj = atomicReference.get();
                }
                reentrantLock.unlock();
                return ((nd) obj).a;
            } catch (InterruptedException e3) {
                return null;
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }
    }

    public static Map a(Context context, nc[] ncVarArr) {
        HashMap hashMap = new HashMap();
        for (nc ncVar : ncVarArr) {
            if (ncVar.e == 0) {
                Uri uri = ncVar.a;
                if (!hashMap.containsKey(uri)) {
                    hashMap.put(uri, lz.a(context, uri));
                }
            }
        }
        return Collections.unmodifiableMap(hashMap);
    }

    /* JADX WARNING: Removed duplicated region for block: B:66:0x0193 A[Catch:{ NameNotFoundException -> 0x020c }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static defpackage.nd a(android.content.Context r25, defpackage.mw r26, int r27) {
        /*
            r0 = r26
            java.lang.String r1 = "result_code"
            java.lang.String r2 = "font_italic"
            java.lang.String r3 = "font_weight"
            java.lang.String r4 = "font_ttc_index"
            java.lang.String r5 = "file_id"
            java.lang.String r6 = "_id"
            java.lang.String r7 = "content"
            android.content.pm.PackageManager r10 = r25.getPackageManager()     // Catch:{ NameNotFoundException -> 0x020c }
            r25.getResources()     // Catch:{ NameNotFoundException -> 0x020c }
            java.lang.String r11 = r0.a     // Catch:{ NameNotFoundException -> 0x020c }
            r12 = 0
            android.content.pm.ProviderInfo r13 = r10.resolveContentProvider(r11, r12)     // Catch:{ NameNotFoundException -> 0x020c }
            if (r13 == 0) goto L_0x01f5
            java.lang.String r14 = r13.packageName     // Catch:{ NameNotFoundException -> 0x020c }
            java.lang.String r15 = r0.b     // Catch:{ NameNotFoundException -> 0x020c }
            boolean r14 = r14.equals(r15)     // Catch:{ NameNotFoundException -> 0x020c }
            if (r14 == 0) goto L_0x01d4
            java.lang.String r11 = r13.packageName     // Catch:{ NameNotFoundException -> 0x020c }
            r14 = 64
            android.content.pm.PackageInfo r10 = r10.getPackageInfo(r11, r14)     // Catch:{ NameNotFoundException -> 0x020c }
            android.content.pm.Signature[] r10 = r10.signatures     // Catch:{ NameNotFoundException -> 0x020c }
            java.util.ArrayList r11 = new java.util.ArrayList     // Catch:{ NameNotFoundException -> 0x020c }
            r11.<init>()     // Catch:{ NameNotFoundException -> 0x020c }
            r14 = 0
        L_0x003a:
            int r15 = r10.length     // Catch:{ NameNotFoundException -> 0x020c }
            if (r14 < r15) goto L_0x01c1
            java.util.Comparator r10 = e     // Catch:{ NameNotFoundException -> 0x020c }
            java.util.Collections.sort(r11, r10)     // Catch:{ NameNotFoundException -> 0x020c }
            java.util.List r10 = r0.d     // Catch:{ NameNotFoundException -> 0x020c }
            r14 = 0
        L_0x0045:
            int r15 = r10.size()     // Catch:{ NameNotFoundException -> 0x020c }
            if (r14 >= r15) goto L_0x008c
            java.util.ArrayList r15 = new java.util.ArrayList     // Catch:{ NameNotFoundException -> 0x020c }
            java.lang.Object r16 = r10.get(r14)     // Catch:{ NameNotFoundException -> 0x020c }
            r8 = r16
            java.util.Collection r8 = (java.util.Collection) r8     // Catch:{ NameNotFoundException -> 0x020c }
            r15.<init>(r8)     // Catch:{ NameNotFoundException -> 0x020c }
            java.util.Comparator r8 = e     // Catch:{ NameNotFoundException -> 0x020c }
            java.util.Collections.sort(r15, r8)     // Catch:{ NameNotFoundException -> 0x020c }
            int r8 = r11.size()     // Catch:{ NameNotFoundException -> 0x020c }
            int r9 = r15.size()     // Catch:{ NameNotFoundException -> 0x020c }
            if (r8 == r9) goto L_0x0068
            goto L_0x0087
        L_0x0068:
            r8 = 0
        L_0x0069:
            int r9 = r11.size()     // Catch:{ NameNotFoundException -> 0x020c }
            if (r8 >= r9) goto L_0x008b
            java.lang.Object r9 = r11.get(r8)     // Catch:{ NameNotFoundException -> 0x020c }
            byte[] r9 = (byte[]) r9     // Catch:{ NameNotFoundException -> 0x020c }
            java.lang.Object r17 = r15.get(r8)     // Catch:{ NameNotFoundException -> 0x020c }
            r12 = r17
            byte[] r12 = (byte[]) r12     // Catch:{ NameNotFoundException -> 0x020c }
            boolean r9 = java.util.Arrays.equals(r9, r12)     // Catch:{ NameNotFoundException -> 0x020c }
            if (r9 == 0) goto L_0x0087
            int r8 = r8 + 1
            r12 = 0
            goto L_0x0069
        L_0x0087:
            int r14 = r14 + 1
            r12 = 0
            goto L_0x0045
        L_0x008b:
            goto L_0x008d
        L_0x008c:
            r13 = 0
        L_0x008d:
            r8 = 1
            if (r13 == 0) goto L_0x0197
            java.lang.String r9 = r13.authority     // Catch:{ NameNotFoundException -> 0x020c }
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch:{ NameNotFoundException -> 0x020c }
            r10.<init>()     // Catch:{ NameNotFoundException -> 0x020c }
            android.net.Uri$Builder r11 = new android.net.Uri$Builder     // Catch:{ NameNotFoundException -> 0x020c }
            r11.<init>()     // Catch:{ NameNotFoundException -> 0x020c }
            android.net.Uri$Builder r11 = r11.scheme(r7)     // Catch:{ NameNotFoundException -> 0x020c }
            android.net.Uri$Builder r11 = r11.authority(r9)     // Catch:{ NameNotFoundException -> 0x020c }
            android.net.Uri r11 = r11.build()     // Catch:{ NameNotFoundException -> 0x020c }
            android.net.Uri$Builder r12 = new android.net.Uri$Builder     // Catch:{ NameNotFoundException -> 0x020c }
            r12.<init>()     // Catch:{ NameNotFoundException -> 0x020c }
            android.net.Uri$Builder r7 = r12.scheme(r7)     // Catch:{ NameNotFoundException -> 0x020c }
            android.net.Uri$Builder r7 = r7.authority(r9)     // Catch:{ NameNotFoundException -> 0x020c }
            java.lang.String r9 = "file"
            android.net.Uri$Builder r7 = r7.appendPath(r9)     // Catch:{ NameNotFoundException -> 0x020c }
            android.net.Uri r7 = r7.build()     // Catch:{ NameNotFoundException -> 0x020c }
            int r9 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x018f }
            android.content.ContentResolver r18 = r25.getContentResolver()     // Catch:{ all -> 0x018f }
            r9 = 7
            java.lang.String[] r9 = new java.lang.String[r9]     // Catch:{ all -> 0x018f }
            r12 = 0
            r9[r12] = r6     // Catch:{ all -> 0x018f }
            r9[r8] = r5     // Catch:{ all -> 0x018f }
            r12 = 2
            r9[r12] = r4     // Catch:{ all -> 0x018f }
            r12 = 3
            java.lang.String r13 = "font_variation_settings"
            r9[r12] = r13     // Catch:{ all -> 0x018f }
            r12 = 4
            r9[r12] = r3     // Catch:{ all -> 0x018f }
            r12 = 5
            r9[r12] = r2     // Catch:{ all -> 0x018f }
            r12 = 6
            r9[r12] = r1     // Catch:{ all -> 0x018f }
            java.lang.String[] r12 = new java.lang.String[r8]     // Catch:{ all -> 0x018f }
            java.lang.String r0 = r0.c     // Catch:{ all -> 0x018f }
            r13 = 0
            r12[r13] = r0     // Catch:{ all -> 0x018f }
            java.lang.String r21 = "query = ?"
            r23 = 0
            r24 = 0
            r19 = r11
            r20 = r9
            r22 = r12
            android.database.Cursor r9 = r18.query(r19, r20, r21, r22, r23, r24)     // Catch:{ all -> 0x018f }
            if (r9 == 0) goto L_0x0178
            int r0 = r9.getCount()     // Catch:{ all -> 0x0176 }
            if (r0 <= 0) goto L_0x0178
            int r0 = r9.getColumnIndex(r1)     // Catch:{ all -> 0x0176 }
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch:{ all -> 0x0176 }
            r10.<init>()     // Catch:{ all -> 0x0176 }
            int r1 = r9.getColumnIndex(r6)     // Catch:{ all -> 0x0176 }
            int r5 = r9.getColumnIndex(r5)     // Catch:{ all -> 0x0176 }
            int r4 = r9.getColumnIndex(r4)     // Catch:{ all -> 0x0176 }
            int r3 = r9.getColumnIndex(r3)     // Catch:{ all -> 0x0176 }
            int r2 = r9.getColumnIndex(r2)     // Catch:{ all -> 0x0176 }
        L_0x011a:
            boolean r6 = r9.moveToNext()     // Catch:{ all -> 0x0176 }
            if (r6 != 0) goto L_0x0121
            goto L_0x0179
        L_0x0121:
            r6 = -1
            if (r0 == r6) goto L_0x012b
            int r12 = r9.getInt(r0)     // Catch:{ all -> 0x0176 }
            r23 = r12
            goto L_0x012d
        L_0x012b:
            r23 = 0
        L_0x012d:
            if (r4 == r6) goto L_0x0136
            int r12 = r9.getInt(r4)     // Catch:{ all -> 0x0176 }
            r20 = r12
            goto L_0x0138
        L_0x0136:
            r20 = 0
        L_0x0138:
            if (r5 == r6) goto L_0x0145
            long r12 = r9.getLong(r5)     // Catch:{ all -> 0x0176 }
            android.net.Uri r6 = android.content.ContentUris.withAppendedId(r7, r12)     // Catch:{ all -> 0x0176 }
            r19 = r6
            goto L_0x014f
        L_0x0145:
            long r12 = r9.getLong(r1)     // Catch:{ all -> 0x0176 }
            android.net.Uri r6 = android.content.ContentUris.withAppendedId(r11, r12)     // Catch:{ all -> 0x0176 }
            r19 = r6
        L_0x014f:
            r6 = -1
            if (r3 == r6) goto L_0x0159
            int r6 = r9.getInt(r3)     // Catch:{ all -> 0x0176 }
            r21 = r6
            goto L_0x015d
        L_0x0159:
            r6 = 400(0x190, float:5.6E-43)
            r21 = 400(0x190, float:5.6E-43)
        L_0x015d:
            r6 = -1
            if (r2 == r6) goto L_0x0169
            int r6 = r9.getInt(r2)     // Catch:{ all -> 0x0176 }
            if (r6 != r8) goto L_0x0169
            r22 = 1
            goto L_0x016b
        L_0x0169:
            r22 = 0
        L_0x016b:
            nc r6 = new nc     // Catch:{ all -> 0x0176 }
            r18 = r6
            r18.<init>(r19, r20, r21, r22, r23)     // Catch:{ all -> 0x0176 }
            r10.add(r6)     // Catch:{ all -> 0x0176 }
            goto L_0x011a
        L_0x0176:
            r0 = move-exception
            goto L_0x0191
        L_0x0178:
        L_0x0179:
            if (r9 != 0) goto L_0x017c
            goto L_0x017f
        L_0x017c:
            r9.close()     // Catch:{ NameNotFoundException -> 0x020c }
        L_0x017f:
            r0 = 0
            nc[] r1 = new defpackage.nc[r0]     // Catch:{ NameNotFoundException -> 0x020c }
            java.lang.Object[] r0 = r10.toArray(r1)     // Catch:{ NameNotFoundException -> 0x020c }
            nc[] r0 = (defpackage.nc[]) r0     // Catch:{ NameNotFoundException -> 0x020c }
            nb r1 = new nb     // Catch:{ NameNotFoundException -> 0x020c }
            r9 = 0
            r1.<init>(r9, r0)     // Catch:{ NameNotFoundException -> 0x020c }
            goto L_0x019e
        L_0x018f:
            r0 = move-exception
            r9 = 0
        L_0x0191:
            if (r9 == 0) goto L_0x0196
            r9.close()     // Catch:{ NameNotFoundException -> 0x020c }
        L_0x0196:
            throw r0     // Catch:{ NameNotFoundException -> 0x020c }
        L_0x0197:
            r9 = 0
            nb r1 = new nb     // Catch:{ NameNotFoundException -> 0x020c }
            r2 = 0
            r1.<init>(r8, r2)     // Catch:{ NameNotFoundException -> 0x020c }
        L_0x019e:
            int r0 = r1.a
            if (r0 != 0) goto L_0x01b9
            nc[] r0 = r1.b
            ly r1 = defpackage.lp.a
            r8 = r25
            r12 = r27
            android.graphics.Typeface r0 = r1.a((android.content.Context) r8, (defpackage.nc[]) r0, (int) r12)
            if (r0 == 0) goto L_0x01b2
            r12 = 0
            goto L_0x01b3
        L_0x01b2:
            r12 = -3
        L_0x01b3:
            nd r1 = new nd
            r1.<init>(r0, r12)
            return r1
        L_0x01b9:
            nd r0 = new nd
            r1 = -2
            r2 = 0
            r0.<init>(r2, r1)
            return r0
        L_0x01c1:
            r8 = r25
            r12 = r27
            r9 = 0
            r15 = r10[r14]     // Catch:{ NameNotFoundException -> 0x020c }
            byte[] r15 = r15.toByteArray()     // Catch:{ NameNotFoundException -> 0x020c }
            r11.add(r15)     // Catch:{ NameNotFoundException -> 0x020c }
            int r14 = r14 + 1
            r12 = 0
            goto L_0x003a
        L_0x01d4:
            android.content.pm.PackageManager$NameNotFoundException r1 = new android.content.pm.PackageManager$NameNotFoundException     // Catch:{ NameNotFoundException -> 0x020c }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ NameNotFoundException -> 0x020c }
            r2.<init>()     // Catch:{ NameNotFoundException -> 0x020c }
            java.lang.String r3 = "Found content provider "
            r2.append(r3)     // Catch:{ NameNotFoundException -> 0x020c }
            r2.append(r11)     // Catch:{ NameNotFoundException -> 0x020c }
            java.lang.String r3 = ", but package was not "
            r2.append(r3)     // Catch:{ NameNotFoundException -> 0x020c }
            java.lang.String r0 = r0.b     // Catch:{ NameNotFoundException -> 0x020c }
            r2.append(r0)     // Catch:{ NameNotFoundException -> 0x020c }
            java.lang.String r0 = r2.toString()     // Catch:{ NameNotFoundException -> 0x020c }
            r1.<init>(r0)     // Catch:{ NameNotFoundException -> 0x020c }
            throw r1     // Catch:{ NameNotFoundException -> 0x020c }
        L_0x01f5:
            android.content.pm.PackageManager$NameNotFoundException r0 = new android.content.pm.PackageManager$NameNotFoundException     // Catch:{ NameNotFoundException -> 0x020c }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ NameNotFoundException -> 0x020c }
            r1.<init>()     // Catch:{ NameNotFoundException -> 0x020c }
            java.lang.String r2 = "No package found for authority: "
            r1.append(r2)     // Catch:{ NameNotFoundException -> 0x020c }
            r1.append(r11)     // Catch:{ NameNotFoundException -> 0x020c }
            java.lang.String r1 = r1.toString()     // Catch:{ NameNotFoundException -> 0x020c }
            r0.<init>(r1)     // Catch:{ NameNotFoundException -> 0x020c }
            throw r0     // Catch:{ NameNotFoundException -> 0x020c }
        L_0x020c:
            r0 = move-exception
            nd r0 = new nd
            r1 = 0
            r2 = -1
            r0.<init>(r1, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ne.a(android.content.Context, mw, int):nd");
    }
}
