package defpackage;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.io.File;

/* renamed from: pxo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class pxo {
    public final Object a = new Object();
    public boolean b = false;
    public File c = null;
    public int d = 0;
    public final boolean e;

    public pxo(File file, boolean z) {
        this.c = new File(file, "query-record-log.tmp");
        this.e = z;
    }

    public static byte[] a(SafeParcelable safeParcelable) {
        Parcel obtain = Parcel.obtain();
        safeParcelable.writeToParcel(obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        return marshall;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0053, code lost:
        return r1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0071 A[SYNTHETIC, Splitter:B:31:0x0071] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0096 A[SYNTHETIC, Splitter:B:44:0x0096] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00b1 A[SYNTHETIC, Splitter:B:54:0x00b1] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List b() {
        /*
            r9 = this;
            java.lang.Object r0 = r9.a
            monitor-enter(r0)
            r1 = 1
            r2 = 0
            r3 = 0
            java.io.File r4 = r9.c     // Catch:{ IllegalArgumentException -> 0x00c8 }
            long r4 = r4.length()     // Catch:{ IllegalArgumentException -> 0x00c8 }
            int r5 = (int) r4     // Catch:{ IllegalArgumentException -> 0x00c8 }
            java.nio.ByteBuffer r4 = java.nio.ByteBuffer.allocate(r5)     // Catch:{ IllegalArgumentException -> 0x00c8 }
            java.io.FileInputStream r5 = new java.io.FileInputStream     // Catch:{ FileNotFoundException -> 0x0087, IOException -> 0x005e, all -> 0x005c }
            java.io.File r6 = r9.c     // Catch:{ FileNotFoundException -> 0x0087, IOException -> 0x005e, all -> 0x005c }
            r5.<init>(r6)     // Catch:{ FileNotFoundException -> 0x0087, IOException -> 0x005e, all -> 0x005c }
            java.nio.channels.FileChannel r6 = r5.getChannel()     // Catch:{ FileNotFoundException -> 0x005a, IOException -> 0x0058, all -> 0x0054 }
            r6.read(r4)     // Catch:{ FileNotFoundException -> 0x005a, IOException -> 0x0058, all -> 0x0054 }
            r5.close()     // Catch:{ IOException -> 0x0023 }
            goto L_0x0033
        L_0x0023:
            r2 = move-exception
            java.lang.String r5 = "Error while closing stream to %s"
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ all -> 0x00c6 }
            java.io.File r6 = r9.c     // Catch:{ all -> 0x00c6 }
            java.lang.String r6 = r6.getName()     // Catch:{ all -> 0x00c6 }
            r1[r3] = r6     // Catch:{ all -> 0x00c6 }
            defpackage.oso.b((java.lang.Throwable) r2, (java.lang.String) r5, (java.lang.Object[]) r1)     // Catch:{ all -> 0x00c6 }
        L_0x0033:
            r4.rewind()     // Catch:{ all -> 0x00c6 }
            java.lang.Class<oub> r1 = defpackage.oub.class
            oub r2 = defpackage.oub.c     // Catch:{ all -> 0x00c6 }
            r5 = 7
            java.lang.Object r2 = r2.c(r5)     // Catch:{ all -> 0x00c6 }
            auef r2 = (defpackage.auef) r2     // Catch:{ all -> 0x00c6 }
            java.util.List r1 = defpackage.jkw.a((java.nio.ByteBuffer) r4, (java.lang.Class) r1, (defpackage.auef) r2, (boolean) r3)     // Catch:{ all -> 0x00c6 }
            if (r1 != 0) goto L_0x0052
            java.lang.String r2 = "Failed to read from record file %s"
            java.io.File r3 = r9.c     // Catch:{ all -> 0x00c6 }
            java.lang.String r3 = r3.getName()     // Catch:{ all -> 0x00c6 }
            defpackage.oso.b((java.lang.String) r2, (java.lang.Object) r3)     // Catch:{ all -> 0x00c6 }
        L_0x0052:
            monitor-exit(r0)     // Catch:{ all -> 0x00c6 }
            return r1
        L_0x0054:
            r2 = move-exception
            r4 = r2
            r2 = r5
            goto L_0x00af
        L_0x0058:
            r4 = move-exception
            goto L_0x0060
        L_0x005a:
            r4 = move-exception
            goto L_0x0089
        L_0x005c:
            r4 = move-exception
            goto L_0x00af
        L_0x005e:
            r4 = move-exception
            r5 = r2
        L_0x0060:
            java.lang.String r6 = "Error while reading from %s"
            java.lang.Object[] r7 = new java.lang.Object[r1]     // Catch:{ all -> 0x00ac }
            java.io.File r8 = r9.c     // Catch:{ all -> 0x00ac }
            java.lang.String r8 = r8.getName()     // Catch:{ all -> 0x00ac }
            r7[r3] = r8     // Catch:{ all -> 0x00ac }
            defpackage.oso.b((java.lang.Throwable) r4, (java.lang.String) r6, (java.lang.Object[]) r7)     // Catch:{ all -> 0x00ac }
            if (r5 == 0) goto L_0x0085
            r5.close()     // Catch:{ IOException -> 0x0075 }
            goto L_0x0085
        L_0x0075:
            r4 = move-exception
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ all -> 0x00c6 }
            java.io.File r5 = r9.c     // Catch:{ all -> 0x00c6 }
            java.lang.String r5 = r5.getName()     // Catch:{ all -> 0x00c6 }
            r1[r3] = r5     // Catch:{ all -> 0x00c6 }
            java.lang.String r3 = "Error while closing stream to %s"
            defpackage.oso.b((java.lang.Throwable) r4, (java.lang.String) r3, (java.lang.Object[]) r1)     // Catch:{ all -> 0x00c6 }
        L_0x0085:
            monitor-exit(r0)     // Catch:{ all -> 0x00c6 }
            return r2
        L_0x0087:
            r4 = move-exception
            r5 = r2
        L_0x0089:
            java.lang.String r4 = "Record file %s not found, ignoring"
            java.io.File r6 = r9.c     // Catch:{ all -> 0x00ac }
            java.lang.String r6 = r6.getAbsolutePath()     // Catch:{ all -> 0x00ac }
            defpackage.oso.e((java.lang.String) r4, (java.lang.Object) r6)     // Catch:{ all -> 0x00ac }
            if (r5 == 0) goto L_0x00aa
            r5.close()     // Catch:{ IOException -> 0x009a }
            goto L_0x00aa
        L_0x009a:
            r4 = move-exception
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ all -> 0x00c6 }
            java.io.File r5 = r9.c     // Catch:{ all -> 0x00c6 }
            java.lang.String r5 = r5.getName()     // Catch:{ all -> 0x00c6 }
            r1[r3] = r5     // Catch:{ all -> 0x00c6 }
            java.lang.String r3 = "Error while closing stream to %s"
            defpackage.oso.b((java.lang.Throwable) r4, (java.lang.String) r3, (java.lang.Object[]) r1)     // Catch:{ all -> 0x00c6 }
        L_0x00aa:
            monitor-exit(r0)     // Catch:{ all -> 0x00c6 }
            return r2
        L_0x00ac:
            r2 = move-exception
            r4 = r2
            r2 = r5
        L_0x00af:
            if (r2 == 0) goto L_0x00c5
            r2.close()     // Catch:{ IOException -> 0x00b5 }
            goto L_0x00c5
        L_0x00b5:
            r2 = move-exception
            java.lang.String r5 = "Error while closing stream to %s"
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ all -> 0x00c6 }
            java.io.File r6 = r9.c     // Catch:{ all -> 0x00c6 }
            java.lang.String r6 = r6.getName()     // Catch:{ all -> 0x00c6 }
            r1[r3] = r6     // Catch:{ all -> 0x00c6 }
            defpackage.oso.b((java.lang.Throwable) r2, (java.lang.String) r5, (java.lang.Object[]) r1)     // Catch:{ all -> 0x00c6 }
        L_0x00c5:
            throw r4     // Catch:{ all -> 0x00c6 }
        L_0x00c6:
            r1 = move-exception
            goto L_0x00e7
        L_0x00c8:
            r4 = move-exception
            java.lang.String r5 = "Error while reading from %s: file too large: %s"
            r6 = 2
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch:{ all -> 0x00c6 }
            java.io.File r7 = r9.c     // Catch:{ all -> 0x00c6 }
            java.lang.String r7 = r7.getName()     // Catch:{ all -> 0x00c6 }
            r6[r3] = r7     // Catch:{ all -> 0x00c6 }
            java.io.File r3 = r9.c     // Catch:{ all -> 0x00c6 }
            long r7 = r3.length()     // Catch:{ all -> 0x00c6 }
            java.lang.String r3 = defpackage.plc.a((long) r7)     // Catch:{ all -> 0x00c6 }
            r6[r1] = r3     // Catch:{ all -> 0x00c6 }
            defpackage.oso.b((java.lang.Throwable) r4, (java.lang.String) r5, (java.lang.Object[]) r6)     // Catch:{ all -> 0x00c6 }
            monitor-exit(r0)     // Catch:{ all -> 0x00c6 }
            return r2
        L_0x00e7:
            monitor-exit(r0)     // Catch:{ all -> 0x00c6 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pxo.b():java.util.List");
    }

    /* JADX WARNING: Removed duplicated region for block: B:45:0x009b A[SYNTHETIC, Splitter:B:45:0x009b] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00b6 A[SYNTHETIC, Splitter:B:55:0x00b6] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(defpackage.oub r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.a
            monitor-enter(r0)
            boolean r1 = r7.b     // Catch:{ all -> 0x00d2 }
            if (r1 == 0) goto L_0x00cb
            java.util.LinkedList r1 = new java.util.LinkedList     // Catch:{ all -> 0x00d2 }
            r1.<init>()     // Catch:{ all -> 0x00d2 }
            r1.add(r8)     // Catch:{ all -> 0x00d2 }
            r8 = 0
            r2 = 0
            r3 = 1
            int r4 = r7.d     // Catch:{ IOException -> 0x0087, all -> 0x0085 }
            r5 = 5
            if (r4 >= r5) goto L_0x001c
            int r4 = r4 + r3
            r7.d = r4     // Catch:{ IOException -> 0x0087, all -> 0x0085 }
            r4 = 1
            goto L_0x0039
        L_0x001c:
            java.util.List r4 = r7.b()     // Catch:{ IOException -> 0x0087, all -> 0x0085 }
            if (r4 == 0) goto L_0x0031
            int r6 = r4.size()     // Catch:{ IOException -> 0x0087, all -> 0x0085 }
            if (r6 != r5) goto L_0x0031
            java.util.List r4 = r4.subList(r3, r5)     // Catch:{ IOException -> 0x0087, all -> 0x0085 }
            r1.addAll(r2, r4)     // Catch:{ IOException -> 0x0087, all -> 0x0085 }
            r4 = 0
            goto L_0x0039
        L_0x0031:
            java.lang.String r4 = "Inconsistent record file, overwriting"
            defpackage.oso.b(r4)     // Catch:{ IOException -> 0x0087, all -> 0x0085 }
            r7.d = r3     // Catch:{ IOException -> 0x0087, all -> 0x0085 }
            r4 = 0
        L_0x0039:
            java.nio.ByteBuffer r1 = defpackage.jkw.a(r1, r2)     // Catch:{ IOException -> 0x0087, all -> 0x0085 }
            java.io.FileOutputStream r5 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x0087, all -> 0x0085 }
            java.io.File r6 = r7.c     // Catch:{ IOException -> 0x0087, all -> 0x0085 }
            r5.<init>(r6, r4)     // Catch:{ IOException -> 0x0087, all -> 0x0085 }
            java.nio.channels.FileChannel r8 = r5.getChannel()     // Catch:{ IOException -> 0x0083, all -> 0x007f }
            int r8 = r8.write(r1)     // Catch:{ IOException -> 0x0083, all -> 0x007f }
            if (r8 != 0) goto L_0x006a
            java.lang.String r8 = "No bytes written to replay file"
            defpackage.oso.e(r8)     // Catch:{ IOException -> 0x0083, all -> 0x007f }
            r5.close()     // Catch:{ IOException -> 0x0058 }
            goto L_0x0068
        L_0x0058:
            r8 = move-exception
            java.lang.Object[] r1 = new java.lang.Object[r3]     // Catch:{ all -> 0x00d2 }
            java.io.File r3 = r7.c     // Catch:{ all -> 0x00d2 }
            java.lang.String r3 = r3.getPath()     // Catch:{ all -> 0x00d2 }
            r1[r2] = r3     // Catch:{ all -> 0x00d2 }
            java.lang.String r2 = "Error while closing stream to %s"
            defpackage.oso.b((java.lang.Throwable) r8, (java.lang.String) r2, (java.lang.Object[]) r1)     // Catch:{ all -> 0x00d2 }
        L_0x0068:
            monitor-exit(r0)     // Catch:{ all -> 0x00d2 }
            return
        L_0x006a:
            r5.close()     // Catch:{ IOException -> 0x006e }
            goto L_0x00d0
        L_0x006e:
            r8 = move-exception
            java.lang.String r1 = "Error while closing stream to %s"
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ all -> 0x00d2 }
            java.io.File r4 = r7.c     // Catch:{ all -> 0x00d2 }
            java.lang.String r4 = r4.getPath()     // Catch:{ all -> 0x00d2 }
            r3[r2] = r4     // Catch:{ all -> 0x00d2 }
            defpackage.oso.b((java.lang.Throwable) r8, (java.lang.String) r1, (java.lang.Object[]) r3)     // Catch:{ all -> 0x00d2 }
            goto L_0x00d0
        L_0x007f:
            r8 = move-exception
            r1 = r8
            r8 = r5
            goto L_0x00b4
        L_0x0083:
            r8 = move-exception
            goto L_0x008a
        L_0x0085:
            r1 = move-exception
            goto L_0x00b4
        L_0x0087:
            r1 = move-exception
            r5 = r8
            r8 = r1
        L_0x008a:
            java.lang.String r1 = "Error while writing to %s"
            java.lang.Object[] r4 = new java.lang.Object[r3]     // Catch:{ all -> 0x00b1 }
            java.io.File r6 = r7.c     // Catch:{ all -> 0x00b1 }
            java.lang.String r6 = r6.getPath()     // Catch:{ all -> 0x00b1 }
            r4[r2] = r6     // Catch:{ all -> 0x00b1 }
            defpackage.oso.b((java.lang.Throwable) r8, (java.lang.String) r1, (java.lang.Object[]) r4)     // Catch:{ all -> 0x00b1 }
            if (r5 == 0) goto L_0x00af
            r5.close()     // Catch:{ IOException -> 0x009f }
            goto L_0x00af
        L_0x009f:
            r8 = move-exception
            java.lang.Object[] r1 = new java.lang.Object[r3]     // Catch:{ all -> 0x00d2 }
            java.io.File r3 = r7.c     // Catch:{ all -> 0x00d2 }
            java.lang.String r3 = r3.getPath()     // Catch:{ all -> 0x00d2 }
            r1[r2] = r3     // Catch:{ all -> 0x00d2 }
            java.lang.String r2 = "Error while closing stream to %s"
            defpackage.oso.b((java.lang.Throwable) r8, (java.lang.String) r2, (java.lang.Object[]) r1)     // Catch:{ all -> 0x00d2 }
        L_0x00af:
            monitor-exit(r0)     // Catch:{ all -> 0x00d2 }
            return
        L_0x00b1:
            r8 = move-exception
            r1 = r8
            r8 = r5
        L_0x00b4:
            if (r8 == 0) goto L_0x00ca
            r8.close()     // Catch:{ IOException -> 0x00ba }
            goto L_0x00ca
        L_0x00ba:
            r8 = move-exception
            java.lang.String r4 = "Error while closing stream to %s"
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ all -> 0x00d2 }
            java.io.File r5 = r7.c     // Catch:{ all -> 0x00d2 }
            java.lang.String r5 = r5.getPath()     // Catch:{ all -> 0x00d2 }
            r3[r2] = r5     // Catch:{ all -> 0x00d2 }
            defpackage.oso.b((java.lang.Throwable) r8, (java.lang.String) r4, (java.lang.Object[]) r3)     // Catch:{ all -> 0x00d2 }
        L_0x00ca:
            throw r1     // Catch:{ all -> 0x00d2 }
        L_0x00cb:
            java.lang.String r8 = "Unexpectedly stopped recording"
            defpackage.oso.a(r8)     // Catch:{ all -> 0x00d2 }
        L_0x00d0:
            monitor-exit(r0)     // Catch:{ all -> 0x00d2 }
            return
        L_0x00d2:
            r8 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00d2 }
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pxo.a(oub):void");
    }

    public final boolean a() {
        boolean z;
        if (this.e) {
            return false;
        }
        synchronized (this.a) {
            z = this.b;
        }
        return z;
    }
}
