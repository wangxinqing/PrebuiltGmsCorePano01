package defpackage;

import java.util.EnumSet;
import java.util.Set;

/* renamed from: kfy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class kfy extends kfa {
    private final kei f;

    public kfy(kec kec, kei kei, kwg kwg) {
        super("GetDebugContentsOperati", kec, kwg, "378076965553", 68);
        this.f = kei;
    }

    public final Set a() {
        return EnumSet.of(jzl.FULL, jzl.FILE, jzl.APPDATA);
    }

    /* JADX WARNING: Removed duplicated region for block: B:43:0x00e3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(android.content.Context r13) {
        /*
            r12 = this;
            r0 = 0
            kei r1 = r12.f     // Catch:{ IOException -> 0x00d5, all -> 0x00d3 }
            khq r2 = r12.b()     // Catch:{ IOException -> 0x00d5, all -> 0x00d3 }
            r3 = 805306368(0x30000000, float:4.656613E-10)
            kwg r4 = r12.b     // Catch:{ IOException -> 0x00d5, all -> 0x00d3 }
            android.os.IBinder r4 = r4.asBinder()     // Catch:{ IOException -> 0x00d5, all -> 0x00d3 }
            com.google.android.gms.drive.Contents r0 = r1.a(r2, r3, r4)     // Catch:{ IOException -> 0x00d5, all -> 0x00d3 }
            java.lang.String r1 = "DocList.db"
            java.util.HashSet r2 = new java.util.HashSet     // Catch:{ IOException -> 0x00d1, all -> 0x00cf }
            r2.<init>()     // Catch:{ IOException -> 0x00d1, all -> 0x00cf }
            java.lang.String[] r3 = defpackage.lrm.a     // Catch:{ IOException -> 0x00d1, all -> 0x00cf }
            int r4 = r3.length     // Catch:{ IOException -> 0x00d1, all -> 0x00cf }
            r5 = 0
            r6 = 0
        L_0x001f:
            if (r6 >= r4) goto L_0x0048
            r7 = r3[r6]     // Catch:{ IOException -> 0x00d1, all -> 0x00cf }
            java.lang.String r7 = java.lang.String.valueOf(r7)     // Catch:{ IOException -> 0x00d1, all -> 0x00cf }
            int r8 = r7.length()     // Catch:{ IOException -> 0x00d1, all -> 0x00cf }
            if (r8 != 0) goto L_0x0033
            java.lang.String r7 = new java.lang.String     // Catch:{ IOException -> 0x00d1, all -> 0x00cf }
            r7.<init>(r1)     // Catch:{ IOException -> 0x00d1, all -> 0x00cf }
            goto L_0x0037
        L_0x0033:
            java.lang.String r7 = r1.concat(r7)     // Catch:{ IOException -> 0x00d1, all -> 0x00cf }
        L_0x0037:
            java.io.File r7 = r13.getDatabasePath(r7)     // Catch:{ IOException -> 0x00d1, all -> 0x00cf }
            boolean r8 = r7.exists()     // Catch:{ IOException -> 0x00d1, all -> 0x00cf }
            if (r8 != 0) goto L_0x0042
            goto L_0x0045
        L_0x0042:
            r2.add(r7)     // Catch:{ IOException -> 0x00d1, all -> 0x00cf }
        L_0x0045:
            int r6 = r6 + 1
            goto L_0x001f
        L_0x0048:
            int r13 = r2.size()     // Catch:{ IOException -> 0x00d1, all -> 0x00cf }
            if (r13 != 0) goto L_0x004f
            goto L_0x0097
        L_0x004f:
            anmx r13 = defpackage.anmx.a()     // Catch:{ IOException -> 0x00d1, all -> 0x00cf }
            java.util.zip.ZipOutputStream r1 = new java.util.zip.ZipOutputStream     // Catch:{ all -> 0x00ca }
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ all -> 0x00ca }
            android.os.ParcelFileDescriptor r4 = r0.a     // Catch:{ all -> 0x00ca }
            java.io.FileDescriptor r4 = r4.getFileDescriptor()     // Catch:{ all -> 0x00ca }
            r3.<init>(r4)     // Catch:{ all -> 0x00ca }
            r1.<init>(r3)     // Catch:{ all -> 0x00ca }
            r13.a((java.io.Closeable) r1)     // Catch:{ all -> 0x00ca }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x00ca }
        L_0x006a:
            boolean r3 = r2.hasNext()     // Catch:{ all -> 0x00ca }
            if (r3 == 0) goto L_0x0094
            java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x00ca }
            java.io.File r3 = (java.io.File) r3     // Catch:{ all -> 0x00ca }
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch:{ all -> 0x00ca }
            r4.<init>(r3)     // Catch:{ all -> 0x00ca }
            r13.a((java.io.Closeable) r4)     // Catch:{ all -> 0x00ca }
            java.util.zip.ZipEntry r6 = new java.util.zip.ZipEntry     // Catch:{ all -> 0x00ca }
            java.lang.String r3 = r3.getName()     // Catch:{ all -> 0x00ca }
            r6.<init>(r3)     // Catch:{ all -> 0x00ca }
            r1.putNextEntry(r6)     // Catch:{ all -> 0x00ca }
            defpackage.jjt.a(r4, r1)     // Catch:{ all -> 0x00ca }
            r1.closeEntry()     // Catch:{ all -> 0x00ca }
            r4.close()     // Catch:{ all -> 0x00ca }
            goto L_0x006a
        L_0x0094:
            r13.close()     // Catch:{ IOException -> 0x00d1, all -> 0x00cf }
        L_0x0097:
            java.io.FileInputStream r13 = new java.io.FileInputStream     // Catch:{ IOException -> 0x00d1, all -> 0x00cf }
            android.os.ParcelFileDescriptor r1 = r0.a     // Catch:{ IOException -> 0x00d1, all -> 0x00cf }
            java.io.FileDescriptor r1 = r1.getFileDescriptor()     // Catch:{ IOException -> 0x00d1, all -> 0x00cf }
            r13.<init>(r1)     // Catch:{ IOException -> 0x00d1, all -> 0x00cf }
            java.nio.channels.FileChannel r13 = r13.getChannel()     // Catch:{ IOException -> 0x00d1, all -> 0x00cf }
            r1 = 0
            r13.position(r1)     // Catch:{ IOException -> 0x00d1, all -> 0x00cf }
            kwg r13 = r12.b     // Catch:{ IOException -> 0x00d1, all -> 0x00cf }
            com.google.android.gms.drive.internal.OnContentsResponse r1 = new com.google.android.gms.drive.internal.OnContentsResponse     // Catch:{ IOException -> 0x00d1, all -> 0x00cf }
            r1.<init>(r0, r5)     // Catch:{ IOException -> 0x00d1, all -> 0x00cf }
            r13.a((com.google.android.gms.drive.internal.OnContentsResponse) r1)     // Catch:{ IOException -> 0x00d1, all -> 0x00cf }
            if (r0 == 0) goto L_0x00c9
            kei r6 = r12.f
            khq r7 = r12.b()
            int r8 = r0.b
            com.google.android.gms.drive.metadata.internal.MetadataBundle r9 = com.google.android.gms.drive.metadata.internal.MetadataBundle.a()
            r10 = 0
            kdo r11 = defpackage.kdo.a
            r6.a((defpackage.khq) r7, (int) r8, (com.google.android.gms.drive.metadata.internal.MetadataBundle) r9, (boolean) r10, (defpackage.kdo) r11)
        L_0x00c9:
            return
        L_0x00ca:
            r1 = move-exception
            r13.close()     // Catch:{ IOException -> 0x00d1, all -> 0x00cf }
            throw r1     // Catch:{ IOException -> 0x00d1, all -> 0x00cf }
        L_0x00cf:
            r13 = move-exception
            goto L_0x00e1
        L_0x00d1:
            r13 = move-exception
            goto L_0x00d6
        L_0x00d3:
            r13 = move-exception
            goto L_0x00e1
        L_0x00d5:
            r13 = move-exception
        L_0x00d6:
            nja r13 = new nja     // Catch:{ all -> 0x00e0 }
            r1 = 8
            java.lang.String r2 = "Error providing debug contents. Something failed dumping the DB"
            r13.<init>(r1, r2)     // Catch:{ all -> 0x00e0 }
            throw r13     // Catch:{ all -> 0x00e0 }
        L_0x00e0:
            r13 = move-exception
        L_0x00e1:
            if (r0 == 0) goto L_0x00f5
            kei r1 = r12.f
            khq r2 = r12.b()
            int r3 = r0.b
            com.google.android.gms.drive.metadata.internal.MetadataBundle r4 = com.google.android.gms.drive.metadata.internal.MetadataBundle.a()
            r5 = 0
            kdo r6 = defpackage.kdo.a
            r1.a((defpackage.khq) r2, (int) r3, (com.google.android.gms.drive.metadata.internal.MetadataBundle) r4, (boolean) r5, (defpackage.kdo) r6)
        L_0x00f5:
            goto L_0x00f7
        L_0x00f6:
            throw r13
        L_0x00f7:
            goto L_0x00f6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kfy.c(android.content.Context):void");
    }
}
