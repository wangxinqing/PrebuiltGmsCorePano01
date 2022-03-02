package defpackage;

import android.content.pm.PackageManager;
import android.content.res.XmlResourceParser;

/* renamed from: agxh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class agxh {
    private final PackageManager a;

    public agxh(PackageManager packageManager) {
        this.a = packageManager;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.util.List a(int r20, android.content.pm.PackageInfo r21) {
        /*
            r19 = this;
            r1 = r19
            r0 = r21
            java.lang.String r2 = "#"
            java.lang.String r3 = "phenotype-registration"
            java.lang.String r4 = "phenotype-registrations"
            android.content.pm.PackageManager r5 = r1.a
            java.lang.String r6 = r0.packageName
            android.content.res.Resources r5 = r5.getResourcesForApplication(r6)
            r6 = r20
            android.content.res.XmlResourceParser r5 = r5.getXml(r6)
            if (r5 != 0) goto L_0x0020
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            return r0
        L_0x0020:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r5.next()     // Catch:{ all -> 0x02ca }
        L_0x0028:
            int r7 = r5.next()     // Catch:{ all -> 0x02ca }
            r8 = 1
            if (r7 == r8) goto L_0x02c6
            int r7 = r5.getEventType()     // Catch:{ all -> 0x02ca }
            r9 = 2
            if (r7 != r9) goto L_0x02a9
            java.lang.String r7 = r5.getName()     // Catch:{ all -> 0x02ca }
            boolean r10 = r4.equals(r7)     // Catch:{ all -> 0x02ca }
            if (r10 == 0) goto L_0x029d
            b(r5, r4)     // Catch:{ all -> 0x02ca }
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch:{ all -> 0x02ca }
            r10.<init>()     // Catch:{ all -> 0x02ca }
        L_0x0048:
            int r11 = r5.nextTag()     // Catch:{ all -> 0x02ca }
            r12 = 3
            if (r11 == r12) goto L_0x0294
            java.lang.String r11 = r5.getName()     // Catch:{ all -> 0x02ca }
            boolean r13 = r3.equals(r11)     // Catch:{ all -> 0x02ca }
            if (r13 == 0) goto L_0x0283
            b(r5, r3)     // Catch:{ all -> 0x02ca }
            apgu r13 = defpackage.apgu.l     // Catch:{ all -> 0x02ca }
            aucd r13 = r13.o()     // Catch:{ all -> 0x02ca }
            apgq r13 = (defpackage.apgq) r13     // Catch:{ all -> 0x02ca }
            r15 = 0
        L_0x0065:
            int r9 = r5.nextTag()     // Catch:{ all -> 0x02ca }
            java.lang.String r14 = "configuration-package"
            java.lang.String r8 = "auto-subpackage"
            r17 = r7
            r7 = 4
            if (r9 != r12) goto L_0x00fb
            a((android.content.res.XmlResourceParser) r5, (java.lang.String) r3)     // Catch:{ all -> 0x02ca }
            aucj r9 = r13.b     // Catch:{ all -> 0x02ca }
            apgu r9 = (defpackage.apgu) r9     // Catch:{ all -> 0x02ca }
            java.lang.String r9 = r9.d     // Catch:{ all -> 0x02ca }
            boolean r18 = r9.isEmpty()     // Catch:{ all -> 0x02ca }
            if (r18 != 0) goto L_0x00f3
            if (r15 == 0) goto L_0x00ca
            boolean r15 = r9.contains(r2)     // Catch:{ all -> 0x02ca }
            if (r15 != 0) goto L_0x00b1
            java.lang.String r7 = r0.packageName     // Catch:{ all -> 0x02ca }
            java.lang.String r8 = java.lang.String.valueOf(r9)     // Catch:{ all -> 0x02ca }
            int r8 = r8.length()     // Catch:{ all -> 0x02ca }
            java.lang.String r12 = java.lang.String.valueOf(r7)     // Catch:{ all -> 0x02ca }
            int r12 = r12.length()     // Catch:{ all -> 0x02ca }
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch:{ all -> 0x02ca }
            r15 = 1
            int r8 = r8 + r15
            int r8 = r8 + r12
            r14.<init>(r8)     // Catch:{ all -> 0x02ca }
            r14.append(r9)     // Catch:{ all -> 0x02ca }
            r14.append(r2)     // Catch:{ all -> 0x02ca }
            r14.append(r7)     // Catch:{ all -> 0x02ca }
            java.lang.String r9 = r14.toString()     // Catch:{ all -> 0x02ca }
            goto L_0x00cb
        L_0x00b1:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x02ca }
            java.lang.Object[] r3 = new java.lang.Object[r7]     // Catch:{ all -> 0x02ca }
            r4 = 0
            r3[r4] = r8     // Catch:{ all -> 0x02ca }
            r4 = 1
            r3[r4] = r14     // Catch:{ all -> 0x02ca }
            r4 = 2
            r3[r4] = r2     // Catch:{ all -> 0x02ca }
            r3[r12] = r9     // Catch:{ all -> 0x02ca }
            java.lang.String r2 = "When %s is present, %s should not contain subpackage separator %s (config package=%s)"
            java.lang.String r2 = java.lang.String.format(r2, r3)     // Catch:{ all -> 0x02ca }
            r0.<init>(r2)     // Catch:{ all -> 0x02ca }
            throw r0     // Catch:{ all -> 0x02ca }
        L_0x00ca:
        L_0x00cb:
            boolean r7 = r13.c     // Catch:{ all -> 0x02ca }
            if (r7 != 0) goto L_0x00d0
            goto L_0x00d6
        L_0x00d0:
            r13.c()     // Catch:{ all -> 0x02ca }
            r7 = 0
            r13.c = r7     // Catch:{ all -> 0x02ca }
        L_0x00d6:
            aucj r7 = r13.b     // Catch:{ all -> 0x02ca }
            apgu r7 = (defpackage.apgu) r7     // Catch:{ all -> 0x02ca }
            r9.getClass()     // Catch:{ all -> 0x02ca }
            int r8 = r7.a     // Catch:{ all -> 0x02ca }
            r12 = 1
            r8 = r8 | r12
            r7.a = r8     // Catch:{ all -> 0x02ca }
            r7.d = r9     // Catch:{ all -> 0x02ca }
            aucj r7 = r13.i()     // Catch:{ all -> 0x02ca }
            apgu r7 = (defpackage.apgu) r7     // Catch:{ all -> 0x02ca }
            r10.add(r7)     // Catch:{ all -> 0x02ca }
            r14 = 2
            r16 = 1
            goto L_0x028b
        L_0x00f3:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x02ca }
            java.lang.String r2 = "Empty configuration package"
            r0.<init>(r2)     // Catch:{ all -> 0x02ca }
            throw r0     // Catch:{ all -> 0x02ca }
        L_0x00fb:
            java.lang.String r9 = r5.getName()     // Catch:{ all -> 0x02ca }
            int r18 = r9.hashCode()
            java.lang.String r7 = "experiment-ids"
            java.lang.String r12 = "log-sources"
            switch(r18) {
                case -995427962: goto L_0x0135;
                case -260675356: goto L_0x012d;
                case 515651183: goto L_0x0125;
                case 770547247: goto L_0x011d;
                case 1674321665: goto L_0x0113;
                case 2055708904: goto L_0x010b;
                default: goto L_0x010a;
            }
        L_0x010a:
            goto L_0x013f
        L_0x010b:
            boolean r8 = r9.equals(r7)
            if (r8 == 0) goto L_0x013f
            r8 = 5
            goto L_0x0140
        L_0x0113:
            java.lang.String r8 = "configuration-version"
            boolean r8 = r9.equals(r8)
            if (r8 == 0) goto L_0x013f
            r8 = 1
            goto L_0x0140
        L_0x011d:
            boolean r8 = r9.equals(r12)
            if (r8 == 0) goto L_0x013f
            r8 = 2
            goto L_0x0140
        L_0x0125:
            boolean r8 = r9.equals(r14)
            if (r8 == 0) goto L_0x013f
            r8 = 0
            goto L_0x0140
        L_0x012d:
            boolean r8 = r9.equals(r8)
            if (r8 == 0) goto L_0x013f
            r8 = 4
            goto L_0x0140
        L_0x0135:
            java.lang.String r8 = "params"
            boolean r8 = r9.equals(r8)
            if (r8 == 0) goto L_0x013f
            r8 = 3
            goto L_0x0140
        L_0x013f:
            r8 = -1
        L_0x0140:
            if (r8 == 0) goto L_0x0257
            r14 = 1
            if (r8 == r14) goto L_0x0235
            r14 = 2
            if (r8 == r14) goto L_0x01ff
            r14 = 3
            if (r8 == r14) goto L_0x01d2
            r14 = 4
            if (r8 == r14) goto L_0x01c5
            r14 = 5
            if (r8 == r14) goto L_0x0159
            r1.a((android.content.res.XmlResourceParser) r5)     // Catch:{ all -> 0x02ca }
            r14 = 2
            r16 = 1
            goto L_0x0279
        L_0x0159:
            b(r5, r7)     // Catch:{ all -> 0x02ca }
            java.util.ArrayList r8 = new java.util.ArrayList     // Catch:{ all -> 0x02ca }
            r8.<init>()     // Catch:{ all -> 0x02ca }
        L_0x0162:
            int r14 = r5.nextTag()     // Catch:{ all -> 0x02ca }
            r12 = 3
            if (r14 == r12) goto L_0x018c
            java.lang.String r12 = r5.getName()     // Catch:{ all -> 0x02ca }
            java.lang.String r14 = "experiment-id"
            boolean r14 = r14.equals(r12)     // Catch:{ all -> 0x02ca }
            if (r14 == 0) goto L_0x0185
            java.lang.String r14 = r5.nextText()     // Catch:{ all -> 0x02ca }
            int r14 = java.lang.Integer.parseInt(r14)     // Catch:{ all -> 0x02ca }
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)     // Catch:{ all -> 0x02ca }
            r8.add(r14)     // Catch:{ all -> 0x02ca }
            goto L_0x0188
        L_0x0185:
            r1.a((android.content.res.XmlResourceParser) r5)     // Catch:{ all -> 0x02ca }
        L_0x0188:
            a((android.content.res.XmlResourceParser) r5, (java.lang.String) r12)     // Catch:{ all -> 0x02ca }
            goto L_0x0162
        L_0x018c:
            a((android.content.res.XmlResourceParser) r5, (java.lang.String) r7)     // Catch:{ all -> 0x02ca }
            boolean r7 = r13.c     // Catch:{ all -> 0x02ca }
            if (r7 != 0) goto L_0x0195
            goto L_0x019b
        L_0x0195:
            r13.c()     // Catch:{ all -> 0x02ca }
            r7 = 0
            r13.c = r7     // Catch:{ all -> 0x02ca }
        L_0x019b:
            aucj r7 = r13.b     // Catch:{ all -> 0x02ca }
            apgu r7 = (defpackage.apgu) r7     // Catch:{ all -> 0x02ca }
            r7.a()     // Catch:{ all -> 0x02ca }
            aucs r7 = r7.g     // Catch:{ all -> 0x02ca }
            defpackage.auab.a((java.lang.Iterable) r8, (java.util.List) r7)     // Catch:{ all -> 0x02ca }
            boolean r7 = r13.c     // Catch:{ all -> 0x02ca }
            if (r7 != 0) goto L_0x01ac
            goto L_0x01b2
        L_0x01ac:
            r13.c()     // Catch:{ all -> 0x02ca }
            r7 = 0
            r13.c = r7     // Catch:{ all -> 0x02ca }
        L_0x01b2:
            aucj r7 = r13.b     // Catch:{ all -> 0x02ca }
            apgu r7 = (defpackage.apgu) r7     // Catch:{ all -> 0x02ca }
            int r8 = r7.a     // Catch:{ all -> 0x02ca }
            r12 = 8
            r8 = r8 | r12
            r7.a = r8     // Catch:{ all -> 0x02ca }
            r8 = 1
            r7.i = r8     // Catch:{ all -> 0x02ca }
            r14 = 2
            r16 = 1
            goto L_0x0279
        L_0x01c5:
            java.lang.String r7 = r5.nextText()     // Catch:{ all -> 0x02ca }
            boolean r15 = java.lang.Boolean.parseBoolean(r7)     // Catch:{ all -> 0x02ca }
            r14 = 2
            r16 = 1
            goto L_0x0279
        L_0x01d2:
            java.lang.String r7 = r5.nextText()     // Catch:{ all -> 0x02ca }
            r8 = 8
            byte[] r7 = android.util.Base64.decode(r7, r8)     // Catch:{ all -> 0x02ca }
            auay r7 = defpackage.auay.a((byte[]) r7)     // Catch:{ all -> 0x02ca }
            boolean r8 = r13.c     // Catch:{ all -> 0x02ca }
            if (r8 != 0) goto L_0x01e5
            goto L_0x01eb
        L_0x01e5:
            r13.c()     // Catch:{ all -> 0x02ca }
            r8 = 0
            r13.c = r8     // Catch:{ all -> 0x02ca }
        L_0x01eb:
            aucj r8 = r13.b     // Catch:{ all -> 0x02ca }
            apgu r8 = (defpackage.apgu) r8     // Catch:{ all -> 0x02ca }
            r7.getClass()     // Catch:{ all -> 0x02ca }
            int r12 = r8.a     // Catch:{ all -> 0x02ca }
            r14 = 4
            r12 = r12 | r14
            r8.a = r12     // Catch:{ all -> 0x02ca }
            r8.h = r7     // Catch:{ all -> 0x02ca }
            r14 = 2
            r16 = 1
            goto L_0x0279
        L_0x01ff:
            b(r5, r12)     // Catch:{ all -> 0x02ca }
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ all -> 0x02ca }
            r7.<init>()     // Catch:{ all -> 0x02ca }
        L_0x0208:
            int r8 = r5.nextTag()     // Catch:{ all -> 0x02ca }
            r14 = 3
            if (r8 == r14) goto L_0x022a
            java.lang.String r8 = r5.getName()     // Catch:{ all -> 0x02ca }
            java.lang.String r14 = "log-source"
            boolean r14 = r14.equals(r8)     // Catch:{ all -> 0x02ca }
            if (r14 == 0) goto L_0x0223
            java.lang.String r14 = r5.nextText()     // Catch:{ all -> 0x02ca }
            r7.add(r14)     // Catch:{ all -> 0x02ca }
            goto L_0x0226
        L_0x0223:
            r1.a((android.content.res.XmlResourceParser) r5)     // Catch:{ all -> 0x02ca }
        L_0x0226:
            a((android.content.res.XmlResourceParser) r5, (java.lang.String) r8)     // Catch:{ all -> 0x02ca }
            goto L_0x0208
        L_0x022a:
            a((android.content.res.XmlResourceParser) r5, (java.lang.String) r12)     // Catch:{ all -> 0x02ca }
            r13.a((java.lang.Iterable) r7)     // Catch:{ all -> 0x02ca }
            r14 = 2
            r16 = 1
            goto L_0x0279
        L_0x0235:
            java.lang.String r7 = r5.nextText()     // Catch:{ all -> 0x02ca }
            int r7 = java.lang.Integer.parseInt(r7)     // Catch:{ all -> 0x02ca }
            boolean r8 = r13.c     // Catch:{ all -> 0x02ca }
            if (r8 != 0) goto L_0x0242
            goto L_0x0248
        L_0x0242:
            r13.c()     // Catch:{ all -> 0x02ca }
            r8 = 0
            r13.c = r8     // Catch:{ all -> 0x02ca }
        L_0x0248:
            aucj r8 = r13.b     // Catch:{ all -> 0x02ca }
            apgu r8 = (defpackage.apgu) r8     // Catch:{ all -> 0x02ca }
            int r12 = r8.a     // Catch:{ all -> 0x02ca }
            r14 = 2
            r12 = r12 | r14
            r8.a = r12     // Catch:{ all -> 0x02ca }
            r8.e = r7     // Catch:{ all -> 0x02ca }
            r16 = 1
            goto L_0x0279
        L_0x0257:
            r14 = 2
            java.lang.String r7 = r5.nextText()     // Catch:{ all -> 0x02ca }
            boolean r8 = r13.c     // Catch:{ all -> 0x02ca }
            if (r8 != 0) goto L_0x0262
            r8 = 0
            goto L_0x0268
        L_0x0262:
            r13.c()     // Catch:{ all -> 0x02ca }
            r8 = 0
            r13.c = r8     // Catch:{ all -> 0x02ca }
        L_0x0268:
            aucj r12 = r13.b     // Catch:{ all -> 0x02ca }
            apgu r12 = (defpackage.apgu) r12     // Catch:{ all -> 0x02ca }
            r7.getClass()     // Catch:{ all -> 0x02ca }
            int r8 = r12.a     // Catch:{ all -> 0x02ca }
            r16 = 1
            r8 = r8 | 1
            r12.a = r8     // Catch:{ all -> 0x02ca }
            r12.d = r7     // Catch:{ all -> 0x02ca }
        L_0x0279:
            a((android.content.res.XmlResourceParser) r5, (java.lang.String) r9)     // Catch:{ all -> 0x02ca }
            r7 = r17
            r8 = 1
            r9 = 2
            r12 = 3
            goto L_0x0065
        L_0x0283:
            r17 = r7
            r14 = 2
            r16 = 1
            r1.a((android.content.res.XmlResourceParser) r5)     // Catch:{ all -> 0x02ca }
        L_0x028b:
            a((android.content.res.XmlResourceParser) r5, (java.lang.String) r11)     // Catch:{ all -> 0x02ca }
            r7 = r17
            r8 = 1
            r9 = 2
            goto L_0x0048
        L_0x0294:
            r17 = r7
            a((android.content.res.XmlResourceParser) r5, (java.lang.String) r4)     // Catch:{ all -> 0x02ca }
            r6.addAll(r10)     // Catch:{ all -> 0x02ca }
            goto L_0x02a2
        L_0x029d:
            r17 = r7
            r1.a((android.content.res.XmlResourceParser) r5)     // Catch:{ all -> 0x02ca }
        L_0x02a2:
            r7 = r17
            a((android.content.res.XmlResourceParser) r5, (java.lang.String) r7)     // Catch:{ all -> 0x02ca }
            goto L_0x0028
        L_0x02a9:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x02ca }
            int r2 = r5.getEventType()     // Catch:{ all -> 0x02ca }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x02ca }
            r4 = 29
            r3.<init>(r4)     // Catch:{ all -> 0x02ca }
            java.lang.String r4 = "Unexpected event: "
            r3.append(r4)     // Catch:{ all -> 0x02ca }
            r3.append(r2)     // Catch:{ all -> 0x02ca }
            java.lang.String r2 = r3.toString()     // Catch:{ all -> 0x02ca }
            r0.<init>(r2)     // Catch:{ all -> 0x02ca }
            throw r0     // Catch:{ all -> 0x02ca }
        L_0x02c6:
            r5.close()
            return r6
        L_0x02ca:
            r0 = move-exception
            r5.close()
            goto L_0x02d0
        L_0x02cf:
            throw r0
        L_0x02d0:
            goto L_0x02cf
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.agxh.a(int, android.content.pm.PackageInfo):java.util.List");
    }

    private static final void b(XmlResourceParser xmlResourceParser, String str) {
        if (xmlResourceParser.getEventType() != 2) {
            int lineNumber = xmlResourceParser.getLineNumber();
            StringBuilder sb = new StringBuilder(str.length() + 46);
            sb.append("Expected a start tag named ");
            sb.append(str);
            sb.append(" (line ");
            sb.append(lineNumber);
            sb.append(")");
            throw new IllegalArgumentException(sb.toString());
        } else if (!str.equals(xmlResourceParser.getName())) {
            int lineNumber2 = xmlResourceParser.getLineNumber();
            String name = xmlResourceParser.getName();
            StringBuilder sb2 = new StringBuilder(String.valueOf(name).length() + 53 + str.length());
            sb2.append("Unexpected start tag at line ");
            sb2.append(lineNumber2);
            sb2.append(": ");
            sb2.append(name);
            sb2.append(". Expected ");
            sb2.append(str);
            throw new IllegalArgumentException(sb2.toString());
        }
    }

    private final void a(XmlResourceParser xmlResourceParser) {
        String name = xmlResourceParser.getName();
        while (xmlResourceParser.next() != 3) {
            int eventType = xmlResourceParser.getEventType();
            if (eventType == 2) {
                a(xmlResourceParser);
            } else if (eventType == 4) {
                xmlResourceParser.next();
                a(xmlResourceParser, name);
                return;
            } else {
                int eventType2 = xmlResourceParser.getEventType();
                StringBuilder sb = new StringBuilder(29);
                sb.append("Unexpected event: ");
                sb.append(eventType2);
                throw new IllegalArgumentException(sb.toString());
            }
        }
        a(xmlResourceParser, name);
    }

    private static final void a(XmlResourceParser xmlResourceParser, String str) {
        if (xmlResourceParser.getEventType() != 3) {
            int lineNumber = xmlResourceParser.getLineNumber();
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 45);
            sb.append("Expected an end tag named ");
            sb.append(str);
            sb.append(" (line ");
            sb.append(lineNumber);
            sb.append(")");
            throw new IllegalArgumentException(sb.toString());
        } else if (!str.equals(xmlResourceParser.getName())) {
            int lineNumber2 = xmlResourceParser.getLineNumber();
            String name = xmlResourceParser.getName();
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 58 + String.valueOf(name).length());
            sb2.append("Mismatched end tag at line ");
            sb2.append(lineNumber2);
            sb2.append(". Expected ");
            sb2.append(str);
            sb2.append(" but was ");
            sb2.append(name);
            throw new IllegalArgumentException(sb2.toString());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:74:0x016f A[Catch:{ Exception -> 0x034c }] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0177 A[Catch:{ Exception -> 0x034c }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List a(android.content.pm.PackageInfo r20) {
        /*
            r19 = this;
            r1 = r19
            r2 = r20
            java.lang.String r3 = "string"
            java.lang.String r4 = "PhenotypeResourceReader"
            if (r2 == 0) goto L_0x0353
            r7 = 1
            r8 = 0
            android.content.pm.ApplicationInfo r0 = r2.applicationInfo     // Catch:{ Exception -> 0x0160 }
            if (r0 != 0) goto L_0x0012
        L_0x0010:
            goto L_0x015a
        L_0x0012:
            android.content.pm.ApplicationInfo r0 = r2.applicationInfo     // Catch:{ Exception -> 0x0160 }
            android.os.Bundle r0 = r0.metaData     // Catch:{ Exception -> 0x0160 }
            if (r0 == 0) goto L_0x0010
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ Exception -> 0x0160 }
            r0.<init>()     // Catch:{ Exception -> 0x0160 }
            android.content.pm.ApplicationInfo r9 = r2.applicationInfo     // Catch:{ Exception -> 0x0160 }
            android.os.Bundle r9 = r9.metaData     // Catch:{ Exception -> 0x0160 }
            java.util.Set r9 = r9.keySet()     // Catch:{ Exception -> 0x0160 }
            java.util.Iterator r9 = r9.iterator()     // Catch:{ Exception -> 0x0160 }
        L_0x0029:
            boolean r10 = r9.hasNext()     // Catch:{ Exception -> 0x0160 }
            java.lang.String r11 = "com.google.android.gms.phenotype.registration.xml:"
            java.lang.String r12 = "com.google.android.gms.phenotype.registration.xml"
            if (r10 == 0) goto L_0x0059
            java.lang.Object r10 = r9.next()     // Catch:{ Exception -> 0x0160 }
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ Exception -> 0x0160 }
            boolean r12 = r12.equals(r10)     // Catch:{ Exception -> 0x0160 }
            if (r12 == 0) goto L_0x0040
            goto L_0x0047
        L_0x0040:
            boolean r11 = r10.startsWith(r11)     // Catch:{ Exception -> 0x0160 }
            if (r11 == 0) goto L_0x0029
        L_0x0047:
            android.content.pm.ApplicationInfo r11 = r2.applicationInfo     // Catch:{ Exception -> 0x0160 }
            android.os.Bundle r11 = r11.metaData     // Catch:{ Exception -> 0x0160 }
            int r10 = r11.getInt(r10, r8)     // Catch:{ Exception -> 0x0160 }
            if (r10 == 0) goto L_0x0029
            java.util.List r10 = r1.a((int) r10, (android.content.pm.PackageInfo) r2)     // Catch:{ Exception -> 0x0160 }
            r0.addAll(r10)     // Catch:{ Exception -> 0x0160 }
            goto L_0x0029
        L_0x0059:
            android.content.pm.ServiceInfo[] r9 = r2.services     // Catch:{ Exception -> 0x0160 }
            r10 = 5
            if (r9 != 0) goto L_0x0060
            goto L_0x00e8
        L_0x0060:
            android.content.pm.ServiceInfo[] r9 = r2.services     // Catch:{ Exception -> 0x0160 }
            int r13 = r9.length     // Catch:{ Exception -> 0x0160 }
            r14 = 0
        L_0x0064:
            if (r14 >= r13) goto L_0x00e8
            r15 = r9[r14]     // Catch:{ Exception -> 0x0160 }
            if (r15 == 0) goto L_0x00e4
            java.lang.String r6 = "com.google.android.libraries.phenotype.registration.PhenotypeMetadataHolderService"
            java.lang.String r5 = r15.name     // Catch:{ Exception -> 0x0160 }
            boolean r5 = r6.equals(r5)     // Catch:{ Exception -> 0x0160 }
            if (r5 != 0) goto L_0x0075
            goto L_0x00e4
        L_0x0075:
            android.os.Bundle r5 = r15.metaData     // Catch:{ Exception -> 0x0160 }
            if (r5 == 0) goto L_0x00e8
            android.os.Bundle r5 = r15.metaData     // Catch:{ Exception -> 0x0160 }
            java.util.Set r5 = r5.keySet()     // Catch:{ Exception -> 0x0160 }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ Exception -> 0x0160 }
        L_0x0083:
            boolean r6 = r5.hasNext()     // Catch:{ Exception -> 0x0160 }
            if (r6 == 0) goto L_0x00e8
            java.lang.Object r6 = r5.next()     // Catch:{ Exception -> 0x0160 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ Exception -> 0x0160 }
            boolean r9 = r12.equals(r6)     // Catch:{ Exception -> 0x0160 }
            if (r9 != 0) goto L_0x009b
            boolean r9 = r6.startsWith(r11)     // Catch:{ Exception -> 0x0160 }
            if (r9 == 0) goto L_0x0083
        L_0x009b:
            android.os.Bundle r9 = r15.metaData     // Catch:{ Exception -> 0x0160 }
            int r6 = r9.getInt(r6, r8)     // Catch:{ Exception -> 0x0160 }
            if (r6 == 0) goto L_0x0083
            java.util.List r6 = r1.a((int) r6, (android.content.pm.PackageInfo) r2)     // Catch:{ Exception -> 0x0160 }
            java.util.Iterator r6 = r6.iterator()     // Catch:{ Exception -> 0x0160 }
        L_0x00ab:
            boolean r9 = r6.hasNext()     // Catch:{ Exception -> 0x0160 }
            if (r9 == 0) goto L_0x0083
            java.lang.Object r9 = r6.next()     // Catch:{ Exception -> 0x0160 }
            apgu r9 = (defpackage.apgu) r9     // Catch:{ Exception -> 0x0160 }
            java.lang.Object r13 = r9.c(r10)     // Catch:{ Exception -> 0x0160 }
            aucd r13 = (defpackage.aucd) r13     // Catch:{ Exception -> 0x0160 }
            r13.a((defpackage.aucj) r9)     // Catch:{ Exception -> 0x0160 }
            apgq r13 = (defpackage.apgq) r13     // Catch:{ Exception -> 0x0160 }
            boolean r9 = r13.c     // Catch:{ Exception -> 0x0160 }
            if (r9 != 0) goto L_0x00c7
            goto L_0x00cc
        L_0x00c7:
            r13.c()     // Catch:{ Exception -> 0x0160 }
            r13.c = r8     // Catch:{ Exception -> 0x0160 }
        L_0x00cc:
            aucj r9 = r13.b     // Catch:{ Exception -> 0x0160 }
            apgu r9 = (defpackage.apgu) r9     // Catch:{ Exception -> 0x0160 }
            apgu r14 = defpackage.apgu.l     // Catch:{ Exception -> 0x0160 }
            r9.k = r7     // Catch:{ Exception -> 0x0160 }
            int r14 = r9.a     // Catch:{ Exception -> 0x0160 }
            r14 = r14 | 128(0x80, float:1.794E-43)
            r9.a = r14     // Catch:{ Exception -> 0x0160 }
            aucj r9 = r13.i()     // Catch:{ Exception -> 0x0160 }
            apgu r9 = (defpackage.apgu) r9     // Catch:{ Exception -> 0x0160 }
            r0.add(r9)     // Catch:{ Exception -> 0x0160 }
            goto L_0x00ab
        L_0x00e4:
            int r14 = r14 + 1
            goto L_0x0064
        L_0x00e8:
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ Exception -> 0x0160 }
            int r6 = r0.size()     // Catch:{ Exception -> 0x0160 }
            r5.<init>(r6)     // Catch:{ Exception -> 0x0160 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ Exception -> 0x0160 }
        L_0x00f5:
            boolean r6 = r0.hasNext()     // Catch:{ Exception -> 0x0160 }
            if (r6 == 0) goto L_0x016b
            java.lang.Object r6 = r0.next()     // Catch:{ Exception -> 0x0160 }
            apgu r6 = (defpackage.apgu) r6     // Catch:{ Exception -> 0x0160 }
            java.lang.Object r9 = r6.c(r10)     // Catch:{ Exception -> 0x0160 }
            aucd r9 = (defpackage.aucd) r9     // Catch:{ Exception -> 0x0160 }
            r9.a((defpackage.aucj) r6)     // Catch:{ Exception -> 0x0160 }
            apgq r9 = (defpackage.apgq) r9     // Catch:{ Exception -> 0x0160 }
            java.lang.String r11 = r2.packageName     // Catch:{ Exception -> 0x0160 }
            boolean r12 = r9.c     // Catch:{ Exception -> 0x0160 }
            if (r12 != 0) goto L_0x0113
            goto L_0x0118
        L_0x0113:
            r9.c()     // Catch:{ Exception -> 0x0160 }
            r9.c = r8     // Catch:{ Exception -> 0x0160 }
        L_0x0118:
            aucj r12 = r9.b     // Catch:{ Exception -> 0x0160 }
            apgu r12 = (defpackage.apgu) r12     // Catch:{ Exception -> 0x0160 }
            apgu r13 = defpackage.apgu.l     // Catch:{ Exception -> 0x0160 }
            r11.getClass()     // Catch:{ Exception -> 0x0160 }
            r13 = 7
            r12.b = r13     // Catch:{ Exception -> 0x0160 }
            r12.c = r11     // Catch:{ Exception -> 0x0160 }
            int r6 = r6.e     // Catch:{ Exception -> 0x0160 }
            if (r6 == 0) goto L_0x012b
            goto L_0x0143
        L_0x012b:
            int r6 = r2.versionCode     // Catch:{ Exception -> 0x0160 }
            boolean r11 = r9.c     // Catch:{ Exception -> 0x0160 }
            if (r11 != 0) goto L_0x0132
            goto L_0x0137
        L_0x0132:
            r9.c()     // Catch:{ Exception -> 0x0160 }
            r9.c = r8     // Catch:{ Exception -> 0x0160 }
        L_0x0137:
            aucj r11 = r9.b     // Catch:{ Exception -> 0x0160 }
            apgu r11 = (defpackage.apgu) r11     // Catch:{ Exception -> 0x0160 }
            int r12 = r11.a     // Catch:{ Exception -> 0x0160 }
            r13 = 2
            r12 = r12 | r13
            r11.a = r12     // Catch:{ Exception -> 0x0160 }
            r11.e = r6     // Catch:{ Exception -> 0x0160 }
        L_0x0143:
            aucj r6 = r9.b     // Catch:{ Exception -> 0x0160 }
            apgu r6 = (defpackage.apgu) r6     // Catch:{ Exception -> 0x0160 }
            r11 = 2
            r6.j = r11     // Catch:{ Exception -> 0x0160 }
            int r11 = r6.a     // Catch:{ Exception -> 0x0160 }
            r11 = r11 | 64
            r6.a = r11     // Catch:{ Exception -> 0x0160 }
            aucj r6 = r9.i()     // Catch:{ Exception -> 0x0160 }
            apgu r6 = (defpackage.apgu) r6     // Catch:{ Exception -> 0x0160 }
            r5.add(r6)     // Catch:{ Exception -> 0x0160 }
            goto L_0x00f5
        L_0x015a:
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ Exception -> 0x0160 }
            r5.<init>()     // Catch:{ Exception -> 0x0160 }
            goto L_0x016b
        L_0x0160:
            r0 = move-exception
            java.lang.String r5 = "Error reading phenotype XML registration format: "
            android.util.Log.e(r4, r5, r0)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
        L_0x016b:
            android.content.pm.ApplicationInfo r0 = r2.applicationInfo     // Catch:{ Exception -> 0x034c }
            if (r0 != 0) goto L_0x0171
        L_0x016f:
            goto L_0x0343
        L_0x0171:
            android.content.pm.ApplicationInfo r0 = r2.applicationInfo     // Catch:{ Exception -> 0x034c }
            android.os.Bundle r0 = r0.metaData     // Catch:{ Exception -> 0x034c }
            if (r0 == 0) goto L_0x016f
            android.content.pm.ApplicationInfo r0 = r2.applicationInfo     // Catch:{ Exception -> 0x034c }
            android.os.Bundle r0 = r0.metaData     // Catch:{ Exception -> 0x034c }
            java.lang.String r6 = "com.google.android.gms.phenotype.registration.array"
            int r0 = r0.getInt(r6, r8)     // Catch:{ Exception -> 0x034c }
            if (r0 == 0) goto L_0x033d
            android.content.pm.PackageManager r6 = r1.a     // Catch:{ Exception -> 0x034c }
            java.lang.String r9 = r2.packageName     // Catch:{ Exception -> 0x034c }
            android.content.res.Resources r6 = r6.getResourcesForApplication(r9)     // Catch:{ Exception -> 0x034c }
            java.lang.String[] r0 = r6.getStringArray(r0)     // Catch:{ Exception -> 0x034c }
            if (r0 == 0) goto L_0x0337
            java.util.ArrayList r9 = new java.util.ArrayList     // Catch:{ Exception -> 0x034c }
            int r10 = r0.length     // Catch:{ Exception -> 0x034c }
            r9.<init>(r10)     // Catch:{ Exception -> 0x034c }
            r11 = 0
        L_0x0198:
            if (r11 >= r10) goto L_0x0336
            r12 = r0[r11]     // Catch:{ Exception -> 0x034c }
            apgu r13 = defpackage.apgu.l     // Catch:{ Exception -> 0x034c }
            aucd r13 = r13.o()     // Catch:{ Exception -> 0x034c }
            apgq r13 = (defpackage.apgq) r13     // Catch:{ Exception -> 0x034c }
            boolean r14 = r13.c     // Catch:{ Exception -> 0x034c }
            if (r14 != 0) goto L_0x01a9
            goto L_0x01ae
        L_0x01a9:
            r13.c()     // Catch:{ Exception -> 0x034c }
            r13.c = r8     // Catch:{ Exception -> 0x034c }
        L_0x01ae:
            aucj r14 = r13.b     // Catch:{ Exception -> 0x034c }
            apgu r14 = (defpackage.apgu) r14     // Catch:{ Exception -> 0x034c }
            r12.getClass()     // Catch:{ Exception -> 0x034c }
            int r15 = r14.a     // Catch:{ Exception -> 0x034c }
            r15 = r15 | r7
            r14.a = r15     // Catch:{ Exception -> 0x034c }
            r14.d = r12     // Catch:{ Exception -> 0x034c }
            java.lang.String r14 = r2.packageName     // Catch:{ Exception -> 0x034c }
            boolean r15 = r13.c     // Catch:{ Exception -> 0x034c }
            if (r15 != 0) goto L_0x01c3
            goto L_0x01c8
        L_0x01c3:
            r13.c()     // Catch:{ Exception -> 0x034c }
            r13.c = r8     // Catch:{ Exception -> 0x034c }
        L_0x01c8:
            aucj r15 = r13.b     // Catch:{ Exception -> 0x034c }
            apgu r15 = (defpackage.apgu) r15     // Catch:{ Exception -> 0x034c }
            r14.getClass()     // Catch:{ Exception -> 0x034c }
            r7 = 7
            r15.b = r7     // Catch:{ Exception -> 0x034c }
            r15.c = r14     // Catch:{ Exception -> 0x034c }
            r14 = 2
            r15.j = r14     // Catch:{ Exception -> 0x034c }
            int r14 = r15.a     // Catch:{ Exception -> 0x034c }
            r14 = r14 | 64
            r15.a = r14     // Catch:{ Exception -> 0x034c }
            java.lang.String r14 = "[^A-Za-z0-9]"
            java.lang.String r15 = "_"
            java.lang.String r14 = r12.replaceAll(r14, r15)     // Catch:{ Exception -> 0x034c }
            java.lang.String r15 = "phenotype_version_"
            java.lang.String r7 = java.lang.String.valueOf(r14)     // Catch:{ Exception -> 0x034c }
            int r18 = r7.length()     // Catch:{ Exception -> 0x034c }
            if (r18 != 0) goto L_0x01f7
            java.lang.String r7 = new java.lang.String     // Catch:{ Exception -> 0x034c }
            r7.<init>(r15)     // Catch:{ Exception -> 0x034c }
            goto L_0x01fb
        L_0x01f7:
            java.lang.String r7 = r15.concat(r7)     // Catch:{ Exception -> 0x034c }
        L_0x01fb:
            java.lang.String r15 = "integer"
            java.lang.String r8 = r2.packageName     // Catch:{ Exception -> 0x034c }
            int r7 = r6.getIdentifier(r7, r15, r8)     // Catch:{ Exception -> 0x034c }
            if (r7 == 0) goto L_0x0225
            int r7 = r6.getInteger(r7)     // Catch:{ Exception -> 0x034c }
            boolean r8 = r13.c     // Catch:{ Exception -> 0x034c }
            if (r8 != 0) goto L_0x020e
            goto L_0x0214
        L_0x020e:
            r13.c()     // Catch:{ Exception -> 0x034c }
            r8 = 0
            r13.c = r8     // Catch:{ Exception -> 0x034c }
        L_0x0214:
            aucj r8 = r13.b     // Catch:{ Exception -> 0x034c }
            apgu r8 = (defpackage.apgu) r8     // Catch:{ Exception -> 0x034c }
            int r15 = r8.a     // Catch:{ Exception -> 0x034c }
            r16 = 2
            r15 = r15 | 2
            r8.a = r15     // Catch:{ Exception -> 0x034c }
            r8.e = r7     // Catch:{ Exception -> 0x034c }
            r16 = 2
            goto L_0x0240
        L_0x0225:
            int r7 = r2.versionCode     // Catch:{ Exception -> 0x034c }
            boolean r8 = r13.c     // Catch:{ Exception -> 0x034c }
            if (r8 != 0) goto L_0x022c
            goto L_0x0232
        L_0x022c:
            r13.c()     // Catch:{ Exception -> 0x034c }
            r8 = 0
            r13.c = r8     // Catch:{ Exception -> 0x034c }
        L_0x0232:
            aucj r8 = r13.b     // Catch:{ Exception -> 0x034c }
            apgu r8 = (defpackage.apgu) r8     // Catch:{ Exception -> 0x034c }
            int r15 = r8.a     // Catch:{ Exception -> 0x034c }
            r16 = 2
            r15 = r15 | 2
            r8.a = r15     // Catch:{ Exception -> 0x034c }
            r8.e = r7     // Catch:{ Exception -> 0x034c }
        L_0x0240:
            java.lang.String r7 = "phenotype_logSources_"
            java.lang.String r8 = java.lang.String.valueOf(r14)     // Catch:{ Exception -> 0x034c }
            int r15 = r8.length()     // Catch:{ Exception -> 0x034c }
            if (r15 != 0) goto L_0x0252
            java.lang.String r8 = new java.lang.String     // Catch:{ Exception -> 0x034c }
            r8.<init>(r7)     // Catch:{ Exception -> 0x034c }
            goto L_0x0256
        L_0x0252:
            java.lang.String r8 = r7.concat(r8)     // Catch:{ Exception -> 0x034c }
        L_0x0256:
            java.lang.String r7 = "array"
            java.lang.String r15 = r2.packageName     // Catch:{ Exception -> 0x034c }
            int r7 = r6.getIdentifier(r8, r7, r15)     // Catch:{ Exception -> 0x034c }
            if (r7 != 0) goto L_0x0261
            goto L_0x026e
        L_0x0261:
            java.lang.String[] r7 = r6.getStringArray(r7)     // Catch:{ Exception -> 0x034c }
            if (r7 == 0) goto L_0x026e
            java.util.List r7 = java.util.Arrays.asList(r7)     // Catch:{ Exception -> 0x034c }
            r13.a((java.lang.Iterable) r7)     // Catch:{ Exception -> 0x034c }
        L_0x026e:
            java.lang.String r7 = "phenotype_params_"
            java.lang.String r8 = java.lang.String.valueOf(r14)     // Catch:{ Exception -> 0x034c }
            int r15 = r8.length()     // Catch:{ Exception -> 0x034c }
            if (r15 != 0) goto L_0x0280
            java.lang.String r8 = new java.lang.String     // Catch:{ Exception -> 0x034c }
            r8.<init>(r7)     // Catch:{ Exception -> 0x034c }
            goto L_0x0284
        L_0x0280:
            java.lang.String r8 = r7.concat(r8)     // Catch:{ Exception -> 0x034c }
        L_0x0284:
            java.lang.String r7 = r2.packageName     // Catch:{ Exception -> 0x034c }
            int r7 = r6.getIdentifier(r8, r3, r7)     // Catch:{ Exception -> 0x034c }
            if (r7 != 0) goto L_0x028d
            goto L_0x02b5
        L_0x028d:
            java.lang.String r7 = r6.getString(r7)     // Catch:{ Exception -> 0x034c }
            r8 = 8
            byte[] r7 = android.util.Base64.decode(r7, r8)     // Catch:{ Exception -> 0x034c }
            auay r7 = defpackage.auay.a((byte[]) r7)     // Catch:{ Exception -> 0x034c }
            boolean r8 = r13.c     // Catch:{ Exception -> 0x034c }
            if (r8 != 0) goto L_0x02a0
            goto L_0x02a6
        L_0x02a0:
            r13.c()     // Catch:{ Exception -> 0x034c }
            r8 = 0
            r13.c = r8     // Catch:{ Exception -> 0x034c }
        L_0x02a6:
            aucj r8 = r13.b     // Catch:{ Exception -> 0x034c }
            apgu r8 = (defpackage.apgu) r8     // Catch:{ Exception -> 0x034c }
            r7.getClass()     // Catch:{ Exception -> 0x034c }
            int r15 = r8.a     // Catch:{ Exception -> 0x034c }
            r15 = r15 | 4
            r8.a = r15     // Catch:{ Exception -> 0x034c }
            r8.h = r7     // Catch:{ Exception -> 0x034c }
        L_0x02b5:
            java.lang.String r7 = "phenotype_subpackage_"
            java.lang.String r8 = java.lang.String.valueOf(r14)     // Catch:{ Exception -> 0x034c }
            int r14 = r8.length()     // Catch:{ Exception -> 0x034c }
            if (r14 != 0) goto L_0x02c7
            java.lang.String r8 = new java.lang.String     // Catch:{ Exception -> 0x034c }
            r8.<init>(r7)     // Catch:{ Exception -> 0x034c }
            goto L_0x02cb
        L_0x02c7:
            java.lang.String r8 = r7.concat(r8)     // Catch:{ Exception -> 0x034c }
        L_0x02cb:
            java.lang.String r7 = r2.packageName     // Catch:{ Exception -> 0x034c }
            int r7 = r6.getIdentifier(r8, r3, r7)     // Catch:{ Exception -> 0x034c }
            if (r7 != 0) goto L_0x02d6
            r8 = 0
            r15 = 1
            goto L_0x0328
        L_0x02d6:
            java.lang.String r7 = r6.getString(r7)     // Catch:{ Exception -> 0x034c }
            if (r7 == 0) goto L_0x0326
            boolean r8 = r7.isEmpty()     // Catch:{ Exception -> 0x034c }
            if (r8 != 0) goto L_0x0323
            java.lang.String r8 = java.lang.String.valueOf(r12)     // Catch:{ Exception -> 0x034c }
            int r8 = r8.length()     // Catch:{ Exception -> 0x034c }
            int r14 = r7.length()     // Catch:{ Exception -> 0x034c }
            java.lang.StringBuilder r15 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x034c }
            r17 = 1
            int r8 = r8 + 1
            int r8 = r8 + r14
            r15.<init>(r8)     // Catch:{ Exception -> 0x034c }
            r15.append(r12)     // Catch:{ Exception -> 0x034c }
            java.lang.String r8 = "#"
            r15.append(r8)     // Catch:{ Exception -> 0x034c }
            r15.append(r7)     // Catch:{ Exception -> 0x034c }
            java.lang.String r7 = r15.toString()     // Catch:{ Exception -> 0x034c }
            boolean r8 = r13.c     // Catch:{ Exception -> 0x034c }
            if (r8 != 0) goto L_0x030d
            r8 = 0
            goto L_0x0313
        L_0x030d:
            r13.c()     // Catch:{ Exception -> 0x034c }
            r8 = 0
            r13.c = r8     // Catch:{ Exception -> 0x034c }
        L_0x0313:
            aucj r12 = r13.b     // Catch:{ Exception -> 0x034c }
            apgu r12 = (defpackage.apgu) r12     // Catch:{ Exception -> 0x034c }
            r7.getClass()     // Catch:{ Exception -> 0x034c }
            int r14 = r12.a     // Catch:{ Exception -> 0x034c }
            r15 = 1
            r14 = r14 | r15
            r12.a = r14     // Catch:{ Exception -> 0x034c }
            r12.d = r7     // Catch:{ Exception -> 0x034c }
            goto L_0x0328
        L_0x0323:
            r8 = 0
            r15 = 1
            goto L_0x0328
        L_0x0326:
            r8 = 0
            r15 = 1
        L_0x0328:
            aucj r7 = r13.i()     // Catch:{ Exception -> 0x034c }
            apgu r7 = (defpackage.apgu) r7     // Catch:{ Exception -> 0x034c }
            r9.add(r7)     // Catch:{ Exception -> 0x034c }
            int r11 = r11 + 1
            r7 = 1
            goto L_0x0198
        L_0x0336:
            goto L_0x0348
        L_0x0337:
            java.util.ArrayList r9 = new java.util.ArrayList     // Catch:{ Exception -> 0x034c }
            r9.<init>()     // Catch:{ Exception -> 0x034c }
            goto L_0x0348
        L_0x033d:
            java.util.ArrayList r9 = new java.util.ArrayList     // Catch:{ Exception -> 0x034c }
            r9.<init>()     // Catch:{ Exception -> 0x034c }
            goto L_0x0348
        L_0x0343:
            java.util.ArrayList r9 = new java.util.ArrayList     // Catch:{ Exception -> 0x034c }
            r9.<init>()     // Catch:{ Exception -> 0x034c }
        L_0x0348:
            r5.addAll(r9)     // Catch:{ Exception -> 0x034c }
            goto L_0x0352
        L_0x034c:
            r0 = move-exception
            java.lang.String r2 = "Error reading phenotype alternate registration format: "
            android.util.Log.e(r4, r2, r0)
        L_0x0352:
            return r5
        L_0x0353:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r2 = "null reference"
            r0.<init>(r2)
            goto L_0x035c
        L_0x035b:
            throw r0
        L_0x035c:
            goto L_0x035b
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.agxh.a(android.content.pm.PackageInfo):java.util.List");
    }
}
