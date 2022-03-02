package defpackage;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.feedback.LogOptions;
import java.util.Map;

/* renamed from: mxu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class mxu {
    static final String[] a = {"logcat", "-d", "-v", "time"};
    static final String[] b = {"logcat", "-d", "-b", "events", "-v", "time"};
    static final String[] c = {"logcat", "-d", "-b", "radio", "-v", "time"};
    static final Runnable d = new mxq();
    static Handler e;
    static mxs f;
    public static mxt g;
    static volatile Process h;
    public static LogOptions i;

    /* JADX WARNING: Removed duplicated region for block: B:37:0x00c4 A[Catch:{ IOException -> 0x00ca }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.Map a(com.google.android.gms.feedback.LogOptions r9) {
        /*
            nz r0 = new nz
            r0.<init>()
            java.lang.String[] r1 = b
            java.lang.String r2 = "event_log"
            r0.put(r2, r1)
            java.lang.String r1 = "system_log"
            if (r9 != 0) goto L_0x0016
            java.lang.String[] r9 = a
            r0.put(r1, r9)
            goto L_0x003c
        L_0x0016:
            java.lang.String r2 = r9.a
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L_0x002c
            java.lang.String[] r2 = a
            java.lang.String r3 = r9.a
            java.lang.Object[] r2 = defpackage.jhx.b(r2, r3)
            java.lang.String[] r2 = (java.lang.String[]) r2
            r0.put(r1, r2)
            goto L_0x0031
        L_0x002c:
            java.lang.String[] r2 = a
            r0.put(r1, r2)
        L_0x0031:
            boolean r9 = r9.b
            if (r9 == 0) goto L_0x003c
            java.lang.String[] r9 = c
            java.lang.String r1 = "radio_log"
            r0.put(r1, r9)
        L_0x003c:
            nz r9 = new nz
            r9.<init>()
            java.util.Set r1 = r0.keySet()
            java.util.Iterator r1 = r1.iterator()
        L_0x0049:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x00d0
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r3 = r0.get(r2)     // Catch:{ IOException -> 0x00ca }
            java.lang.String[] r3 = (java.lang.String[]) r3     // Catch:{ IOException -> 0x00ca }
            java.lang.Runtime r4 = java.lang.Runtime.getRuntime()     // Catch:{ IOException -> 0x00ca }
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ IOException -> 0x00ca }
            r5.<init>()     // Catch:{ IOException -> 0x00ca }
            r6 = 0
            java.lang.Process r3 = r4.exec(r3)     // Catch:{ all -> 0x00c0 }
            h = r3     // Catch:{ all -> 0x00c0 }
            java.io.InputStream r3 = r3.getInputStream()     // Catch:{ all -> 0x00c0 }
            java.io.InputStreamReader r4 = new java.io.InputStreamReader     // Catch:{ all -> 0x00be }
            r4.<init>(r3)     // Catch:{ all -> 0x00be }
            java.io.BufferedReader r7 = new java.io.BufferedReader     // Catch:{ all -> 0x00be }
            r7.<init>(r4)     // Catch:{ all -> 0x00be }
        L_0x0079:
            java.lang.String r4 = r7.readLine()     // Catch:{ all -> 0x00be }
            if (r4 == 0) goto L_0x0087
            java.lang.String r4 = r4.trim()     // Catch:{ all -> 0x00be }
            r5.add(r4)     // Catch:{ all -> 0x00be }
            goto L_0x0079
        L_0x0087:
            int r4 = r5.size()     // Catch:{ all -> 0x00be }
            long r7 = defpackage.axgy.h()     // Catch:{ all -> 0x00be }
            int r8 = (int) r7     // Catch:{ all -> 0x00be }
            if (r4 <= r8) goto L_0x00a5
            int r4 = r5.size()     // Catch:{ all -> 0x00be }
            long r7 = defpackage.axgy.h()     // Catch:{ all -> 0x00be }
            int r8 = (int) r7     // Catch:{ all -> 0x00be }
            int r4 = r4 - r8
            int r7 = r5.size()     // Catch:{ all -> 0x00be }
            java.util.List r5 = r5.subList(r4, r7)     // Catch:{ all -> 0x00be }
            goto L_0x00a6
        L_0x00a5:
        L_0x00a6:
            int r4 = r5.size()     // Catch:{ all -> 0x00be }
            java.lang.String[] r4 = new java.lang.String[r4]     // Catch:{ all -> 0x00be }
            java.lang.Object[] r4 = r5.toArray(r4)     // Catch:{ all -> 0x00be }
            java.lang.String[] r4 = (java.lang.String[]) r4     // Catch:{ all -> 0x00be }
            if (r3 != 0) goto L_0x00b5
            goto L_0x00b8
        L_0x00b5:
            r3.close()     // Catch:{ IOException -> 0x00ca }
        L_0x00b8:
            h = r6     // Catch:{ IOException -> 0x00ca }
            r9.put(r2, r4)     // Catch:{ IOException -> 0x00ca }
            goto L_0x0049
        L_0x00be:
            r2 = move-exception
            goto L_0x00c2
        L_0x00c0:
            r2 = move-exception
            r3 = r6
        L_0x00c2:
            if (r3 == 0) goto L_0x00c7
            r3.close()     // Catch:{ IOException -> 0x00ca }
        L_0x00c7:
            h = r6     // Catch:{ IOException -> 0x00ca }
            throw r2     // Catch:{ IOException -> 0x00ca }
        L_0x00ca:
            r2 = move-exception
            defpackage.apev.a(r2)
            goto L_0x0049
        L_0x00d0:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mxu.a(com.google.android.gms.feedback.LogOptions):java.util.Map");
    }

    public static synchronized void a() {
        synchronized (mxu.class) {
            if (e == null) {
                e = new qvr(Looper.getMainLooper());
            }
            if (f == null) {
                mxs mxs = new mxs();
                f = mxs;
                mxs.start();
                e.postDelayed(d, 15000);
                return;
            }
            a(f.a);
        }
    }

    public static void a(Map map) {
        e.removeCallbacks(d);
        e.post(new mxr(map));
    }
}
