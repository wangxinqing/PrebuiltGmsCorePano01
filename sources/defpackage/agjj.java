package defpackage;

import java.io.File;
import java.util.List;

/* renamed from: agjj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class agjj {
    public final File a;
    private final List b;
    private final int c;
    private final List d;

    public agjj(File file, List list, int i, amzy amzy) {
        this.a = file;
        this.c = i;
        this.d = list;
        this.b = amzy;
    }

    /* JADX WARNING: Removed duplicated region for block: B:49:0x0121  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long a(defpackage.agji r15) {
        /*
            r14 = this;
            basn r0 = defpackage.basn.e
            aucd r0 = r0.o()
            java.lang.String r1 = r15.a
            boolean r2 = r0.c
            r3 = 0
            if (r2 != 0) goto L_0x000e
            goto L_0x0013
        L_0x000e:
            r0.c()
            r0.c = r3
        L_0x0013:
            aucj r2 = r0.b
            basn r2 = (defpackage.basn) r2
            r1.getClass()
            int r4 = r2.a
            r4 = r4 | 1
            r2.a = r4
            r2.b = r1
            r1 = 0
            java.io.File r4 = new java.io.File     // Catch:{ IOException -> 0x0119, SecurityException -> 0x0117 }
            agjj r5 = r15.c     // Catch:{ IOException -> 0x0119, SecurityException -> 0x0117 }
            java.io.File r5 = r5.a     // Catch:{ IOException -> 0x0119, SecurityException -> 0x0117 }
            java.lang.String r6 = r15.a     // Catch:{ IOException -> 0x0119, SecurityException -> 0x0117 }
            r4.<init>(r5, r6)     // Catch:{ IOException -> 0x0119, SecurityException -> 0x0117 }
            java.io.File[] r4 = r4.listFiles()     // Catch:{ IOException -> 0x0119, SecurityException -> 0x0117 }
            int r5 = r15.b     // Catch:{ IOException -> 0x0119, SecurityException -> 0x0117 }
            int r6 = r14.c     // Catch:{ IOException -> 0x0119, SecurityException -> 0x0117 }
            if (r5 >= r6) goto L_0x0112
            java.util.List r5 = r14.d     // Catch:{ IOException -> 0x0119, SecurityException -> 0x0117 }
            int r5 = r5.size()     // Catch:{ IOException -> 0x0119, SecurityException -> 0x0117 }
            r6 = 512(0x200, float:7.175E-43)
            if (r5 >= r6) goto L_0x0112
            int r5 = r4.length     // Catch:{ IOException -> 0x0119, SecurityException -> 0x0117 }
            r7 = 0
        L_0x0045:
            if (r7 >= r5) goto L_0x0116
            r8 = r4[r7]     // Catch:{ IOException -> 0x0110, SecurityException -> 0x010e }
            boolean r9 = defpackage.agjk.a((java.io.File) r8)     // Catch:{ IOException -> 0x0110, SecurityException -> 0x010e }
            if (r9 != 0) goto L_0x0109
            boolean r9 = r8.isFile()     // Catch:{ IOException -> 0x0110, SecurityException -> 0x010e }
            if (r9 == 0) goto L_0x00f4
            java.lang.String r9 = r8.getName()     // Catch:{ IOException -> 0x0110, SecurityException -> 0x010e }
            int r10 = r15.b     // Catch:{ IOException -> 0x0110, SecurityException -> 0x010e }
            if (r10 == 0) goto L_0x0086
            java.lang.String r10 = r15.a     // Catch:{ IOException -> 0x0110, SecurityException -> 0x010e }
            java.lang.String r11 = java.lang.String.valueOf(r10)     // Catch:{ IOException -> 0x0110, SecurityException -> 0x010e }
            int r11 = r11.length()     // Catch:{ IOException -> 0x0110, SecurityException -> 0x010e }
            java.lang.String r12 = java.lang.String.valueOf(r9)     // Catch:{ IOException -> 0x0110, SecurityException -> 0x010e }
            int r12 = r12.length()     // Catch:{ IOException -> 0x0110, SecurityException -> 0x010e }
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0110, SecurityException -> 0x010e }
            int r11 = r11 + 1
            int r11 = r11 + r12
            r13.<init>(r11)     // Catch:{ IOException -> 0x0110, SecurityException -> 0x010e }
            r13.append(r10)     // Catch:{ IOException -> 0x0110, SecurityException -> 0x010e }
            r10 = 47
            r13.append(r10)     // Catch:{ IOException -> 0x0110, SecurityException -> 0x010e }
            r13.append(r9)     // Catch:{ IOException -> 0x0110, SecurityException -> 0x010e }
            java.lang.String r9 = r13.toString()     // Catch:{ IOException -> 0x0110, SecurityException -> 0x010e }
        L_0x0086:
            java.util.List r10 = r14.b     // Catch:{ IOException -> 0x0110, SecurityException -> 0x010e }
            java.util.Iterator r10 = r10.iterator()     // Catch:{ IOException -> 0x0110, SecurityException -> 0x010e }
        L_0x008c:
            boolean r11 = r10.hasNext()     // Catch:{ IOException -> 0x0110, SecurityException -> 0x010e }
            if (r11 == 0) goto L_0x00ee
            java.lang.Object r11 = r10.next()     // Catch:{ IOException -> 0x0110, SecurityException -> 0x010e }
            java.util.regex.Pattern r11 = (java.util.regex.Pattern) r11     // Catch:{ IOException -> 0x0110, SecurityException -> 0x010e }
            java.util.regex.Matcher r11 = r11.matcher(r9)     // Catch:{ IOException -> 0x0110, SecurityException -> 0x010e }
            boolean r11 = r11.matches()     // Catch:{ IOException -> 0x0110, SecurityException -> 0x010e }
            if (r11 == 0) goto L_0x008c
            java.util.List r10 = r14.d     // Catch:{ IOException -> 0x0110, SecurityException -> 0x010e }
            int r10 = r10.size()     // Catch:{ IOException -> 0x0110, SecurityException -> 0x010e }
            if (r10 >= r6) goto L_0x00ee
            basn r10 = defpackage.basn.e     // Catch:{ IOException -> 0x0110, SecurityException -> 0x010e }
            aucd r10 = r10.o()     // Catch:{ IOException -> 0x0110, SecurityException -> 0x010e }
            boolean r11 = r10.c     // Catch:{ IOException -> 0x0110, SecurityException -> 0x010e }
            if (r11 != 0) goto L_0x00b5
            goto L_0x00ba
        L_0x00b5:
            r10.c()     // Catch:{ IOException -> 0x0110, SecurityException -> 0x010e }
            r10.c = r3     // Catch:{ IOException -> 0x0110, SecurityException -> 0x010e }
        L_0x00ba:
            aucj r11 = r10.b     // Catch:{ IOException -> 0x0110, SecurityException -> 0x010e }
            basn r11 = (defpackage.basn) r11     // Catch:{ IOException -> 0x0110, SecurityException -> 0x010e }
            r9.getClass()     // Catch:{ IOException -> 0x0110, SecurityException -> 0x010e }
            int r12 = r11.a     // Catch:{ IOException -> 0x0110, SecurityException -> 0x010e }
            r12 = r12 | 1
            r11.a = r12     // Catch:{ IOException -> 0x0110, SecurityException -> 0x010e }
            r11.b = r9     // Catch:{ IOException -> 0x0110, SecurityException -> 0x010e }
            long r11 = r8.length()     // Catch:{ IOException -> 0x0110, SecurityException -> 0x010e }
            boolean r9 = r10.c     // Catch:{ IOException -> 0x0110, SecurityException -> 0x010e }
            if (r9 != 0) goto L_0x00d2
            goto L_0x00d7
        L_0x00d2:
            r10.c()     // Catch:{ IOException -> 0x0110, SecurityException -> 0x010e }
            r10.c = r3     // Catch:{ IOException -> 0x0110, SecurityException -> 0x010e }
        L_0x00d7:
            aucj r9 = r10.b     // Catch:{ IOException -> 0x0110, SecurityException -> 0x010e }
            basn r9 = (defpackage.basn) r9     // Catch:{ IOException -> 0x0110, SecurityException -> 0x010e }
            int r13 = r9.a     // Catch:{ IOException -> 0x0110, SecurityException -> 0x010e }
            r13 = r13 | 2
            r9.a = r13     // Catch:{ IOException -> 0x0110, SecurityException -> 0x010e }
            r9.d = r11     // Catch:{ IOException -> 0x0110, SecurityException -> 0x010e }
            aucj r9 = r10.i()     // Catch:{ IOException -> 0x0110, SecurityException -> 0x010e }
            basn r9 = (defpackage.basn) r9     // Catch:{ IOException -> 0x0110, SecurityException -> 0x010e }
            java.util.List r10 = r14.d     // Catch:{ IOException -> 0x0110, SecurityException -> 0x010e }
            r10.add(r9)     // Catch:{ IOException -> 0x0110, SecurityException -> 0x010e }
        L_0x00ee:
            long r8 = r8.length()     // Catch:{ IOException -> 0x0110, SecurityException -> 0x010e }
            long r1 = r1 + r8
            goto L_0x010a
        L_0x00f4:
            boolean r9 = r8.isDirectory()     // Catch:{ IOException -> 0x0110, SecurityException -> 0x010e }
            if (r9 == 0) goto L_0x0109
            agji r9 = new agji     // Catch:{ IOException -> 0x0110, SecurityException -> 0x010e }
            java.lang.String r8 = r8.getName()     // Catch:{ IOException -> 0x0110, SecurityException -> 0x010e }
            r9.<init>(r14, r15, r8)     // Catch:{ IOException -> 0x0110, SecurityException -> 0x010e }
            long r8 = r14.a(r9)     // Catch:{ IOException -> 0x0110, SecurityException -> 0x010e }
            long r1 = r1 + r8
            goto L_0x010a
        L_0x0109:
        L_0x010a:
            int r7 = r7 + 1
            goto L_0x0045
        L_0x010e:
            r15 = move-exception
            goto L_0x011a
        L_0x0110:
            r15 = move-exception
            goto L_0x011a
        L_0x0112:
            long r1 = defpackage.agjk.a((java.io.File[]) r4)     // Catch:{ IOException -> 0x0119, SecurityException -> 0x0117 }
        L_0x0116:
            goto L_0x011c
        L_0x0117:
            r15 = move-exception
            goto L_0x011a
        L_0x0119:
            r15 = move-exception
        L_0x011a:
            anhq r15 = defpackage.agjk.a
        L_0x011c:
            boolean r15 = r0.c
            if (r15 != 0) goto L_0x0121
            goto L_0x0126
        L_0x0121:
            r0.c()
            r0.c = r3
        L_0x0126:
            aucj r15 = r0.b
            basn r15 = (defpackage.basn) r15
            int r3 = r15.a
            r3 = r3 | 2
            r15.a = r3
            r15.d = r1
            java.util.List r15 = r14.d
            aucj r0 = r0.i()
            basn r0 = (defpackage.basn) r0
            r15.add(r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.agjj.a(agji):long");
    }
}
