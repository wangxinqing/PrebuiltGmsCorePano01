package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.android.volley.toolbox.ImageRequest;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Random;
import java.util.concurrent.Executor;
import org.apache.http.message.BasicNameValuePair;

/* renamed from: nyn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class nyn {
    public static final Random a = new Random();
    private static final amsk d = amsk.a(10);
    private static final amsk e = amsk.a('=').a(2);
    final Executor b = jfb.a((int) axlc.a.a().N(), 10);
    public final PriorityQueue c = new PriorityQueue();
    private final Context f;
    private final nsm g;
    private final nyi h;
    private final Object i = new Object();
    private long j;
    private int k;
    private final opc l;

    public nyn(Context context, opc opc, nsm nsm, nyi nyi, ntj ntj) {
        this.f = context.getApplicationContext();
        this.l = opc;
        this.g = nsm;
        this.h = nyi;
        ntj.a(0, (nti) new nyk(this));
        ntj.a(1, (nti) new nyl(this));
    }

    private static final void a(List list, String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            list.add(new BasicNameValuePair(str, str2));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:107:0x0296, code lost:
        if (r3 != 401) goto L_0x0298;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean b(defpackage.nyq r14) {
        /*
            r13 = this;
            int r0 = r14.c
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x0007
            goto L_0x0009
        L_0x0007:
            if (r0 != r1) goto L_0x0026
        L_0x0009:
            android.os.Bundle r0 = r14.e
            java.lang.String r3 = "sender"
            java.lang.String r0 = r0.getString(r3)
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0018
            goto L_0x0026
        L_0x0018:
            java.lang.String r0 = "GCM"
            java.lang.String r1 = "Invalid parameter sender"
            android.util.Log.w(r0, r1)
            java.lang.String r0 = "INVALID_PARAMETERS"
            r13.a((defpackage.nyq) r14, (java.lang.String) r0, (boolean) r2)
            return r2
        L_0x0026:
            nsm r0 = r13.g
            boolean r0 = r0.a()
            if (r0 != 0) goto L_0x0034
            java.lang.String r0 = "AUTHENTICATION_FAILED"
            r13.a((defpackage.nyq) r14, (java.lang.String) r0, (boolean) r2)
            return r2
        L_0x0034:
            java.lang.String r0 = defpackage.axlc.b()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x039f
            java.lang.Object r0 = r13.i
            monitor-enter(r0)
            long r3 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x039c }
            long r5 = r13.j     // Catch:{ all -> 0x039c }
            monitor-exit(r0)     // Catch:{ all -> 0x039c }
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 <= 0) goto L_0x0395
            java.lang.String r0 = defpackage.axlc.b()
            org.apache.http.client.methods.HttpPost r3 = new org.apache.http.client.methods.HttpPost
            r3.<init>(r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            android.os.Bundle r4 = r14.e
            java.util.Set r4 = r4.keySet()
            java.util.Iterator r4 = r4.iterator()
        L_0x0064:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x00c0
            java.lang.Object r5 = r4.next()
            java.lang.String r5 = (java.lang.String) r5
            android.os.Bundle r6 = r14.e
            java.lang.String r6 = r6.getString(r5)
            boolean r7 = android.text.TextUtils.isEmpty(r6)
            if (r7 == 0) goto L_0x0098
            java.lang.String r5 = java.lang.String.valueOf(r5)
            java.lang.String r6 = "Ignoring registration extra: "
            int r7 = r5.length()
            if (r7 != 0) goto L_0x008e
            java.lang.String r5 = new java.lang.String
            r5.<init>(r6)
            goto L_0x0092
        L_0x008e:
            java.lang.String r5 = r6.concat(r5)
        L_0x0092:
            java.lang.String r6 = "GCM"
            android.util.Log.w(r6, r5)
            goto L_0x0064
        L_0x0098:
            java.lang.String r7 = "sender"
            boolean r7 = r7.equals(r5)
            if (r7 != 0) goto L_0x00b7
            java.lang.String r5 = java.lang.String.valueOf(r5)
            java.lang.String r7 = "X-"
            int r8 = r5.length()
            if (r8 != 0) goto L_0x00b3
            java.lang.String r5 = new java.lang.String
            r5.<init>(r7)
            goto L_0x00b7
        L_0x00b3:
            java.lang.String r5 = r7.concat(r5)
        L_0x00b7:
            org.apache.http.message.BasicNameValuePair r7 = new org.apache.http.message.BasicNameValuePair
            r7.<init>(r5, r6)
            r0.add(r7)
            goto L_0x0064
        L_0x00c0:
            java.util.Map r4 = r14.f
            java.util.Set r4 = r4.entrySet()
            java.util.Iterator r4 = r4.iterator()
        L_0x00ca:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x00eb
            java.lang.Object r5 = r4.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            org.apache.http.message.BasicNameValuePair r6 = new org.apache.http.message.BasicNameValuePair
            java.lang.Object r7 = r5.getKey()
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r5 = r5.getValue()
            java.lang.String r5 = (java.lang.String) r5
            r6.<init>(r7, r5)
            r0.add(r6)
            goto L_0x00ca
        L_0x00eb:
            ntx r4 = r14.d
            java.lang.String r4 = r4.a
            java.lang.String r5 = "app"
            a((java.util.List) r0, (java.lang.String) r5, (java.lang.String) r4)
            nsm r4 = r13.g
            java.lang.String r4 = r4.b()
            java.lang.String r5 = "device"
            a((java.util.List) r0, (java.lang.String) r5, (java.lang.String) r4)
            ntx r4 = r14.d
            int r4 = r4.b
            if (r4 == 0) goto L_0x010e
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.String r5 = "device_user_id"
            a((java.util.List) r0, (java.lang.String) r5, (java.lang.String) r4)
        L_0x010e:
            android.content.Context r4 = r13.f
            ntx r5 = r14.d
            java.lang.String r5 = r5.a
            int r4 = defpackage.nsm.b(r4, r5)
            java.lang.String r4 = java.lang.Integer.toString(r4)
            java.lang.String r5 = "app_ver"
            a((java.util.List) r0, (java.lang.String) r5, (java.lang.String) r4)
            android.content.Context r4 = r13.f
            java.lang.String r4 = defpackage.nsm.a((android.content.Context) r4)
            java.lang.String r5 = "info"
            a((java.util.List) r0, (java.lang.String) r5, (java.lang.String) r4)
            java.lang.String r4 = "201216073"
            java.lang.String r5 = "gcm_ver"
            a((java.util.List) r0, (java.lang.String) r5, (java.lang.String) r4)
            java.lang.String r5 = "plat"
            java.lang.String r6 = "0"
            a((java.util.List) r0, (java.lang.String) r5, (java.lang.String) r6)
            ntx r5 = r14.d
            r6 = 0
            nrr r7 = defpackage.nrr.a()     // Catch:{ NameNotFoundException -> 0x016a }
            ntv r7 = r7.l     // Catch:{ NameNotFoundException -> 0x016a }
            r8 = 64
            android.content.pm.PackageInfo r5 = r5.b(r7, r8)     // Catch:{ NameNotFoundException -> 0x016a }
            java.lang.String r7 = "cert"
            java.lang.String r8 = defpackage.jhg.a((android.content.pm.PackageInfo) r5)     // Catch:{ NameNotFoundException -> 0x016a }
            if (r8 == 0) goto L_0x0158
            java.util.Locale r9 = java.util.Locale.US     // Catch:{ NameNotFoundException -> 0x016a }
            java.lang.String r8 = r8.toLowerCase(r9)     // Catch:{ NameNotFoundException -> 0x016a }
            goto L_0x0159
        L_0x0158:
            r8 = r6
        L_0x0159:
            a((java.util.List) r0, (java.lang.String) r7, (java.lang.String) r8)     // Catch:{ NameNotFoundException -> 0x016a }
            java.lang.String r7 = "target_ver"
            android.content.pm.ApplicationInfo r5 = r5.applicationInfo     // Catch:{ NameNotFoundException -> 0x016a }
            int r5 = r5.targetSdkVersion     // Catch:{ NameNotFoundException -> 0x016a }
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ NameNotFoundException -> 0x016a }
            a((java.util.List) r0, (java.lang.String) r7, (java.lang.String) r5)     // Catch:{ NameNotFoundException -> 0x016a }
            goto L_0x016b
        L_0x016a:
            r5 = move-exception
        L_0x016b:
            axli r5 = defpackage.axli.a
            axlj r5 = r5.a()
            long r7 = r5.a()
            int r5 = (int) r7
            r7 = 2
            if (r5 != r7) goto L_0x017a
            goto L_0x0182
        L_0x017a:
            if (r5 != r1) goto L_0x0226
            ntx r5 = r14.d
            int r5 = r5.b
            if (r5 != 0) goto L_0x0226
        L_0x0182:
            nrr r5 = defpackage.nrr.a()
            ntv r5 = r5.l
            ntx r8 = r14.d
            int r8 = r8.b
            android.content.Context r5 = r5.b(r8)
            qgq r5 = defpackage.qdy.a((android.content.Context) r5)
            ntx r8 = r14.d
            java.lang.String r8 = r8.a
            int r9 = android.os.Build.VERSION.SDK_INT
            r10 = 26
            if (r9 < r10) goto L_0x01a9
            android.content.Context r5 = r5.a
            android.content.pm.PackageManager r5 = r5.getPackageManager()
            boolean r5 = r5.isInstantApp(r8)
            goto L_0x01d8
        L_0x01a9:
            android.content.Context r5 = r5.a
            qgn r5 = defpackage.qgn.a(r5)
            if (r5 == 0) goto L_0x0226
            android.os.Bundle r9 = new android.os.Bundle     // Catch:{ RemoteException -> 0x021e }
            r9.<init>()     // Catch:{ RemoteException -> 0x021e }
            java.lang.String r10 = "packageName"
            r9.putString(r10, r8)     // Catch:{ RemoteException -> 0x021e }
            java.lang.String r8 = "isInstantApp"
            long r10 = android.os.Binder.clearCallingIdentity()     // Catch:{ RemoteException -> 0x021e }
            android.content.Context r5 = r5.a     // Catch:{ IllegalArgumentException -> 0x020e, SecurityException -> 0x0202 }
            android.content.ContentResolver r5 = r5.getContentResolver()     // Catch:{ IllegalArgumentException -> 0x020e, SecurityException -> 0x0202 }
            android.net.Uri r12 = defpackage.qgo.a     // Catch:{ IllegalArgumentException -> 0x020e, SecurityException -> 0x0202 }
            android.os.Bundle r5 = r5.call(r12, r8, r6, r9)     // Catch:{ IllegalArgumentException -> 0x020e, SecurityException -> 0x0202 }
            android.os.Binder.restoreCallingIdentity(r10)     // Catch:{ RemoteException -> 0x021e }
            if (r5 == 0) goto L_0x01fa
            java.lang.String r6 = "result"
            boolean r5 = r5.getBoolean(r6)     // Catch:{ RemoteException -> 0x021e }
        L_0x01d8:
            if (r5 != 0) goto L_0x01db
            goto L_0x0226
        L_0x01db:
            axli r5 = defpackage.axli.a
            axlj r5 = r5.a()
            boolean r5 = r5.b()
            if (r5 == 0) goto L_0x01f1
            java.lang.String r5 = java.lang.Boolean.toString(r1)
            java.lang.String r6 = "android_instant_app"
            a((java.util.List) r0, (java.lang.String) r6, (java.lang.String) r5)
            goto L_0x0226
        L_0x01f1:
            java.lang.String r0 = "SERVICE_NOT_AVAILABLE"
            r13.a((defpackage.nyq) r14, (java.lang.String) r0, (boolean) r2)
            r1 = 0
            goto L_0x0394
        L_0x01fa:
            android.os.RemoteException r5 = new android.os.RemoteException     // Catch:{ RemoteException -> 0x021e }
            r5.<init>()     // Catch:{ RemoteException -> 0x021e }
            throw r5     // Catch:{ RemoteException -> 0x021e }
        L_0x0200:
            r5 = move-exception
            goto L_0x021a
        L_0x0202:
            r5 = move-exception
            defpackage.qgn.a()     // Catch:{ all -> 0x0200 }
            android.os.RemoteException r5 = new android.os.RemoteException     // Catch:{ all -> 0x0200 }
            java.lang.String r6 = "SecurityException: Content provider unavailable. Likely framework issue."
            r5.<init>(r6)     // Catch:{ all -> 0x0200 }
            throw r5     // Catch:{ all -> 0x0200 }
        L_0x020e:
            r5 = move-exception
            defpackage.qgn.a()     // Catch:{ all -> 0x0200 }
            android.os.RemoteException r5 = new android.os.RemoteException     // Catch:{ all -> 0x0200 }
            java.lang.String r6 = "IAE: Content provider unavailable. Likely GmsCore down."
            r5.<init>(r6)     // Catch:{ all -> 0x0200 }
            throw r5     // Catch:{ all -> 0x0200 }
        L_0x021a:
            android.os.Binder.restoreCallingIdentity(r10)     // Catch:{ RemoteException -> 0x021e }
            throw r5     // Catch:{ RemoteException -> 0x021e }
        L_0x021e:
            r5 = move-exception
            java.lang.String r6 = "InstantAppsPMW"
            java.lang.String r8 = "Error checking if app is instant app"
            android.util.Log.e(r6, r8, r5)
        L_0x0226:
            nsm r5 = r13.g
            java.lang.String r5 = r5.b()
            nsm r6 = r13.g
            java.lang.String r6 = r6.c()
            if (r5 != 0) goto L_0x0235
            goto L_0x0260
        L_0x0235:
            if (r6 == 0) goto L_0x0260
            int r8 = r5.length()
            int r9 = r6.length()
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            int r8 = r8 + 10
            int r8 = r8 + r9
            r10.<init>(r8)
            java.lang.String r8 = "AidLogin "
            r10.append(r8)
            r10.append(r5)
            java.lang.String r5 = ":"
            r10.append(r5)
            r10.append(r6)
            java.lang.String r5 = r10.toString()
            java.lang.String r6 = "Authorization"
            r3.addHeader(r6, r5)
        L_0x0260:
            ntx r5 = r14.d
            java.lang.String r5 = r5.a
            java.lang.String r6 = "app"
            r3.addHeader(r6, r5)
            java.lang.String r5 = "gcm_ver"
            r3.addHeader(r5, r4)
            org.apache.http.client.entity.UrlEncodedFormEntity r4 = new org.apache.http.client.entity.UrlEncodedFormEntity     // Catch:{ UnsupportedEncodingException -> 0x038d }
            r4.<init>(r0)     // Catch:{ UnsupportedEncodingException -> 0x038d }
            r3.setEntity(r4)
            r0 = 1031(0x407, float:1.445E-42)
            defpackage.izj.b(r0)     // Catch:{ IOException -> 0x037e }
            opc r0 = r13.l     // Catch:{ IOException -> 0x037e }
            org.apache.http.HttpResponse r0 = r0.execute(r3)     // Catch:{ IOException -> 0x037e }
            org.apache.http.StatusLine r3 = r0.getStatusLine()     // Catch:{ IOException -> 0x037e }
            int r3 = r3.getStatusCode()     // Catch:{ IOException -> 0x037e }
            r4 = 200(0xc8, float:2.8E-43)
            if (r3 != r4) goto L_0x028e
            goto L_0x0298
        L_0x028e:
            r4 = 403(0x193, float:5.65E-43)
            if (r3 != r4) goto L_0x0294
            goto L_0x0376
        L_0x0294:
            r4 = 401(0x191, float:5.62E-43)
            if (r3 == r4) goto L_0x0376
        L_0x0298:
            org.apache.http.HttpEntity r0 = r0.getEntity()     // Catch:{ IOException -> 0x037e }
            java.lang.String r3 = "UTF-8"
            java.lang.String r0 = org.apache.http.util.EntityUtils.toString(r0, r3)     // Catch:{ IOException -> 0x037e }
            defpackage.izj.a()
            amsk r3 = d
            java.lang.Iterable r3 = r3.a((java.lang.CharSequence) r0)
            ou r4 = new ou
            r4.<init>()
            java.util.Iterator r3 = r3.iterator()
        L_0x02b4:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x02f2
            java.lang.Object r5 = r3.next()
            java.lang.String r5 = (java.lang.String) r5
            amsk r6 = e
            java.util.List r6 = r6.c(r5)
            int r8 = r6.size()
            if (r8 <= r1) goto L_0x02dc
            java.lang.Object r5 = r6.get(r2)
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r6 = r6.get(r1)
            java.lang.String r6 = (java.lang.String) r6
            r4.put(r5, r6)
            goto L_0x02b4
        L_0x02dc:
            java.lang.String r5 = java.lang.String.valueOf(r5)
            java.lang.String r6 = "Unexpected result: "
            int r8 = r5.length()
            if (r8 != 0) goto L_0x02ee
            java.lang.String r5 = new java.lang.String
            r5.<init>(r6)
            goto L_0x02b4
        L_0x02ee:
            r6.concat(r5)
            goto L_0x02b4
        L_0x02f2:
            java.lang.String r3 = "token"
            boolean r3 = r4.containsKey(r3)
            if (r3 == 0) goto L_0x032a
            java.lang.String r0 = "token"
            java.lang.Object r0 = r4.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            r13.a()
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
            java.lang.String r3 = "registration_id"
            r2.putString(r3, r0)
            android.content.Context r0 = r13.f
            r14.a((android.content.Context) r0, (android.os.Bundle) r2)
            int r0 = r14.a()
            if (r0 != 0) goto L_0x0324
            nyi r0 = r13.h
            ntx r14 = r14.d
            nua r0 = r0.b
            r0.a((defpackage.ntx) r14, (int) r7)
        L_0x0324:
            nyi r14 = r13.h
            r14.a((defpackage.nyn) r13)
            goto L_0x0394
        L_0x032a:
            java.lang.String r3 = "deleted"
            boolean r3 = r4.containsKey(r3)
            if (r3 == 0) goto L_0x034a
            r13.a()
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            ntx r2 = r14.d
            java.lang.String r2 = r2.a
            java.lang.String r3 = "unregistered"
            r0.putString(r3, r2)
            android.content.Context r2 = r13.f
            r14.a((android.content.Context) r2, (android.os.Bundle) r0)
            goto L_0x0394
        L_0x034a:
            if (r0 != 0) goto L_0x034d
            goto L_0x036e
        L_0x034d:
            java.lang.String r3 = "Error="
            boolean r3 = r0.startsWith(r3)
            if (r3 == 0) goto L_0x036e
            r3 = 6
            java.lang.String r0 = r0.substring(r3)
            java.lang.String r3 = "\n"
            boolean r3 = r0.endsWith(r3)
            if (r3 == 0) goto L_0x0370
            int r3 = r0.length()
            int r3 = r3 + -1
            java.lang.String r0 = r0.substring(r2, r3)
            goto L_0x0370
        L_0x036e:
            java.lang.String r0 = "SERVICE_NOT_AVAILABLE"
        L_0x0370:
            r13.a((defpackage.nyq) r14, (java.lang.String) r0, (boolean) r1)
            r1 = 0
            goto L_0x0394
        L_0x0376:
            java.lang.String r0 = "AUTHENTICATION_FAILED"
            r13.a((defpackage.nyq) r14, (java.lang.String) r0, (boolean) r1)     // Catch:{ IOException -> 0x037e }
            goto L_0x0384
        L_0x037c:
            r14 = move-exception
            goto L_0x0389
        L_0x037e:
            r0 = move-exception
            java.lang.String r0 = "SERVICE_NOT_AVAILABLE"
            r13.a((defpackage.nyq) r14, (java.lang.String) r0, (boolean) r1)     // Catch:{ all -> 0x037c }
        L_0x0384:
            defpackage.izj.a()
            r1 = 0
            goto L_0x0394
        L_0x0389:
            defpackage.izj.a()
            throw r14
        L_0x038d:
            r0 = move-exception
            java.lang.String r0 = "INVALID_PARAMETERS"
            r13.a((defpackage.nyq) r14, (java.lang.String) r0, (boolean) r2)
            r1 = 0
        L_0x0394:
            return r1
        L_0x0395:
            java.lang.String r0 = "SERVICE_NOT_AVAILABLE"
            r13.a((defpackage.nyq) r14, (java.lang.String) r0, (boolean) r2)
            return r2
        L_0x039c:
            r14 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x039c }
            throw r14
        L_0x039f:
            java.lang.String r0 = "SERVICE_DISABLED"
            r13.a((defpackage.nyq) r14, (java.lang.String) r0, (boolean) r2)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nyn.b(nyq):boolean");
    }

    private final void a(nyq nyq, String str, boolean z) {
        int i2;
        if (z) {
            if (str.equals("SERVICE_NOT_AVAILABLE") || str.equals("AUTHENTICATION_FAILED")) {
                int H = (int) axlc.a.a().H();
                if (H != 0) {
                    synchronized (this.i) {
                        int i3 = this.k;
                        if (i3 == 0) {
                            i2 = ((int) axlc.a.a().K()) + a.nextInt(ImageRequest.DEFAULT_IMAGE_TIMEOUT_MS);
                            this.k = i2;
                        } else {
                            i2 = i3 + i3;
                            this.k = i2;
                        }
                        this.k = Math.min(i2, H);
                        this.j = System.currentTimeMillis() + ((long) this.k);
                    }
                }
            } else {
                a();
            }
        }
        Bundle bundle = new Bundle();
        bundle.putString("error", str);
        nyq.a(this.f, bundle);
    }

    public final void a() {
        synchronized (this.i) {
            this.j = 0;
            this.k = 0;
        }
    }

    public final void a(Runnable runnable) {
        this.b.execute(runnable);
    }

    public final void a(nth nth) {
        a((nyq) new nyo(nth.c, nth.d, Collections.emptyMap(), nth));
    }

    public final void a(nyq nyq) {
        synchronized (this) {
            this.c.offer(nyq);
        }
        this.b.execute(new nym(this));
    }
}
