package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.R;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* renamed from: jju  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class jju {
    public static final SimpleDateFormat a = new SimpleDateFormat("'IMG'_yyyyMMdd_HHmmss", Locale.US);
    private static Thread b;
    private static final Paint c = new Paint(2);
    private static final Paint d = new Paint(2);

    private static int a(aio aio) {
        if (aio == null) {
            return 0;
        }
        int a2 = aio.a("Orientation", 1);
        if (a2 == 3) {
            return 180;
        }
        if (a2 != 6) {
            return a2 != 8 ? 0 : 270;
        }
        return 90;
    }

    public static boolean b(String str) {
        return str != null && str.startsWith("image/");
    }

    public static boolean c(String str) {
        return str != null && str.startsWith("video/");
    }

    public static int a(Context context) {
        return context.getResources().getDimensionPixelSize(R.dimen.common_mini_kind_max_dimension);
    }

    public static int a(String str) {
        aio aio = null;
        try {
            aio = new aio(str);
        } catch (IOException e) {
            if (Log.isLoggable("ImageUtils", 5)) {
                String valueOf = String.valueOf(str);
                Log.w("ImageUtils", valueOf.length() == 0 ? new String("failed to create ExifInterface for ") : "failed to create ExifInterface for ".concat(valueOf));
            }
        }
        return a(aio);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v6, resolved type: aio} */
    /* JADX WARNING: type inference failed for: r6v4 */
    /* JADX WARNING: type inference failed for: r6v5, types: [java.io.Closeable] */
    /* JADX WARNING: type inference failed for: r6v7 */
    /* JADX WARNING: type inference failed for: r6v8 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0025 A[Catch:{ all -> 0x0015 }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0077  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Bitmap a(android.content.ContentResolver r3, android.net.Uri r4, android.graphics.Bitmap r5, boolean r6) {
        /*
            java.lang.String r0 = "ImageUtils"
            if (r5 == 0) goto L_0x007c
            if (r6 == 0) goto L_0x0053
            r6 = 0
            java.io.InputStream r3 = r3.openInputStream(r4)     // Catch:{ IOException -> 0x001c, all -> 0x001a }
            aio r1 = new aio     // Catch:{ IOException -> 0x0018 }
            r1.<init>((java.io.InputStream) r3)     // Catch:{ IOException -> 0x0018 }
            defpackage.jjt.a((java.io.Closeable) r3)
            r6 = r1
            goto L_0x004a
        L_0x0015:
            r4 = move-exception
            r6 = r3
            goto L_0x004f
        L_0x0018:
            r1 = move-exception
            goto L_0x001e
        L_0x001a:
            r4 = move-exception
            goto L_0x004f
        L_0x001c:
            r3 = move-exception
            r3 = r6
        L_0x001e:
            r1 = 5
            boolean r1 = android.util.Log.isLoggable(r0, r1)     // Catch:{ all -> 0x0015 }
            if (r1 == 0) goto L_0x0047
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x0015 }
            java.lang.String r1 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x0015 }
            int r1 = r1.length()     // Catch:{ all -> 0x0015 }
            int r1 = r1 + 35
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0015 }
            r2.<init>(r1)     // Catch:{ all -> 0x0015 }
            java.lang.String r1 = "failed to create ExifInterface for "
            r2.append(r1)     // Catch:{ all -> 0x0015 }
            r2.append(r4)     // Catch:{ all -> 0x0015 }
            java.lang.String r4 = r2.toString()     // Catch:{ all -> 0x0015 }
            android.util.Log.w(r0, r4)     // Catch:{ all -> 0x0015 }
        L_0x0047:
            defpackage.jjt.a((java.io.Closeable) r3)
        L_0x004a:
            int r3 = a((defpackage.aio) r6)
            goto L_0x0075
        L_0x004f:
            defpackage.jjt.a((java.io.Closeable) r6)
            throw r4
        L_0x0053:
            boolean r6 = defpackage.jka.a(r4)
            if (r6 != 0) goto L_0x0062
            boolean r6 = a((android.net.Uri) r4)
            if (r6 == 0) goto L_0x0060
            goto L_0x0062
        L_0x0060:
            r3 = 0
            goto L_0x0075
        L_0x0062:
            boolean r6 = a((android.net.Uri) r4)
            if (r6 != 0) goto L_0x006d
            java.lang.String r3 = defpackage.jka.a((android.content.ContentResolver) r3, (android.net.Uri) r4)
            goto L_0x0071
        L_0x006d:
            java.lang.String r3 = r4.getPath()
        L_0x0071:
            int r3 = a((java.lang.String) r3)
        L_0x0075:
            if (r3 == 0) goto L_0x007c
            android.graphics.Bitmap r3 = a((android.graphics.Bitmap) r5, (int) r3)
            return r3
        L_0x007c:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jju.a(android.content.ContentResolver, android.net.Uri, android.graphics.Bitmap, boolean):android.graphics.Bitmap");
    }

    public static Bitmap a(Context context, Uri uri, int i, int i2, boolean z) {
        InputStream inputStream;
        BitmapFactory.Options options;
        InputStream inputStream2;
        ContentResolver contentResolver = context.getContentResolver();
        String a2 = a(contentResolver, uri);
        try {
            if (!b(a2)) {
                if (Log.isLoggable("ImageUtils", 5)) {
                    String valueOf = String.valueOf(a2);
                    Log.w("ImageUtils", valueOf.length() == 0 ? new String("loadLocalBytes unknown mimeType=") : "loadLocalBytes unknown mimeType=".concat(valueOf));
                }
                return null;
            }
            int max = Math.max(i, i2);
            if (max > 0) {
                try {
                    BitmapFactory.Options options2 = new BitmapFactory.Options();
                    try {
                        options2.inJustDecodeBounds = true;
                        inputStream2 = contentResolver.openInputStream(uri);
                        a(inputStream2, options2);
                        Point point = new Point(options2.outWidth, options2.outHeight);
                        jjt.a((Closeable) inputStream2);
                        options = new BitmapFactory.Options();
                        options.inSampleSize = Math.max(point.x / max, point.y / max);
                    } catch (Throwable th) {
                        th = th;
                        inputStream2 = null;
                        jjt.a((Closeable) inputStream2);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    inputStream = null;
                    jjt.a((Closeable) inputStream);
                    throw th;
                }
            } else {
                options = null;
            }
            inputStream = contentResolver.openInputStream(uri);
            try {
                Bitmap a3 = a(contentResolver, uri, a(inputStream, options), z);
                jjt.a((Closeable) inputStream);
                return a3;
            } catch (Throwable th3) {
                th = th3;
                jjt.a((Closeable) inputStream);
                throw th;
            }
        } catch (IOException e) {
            return null;
        } catch (OutOfMemoryError e2) {
            Log.e("ImageUtils", "could not load image", e2);
            return null;
        }
    }

    public static Bitmap a(Bitmap bitmap) {
        Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint(1);
        Rect rect = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
        canvas.drawARGB(0, 0, 0, 0);
        paint.setColor(-16777216);
        canvas.drawCircle(((float) bitmap.getWidth()) / 2.0f, ((float) bitmap.getHeight()) / 2.0f, ((float) bitmap.getWidth()) / 2.0f, paint);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(bitmap, rect, rect, paint);
        return createBitmap;
    }

    private static Bitmap a(Bitmap bitmap, int i) {
        if (i == 0) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        matrix.setRotate((float) i, ((float) width) / 2.0f, ((float) height) / 2.0f);
        try {
            Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, true);
            if (bitmap == createBitmap) {
                return bitmap;
            }
            bitmap.recycle();
            return createBitmap;
        } catch (OutOfMemoryError e) {
            if (!Log.isLoggable("ImageUtils", 5)) {
                return bitmap;
            }
            Log.w("ImageUtils", "could not rotate bitmap", e);
            return bitmap;
        }
    }

    public static Bitmap a(Bitmap bitmap, int i, int i2) {
        if (bitmap == null) {
            return null;
        }
        if (bitmap.getWidth() == i && bitmap.getHeight() == i2) {
            return bitmap;
        }
        try {
            Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
            if (createBitmap == null) {
                return null;
            }
            Canvas canvas = new Canvas(createBitmap);
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            if (bitmap.getWidth() * i2 > bitmap.getHeight() * i) {
                width = (bitmap.getHeight() * i) / i2;
            } else {
                height = (bitmap.getWidth() * i2) / i;
            }
            int width2 = (bitmap.getWidth() - width) / 2;
            int height2 = (bitmap.getHeight() - height) / 2;
            Rect rect = new Rect(width2, height2, width + width2, height + height2);
            Rect rect2 = new Rect(0, 0, i, i2);
            if (b == null) {
                b = Looper.getMainLooper().getThread();
            }
            if (Thread.currentThread() != b) {
                synchronized (d) {
                    canvas.drawBitmap(bitmap, rect, rect2, d);
                }
            } else {
                canvas.drawBitmap(bitmap, rect, rect2, c);
            }
            return createBitmap;
        } catch (OutOfMemoryError e) {
            if (Log.isLoggable("ImageUtils", 5)) {
                StringBuilder sb = new StringBuilder(78);
                sb.append("resizeAndCropBitmap OutOfMemoryError for image size: ");
                sb.append(i);
                sb.append(" x ");
                sb.append(i2);
                Log.w("ImageUtils", sb.toString(), e);
            }
            return null;
        }
    }

    public static Bitmap a(InputStream inputStream, BitmapFactory.Options options) {
        try {
            return BitmapFactory.decodeStream(inputStream, (Rect) null, options);
        } catch (OutOfMemoryError e) {
            Log.e("ImageUtils", "decodeStream(InputStream, Rect, Options) threw an OOME", e);
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String a(android.content.ContentResolver r6, android.net.Uri r7) {
        /*
            java.lang.String r0 = "ImageUtils"
            r1 = 5
            r2 = 0
            java.lang.String r6 = r6.getType(r7)     // Catch:{ Exception -> 0x000a }
            r2 = r6
            goto L_0x0035
        L_0x000a:
            r6 = move-exception
            boolean r3 = android.util.Log.isLoggable(r0, r1)     // Catch:{ Exception -> 0x004e }
            if (r3 == 0) goto L_0x0034
            java.lang.String r3 = java.lang.String.valueOf(r7)     // Catch:{ Exception -> 0x004e }
            java.lang.String r4 = java.lang.String.valueOf(r3)     // Catch:{ Exception -> 0x004e }
            int r4 = r4.length()     // Catch:{ Exception -> 0x004e }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x004e }
            int r4 = r4 + 31
            r5.<init>(r4)     // Catch:{ Exception -> 0x004e }
            java.lang.String r4 = "safeGetMimeType failed for uri="
            r5.append(r4)     // Catch:{ Exception -> 0x004e }
            r5.append(r3)     // Catch:{ Exception -> 0x004e }
            java.lang.String r3 = r5.toString()     // Catch:{ Exception -> 0x004e }
            android.util.Log.w(r0, r3, r6)     // Catch:{ Exception -> 0x004e }
            goto L_0x0035
        L_0x0034:
        L_0x0035:
            boolean r6 = android.text.TextUtils.isEmpty(r2)     // Catch:{ Exception -> 0x004c }
            if (r6 == 0) goto L_0x0056
            android.webkit.MimeTypeMap r6 = android.webkit.MimeTypeMap.getSingleton()     // Catch:{ Exception -> 0x004c }
            java.lang.String r3 = r7.toString()     // Catch:{ Exception -> 0x004c }
            java.lang.String r3 = android.webkit.MimeTypeMap.getFileExtensionFromUrl(r3)     // Catch:{ Exception -> 0x004c }
            java.lang.String r2 = r6.getMimeTypeFromExtension(r3)     // Catch:{ Exception -> 0x004c }
            goto L_0x0056
        L_0x004c:
            r6 = move-exception
            goto L_0x004f
        L_0x004e:
            r6 = move-exception
        L_0x004f:
            boolean r1 = android.util.Log.isLoggable(r0, r1)
            if (r1 != 0) goto L_0x0057
        L_0x0056:
            return r2
        L_0x0057:
            java.lang.String r7 = java.lang.String.valueOf(r7)
            java.lang.String r1 = java.lang.String.valueOf(r7)
            int r1 = r1.length()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            int r1 = r1 + 27
            r3.<init>(r1)
            java.lang.String r1 = "getMimeType failed for uri="
            r3.append(r1)
            r3.append(r7)
            java.lang.String r7 = r3.toString()
            android.util.Log.w(r0, r7, r6)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jju.a(android.content.ContentResolver, android.net.Uri):java.lang.String");
    }

    public static boolean a(Uri uri) {
        return uri != null && "file".equals(uri.getScheme());
    }
}
