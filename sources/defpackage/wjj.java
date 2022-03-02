package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.io.File;

/* renamed from: wjj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class wjj {
    private static final jjg a = jjg.a(iyc.GUNS);
    private static wjj b;
    private final Context c;
    private final izb d;
    private final BitmapFactory.Options e;
    private final File f = new File(this.c.getCacheDir(), "notifications");

    private wjj(Context context, izb izb) {
        this.c = context;
        this.d = izb;
        BitmapFactory.Options options = new BitmapFactory.Options();
        this.e = options;
        options.inPreferredConfig = Bitmap.Config.RGB_565;
    }

    private final Bitmap a(byte[] bArr) {
        if (bArr != null) {
            try {
                Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, this.e);
                if (decodeByteArray != null) {
                    try {
                        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(decodeByteArray, (int) this.c.getResources().getDimension(17104901), (int) this.c.getResources().getDimension(17104902), true);
                        if (!createScaledBitmap.sameAs(decodeByteArray)) {
                            decodeByteArray.recycle();
                        }
                        return createScaledBitmap;
                    } catch (IllegalArgumentException e2) {
                        anih anih = (anih) a.b();
                        anih.a((Throwable) e2);
                        anih.a("Failed to scale the image.");
                        return decodeByteArray;
                    }
                }
            } catch (OutOfMemoryError e3) {
                anih anih2 = (anih) a.b();
                anih2.a((Throwable) e3);
                anih2.a("Failed to create bitmap from network bytes.");
                return null;
            }
        }
        return null;
    }

    private final boolean b(String str) {
        return new File(c(str)).exists();
    }

    private final String c(String str) {
        String path = this.f.getPath();
        char c2 = File.separatorChar;
        int hashCode = str.hashCode();
        StringBuilder sb = new StringBuilder(17);
        sb.append("Image_");
        sb.append(hashCode);
        String sb2 = sb.toString();
        StringBuilder sb3 = new StringBuilder(String.valueOf(path).length() + 1 + String.valueOf(sb2).length());
        sb3.append(path);
        sb3.append(c2);
        sb3.append(sb2);
        return sb3.toString();
    }

    private final Bitmap d(String str) {
        try {
            if (b(str)) {
                return BitmapFactory.decodeFile(c(str), this.e);
            }
            ((anih) a.b()).a("Expected image to be present in cache, but not found: %s", (Object) str);
            return null;
        } catch (IllegalArgumentException | OutOfMemoryError e2) {
            anih anih = (anih) a.b();
            anih.a(e2);
            anih.a("Failed to load image from file.");
            return null;
        }
    }

    public static synchronized wjj a(Context context) {
        wjj wjj;
        synchronized (wjj.class) {
            if (b == null) {
                izb izb = new izb(context, (String) null, (String) null, true, false, (String) null, (String) null);
                izb.g = 6403;
                b = new wjj(context, izb);
            }
            wjj = b;
        }
        return wjj;
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x00a8 A[SYNTHETIC, Splitter:B:38:0x00a8] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00b3 A[SYNTHETIC, Splitter:B:46:0x00b3] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized android.graphics.Bitmap a(java.lang.String r7) {
        /*
            r6 = this;
            monitor-enter(r6)
            boolean r0 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x00c3 }
            r1 = 0
            if (r0 != 0) goto L_0x00c1
            boolean r0 = r6.b(r7)     // Catch:{ all -> 0x00c3 }
            if (r0 != 0) goto L_0x00bb
            android.content.Context r0 = r6.c     // Catch:{ all -> 0x00c3 }
            java.lang.String r2 = "connectivity"
            java.lang.Object r0 = r0.getSystemService(r2)     // Catch:{ all -> 0x00c3 }
            android.net.ConnectivityManager r0 = (android.net.ConnectivityManager) r0     // Catch:{ all -> 0x00c3 }
            android.net.NetworkInfo r0 = r0.getActiveNetworkInfo()     // Catch:{ all -> 0x00c3 }
            if (r0 == 0) goto L_0x0044
            boolean r0 = r0.isConnected()     // Catch:{ all -> 0x00c3 }
            if (r0 == 0) goto L_0x0044
            izb r0 = r6.d     // Catch:{ VolleyError -> 0x0031 }
            android.content.Context r2 = r6.c     // Catch:{ VolleyError -> 0x0031 }
            byte[] r0 = r0.a((android.content.Context) r2, (java.lang.String) r7)     // Catch:{ VolleyError -> 0x0031 }
            android.graphics.Bitmap r0 = r6.a((byte[]) r0)     // Catch:{ VolleyError -> 0x0031 }
            goto L_0x0045
        L_0x0031:
            r0 = move-exception
            jjg r2 = a     // Catch:{ all -> 0x00c3 }
            anie r2 = r2.b()     // Catch:{ all -> 0x00c3 }
            anih r2 = (defpackage.anih) r2     // Catch:{ all -> 0x00c3 }
            r2.a((java.lang.Throwable) r0)     // Catch:{ all -> 0x00c3 }
            java.lang.String r0 = "Failed to fetch the image."
            r2.a((java.lang.String) r0)     // Catch:{ all -> 0x00c3 }
            r0 = r1
            goto L_0x0045
        L_0x0044:
            r0 = r1
        L_0x0045:
            if (r0 == 0) goto L_0x00b9
            java.io.File r2 = r6.f     // Catch:{ all -> 0x00c3 }
            boolean r2 = r2.exists()     // Catch:{ all -> 0x00c3 }
            if (r2 != 0) goto L_0x0069
            java.io.File r2 = r6.f     // Catch:{ Exception -> 0x0055 }
            r2.mkdirs()     // Catch:{ Exception -> 0x0055 }
            goto L_0x0069
        L_0x0055:
            r7 = move-exception
            jjg r1 = a     // Catch:{ all -> 0x00c3 }
            anie r1 = r1.b()     // Catch:{ all -> 0x00c3 }
            anih r1 = (defpackage.anih) r1     // Catch:{ all -> 0x00c3 }
            r1.a((java.lang.Throwable) r7)     // Catch:{ all -> 0x00c3 }
            java.lang.String r7 = "Cannot create image cache directory: %s"
            java.io.File r2 = r6.f     // Catch:{ all -> 0x00c3 }
            r1.a((java.lang.String) r7, (java.lang.Object) r2)     // Catch:{ all -> 0x00c3 }
            goto L_0x00ad
        L_0x0069:
            java.io.ByteArrayOutputStream r2 = new java.io.ByteArrayOutputStream     // Catch:{ IOException -> 0x0092, all -> 0x008f }
            r2.<init>()     // Catch:{ IOException -> 0x0092, all -> 0x008f }
            android.graphics.Bitmap$CompressFormat r3 = android.graphics.Bitmap.CompressFormat.PNG     // Catch:{ IOException -> 0x0092, all -> 0x008f }
            r4 = 100
            r0.compress(r3, r4, r2)     // Catch:{ IOException -> 0x0092, all -> 0x008f }
            java.io.File r3 = new java.io.File     // Catch:{ IOException -> 0x0092, all -> 0x008f }
            java.lang.String r7 = r6.c(r7)     // Catch:{ IOException -> 0x0092, all -> 0x008f }
            r3.<init>(r7)     // Catch:{ IOException -> 0x0092, all -> 0x008f }
            r3.createNewFile()     // Catch:{ IOException -> 0x0092, all -> 0x008f }
            java.io.FileOutputStream r7 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x0092, all -> 0x008f }
            r7.<init>(r3)     // Catch:{ IOException -> 0x0092, all -> 0x008f }
            r2.writeTo(r7)     // Catch:{ IOException -> 0x008d }
            r7.close()     // Catch:{ IOException -> 0x00ac }
            goto L_0x00ad
        L_0x008d:
            r1 = move-exception
            goto L_0x0096
        L_0x008f:
            r7 = move-exception
            r0 = r7
            goto L_0x00b1
        L_0x0092:
            r7 = move-exception
            r5 = r1
            r1 = r7
            r7 = r5
        L_0x0096:
            jjg r2 = a     // Catch:{ all -> 0x00af }
            anie r2 = r2.c()     // Catch:{ all -> 0x00af }
            anih r2 = (defpackage.anih) r2     // Catch:{ all -> 0x00af }
            r2.a((java.lang.Throwable) r1)     // Catch:{ all -> 0x00af }
            java.lang.String r1 = "Failed to create file."
            r2.a((java.lang.String) r1)     // Catch:{ all -> 0x00af }
            if (r7 == 0) goto L_0x00ad
            r7.close()     // Catch:{ IOException -> 0x00ac }
            goto L_0x00ad
        L_0x00ac:
            r7 = move-exception
        L_0x00ad:
            monitor-exit(r6)
            return r0
        L_0x00af:
            r0 = move-exception
            r1 = r7
        L_0x00b1:
            if (r1 == 0) goto L_0x00b8
            r1.close()     // Catch:{ IOException -> 0x00b7 }
            goto L_0x00b8
        L_0x00b7:
            r7 = move-exception
        L_0x00b8:
            throw r0     // Catch:{ all -> 0x00c3 }
        L_0x00b9:
            monitor-exit(r6)
            return r1
        L_0x00bb:
            android.graphics.Bitmap r7 = r6.d(r7)     // Catch:{ all -> 0x00c3 }
            monitor-exit(r6)
            return r7
        L_0x00c1:
            monitor-exit(r6)
            return r1
        L_0x00c3:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wjj.a(java.lang.String):android.graphics.Bitmap");
    }
}
