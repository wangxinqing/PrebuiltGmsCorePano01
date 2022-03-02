package defpackage;

import android.content.Context;

/* renamed from: iqm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class iqm {
    private static final String[] a = {"url", "local"};
    private static iqm c;
    private final izb b;

    private iqm(Context context) {
        this.b = izb.a(context.getApplicationContext());
    }

    public static synchronized iqm a(Context context, int i) {
        iqm iqm;
        synchronized (iqm.class) {
            if (c == null) {
                c = new iqm(context);
            }
            c.b.g = i;
            iqm = c;
        }
        return iqm;
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00d4  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00de A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.content.res.AssetFileDescriptor a(android.content.Context r17, android.net.Uri r18) {
        /*
            r16 = this;
            r1 = r16
            r11 = r18
            java.lang.String r0 = r18.getScheme()
            java.lang.String r2 = "android.resource"
            boolean r0 = r2.equals(r0)
            r12 = 0
            r8 = 1
            java.lang.String r13 = "ImageBroker"
            r14 = 0
            if (r0 != 0) goto L_0x006e
            android.content.ContentResolver r2 = r17.getContentResolver()
            java.lang.String[] r4 = a
            r5 = 0
            r6 = 0
            r7 = 0
            r3 = r18
            android.database.Cursor r2 = r2.query(r3, r4, r5, r6, r7)
            if (r2 == 0) goto L_0x003c
            boolean r0 = r2.moveToFirst()     // Catch:{ all -> 0x003a }
            if (r0 != 0) goto L_0x002d
            goto L_0x003c
        L_0x002d:
            java.lang.String r0 = r2.getString(r12)     // Catch:{ all -> 0x003a }
            int r8 = r2.getInt(r8)     // Catch:{ all -> 0x003a }
            r2.close()
            goto L_0x006f
        L_0x003a:
            r0 = move-exception
            goto L_0x0068
        L_0x003c:
            java.lang.String r0 = java.lang.String.valueOf(r18)     // Catch:{ all -> 0x003a }
            java.lang.String r3 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x003a }
            int r3 = r3.length()     // Catch:{ all -> 0x003a }
            int r3 = r3 + 41
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x003a }
            r4.<init>(r3)     // Catch:{ all -> 0x003a }
            java.lang.String r3 = "No image store record found for image ID "
            r4.append(r3)     // Catch:{ all -> 0x003a }
            r4.append(r0)     // Catch:{ all -> 0x003a }
            java.lang.String r0 = r4.toString()     // Catch:{ all -> 0x003a }
            android.util.Log.w(r13, r0)     // Catch:{ all -> 0x003a }
            if (r2 == 0) goto L_0x0066
            r2.close()
            r0 = r14
            goto L_0x0077
        L_0x0066:
            r0 = r14
            goto L_0x0077
        L_0x0068:
            if (r2 == 0) goto L_0x006d
            r2.close()
        L_0x006d:
            throw r0
        L_0x006e:
            r0 = r14
        L_0x006f:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r8)
            android.util.Pair r0 = android.util.Pair.create(r2, r0)
        L_0x0077:
            if (r0 == 0) goto L_0x0130
            java.lang.Object r2 = r0.first
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            java.lang.Object r0 = r0.second
            r5 = r0
            java.lang.String r5 = (java.lang.String) r5
            if (r2 == 0) goto L_0x00b6
            r0 = 2
            if (r2 == r0) goto L_0x008e
            r2 = r17
            goto L_0x00df
        L_0x008e:
            if (r5 == 0) goto L_0x00b3
            izb r0 = r1.b
            com.android.volley.toolbox.RequestFuture r2 = com.android.volley.toolbox.RequestFuture.newFuture()
            izo r15 = new izo
            r6 = 0
            com.android.volley.Response$Listener r7 = r0.a((java.lang.String) r5, (com.android.volley.Response.Listener) r2)
            com.android.volley.Response$ErrorListener r8 = r0.a((java.lang.String) r5, (com.android.volley.Response.ErrorListener) r2)
            int r9 = r0.g
            int r10 = r0.h
            r2 = r15
            r3 = r17
            r4 = r18
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            r0.a((com.android.volley.Request) r15, (boolean) r12, (java.lang.String) r14)
            r2 = r17
            goto L_0x00df
        L_0x00b3:
            r2 = r17
            goto L_0x00df
        L_0x00b6:
            if (r5 == 0) goto L_0x010e
            izb r0 = r1.b     // Catch:{ VolleyError -> 0x00c3 }
            r2 = r17
            byte[] r0 = r0.a((android.content.Context) r2, (android.net.Uri) r11, (java.lang.String) r5)     // Catch:{ VolleyError -> 0x00c1 }
            goto L_0x00dc
        L_0x00c1:
            r0 = move-exception
            goto L_0x00c6
        L_0x00c3:
            r0 = move-exception
            r2 = r17
        L_0x00c6:
            java.lang.String r0 = "Error retrieving image at URL "
            int r3 = r5.length()
            if (r3 != 0) goto L_0x00d4
            java.lang.String r3 = new java.lang.String
            r3.<init>(r0)
            goto L_0x00d8
        L_0x00d4:
            java.lang.String r3 = r0.concat(r5)
        L_0x00d8:
            android.util.Log.w(r13, r3)
            r0 = r14
        L_0x00dc:
            if (r0 != 0) goto L_0x00df
            return r14
        L_0x00df:
            android.content.ContentResolver r0 = r17.getContentResolver()     // Catch:{ FileNotFoundException -> 0x00ea }
            java.lang.String r2 = "r"
            android.content.res.AssetFileDescriptor r0 = r0.openAssetFileDescriptor(r11, r2)     // Catch:{ FileNotFoundException -> 0x00ea }
            return r0
        L_0x00ea:
            r0 = move-exception
            java.lang.String r0 = java.lang.String.valueOf(r18)
            java.lang.String r2 = java.lang.String.valueOf(r0)
            int r2 = r2.length()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            int r2 = r2 + 48
            r3.<init>(r2)
            java.lang.String r2 = "Fetched image data was not stored for image URI "
            r3.append(r2)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            android.util.Log.e(r13, r0)
            return r14
        L_0x010e:
            java.lang.String r0 = java.lang.String.valueOf(r18)
            java.lang.String r2 = java.lang.String.valueOf(r0)
            int r2 = r2.length()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            int r2 = r2 + 62
            r3.<init>(r2)
            java.lang.String r2 = "No local image data and no external image URL found for image "
            r3.append(r2)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            android.util.Log.e(r13, r0)
        L_0x0130:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iqm.a(android.content.Context, android.net.Uri):android.content.res.AssetFileDescriptor");
    }
}
