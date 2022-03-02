package defpackage;

import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: agew  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class agew {
    private static final anhq a = anhq.a("agew");
    private static final Set b = anax.a("googleapis.com", "adwords.google.com", "m.google.com", "sandbox.google.com");
    private static final Pattern c = Pattern.compile("(?:[^\\/]*\\/)([^;]*)");
    private static final Pattern d = Pattern.compile("([^\\?]+)(\\?+)");
    private static final Pattern e = Pattern.compile("((?:https?:\\/\\/|)[a-zA-Z0-9-_\\.]+(?::\\d+)?)(.*)?");
    private static final Pattern f = Pattern.compile("([a-zA-Z0-9-_]+)");
    private static final Pattern g = Pattern.compile("\\b([0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3})(:\\d{1,5})?\\b");
    private final boolean h;
    private final agiq i;
    private final amri j;

    public agew(amri amri) {
        this.h = ((aghj) amri.b()).d();
        this.i = ((aghj) amri.b()).c();
        this.j = ((aghj) amri.b()).e();
    }

    static String a(String str) {
        Matcher matcher = e.matcher(str);
        if (matcher.matches()) {
            return matcher.group(1);
        }
        return null;
    }

    static String b(String str) {
        if (str == null) {
            return null;
        }
        Matcher matcher = g.matcher(str);
        return matcher.find() ? matcher.replaceFirst("<ip>") : str;
    }

    static String c(String str) {
        if (str != null && !str.isEmpty()) {
            Matcher matcher = c.matcher(str);
            if (matcher.find()) {
                return matcher.group(0);
            }
            ((anhn) ((anhn) a.c()).a("agew", "c", 344, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("contentType extraction failed for %s, skipping logging path", (Object) str);
        }
        return null;
    }

    static String a(String str, agiq agiq, boolean z) {
        boolean z2;
        if (str.isEmpty()) {
            return null;
        }
        if (agiq != null && !z) {
            str = agiq.a();
        }
        if (!z) {
            String a2 = a(str);
            if (a2 != null) {
                str = a2;
                z2 = true;
            } else {
                z2 = false;
            }
        } else {
            z2 = true;
        }
        Matcher matcher = d.matcher(str);
        if (matcher.find()) {
            str = matcher.group(1);
            z2 = true;
        }
        String b2 = b(str);
        if (b2 != null && !b2.equals(str)) {
            z2 = true;
        }
        Matcher matcher2 = g.matcher(b2);
        if (matcher2.find()) {
            b2 = matcher2.replaceFirst("<ip>");
            z2 = true;
        }
        if (z2) {
            return b2;
        }
        Matcher matcher3 = f.matcher(b2);
        if (!matcher3.find()) {
            return null;
        }
        return matcher3.group(1);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00e7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.basu a(defpackage.agev... r15) {
        /*
            r14 = this;
            baro r0 = defpackage.baro.b
            aucd r0 = r0.o()
            r1 = 0
            r2 = 0
        L_0x0008:
            int r3 = r15.length
            java.lang.String r4 = ":com.google.android.gms@201216073@20.12.16 (080306-306753009)"
            java.lang.String r5 = "agew"
            if (r2 >= r3) goto L_0x0326
            barn r3 = defpackage.barn.w
            aucd r3 = r3.o()
            r6 = r15[r2]
            int r6 = r6.e
            if (r6 <= 0) goto L_0x0031
            boolean r7 = r3.c
            if (r7 != 0) goto L_0x0020
            goto L_0x0025
        L_0x0020:
            r3.c()
            r3.c = r1
        L_0x0025:
            aucj r7 = r3.b
            barn r7 = (defpackage.barn) r7
            int r8 = r7.a
            r8 = r8 | 128(0x80, float:1.794E-43)
            r7.a = r8
            r7.i = r6
        L_0x0031:
            r6 = r15[r2]
            int r6 = r6.d
            if (r6 <= 0) goto L_0x004d
            boolean r7 = r3.c
            if (r7 != 0) goto L_0x003c
            goto L_0x0041
        L_0x003c:
            r3.c()
            r3.c = r1
        L_0x0041:
            aucj r7 = r3.b
            barn r7 = (defpackage.barn) r7
            int r8 = r7.a
            r8 = r8 | 64
            r7.a = r8
            r7.h = r6
        L_0x004d:
            r6 = r15[r2]
            long r6 = r6.c
            r8 = 0
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r10 <= 0) goto L_0x006e
            int r7 = (int) r6
            boolean r6 = r3.c
            if (r6 != 0) goto L_0x005d
            goto L_0x0062
        L_0x005d:
            r3.c()
            r3.c = r1
        L_0x0062:
            aucj r6 = r3.b
            barn r6 = (defpackage.barn) r6
            int r10 = r6.a
            r10 = r10 | 8
            r6.a = r10
            r6.e = r7
        L_0x006e:
            r6 = r15[r2]
            long r6 = r6.b
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r10 <= 0) goto L_0x008d
            int r7 = (int) r6
            boolean r6 = r3.c
            if (r6 != 0) goto L_0x007c
            goto L_0x0081
        L_0x007c:
            r3.c()
            r3.c = r1
        L_0x0081:
            aucj r6 = r3.b
            barn r6 = (defpackage.barn) r6
            int r10 = r6.a
            r10 = r10 | 16
            r6.a = r10
            r6.f = r7
        L_0x008d:
            r6 = r15[r2]
            int r6 = r6.j
            boolean r7 = r3.c
            if (r7 != 0) goto L_0x0096
            goto L_0x009b
        L_0x0096:
            r3.c()
            r3.c = r1
        L_0x009b:
            aucj r7 = r3.b
            barn r7 = (defpackage.barn) r7
            int r10 = r7.a
            r10 = r10 | 32
            r7.a = r10
            r7.g = r6
            r6 = r15[r2]
            int r7 = r6.t
            java.lang.String r6 = r6.k
            r7 = 1
            r10 = 0
            if (r6 == 0) goto L_0x00fa
            boolean r11 = r6.isEmpty()
            if (r11 != 0) goto L_0x00e0
            java.util.regex.Pattern r11 = c
            java.util.regex.Matcher r11 = r11.matcher(r6)
            boolean r12 = r11.find()
            if (r12 == 0) goto L_0x00c8
            java.lang.String r4 = r11.group(r1)
            goto L_0x00e2
        L_0x00c8:
            anhq r11 = a
            anie r11 = r11.c()
            anhn r11 = (defpackage.anhn) r11
            r12 = 344(0x158, float:4.82E-43)
            java.lang.String r13 = "c"
            anie r4 = r11.a((java.lang.String) r5, (java.lang.String) r13, (int) r12, (java.lang.String) r4)
            anhn r4 = (defpackage.anhn) r4
            java.lang.String r5 = "contentType extraction failed for %s, skipping logging path"
            r4.a((java.lang.String) r5, (java.lang.Object) r6)
            goto L_0x00e1
        L_0x00e0:
        L_0x00e1:
            r4 = r10
        L_0x00e2:
            boolean r5 = r3.c
            if (r5 != 0) goto L_0x00e7
            goto L_0x00ec
        L_0x00e7:
            r3.c()
            r3.c = r1
        L_0x00ec:
            aucj r5 = r3.b
            barn r5 = (defpackage.barn) r5
            r4.getClass()
            int r6 = r5.a
            r6 = r6 | r7
            r5.a = r6
            r5.b = r4
        L_0x00fa:
            r4 = r15[r2]
            java.lang.String r5 = r4.i
            aucj r5 = r3.b
            barn r5 = (defpackage.barn) r5
            r5.j = r1
            int r6 = r5.a
            r6 = r6 | 256(0x100, float:3.59E-43)
            r5.a = r6
            java.lang.String r11 = r4.f
            if (r11 == 0) goto L_0x0193
            boolean r12 = r4.h
            if (r12 == 0) goto L_0x0120
            java.lang.String r4 = r4.g
            r11.getClass()
            r4 = r6 | 4
            r5.a = r4
            r5.d = r11
            r4 = r10
            goto L_0x0194
        L_0x0120:
            java.lang.String r4 = a((java.lang.String) r11)
            boolean r5 = r14.h
            r6 = 2
            if (r5 == 0) goto L_0x0174
            java.util.Set r5 = b
            java.util.Iterator r5 = r5.iterator()
        L_0x012f:
            boolean r12 = r5.hasNext()
            if (r12 == 0) goto L_0x0174
            java.lang.Object r12 = r5.next()
            java.lang.String r12 = (java.lang.String) r12
            boolean r12 = r11.contains(r12)
            if (r12 == 0) goto L_0x012f
            agiq r5 = r14.i
            java.lang.String r5 = a(r11, r5, r7)
            java.util.regex.Pattern r11 = e
            java.util.regex.Matcher r5 = r11.matcher(r5)
            boolean r11 = r5.matches()
            if (r11 == 0) goto L_0x0158
            java.lang.String r5 = r5.group(r6)
            goto L_0x0159
        L_0x0158:
            r5 = r10
        L_0x0159:
            boolean r6 = r3.c
            if (r6 != 0) goto L_0x015e
            goto L_0x0163
        L_0x015e:
            r3.c()
            r3.c = r1
        L_0x0163:
            aucj r6 = r3.b
            barn r6 = (defpackage.barn) r6
            r5.getClass()
            int r11 = r6.a
            r12 = 262144(0x40000, float:3.67342E-40)
            r11 = r11 | r12
            r6.a = r11
            r6.s = r5
            goto L_0x0194
        L_0x0174:
            agiq r5 = r14.i
            java.lang.String r5 = a(r11, r5, r1)
            boolean r11 = r3.c
            if (r11 != 0) goto L_0x017f
            goto L_0x0184
        L_0x017f:
            r3.c()
            r3.c = r1
        L_0x0184:
            aucj r11 = r3.b
            barn r11 = (defpackage.barn) r11
            r5.getClass()
            int r12 = r11.a
            r6 = r6 | r12
            r11.a = r6
            r11.c = r5
            goto L_0x0194
        L_0x0193:
            r4 = r10
        L_0x0194:
            if (r4 != 0) goto L_0x0197
            goto L_0x01b5
        L_0x0197:
            java.lang.String r4 = b(r4)
            boolean r5 = r3.c
            if (r5 != 0) goto L_0x01a0
            goto L_0x01a5
        L_0x01a0:
            r3.c()
            r3.c = r1
        L_0x01a5:
            aucj r5 = r3.b
            barn r5 = (defpackage.barn) r5
            r4.getClass()
            int r6 = r5.a
            r11 = 1048576(0x100000, float:1.469368E-39)
            r6 = r6 | r11
            r5.a = r6
            r5.u = r4
        L_0x01b5:
            r4 = r15[r2]
            java.lang.String[] r5 = r4.l
            basc r4 = r4.m
            if (r4 == 0) goto L_0x01cc
            aucj r5 = r3.b
            barn r5 = (defpackage.barn) r5
            r4.getClass()
            r5.k = r4
            int r4 = r5.a
            r4 = r4 | 512(0x200, float:7.175E-43)
            r5.a = r4
        L_0x01cc:
            barm r4 = defpackage.barm.a(r1)
            amri r4 = defpackage.amri.c(r4)
            barm r5 = defpackage.barm.UNKNOWN
            java.lang.Object r4 = r4.a((java.lang.Object) r5)
            barm r4 = (defpackage.barm) r4
            boolean r5 = r3.c
            if (r5 != 0) goto L_0x01e2
            goto L_0x01e7
        L_0x01e2:
            r3.c()
            r3.c = r1
        L_0x01e7:
            aucj r5 = r3.b
            barn r5 = (defpackage.barn) r5
            int r4 = r4.c
            r5.l = r4
            int r4 = r5.a
            r4 = r4 | 1024(0x400, float:1.435E-42)
            r5.a = r4
            bark r4 = defpackage.bark.c
            aucd r4 = r4.o()
            r5 = r15[r2]
            int r5 = r5.u
            if (r5 == 0) goto L_0x0218
            boolean r6 = r4.c
            if (r6 != 0) goto L_0x0206
            goto L_0x020b
        L_0x0206:
            r4.c()
            r4.c = r1
        L_0x020b:
            aucj r6 = r4.b
            bark r6 = (defpackage.bark) r6
            int r5 = r5 + -2
            r6.b = r5
            int r5 = r6.a
            r5 = r5 | r7
            r6.a = r5
        L_0x0218:
            boolean r5 = r3.c
            if (r5 != 0) goto L_0x021d
            goto L_0x0222
        L_0x021d:
            r3.c()
            r3.c = r1
        L_0x0222:
            aucj r5 = r3.b
            barn r5 = (defpackage.barn) r5
            aucj r4 = r4.i()
            bark r4 = (defpackage.bark) r4
            r4.getClass()
            r5.m = r4
            int r4 = r5.a
            r4 = r4 | 2048(0x800, float:2.87E-42)
            r5.a = r4
            r4 = r15[r2]
            barb r5 = r4.n
            long r4 = r4.a
            int r6 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r6 <= 0) goto L_0x0257
            boolean r6 = r3.c
            if (r6 != 0) goto L_0x0246
            goto L_0x024b
        L_0x0246:
            r3.c()
            r3.c = r1
        L_0x024b:
            aucj r6 = r3.b
            barn r6 = (defpackage.barn) r6
            int r8 = r6.a
            r8 = r8 | 8192(0x2000, float:1.14794E-41)
            r6.a = r8
            r6.n = r4
        L_0x0257:
            r4 = r15[r2]
            int r4 = r4.q
            if (r4 <= 0) goto L_0x02a9
            barh r4 = defpackage.barh.d
            aucd r4 = r4.o()
            r5 = r15[r2]
            int r5 = r5.q
            boolean r6 = r4.c
            if (r6 != 0) goto L_0x026c
            goto L_0x0271
        L_0x026c:
            r4.c()
            r4.c = r1
        L_0x0271:
            aucj r6 = r4.b
            barh r6 = (defpackage.barh) r6
            int r8 = r6.a
            r8 = r8 | r7
            r6.a = r8
            r6.b = r5
            r5 = r15[r2]
            int r5 = r5.r
            if (r5 > 0) goto L_0x0283
            goto L_0x0289
        L_0x0283:
            r5 = r8 | 2
            r6.a = r5
            r6.c = r7
        L_0x0289:
            aucj r4 = r4.i()
            barh r4 = (defpackage.barh) r4
            boolean r5 = r3.c
            if (r5 != 0) goto L_0x0294
            goto L_0x0299
        L_0x0294:
            r3.c()
            r3.c = r1
        L_0x0299:
            aucj r5 = r3.b
            barn r5 = (defpackage.barn) r5
            r4.getClass()
            r5.v = r4
            int r4 = r5.a
            r6 = 4194304(0x400000, float:5.877472E-39)
            r4 = r4 | r6
            r5.a = r4
        L_0x02a9:
            r4 = r15[r2]
            int r4 = r4.v
            boolean r5 = r3.c
            if (r5 != 0) goto L_0x02b2
            goto L_0x02b7
        L_0x02b2:
            r3.c()
            r3.c = r1
        L_0x02b7:
            aucj r5 = r3.b
            barn r5 = (defpackage.barn) r5
            int r6 = r4 + -1
            if (r4 == 0) goto L_0x0324
            r5.o = r6
            int r4 = r5.a
            r4 = r4 | 16384(0x4000, float:2.2959E-41)
            r5.a = r4
            r4 = r15[r2]
            int r4 = r4.o
            int r4 = defpackage.barq.a(r1)
            boolean r5 = r3.c
            if (r5 != 0) goto L_0x02d4
            goto L_0x02d9
        L_0x02d4:
            r3.c()
            r3.c = r1
        L_0x02d9:
            aucj r5 = r3.b
            barn r5 = (defpackage.barn) r5
            int r6 = r4 + -1
            if (r4 == 0) goto L_0x0322
            r5.p = r6
            int r4 = r5.a
            r6 = 32768(0x8000, float:4.5918E-41)
            r4 = r4 | r6
            r5.a = r4
            r6 = r15[r2]
            int r7 = r6.p
            r7 = 65536(0x10000, float:9.18355E-41)
            r4 = r4 | r7
            r5.a = r4
            r5.q = r1
            int r6 = r6.s
            r6 = 131072(0x20000, float:1.83671E-40)
            r4 = r4 | r6
            r5.a = r4
            r5.r = r1
            boolean r4 = r0.c
            if (r4 != 0) goto L_0x0304
            goto L_0x0309
        L_0x0304:
            r0.c()
            r0.c = r1
        L_0x0309:
            aucj r4 = r0.b
            baro r4 = (defpackage.baro) r4
            aucj r3 = r3.i()
            barn r3 = (defpackage.barn) r3
            r3.getClass()
            r4.c()
            aucx r4 = r4.a
            r4.add(r3)
            int r2 = r2 + 1
            goto L_0x0008
        L_0x0322:
            throw r10
        L_0x0324:
            throw r10
        L_0x0326:
            basu r15 = defpackage.basu.s
            aucd r15 = r15.o()
            boolean r2 = r15.c
            if (r2 != 0) goto L_0x0331
            goto L_0x0336
        L_0x0331:
            r15.c()
            r15.c = r1
        L_0x0336:
            aucj r2 = r15.b
            basu r2 = (defpackage.basu) r2
            aucj r0 = r0.i()
            baro r0 = (defpackage.baro) r0
            r0.getClass()
            r2.g = r0
            int r0 = r2.a
            r0 = r0 | 32
            r2.a = r0
            amri r0 = r14.j     // Catch:{ Exception -> 0x0385 }
            boolean r0 = r0.a()     // Catch:{ Exception -> 0x0385 }
            if (r0 == 0) goto L_0x03a0
            amri r0 = r14.j     // Catch:{ Exception -> 0x0385 }
            java.lang.Object r0 = r0.b()     // Catch:{ Exception -> 0x0385 }
            agey r0 = (defpackage.agey) r0     // Catch:{ Exception -> 0x0385 }
            amri r0 = r0.a()     // Catch:{ Exception -> 0x0385 }
            boolean r2 = r0.a()     // Catch:{ Exception -> 0x0385 }
            if (r2 == 0) goto L_0x03a0
            java.lang.Object r0 = r0.b()     // Catch:{ Exception -> 0x0385 }
            barb r0 = (defpackage.barb) r0     // Catch:{ Exception -> 0x0385 }
            boolean r2 = r15.c     // Catch:{ Exception -> 0x0385 }
            if (r2 != 0) goto L_0x0370
            goto L_0x0375
        L_0x0370:
            r15.c()     // Catch:{ Exception -> 0x0385 }
            r15.c = r1     // Catch:{ Exception -> 0x0385 }
        L_0x0375:
            aucj r1 = r15.b     // Catch:{ Exception -> 0x0385 }
            basu r1 = (defpackage.basu) r1     // Catch:{ Exception -> 0x0385 }
            r0.getClass()     // Catch:{ Exception -> 0x0385 }
            r1.l = r0     // Catch:{ Exception -> 0x0385 }
            int r0 = r1.a     // Catch:{ Exception -> 0x0385 }
            r0 = r0 | 8192(0x2000, float:1.14794E-41)
            r1.a = r0     // Catch:{ Exception -> 0x0385 }
            goto L_0x03a0
        L_0x0385:
            r0 = move-exception
            anhq r1 = a
            anie r1 = r1.c()
            anhn r1 = (defpackage.anhn) r1
            r1.a((java.lang.Throwable) r0)
            r0 = 217(0xd9, float:3.04E-43)
            java.lang.String r2 = "a"
            anie r0 = r1.a((java.lang.String) r5, (java.lang.String) r2, (int) r0, (java.lang.String) r4)
            anhn r0 = (defpackage.anhn) r0
            java.lang.String r1 = "Exception while getting network metric extension!"
            r0.a((java.lang.String) r1)
        L_0x03a0:
            aucj r15 = r15.i()
            basu r15 = (defpackage.basu) r15
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.agew.a(agev[]):basu");
    }
}
