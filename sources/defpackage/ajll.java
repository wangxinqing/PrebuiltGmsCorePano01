package defpackage;

/* renamed from: ajll  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ajll {
    final /* synthetic */ ajlm a;

    public ajll(ajlm ajlm) {
        this.a = ajlm;
    }

    private final void a() {
        ajlm ajlm = this.a;
        ajlm.i = !ajlm.a() ? 5 : 4;
    }

    private final void b() {
        ajlm ajlm = this.a;
        ajlm.i = !ajlm.a() ? 7 : 6;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0076, code lost:
        r0.i = 9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0086, code lost:
        r0.i = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00d7, code lost:
        r11 = r10.a.i;
        r0 = new java.lang.StringBuilder(47);
        r0.append("Exiting StateMachine onEvent, state=");
        r0.append(r11);
        r0.toString();
        r11 = r10.a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00f3, code lost:
        if (defpackage.ajhb.b() == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00f5, code lost:
        r0 = r11.a(0);
        r1 = r11.d.k();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0101, code lost:
        if (r1 == null) goto L_0x011f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x010f, code lost:
        if (r0.d().equals(r1.d()) == false) goto L_0x011f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x011d, code lost:
        if (r0.e().equals(r1.e()) != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x011f, code lost:
        r11.b(r11.i);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(int r11) {
        /*
            r10 = this;
            ajlm r0 = r10.a
            boolean r1 = defpackage.aztb.M()
            r2 = 5
            r3 = 6
            r4 = 4
            r5 = 3
            if (r1 != 0) goto L_0x000d
            goto L_0x0020
        L_0x000d:
            if (r11 == r5) goto L_0x001c
            if (r11 == r4) goto L_0x001a
            if (r11 == r2) goto L_0x0018
            if (r11 == r3) goto L_0x0016
            goto L_0x0020
        L_0x0016:
            r1 = 6
            goto L_0x001d
        L_0x0018:
            r1 = 4
            goto L_0x001d
        L_0x001a:
            r1 = 5
            goto L_0x001d
        L_0x001c:
            r1 = 3
        L_0x001d:
            r0.c(r1)
        L_0x0020:
            ajlm r0 = r10.a
            int r0 = r0.i
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r6 = 66
            r1.<init>(r6)
            java.lang.String r6 = "Entering StateMachine onEvent, state="
            r1.append(r6)
            r1.append(r0)
            java.lang.String r0 = ", code="
            r1.append(r0)
            r1.append(r11)
            r1.toString()
            ajlm r0 = r10.a
            int r1 = r0.i
            r6 = 9
            r7 = 1
            r8 = 7
            r9 = 8
            switch(r1) {
                case 2: goto L_0x00c7;
                case 3: goto L_0x00a3;
                case 4: goto L_0x0091;
                case 5: goto L_0x0084;
                case 6: goto L_0x0074;
                case 7: goto L_0x0065;
                case 8: goto L_0x00c7;
                case 9: goto L_0x00c7;
                default: goto L_0x004b;
            }
        L_0x004b:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r0 = 38
            r11.<init>(r0)
            java.lang.String r0 = "Currently in unknown state "
            r11.append(r0)
            r11.append(r1)
            java.lang.String r11 = r11.toString()
            java.lang.String r0 = "GCoreUlr"
            defpackage.ajix.c(r0, r11)
            goto L_0x00d7
        L_0x0065:
            if (r11 != r7) goto L_0x006b
            r0.i = r5
            goto L_0x00d7
        L_0x006b:
            if (r11 != r3) goto L_0x006e
            goto L_0x0076
        L_0x006e:
            if (r11 != r8) goto L_0x00d7
            r0.i = r3
            goto L_0x00d7
        L_0x0074:
            if (r11 != r3) goto L_0x007a
        L_0x0076:
            r0.i = r6
            goto L_0x00d7
        L_0x007a:
            if (r11 != r9) goto L_0x00d7
            ajmn r11 = r0.d
            boolean r11 = r11.f
            if (r11 != 0) goto L_0x0086
            r5 = 7
            goto L_0x0086
        L_0x0084:
            if (r11 != r7) goto L_0x0089
        L_0x0086:
            r0.i = r5
            goto L_0x00d7
        L_0x0089:
            if (r11 != r2) goto L_0x008c
            goto L_0x0093
        L_0x008c:
            if (r11 != r8) goto L_0x00d7
            r0.i = r4
            goto L_0x00d7
        L_0x0091:
            if (r11 != r2) goto L_0x0096
        L_0x0093:
            r0.i = r9
            goto L_0x00d7
        L_0x0096:
            if (r11 != r9) goto L_0x00d7
            ajmn r11 = r0.d
            boolean r11 = r11.f
            if (r11 != 0) goto L_0x009f
            goto L_0x00a0
        L_0x009f:
            r2 = 3
        L_0x00a0:
            r0.i = r2
            goto L_0x00d7
        L_0x00a3:
            r1 = 2
            if (r11 != r1) goto L_0x00a9
            r0.i = r1
            goto L_0x00d7
        L_0x00a9:
            if (r11 != r5) goto L_0x00af
            r10.a()
            goto L_0x00d7
        L_0x00af:
            if (r11 != r4) goto L_0x00b5
            r10.b()
            goto L_0x00d7
        L_0x00b5:
            if (r11 != r8) goto L_0x00d7
            ajmn r11 = r0.d
            boolean r1 = r11.i
            if (r1 != 0) goto L_0x00c4
            boolean r11 = r11.j
            if (r11 == 0) goto L_0x00d7
            r0.i = r3
            goto L_0x00d7
        L_0x00c4:
            r0.i = r4
            goto L_0x00d7
        L_0x00c7:
            if (r11 != r7) goto L_0x00cc
            r0.i = r5
            goto L_0x00d7
        L_0x00cc:
            if (r11 != r5) goto L_0x00d2
            r10.a()
            goto L_0x00d7
        L_0x00d2:
            if (r11 != r4) goto L_0x00d7
            r10.b()
        L_0x00d7:
            ajlm r11 = r10.a
            int r11 = r11.i
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 47
            r0.<init>(r1)
            java.lang.String r1 = "Exiting StateMachine onEvent, state="
            r0.append(r1)
            r0.append(r11)
            r0.toString()
            ajlm r11 = r10.a
            boolean r0 = defpackage.ajhb.b()
            if (r0 == 0) goto L_0x0124
            r0 = 0
            com.google.android.ulr.ApiRate r0 = r11.a((long) r0)
            ajmn r1 = r11.d
            com.google.android.ulr.ApiRate r1 = r1.k()
            if (r1 == 0) goto L_0x011f
            java.lang.Long r2 = r0.d()
            java.lang.Long r3 = r1.d()
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x011f
            java.lang.String r0 = r0.e()
            java.lang.String r1 = r1.e()
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0124
        L_0x011f:
            int r0 = r11.i
            r11.b(r0)
        L_0x0124:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajll.a(int):void");
    }
}
