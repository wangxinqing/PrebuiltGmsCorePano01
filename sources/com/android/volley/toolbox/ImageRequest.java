package com.android.volley.toolbox;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.android.volley.DefaultRetryPolicy;
import com.android.volley.Request;
import com.android.volley.Response;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ImageRequest extends Request {
    public static final float DEFAULT_IMAGE_BACKOFF_MULT = 2.0f;
    public static final int DEFAULT_IMAGE_MAX_RETRIES = 2;
    public static final int DEFAULT_IMAGE_TIMEOUT_MS = 1000;
    private static final Object j = new Object();
    public final Object d;
    private Response.Listener e;
    private final Bitmap.Config f;
    private final int g;
    private final int h;
    private final ImageView.ScaleType i;

    @Deprecated
    public ImageRequest(String str, Response.Listener listener, int i2, int i3, Bitmap.Config config, Response.ErrorListener errorListener) {
        this(str, listener, i2, i3, ImageView.ScaleType.CENTER_INSIDE, config, errorListener);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0046, code lost:
        if ((r6 * r0) < r4) goto L_0x0037;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int a(int r3, int r4, int r5, int r6, android.widget.ImageView.ScaleType r7) {
        /*
            if (r3 == 0) goto L_0x0003
            goto L_0x0006
        L_0x0003:
            if (r4 != 0) goto L_0x0006
            return r5
        L_0x0006:
            android.widget.ImageView$ScaleType r0 = android.widget.ImageView.ScaleType.FIT_XY
            if (r7 == r0) goto L_0x004a
            if (r3 != 0) goto L_0x001d
            double r0 = (double) r5
            double r3 = (double) r4
            double r5 = (double) r6
            java.lang.Double.isNaN(r3)
            java.lang.Double.isNaN(r5)
            double r3 = r3 / r5
            java.lang.Double.isNaN(r0)
            double r0 = r0 * r3
            int r3 = (int) r0
            return r3
        L_0x001d:
            if (r4 == 0) goto L_0x0049
            double r0 = (double) r6
            double r5 = (double) r5
            java.lang.Double.isNaN(r0)
            java.lang.Double.isNaN(r5)
            double r0 = r0 / r5
            android.widget.ImageView$ScaleType r5 = android.widget.ImageView.ScaleType.CENTER_CROP
            if (r7 == r5) goto L_0x003d
            double r4 = (double) r4
            double r6 = (double) r3
            java.lang.Double.isNaN(r6)
            double r6 = r6 * r0
            int r2 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r2 <= 0) goto L_0x003c
        L_0x0037:
            java.lang.Double.isNaN(r4)
            double r4 = r4 / r0
            int r3 = (int) r4
        L_0x003c:
            return r3
        L_0x003d:
            double r4 = (double) r4
            double r6 = (double) r3
            java.lang.Double.isNaN(r6)
            double r6 = r6 * r0
            int r2 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r2 >= 0) goto L_0x0049
            goto L_0x0037
        L_0x0049:
            return r3
        L_0x004a:
            if (r3 == 0) goto L_0x004d
            return r3
        L_0x004d:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.volley.toolbox.ImageRequest.a(int, int, int, int, android.widget.ImageView$ScaleType):int");
    }

    public void cancel() {
        super.cancel();
        synchronized (this.d) {
            this.e = null;
        }
    }

    /* access modifiers changed from: protected */
    public void deliverResponse(Bitmap bitmap) {
        Response.Listener listener;
        synchronized (this.d) {
            listener = this.e;
        }
        if (listener != null) {
            listener.onResponse(bitmap);
        }
    }

    public Request.Priority getPriority() {
        return Request.Priority.LOW;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0073, code lost:
        if (r3.getHeight() > r8) goto L_0x0075;
     */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0080 A[Catch:{ OutOfMemoryError -> 0x0098, all -> 0x0096 }] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x008a A[Catch:{ OutOfMemoryError -> 0x0098, all -> 0x0096 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.android.volley.Response parseNetworkResponse(com.android.volley.NetworkResponse r15) {
        /*
            r14 = this;
            java.lang.Object r0 = j
            monitor-enter(r0)
            r1 = 1
            r2 = 0
            byte[] r3 = r15.data     // Catch:{ OutOfMemoryError -> 0x0098 }
            android.graphics.BitmapFactory$Options r4 = new android.graphics.BitmapFactory$Options     // Catch:{ OutOfMemoryError -> 0x0098 }
            r4.<init>()     // Catch:{ OutOfMemoryError -> 0x0098 }
            int r5 = r14.g     // Catch:{ OutOfMemoryError -> 0x0098 }
            if (r5 == 0) goto L_0x0011
            goto L_0x001f
        L_0x0011:
            int r5 = r14.h     // Catch:{ OutOfMemoryError -> 0x0098 }
            if (r5 != 0) goto L_0x001f
            android.graphics.Bitmap$Config r5 = r14.f     // Catch:{ OutOfMemoryError -> 0x0098 }
            r4.inPreferredConfig = r5     // Catch:{ OutOfMemoryError -> 0x0098 }
            int r5 = r3.length     // Catch:{ OutOfMemoryError -> 0x0098 }
            android.graphics.Bitmap r3 = android.graphics.BitmapFactory.decodeByteArray(r3, r2, r5, r4)     // Catch:{ OutOfMemoryError -> 0x0098 }
            goto L_0x007e
        L_0x001f:
            r4.inJustDecodeBounds = r1     // Catch:{ OutOfMemoryError -> 0x0098 }
            int r5 = r3.length     // Catch:{ OutOfMemoryError -> 0x0098 }
            android.graphics.BitmapFactory.decodeByteArray(r3, r2, r5, r4)     // Catch:{ OutOfMemoryError -> 0x0098 }
            int r5 = r4.outWidth     // Catch:{ OutOfMemoryError -> 0x0098 }
            int r6 = r4.outHeight     // Catch:{ OutOfMemoryError -> 0x0098 }
            int r7 = r14.g     // Catch:{ OutOfMemoryError -> 0x0098 }
            int r8 = r14.h     // Catch:{ OutOfMemoryError -> 0x0098 }
            android.widget.ImageView$ScaleType r9 = r14.i     // Catch:{ OutOfMemoryError -> 0x0098 }
            int r7 = a(r7, r8, r5, r6, r9)     // Catch:{ OutOfMemoryError -> 0x0098 }
            int r8 = r14.h     // Catch:{ OutOfMemoryError -> 0x0098 }
            int r9 = r14.g     // Catch:{ OutOfMemoryError -> 0x0098 }
            android.widget.ImageView$ScaleType r10 = r14.i     // Catch:{ OutOfMemoryError -> 0x0098 }
            int r8 = a(r8, r9, r6, r5, r10)     // Catch:{ OutOfMemoryError -> 0x0098 }
            r4.inJustDecodeBounds = r2     // Catch:{ OutOfMemoryError -> 0x0098 }
            double r9 = (double) r5
            double r11 = (double) r7
            java.lang.Double.isNaN(r9)
            java.lang.Double.isNaN(r11)
            double r9 = r9 / r11
            double r5 = (double) r6
            double r11 = (double) r8
            java.lang.Double.isNaN(r5)
            java.lang.Double.isNaN(r11)
            double r5 = r5 / r11
            double r5 = java.lang.Math.min(r9, r5)     // Catch:{ OutOfMemoryError -> 0x0098 }
            r9 = 1065353216(0x3f800000, float:1.0)
        L_0x0057:
            float r10 = r9 + r9
            double r11 = (double) r10     // Catch:{ OutOfMemoryError -> 0x0098 }
            int r13 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            if (r13 <= 0) goto L_0x0094
            int r5 = (int) r9     // Catch:{ OutOfMemoryError -> 0x0098 }
            r4.inSampleSize = r5     // Catch:{ OutOfMemoryError -> 0x0098 }
            int r5 = r3.length     // Catch:{ OutOfMemoryError -> 0x0098 }
            android.graphics.Bitmap r3 = android.graphics.BitmapFactory.decodeByteArray(r3, r2, r5, r4)     // Catch:{ OutOfMemoryError -> 0x0098 }
            if (r3 == 0) goto L_0x007e
            int r4 = r3.getWidth()     // Catch:{ OutOfMemoryError -> 0x0098 }
            if (r4 <= r7) goto L_0x006f
            goto L_0x0075
        L_0x006f:
            int r4 = r3.getHeight()     // Catch:{ OutOfMemoryError -> 0x0098 }
            if (r4 <= r8) goto L_0x007e
        L_0x0075:
            android.graphics.Bitmap r4 = android.graphics.Bitmap.createScaledBitmap(r3, r7, r8, r1)     // Catch:{ OutOfMemoryError -> 0x0098 }
            r3.recycle()     // Catch:{ OutOfMemoryError -> 0x0098 }
            r3 = r4
        L_0x007e:
            if (r3 != 0) goto L_0x008a
            com.android.volley.ParseError r3 = new com.android.volley.ParseError     // Catch:{ OutOfMemoryError -> 0x0098 }
            r3.<init>((com.android.volley.NetworkResponse) r15)     // Catch:{ OutOfMemoryError -> 0x0098 }
            com.android.volley.Response r15 = com.android.volley.Response.error(r3)     // Catch:{ OutOfMemoryError -> 0x0098 }
            goto L_0x0092
        L_0x008a:
            com.android.volley.Cache$Entry r4 = com.android.volley.toolbox.HttpHeaderParser.parseCacheHeaders(r15)     // Catch:{ OutOfMemoryError -> 0x0098 }
            com.android.volley.Response r15 = com.android.volley.Response.success(r3, r4)     // Catch:{ OutOfMemoryError -> 0x0098 }
        L_0x0092:
            monitor-exit(r0)     // Catch:{ all -> 0x0096 }
            return r15
        L_0x0094:
            r9 = r10
            goto L_0x0057
        L_0x0096:
            r15 = move-exception
            goto L_0x00bb
        L_0x0098:
            r3 = move-exception
            java.lang.String r4 = "Caught OOM for %d byte image, url=%s"
            r5 = 2
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch:{ all -> 0x0096 }
            byte[] r15 = r15.data     // Catch:{ all -> 0x0096 }
            int r15 = r15.length     // Catch:{ all -> 0x0096 }
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)     // Catch:{ all -> 0x0096 }
            r5[r2] = r15     // Catch:{ all -> 0x0096 }
            java.lang.String r15 = r14.getUrl()     // Catch:{ all -> 0x0096 }
            r5[r1] = r15     // Catch:{ all -> 0x0096 }
            com.android.volley.VolleyLog.e(r4, r5)     // Catch:{ all -> 0x0096 }
            com.android.volley.ParseError r15 = new com.android.volley.ParseError     // Catch:{ all -> 0x0096 }
            r15.<init>((java.lang.Throwable) r3)     // Catch:{ all -> 0x0096 }
            com.android.volley.Response r15 = com.android.volley.Response.error(r15)     // Catch:{ all -> 0x0096 }
            monitor-exit(r0)     // Catch:{ all -> 0x0096 }
            return r15
        L_0x00bb:
            monitor-exit(r0)     // Catch:{ all -> 0x0096 }
            goto L_0x00be
        L_0x00bd:
            throw r15
        L_0x00be:
            goto L_0x00bd
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.volley.toolbox.ImageRequest.parseNetworkResponse(com.android.volley.NetworkResponse):com.android.volley.Response");
    }

    public ImageRequest(String str, Response.Listener listener, int i2, int i3, ImageView.ScaleType scaleType, Bitmap.Config config, Response.ErrorListener errorListener) {
        super(0, str, errorListener);
        this.d = new Object();
        setRetryPolicy(new DefaultRetryPolicy(DEFAULT_IMAGE_TIMEOUT_MS, 2, 2.0f));
        this.e = listener;
        this.f = config;
        this.g = i2;
        this.h = i3;
        this.i = scaleType;
    }
}
