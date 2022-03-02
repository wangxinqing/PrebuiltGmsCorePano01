package defpackage;

import android.content.Context;
import android.net.Uri;
import android.util.Log;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: xsd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class xsd implements xsc {
    public static final Uri a = Uri.parse("content://com.google.android.gsf.gservices");
    private static final String[] c = {"android_id"};
    public final Context b;
    private final iby d;

    public xsd(Context context) {
        this.b = context;
        this.d = rou.a(context);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0030, code lost:
        if (r0 == null) goto L_0x0057;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0033, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0054, code lost:
        if (r0 != null) goto L_0x0033;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0057, code lost:
        android.util.Log.e("DeviceUsageSettingsHelper", "getAndroidId: Unable to get androidId");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0061, code lost:
        return defpackage.ampu.a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0065  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.amri a() {
        /*
            r8 = this;
            r0 = 0
            android.content.Context r1 = r8.b     // Catch:{ SecurityException -> 0x0039, all -> 0x0037 }
            android.content.ContentResolver r2 = r1.getContentResolver()     // Catch:{ SecurityException -> 0x0039, all -> 0x0037 }
            android.net.Uri r3 = a     // Catch:{ SecurityException -> 0x0039, all -> 0x0037 }
            r4 = 0
            r5 = 0
            java.lang.String[] r6 = c     // Catch:{ SecurityException -> 0x0039, all -> 0x0037 }
            r7 = 0
            android.database.Cursor r0 = r2.query(r3, r4, r5, r6, r7)     // Catch:{ SecurityException -> 0x0039, all -> 0x0037 }
            if (r0 == 0) goto L_0x0030
            boolean r1 = r0.moveToFirst()     // Catch:{ SecurityException -> 0x002e }
            if (r1 == 0) goto L_0x0030
            int r1 = r0.getColumnCount()     // Catch:{ SecurityException -> 0x002e }
            r2 = 2
            if (r1 < r2) goto L_0x0030
            r1 = 1
            java.lang.String r1 = r0.getString(r1)     // Catch:{ SecurityException -> 0x002e }
            amri r1 = defpackage.amri.b(r1)     // Catch:{ SecurityException -> 0x002e }
            r0.close()
            return r1
        L_0x002e:
            r1 = move-exception
            goto L_0x003a
        L_0x0030:
            if (r0 != 0) goto L_0x0033
            goto L_0x0057
        L_0x0033:
            r0.close()
            goto L_0x0057
        L_0x0037:
            r1 = move-exception
            goto L_0x0063
        L_0x0039:
            r1 = move-exception
        L_0x003a:
            defpackage.xip.a()     // Catch:{ all -> 0x0062 }
            yde r2 = defpackage.yde.a     // Catch:{ all -> 0x0062 }
            android.content.Context r3 = r8.b     // Catch:{ all -> 0x0062 }
            ydd r2 = r2.a(r3)     // Catch:{ all -> 0x0062 }
            xfs r3 = defpackage.xic.a     // Catch:{ all -> 0x0062 }
            java.lang.Object r3 = r3.a()     // Catch:{ all -> 0x0062 }
            java.lang.Double r3 = (java.lang.Double) r3     // Catch:{ all -> 0x0062 }
            double r3 = r3.doubleValue()     // Catch:{ all -> 0x0062 }
            r2.a(r1, r3)     // Catch:{ all -> 0x0062 }
            if (r0 == 0) goto L_0x0057
            goto L_0x0033
        L_0x0057:
            java.lang.String r0 = "DeviceUsageSettingsHelper"
            java.lang.String r1 = "getAndroidId: Unable to get androidId"
            android.util.Log.e(r0, r1)
            ampu r0 = defpackage.ampu.a
            return r0
        L_0x0062:
            r1 = move-exception
        L_0x0063:
            if (r0 == 0) goto L_0x0068
            r0.close()
        L_0x0068:
            goto L_0x006a
        L_0x0069:
            throw r1
        L_0x006a:
            goto L_0x0069
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xsd.a():amri");
    }

    public final amri b() {
        try {
            return amri.b((ick) acws.a(this.d.g(), 500, TimeUnit.MILLISECONDS));
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            Log.w("DeviceUsageSettingsHelper", "Failed to get Lockbox signed-in status");
            if (e instanceof InterruptedException) {
                Thread.currentThread().interrupt();
            }
            return ampu.a;
        }
    }
}
