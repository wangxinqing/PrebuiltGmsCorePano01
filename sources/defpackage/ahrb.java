package defpackage;

import java.io.DataInputStream;
import java.io.IOException;

/* renamed from: ahrb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ahrb {
    private final String a;
    private long b = -1;
    private DataInputStream c;
    private int d = 0;
    private boolean e = false;
    private Integer f;
    private final aiab g;

    public ahrb(String str, aiab aiab) {
        this.a = str;
        this.g = aiab;
    }

    private final void c() {
        try {
            b();
        } catch (IOException e2) {
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0053, code lost:
        if (r0.intValue() != 3) goto L_0x0055;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x009a, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00b0, code lost:
        c();
        r1 = java.lang.String.valueOf(r8.a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00c1, code lost:
        if (r1.length() == 0) goto L_0x00c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00c3, code lost:
        r1 = new java.lang.String("Unexpected end of file ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00c9, code lost:
        r1 = "Unexpected end of file ".concat(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00d0, code lost:
        throw new defpackage.ahra(r1);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00af A[Catch:{ EOFException -> 0x00af }, ExcHandler: EOFException (e java.io.EOFException), Splitter:B:12:0x0049] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized byte[] a() {
        /*
            r8 = this;
            monitor-enter(r8)
            long r0 = r8.b     // Catch:{ all -> 0x00d3 }
            r2 = -1
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L_0x0044
            java.io.File r0 = new java.io.File     // Catch:{ all -> 0x00d3 }
            java.lang.String r1 = r8.a     // Catch:{ all -> 0x00d3 }
            r0.<init>(r1)     // Catch:{ all -> 0x00d3 }
            boolean r1 = r0.exists()     // Catch:{ all -> 0x00d3 }
            r2 = 0
            if (r1 == 0) goto L_0x0031
            java.io.DataInputStream r1 = new java.io.DataInputStream     // Catch:{ all -> 0x00d3 }
            java.io.BufferedInputStream r3 = new java.io.BufferedInputStream     // Catch:{ all -> 0x00d3 }
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch:{ all -> 0x00d3 }
            r4.<init>(r0)     // Catch:{ all -> 0x00d3 }
            r3.<init>(r4)     // Catch:{ all -> 0x00d3 }
            r1.<init>(r3)     // Catch:{ all -> 0x00d3 }
            r8.c = r1     // Catch:{ all -> 0x00d3 }
            r8.e = r2     // Catch:{ all -> 0x00d3 }
            long r0 = r0.length()     // Catch:{ all -> 0x00d3 }
            r8.b = r0     // Catch:{ all -> 0x00d3 }
            goto L_0x0044
        L_0x0031:
            java.io.FileNotFoundException r0 = new java.io.FileNotFoundException     // Catch:{ all -> 0x00d3 }
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ all -> 0x00d3 }
            java.lang.String r3 = r8.a     // Catch:{ all -> 0x00d3 }
            r1[r2] = r3     // Catch:{ all -> 0x00d3 }
            java.lang.String r2 = "Could not found file %s."
            java.lang.String r1 = java.lang.String.format(r2, r1)     // Catch:{ all -> 0x00d3 }
            r0.<init>(r1)     // Catch:{ all -> 0x00d3 }
            throw r0     // Catch:{ all -> 0x00d3 }
        L_0x0044:
            boolean r0 = r8.e     // Catch:{ all -> 0x00d3 }
            r1 = 0
            if (r0 != 0) goto L_0x00d1
            java.lang.Integer r0 = r8.f     // Catch:{ EOFException -> 0x00af, IOException -> 0x00aa }
            r2 = 3
            if (r0 != 0) goto L_0x004f
            goto L_0x0055
        L_0x004f:
            int r0 = r0.intValue()     // Catch:{ EOFException -> 0x00af, IOException -> 0x00aa }
            if (r0 == r2) goto L_0x007a
        L_0x0055:
            java.io.DataInputStream r0 = r8.c     // Catch:{ EOFException -> 0x00af, IOException -> 0x00aa }
            int r0 = r0.readInt()     // Catch:{ EOFException -> 0x00af, IOException -> 0x00aa }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ EOFException -> 0x00af, IOException -> 0x00aa }
            r8.f = r0     // Catch:{ EOFException -> 0x00af, IOException -> 0x00aa }
            int r3 = r8.d     // Catch:{ EOFException -> 0x00af, IOException -> 0x00aa }
            int r3 = r3 + 4
            r8.d = r3     // Catch:{ EOFException -> 0x00af, IOException -> 0x00aa }
            long r3 = (long) r3     // Catch:{ EOFException -> 0x00af, IOException -> 0x00aa }
            long r5 = r8.b     // Catch:{ EOFException -> 0x00af, IOException -> 0x00aa }
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x0075
            int r0 = r0.intValue()     // Catch:{ EOFException -> 0x00af, IOException -> 0x00aa }
            if (r0 < r2) goto L_0x0075
            goto L_0x007a
        L_0x0075:
            r8.c()     // Catch:{ EOFException -> 0x00af, IOException -> 0x00aa }
            monitor-exit(r8)
            return r1
        L_0x007a:
            aiab r0 = r8.g     // Catch:{ EOFException -> 0x00af }
            java.io.DataInputStream r1 = r8.c     // Catch:{ EOFException -> 0x00af }
            aiaa r0 = r0.a((java.io.DataInputStream) r1)     // Catch:{ EOFException -> 0x00af }
            byte[] r1 = r0.b     // Catch:{ IOException -> 0x009b }
            int r0 = r0.a     // Catch:{ IOException -> 0x009b }
            byte[] r1 = defpackage.ahvx.b((byte[]) r1)     // Catch:{ EOFException -> 0x00af }
            int r2 = r8.d     // Catch:{ EOFException -> 0x00af, IOException -> 0x00aa }
            int r2 = r2 + r0
            r8.d = r2     // Catch:{ EOFException -> 0x00af, IOException -> 0x00aa }
            long r2 = (long) r2     // Catch:{ EOFException -> 0x00af, IOException -> 0x00aa }
            long r4 = r8.b     // Catch:{ EOFException -> 0x00af, IOException -> 0x00aa }
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 != 0) goto L_0x0099
            r8.c()     // Catch:{ EOFException -> 0x00af, IOException -> 0x00aa }
        L_0x0099:
            monitor-exit(r8)
            return r1
        L_0x009b:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()     // Catch:{ EOFException -> 0x00af, IOException -> 0x00aa }
            ahra r1 = new ahra     // Catch:{ EOFException -> 0x00af, IOException -> 0x00aa }
            if (r0 != 0) goto L_0x00a6
            java.lang.String r0 = ""
        L_0x00a6:
            r1.<init>(r0)     // Catch:{ EOFException -> 0x00af, IOException -> 0x00aa }
            throw r1     // Catch:{ EOFException -> 0x00af, IOException -> 0x00aa }
        L_0x00aa:
            r0 = move-exception
            r8.c()     // Catch:{ all -> 0x00d3 }
            throw r0     // Catch:{ all -> 0x00d3 }
        L_0x00af:
            r0 = move-exception
            r8.c()     // Catch:{ all -> 0x00d3 }
            ahra r0 = new ahra     // Catch:{ all -> 0x00d3 }
            java.lang.String r1 = r8.a     // Catch:{ all -> 0x00d3 }
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x00d3 }
            java.lang.String r2 = "Unexpected end of file "
            int r3 = r1.length()     // Catch:{ all -> 0x00d3 }
            if (r3 != 0) goto L_0x00c9
            java.lang.String r1 = new java.lang.String     // Catch:{ all -> 0x00d3 }
            r1.<init>(r2)     // Catch:{ all -> 0x00d3 }
            goto L_0x00cd
        L_0x00c9:
            java.lang.String r1 = r2.concat(r1)     // Catch:{ all -> 0x00d3 }
        L_0x00cd:
            r0.<init>(r1)     // Catch:{ all -> 0x00d3 }
            throw r0     // Catch:{ all -> 0x00d3 }
        L_0x00d1:
            monitor-exit(r8)
            return r1
        L_0x00d3:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahrb.a():byte[]");
    }

    public final void b() {
        DataInputStream dataInputStream;
        if (!this.e && (dataInputStream = this.c) != null) {
            dataInputStream.close();
            this.e = true;
        }
    }
}
