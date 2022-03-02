package defpackage;

import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.text.TextUtils;
import java.lang.ref.WeakReference;

/* renamed from: aptj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aptj extends AsyncTask {
    private static final iwd a = new iwd("FirebaseAuth", "GetAuthDomainTask");
    private final String b;
    private final String c;
    private final WeakReference d;
    private final Uri.Builder e;
    private final String f;

    public aptj(String str, String str2, Intent intent, aptl aptl) {
        iva.c(str);
        this.b = str;
        iva.c(str2);
        iva.a((Object) intent);
        String stringExtra = intent.getStringExtra("com.google.firebase.auth.KEY_API_KEY");
        iva.c(stringExtra);
        Uri.Builder buildUpon = Uri.parse(aptl.a()).buildUpon();
        Uri.Builder appendQueryParameter = buildUpon.appendPath("getProjectConfig").appendQueryParameter("alt", "proto").appendQueryParameter("key", stringExtra).appendQueryParameter("androidPackageName", str);
        iva.a((Object) str2);
        appendQueryParameter.appendQueryParameter("sha1Cert", str2);
        this.c = buildUpon.build().toString();
        this.d = new WeakReference(aptl);
        this.e = aptl.a(intent, str, str2);
        this.f = intent.getStringExtra("com.google.firebase.auth.KEY_CUSTOM_AUTH_DOMAIN");
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void onPostExecute(apti apti) {
        String str;
        Uri.Builder builder;
        aptl aptl = (aptl) this.d.get();
        String str2 = null;
        if (apti != null) {
            str2 = apti.a;
            str = apti.b;
        } else {
            str = null;
        }
        if (aptl == null) {
            a.e("An error has occurred: the handler reference has returned null.", new Object[0]);
        } else if (!TextUtils.isEmpty(str2) && (builder = this.e) != null) {
            builder.authority(str2);
            aptl.a(this.e.build(), this.b);
        } else {
            aptl.a(this.b, apvs.a(str));
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00f2, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00f3, code lost:
        r2 = a;
        r1 = java.lang.String.valueOf(r1);
        r4 = new java.lang.StringBuilder(java.lang.String.valueOf(r1).length() + 26);
        r4.append("Null pointer encountered: ");
        r4.append(r1);
        r2.e(r4.toString(), new java.lang.Object[0]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x011a, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x011b, code lost:
        r2 = a;
        r1 = java.lang.String.valueOf(r1);
        r4 = new java.lang.StringBuilder(java.lang.String.valueOf(r1).length() + 21);
        r4.append("IOException ocurred: ");
        r4.append(r1);
        r2.e(r4.toString(), new java.lang.Object[0]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:?, code lost:
        return null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00d7 A[Catch:{ IOException -> 0x011a, NullPointerException -> 0x00f2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00f2 A[ExcHandler: NullPointerException (r1v3 'e' java.lang.NullPointerException A[CUSTOM_DECLARE]), Splitter:B:4:0x0014] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object doInBackground(java.lang.Object[] r9) {
        /*
            r8 = this;
            java.lang.Void[] r9 = (java.lang.Void[]) r9
            java.lang.String r9 = r8.f
            boolean r9 = android.text.TextUtils.isEmpty(r9)
            r0 = 0
            if (r9 != 0) goto L_0x0013
            java.lang.String r9 = r8.f
            apti r0 = defpackage.apti.a(r9)
            goto L_0x0141
        L_0x0013:
            r9 = 0
            java.net.URL r1 = new java.net.URL     // Catch:{ IOException -> 0x011a, NullPointerException -> 0x00f2 }
            java.lang.String r2 = r8.c     // Catch:{ IOException -> 0x011a, NullPointerException -> 0x00f2 }
            r1.<init>(r2)     // Catch:{ IOException -> 0x011a, NullPointerException -> 0x00f2 }
            java.lang.ref.WeakReference r2 = r8.d     // Catch:{ IOException -> 0x011a, NullPointerException -> 0x00f2 }
            java.lang.Object r2 = r2.get()     // Catch:{ IOException -> 0x011a, NullPointerException -> 0x00f2 }
            aptl r2 = (defpackage.aptl) r2     // Catch:{ IOException -> 0x011a, NullPointerException -> 0x00f2 }
            java.net.HttpURLConnection r1 = r2.a(r1)     // Catch:{ IOException -> 0x011a, NullPointerException -> 0x00f2 }
            java.lang.String r2 = "Content-Type"
            java.lang.String r3 = "application/x-protobuf"
            r1.addRequestProperty(r2, r3)     // Catch:{ IOException -> 0x011a, NullPointerException -> 0x00f2 }
            int r2 = r1.getResponseCode()     // Catch:{ IOException -> 0x011a, NullPointerException -> 0x00f2 }
            r3 = 200(0xc8, float:2.8E-43)
            if (r2 == r3) goto L_0x00bb
            int r3 = r1.getResponseCode()     // Catch:{ IOException -> 0x0070, NullPointerException -> 0x00f2 }
            r4 = 400(0x190, float:5.6E-43)
            if (r3 < r4) goto L_0x006e
            java.io.InputStream r1 = r1.getErrorStream()     // Catch:{ IOException -> 0x0070, NullPointerException -> 0x00f2 }
            if (r1 == 0) goto L_0x006b
            java.lang.String r3 = new java.lang.String     // Catch:{ IOException -> 0x0070, NullPointerException -> 0x00f2 }
            java.io.ByteArrayOutputStream r4 = new java.io.ByteArrayOutputStream     // Catch:{ IOException -> 0x0070, NullPointerException -> 0x00f2 }
            r4.<init>()     // Catch:{ IOException -> 0x0070, NullPointerException -> 0x00f2 }
            r5 = 128(0x80, float:1.794E-43)
            byte[] r5 = new byte[r5]     // Catch:{ all -> 0x0066 }
        L_0x004f:
            int r6 = r1.read(r5)     // Catch:{ all -> 0x0066 }
            r7 = -1
            if (r6 != r7) goto L_0x0061
            byte[] r1 = r4.toByteArray()     // Catch:{ all -> 0x0066 }
            r4.close()     // Catch:{ IOException -> 0x0070, NullPointerException -> 0x00f2 }
            r3.<init>(r1)     // Catch:{ IOException -> 0x0070, NullPointerException -> 0x00f2 }
            goto L_0x0098
        L_0x0061:
            r4.write(r5, r9, r6)     // Catch:{ all -> 0x0066 }
            goto L_0x004f
        L_0x0066:
            r1 = move-exception
            r4.close()     // Catch:{ IOException -> 0x0070, NullPointerException -> 0x00f2 }
            throw r1     // Catch:{ IOException -> 0x0070, NullPointerException -> 0x00f2 }
        L_0x006b:
            java.lang.String r3 = "WEB_INTERNAL_ERROR:Could not retrieve the authDomain for this project but did not receive an error response from the network request. Please try again."
            goto L_0x0098
        L_0x006e:
            r3 = r0
            goto L_0x0098
        L_0x0070:
            r1 = move-exception
            iwd r3 = a     // Catch:{ IOException -> 0x011a, NullPointerException -> 0x00f2 }
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ IOException -> 0x011a, NullPointerException -> 0x00f2 }
            java.lang.String r4 = java.lang.String.valueOf(r1)     // Catch:{ IOException -> 0x011a, NullPointerException -> 0x00f2 }
            int r4 = r4.length()     // Catch:{ IOException -> 0x011a, NullPointerException -> 0x00f2 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x011a, NullPointerException -> 0x00f2 }
            int r4 = r4 + 75
            r5.<init>(r4)     // Catch:{ IOException -> 0x011a, NullPointerException -> 0x00f2 }
            java.lang.String r4 = "Error parsing error message from response body in getErrorMessageFromBody. "
            r5.append(r4)     // Catch:{ IOException -> 0x011a, NullPointerException -> 0x00f2 }
            r5.append(r1)     // Catch:{ IOException -> 0x011a, NullPointerException -> 0x00f2 }
            java.lang.String r1 = r5.toString()     // Catch:{ IOException -> 0x011a, NullPointerException -> 0x00f2 }
            java.lang.Object[] r4 = new java.lang.Object[r9]     // Catch:{ IOException -> 0x011a, NullPointerException -> 0x00f2 }
            r3.d(r1, r4)     // Catch:{ IOException -> 0x011a, NullPointerException -> 0x00f2 }
            r3 = r0
        L_0x0098:
            iwd r1 = a     // Catch:{ IOException -> 0x011a, NullPointerException -> 0x00f2 }
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ IOException -> 0x011a, NullPointerException -> 0x00f2 }
            r4[r9] = r3     // Catch:{ IOException -> 0x011a, NullPointerException -> 0x00f2 }
            r5 = 1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ IOException -> 0x011a, NullPointerException -> 0x00f2 }
            r4[r5] = r2     // Catch:{ IOException -> 0x011a, NullPointerException -> 0x00f2 }
            java.lang.String r2 = "Error getting project config. Failed with %s %s"
            java.lang.String r2 = java.lang.String.format(r2, r4)     // Catch:{ IOException -> 0x011a, NullPointerException -> 0x00f2 }
            java.lang.Object[] r4 = new java.lang.Object[r9]     // Catch:{ IOException -> 0x011a, NullPointerException -> 0x00f2 }
            r1.e(r2, r4)     // Catch:{ IOException -> 0x011a, NullPointerException -> 0x00f2 }
            apti r1 = new apti     // Catch:{ IOException -> 0x011a, NullPointerException -> 0x00f2 }
            r1.<init>()     // Catch:{ IOException -> 0x011a, NullPointerException -> 0x00f2 }
            r1.b = r3     // Catch:{ IOException -> 0x011a, NullPointerException -> 0x00f2 }
            r0 = r1
            goto L_0x0141
        L_0x00bb:
            java.io.InputStream r1 = r1.getInputStream()     // Catch:{ IOException -> 0x011a, NullPointerException -> 0x00f2 }
            aubs r2 = defpackage.aubs.c()     // Catch:{ IOException -> 0x011a, NullPointerException -> 0x00f2 }
            almj r3 = defpackage.almj.b     // Catch:{ IOException -> 0x011a, NullPointerException -> 0x00f2 }
            aucj r1 = defpackage.aucj.a((defpackage.aucj) r3, (java.io.InputStream) r1, (defpackage.aubs) r2)     // Catch:{ IOException -> 0x011a, NullPointerException -> 0x00f2 }
            almj r1 = (defpackage.almj) r1     // Catch:{ IOException -> 0x011a, NullPointerException -> 0x00f2 }
            aucx r1 = r1.a     // Catch:{ IOException -> 0x011a, NullPointerException -> 0x00f2 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ IOException -> 0x011a, NullPointerException -> 0x00f2 }
        L_0x00d1:
            boolean r2 = r1.hasNext()     // Catch:{ IOException -> 0x011a, NullPointerException -> 0x00f2 }
            if (r2 == 0) goto L_0x00f1
            java.lang.Object r2 = r1.next()     // Catch:{ IOException -> 0x011a, NullPointerException -> 0x00f2 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ IOException -> 0x011a, NullPointerException -> 0x00f2 }
            java.lang.String r3 = "firebaseapp.com"
            boolean r3 = r2.endsWith(r3)     // Catch:{ IOException -> 0x011a, NullPointerException -> 0x00f2 }
            if (r3 != 0) goto L_0x00ed
            java.lang.String r3 = "web.app"
            boolean r3 = r2.endsWith(r3)     // Catch:{ IOException -> 0x011a, NullPointerException -> 0x00f2 }
            if (r3 == 0) goto L_0x00d1
        L_0x00ed:
            apti r0 = defpackage.apti.a(r2)     // Catch:{ IOException -> 0x011a, NullPointerException -> 0x00f2 }
        L_0x00f1:
            goto L_0x0141
        L_0x00f2:
            r1 = move-exception
            iwd r2 = a
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r3 = java.lang.String.valueOf(r1)
            int r3 = r3.length()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            int r3 = r3 + 26
            r4.<init>(r3)
            java.lang.String r3 = "Null pointer encountered: "
            r4.append(r3)
            r4.append(r1)
            java.lang.String r1 = r4.toString()
            java.lang.Object[] r9 = new java.lang.Object[r9]
            r2.e(r1, r9)
            goto L_0x0141
        L_0x011a:
            r1 = move-exception
            iwd r2 = a
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r3 = java.lang.String.valueOf(r1)
            int r3 = r3.length()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            int r3 = r3 + 21
            r4.<init>(r3)
            java.lang.String r3 = "IOException ocurred: "
            r4.append(r3)
            r4.append(r1)
            java.lang.String r1 = r4.toString()
            java.lang.Object[] r9 = new java.lang.Object[r9]
            r2.e(r1, r9)
        L_0x0141:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aptj.doInBackground(java.lang.Object[]):java.lang.Object");
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void onCancelled(Object obj) {
        apti apti = (apti) obj;
        onPostExecute((apti) null);
    }
}
