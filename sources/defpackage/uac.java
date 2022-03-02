package defpackage;

import android.content.Context;
import android.net.Uri;
import java.io.File;
import java.io.IOException;

/* renamed from: uac  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class uac {
    private static final amzy b = amzy.a((Object) "com.android.settings", (Object) aymt.s());
    public txj a;

    private static Uri a(Context context, File file) {
        try {
            Uri a2 = ki.a(context, "com.google.android.gms.fileprovider", file);
            anhk i = b.listIterator();
            while (i.hasNext()) {
                context.grantUriPermission((String) i.next(), a2, 65);
                jjg jjg = tsp.a;
            }
            return a2;
        } catch (IllegalArgumentException e) {
            anih anih = (anih) tsp.a.c();
            anih.a((Throwable) e);
            anih.a("FastPair: HeadsetPieceImage, failed to create content uri for file of %s", (Object) file);
            return null;
        }
    }

    public static void b(Context context) {
        File[] fileArr;
        File c = c(context);
        if (c != null) {
            fileArr = c.listFiles();
        } else {
            fileArr = null;
        }
        int i = 0;
        if (fileArr != null) {
            int i2 = 0;
            while (i < fileArr.length) {
                if (fileArr[i].isFile() && fileArr[i].getName().endsWith(".png")) {
                    jjg jjg = tsp.a;
                    a(context, fileArr[i]);
                    i2++;
                }
                i++;
            }
            i = i2;
        }
        ((anih) tsp.a.d()).a("FastPair: HeadsetPieceImage, grant permission files:%d", i);
    }

    private static File c(Context context) {
        File file = new File(context.getCacheDir(), "nearby_bluetooth_metadata");
        if (file.exists() || file.mkdirs()) {
            return file;
        }
        jjg jjg = tsp.a;
        return null;
    }

    public abstract uab a();

    public abstract String b();

    public abstract String c();

    public abstract auay d();

    public static uac a(uaj uaj, uab uab) {
        String str;
        tzz tzz = new tzz();
        String str2 = uaj.y;
        if (str2 != null) {
            tzz.b = str2;
            if (uab != null) {
                tzz.a = uab;
                if (uab.equals(uab.MAIN)) {
                    tzz.d = uaj.z;
                } else if (!arwx.a(uaj)) {
                    ((anih) tsp.a.c()).a("FastPair: image is not supported with type %s on non-untethered device", (Object) uab);
                } else {
                    auzo auzo = uaj.I;
                    if (auzo == null) {
                        auzo = auzo.j;
                    }
                    avan avan = auzo.d;
                    if (avan == null) {
                        avan = avan.d;
                    }
                    int ordinal = uab.ordinal();
                    if (ordinal == 1) {
                        str = avan.a;
                    } else if (ordinal == 2) {
                        str = avan.b;
                    } else if (ordinal != 3) {
                        ((anih) tsp.a.c()).a("FastPair: insufficient image info with type %s on untethered device", (Object) uab);
                    } else {
                        str = avan.c;
                    }
                    tzz.c = str;
                }
                String str3 = tzz.a == null ? " type" : "";
                if (tzz.b == null) {
                    str3 = str3.concat(" modelId");
                }
                if (str3.isEmpty()) {
                    return new tzx(tzz.a, tzz.b, tzz.c, tzz.d);
                }
                String valueOf = String.valueOf(str3);
                throw new IllegalStateException(valueOf.length() == 0 ? new String("Missing required properties:") : "Missing required properties:".concat(valueOf));
            }
            throw new NullPointerException("Null type");
        }
        throw new NullPointerException("Null modelId");
    }

    public static void a(Context context, String str) {
        File c = c(context);
        int i = 0;
        if (c != null) {
            try {
                File[] listFiles = c.listFiles();
                int length = listFiles.length;
                int i2 = 0;
                int i3 = 0;
                while (i2 < length) {
                    try {
                        File file = listFiles[i2];
                        String name = file.getName();
                        if (name.length() >= str.length()) {
                            if (ampw.a(str, name.substring(0, str.length()))) {
                                file.delete();
                                i3++;
                                jjg jjg = tsp.a;
                                file.getCanonicalPath();
                            }
                        }
                        i2++;
                    } catch (IOException | SecurityException e) {
                        e = e;
                        i = i3;
                        anih anih = (anih) tsp.a.c();
                        anih.a(e);
                        anih.a("FastPair: HeadsetPieceImage, unable to delete images by model id:%s", (Object) str);
                        ((anih) tsp.a.d()).a("FastPair: HeadsetPieceImage, delete files:%d by %s", i, (Object) str);
                    }
                }
                i = i3;
            } catch (IOException | SecurityException e2) {
                e = e2;
                anih anih2 = (anih) tsp.a.c();
                anih2.a(e);
                anih2.a("FastPair: HeadsetPieceImage, unable to delete images by model id:%s", (Object) str);
                ((anih) tsp.a.d()).a("FastPair: HeadsetPieceImage, delete files:%d by %s", i, (Object) str);
            }
        }
        ((anih) tsp.a.d()).a("FastPair: HeadsetPieceImage, delete files:%d by %s", i, (Object) str);
    }

    public static boolean a(Context context, Uri uri) {
        try {
            File canonicalFile = new File(c(context), uri.getLastPathSegment()).getCanonicalFile();
            if (!uri.equals(ki.a(context, "com.google.android.gms.fileprovider", canonicalFile))) {
                ((anih) tsp.a.d()).a("FastPair: HeadsetPieceImage, invalid uri:%s", (Object) uri);
                return false;
            }
            jjg jjg = tsp.a;
            canonicalFile.exists();
            return canonicalFile.exists();
        } catch (IOException | IllegalArgumentException e) {
            anih anih = (anih) tsp.a.c();
            anih.a(e);
            anih.a("FastPair: HeadsetPieceImage, invalid uri:%s", (Object) uri);
            return false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00ae, code lost:
        if (r2.exists() != false) goto L_0x00d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00d7, code lost:
        if (r2.exists() != false) goto L_0x00d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00d9, code lost:
        r2.delete();
        r9 = defpackage.tsp.a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00df, code lost:
        if (r3 != false) goto L_0x00e1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00d3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.net.Uri a(android.content.Context r9) {
        /*
            r8 = this;
            java.io.File r0 = c(r9)
            r1 = 0
            if (r0 == 0) goto L_0x0040
            java.io.File r2 = new java.io.File
            java.lang.String r3 = r8.b()
            uab r4 = r8.a()
            uab r5 = defpackage.uab.MAIN
            java.lang.String r4 = r4.e
            java.lang.String r5 = java.lang.String.valueOf(r3)
            int r5 = r5.length()
            java.lang.String r6 = java.lang.String.valueOf(r4)
            int r6 = r6.length()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            int r5 = r5 + 4
            int r5 = r5 + r6
            r7.<init>(r5)
            r7.append(r3)
            r7.append(r4)
            java.lang.String r3 = ".png"
            r7.append(r3)
            java.lang.String r3 = r7.toString()
            r2.<init>(r0, r3)
            goto L_0x0041
        L_0x0040:
            r2 = r1
        L_0x0041:
            if (r2 == 0) goto L_0x00e6
            boolean r0 = r2.exists()
            if (r0 != 0) goto L_0x00e1
            auay r0 = r8.d()
            r3 = 0
            if (r0 == 0) goto L_0x0067
            auay r0 = r8.d()
            byte[] r0 = r0.k()
            auay r4 = r8.d()
            int r4 = r4.a()
            android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeByteArray(r0, r3, r4)
            jjg r4 = defpackage.tsp.a
            goto L_0x0093
        L_0x0067:
            java.lang.String r0 = r8.c()
            if (r0 == 0) goto L_0x0092
            java.lang.String r0 = r8.c()
            uaa r4 = new uaa
            r4.<init>()
            r5 = 9
            aoru r5 = defpackage.jfm.b(r5)
            tzy r6 = new tzy
            r6.<init>(r8, r4, r0)
            r5.execute(r6)
            r5 = 5
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ InterruptedException -> 0x008c }
            r4.await(r5, r0)     // Catch:{ InterruptedException -> 0x008c }
            goto L_0x008d
        L_0x008c:
            r0 = move-exception
        L_0x008d:
            android.graphics.Bitmap r0 = r4.a
            jjg r4 = defpackage.tsp.a
            goto L_0x0093
        L_0x0092:
            r0 = r1
        L_0x0093:
            if (r0 == 0) goto L_0x00e6
            java.io.BufferedOutputStream r4 = new java.io.BufferedOutputStream     // Catch:{ IOException -> 0x00d0, all -> 0x00c1 }
            java.io.FileOutputStream r5 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x00d0, all -> 0x00c1 }
            r5.<init>(r2)     // Catch:{ IOException -> 0x00d0, all -> 0x00c1 }
            r4.<init>(r5)     // Catch:{ IOException -> 0x00d0, all -> 0x00c1 }
            android.graphics.Bitmap$CompressFormat r5 = android.graphics.Bitmap.CompressFormat.PNG     // Catch:{ all -> 0x00b7 }
            boolean r3 = r0.compress(r5, r3, r4)     // Catch:{ all -> 0x00b7 }
            r4.close()     // Catch:{ IOException -> 0x00b5, all -> 0x00b3 }
            if (r3 != 0) goto L_0x00b2
            boolean r0 = r2.exists()
            if (r0 == 0) goto L_0x00b1
            goto L_0x00d9
        L_0x00b1:
            goto L_0x00df
        L_0x00b2:
            goto L_0x00df
        L_0x00b3:
            r9 = move-exception
            goto L_0x00c2
        L_0x00b5:
            r0 = move-exception
            goto L_0x00d1
        L_0x00b7:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x00bc }
            goto L_0x00c0
        L_0x00bc:
            r4 = move-exception
            defpackage.apev.a((java.lang.Throwable) r0, (java.lang.Throwable) r4)     // Catch:{ IOException -> 0x00d0, all -> 0x00c1 }
        L_0x00c0:
            throw r0     // Catch:{ IOException -> 0x00d0, all -> 0x00c1 }
        L_0x00c1:
            r9 = move-exception
        L_0x00c2:
            if (r3 != 0) goto L_0x00cf
            boolean r0 = r2.exists()
            if (r0 == 0) goto L_0x00cf
            r2.delete()
            jjg r0 = defpackage.tsp.a
        L_0x00cf:
            throw r9
        L_0x00d0:
            r0 = move-exception
        L_0x00d1:
            if (r3 != 0) goto L_0x00df
            boolean r0 = r2.exists()
            if (r0 == 0) goto L_0x00df
        L_0x00d9:
            r2.delete()
            jjg r9 = defpackage.tsp.a
            goto L_0x00e6
        L_0x00df:
            if (r3 == 0) goto L_0x00e6
        L_0x00e1:
            android.net.Uri r9 = a((android.content.Context) r9, (java.io.File) r2)
            return r9
        L_0x00e6:
            jjg r9 = defpackage.tsp.a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uac.a(android.content.Context):android.net.Uri");
    }
}
