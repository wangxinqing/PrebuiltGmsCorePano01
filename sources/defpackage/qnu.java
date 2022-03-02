package defpackage;

import android.content.Context;

/* renamed from: qnu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qnu {
    public static final Object a = new Object();
    public final Context b;

    public qnu(Context context) {
        this.b = context;
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x004d A[SYNTHETIC, Splitter:B:26:0x004d] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x005e A[SYNTHETIC, Splitter:B:36:0x005e] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.Set a() {
        /*
            r10 = this;
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            java.lang.Object r1 = a
            monitor-enter(r1)
            r2 = 0
            r3 = 1
            r4 = 0
            java.io.BufferedReader r5 = new java.io.BufferedReader     // Catch:{ IOException -> 0x0040, all -> 0x003e }
            java.io.FileReader r6 = new java.io.FileReader     // Catch:{ IOException -> 0x0040, all -> 0x003e }
            android.content.Context r7 = r10.b     // Catch:{ IOException -> 0x0040, all -> 0x003e }
            java.lang.String r8 = "apps_3p_corpus_component_names.txt"
            java.io.File r7 = r7.getFileStreamPath(r8)     // Catch:{ IOException -> 0x0040, all -> 0x003e }
            r6.<init>(r7)     // Catch:{ IOException -> 0x0040, all -> 0x003e }
            r5.<init>(r6)     // Catch:{ IOException -> 0x0040, all -> 0x003e }
        L_0x001d:
            java.lang.String r2 = r5.readLine()     // Catch:{ IOException -> 0x003c, all -> 0x0039 }
            if (r2 == 0) goto L_0x002d
            android.content.ComponentName r2 = android.content.ComponentName.unflattenFromString(r2)     // Catch:{ IOException -> 0x003c, all -> 0x0039 }
            if (r2 == 0) goto L_0x001d
            r0.add(r2)     // Catch:{ IOException -> 0x003c, all -> 0x0039 }
            goto L_0x001d
        L_0x002d:
            r5.close()     // Catch:{ IOException -> 0x0031 }
            goto L_0x0058
        L_0x0031:
            r2 = move-exception
            java.lang.Object[] r2 = new java.lang.Object[r3]     // Catch:{ all -> 0x006a }
            java.lang.String r3 = "apps_3p_corpus_component_names.txt"
            r2[r4] = r3     // Catch:{ all -> 0x006a }
            goto L_0x0058
        L_0x0039:
            r0 = move-exception
            r2 = r5
            goto L_0x005c
        L_0x003c:
            r2 = move-exception
            goto L_0x0044
        L_0x003e:
            r0 = move-exception
            goto L_0x005c
        L_0x0040:
            r5 = move-exception
            r9 = r5
            r5 = r2
            r2 = r9
        L_0x0044:
            java.lang.String r6 = "Failed to read from component name file apps_3p_corpus_component_names.txt"
            java.lang.Object[] r7 = new java.lang.Object[r4]     // Catch:{ all -> 0x005a }
            defpackage.qoi.b(r2, r6, r7)     // Catch:{ all -> 0x005a }
            if (r5 == 0) goto L_0x0058
            r5.close()     // Catch:{ IOException -> 0x0051 }
            goto L_0x0058
        L_0x0051:
            r2 = move-exception
            java.lang.Object[] r2 = new java.lang.Object[r3]     // Catch:{ all -> 0x006a }
            java.lang.String r3 = "apps_3p_corpus_component_names.txt"
            r2[r4] = r3     // Catch:{ all -> 0x006a }
        L_0x0058:
            monitor-exit(r1)     // Catch:{ all -> 0x006a }
            return r0
        L_0x005a:
            r0 = move-exception
            r2 = r5
        L_0x005c:
            if (r2 == 0) goto L_0x0069
            r2.close()     // Catch:{ IOException -> 0x0062 }
            goto L_0x0069
        L_0x0062:
            r2 = move-exception
            java.lang.Object[] r2 = new java.lang.Object[r3]     // Catch:{ all -> 0x006a }
            java.lang.String r3 = "apps_3p_corpus_component_names.txt"
            r2[r4] = r3     // Catch:{ all -> 0x006a }
        L_0x0069:
            throw r0     // Catch:{ all -> 0x006a }
        L_0x006a:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x006a }
            goto L_0x006e
        L_0x006d:
            throw r0
        L_0x006e:
            goto L_0x006d
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qnu.a():java.util.Set");
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final void a(java.lang.Iterable r9) {
        /*
            r8 = this;
            java.lang.Object r0 = a
            monitor-enter(r0)
            r1 = 0
            r2 = 1
            r3 = 0
            java.lang.String r4 = "tmp"
            java.lang.String r5 = "apps_3p_corpus_component_names.txt"
            java.io.File r4 = java.io.File.createTempFile(r4, r5)     // Catch:{ IOException -> 0x005e, all -> 0x005c }
            java.io.PrintWriter r5 = new java.io.PrintWriter     // Catch:{ IOException -> 0x005e, all -> 0x005c }
            java.io.BufferedWriter r6 = new java.io.BufferedWriter     // Catch:{ IOException -> 0x005e, all -> 0x005c }
            java.io.FileWriter r7 = new java.io.FileWriter     // Catch:{ IOException -> 0x005e, all -> 0x005c }
            r7.<init>(r4, r3)     // Catch:{ IOException -> 0x005e, all -> 0x005c }
            r6.<init>(r7)     // Catch:{ IOException -> 0x005e, all -> 0x005c }
            r5.<init>(r6)     // Catch:{ IOException -> 0x005e, all -> 0x005c }
            java.util.Iterator r9 = r9.iterator()     // Catch:{ IOException -> 0x0059, all -> 0x0056 }
        L_0x0021:
            boolean r1 = r9.hasNext()     // Catch:{ IOException -> 0x0059, all -> 0x0056 }
            if (r1 != 0) goto L_0x0048
            r5.close()     // Catch:{ IOException -> 0x0059, all -> 0x0056 }
            android.content.Context r9 = r8.b     // Catch:{ IOException -> 0x0059, all -> 0x0056 }
            java.lang.String r1 = "apps_3p_corpus_component_names.txt"
            java.io.File r9 = r9.getFileStreamPath(r1)     // Catch:{ IOException -> 0x0059, all -> 0x0056 }
            java.lang.Object r1 = a     // Catch:{ IOException -> 0x0059, all -> 0x0056 }
            monitor-enter(r1)     // Catch:{ IOException -> 0x0059, all -> 0x0056 }
            r4.renameTo(r9)     // Catch:{ all -> 0x0045 }
            monitor-exit(r1)     // Catch:{ all -> 0x0045 }
            r5.close()     // Catch:{ RuntimeException -> 0x003d }
            goto L_0x0073
        L_0x003d:
            r9 = move-exception
            java.lang.Object[] r9 = new java.lang.Object[r2]     // Catch:{ all -> 0x0084 }
            java.lang.String r1 = "apps_3p_corpus_component_names.txt"
            r9[r3] = r1     // Catch:{ all -> 0x0084 }
            goto L_0x0073
        L_0x0045:
            r9 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0045 }
            throw r9     // Catch:{ IOException -> 0x0059, all -> 0x0056 }
        L_0x0048:
            java.lang.Object r1 = r9.next()     // Catch:{ IOException -> 0x0059, all -> 0x0056 }
            android.content.ComponentName r1 = (android.content.ComponentName) r1     // Catch:{ IOException -> 0x0059, all -> 0x0056 }
            java.lang.String r1 = r1.flattenToString()     // Catch:{ IOException -> 0x0059, all -> 0x0056 }
            r5.println(r1)     // Catch:{ IOException -> 0x0059, all -> 0x0056 }
            goto L_0x0021
        L_0x0056:
            r9 = move-exception
            r1 = r5
            goto L_0x0076
        L_0x0059:
            r9 = move-exception
            r1 = r5
            goto L_0x005f
        L_0x005c:
            r9 = move-exception
            goto L_0x0076
        L_0x005e:
            r9 = move-exception
        L_0x005f:
            java.lang.String r4 = "Failed to open Apps corpus file."
            java.lang.Object[] r5 = new java.lang.Object[r3]     // Catch:{ all -> 0x0075 }
            defpackage.qoi.b(r9, r4, r5)     // Catch:{ all -> 0x0075 }
            if (r1 == 0) goto L_0x0073
            r1.close()     // Catch:{ RuntimeException -> 0x006c }
            goto L_0x0073
        L_0x006c:
            r9 = move-exception
            java.lang.Object[] r9 = new java.lang.Object[r2]     // Catch:{ all -> 0x0084 }
            java.lang.String r1 = "apps_3p_corpus_component_names.txt"
            r9[r3] = r1     // Catch:{ all -> 0x0084 }
        L_0x0073:
            monitor-exit(r0)     // Catch:{ all -> 0x0084 }
            return
        L_0x0075:
            r9 = move-exception
        L_0x0076:
            if (r1 == 0) goto L_0x0083
            r1.close()     // Catch:{ RuntimeException -> 0x007c }
            goto L_0x0083
        L_0x007c:
            r1 = move-exception
            java.lang.Object[] r1 = new java.lang.Object[r2]     // Catch:{ all -> 0x0084 }
            java.lang.String r2 = "apps_3p_corpus_component_names.txt"
            r1[r3] = r2     // Catch:{ all -> 0x0084 }
        L_0x0083:
            throw r9     // Catch:{ all -> 0x0084 }
        L_0x0084:
            r9 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0084 }
            goto L_0x0088
        L_0x0087:
            throw r9
        L_0x0088:
            goto L_0x0087
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qnu.a(java.lang.Iterable):void");
    }
}
