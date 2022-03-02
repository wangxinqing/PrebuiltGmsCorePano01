package defpackage;

import android.content.Context;

/* renamed from: pnr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class pnr {
    public static final Object a = new Object();
    public static pnr e;
    public final Context b;
    public final String c;
    public final String d;

    public pnr(Context context, String str, String str2) {
        this.b = context;
        this.c = str;
        this.d = str2;
    }

    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r1v2, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r1v3, types: [java.io.FileInputStream] */
    /* JADX WARNING: type inference failed for: r1v7 */
    /* JADX WARNING: type inference failed for: r1v8 */
    /* JADX WARNING: type inference failed for: r1v10 */
    /* JADX WARNING: type inference failed for: r1v12 */
    /* JADX WARNING: type inference failed for: r1v13 */
    /* JADX WARNING: type inference failed for: r1v14 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0056 A[SYNTHETIC, Splitter:B:25:0x0056] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0066 A[SYNTHETIC, Splitter:B:34:0x0066] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0077 A[SYNTHETIC, Splitter:B:44:0x0077] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x008d A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List a() {
        /*
            r7 = this;
            java.lang.Object r0 = a
            monitor-enter(r0)
            r1 = 0
            android.content.Context r2 = r7.b     // Catch:{ FileNotFoundException -> 0x0073, IOException -> 0x004b, all -> 0x0049 }
            java.lang.String r3 = r7.c     // Catch:{ FileNotFoundException -> 0x0073, IOException -> 0x004b, all -> 0x0049 }
            java.io.File r2 = r2.getFileStreamPath(r3)     // Catch:{ FileNotFoundException -> 0x0073, IOException -> 0x004b, all -> 0x0049 }
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch:{ FileNotFoundException -> 0x0073, IOException -> 0x004b, all -> 0x0049 }
            r3.<init>(r2)     // Catch:{ FileNotFoundException -> 0x0073, IOException -> 0x004b, all -> 0x0049 }
            long r4 = r2.length()     // Catch:{ FileNotFoundException -> 0x0047, IOException -> 0x0045, all -> 0x0041 }
            int r2 = (int) r4     // Catch:{ FileNotFoundException -> 0x0047, IOException -> 0x0045, all -> 0x0041 }
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.allocate(r2)     // Catch:{ FileNotFoundException -> 0x0047, IOException -> 0x0045, all -> 0x0041 }
            java.nio.channels.FileChannel r4 = r3.getChannel()     // Catch:{ FileNotFoundException -> 0x0047, IOException -> 0x0045, all -> 0x0041 }
            r4.read(r2)     // Catch:{ FileNotFoundException -> 0x0047, IOException -> 0x0045, all -> 0x0041 }
            r2.rewind()     // Catch:{ FileNotFoundException -> 0x0047, IOException -> 0x0045, all -> 0x0041 }
            java.lang.Class<pln> r4 = defpackage.pln.class
            pln r5 = defpackage.pln.e     // Catch:{ FileNotFoundException -> 0x0047, IOException -> 0x0045, all -> 0x0041 }
            r6 = 7
            java.lang.Object r5 = r5.c(r6)     // Catch:{ FileNotFoundException -> 0x0047, IOException -> 0x0045, all -> 0x0041 }
            auef r5 = (defpackage.auef) r5     // Catch:{ FileNotFoundException -> 0x0047, IOException -> 0x0045, all -> 0x0041 }
            r6 = 0
            java.util.List r1 = defpackage.jkw.a((java.nio.ByteBuffer) r2, (java.lang.Class) r4, (defpackage.auef) r5, (boolean) r6)     // Catch:{ FileNotFoundException -> 0x0047, IOException -> 0x0045, all -> 0x0041 }
            r3.close()     // Catch:{ IOException -> 0x0038 }
            goto L_0x0084
        L_0x0038:
            r2 = move-exception
            java.lang.String r2 = "Failed to close stream for %s"
            java.lang.String r3 = r7.c     // Catch:{ all -> 0x007b }
        L_0x003d:
            defpackage.pnz.a((java.lang.String) r2, (java.lang.Object) r3)     // Catch:{ all -> 0x007b }
            goto L_0x0060
        L_0x0041:
            r1 = move-exception
            r2 = r1
            r1 = r3
            goto L_0x0064
        L_0x0045:
            r2 = move-exception
            goto L_0x004d
        L_0x0047:
            r2 = move-exception
            goto L_0x0075
        L_0x0049:
            r2 = move-exception
            goto L_0x0064
        L_0x004b:
            r2 = move-exception
            r3 = r1
        L_0x004d:
            java.lang.String r2 = "Failed to read stream for %s"
            java.lang.String r4 = r7.c     // Catch:{ all -> 0x0061 }
            defpackage.pnz.e(r2, r4)     // Catch:{ all -> 0x0061 }
            if (r3 == 0) goto L_0x0060
            r3.close()     // Catch:{ IOException -> 0x005a }
            goto L_0x0084
        L_0x005a:
            r2 = move-exception
            java.lang.String r2 = "Failed to close stream for %s"
            java.lang.String r3 = r7.c     // Catch:{ all -> 0x007b }
            goto L_0x003d
        L_0x0060:
            goto L_0x0084
        L_0x0061:
            r1 = move-exception
            r2 = r1
            r1 = r3
        L_0x0064:
            if (r1 == 0) goto L_0x0072
            r1.close()     // Catch:{ IOException -> 0x006a }
            goto L_0x0072
        L_0x006a:
            r1 = move-exception
            java.lang.String r1 = "Failed to close stream for %s"
            java.lang.String r3 = r7.c     // Catch:{ all -> 0x007b }
            defpackage.pnz.a((java.lang.String) r1, (java.lang.Object) r3)     // Catch:{ all -> 0x007b }
        L_0x0072:
            throw r2     // Catch:{ all -> 0x007b }
        L_0x0073:
            r2 = move-exception
            r3 = r1
        L_0x0075:
            if (r3 == 0) goto L_0x0083
            r3.close()     // Catch:{ IOException -> 0x007d }
            goto L_0x0084
        L_0x007b:
            r1 = move-exception
            goto L_0x008e
        L_0x007d:
            r2 = move-exception
            java.lang.String r2 = "Failed to close stream for %s"
            java.lang.String r3 = r7.c     // Catch:{ all -> 0x007b }
            goto L_0x003d
        L_0x0083:
        L_0x0084:
            monitor-exit(r0)     // Catch:{ all -> 0x007b }
            if (r1 != 0) goto L_0x008d
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            return r0
        L_0x008d:
            return r1
        L_0x008e:
            monitor-exit(r0)     // Catch:{ all -> 0x007b }
            goto L_0x0091
        L_0x0090:
            throw r1
        L_0x0091:
            goto L_0x0090
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pnr.a():java.util.List");
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0049 A[SYNTHETIC, Splitter:B:25:0x0049] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x005b A[SYNTHETIC, Splitter:B:37:0x005b] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List b() {
        /*
            r8 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.Object r1 = a
            monitor-enter(r1)
            r2 = 0
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch:{ IOException -> 0x0036, all -> 0x0034 }
            java.io.FileReader r4 = new java.io.FileReader     // Catch:{ IOException -> 0x0036, all -> 0x0034 }
            android.content.Context r5 = r8.b     // Catch:{ IOException -> 0x0036, all -> 0x0034 }
            java.lang.String r6 = r8.d     // Catch:{ IOException -> 0x0036, all -> 0x0034 }
            java.io.File r5 = r5.getFileStreamPath(r6)     // Catch:{ IOException -> 0x0036, all -> 0x0034 }
            r4.<init>(r5)     // Catch:{ IOException -> 0x0036, all -> 0x0034 }
            r3.<init>(r4)     // Catch:{ IOException -> 0x0036, all -> 0x0034 }
        L_0x001b:
            java.lang.String r2 = r3.readLine()     // Catch:{ IOException -> 0x0032, all -> 0x002f }
            if (r2 == 0) goto L_0x0025
            r0.add(r2)     // Catch:{ IOException -> 0x0032, all -> 0x002f }
            goto L_0x001b
        L_0x0025:
            r3.close()     // Catch:{ IOException -> 0x0029 }
            goto L_0x0055
        L_0x0029:
            r2 = move-exception
            java.lang.String r2 = "Failed to close component name file %s"
            java.lang.String r3 = r8.d     // Catch:{ all -> 0x0068 }
            goto L_0x0052
        L_0x002f:
            r0 = move-exception
            r2 = r3
            goto L_0x0059
        L_0x0032:
            r2 = move-exception
            goto L_0x003a
        L_0x0034:
            r0 = move-exception
            goto L_0x0059
        L_0x0036:
            r3 = move-exception
            r7 = r3
            r3 = r2
            r2 = r7
        L_0x003a:
            r4 = 1
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ all -> 0x0057 }
            r5 = 0
            java.lang.String r6 = r8.d     // Catch:{ all -> 0x0057 }
            r4[r5] = r6     // Catch:{ all -> 0x0057 }
            java.lang.String r5 = "Failed to read from component name file %s"
            defpackage.pnz.a((java.lang.Throwable) r2, (java.lang.String) r5, (java.lang.Object[]) r4)     // Catch:{ all -> 0x0057 }
            if (r3 == 0) goto L_0x0055
            r3.close()     // Catch:{ IOException -> 0x004d }
            goto L_0x0055
        L_0x004d:
            r2 = move-exception
            java.lang.String r2 = "Failed to close component name file %s"
            java.lang.String r3 = r8.d     // Catch:{ all -> 0x0068 }
        L_0x0052:
            defpackage.pnz.a((java.lang.String) r2, (java.lang.Object) r3)     // Catch:{ all -> 0x0068 }
        L_0x0055:
            monitor-exit(r1)     // Catch:{ all -> 0x0068 }
            return r0
        L_0x0057:
            r0 = move-exception
            r2 = r3
        L_0x0059:
            if (r2 == 0) goto L_0x0067
            r2.close()     // Catch:{ IOException -> 0x005f }
            goto L_0x0067
        L_0x005f:
            r2 = move-exception
            java.lang.String r2 = "Failed to close component name file %s"
            java.lang.String r3 = r8.d     // Catch:{ all -> 0x0068 }
            defpackage.pnz.a((java.lang.String) r2, (java.lang.Object) r3)     // Catch:{ all -> 0x0068 }
        L_0x0067:
            throw r0     // Catch:{ all -> 0x0068 }
        L_0x0068:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0068 }
            goto L_0x006c
        L_0x006b:
            throw r0
        L_0x006c:
            goto L_0x006b
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pnr.b():java.util.List");
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final void a(java.lang.Iterable r8) {
        /*
            r7 = this;
            java.lang.Object r0 = a
            monitor-enter(r0)
            r1 = 0
            r2 = 0
            java.lang.String r3 = "tmp"
            java.lang.String r4 = r7.d     // Catch:{ IOException -> 0x0057, all -> 0x0055 }
            java.io.File r3 = java.io.File.createTempFile(r3, r4)     // Catch:{ IOException -> 0x0057, all -> 0x0055 }
            java.io.PrintWriter r4 = new java.io.PrintWriter     // Catch:{ IOException -> 0x0057, all -> 0x0055 }
            java.io.BufferedWriter r5 = new java.io.BufferedWriter     // Catch:{ IOException -> 0x0057, all -> 0x0055 }
            java.io.FileWriter r6 = new java.io.FileWriter     // Catch:{ IOException -> 0x0057, all -> 0x0055 }
            r6.<init>(r3, r1)     // Catch:{ IOException -> 0x0057, all -> 0x0055 }
            r5.<init>(r6)     // Catch:{ IOException -> 0x0057, all -> 0x0055 }
            r4.<init>(r5)     // Catch:{ IOException -> 0x0057, all -> 0x0055 }
            java.util.Iterator r8 = r8.iterator()     // Catch:{ IOException -> 0x0052, all -> 0x004f }
        L_0x0020:
            boolean r2 = r8.hasNext()     // Catch:{ IOException -> 0x0052, all -> 0x004f }
            if (r2 != 0) goto L_0x0045
            r4.close()     // Catch:{ IOException -> 0x0052, all -> 0x004f }
            android.content.Context r8 = r7.b     // Catch:{ IOException -> 0x0052, all -> 0x004f }
            java.lang.String r2 = r7.d     // Catch:{ IOException -> 0x0052, all -> 0x004f }
            java.io.File r8 = r8.getFileStreamPath(r2)     // Catch:{ IOException -> 0x0052, all -> 0x004f }
            java.lang.Object r2 = a     // Catch:{ IOException -> 0x0052, all -> 0x004f }
            monitor-enter(r2)     // Catch:{ IOException -> 0x0052, all -> 0x004f }
            r3.renameTo(r8)     // Catch:{ all -> 0x0042 }
            monitor-exit(r2)     // Catch:{ all -> 0x0042 }
            r4.close()     // Catch:{ RuntimeException -> 0x003c }
            goto L_0x006d
        L_0x003c:
            r8 = move-exception
            java.lang.String r8 = "Failed to close file %s"
            java.lang.String r1 = r7.d     // Catch:{ all -> 0x007f }
            goto L_0x006a
        L_0x0042:
            r8 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0042 }
            throw r8     // Catch:{ IOException -> 0x0052, all -> 0x004f }
        L_0x0045:
            java.lang.Object r2 = r8.next()     // Catch:{ IOException -> 0x0052, all -> 0x004f }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ IOException -> 0x0052, all -> 0x004f }
            r4.println(r2)     // Catch:{ IOException -> 0x0052, all -> 0x004f }
            goto L_0x0020
        L_0x004f:
            r8 = move-exception
            r2 = r4
            goto L_0x0070
        L_0x0052:
            r8 = move-exception
            r2 = r4
            goto L_0x0058
        L_0x0055:
            r8 = move-exception
            goto L_0x0070
        L_0x0057:
            r8 = move-exception
        L_0x0058:
            java.lang.String r3 = "Failed to open Apps corpus file."
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ all -> 0x006f }
            defpackage.pnz.a((java.lang.Throwable) r8, (java.lang.String) r3, (java.lang.Object[]) r1)     // Catch:{ all -> 0x006f }
            if (r2 == 0) goto L_0x006d
            r2.close()     // Catch:{ RuntimeException -> 0x0065 }
            goto L_0x006d
        L_0x0065:
            r8 = move-exception
            java.lang.String r8 = "Failed to close file %s"
            java.lang.String r1 = r7.d     // Catch:{ all -> 0x007f }
        L_0x006a:
            defpackage.pnz.a((java.lang.String) r8, (java.lang.Object) r1)     // Catch:{ all -> 0x007f }
        L_0x006d:
            monitor-exit(r0)     // Catch:{ all -> 0x007f }
            return
        L_0x006f:
            r8 = move-exception
        L_0x0070:
            if (r2 == 0) goto L_0x007e
            r2.close()     // Catch:{ RuntimeException -> 0x0076 }
            goto L_0x007e
        L_0x0076:
            r1 = move-exception
            java.lang.String r1 = "Failed to close file %s"
            java.lang.String r2 = r7.d     // Catch:{ all -> 0x007f }
            defpackage.pnz.a((java.lang.String) r1, (java.lang.Object) r2)     // Catch:{ all -> 0x007f }
        L_0x007e:
            throw r8     // Catch:{ all -> 0x007f }
        L_0x007f:
            r8 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x007f }
            goto L_0x0083
        L_0x0082:
            throw r8
        L_0x0083:
            goto L_0x0082
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pnr.a(java.lang.Iterable):void");
    }

    /* JADX WARNING: type inference failed for: r9v0, types: [java.util.List, java.lang.Iterable] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x008b A[SYNTHETIC, Splitter:B:30:0x008b] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x009c A[SYNTHETIC, Splitter:B:41:0x009c] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.lang.Iterable r9, int r10, long r11) {
        /*
            r8 = this;
            amzt r0 = new amzt
            r0.<init>()
            int r1 = r9.size()
            r2 = 0
            r3 = 0
        L_0x000b:
            if (r3 >= r1) goto L_0x004f
            java.lang.Object r4 = r9.get(r3)
            java.lang.String r4 = (java.lang.String) r4
            r5 = 1
            long r11 = r11 + r5
            pln r5 = defpackage.pln.e
            aucd r5 = r5.o()
            boolean r6 = r5.c
            if (r6 != 0) goto L_0x0021
            goto L_0x0026
        L_0x0021:
            r5.c()
            r5.c = r2
        L_0x0026:
            aucj r6 = r5.b
            pln r6 = (defpackage.pln) r6
            r4.getClass()
            int r7 = r6.a
            r7 = r7 | 2
            r6.a = r7
            r6.c = r4
            int r4 = r10 + -1
            r6.b = r4
            r4 = r7 | 1
            r6.a = r4
            r4 = r4 | 4
            r6.a = r4
            r6.d = r11
            aucj r4 = r5.i()
            pln r4 = (defpackage.pln) r4
            r0.c(r4)
            int r3 = r3 + 1
            goto L_0x000b
        L_0x004f:
            amzy r9 = r0.a()
            java.nio.ByteBuffer r9 = defpackage.jkw.a(r9, r2)
            if (r9 == 0) goto L_0x00ac
            java.lang.Object r10 = a
            monitor-enter(r10)
            r11 = 0
            android.content.Context r12 = r8.b     // Catch:{ IOException -> 0x0081, all -> 0x007f }
            java.lang.String r0 = r8.c     // Catch:{ IOException -> 0x0081, all -> 0x007f }
            r1 = 32768(0x8000, float:4.5918E-41)
            java.io.FileOutputStream r11 = r12.openFileOutput(r0, r1)     // Catch:{ IOException -> 0x0081, all -> 0x007f }
            java.nio.channels.FileChannel r12 = r11.getChannel()     // Catch:{ IOException -> 0x007d, all -> 0x007b }
            r12.write(r9)     // Catch:{ IOException -> 0x007d, all -> 0x007b }
            if (r11 == 0) goto L_0x0097
            r11.close()     // Catch:{ IOException -> 0x0075 }
            goto L_0x0097
        L_0x0075:
            r9 = move-exception
            java.lang.String r9 = "Failed to close stream for %s"
            java.lang.String r11 = r8.c     // Catch:{ all -> 0x00a9 }
            goto L_0x0094
        L_0x007b:
            r9 = move-exception
            goto L_0x009a
        L_0x007d:
            r9 = move-exception
            goto L_0x0082
        L_0x007f:
            r9 = move-exception
            goto L_0x009a
        L_0x0081:
            r9 = move-exception
        L_0x0082:
            java.lang.String r12 = "Failed to open Apps corpus file."
            java.lang.Object[] r0 = new java.lang.Object[r2]     // Catch:{ all -> 0x0099 }
            defpackage.pnz.a((java.lang.Throwable) r9, (java.lang.String) r12, (java.lang.Object[]) r0)     // Catch:{ all -> 0x0099 }
            if (r11 == 0) goto L_0x0097
            r11.close()     // Catch:{ IOException -> 0x008f }
            goto L_0x0097
        L_0x008f:
            r9 = move-exception
            java.lang.String r9 = "Failed to close stream for %s"
            java.lang.String r11 = r8.c     // Catch:{ all -> 0x00a9 }
        L_0x0094:
            defpackage.pnz.a((java.lang.String) r9, (java.lang.Object) r11)     // Catch:{ all -> 0x00a9 }
        L_0x0097:
            monitor-exit(r10)     // Catch:{ all -> 0x00a9 }
            return
        L_0x0099:
            r9 = move-exception
        L_0x009a:
            if (r11 == 0) goto L_0x00a8
            r11.close()     // Catch:{ IOException -> 0x00a0 }
            goto L_0x00a8
        L_0x00a0:
            r11 = move-exception
            java.lang.String r11 = "Failed to close stream for %s"
            java.lang.String r12 = r8.c     // Catch:{ all -> 0x00a9 }
            defpackage.pnz.a((java.lang.String) r11, (java.lang.Object) r12)     // Catch:{ all -> 0x00a9 }
        L_0x00a8:
            throw r9     // Catch:{ all -> 0x00a9 }
        L_0x00a9:
            r9 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x00a9 }
            throw r9
        L_0x00ac:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pnr.a(java.lang.Iterable, int, long):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:41:0x006a A[SYNTHETIC, Splitter:B:41:0x006a] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.util.List r5) {
        /*
            r4 = this;
            int r0 = r5.size()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r1 = "replaceAllEntries size %d"
            defpackage.pnz.a((java.lang.String) r1, (java.lang.Object) r0)
            r0 = 0
            java.nio.ByteBuffer r5 = defpackage.jkw.a(r5, r0)
            if (r5 == 0) goto L_0x0077
            r1 = 0
            java.lang.String r2 = "tmp"
            java.lang.String r3 = r4.c     // Catch:{ IOException -> 0x0054, all -> 0x0052 }
            java.io.File r2 = java.io.File.createTempFile(r2, r3)     // Catch:{ IOException -> 0x0054, all -> 0x0052 }
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x0054, all -> 0x0052 }
            r3.<init>(r2)     // Catch:{ IOException -> 0x0054, all -> 0x0052 }
            java.nio.channels.FileChannel r1 = r3.getChannel()     // Catch:{ IOException -> 0x004f, all -> 0x004c }
            r1.write(r5)     // Catch:{ IOException -> 0x004f, all -> 0x004c }
            r3.close()     // Catch:{ IOException -> 0x004f, all -> 0x004c }
            android.content.Context r5 = r4.b     // Catch:{ IOException -> 0x004f, all -> 0x004c }
            java.lang.String r1 = r4.c     // Catch:{ IOException -> 0x004f, all -> 0x004c }
            java.io.File r5 = r5.getFileStreamPath(r1)     // Catch:{ IOException -> 0x004f, all -> 0x004c }
            java.lang.Object r1 = a     // Catch:{ IOException -> 0x004f, all -> 0x004c }
            monitor-enter(r1)     // Catch:{ IOException -> 0x004f, all -> 0x004c }
            r2.renameTo(r5)     // Catch:{ all -> 0x0049 }
            monitor-exit(r1)     // Catch:{ all -> 0x0049 }
            r3.close()     // Catch:{ IOException -> 0x003f }
            return
        L_0x003f:
            r5 = move-exception
            java.lang.String r5 = r4.c
        L_0x0043:
            java.lang.String r0 = "Failed to close stream for %s"
            defpackage.pnz.a((java.lang.String) r0, (java.lang.Object) r5)
            return
        L_0x0049:
            r5 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0049 }
            throw r5     // Catch:{ IOException -> 0x004f, all -> 0x004c }
        L_0x004c:
            r5 = move-exception
            r1 = r3
            goto L_0x0068
        L_0x004f:
            r5 = move-exception
            r1 = r3
            goto L_0x0055
        L_0x0052:
            r5 = move-exception
            goto L_0x0068
        L_0x0054:
            r5 = move-exception
        L_0x0055:
            java.lang.String r2 = "Failed to write entries to Apps corpus file."
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch:{ all -> 0x0067 }
            defpackage.pnz.a((java.lang.Throwable) r5, (java.lang.String) r2, (java.lang.Object[]) r0)     // Catch:{ all -> 0x0067 }
            if (r1 == 0) goto L_0x0066
            r1.close()     // Catch:{ IOException -> 0x0062 }
            return
        L_0x0062:
            r5 = move-exception
            java.lang.String r5 = r4.c
            goto L_0x0043
        L_0x0066:
            return
        L_0x0067:
            r5 = move-exception
        L_0x0068:
            if (r1 == 0) goto L_0x0076
            r1.close()     // Catch:{ IOException -> 0x006e }
            goto L_0x0076
        L_0x006e:
            r0 = move-exception
            java.lang.String r0 = r4.c
            java.lang.String r1 = "Failed to close stream for %s"
            defpackage.pnz.a((java.lang.String) r1, (java.lang.Object) r0)
        L_0x0076:
            throw r5
        L_0x0077:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pnr.a(java.util.List):void");
    }
}
