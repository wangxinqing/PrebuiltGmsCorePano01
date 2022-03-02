package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* renamed from: qtv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qtv {
    public static final long a = TimeUnit.DAYS.toMillis(1);
    static final String[] b = {"_id"};
    public static final String[] c = {"_id", "type", "thread_id", "address", "date", "subject", "body", "read"};
    public static final String[] d = {"_id", "msg_box", "thread_id", "date", "sub", "read"};
    static final String e = String.format("%s>? OR ((%s=?) AND (%s>?))", new Object[]{"date", "date", "_id"});
    public static final String f = String.format("(%s>? OR ((%s=?) AND (%s>?))) AND (%s<?)", new Object[]{"date", "date", "_id", "date"});
    public static final String g = String.format("(%s>? OR ((%s=?) AND (%s>?))) AND (%s<?)", new Object[]{"date", "date", "_id", "date"});
    private static final anax i = anax.a("image/bmp", "image/gif", "image/jpeg", "image/jpg", "image/png", "text/plain", "video/mp4");
    private static final String[] j = {"type", "address"};
    private static final String[] k = {"_id", "ct", "text"};
    private static final String l = String.format("%s>? OR ((%s=?) AND (%s>?))", new Object[]{"date", "date", "_id"});
    public final qog h;
    private final Context m;

    public static final long a() {
        long Z = axvz.a.a().Z();
        if (Z > 0) {
            return System.currentTimeMillis() - TimeUnit.DAYS.toMillis(Z);
        }
        return -1;
    }

    public final qtg b(int i2) {
        Cursor a2 = this.h.a(qtp.b, d, "_id=?", new String[]{String.valueOf(i2)}, (String) null);
        if (a2 != null) {
            try {
                if (a2.moveToNext()) {
                    qtg b2 = b(a2);
                    a2.close();
                    return b2;
                }
            } catch (Throwable th) {
                apev.a(th, th);
            }
        }
        if (a2 == null) {
            return null;
        }
        a2.close();
        return null;
        throw th;
    }

    public qtv(Context context, qog qog) {
        this.m = context;
        this.h = qog;
    }

    private static String a(List list) {
        return String.format("_id || ';' || date IN (%s) AND read IS 1", new Object[]{TextUtils.join(",", list)});
    }

    private final void a(Uri uri, String str, List list) {
        Cursor a2 = this.h.a(uri, b, str, (String[]) null, (String) null);
        if (a2 != null) {
            while (a2.moveToNext()) {
                try {
                    Integer a3 = jit.a(a2, 0);
                    if (a3 != null) {
                        list.add(a3);
                    }
                } catch (Throwable th) {
                    apev.a(th, th);
                }
            }
        }
        if (a2 != null) {
            a2.close();
            return;
        }
        return;
        throw th;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x014b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
        defpackage.qoi.a(r0, "No permission to read phone number", new java.lang.Object[0]);
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x01d2, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x01d3, code lost:
        r2 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x01d4, code lost:
        if (r6 != null) goto L_0x01d6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:?, code lost:
        r6.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x01da, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x01db, code lost:
        defpackage.apev.a(r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x01df, code lost:
        throw r2;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:26:0x012c, B:30:0x0142] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.qtg b(android.database.Cursor r24) {
        /*
            r23 = this;
            r1 = r23
            r2 = r24
            r3 = 0
            java.lang.Integer r0 = defpackage.jit.a((android.database.Cursor) r2, (int) r3)
            if (r0 == 0) goto L_0x01f9
            r5 = 3
            java.lang.Long r5 = defpackage.jit.b(r2, r5)
            if (r5 == 0) goto L_0x01ee
            long r6 = r5.longValue()
            r8 = 0
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r10 >= 0) goto L_0x001e
            goto L_0x01ee
        L_0x001e:
            java.lang.String r6 = java.lang.String.valueOf(r0)
            java.lang.String r7 = java.lang.String.valueOf(r6)
            int r7 = r7.length()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            int r7 = r7 + 14
            r8.<init>(r7)
            java.lang.String r7 = "content://mms/"
            r8.append(r7)
            r8.append(r6)
            java.lang.String r6 = r8.toString()
            int r7 = r0.intValue()
            qtu r8 = new qtu
            r8.<init>()
            android.net.Uri r9 = defpackage.qtp.b
            java.lang.String r10 = "part"
            android.net.Uri r9 = android.net.Uri.withAppendedPath(r9, r10)
            qog r11 = r1.h
            java.lang.String[] r13 = k
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r12 = 15
            r10.<init>(r12)
            java.lang.String r12 = "mid="
            r10.append(r12)
            r10.append(r7)
            java.lang.String r14 = r10.toString()
            r15 = 0
            r16 = 0
            r12 = r9
            android.database.Cursor r10 = r11.a(r12, r13, r14, r15, r16)
            r11 = 2
            java.lang.String r12 = "Couldn't find MMS part for %d"
            java.lang.String r13 = ","
            r14 = 1
            if (r10 != 0) goto L_0x0081
            java.lang.Object[] r9 = new java.lang.Object[r14]     // Catch:{ all -> 0x01e0 }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x01e0 }
            r9[r3] = r7     // Catch:{ all -> 0x01e0 }
            defpackage.qoi.b(r12, r9)     // Catch:{ all -> 0x01e0 }
            goto L_0x00d9
        L_0x0081:
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ all -> 0x01e0 }
            r7.<init>()     // Catch:{ all -> 0x01e0 }
            java.util.ArrayList r15 = new java.util.ArrayList     // Catch:{ all -> 0x01e0 }
            r15.<init>()     // Catch:{ all -> 0x01e0 }
        L_0x008b:
            boolean r16 = r10.moveToNext()     // Catch:{ all -> 0x01e0 }
            if (r16 == 0) goto L_0x00c9
            java.lang.String r4 = defpackage.jit.c(r10, r3)     // Catch:{ all -> 0x01e0 }
            java.lang.String r3 = defpackage.jit.c(r10, r14)     // Catch:{ all -> 0x01e0 }
            anax r14 = i     // Catch:{ all -> 0x01e0 }
            boolean r14 = r14.contains(r3)     // Catch:{ all -> 0x01e0 }
            if (r14 == 0) goto L_0x00c6
            java.lang.String r14 = "text/plain"
            boolean r14 = r14.equals(r3)     // Catch:{ all -> 0x01e0 }
            if (r14 != 0) goto L_0x00b1
            android.net.Uri r4 = android.net.Uri.withAppendedPath(r9, r4)     // Catch:{ all -> 0x01e0 }
            r7.add(r4)     // Catch:{ all -> 0x01e0 }
            goto L_0x00b8
        L_0x00b1:
            java.lang.String r4 = defpackage.jit.c(r10, r11)     // Catch:{ all -> 0x01e0 }
            r8.a = r4     // Catch:{ all -> 0x01e0 }
        L_0x00b8:
            r4 = 47
            r14 = 95
            java.lang.String r3 = r3.replace(r4, r14)     // Catch:{ all -> 0x01e0 }
            r15.add(r3)     // Catch:{ all -> 0x01e0 }
            r3 = 0
            r14 = 1
            goto L_0x008b
        L_0x00c6:
            r3 = 0
            r14 = 1
            goto L_0x008b
        L_0x00c9:
            java.lang.String r3 = android.text.TextUtils.join(r13, r7)     // Catch:{ all -> 0x01e0 }
            r8.b = r3     // Catch:{ all -> 0x01e0 }
            java.lang.String r3 = android.text.TextUtils.join(r13, r15)     // Catch:{ all -> 0x01e0 }
            r8.c = r3     // Catch:{ all -> 0x01e0 }
            r10.close()
        L_0x00d9:
            qtf r3 = defpackage.qtg.n()
            int r4 = r0.intValue()
            r3.a((int) r4)
            java.lang.String r4 = "mms"
            r3.b((java.lang.String) r4)
            r3.c(r6)
            r4 = 1
            java.lang.Integer r6 = defpackage.jit.a((android.database.Cursor) r2, (int) r4)
            r3.a = r6
            java.lang.Integer r4 = defpackage.jit.a((android.database.Cursor) r2, (int) r11)
            r3.b = r4
            int r0 = r0.intValue()
            android.net.Uri r4 = defpackage.qtp.b
            android.net.Uri$Builder r4 = r4.buildUpon()
            java.lang.String r6 = java.lang.String.valueOf(r0)
            android.net.Uri$Builder r6 = r4.appendPath(r6)
            java.lang.String r7 = "addr"
            r6.appendPath(r7)
            android.net.Uri r18 = r4.build()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            qog r6 = r1.h
            java.lang.String[] r19 = j
            r20 = 0
            r21 = 0
            java.lang.String r22 = "type ASC"
            r17 = r6
            android.database.Cursor r6 = r17.a(r18, r19, r20, r21, r22)
            if (r6 != 0) goto L_0x013a
            r7 = 1
            java.lang.Object[] r9 = new java.lang.Object[r7]     // Catch:{ all -> 0x01d2 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x01d2 }
            r7 = 0
            r9[r7] = r0     // Catch:{ all -> 0x01d2 }
            defpackage.qoi.b(r12, r9)     // Catch:{ all -> 0x01d2 }
            r9 = 1
            goto L_0x0182
        L_0x013a:
            android.content.Context r0 = r1.m     // Catch:{ all -> 0x01d2 }
            android.telephony.TelephonyManager r7 = defpackage.qoj.a(r0)     // Catch:{ all -> 0x01d2 }
            if (r7 == 0) goto L_0x0156
            java.lang.String r7 = r7.getLine1Number()     // Catch:{ SecurityException -> 0x014b }
            java.lang.String r0 = defpackage.qoj.a(r0, r7)     // Catch:{ SecurityException -> 0x014b }
            goto L_0x0157
        L_0x014b:
            r0 = move-exception
            java.lang.String r7 = "No permission to read phone number"
            r9 = 0
            java.lang.Object[] r10 = new java.lang.Object[r9]     // Catch:{ all -> 0x01d2 }
            defpackage.qoi.a(r0, r7, r10)     // Catch:{ all -> 0x01d2 }
            r0 = 0
            goto L_0x0157
        L_0x0156:
            r0 = 0
        L_0x0157:
            boolean r7 = r6.moveToNext()     // Catch:{ all -> 0x01d2 }
            if (r7 == 0) goto L_0x0181
            android.content.Context r7 = r1.m     // Catch:{ all -> 0x01d2 }
            r9 = 1
            java.lang.String r10 = defpackage.jit.c(r6, r9)     // Catch:{ all -> 0x01d2 }
            java.lang.String r7 = defpackage.qoj.a(r7, r10)     // Catch:{ all -> 0x01d2 }
            boolean r10 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x01d2 }
            if (r10 != 0) goto L_0x0157
            boolean r10 = r7.equals(r0)     // Catch:{ all -> 0x01d2 }
            if (r10 != 0) goto L_0x0157
            int r10 = r4.length()     // Catch:{ all -> 0x01d2 }
            if (r10 == 0) goto L_0x017d
            r4.append(r13)     // Catch:{ all -> 0x01d2 }
        L_0x017d:
            r4.append(r7)     // Catch:{ all -> 0x01d2 }
            goto L_0x0157
        L_0x0181:
            r9 = 1
        L_0x0182:
            if (r6 != 0) goto L_0x0185
            goto L_0x0188
        L_0x0185:
            r6.close()
        L_0x0188:
            java.lang.String r0 = r4.toString()
            r3.c = r0
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.SECONDS
            long r6 = r5.longValue()
            long r6 = r0.toMillis(r6)
            r3.a((long) r6)
            r0 = 4
            java.lang.String r0 = defpackage.jit.c(r2, r0)
            r3.d = r0
            java.lang.String r0 = r8.a
            r3.e = r0
            long r4 = r5.longValue()
            int r0 = (int) r4
            r3.b((int) r0)
            java.lang.String r0 = r8.c
            r3.a((java.lang.String) r0)
            java.lang.String r0 = r8.b
            r3.f = r0
            r0 = 5
            r4 = 0
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            java.lang.Integer r0 = defpackage.jit.a((android.database.Cursor) r2, (int) r0, (java.lang.Integer) r5)
            int r0 = r0.intValue()
            if (r0 == 0) goto L_0x01c9
            r4 = 1
            goto L_0x01ca
        L_0x01c9:
        L_0x01ca:
            r3.a((boolean) r4)
            qtg r0 = r3.a()
            return r0
        L_0x01d2:
            r0 = move-exception
            r2 = r0
            if (r6 == 0) goto L_0x01df
            r6.close()     // Catch:{ all -> 0x01da }
            goto L_0x01df
        L_0x01da:
            r0 = move-exception
            r3 = r0
            defpackage.apev.a((java.lang.Throwable) r2, (java.lang.Throwable) r3)
        L_0x01df:
            throw r2
        L_0x01e0:
            r0 = move-exception
            r2 = r0
            if (r10 == 0) goto L_0x01ed
            r10.close()     // Catch:{ all -> 0x01e8 }
            goto L_0x01ed
        L_0x01e8:
            r0 = move-exception
            r3 = r0
            defpackage.apev.a((java.lang.Throwable) r2, (java.lang.Throwable) r3)
        L_0x01ed:
            throw r2
        L_0x01ee:
            qoh r0 = defpackage.qoh.a()
            r2 = 45
            r0.a((int) r2)
            r2 = 0
            return r2
        L_0x01f9:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qtv.b(android.database.Cursor):qtg");
    }

    public final int a(String str, long j2, int i2) {
        String str2;
        String valueOf = String.valueOf(Math.max(j2, !"sms".equals(str) ? a() / 1000 : a()));
        qog qog = this.h;
        Uri uri = "sms".equals(str) ? qtp.a : qtp.b;
        String[] strArr = {"count(*) as count"};
        if (!"sms".equals(str)) {
            str2 = l;
        } else {
            str2 = e;
        }
        Cursor a2 = qog.a(uri, strArr, str2, new String[]{valueOf, valueOf, String.valueOf(i2)}, (String) null);
        if (a2 != null) {
            try {
                if (a2.moveToFirst()) {
                    int intValue = jit.a(a2, 0, (Integer) 0).intValue();
                    a2.close();
                    return intValue;
                }
            } catch (Throwable th) {
                apev.a(th, th);
            }
        }
        if (a2 != null) {
            a2.close();
        }
        return 0;
        throw th;
    }

    public final Iterator a(Uri uri) {
        return new qti("_id", this.h, uri);
    }

    public final List a(int i2, Uri uri, Set set) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            arrayList.add((String) it.next());
            if (arrayList.size() == i2) {
                a(uri, a((List) arrayList), (List) arrayList2);
                arrayList.clear();
            }
        }
        if (!arrayList.isEmpty()) {
            a(uri, a((List) arrayList), (List) arrayList2);
        }
        return arrayList2;
    }

    public final qtg a(int i2) {
        Cursor a2 = this.h.a(qtp.a, c, "_id=?", new String[]{String.valueOf(i2)}, (String) null);
        if (a2 != null) {
            try {
                if (a2.moveToNext()) {
                    qtg a3 = a(a2);
                    a2.close();
                    return a3;
                }
            } catch (Throwable th) {
                apev.a(th, th);
            }
        }
        if (a2 == null) {
            return null;
        }
        a2.close();
        return null;
        throw th;
    }

    /* access modifiers changed from: package-private */
    public final qtg a(Cursor cursor) {
        boolean z = false;
        Integer a2 = jit.a(cursor, 0);
        if (a2 == null) {
            return null;
        }
        Long b2 = jit.b(cursor, 4);
        if (b2 == null || b2.longValue() < 0) {
            qoh.a().a(44);
            return null;
        }
        String valueOf = String.valueOf(a2);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 14);
        sb.append("content://sms/");
        sb.append(valueOf);
        String sb2 = sb.toString();
        qtf n = qtg.n();
        n.a(a2.intValue());
        n.b("sms");
        n.c(sb2);
        n.a = jit.a(cursor, 1);
        n.b = jit.a(cursor, 2);
        n.c = qoj.a(this.m, jit.c(cursor, 3));
        n.a(b2.longValue());
        n.d = jit.c(cursor, 5);
        n.e = jit.c(cursor, 6);
        n.b((int) TimeUnit.MILLISECONDS.toSeconds(b2.longValue()));
        n.a("text_plain");
        if (jit.a(cursor, 7, (Integer) 0).intValue() != 0) {
            z = true;
        }
        n.a(z);
        return n.a();
    }
}
