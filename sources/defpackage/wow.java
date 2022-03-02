package defpackage;

import android.content.Context;
import android.os.Environment;
import java.io.File;

/* renamed from: wow  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class wow implements wot {
    private static wow h;
    public final Object a = new Object();
    public final int b;
    public wph c;
    public boolean d = true;
    public File e;
    private final oi f;
    private final int g;

    private wow(File file) {
        this.e = file;
        xip.a();
        this.g = Integer.valueOf((int) aywy.a.a().j()).intValue();
        xip.a();
        this.b = Integer.valueOf((int) aywy.a.a().i()).intValue();
        this.f = new oi(this.g);
        new jfx(9, new wou(this)).start();
    }

    public static synchronized wow a(Context context) {
        wow wow;
        String str;
        synchronized (wow.class) {
            if (h == null) {
                if (!"mounted".equals(Environment.getExternalStorageState())) {
                    if (Environment.isExternalStorageRemovable()) {
                        str = context.getCacheDir().getPath();
                        String str2 = File.separator;
                        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + String.valueOf(str2).length() + 11);
                        sb.append(str);
                        sb.append(str2);
                        sb.append("avatarCache");
                        h = new wow(new File(sb.toString()));
                    }
                }
                str = context.getExternalCacheDir().getPath();
                String str22 = File.separator;
                StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + String.valueOf(str22).length() + 11);
                sb2.append(str);
                sb2.append(str22);
                sb2.append("avatarCache");
                h = new wow(new File(sb2.toString()));
            }
            wow = h;
        }
        return wow;
    }

    public final void a(String str, byte[] bArr, long j) {
        if (str != null) {
            aucd o = xqu.d.o();
            auay a2 = auay.a(bArr);
            if (o.c) {
                o.c();
                o.c = false;
            }
            xqu xqu = (xqu) o.b;
            a2.getClass();
            xqu.a |= 1;
            xqu.b = a2;
            long currentTimeMillis = System.currentTimeMillis() + j;
            if (o.c) {
                o.c();
                o.c = false;
            }
            xqu xqu2 = (xqu) o.b;
            xqu2.a |= 2;
            xqu2.c = currentTimeMillis;
            xqu xqu3 = (xqu) o.i();
            oi oiVar = this.f;
            if (oiVar != null) {
                oiVar.a((Object) str, (Object) xqu3);
            }
            new jfx(9, new wov(this, str, xqu3)).start();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x006b A[SYNTHETIC, Splitter:B:38:0x006b] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x007e A[SYNTHETIC, Splitter:B:49:0x007e] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x008f A[SYNTHETIC, Splitter:B:59:0x008f] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x00eb A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final byte[] a(java.lang.String r9) {
        /*
            r8 = this;
            oi r0 = r8.f
            r1 = 0
            if (r0 == 0) goto L_0x000c
            java.lang.Object r0 = r0.a((java.lang.Object) r9)
            xqu r0 = (defpackage.xqu) r0
            goto L_0x000d
        L_0x000c:
            r0 = r1
        L_0x000d:
            if (r0 != 0) goto L_0x00bd
            java.lang.String r0 = defpackage.xqv.a(r9)
            java.lang.Object r2 = r8.a
            monitor-enter(r2)
        L_0x0016:
            boolean r3 = r8.d     // Catch:{ all -> 0x00ba }
            if (r3 != 0) goto L_0x00a9
            wph r3 = r8.c     // Catch:{ all -> 0x00ba }
            if (r3 == 0) goto L_0x008b
            wpg r0 = r3.a(r0)     // Catch:{ IOException -> 0x005f, all -> 0x005d }
            if (r0 == 0) goto L_0x004b
            baua r0 = r0.a()     // Catch:{ IOException -> 0x005f, all -> 0x005d }
            if (r0 == 0) goto L_0x0049
            batf r3 = defpackage.batq.a((defpackage.baua) r0)     // Catch:{ IOException -> 0x0047, all -> 0x0044 }
            r4 = r3
            batv r4 = (defpackage.batv) r4     // Catch:{ IOException -> 0x0047, all -> 0x0044 }
            batd r4 = r4.a     // Catch:{ IOException -> 0x0047, all -> 0x0044 }
            r5 = r3
            batv r5 = (defpackage.batv) r5     // Catch:{ IOException -> 0x0047, all -> 0x0044 }
            baua r5 = r5.b     // Catch:{ IOException -> 0x0047, all -> 0x0044 }
            r4.a((defpackage.baua) r5)     // Catch:{ IOException -> 0x0047, all -> 0x0044 }
            batv r3 = (defpackage.batv) r3     // Catch:{ IOException -> 0x0047, all -> 0x0044 }
            batd r3 = r3.a     // Catch:{ IOException -> 0x0047, all -> 0x0044 }
            byte[] r3 = r3.m()     // Catch:{ IOException -> 0x0047, all -> 0x0044 }
            goto L_0x004d
        L_0x0044:
            r9 = move-exception
            r1 = r0
            goto L_0x007c
        L_0x0047:
            r3 = move-exception
            goto L_0x0062
        L_0x0049:
            r3 = r1
            goto L_0x004d
        L_0x004b:
            r0 = r1
            r3 = r0
        L_0x004d:
            if (r0 == 0) goto L_0x005c
            r0.close()     // Catch:{ IOException -> 0x0053 }
            goto L_0x008c
        L_0x0053:
            r0 = move-exception
            java.lang.String r4 = "AvatarCacheImpl"
            java.lang.String r5 = "getBitmapFromDiskCache: Error closing input stream."
            android.util.Log.e(r4, r5, r0)     // Catch:{ all -> 0x00ba }
            goto L_0x008c
        L_0x005c:
            goto L_0x008c
        L_0x005d:
            r9 = move-exception
            goto L_0x007c
        L_0x005f:
            r0 = move-exception
            r3 = r0
            r0 = r1
        L_0x0062:
            java.lang.String r4 = "AvatarCacheImpl"
            java.lang.String r5 = "getBitmapFromDiskCache: Error getting byte[] from disk cache."
            android.util.Log.e(r4, r5, r3)     // Catch:{ all -> 0x007a }
            if (r0 == 0) goto L_0x0078
            r0.close()     // Catch:{ IOException -> 0x0070 }
            r3 = r1
            goto L_0x008c
        L_0x0070:
            r0 = move-exception
            java.lang.String r3 = "AvatarCacheImpl"
            java.lang.String r4 = "getBitmapFromDiskCache: Error closing input stream."
            android.util.Log.e(r3, r4, r0)     // Catch:{ all -> 0x00ba }
        L_0x0078:
            r3 = r1
            goto L_0x008c
        L_0x007a:
            r9 = move-exception
            r1 = r0
        L_0x007c:
            if (r1 == 0) goto L_0x008a
            r1.close()     // Catch:{ IOException -> 0x0082 }
            goto L_0x008a
        L_0x0082:
            r0 = move-exception
            java.lang.String r1 = "AvatarCacheImpl"
            java.lang.String r3 = "getBitmapFromDiskCache: Error closing input stream."
            android.util.Log.e(r1, r3, r0)     // Catch:{ all -> 0x00ba }
        L_0x008a:
            throw r9     // Catch:{ all -> 0x00ba }
        L_0x008b:
            r3 = r1
        L_0x008c:
            monitor-exit(r2)     // Catch:{ all -> 0x00ba }
            if (r3 == 0) goto L_0x00a6
            aubs r0 = defpackage.aubs.c()     // Catch:{ auda -> 0x009c }
            xqu r2 = defpackage.xqu.d     // Catch:{ auda -> 0x009c }
            aucj r0 = defpackage.aucj.a((defpackage.aucj) r2, (byte[]) r3, (defpackage.aubs) r0)     // Catch:{ auda -> 0x009c }
            xqu r0 = (defpackage.xqu) r0     // Catch:{ auda -> 0x009c }
            goto L_0x00a7
        L_0x009c:
            r0 = move-exception
            java.lang.String r2 = "AvatarCacheImpl"
            java.lang.String r3 = "getFromDiskCache: Error parsing from byte[]."
            android.util.Log.e(r2, r3, r0)
            r0 = r1
            goto L_0x00a7
        L_0x00a6:
            r0 = r1
        L_0x00a7:
            r2 = 0
            goto L_0x00be
        L_0x00a9:
            java.lang.Object r3 = r8.a     // Catch:{ InterruptedException -> 0x00b0 }
            r3.wait()     // Catch:{ InterruptedException -> 0x00b0 }
            goto L_0x0016
        L_0x00b0:
            r3 = move-exception
            java.lang.String r4 = "AvatarCacheImpl"
            java.lang.String r5 = "getFromDiskCache: Error obtaining lock for disk cache."
            android.util.Log.e(r4, r5, r3)     // Catch:{ all -> 0x00ba }
            goto L_0x0016
        L_0x00ba:
            r9 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x00ba }
            throw r9
        L_0x00bd:
            r2 = 1
        L_0x00be:
            if (r0 == 0) goto L_0x00eb
            long r3 = r0.c
            long r5 = java.lang.System.currentTimeMillis()
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 >= 0) goto L_0x00dd
            oi r0 = r8.f
            r0.b(r9)
            wph r0 = r8.c     // Catch:{ IOException -> 0x00db }
            java.lang.String r9 = defpackage.xqv.a(r9)     // Catch:{ IOException -> 0x00db }
            avzy r0 = r0.a     // Catch:{ IOException -> 0x00db }
            r0.c(r9)     // Catch:{ IOException -> 0x00db }
            goto L_0x00dc
        L_0x00db:
            r9 = move-exception
        L_0x00dc:
            return r1
        L_0x00dd:
            if (r2 == 0) goto L_0x00e4
            oi r1 = r8.f
            r1.a((java.lang.Object) r9, (java.lang.Object) r0)
        L_0x00e4:
            auay r9 = r0.b
            byte[] r9 = r9.k()
            return r9
        L_0x00eb:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wow.a(java.lang.String):byte[]");
    }
}
