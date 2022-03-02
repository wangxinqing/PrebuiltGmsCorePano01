package defpackage;

import com.google.firebase.auth.api.model.StringList;

/* renamed from: apux  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class apux implements aptv {
    public String a;
    public String b;
    public String c;
    public String d;
    public final StringList e = new StringList();
    public final StringList f = new StringList();
    public String g;
    public String h;
    private String i;

    public final void b(String str) {
        if (str == null) {
            this.f.b.add("EMAIL");
        } else {
            this.a = str;
        }
    }

    public final void c(String str) {
        iva.c(str);
        this.i = str;
    }

    public final void d(String str) {
        if (str == null) {
            this.f.b.add("PASSWORD");
        } else {
            this.b = str;
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ defpackage.audx a() {
        /*
            r10 = this;
            almp r0 = defpackage.almp.l
            aucd r0 = r0.o()
            boolean r1 = r0.c
            r2 = 0
            if (r1 != 0) goto L_0x000c
            goto L_0x0011
        L_0x000c:
            r0.c()
            r0.c = r2
        L_0x0011:
            aucj r1 = r0.b
            almp r1 = (defpackage.almp) r1
            int r3 = r1.a
            r4 = 32768(0x8000, float:4.5918E-41)
            r3 = r3 | r4
            r1.a = r3
            r3 = 1
            r1.i = r3
            com.google.firebase.auth.api.model.StringList r4 = r10.e
            java.util.List r4 = r4.b
            aucx r5 = r1.j
            boolean r5 = r5.a()
            if (r5 != 0) goto L_0x0034
            aucx r5 = r1.j
            aucx r5 = defpackage.aucj.a((defpackage.aucx) r5)
            r1.j = r5
        L_0x0034:
            aucx r1 = r1.j
            defpackage.auab.a((java.lang.Iterable) r4, (java.util.List) r1)
            com.google.firebase.auth.api.model.StringList r1 = r10.f
            java.util.List r1 = r1.b
            int r4 = r1.size()
            alnk[] r4 = new defpackage.alnk[r4]
            r5 = 0
        L_0x0044:
            int r6 = r1.size()
            if (r5 >= r6) goto L_0x009e
            java.lang.Object r6 = r1.get(r5)
            java.lang.String r6 = (java.lang.String) r6
            int r7 = r6.hashCode()
            r8 = 3
            r9 = 2
            switch(r7) {
                case -333046776: goto L_0x0078;
                case 66081660: goto L_0x006e;
                case 1939891618: goto L_0x0064;
                case 1999612571: goto L_0x005a;
                default: goto L_0x0059;
            }
        L_0x0059:
            goto L_0x0082
        L_0x005a:
            java.lang.String r7 = "PASSWORD"
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L_0x0082
            r6 = 2
            goto L_0x0083
        L_0x0064:
            java.lang.String r7 = "PHOTO_URL"
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L_0x0082
            r6 = 3
            goto L_0x0083
        L_0x006e:
            java.lang.String r7 = "EMAIL"
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L_0x0082
            r6 = 0
            goto L_0x0083
        L_0x0078:
            java.lang.String r7 = "DISPLAY_NAME"
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L_0x0082
            r6 = 1
            goto L_0x0083
        L_0x0082:
            r6 = -1
        L_0x0083:
            if (r6 == 0) goto L_0x0097
            if (r6 == r3) goto L_0x0094
            if (r6 == r9) goto L_0x0091
            if (r6 == r8) goto L_0x008e
            alnk r6 = defpackage.alnk.USER_ATTRIBUTE_NAME_UNSPECIFIED
            goto L_0x0099
        L_0x008e:
            alnk r6 = defpackage.alnk.PHOTO_URL
            goto L_0x0099
        L_0x0091:
            alnk r6 = defpackage.alnk.PASSWORD
            goto L_0x0099
        L_0x0094:
            alnk r6 = defpackage.alnk.DISPLAY_NAME
            goto L_0x0099
        L_0x0097:
            alnk r6 = defpackage.alnk.EMAIL
        L_0x0099:
            r4[r5] = r6
            int r5 = r5 + 1
            goto L_0x0044
        L_0x009e:
            java.util.List r1 = java.util.Arrays.asList(r4)
            boolean r4 = r0.c
            if (r4 != 0) goto L_0x00a7
            goto L_0x00ac
        L_0x00a7:
            r0.c()
            r0.c = r2
        L_0x00ac:
            aucj r4 = r0.b
            almp r4 = (defpackage.almp) r4
            aucs r5 = r4.h
            boolean r5 = r5.a()
            if (r5 != 0) goto L_0x00c0
            aucs r5 = r4.h
            aucs r5 = defpackage.aucj.a((defpackage.aucs) r5)
            r4.h = r5
        L_0x00c0:
            java.util.Iterator r1 = r1.iterator()
        L_0x00c4:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L_0x00d8
            java.lang.Object r5 = r1.next()
            alnk r5 = (defpackage.alnk) r5
            aucs r6 = r4.h
            int r5 = r5.h
            r6.d(r5)
            goto L_0x00c4
        L_0x00d8:
            java.lang.String r1 = r10.i
            if (r1 != 0) goto L_0x00dd
            goto L_0x00f5
        L_0x00dd:
            boolean r4 = r0.c
            if (r4 != 0) goto L_0x00e2
            goto L_0x00e7
        L_0x00e2:
            r0.c()
            r0.c = r2
        L_0x00e7:
            aucj r4 = r0.b
            almp r4 = (defpackage.almp) r4
            r1.getClass()
            int r5 = r4.a
            r3 = r3 | r5
            r4.a = r3
            r4.b = r1
        L_0x00f5:
            java.lang.String r1 = r10.a
            if (r1 != 0) goto L_0x00fa
            goto L_0x0113
        L_0x00fa:
            boolean r3 = r0.c
            if (r3 != 0) goto L_0x00ff
            goto L_0x0104
        L_0x00ff:
            r0.c()
            r0.c = r2
        L_0x0104:
            aucj r3 = r0.b
            almp r3 = (defpackage.almp) r3
            r1.getClass()
            int r4 = r3.a
            r4 = r4 | 8
            r3.a = r4
            r3.d = r1
        L_0x0113:
            java.lang.String r1 = r10.b
            if (r1 != 0) goto L_0x0118
            goto L_0x0131
        L_0x0118:
            boolean r3 = r0.c
            if (r3 != 0) goto L_0x011d
            goto L_0x0122
        L_0x011d:
            r0.c()
            r0.c = r2
        L_0x0122:
            aucj r3 = r0.b
            almp r3 = (defpackage.almp) r3
            r1.getClass()
            int r4 = r3.a
            r4 = r4 | 16
            r3.a = r4
            r3.e = r1
        L_0x0131:
            java.lang.String r1 = r10.c
            if (r1 != 0) goto L_0x0136
            goto L_0x014f
        L_0x0136:
            boolean r3 = r0.c
            if (r3 != 0) goto L_0x013b
            goto L_0x0140
        L_0x013b:
            r0.c()
            r0.c = r2
        L_0x0140:
            aucj r3 = r0.b
            almp r3 = (defpackage.almp) r3
            r1.getClass()
            int r4 = r3.a
            r4 = r4 | 4
            r3.a = r4
            r3.c = r1
        L_0x014f:
            java.lang.String r1 = r10.d
            if (r1 != 0) goto L_0x0154
            goto L_0x016d
        L_0x0154:
            boolean r3 = r0.c
            if (r3 != 0) goto L_0x0159
            goto L_0x015e
        L_0x0159:
            r0.c()
            r0.c = r2
        L_0x015e:
            aucj r3 = r0.b
            almp r3 = (defpackage.almp) r3
            r1.getClass()
            int r4 = r3.a
            r4 = r4 | 16384(0x4000, float:2.2959E-41)
            r3.a = r4
            r3.g = r1
        L_0x016d:
            java.lang.String r1 = r10.g
            if (r1 != 0) goto L_0x0172
            goto L_0x018b
        L_0x0172:
            boolean r3 = r0.c
            if (r3 != 0) goto L_0x0177
            goto L_0x017c
        L_0x0177:
            r0.c()
            r0.c = r2
        L_0x017c:
            aucj r3 = r0.b
            almp r3 = (defpackage.almp) r3
            r1.getClass()
            int r4 = r3.a
            r4 = r4 | 32
            r3.a = r4
            r3.f = r1
        L_0x018b:
            java.lang.String r1 = r10.h
            if (r1 != 0) goto L_0x0190
            goto L_0x01aa
        L_0x0190:
            boolean r3 = r0.c
            if (r3 != 0) goto L_0x0195
            goto L_0x019a
        L_0x0195:
            r0.c()
            r0.c = r2
        L_0x019a:
            aucj r2 = r0.b
            almp r2 = (defpackage.almp) r2
            r1.getClass()
            int r3 = r2.a
            r4 = 262144(0x40000, float:3.67342E-40)
            r3 = r3 | r4
            r2.a = r3
            r2.k = r1
        L_0x01aa:
            aucj r0 = r0.i()
            almp r0 = (defpackage.almp) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.apux.a():audx");
    }

    public final boolean a(String str) {
        iva.c(str);
        return this.f.b.contains(str);
    }
}
