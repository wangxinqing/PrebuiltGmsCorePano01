package defpackage;

import com.google.android.pano.widget.ScrollAdapterView;

/* renamed from: akgj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class akgj implements Runnable {
    final /* synthetic */ ScrollAdapterView a;

    public akgj(ScrollAdapterView scrollAdapterView) {
        this.a = scrollAdapterView;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:232:0x03c5, code lost:
        if (r8 < 1000.0f) goto L_0x03c7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0073, code lost:
        r2 = r9;
     */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x0214 A[Catch:{ RuntimeException -> 0x043c }] */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x0217 A[Catch:{ RuntimeException -> 0x043c }] */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x0221 A[Catch:{ RuntimeException -> 0x043c }] */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x0259 A[Catch:{ RuntimeException -> 0x043c }] */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x025a A[Catch:{ RuntimeException -> 0x043c }] */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x026e A[Catch:{ RuntimeException -> 0x043c }] */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x0296 A[Catch:{ RuntimeException -> 0x043c }] */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x02a4 A[Catch:{ RuntimeException -> 0x043c }] */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x02b4 A[Catch:{ RuntimeException -> 0x043c }] */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x02c4 A[Catch:{ RuntimeException -> 0x043c }, LOOP:5: B:175:0x02c0->B:177:0x02c4, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x02eb A[Catch:{ RuntimeException -> 0x043c }] */
    /* JADX WARNING: Removed duplicated region for block: B:186:0x02fc A[Catch:{ RuntimeException -> 0x043c }] */
    /* JADX WARNING: Removed duplicated region for block: B:187:0x02fd A[Catch:{ RuntimeException -> 0x043c }] */
    /* JADX WARNING: Removed duplicated region for block: B:194:0x031a A[Catch:{ RuntimeException -> 0x043c }] */
    /* JADX WARNING: Removed duplicated region for block: B:198:0x032c A[Catch:{ RuntimeException -> 0x043c }] */
    /* JADX WARNING: Removed duplicated region for block: B:202:0x033e A[Catch:{ RuntimeException -> 0x043c }] */
    /* JADX WARNING: Removed duplicated region for block: B:207:0x034c A[Catch:{ RuntimeException -> 0x043c }] */
    /* JADX WARNING: Removed duplicated region for block: B:224:0x03a3 A[Catch:{ RuntimeException -> 0x043c }] */
    /* JADX WARNING: Removed duplicated region for block: B:256:0x041f A[Catch:{ RuntimeException -> 0x043c }] */
    /* JADX WARNING: Removed duplicated region for block: B:258:0x0426 A[Catch:{ RuntimeException -> 0x043c }] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00b7 A[SYNTHETIC, Splitter:B:54:0x00b7] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r15 = this;
            com.google.android.pano.widget.ScrollAdapterView r0 = r15.a     // Catch:{ RuntimeException -> 0x043c }
            r1 = 0
            r0.q = r1     // Catch:{ RuntimeException -> 0x043c }
            boolean r2 = r0.l     // Catch:{ RuntimeException -> 0x043c }
            if (r2 != 0) goto L_0x000a
            goto L_0x000d
        L_0x000a:
            r0.a()     // Catch:{ RuntimeException -> 0x043c }
        L_0x000d:
            akge r2 = r0.c     // Catch:{ RuntimeException -> 0x043c }
            if (r2 != 0) goto L_0x0013
            goto L_0x0431
        L_0x0013:
            int r2 = r2.getCount()     // Catch:{ RuntimeException -> 0x043c }
            if (r2 == 0) goto L_0x0431
            int r2 = r0.b     // Catch:{ RuntimeException -> 0x043c }
            r3 = -1
            if (r2 == r3) goto L_0x042a
            r0.hasFocus()     // Catch:{ RuntimeException -> 0x043c }
            int r2 = r0.o     // Catch:{ RuntimeException -> 0x043c }
            r4 = 3
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = 2
            r7 = 1
            if (r2 >= 0) goto L_0x00a5
            akgv r2 = r0.p     // Catch:{ RuntimeException -> 0x043c }
            int r2 = r2.a     // Catch:{ RuntimeException -> 0x043c }
            if (r2 < 0) goto L_0x009f
            akge r2 = r0.c     // Catch:{ RuntimeException -> 0x043c }
            int r2 = r2.getCount()     // Catch:{ RuntimeException -> 0x043c }
            akgv r8 = r0.p     // Catch:{ RuntimeException -> 0x043c }
            long r9 = r8.b     // Catch:{ RuntimeException -> 0x043c }
            r11 = -9223372036854775808
            int r13 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r13 != 0) goto L_0x0041
            goto L_0x0091
        L_0x0041:
            int r8 = r8.a     // Catch:{ RuntimeException -> 0x043c }
            if (r8 >= r2) goto L_0x0058
            akge r9 = r0.c     // Catch:{ RuntimeException -> 0x043c }
            long r8 = r9.getItemId(r8)     // Catch:{ RuntimeException -> 0x043c }
            akgv r10 = r0.p     // Catch:{ RuntimeException -> 0x043c }
            long r11 = r10.b     // Catch:{ RuntimeException -> 0x043c }
            int r13 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r13 != 0) goto L_0x0056
            int r2 = r10.a     // Catch:{ RuntimeException -> 0x043c }
            goto L_0x009a
        L_0x0056:
            r8 = 1
            goto L_0x0059
        L_0x0058:
            r8 = 1
        L_0x0059:
            r9 = 30
            if (r8 > r9) goto L_0x0091
            akgv r9 = r0.p     // Catch:{ RuntimeException -> 0x043c }
            int r9 = r9.a     // Catch:{ RuntimeException -> 0x043c }
            int r9 = r9 + r8
            if (r9 >= r2) goto L_0x0075
            akge r10 = r0.c     // Catch:{ RuntimeException -> 0x043c }
            long r10 = r10.getItemId(r9)     // Catch:{ RuntimeException -> 0x043c }
            akgv r12 = r0.p     // Catch:{ RuntimeException -> 0x043c }
            long r12 = r12.b     // Catch:{ RuntimeException -> 0x043c }
            int r14 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r14 == 0) goto L_0x0073
            goto L_0x0075
        L_0x0073:
            r2 = r9
            goto L_0x009a
        L_0x0075:
            akgv r9 = r0.p     // Catch:{ RuntimeException -> 0x043c }
            int r9 = r9.a     // Catch:{ RuntimeException -> 0x043c }
            int r9 = r9 - r8
            if (r9 >= 0) goto L_0x007d
        L_0x007c:
            goto L_0x008e
        L_0x007d:
            if (r9 >= r2) goto L_0x007c
            akge r10 = r0.c     // Catch:{ RuntimeException -> 0x043c }
            long r10 = r10.getItemId(r9)     // Catch:{ RuntimeException -> 0x043c }
            akgv r12 = r0.p     // Catch:{ RuntimeException -> 0x043c }
            long r12 = r12.b     // Catch:{ RuntimeException -> 0x043c }
            int r14 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r14 != 0) goto L_0x008e
            goto L_0x0073
        L_0x008e:
            int r8 = r8 + 1
            goto L_0x0059
        L_0x0091:
            akgv r8 = r0.p     // Catch:{ RuntimeException -> 0x043c }
            int r8 = r8.a     // Catch:{ RuntimeException -> 0x043c }
            if (r8 >= r2) goto L_0x0099
            r2 = r8
            goto L_0x009a
        L_0x0099:
            int r2 = r2 + r3
        L_0x009a:
            akgv r8 = r0.p     // Catch:{ RuntimeException -> 0x043c }
            int r8 = r8.e     // Catch:{ RuntimeException -> 0x043c }
            goto L_0x00a7
        L_0x009f:
            akgl r2 = r0.j     // Catch:{ RuntimeException -> 0x043c }
            if (r2 == 0) goto L_0x020d
            int r2 = r2.b     // Catch:{ RuntimeException -> 0x043c }
        L_0x00a5:
            r8 = -2147483648(0xffffffff80000000, float:-0.0)
        L_0x00a7:
            r0.o = r3     // Catch:{ RuntimeException -> 0x043c }
            akgv r9 = r0.p     // Catch:{ RuntimeException -> 0x043c }
            r9.a()     // Catch:{ RuntimeException -> 0x043c }
            r9 = 0
            r0.j = r9     // Catch:{ RuntimeException -> 0x043c }
            java.lang.String r9 = "ScrollAdapterView"
            if (r2 >= 0) goto L_0x00b7
            goto L_0x01f7
        L_0x00b7:
            akge r10 = r0.c     // Catch:{ RuntimeException -> 0x043c }
            int r10 = r10.getCount()     // Catch:{ RuntimeException -> 0x043c }
            if (r2 >= r10) goto L_0x01f7
            int r10 = r0.h     // Catch:{ RuntimeException -> 0x043c }
            int r11 = r2 % r10
            int r11 = r2 - r11
            int r12 = r0.a     // Catch:{ RuntimeException -> 0x043c }
            if (r12 == 0) goto L_0x00df
            akgx r12 = r0.i     // Catch:{ RuntimeException -> 0x043c }
            akgw r13 = r12.g     // Catch:{ RuntimeException -> 0x043c }
            int r13 = r13.t     // Catch:{ RuntimeException -> 0x043c }
            if (r8 != r5) goto L_0x00dd
            akgw r12 = r12.f     // Catch:{ RuntimeException -> 0x043c }
            int r12 = r12.t     // Catch:{ RuntimeException -> 0x043c }
            int r14 = r0.s     // Catch:{ RuntimeException -> 0x043c }
            int r10 = r2 / r10
            int r14 = r14 * r10
            int r12 = r12 + r14
            goto L_0x00de
        L_0x00dd:
            r12 = r8
        L_0x00de:
            goto L_0x00f7
        L_0x00df:
            if (r8 != r5) goto L_0x00f0
            akgx r12 = r0.i     // Catch:{ RuntimeException -> 0x043c }
            akgw r12 = r12.g     // Catch:{ RuntimeException -> 0x043c }
            int r12 = r12.t     // Catch:{ RuntimeException -> 0x043c }
            int r13 = r0.r     // Catch:{ RuntimeException -> 0x043c }
            int r10 = r2 / r10
            int r13 = r13 * r10
            int r12 = r12 + r13
            r13 = r12
            goto L_0x00f1
        L_0x00f0:
            r13 = r8
        L_0x00f1:
            akgx r10 = r0.i     // Catch:{ RuntimeException -> 0x043c }
            akgw r10 = r10.f     // Catch:{ RuntimeException -> 0x043c }
            int r12 = r10.t     // Catch:{ RuntimeException -> 0x043c }
        L_0x00f7:
            r0.g = r11     // Catch:{ RuntimeException -> 0x043c }
            int r11 = r11 + r3
            r0.f = r11     // Catch:{ RuntimeException -> 0x043c }
            r0.a(r13, r12, r7, r1)     // Catch:{ RuntimeException -> 0x043c }
            r0.d = r7     // Catch:{ RuntimeException -> 0x043c }
            r0.h()     // Catch:{ RuntimeException -> 0x043c }
            android.view.View r10 = r0.b((int) r2)     // Catch:{ RuntimeException -> 0x043c }
            if (r10 != 0) goto L_0x0111
            java.lang.String r2 = "unable to restore selection view"
            android.util.Log.w(r9, r2)     // Catch:{ RuntimeException -> 0x043c }
            goto L_0x020d
        L_0x0111:
            akgn r9 = r0.k     // Catch:{ RuntimeException -> 0x043c }
            r9.a(r10, r2)     // Catch:{ RuntimeException -> 0x043c }
            if (r8 == r5) goto L_0x01f2
            int r5 = r0.w     // Catch:{ RuntimeException -> 0x043c }
            if (r5 != r4) goto L_0x01e5
            int r2 = r0.a     // Catch:{ RuntimeException -> 0x043c }
            if (r2 != 0) goto L_0x013d
            akgx r2 = r0.i     // Catch:{ RuntimeException -> 0x043c }
            int r5 = r2.c     // Catch:{ RuntimeException -> 0x043c }
            if (r5 != r7) goto L_0x012d
            android.widget.Scroller r2 = r2.b     // Catch:{ RuntimeException -> 0x043c }
            int r2 = r2.getFinalX()     // Catch:{ RuntimeException -> 0x043c }
            goto L_0x0159
        L_0x012d:
            if (r5 != r6) goto L_0x0136
            android.widget.Scroller r2 = r2.a     // Catch:{ RuntimeException -> 0x043c }
            int r2 = r2.getFinalX()     // Catch:{ RuntimeException -> 0x043c }
            goto L_0x0159
        L_0x0136:
            akgw r2 = r2.g     // Catch:{ RuntimeException -> 0x043c }
            int r2 = r2.a()     // Catch:{ RuntimeException -> 0x043c }
            goto L_0x0159
        L_0x013d:
            akgx r2 = r0.i     // Catch:{ RuntimeException -> 0x043c }
            int r5 = r2.c     // Catch:{ RuntimeException -> 0x043c }
            if (r5 != r7) goto L_0x014a
            android.widget.Scroller r2 = r2.b     // Catch:{ RuntimeException -> 0x043c }
            int r2 = r2.getFinalY()     // Catch:{ RuntimeException -> 0x043c }
            goto L_0x0159
        L_0x014a:
            if (r5 != r6) goto L_0x0153
            android.widget.Scroller r2 = r2.a     // Catch:{ RuntimeException -> 0x043c }
            int r2 = r2.getFinalY()     // Catch:{ RuntimeException -> 0x043c }
            goto L_0x0159
        L_0x0153:
            akgw r2 = r2.f     // Catch:{ RuntimeException -> 0x043c }
            int r2 = r2.a()     // Catch:{ RuntimeException -> 0x043c }
        L_0x0159:
            int r5 = r0.indexOfChild(r10)     // Catch:{ RuntimeException -> 0x043c }
            int r5 = r0.c((int) r5)     // Catch:{ RuntimeException -> 0x043c }
            r0.m = r5     // Catch:{ RuntimeException -> 0x043c }
            int r5 = com.google.android.pano.widget.ScrollAdapterView.b((android.view.View) r10)     // Catch:{ RuntimeException -> 0x043c }
            akgx r8 = r0.i     // Catch:{ RuntimeException -> 0x043c }
            akgw r8 = r8.h     // Catch:{ RuntimeException -> 0x043c }
            int r8 = r8.a()     // Catch:{ RuntimeException -> 0x043c }
            if (r8 > r2) goto L_0x0195
        L_0x0171:
            if (r5 >= r2) goto L_0x0194
            int r8 = r0.m     // Catch:{ RuntimeException -> 0x043c }
            int r9 = r0.h     // Catch:{ RuntimeException -> 0x043c }
            int r8 = r8 + r9
            android.view.View r9 = r0.b((int) r8)     // Catch:{ RuntimeException -> 0x043c }
            if (r9 == 0) goto L_0x017f
            goto L_0x018a
        L_0x017f:
            boolean r9 = r0.b((boolean) r1)     // Catch:{ RuntimeException -> 0x043c }
            if (r9 == 0) goto L_0x0194
            android.view.View r9 = r0.b((int) r8)     // Catch:{ RuntimeException -> 0x043c }
        L_0x018a:
            int r9 = com.google.android.pano.widget.ScrollAdapterView.b((android.view.View) r9)     // Catch:{ RuntimeException -> 0x043c }
            if (r9 > r2) goto L_0x01b9
            r0.m = r8     // Catch:{ RuntimeException -> 0x043c }
            r5 = r9
            goto L_0x0171
        L_0x0194:
            goto L_0x01b9
        L_0x0195:
            if (r5 <= r2) goto L_0x01b8
            int r8 = r0.m     // Catch:{ RuntimeException -> 0x043c }
            int r9 = r0.h     // Catch:{ RuntimeException -> 0x043c }
            int r8 = r8 - r9
            android.view.View r9 = r0.b((int) r8)     // Catch:{ RuntimeException -> 0x043c }
            if (r9 == 0) goto L_0x01a3
            goto L_0x01ae
        L_0x01a3:
            boolean r9 = r0.a((boolean) r1)     // Catch:{ RuntimeException -> 0x043c }
            if (r9 == 0) goto L_0x01b8
            android.view.View r9 = r0.b((int) r8)     // Catch:{ RuntimeException -> 0x043c }
        L_0x01ae:
            int r9 = com.google.android.pano.widget.ScrollAdapterView.b((android.view.View) r9)     // Catch:{ RuntimeException -> 0x043c }
            if (r9 < r2) goto L_0x01b9
            r0.m = r8     // Catch:{ RuntimeException -> 0x043c }
            r5 = r9
            goto L_0x0195
        L_0x01b8:
        L_0x01b9:
            int r2 = r0.a     // Catch:{ RuntimeException -> 0x043c }
            if (r2 != 0) goto L_0x01d1
            akgx r2 = r0.i     // Catch:{ RuntimeException -> 0x043c }
            int r8 = r2.c     // Catch:{ RuntimeException -> 0x043c }
            if (r8 != r7) goto L_0x01c9
            android.widget.Scroller r2 = r2.b     // Catch:{ RuntimeException -> 0x043c }
            r2.setFinalX(r5)     // Catch:{ RuntimeException -> 0x043c }
            goto L_0x020d
        L_0x01c9:
            if (r8 != r6) goto L_0x020d
            android.widget.Scroller r2 = r2.a     // Catch:{ RuntimeException -> 0x043c }
            r2.setFinalX(r5)     // Catch:{ RuntimeException -> 0x043c }
            goto L_0x020d
        L_0x01d1:
            akgx r2 = r0.i     // Catch:{ RuntimeException -> 0x043c }
            int r8 = r2.c     // Catch:{ RuntimeException -> 0x043c }
            if (r8 != r7) goto L_0x01dd
            android.widget.Scroller r2 = r2.b     // Catch:{ RuntimeException -> 0x043c }
            r2.setFinalY(r5)     // Catch:{ RuntimeException -> 0x043c }
            goto L_0x020d
        L_0x01dd:
            if (r8 != r6) goto L_0x020d
            android.widget.Scroller r2 = r2.a     // Catch:{ RuntimeException -> 0x043c }
            r2.setFinalY(r5)     // Catch:{ RuntimeException -> 0x043c }
            goto L_0x020d
        L_0x01e5:
            if (r5 != r7) goto L_0x01e8
            goto L_0x01ec
        L_0x01e8:
            r8 = 4
            if (r5 == r8) goto L_0x01ec
            goto L_0x01f2
        L_0x01ec:
            r0.m = r2     // Catch:{ RuntimeException -> 0x043c }
            r10.requestFocus()     // Catch:{ RuntimeException -> 0x043c }
            goto L_0x020d
        L_0x01f2:
            r0.a((int) r2, (boolean) r1)     // Catch:{ RuntimeException -> 0x043c }
            goto L_0x020d
        L_0x01f7:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ RuntimeException -> 0x043c }
            r8 = 29
            r5.<init>(r8)     // Catch:{ RuntimeException -> 0x043c }
            java.lang.String r8 = "invalid selection "
            r5.append(r8)     // Catch:{ RuntimeException -> 0x043c }
            r5.append(r2)     // Catch:{ RuntimeException -> 0x043c }
            java.lang.String r2 = r5.toString()     // Catch:{ RuntimeException -> 0x043c }
            android.util.Log.w(r9, r2)     // Catch:{ RuntimeException -> 0x043c }
        L_0x020d:
            akgx r2 = r0.i     // Catch:{ RuntimeException -> 0x043c }
            int r5 = r2.c     // Catch:{ RuntimeException -> 0x043c }
            r8 = 0
            if (r5 != r7) goto L_0x0217
            android.widget.Scroller r5 = r2.b     // Catch:{ RuntimeException -> 0x043c }
            goto L_0x021b
        L_0x0217:
            if (r5 != r6) goto L_0x0239
            android.widget.Scroller r5 = r2.a     // Catch:{ RuntimeException -> 0x043c }
        L_0x021b:
            boolean r9 = r2.b()     // Catch:{ RuntimeException -> 0x043c }
            if (r9 != 0) goto L_0x0253
            r5.computeScrollOffset()     // Catch:{ RuntimeException -> 0x043c }
            akgw r9 = r2.g     // Catch:{ RuntimeException -> 0x043c }
            int r10 = r5.getCurrX()     // Catch:{ RuntimeException -> 0x043c }
            float r10 = (float) r10     // Catch:{ RuntimeException -> 0x043c }
            r9.a((float) r10, (boolean) r7)     // Catch:{ RuntimeException -> 0x043c }
            akgw r2 = r2.f     // Catch:{ RuntimeException -> 0x043c }
            int r5 = r5.getCurrY()     // Catch:{ RuntimeException -> 0x043c }
            float r5 = (float) r5     // Catch:{ RuntimeException -> 0x043c }
            r2.a((float) r5, (boolean) r7)     // Catch:{ RuntimeException -> 0x043c }
            goto L_0x0253
        L_0x0239:
            if (r5 != r4) goto L_0x0253
            akgw r5 = r2.g     // Catch:{ RuntimeException -> 0x043c }
            float r9 = r5.k     // Catch:{ RuntimeException -> 0x043c }
            int r9 = (r9 > r8 ? 1 : (r9 == r8 ? 0 : -1))
            if (r9 != 0) goto L_0x024b
            akgw r9 = r2.f     // Catch:{ RuntimeException -> 0x043c }
            float r9 = r9.k     // Catch:{ RuntimeException -> 0x043c }
            int r9 = (r9 > r8 ? 1 : (r9 == r8 ? 0 : -1))
            if (r9 == 0) goto L_0x0253
        L_0x024b:
            r5.b()     // Catch:{ RuntimeException -> 0x043c }
            akgw r2 = r2.f     // Catch:{ RuntimeException -> 0x043c }
            r2.b()     // Catch:{ RuntimeException -> 0x043c }
        L_0x0253:
            int r2 = r0.getChildCount()     // Catch:{ RuntimeException -> 0x043c }
            if (r2 != 0) goto L_0x025a
            goto L_0x0261
        L_0x025a:
            r0.c((boolean) r1)     // Catch:{ RuntimeException -> 0x043c }
            r0.e()     // Catch:{ RuntimeException -> 0x043c }
        L_0x0261:
            android.view.View r5 = r0.getSelectedView()     // Catch:{ RuntimeException -> 0x043c }
            akgx r9 = r0.i     // Catch:{ RuntimeException -> 0x043c }
            boolean r9 = r9.b()     // Catch:{ RuntimeException -> 0x043c }
            if (r9 == 0) goto L_0x026e
        L_0x026d:
            goto L_0x0277
        L_0x026e:
            akgx r9 = r0.i     // Catch:{ RuntimeException -> 0x043c }
            boolean r9 = r9.c()     // Catch:{ RuntimeException -> 0x043c }
            if (r9 == 0) goto L_0x02e2
            goto L_0x026d
        L_0x0277:
            int r9 = r0.k()     // Catch:{ RuntimeException -> 0x043c }
            android.view.View r10 = r0.getChildAt(r9)     // Catch:{ RuntimeException -> 0x043c }
            if (r10 == r5) goto L_0x02e2
            int r11 = r0.h     // Catch:{ RuntimeException -> 0x043c }
            int r11 = r11 + r9
            android.view.View r11 = r0.getChildAt(r11)     // Catch:{ RuntimeException -> 0x043c }
            if (r11 == 0) goto L_0x02e2
            int r11 = r0.getChildCount()     // Catch:{ RuntimeException -> 0x043c }
            int r11 = r11 + r3
            r0.getChildAt(r11)     // Catch:{ RuntimeException -> 0x043c }
            int r11 = r0.a     // Catch:{ RuntimeException -> 0x043c }
            if (r11 == 0) goto L_0x02a4
            int r10 = r10.getBottom()     // Catch:{ RuntimeException -> 0x043c }
            int r11 = r0.getScrollY()     // Catch:{ RuntimeException -> 0x043c }
            int r10 = r10 - r11
            if (r10 <= 0) goto L_0x02a2
            goto L_0x02e2
        L_0x02a2:
            r10 = 0
            goto L_0x02b0
        L_0x02a4:
            int r10 = r10.getRight()     // Catch:{ RuntimeException -> 0x043c }
            int r11 = r0.getScrollX()     // Catch:{ RuntimeException -> 0x043c }
            int r10 = r10 - r11
            if (r10 > 0) goto L_0x02e2
            r10 = 0
        L_0x02b0:
            int r11 = r0.h     // Catch:{ RuntimeException -> 0x043c }
            if (r10 >= r11) goto L_0x02bf
            int r11 = r9 + r10
            boolean r11 = r0.a((int) r11)     // Catch:{ RuntimeException -> 0x043c }
            if (r11 != 0) goto L_0x02e2
            int r10 = r10 + 1
            goto L_0x02b0
        L_0x02bf:
            r9 = 0
        L_0x02c0:
            int r10 = r0.h     // Catch:{ RuntimeException -> 0x043c }
            if (r9 >= r10) goto L_0x0277
            int r10 = r0.k()     // Catch:{ RuntimeException -> 0x043c }
            android.view.View r10 = r0.getChildAt(r10)     // Catch:{ RuntimeException -> 0x043c }
            akgn r11 = r0.k     // Catch:{ RuntimeException -> 0x043c }
            int r12 = r0.f     // Catch:{ RuntimeException -> 0x043c }
            int r12 = r12 + r7
            r11.c(r10, r12)     // Catch:{ RuntimeException -> 0x043c }
            r0.removeViewInLayout(r10)     // Catch:{ RuntimeException -> 0x043c }
            r0.a((android.view.View) r10)     // Catch:{ RuntimeException -> 0x043c }
            int r10 = r0.f     // Catch:{ RuntimeException -> 0x043c }
            int r10 = r10 + r7
            r0.f = r10     // Catch:{ RuntimeException -> 0x043c }
            int r9 = r9 + 1
            goto L_0x02c0
        L_0x02e2:
            akgx r9 = r0.i     // Catch:{ RuntimeException -> 0x043c }
            boolean r9 = r9.b()     // Catch:{ RuntimeException -> 0x043c }
            if (r9 == 0) goto L_0x02eb
        L_0x02ea:
            goto L_0x02f4
        L_0x02eb:
            akgx r9 = r0.i     // Catch:{ RuntimeException -> 0x043c }
            boolean r9 = r9.c()     // Catch:{ RuntimeException -> 0x043c }
            if (r9 != 0) goto L_0x036b
            goto L_0x02ea
        L_0x02f4:
            int r9 = r0.g     // Catch:{ RuntimeException -> 0x043c }
            int r10 = r0.h     // Catch:{ RuntimeException -> 0x043c }
            int r11 = r9 % r10
            if (r11 != 0) goto L_0x02fd
            goto L_0x02fe
        L_0x02fd:
            r10 = r11
        L_0x02fe:
            int r11 = r0.f     // Catch:{ RuntimeException -> 0x043c }
            int r9 = r9 - r11
            int r9 = r9 + r3
            if (r10 > r9) goto L_0x036b
            int r9 = r0.getChildCount()     // Catch:{ RuntimeException -> 0x043c }
            int r9 = r9 + r3
            android.view.View r11 = r0.getChildAt(r9)     // Catch:{ RuntimeException -> 0x043c }
            if (r11 == r5) goto L_0x036b
            int r12 = r0.k()     // Catch:{ RuntimeException -> 0x043c }
            r0.getChildAt(r12)     // Catch:{ RuntimeException -> 0x043c }
            int r12 = r0.a     // Catch:{ RuntimeException -> 0x043c }
            if (r12 == 0) goto L_0x032c
            int r11 = r11.getTop()     // Catch:{ RuntimeException -> 0x043c }
            int r12 = r0.getScrollY()     // Catch:{ RuntimeException -> 0x043c }
            int r11 = r11 - r12
            int r12 = r0.getHeight()     // Catch:{ RuntimeException -> 0x043c }
            if (r11 >= r12) goto L_0x032a
            goto L_0x036b
        L_0x032a:
            r11 = 0
            goto L_0x033c
        L_0x032c:
            int r11 = r11.getLeft()     // Catch:{ RuntimeException -> 0x043c }
            int r12 = r0.getScrollX()     // Catch:{ RuntimeException -> 0x043c }
            int r11 = r11 - r12
            int r12 = r0.getWidth()     // Catch:{ RuntimeException -> 0x043c }
            if (r11 < r12) goto L_0x036b
            r11 = 0
        L_0x033c:
            if (r11 >= r10) goto L_0x0349
            int r12 = r9 - r11
            boolean r12 = r0.a((int) r12)     // Catch:{ RuntimeException -> 0x043c }
            if (r12 != 0) goto L_0x036b
            int r11 = r11 + 1
            goto L_0x033c
        L_0x0349:
            r9 = 0
        L_0x034a:
            if (r9 >= r10) goto L_0x02f4
            int r11 = r0.getChildCount()     // Catch:{ RuntimeException -> 0x043c }
            int r11 = r11 + r3
            android.view.View r11 = r0.getChildAt(r11)     // Catch:{ RuntimeException -> 0x043c }
            akgn r12 = r0.k     // Catch:{ RuntimeException -> 0x043c }
            int r13 = r0.g     // Catch:{ RuntimeException -> 0x043c }
            int r13 = r13 + r3
            r12.c(r11, r13)     // Catch:{ RuntimeException -> 0x043c }
            r0.removeViewInLayout(r11)     // Catch:{ RuntimeException -> 0x043c }
            r0.a((android.view.View) r11)     // Catch:{ RuntimeException -> 0x043c }
            int r11 = r0.g     // Catch:{ RuntimeException -> 0x043c }
            int r11 = r11 + r3
            r0.g = r11     // Catch:{ RuntimeException -> 0x043c }
            int r9 = r9 + 1
            goto L_0x034a
        L_0x036b:
            r0.h()     // Catch:{ RuntimeException -> 0x043c }
            if (r2 != 0) goto L_0x037c
            int r2 = r0.getChildCount()     // Catch:{ RuntimeException -> 0x043c }
            if (r2 <= 0) goto L_0x037c
            r0.c((boolean) r1)     // Catch:{ RuntimeException -> 0x043c }
            r0.e()     // Catch:{ RuntimeException -> 0x043c }
        L_0x037c:
            int r2 = r0.w     // Catch:{ RuntimeException -> 0x043c }
            if (r2 != r7) goto L_0x039f
            android.view.View r2 = r0.getFocusedChild()     // Catch:{ RuntimeException -> 0x043c }
            if (r2 == 0) goto L_0x039f
            int r2 = r0.b()     // Catch:{ RuntimeException -> 0x043c }
            if (r2 < 0) goto L_0x039f
            akge r3 = r0.c     // Catch:{ RuntimeException -> 0x043c }
            int r5 = r0.c((int) r2)     // Catch:{ RuntimeException -> 0x043c }
            boolean r3 = r3.isEnabled(r5)     // Catch:{ RuntimeException -> 0x043c }
            if (r3 == 0) goto L_0x039f
            android.view.View r2 = r0.getChildAt(r2)     // Catch:{ RuntimeException -> 0x043c }
            r0.a((android.view.View) r2, (int) r1)     // Catch:{ RuntimeException -> 0x043c }
        L_0x039f:
            int r2 = r0.w     // Catch:{ RuntimeException -> 0x043c }
            if (r2 != r7) goto L_0x03fb
            akgx r2 = r0.i     // Catch:{ RuntimeException -> 0x043c }
            boolean r2 = r2.b()     // Catch:{ RuntimeException -> 0x043c }
            if (r2 != 0) goto L_0x03c7
            akgx r2 = r0.i     // Catch:{ RuntimeException -> 0x043c }
            int r3 = r2.c     // Catch:{ RuntimeException -> 0x043c }
            if (r3 != r7) goto L_0x03b8
            android.widget.Scroller r2 = r2.b     // Catch:{ RuntimeException -> 0x043c }
            float r8 = r2.getCurrVelocity()     // Catch:{ RuntimeException -> 0x043c }
            goto L_0x03c1
        L_0x03b8:
            if (r3 != r6) goto L_0x03c0
            android.widget.Scroller r2 = r2.a     // Catch:{ RuntimeException -> 0x043c }
            float r8 = r2.getCurrVelocity()     // Catch:{ RuntimeException -> 0x043c }
        L_0x03c0:
        L_0x03c1:
            r2 = 1148846080(0x447a0000, float:1000.0)
            int r2 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r2 >= 0) goto L_0x03fb
        L_0x03c7:
            int r1 = r0.b()     // Catch:{ RuntimeException -> 0x043c }
            if (r1 >= 0) goto L_0x03ce
            goto L_0x0409
        L_0x03ce:
            akge r2 = r0.c     // Catch:{ RuntimeException -> 0x043c }
            int r3 = r0.c((int) r1)     // Catch:{ RuntimeException -> 0x043c }
            boolean r2 = r2.isEnabled(r3)     // Catch:{ RuntimeException -> 0x043c }
            if (r2 == 0) goto L_0x0409
            android.view.View r1 = r0.getChildAt(r1)     // Catch:{ RuntimeException -> 0x043c }
            akgx r2 = r0.i     // Catch:{ RuntimeException -> 0x043c }
            boolean r3 = r2.m     // Catch:{ RuntimeException -> 0x043c }
            if (r3 == 0) goto L_0x03ee
            boolean r2 = r2.n     // Catch:{ RuntimeException -> 0x043c }
            if (r2 != 0) goto L_0x03eb
            r2 = 17
            goto L_0x03f7
        L_0x03eb:
            r2 = 66
            goto L_0x03f7
        L_0x03ee:
            boolean r2 = r2.o     // Catch:{ RuntimeException -> 0x043c }
            if (r2 != 0) goto L_0x03f5
            r2 = 33
            goto L_0x03f7
        L_0x03f5:
            r2 = 130(0x82, float:1.82E-43)
        L_0x03f7:
            r0.b((android.view.View) r1, (int) r2)     // Catch:{ RuntimeException -> 0x043c }
            goto L_0x0409
        L_0x03fb:
            int r2 = r0.w     // Catch:{ RuntimeException -> 0x043c }
            if (r2 != r4) goto L_0x0409
            akgx r2 = r0.i     // Catch:{ RuntimeException -> 0x043c }
            boolean r2 = r2.b()     // Catch:{ RuntimeException -> 0x043c }
            if (r2 == 0) goto L_0x0409
            r0.w = r1     // Catch:{ RuntimeException -> 0x043c }
        L_0x0409:
            akgv r1 = r0.n     // Catch:{ RuntimeException -> 0x043c }
            int r2 = r1.a     // Catch:{ RuntimeException -> 0x043c }
            float r2 = r1.c     // Catch:{ RuntimeException -> 0x043c }
            float r1 = r1.d     // Catch:{ RuntimeException -> 0x043c }
            r0.j()     // Catch:{ RuntimeException -> 0x043c }
            r0.f()     // Catch:{ RuntimeException -> 0x043c }
            akgx r1 = r0.i     // Catch:{ RuntimeException -> 0x043c }
            boolean r1 = r1.b()     // Catch:{ RuntimeException -> 0x043c }
            if (r1 == 0) goto L_0x0426
            r0.invalidate()     // Catch:{ RuntimeException -> 0x043c }
            r0.i()     // Catch:{ RuntimeException -> 0x043c }
            return
        L_0x0426:
            r0.g()     // Catch:{ RuntimeException -> 0x043c }
            return
        L_0x042a:
            r0.requestLayout()     // Catch:{ RuntimeException -> 0x043c }
            r0.g()     // Catch:{ RuntimeException -> 0x043c }
            return
        L_0x0431:
            r0.invalidate()     // Catch:{ RuntimeException -> 0x043c }
            akge r1 = r0.c     // Catch:{ RuntimeException -> 0x043c }
            if (r1 == 0) goto L_0x043b
            r0.i()     // Catch:{ RuntimeException -> 0x043c }
        L_0x043b:
            return
        L_0x043c:
            r0 = move-exception
            com.google.android.pano.widget.ScrollAdapterView r1 = r15.a
            r1.a()
            defpackage.apev.a(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akgj.run():void");
    }
}
