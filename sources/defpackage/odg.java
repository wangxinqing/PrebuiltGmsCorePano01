package defpackage;

import com.google.android.gms.googlehelp.contact.chat.ChatConversationChimeraActivity;

/* renamed from: odg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class odg implements nzc {
    final /* synthetic */ ChatConversationChimeraActivity a;

    public odg(ChatConversationChimeraActivity chatConversationChimeraActivity) {
        this.a = chatConversationChimeraActivity;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x024b, code lost:
        if (new defpackage.ohr(r8.o).a(r15.v()) == false) goto L_0x0260;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x016c, code lost:
        if (r4 >= 0) goto L_0x016e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x022b, code lost:
        if (r8.o.s().a(r18, r18.toString(), -1, 1, (java.lang.String) null) != null) goto L_0x024e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(defpackage.nze r24) {
        /*
            r23 = this;
            r0 = r23
            com.google.android.gms.googlehelp.contact.chat.ChatConversationChimeraActivity r1 = r0.a
            ods r1 = r1.i
            if (r1 == 0) goto L_0x0397
            java.lang.String r1 = r1.m
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L_0x001a
            com.google.android.gms.googlehelp.contact.chat.ChatConversationChimeraActivity r1 = r0.a
            ods r1 = r1.i
            java.lang.String r2 = defpackage.odu.a(r24)
            r1.m = r2
        L_0x001a:
            com.google.android.gms.googlehelp.contact.chat.ChatConversationChimeraActivity r1 = r0.a
            long r2 = r1.k
            r4 = r24
            java.util.List r2 = defpackage.odu.a((long) r2, (defpackage.nze) r4)
            boolean r3 = r2.isEmpty()
            if (r3 != 0) goto L_0x0397
            int r3 = r2.size()
            r4 = 0
            r5 = 0
        L_0x0030:
            r6 = -1
            if (r5 < r3) goto L_0x004c
            int r3 = r2.size()
            int r3 = r3 + r6
            java.lang.Object r2 = r2.get(r3)
            oko r2 = (defpackage.oko) r2
            long r2 = r2.d
            r1.k = r2
            nze r4 = r1.s
            if (r4 == 0) goto L_0x0397
            com.google.android.gms.googlehelp.common.HelpConfig r4 = r1.p
            com.google.android.gms.googlehelp.contact.chat.ChatRequestAndConversationChimeraService.a((long) r2, (android.content.Context) r1, (com.google.android.gms.googlehelp.common.HelpConfig) r4)
            return
        L_0x004c:
            java.lang.Object r7 = r2.get(r5)
            oko r7 = (defpackage.oko) r7
            ods r8 = r1.i
            int r9 = r7.b
            r10 = 4
            if (r9 == r10) goto L_0x005a
            goto L_0x0070
        L_0x005a:
            java.lang.String r9 = r7.g
            java.lang.String r11 = r8.m
            boolean r9 = android.text.TextUtils.equals(r9, r11)
            if (r9 != 0) goto L_0x0070
            java.lang.String r9 = r7.h
            boolean r9 = android.text.TextUtils.isEmpty(r9)
            if (r9 != 0) goto L_0x0070
            java.lang.String r9 = r7.h
            r8.n = r9
        L_0x0070:
            int r8 = r7.b
            r9 = 1
            if (r8 != r10) goto L_0x008b
            boolean r10 = r1.m
            if (r10 != 0) goto L_0x008b
            r1.m = r9
            boolean r6 = r1.B()
            r1.c((boolean) r6)
            r6 = r6 ^ r9
            r1.b((boolean) r6)
            r17 = r2
            r0 = 0
            goto L_0x038e
        L_0x008b:
            r10 = 6
            if (r8 != r10) goto L_0x00ea
            ods r7 = r1.i
            r7.l = r9
            java.util.List r8 = r7.e
            int r8 = r8.size()
            int r8 = r8 + r6
            boolean r8 = r7.f(r8)
            if (r8 == 0) goto L_0x00a5
            int r8 = r7.c()
            int r8 = r8 + r6
            goto L_0x00ab
        L_0x00a5:
            int r6 = r7.c()
            int r8 = r6 + -2
        L_0x00ab:
            r7.K(r8)
            defpackage.axnx.c()
            r1.b((boolean) r4)
            android.widget.EditText r6 = r1.f
            android.text.Editable r6 = r6.getText()
            r6.clear()
            r6 = 2131428456(0x7f0b0468, float:1.8478557E38)
            android.view.View r6 = r1.findViewById(r6)
            r7 = 8
            r6.setVisibility(r7)
            r1.a((int) r4)
            java.lang.String r6 = "input_method"
            java.lang.Object r6 = r1.getSystemService(r6)
            android.view.inputmethod.InputMethodManager r6 = (android.view.inputmethod.InputMethodManager) r6
            android.widget.EditText r7 = r1.f
            android.os.IBinder r7 = r7.getWindowToken()
            r6.hideSoftInputFromWindow(r7, r4)
            r1.q()
            r1.m = r4
            r1.invalidateOptionsMenu()
            r17 = r2
            r0 = 0
            goto L_0x038e
        L_0x00ea:
            r10 = 3
            if (r8 != r10) goto L_0x038b
            ods r8 = r1.i
            long r11 = r1.o
            java.lang.Object r13 = r7.c
            oky r13 = (defpackage.oky) r13
            java.lang.String r13 = r13.b
            java.lang.String r14 = r8.m
            boolean r13 = android.text.TextUtils.equals(r13, r14)
            java.lang.String r14 = "gH_ChatConvoLytAdapter"
            if (r13 != 0) goto L_0x011d
            olg r13 = defpackage.olg.NO_TEXT_ENTERED
            int r15 = r7.b
            if (r15 != r10) goto L_0x010c
            java.lang.Object r15 = r7.c
            oky r15 = (defpackage.oky) r15
            goto L_0x010e
        L_0x010c:
            oky r15 = defpackage.oky.g
        L_0x010e:
            java.lang.String r15 = r15.b
            aufd r4 = r7.e
            if (r4 == 0) goto L_0x0115
            goto L_0x0117
        L_0x0115:
            aufd r4 = defpackage.aufd.b
        L_0x0117:
            long r9 = r4.a
            r8.a(r13, r15, r9)
            goto L_0x017f
        L_0x011d:
            int r4 = r7.a
            r4 = r4 & 128(0x80, float:1.794E-43)
            if (r4 == 0) goto L_0x0131
            aufd r4 = r7.f
            if (r4 == 0) goto L_0x0128
            goto L_0x012a
        L_0x0128:
            aufd r4 = defpackage.aufd.b
        L_0x012a:
            long r9 = r4.a
            int r4 = r8.a((long) r9)
            goto L_0x0132
        L_0x0131:
            r4 = -1
        L_0x0132:
            if (r4 < 0) goto L_0x0135
            goto L_0x016e
        L_0x0135:
            java.lang.String r9 = "Attempted to find and remove a message from the pending messages, but its client time was either null or not in the data set."
            android.util.Log.w(r14, r9)
            int r9 = r7.b
            r10 = 3
            if (r9 != r10) goto L_0x016c
            java.lang.Object r4 = r7.c
            oky r4 = (defpackage.oky) r4
            java.lang.String r4 = r4.c
            r9 = 0
        L_0x0147:
            java.util.List r10 = r8.f
            int r10 = r10.size()
            if (r9 >= r10) goto L_0x016b
            java.util.List r10 = r8.f
            java.lang.Object r10 = r10.get(r9)
            okz r10 = (defpackage.okz) r10
            oky r10 = r10.b
            if (r10 == 0) goto L_0x015c
            goto L_0x015e
        L_0x015c:
            oky r10 = defpackage.oky.g
        L_0x015e:
            java.lang.String r10 = r10.c
            boolean r10 = android.text.TextUtils.equals(r4, r10)
            if (r10 != 0) goto L_0x0169
            int r9 = r9 + 1
            goto L_0x0147
        L_0x0169:
            r4 = r9
            goto L_0x016c
        L_0x016b:
            r4 = -1
        L_0x016c:
            if (r4 < 0) goto L_0x017f
        L_0x016e:
            java.util.List r9 = r8.f
            r9.remove(r4)
            int r9 = r8.k
            int r9 = r9 + r6
            r8.k = r9
            int r4 = r8.g(r4)
            r8.M(r4)
        L_0x017f:
            aufd r4 = r7.e
            if (r4 == 0) goto L_0x0184
            goto L_0x0186
        L_0x0184:
            aufd r4 = defpackage.aufd.b
        L_0x0186:
            long r9 = r4.a
            java.lang.String r4 = defpackage.ods.a((long) r9, (long) r11)
            int r9 = r7.b
            r10 = 3
            if (r9 != r10) goto L_0x0196
            java.lang.Object r9 = r7.c
            oky r9 = (defpackage.oky) r9
            goto L_0x0198
        L_0x0196:
            oky r9 = defpackage.oky.g
        L_0x0198:
            r10 = 5
            java.lang.Object r10 = r9.c(r10)
            aucd r10 = (defpackage.aucd) r10
            r10.a((defpackage.aucj) r9)
            java.util.List r9 = r8.e
            int r9 = r9.size()
            if (r9 == 0) goto L_0x01bc
            java.util.List r11 = r8.h
            int r12 = r9 + -1
            boolean r13 = r8.a((defpackage.oko) r7)
            r15 = 1
            r13 = r13 ^ r15
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r13)
            r11.set(r12, r13)
            goto L_0x01c6
        L_0x01bc:
            aufd r11 = r7.e
            if (r11 != 0) goto L_0x01c2
            aufd r11 = defpackage.aufd.b
        L_0x01c2:
            long r11 = r11.a
            r8.i = r11
        L_0x01c6:
            aucj r11 = r10.b
            oky r11 = (defpackage.oky) r11
            aucx r11 = r11.e
            int r11 = r11.size()
            if (r11 == 0) goto L_0x0308
            java.util.ArrayList r11 = new java.util.ArrayList
            aucj r12 = r10.b
            oky r12 = (defpackage.oky) r12
            aucx r12 = r12.e
            int r12 = r12.size()
            r11.<init>(r12)
            r12 = 0
        L_0x01e2:
            aucj r13 = r10.b
            oky r13 = (defpackage.oky) r13
            aucx r13 = r13.e
            int r13 = r13.size()
            if (r12 >= r13) goto L_0x02aa
            aucj r13 = r10.b
            oky r13 = (defpackage.oky) r13
            aucx r13 = r13.e
            java.lang.Object r13 = r13.get(r12)
            avlz r13 = (defpackage.avlz) r13
            oab r15 = defpackage.ods.a((defpackage.avlz) r13)
            if (r15 == 0) goto L_0x025e
            boolean r16 = r15.m()
            if (r16 == 0) goto L_0x022e
            java.lang.String r6 = r15.g
            boolean r6 = android.text.TextUtils.isEmpty(r6)
            if (r6 == 0) goto L_0x020f
            goto L_0x022e
        L_0x020f:
            java.lang.String r6 = r15.g
            android.net.Uri r18 = android.net.Uri.parse(r6)
            com.google.android.gms.googlehelp.contact.chat.ChatConversationChimeraActivity r6 = r8.o
            oah r17 = r6.s()
            java.lang.String r19 = r18.toString()
            r20 = -1
            r21 = 1
            r22 = 0
            android.content.Intent r6 = r17.a((android.net.Uri) r18, (java.lang.String) r19, (int) r20, (int) r21, (java.lang.String) r22)
            r17 = r2
            if (r6 == 0) goto L_0x0260
            goto L_0x024e
        L_0x022e:
            boolean r6 = r15.n()
            if (r6 == 0) goto L_0x025b
            boolean r6 = r15.u()
            if (r6 == 0) goto L_0x025b
            com.google.android.gms.googlehelp.contact.chat.ChatConversationChimeraActivity r6 = r8.o
            avmc r0 = r15.v()
            r17 = r2
            ohr r2 = new ohr
            r2.<init>(r6)
            boolean r0 = r2.a((defpackage.avmc) r0)
            if (r0 != 0) goto L_0x024e
            goto L_0x0260
        L_0x024e:
            r11.add(r13)
            com.google.android.gms.googlehelp.contact.chat.ChatConversationChimeraActivity r0 = r8.o
            r2 = 159(0x9f, float:2.23E-43)
            java.lang.String r6 = r15.e
            defpackage.okg.a((defpackage.nzu) r0, (int) r2, (java.lang.String) r6)
            goto L_0x02a1
        L_0x025b:
            r17 = r2
            goto L_0x0260
        L_0x025e:
            r17 = r2
        L_0x0260:
            java.lang.String r0 = java.lang.String.valueOf(r13)
            java.lang.String r2 = java.lang.String.valueOf(r0)
            int r2 = r2.length()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            int r2 = r2 + 36
            r6.<init>(r2)
            java.lang.String r2 = "Received unsupported action result: "
            r6.append(r2)
            r6.append(r0)
            java.lang.String r0 = r6.toString()
            android.util.Log.w(r14, r0)
            java.lang.String r0 = r13.f
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r2 = "help://action/"
            int r6 = r0.length()
            if (r6 != 0) goto L_0x0296
            java.lang.String r0 = new java.lang.String
            r0.<init>(r2)
            goto L_0x029a
        L_0x0296:
            java.lang.String r0 = r2.concat(r0)
        L_0x029a:
            com.google.android.gms.googlehelp.contact.chat.ChatConversationChimeraActivity r2 = r8.o
            r6 = 160(0xa0, float:2.24E-43)
            defpackage.okg.a((defpackage.nzu) r2, (int) r6, (java.lang.String) r0)
        L_0x02a1:
            int r12 = r12 + 1
            r0 = r23
            r2 = r17
            r6 = -1
            goto L_0x01e2
        L_0x02aa:
            r17 = r2
            int r0 = r11.size()
            if (r0 > 0) goto L_0x02cb
            boolean r0 = r10.c
            if (r0 != 0) goto L_0x02b7
            goto L_0x02bd
        L_0x02b7:
            r10.c()
            r0 = 0
            r10.c = r0
        L_0x02bd:
            aucj r0 = r10.b
            oky r0 = (defpackage.oky) r0
            oky r2 = defpackage.oky.g
            aucx r2 = defpackage.aucj.s()
            r0.e = r2
            r0 = 0
            goto L_0x030b
        L_0x02cb:
            boolean r0 = r10.c
            if (r0 != 0) goto L_0x02d0
            goto L_0x02d6
        L_0x02d0:
            r10.c()
            r0 = 0
            r10.c = r0
        L_0x02d6:
            aucj r0 = r10.b
            oky r0 = (defpackage.oky) r0
            oky r2 = defpackage.oky.g
            aucx r2 = defpackage.aucj.s()
            r0.e = r2
            boolean r0 = r10.c
            if (r0 != 0) goto L_0x02e8
            r0 = 0
            goto L_0x02ee
        L_0x02e8:
            r10.c()
            r0 = 0
            r10.c = r0
        L_0x02ee:
            aucj r2 = r10.b
            oky r2 = (defpackage.oky) r2
            aucx r6 = r2.e
            boolean r6 = r6.a()
            if (r6 != 0) goto L_0x0302
            aucx r6 = r2.e
            aucx r6 = defpackage.aucj.a((defpackage.aucx) r6)
            r2.e = r6
        L_0x0302:
            aucx r2 = r2.e
            defpackage.auab.a((java.lang.Iterable) r11, (java.util.List) r2)
            goto L_0x030b
        L_0x0308:
            r17 = r2
            r0 = 0
        L_0x030b:
            aufd r2 = r7.e
            if (r2 == 0) goto L_0x0310
            goto L_0x0312
        L_0x0310:
            aufd r2 = defpackage.aufd.b
        L_0x0312:
            long r11 = r2.a
            r8.j = r11
            java.util.List r2 = r8.h
            r6 = 1
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r6)
            r2.add(r11)
            java.util.List r2 = r8.e
            aucj r6 = r10.i()
            oky r6 = (defpackage.oky) r6
            r2.add(r6)
            java.util.List r2 = r8.g
            r2.add(r4)
            int r2 = r8.c()
            r4 = -1
            int r2 = r2 + r4
            if (r9 <= 0) goto L_0x0355
            java.util.List r4 = r8.e
            int r6 = r9 + -1
            java.lang.Object r4 = r4.get(r6)
            oky r4 = (defpackage.oky) r4
            java.lang.String r4 = r4.b
            aucj r6 = r10.b
            oky r6 = (defpackage.oky) r6
            java.lang.String r6 = r6.b
            boolean r4 = r4.equals(r6)
            if (r4 != 0) goto L_0x0351
            goto L_0x0355
        L_0x0351:
            r8.K(r2)
            goto L_0x036d
        L_0x0355:
            int r4 = r8.k
            r6 = 1
            int r4 = r4 + r6
            r8.k = r4
            int r2 = r2 + 1
            ou r4 = r8.a
            java.lang.Integer r6 = java.lang.Integer.valueOf(r2)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r4.put(r6, r9)
            r8.L(r2)
        L_0x036d:
            defpackage.axnx.c()
            r1.q()
            r2 = 2131952933(0x7f130525, float:1.9542323E38)
            r1.b((int) r2)
            int r2 = r7.b
            r4 = 3
            if (r2 != r4) goto L_0x0383
            java.lang.Object r2 = r7.c
            oky r2 = (defpackage.oky) r2
            goto L_0x0385
        L_0x0383:
            oky r2 = defpackage.oky.g
        L_0x0385:
            java.lang.String r2 = r2.c
            r1.a((java.lang.String) r2)
            goto L_0x038e
        L_0x038b:
            r17 = r2
            r0 = 0
        L_0x038e:
            int r5 = r5 + 1
            r0 = r23
            r2 = r17
            r4 = 0
            goto L_0x0030
        L_0x0397:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.odg.a(nze):void");
    }
}
