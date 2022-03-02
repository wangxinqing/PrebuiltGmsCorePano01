package defpackage;

/* renamed from: ajrd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ajrd {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v7, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v8, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v9, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v10, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v11, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v1, resolved type: java.nio.channels.FileChannel} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v2, resolved type: java.nio.channels.FileChannel} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v3, resolved type: java.nio.channels.FileChannel} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v4, resolved type: java.nio.channels.FileChannel} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v12, resolved type: java.io.InputStream} */
    /* JADX WARNING: type inference failed for: r16v0, types: [java.io.Closeable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x006d A[LOOP:0: B:32:0x0066->B:36:0x006d, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x006f A[EDGE_INSN: B:37:0x006f->B:38:? ?: BREAK  , SYNTHETIC, Splitter:B:37:0x006f] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0084 A[EDGE_INSN: B:44:0x0084->B:45:? ?: BREAK  , SYNTHETIC, Splitter:B:44:0x0084] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0124 A[SYNTHETIC, Splitter:B:68:0x0124] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0146 A[SYNTHETIC, Splitter:B:71:0x0146] */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0166  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.nio.ByteBuffer a(android.content.Context r17, java.lang.String r18, long r19, long r21) {
        /*
            r1 = r18
            r2 = r19
            r4 = r21
            r6 = 0
            r7 = 0
            android.content.res.AssetManager r0 = r17.getAssets()     // Catch:{ IOException -> 0x0054, all -> 0x004f }
            android.content.res.AssetFileDescriptor r8 = r0.openFd(r1)     // Catch:{ IOException -> 0x0054, all -> 0x004f }
            java.io.FileInputStream r9 = r8.createInputStream()     // Catch:{ IOException -> 0x004a, all -> 0x0046 }
            java.nio.channels.FileChannel r16 = r9.getChannel()     // Catch:{ IOException -> 0x0042, all -> 0x003f }
            java.nio.channels.FileChannel$MapMode r11 = java.nio.channels.FileChannel.MapMode.READ_ONLY     // Catch:{ IOException -> 0x003d, all -> 0x0038 }
            long r12 = r16.position()     // Catch:{ IOException -> 0x003d, all -> 0x0038 }
            long r14 = r8.getLength()     // Catch:{ IOException -> 0x003d, all -> 0x0038 }
            r10 = r16
            java.nio.MappedByteBuffer r0 = r10.map(r11, r12, r14)     // Catch:{ IOException -> 0x003d, all -> 0x0038 }
            defpackage.ajre.a((java.io.Closeable) r16)
            boolean r1 = defpackage.ajre.a((java.io.Closeable) r9)
            if (r1 != 0) goto L_0x0036
            defpackage.ajre.a((java.io.Closeable) r8)
            goto L_0x009c
        L_0x0036:
            goto L_0x009c
        L_0x0038:
            r0 = move-exception
            r7 = r16
            goto L_0x015d
        L_0x003d:
            r0 = move-exception
            goto L_0x0059
        L_0x003f:
            r0 = move-exception
            goto L_0x015d
        L_0x0042:
            r0 = move-exception
            r16 = r7
            goto L_0x0059
        L_0x0046:
            r0 = move-exception
            r9 = r7
            goto L_0x015d
        L_0x004a:
            r0 = move-exception
            r9 = r7
            r16 = r9
            goto L_0x0059
        L_0x004f:
            r0 = move-exception
            r8 = r7
            r9 = r8
            goto L_0x015d
        L_0x0054:
            r0 = move-exception
            r8 = r7
            r9 = r8
            r16 = r9
        L_0x0059:
            r0 = 4096(0x1000, float:5.74E-42)
            byte[] r0 = new byte[r0]     // Catch:{ all -> 0x015a }
            android.content.res.AssetManager r10 = r17.getAssets()     // Catch:{ all -> 0x0155 }
            java.io.InputStream r10 = r10.open(r1)     // Catch:{ all -> 0x0155 }
            r11 = 0
        L_0x0066:
            int r12 = r10.read(r0)     // Catch:{ all -> 0x0152 }
            r13 = -1
            if (r12 == r13) goto L_0x006f
            int r11 = r11 + r12
            goto L_0x0066
        L_0x006f:
            defpackage.ajre.a((java.io.Closeable) r10)     // Catch:{ all -> 0x015a }
            java.nio.ByteBuffer r10 = java.nio.ByteBuffer.allocate(r11)     // Catch:{ all -> 0x015a }
            android.content.res.AssetManager r12 = r17.getAssets()     // Catch:{ all -> 0x014d }
            java.io.InputStream r7 = r12.open(r1)     // Catch:{ all -> 0x014d }
        L_0x007e:
            int r1 = r7.read(r0)     // Catch:{ all -> 0x014b }
            if (r1 != r13) goto L_0x0145
            defpackage.ajre.a((java.io.Closeable) r7)     // Catch:{ all -> 0x015a }
            int r0 = r10.position()     // Catch:{ all -> 0x015a }
            if (r0 != r11) goto L_0x0124
            defpackage.ajre.a((java.io.Closeable) r16)
            boolean r0 = defpackage.ajre.a((java.io.Closeable) r9)
            if (r0 != 0) goto L_0x009a
            defpackage.ajre.a((java.io.Closeable) r8)
            goto L_0x009b
        L_0x009a:
        L_0x009b:
            r0 = r10
        L_0x009c:
            if (r0 == 0) goto L_0x0123
            long r7 = r0.getLong(r6)
            java.lang.String r1 = " != "
            int r9 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r9 != 0) goto L_0x0100
            r2 = -1
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 == 0) goto L_0x00fc
            java.util.zip.CRC32 r2 = new java.util.zip.CRC32
            r2.<init>()
            boolean r3 = r0.hasArray()
            if (r3 == 0) goto L_0x00c1
            byte[] r3 = r0.array()
            r2.update(r3)
            goto L_0x00d0
        L_0x00c1:
            r0.rewind()
            int r3 = r0.remaining()
            byte[] r3 = new byte[r3]
            r0.get(r3)
            r2.update(r3)
        L_0x00d0:
            long r6 = r2.getValue()
            int r3 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r3 != 0) goto L_0x00d9
            goto L_0x00fc
        L_0x00d9:
            java.io.IOException r0 = new java.io.IOException
            long r2 = r2.getValue()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r7 = 58
            r6.<init>(r7)
            java.lang.String r7 = "The checksum: "
            r6.append(r7)
            r6.append(r2)
            r6.append(r1)
            r6.append(r4)
            java.lang.String r1 = r6.toString()
            r0.<init>(r1)
            throw r0
        L_0x00fc:
            r0.rewind()
            goto L_0x0123
        L_0x0100:
            java.lang.RuntimeException r4 = new java.lang.RuntimeException
            long r5 = r0.getLong(r6)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r7 = 57
            r0.<init>(r7)
            java.lang.String r7 = "The version: "
            r0.append(r7)
            r0.append(r5)
            r0.append(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            r4.<init>(r0)
            throw r4
        L_0x0123:
            return r0
        L_0x0124:
            java.io.IOException r1 = new java.io.IOException     // Catch:{ all -> 0x015a }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x015a }
            r3 = 62
            r2.<init>(r3)     // Catch:{ all -> 0x015a }
            java.lang.String r3 = "Length doesn't match: position="
            r2.append(r3)     // Catch:{ all -> 0x015a }
            r2.append(r0)     // Catch:{ all -> 0x015a }
            java.lang.String r0 = ", length="
            r2.append(r0)     // Catch:{ all -> 0x015a }
            r2.append(r11)     // Catch:{ all -> 0x015a }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x015a }
            r1.<init>(r0)     // Catch:{ all -> 0x015a }
            throw r1     // Catch:{ all -> 0x015a }
        L_0x0145:
            r10.put(r0, r6, r1)     // Catch:{ all -> 0x014b }
            goto L_0x007e
        L_0x014b:
            r0 = move-exception
            goto L_0x014e
        L_0x014d:
            r0 = move-exception
        L_0x014e:
            defpackage.ajre.a((java.io.Closeable) r7)     // Catch:{ all -> 0x015a }
            throw r0     // Catch:{ all -> 0x015a }
        L_0x0152:
            r0 = move-exception
            r7 = r10
            goto L_0x0156
        L_0x0155:
            r0 = move-exception
        L_0x0156:
            defpackage.ajre.a((java.io.Closeable) r7)     // Catch:{ all -> 0x015a }
            throw r0     // Catch:{ all -> 0x015a }
        L_0x015a:
            r0 = move-exception
            r7 = r16
        L_0x015d:
            defpackage.ajre.a((java.io.Closeable) r7)
            boolean r1 = defpackage.ajre.a((java.io.Closeable) r9)
            if (r1 != 0) goto L_0x0169
            defpackage.ajre.a((java.io.Closeable) r8)
        L_0x0169:
            goto L_0x016b
        L_0x016a:
            throw r0
        L_0x016b:
            goto L_0x016a
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajrd.a(android.content.Context, java.lang.String, long, long):java.nio.ByteBuffer");
    }
}
