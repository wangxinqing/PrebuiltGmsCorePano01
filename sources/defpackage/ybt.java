package defpackage;

import android.content.Context;
import android.text.TextUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: ybt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ybt {
    public static ybt a;
    private static final int[] b = {0, 1, 2, 3, 4};
    private final Context c;
    private final String d;

    public ybt(Context context, String str) {
        this.c = context.getApplicationContext();
        this.d = str;
    }

    private static final String a(String str) {
        String replace = str.replace(":", "");
        iva.c(replace);
        return replace;
    }

    private final File b(String str, String str2, String str3) {
        String b2 = b(str, str2);
        StringBuilder sb = new StringBuilder(String.valueOf(b2).length() + 1 + String.valueOf(str3).length());
        sb.append(b2);
        sb.append("/");
        sb.append(str3);
        return new File(sb.toString());
    }

    public static String a(String str, boolean z, Context context) {
        iqt iqt = new iqt();
        iqt.a(ycc.a(context, 3));
        iqt.a();
        iqt.a = z;
        return iqt.a(str);
    }

    private final String b() {
        String valueOf = String.valueOf(this.c.getFilesDir());
        String str = this.d;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 2 + str.length());
        sb.append(valueOf);
        sb.append("/");
        sb.append(str);
        sb.append("/");
        return sb.toString();
    }

    private final String b(String str, String str2) {
        String str3;
        String b2 = b();
        if (!TextUtils.isEmpty(str2)) {
            String valueOf = String.valueOf(str2);
            str3 = valueOf.length() == 0 ? new String("~") : "~".concat(valueOf);
        } else {
            str3 = "";
        }
        StringBuilder sb = new StringBuilder(String.valueOf(b2).length() + String.valueOf(str).length() + String.valueOf(str3).length());
        sb.append(b2);
        sb.append(str);
        sb.append(str3);
        return sb.toString();
    }

    public static synchronized ybt a(Context context) {
        ybt ybt;
        synchronized (ybt.class) {
            if (a == null) {
                a = new ybt(context, "images/people");
            }
            ybt = a;
        }
        return ybt;
    }

    public final synchronized List a() {
        File file = new File(b());
        if (!file.exists()) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        for (String str : file.list()) {
            int indexOf = str.indexOf("~");
            if (indexOf != -1) {
                arrayList.add(new ybs(str.substring(0, indexOf), str.substring(indexOf + 1)));
            } else {
                arrayList.add(new ybs(str, (String) null));
            }
        }
        return arrayList;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0055 A[DONT_GENERATE] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized defpackage.yci a(java.lang.String r5, java.lang.String r6, java.lang.String r7, int r8) {
        /*
            r4 = this;
            monitor-enter(r4)
            defpackage.iva.c(r5)     // Catch:{ all -> 0x0068 }
            java.lang.String r0 = "avatarSize"
            defpackage.wlv.a(r8, r0)     // Catch:{ all -> 0x0068 }
            defpackage.iva.c(r7)     // Catch:{ all -> 0x0068 }
            java.lang.String r7 = a((java.lang.String) r7)     // Catch:{ all -> 0x0068 }
            java.io.File r0 = new java.io.File     // Catch:{ all -> 0x0068 }
            java.io.File r7 = r4.b(r5, r6, r7)     // Catch:{ all -> 0x0068 }
            java.lang.String r1 = java.lang.String.valueOf(r8)     // Catch:{ all -> 0x0068 }
            r0.<init>(r7, r1)     // Catch:{ all -> 0x0068 }
            boolean r7 = r0.exists()     // Catch:{ all -> 0x0068 }
            r1 = 0
            if (r7 != 0) goto L_0x0057
            java.io.File r7 = new java.io.File     // Catch:{ all -> 0x0068 }
            java.lang.String r5 = r4.b(r5, r6)     // Catch:{ all -> 0x0068 }
            r7.<init>(r5)     // Catch:{ all -> 0x0068 }
            boolean r5 = r7.exists()     // Catch:{ all -> 0x0068 }
            if (r5 == 0) goto L_0x0051
            java.io.File[] r5 = r7.listFiles()     // Catch:{ all -> 0x0068 }
            int r6 = r5.length     // Catch:{ all -> 0x0068 }
            r7 = 0
        L_0x0039:
            if (r7 >= r6) goto L_0x0051
            r0 = r5[r7]     // Catch:{ all -> 0x0068 }
            java.io.File r2 = new java.io.File     // Catch:{ all -> 0x0068 }
            java.lang.String r3 = java.lang.String.valueOf(r8)     // Catch:{ all -> 0x0068 }
            r2.<init>(r0, r3)     // Catch:{ all -> 0x0068 }
            boolean r0 = r2.exists()     // Catch:{ all -> 0x0068 }
            if (r0 != 0) goto L_0x004f
            int r7 = r7 + 1
            goto L_0x0039
        L_0x004f:
            r0 = r2
            goto L_0x0052
        L_0x0051:
            r0 = r1
        L_0x0052:
            if (r0 == 0) goto L_0x0055
            goto L_0x0058
        L_0x0055:
            monitor-exit(r4)
            return r1
        L_0x0057:
        L_0x0058:
            yci r5 = defpackage.yci.a(r0)     // Catch:{ IOException -> 0x005e }
            monitor-exit(r4)
            return r5
        L_0x005e:
            r5 = move-exception
            java.lang.String r6 = "PeopleAvatarFileServer"
            java.lang.String r7 = "Couldn't load avatar"
            android.util.Log.w(r6, r7, r5)     // Catch:{ all -> 0x0068 }
            monitor-exit(r4)
            return r1
        L_0x0068:
            r5 = move-exception
            monitor-exit(r4)
            goto L_0x006c
        L_0x006b:
            throw r5
        L_0x006c:
            goto L_0x006b
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ybt.a(java.lang.String, java.lang.String, java.lang.String, int):yci");
    }

    public final synchronized void a(String str, String str2) {
        iva.c(str);
        jjc.a(new File(b(str, str2)));
    }

    /* JADX WARNING: Removed duplicated region for block: B:54:0x010a A[Catch:{ FileNotFoundException -> 0x0127, IOException -> 0x011e }] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x011a A[SYNTHETIC, Splitter:B:63:0x011a] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void a(java.lang.String r11, java.lang.String r12, java.lang.String r13, byte[] r14) {
        /*
            r10 = this;
            monitor-enter(r10)
            defpackage.iva.c(r11)     // Catch:{ all -> 0x0131 }
            defpackage.iva.c(r13)     // Catch:{ all -> 0x0131 }
            r0 = 1
            r1 = 0
            if (r14 == 0) goto L_0x000d
            r2 = 1
            goto L_0x000e
        L_0x000d:
            r2 = 0
        L_0x000e:
            defpackage.iva.b((boolean) r2)     // Catch:{ all -> 0x0131 }
            java.lang.String r13 = a((java.lang.String) r13)     // Catch:{ all -> 0x0131 }
            r10.a(r11, r12)     // Catch:{ all -> 0x0131 }
            java.io.File r2 = r10.b(r11, r12, r13)     // Catch:{ all -> 0x0131 }
            boolean r3 = r2.mkdirs()     // Catch:{ all -> 0x0131 }
            if (r3 != 0) goto L_0x0042
            java.lang.RuntimeException r11 = new java.lang.RuntimeException     // Catch:{ all -> 0x0131 }
            java.lang.String r12 = r2.getAbsolutePath()     // Catch:{ all -> 0x0131 }
            java.lang.String r12 = java.lang.String.valueOf(r12)     // Catch:{ all -> 0x0131 }
            java.lang.String r13 = "Could not create a directory in dir="
            int r14 = r12.length()     // Catch:{ all -> 0x0131 }
            if (r14 != 0) goto L_0x003a
            java.lang.String r12 = new java.lang.String     // Catch:{ all -> 0x0131 }
            r12.<init>(r13)     // Catch:{ all -> 0x0131 }
            goto L_0x003e
        L_0x003a:
            java.lang.String r12 = r13.concat(r12)     // Catch:{ all -> 0x0131 }
        L_0x003e:
            r11.<init>(r12)     // Catch:{ all -> 0x0131 }
            throw r11     // Catch:{ all -> 0x0131 }
        L_0x0042:
            android.graphics.BitmapFactory$Options r3 = new android.graphics.BitmapFactory$Options     // Catch:{ FileNotFoundException -> 0x0127, IOException -> 0x011e }
            r3.<init>()     // Catch:{ FileNotFoundException -> 0x0127, IOException -> 0x011e }
            int r4 = r14.length     // Catch:{ FileNotFoundException -> 0x0127, IOException -> 0x011e }
            android.graphics.Bitmap r14 = android.graphics.BitmapFactory.decodeByteArray(r14, r1, r4, r3)     // Catch:{ FileNotFoundException -> 0x0127, IOException -> 0x011e }
            java.lang.String r4 = defpackage.ycc.b((java.lang.String) r13)     // Catch:{ FileNotFoundException -> 0x0127, IOException -> 0x011e }
            android.content.Context r5 = r10.c     // Catch:{ FileNotFoundException -> 0x0127, IOException -> 0x011e }
            java.lang.String r4 = a((java.lang.String) r4, (boolean) r1, (android.content.Context) r5)     // Catch:{ FileNotFoundException -> 0x0127, IOException -> 0x011e }
            java.lang.String r5 = "US-ASCII"
            java.nio.charset.Charset r5 = java.nio.charset.Charset.forName(r5)     // Catch:{ FileNotFoundException -> 0x0127, IOException -> 0x011e }
            byte[] r4 = r4.getBytes(r5)     // Catch:{ FileNotFoundException -> 0x0127, IOException -> 0x011e }
            java.lang.String r13 = a((java.lang.String) r13)     // Catch:{ FileNotFoundException -> 0x0127, IOException -> 0x011e }
            java.io.File r11 = r10.b(r11, r12, r13)     // Catch:{ FileNotFoundException -> 0x0127, IOException -> 0x011e }
            java.io.File r12 = new java.io.File     // Catch:{ FileNotFoundException -> 0x0127, IOException -> 0x011e }
            java.lang.String r13 = "metadata.txt"
            r12.<init>(r11, r13)     // Catch:{ FileNotFoundException -> 0x0127, IOException -> 0x011e }
            r11 = 0
            java.io.FileOutputStream r13 = new java.io.FileOutputStream     // Catch:{ all -> 0x0117 }
            r13.<init>(r12)     // Catch:{ all -> 0x0117 }
            r13.write(r4)     // Catch:{ all -> 0x0113 }
            r13.close()     // Catch:{ FileNotFoundException -> 0x0127, IOException -> 0x011e }
            r12.getAbsolutePath()     // Catch:{ FileNotFoundException -> 0x0127, IOException -> 0x011e }
            int[] r12 = b     // Catch:{ FileNotFoundException -> 0x0127, IOException -> 0x011e }
            int r13 = r12.length     // Catch:{ FileNotFoundException -> 0x0127, IOException -> 0x011e }
        L_0x0081:
            if (r1 >= r13) goto L_0x010e
            r4 = r12[r1]     // Catch:{ FileNotFoundException -> 0x0127, IOException -> 0x011e }
            java.io.File r5 = new java.io.File     // Catch:{ FileNotFoundException -> 0x0127, IOException -> 0x011e }
            java.lang.String r6 = java.lang.String.valueOf(r4)     // Catch:{ FileNotFoundException -> 0x0127, IOException -> 0x011e }
            r5.<init>(r2, r6)     // Catch:{ FileNotFoundException -> 0x0127, IOException -> 0x011e }
            android.content.Context r6 = r10.c     // Catch:{ FileNotFoundException -> 0x0127, IOException -> 0x011e }
            int r4 = defpackage.ycc.a((android.content.Context) r6, (int) r4)     // Catch:{ FileNotFoundException -> 0x0127, IOException -> 0x011e }
            android.graphics.Bitmap r4 = android.graphics.Bitmap.createScaledBitmap(r14, r4, r4, r0)     // Catch:{ FileNotFoundException -> 0x0127, IOException -> 0x011e }
            java.lang.String r6 = r3.outMimeType     // Catch:{ FileNotFoundException -> 0x0127, IOException -> 0x011e }
            java.io.File r7 = new java.io.File     // Catch:{ all -> 0x0107 }
            android.content.Context r8 = r10.c     // Catch:{ all -> 0x0107 }
            java.io.File r8 = r8.getFilesDir()     // Catch:{ all -> 0x0107 }
            java.lang.String r9 = r10.d     // Catch:{ all -> 0x0107 }
            r7.<init>(r8, r9)     // Catch:{ all -> 0x0107 }
            boolean r8 = r7.exists()     // Catch:{ all -> 0x0107 }
            if (r8 == 0) goto L_0x00ae
        L_0x00ad:
            goto L_0x00d4
        L_0x00ae:
            boolean r8 = r7.mkdirs()     // Catch:{ all -> 0x0107 }
            if (r8 != 0) goto L_0x00ad
            java.lang.RuntimeException r12 = new java.lang.RuntimeException     // Catch:{ all -> 0x0107 }
            java.lang.String r13 = "Could not create an avatar directory in dir="
            java.lang.String r14 = r7.getAbsolutePath()     // Catch:{ all -> 0x0107 }
            java.lang.String r14 = java.lang.String.valueOf(r14)     // Catch:{ all -> 0x0107 }
            int r0 = r14.length()     // Catch:{ all -> 0x0107 }
            if (r0 != 0) goto L_0x00cc
            java.lang.String r14 = new java.lang.String     // Catch:{ all -> 0x0107 }
            r14.<init>(r13)     // Catch:{ all -> 0x0107 }
            goto L_0x00d0
        L_0x00cc:
            java.lang.String r14 = r13.concat(r14)     // Catch:{ all -> 0x0107 }
        L_0x00d0:
            r12.<init>(r14)     // Catch:{ all -> 0x0107 }
            throw r12     // Catch:{ all -> 0x0107 }
        L_0x00d4:
            java.io.FileOutputStream r7 = new java.io.FileOutputStream     // Catch:{ all -> 0x0107 }
            r7.<init>(r5)     // Catch:{ all -> 0x0107 }
            java.lang.String r8 = "image/jpeg"
            boolean r6 = r8.equals(r6)     // Catch:{ all -> 0x0103 }
            if (r6 != 0) goto L_0x00e9
            android.graphics.Bitmap$CompressFormat r6 = android.graphics.Bitmap.CompressFormat.PNG     // Catch:{ all -> 0x0103 }
            r8 = 100
            r4.compress(r6, r8, r7)     // Catch:{ all -> 0x0103 }
            goto L_0x00f3
        L_0x00e9:
            long r8 = defpackage.aywy.j()     // Catch:{ all -> 0x0103 }
            int r6 = (int) r8     // Catch:{ all -> 0x0103 }
            android.graphics.Bitmap$CompressFormat r8 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ all -> 0x0103 }
            r4.compress(r8, r6, r7)     // Catch:{ all -> 0x0103 }
        L_0x00f3:
            r7.close()     // Catch:{ FileNotFoundException -> 0x0127, IOException -> 0x011e }
            r5.getAbsolutePath()     // Catch:{ FileNotFoundException -> 0x0127, IOException -> 0x011e }
            if (r4 != r14) goto L_0x00fc
            goto L_0x00ff
        L_0x00fc:
            r4.recycle()     // Catch:{ FileNotFoundException -> 0x0127, IOException -> 0x011e }
        L_0x00ff:
            int r1 = r1 + 1
            goto L_0x0081
        L_0x0103:
            r11 = move-exception
            r12 = r11
            r11 = r7
            goto L_0x0108
        L_0x0107:
            r12 = move-exception
        L_0x0108:
            if (r11 == 0) goto L_0x010d
            r11.close()     // Catch:{ FileNotFoundException -> 0x0127, IOException -> 0x011e }
        L_0x010d:
            throw r12     // Catch:{ FileNotFoundException -> 0x0127, IOException -> 0x011e }
        L_0x010e:
            r14.recycle()     // Catch:{ FileNotFoundException -> 0x0127, IOException -> 0x011e }
            monitor-exit(r10)
            return
        L_0x0113:
            r11 = move-exception
            r12 = r11
            r11 = r13
            goto L_0x0118
        L_0x0117:
            r12 = move-exception
        L_0x0118:
            if (r11 == 0) goto L_0x011d
            r11.close()     // Catch:{ FileNotFoundException -> 0x0127, IOException -> 0x011e }
        L_0x011d:
            throw r12     // Catch:{ FileNotFoundException -> 0x0127, IOException -> 0x011e }
        L_0x011e:
            r11 = move-exception
            java.lang.RuntimeException r12 = new java.lang.RuntimeException     // Catch:{ all -> 0x0131 }
            java.lang.String r13 = "Couldn't update avatar"
            r12.<init>(r13, r11)     // Catch:{ all -> 0x0131 }
            throw r12     // Catch:{ all -> 0x0131 }
        L_0x0127:
            r11 = move-exception
            java.lang.String r12 = "PeopleAvatarFileServer"
            java.lang.String r13 = "Couldn't update avatar"
            android.util.Log.w(r12, r13, r11)     // Catch:{ all -> 0x0131 }
            monitor-exit(r10)
            return
        L_0x0131:
            r11 = move-exception
            monitor-exit(r10)
            goto L_0x0135
        L_0x0134:
            throw r11
        L_0x0135:
            goto L_0x0134
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ybt.a(java.lang.String, java.lang.String, java.lang.String, byte[]):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0061, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean a(java.lang.String r5, java.lang.String r6, java.lang.String r7) {
        /*
            r4 = this;
            monitor-enter(r4)
            defpackage.iva.c(r5)     // Catch:{ all -> 0x0062 }
            defpackage.iva.c(r7)     // Catch:{ all -> 0x0062 }
            java.lang.String r7 = a((java.lang.String) r7)     // Catch:{ all -> 0x0062 }
            java.io.File r0 = r4.b(r5, r6, r7)     // Catch:{ all -> 0x0062 }
            boolean r1 = r0.exists()     // Catch:{ all -> 0x0062 }
            r2 = 0
            if (r1 == 0) goto L_0x0060
            java.lang.String[] r0 = r0.list()     // Catch:{ all -> 0x0062 }
            int r0 = r0.length     // Catch:{ all -> 0x0062 }
            int[] r1 = b     // Catch:{ all -> 0x0062 }
            int r1 = r1.length     // Catch:{ all -> 0x0062 }
            r3 = 1
            int r1 = r1 + r3
            if (r0 != r1) goto L_0x0060
            java.io.File r5 = r4.b(r5, r6, r7)     // Catch:{ all -> 0x0062 }
            java.io.File r6 = new java.io.File     // Catch:{ all -> 0x0062 }
            java.lang.String r0 = "metadata.txt"
            r6.<init>(r5, r0)     // Catch:{ all -> 0x0062 }
            java.lang.String r5 = ""
            boolean r0 = r6.exists()     // Catch:{ all -> 0x0062 }
            if (r0 == 0) goto L_0x004e
            java.lang.String r0 = new java.lang.String     // Catch:{ IOException -> 0x0046 }
            byte[] r6 = defpackage.jjt.a((java.io.File) r6)     // Catch:{ IOException -> 0x0046 }
            java.lang.String r1 = "US-ASCII"
            java.nio.charset.Charset r1 = java.nio.charset.Charset.forName(r1)     // Catch:{ IOException -> 0x0046 }
            r0.<init>(r6, r1)     // Catch:{ IOException -> 0x0046 }
            r5 = r0
            goto L_0x004e
        L_0x0046:
            r6 = move-exception
            java.lang.String r0 = "PeopleAvatarFileServer"
            java.lang.String r1 = "Couldn't read metadata file"
            android.util.Log.w(r0, r1, r6)     // Catch:{ all -> 0x0062 }
        L_0x004e:
            java.lang.String r6 = defpackage.ycc.b((java.lang.String) r7)     // Catch:{ all -> 0x0062 }
            android.content.Context r7 = r4.c     // Catch:{ all -> 0x0062 }
            java.lang.String r6 = a((java.lang.String) r6, (boolean) r2, (android.content.Context) r7)     // Catch:{ all -> 0x0062 }
            boolean r5 = r5.equals(r6)     // Catch:{ all -> 0x0062 }
            if (r5 == 0) goto L_0x0060
            monitor-exit(r4)
            return r3
        L_0x0060:
            monitor-exit(r4)
            return r2
        L_0x0062:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ybt.a(java.lang.String, java.lang.String, java.lang.String):boolean");
    }
}
