package defpackage;

import android.util.Log;
import com.android.volley.NetworkResponse;
import com.android.volley.VolleyError;
import com.google.android.chimera.FragmentTransaction;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Map;
import java.util.zip.GZIPInputStream;

/* renamed from: jad  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class jad {
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0079 A[SYNTHETIC, Splitter:B:30:0x0079] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0086 A[SYNTHETIC, Splitter:B:38:0x0086] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0093 A[SYNTHETIC, Splitter:B:45:0x0093] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.jac a(com.android.volley.VolleyError r6, java.lang.String r7) {
        /*
            java.lang.String r0 = "Failed to close input stream"
            java.lang.String r1 = "ErrorUtils"
            defpackage.irk.b(r6)
            com.android.volley.NetworkResponse r2 = r6.networkResponse
            r3 = 0
            if (r2 == 0) goto L_0x009c
            byte[] r2 = r2.data
            if (r2 == 0) goto L_0x009c
            boolean r4 = defpackage.jjt.a((byte[]) r2)     // Catch:{ IOException -> 0x007d, jaq -> 0x005b, all -> 0x0059 }
            if (r4 == 0) goto L_0x0021
            java.util.zip.GZIPInputStream r4 = new java.util.zip.GZIPInputStream     // Catch:{ IOException -> 0x007d, jaq -> 0x005b, all -> 0x0059 }
            java.io.ByteArrayInputStream r5 = new java.io.ByteArrayInputStream     // Catch:{ IOException -> 0x007d, jaq -> 0x005b, all -> 0x0059 }
            r5.<init>(r2)     // Catch:{ IOException -> 0x007d, jaq -> 0x005b, all -> 0x0059 }
            r4.<init>(r5)     // Catch:{ IOException -> 0x007d, jaq -> 0x005b, all -> 0x0059 }
            goto L_0x0026
        L_0x0021:
            java.io.ByteArrayInputStream r4 = new java.io.ByteArrayInputStream     // Catch:{ IOException -> 0x007d, jaq -> 0x005b, all -> 0x0059 }
            r4.<init>(r2)     // Catch:{ IOException -> 0x007d, jaq -> 0x005b, all -> 0x0059 }
        L_0x0026:
            jae r2 = new jae     // Catch:{ IOException -> 0x0057, jaq -> 0x0055, all -> 0x0052 }
            r2.<init>()     // Catch:{ IOException -> 0x0057, jaq -> 0x0055, all -> 0x0052 }
            jas r5 = new jas     // Catch:{ IOException -> 0x0057, jaq -> 0x0055, all -> 0x0052 }
            r5.<init>()     // Catch:{ IOException -> 0x0057, jaq -> 0x0055, all -> 0x0052 }
            r5.a((java.io.InputStream) r4, (defpackage.jag) r2)     // Catch:{ IOException -> 0x0057, jaq -> 0x0055, all -> 0x0052 }
            java.util.HashMap r2 = r2.a     // Catch:{ IOException -> 0x0057, jaq -> 0x0055, all -> 0x0052 }
            java.lang.String r5 = "error"
            java.lang.Object r2 = r2.get(r5)     // Catch:{ IOException -> 0x0057, jaq -> 0x0055, all -> 0x0052 }
            jac r2 = (defpackage.jac) r2     // Catch:{ IOException -> 0x0057, jaq -> 0x0055, all -> 0x0052 }
            if (r7 != 0) goto L_0x0040
            goto L_0x0049
        L_0x0040:
            if (r2 == 0) goto L_0x0049
            java.lang.String r5 = r2.toString()     // Catch:{ IOException -> 0x0057, jaq -> 0x0055, all -> 0x0052 }
            android.util.Log.w(r7, r5)     // Catch:{ IOException -> 0x0057, jaq -> 0x0055, all -> 0x0052 }
        L_0x0049:
            r4.close()     // Catch:{ IOException -> 0x004d }
            goto L_0x0051
        L_0x004d:
            r6 = move-exception
            android.util.Log.e(r1, r0, r6)
        L_0x0051:
            return r2
        L_0x0052:
            r6 = move-exception
            r3 = r4
            goto L_0x0091
        L_0x0055:
            r7 = move-exception
            goto L_0x005d
        L_0x0057:
            r6 = move-exception
            goto L_0x007f
        L_0x0059:
            r6 = move-exception
            goto L_0x0091
        L_0x005b:
            r7 = move-exception
            r4 = r3
        L_0x005d:
            com.android.volley.NetworkResponse r6 = r6.networkResponse     // Catch:{ all -> 0x008f }
            int r6 = r6.statusCode     // Catch:{ all -> 0x008f }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x008f }
            r2 = 47
            r7.<init>(r2)     // Catch:{ all -> 0x008f }
            java.lang.String r2 = "Received generic error from server: "
            r7.append(r2)     // Catch:{ all -> 0x008f }
            r7.append(r6)     // Catch:{ all -> 0x008f }
            java.lang.String r6 = r7.toString()     // Catch:{ all -> 0x008f }
            android.util.Log.e(r1, r6)     // Catch:{ all -> 0x008f }
            if (r4 == 0) goto L_0x009c
            r4.close()     // Catch:{ IOException -> 0x008a }
            goto L_0x009c
        L_0x007d:
            r6 = move-exception
            r4 = r3
        L_0x007f:
            java.lang.String r7 = "Unable to read error response"
            android.util.Log.e(r1, r7, r6)     // Catch:{ all -> 0x008f }
            if (r4 == 0) goto L_0x009c
            r4.close()     // Catch:{ IOException -> 0x008a }
            goto L_0x009c
        L_0x008a:
            r6 = move-exception
            android.util.Log.e(r1, r0, r6)
            goto L_0x009c
        L_0x008f:
            r6 = move-exception
            r3 = r4
        L_0x0091:
            if (r3 == 0) goto L_0x009b
            r3.close()     // Catch:{ IOException -> 0x0097 }
            goto L_0x009b
        L_0x0097:
            r7 = move-exception
            android.util.Log.e(r1, r0, r7)
        L_0x009b:
            throw r6
        L_0x009c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jad.a(com.android.volley.VolleyError, java.lang.String):jac");
    }

    public static jab b(VolleyError volleyError, String str) {
        ArrayList errors;
        jac a = a(volleyError, str);
        if (a == null || (errors = a.getErrors()) == null || errors.size() == 0) {
            return null;
        }
        return (jab) errors.get(0);
    }

    public static String a(VolleyError volleyError) {
        Map map;
        String str;
        NetworkResponse networkResponse = volleyError.networkResponse;
        if (networkResponse == null || (map = networkResponse.headers) == null || (str = (String) map.get("Content-Type")) == null) {
            return null;
        }
        byte[] bArr = networkResponse.data;
        if (jjt.a(bArr)) {
            InputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                InputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
                try {
                    byte[] bArr2 = new byte[FragmentTransaction.TRANSIT_ENTER_MASK];
                    while (true) {
                        int read = gZIPInputStream.read(bArr2, 0, FragmentTransaction.TRANSIT_ENTER_MASK);
                        if (read == -1) {
                            break;
                        }
                        byteArrayOutputStream.write(bArr2, 0, read);
                    }
                    byteArrayOutputStream.flush();
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    try {
                        gZIPInputStream.close();
                    } catch (IOException e) {
                        Log.e("ErrorUtils", e.toString());
                    }
                    try {
                        byteArrayOutputStream.close();
                    } catch (IOException e2) {
                        Log.e("ErrorUtils", e2.toString());
                    }
                    bArr = byteArray;
                } catch (IOException e3) {
                    e = e3;
                    byteArrayInputStream = gZIPInputStream;
                } catch (Throwable th) {
                    th = th;
                    byteArrayInputStream = gZIPInputStream;
                    try {
                        byteArrayInputStream.close();
                    } catch (IOException e4) {
                        Log.e("ErrorUtils", e4.toString());
                    }
                    try {
                        byteArrayOutputStream.close();
                    } catch (IOException e5) {
                        Log.e("ErrorUtils", e5.toString());
                    }
                    throw th;
                }
            } catch (IOException e6) {
                e = e6;
                try {
                    Log.e("ErrorUtils", e.toString());
                    try {
                        byteArrayInputStream.close();
                    } catch (IOException e7) {
                        Log.e("ErrorUtils", e7.toString());
                    }
                    try {
                        byteArrayOutputStream.close();
                    } catch (IOException e8) {
                        Log.e("ErrorUtils", e8.toString());
                    }
                    return null;
                } catch (Throwable th2) {
                    th = th2;
                    byteArrayInputStream.close();
                    byteArrayOutputStream.close();
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                byteArrayInputStream.close();
                byteArrayOutputStream.close();
                throw th;
            }
        }
        if (str.startsWith("application/json")) {
            jab b = b(volleyError, (String) null);
            if (b != null) {
                return (String) b.b.get("reason");
            }
            return null;
        } else if (str.startsWith("application/x-protobuf")) {
            try {
                alnp alnp = (alnp) aucj.a((aucj) alnp.b, bArr, aubs.c());
                alnq alnq = alnp.a;
                if (alnq == null) {
                    alnq = alnq.b;
                }
                if (alnq.a.size() <= 0) {
                    return null;
                }
                alnq alnq2 = alnp.a;
                if (alnq2 == null) {
                    alnq2 = alnq.b;
                }
                return ((alnr) alnq2.a.get(0)).a;
            } catch (auda e9) {
                Log.e("ErrorUtils", e9.toString());
                return null;
            }
        } else if (!str.startsWith("text/html")) {
            return null;
        } else {
            String str2 = new String(bArr);
            if ("Invalid Credentials".equalsIgnoreCase(str2)) {
                return "authError";
            }
            if ("Session Expired".equalsIgnoreCase(str2)) {
                return "expired";
            }
            if ("User Rate Limit Exceeded".equalsIgnoreCase(str2)) {
                return "userRateLimitExceeded";
            }
            return null;
        }
    }
}
