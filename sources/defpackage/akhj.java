package defpackage;

import android.content.Context;
import java.util.concurrent.ExecutorService;

/* renamed from: akhj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class akhj {
    public final Context a;
    private final hol b;
    private final int c;
    private final ExecutorService d;

    public akhj(Context context, hol hol, int i, ExecutorService executorService) {
        this.a = context.getApplicationContext();
        this.b = hol;
        this.c = i;
        this.d = executorService;
    }

    private final long a() {
        if (this.c != 1) {
            return azay.a.a().a();
        }
        return azay.a.a().b();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v17, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: aucd} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(defpackage.anui r9) {
        /*
            r8 = this;
            r0 = 5
            java.lang.Object r1 = r9.c(r0)
            aucd r1 = (defpackage.aucd) r1
            r1.a((defpackage.aucj) r9)
            long r2 = r8.a()
            int r9 = (int) r2
            aucj r2 = r1.b
            anui r2 = (defpackage.anui) r2
            int r3 = r2.a
            r3 = r3 & 2
            r4 = 0
            if (r3 == 0) goto L_0x002b
            aoei r2 = r2.c
            if (r2 != 0) goto L_0x0020
            aoei r2 = defpackage.aoei.w
        L_0x0020:
            java.lang.Object r3 = r2.c(r0)
            aucd r3 = (defpackage.aucd) r3
            r3.a((defpackage.aucj) r2)
            goto L_0x002c
        L_0x002b:
            r3 = r4
        L_0x002c:
            aucj r2 = r1.b
            anui r2 = (defpackage.anui) r2
            int r2 = r2.b
            int r2 = defpackage.anuh.a(r2)
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L_0x003d
            if (r2 == r5) goto L_0x003d
            goto L_0x0056
        L_0x003d:
            if (r3 == 0) goto L_0x0056
            boolean r2 = r3.c
            if (r2 != 0) goto L_0x0044
            goto L_0x0049
        L_0x0044:
            r3.c()
            r3.c = r6
        L_0x0049:
            aucj r2 = r3.b
            aoei r2 = (defpackage.aoei) r2
            aoei r7 = defpackage.aoei.w
            int r7 = r2.a
            r7 = r7 | r5
            r2.a = r7
            r2.b = r9
        L_0x0056:
            aucj r2 = r1.b
            anui r2 = (defpackage.anui) r2
            int r7 = r2.a
            r7 = r7 & 16
            if (r7 == 0) goto L_0x0073
            aocf r2 = r2.f
            if (r2 == 0) goto L_0x0065
            goto L_0x0067
        L_0x0065:
            aocf r2 = defpackage.aocf.s
        L_0x0067:
            java.lang.Object r0 = r2.c(r0)
            r4 = r0
            aucd r4 = (defpackage.aucd) r4
            r4.a((defpackage.aucj) r2)
            goto L_0x0074
        L_0x0073:
        L_0x0074:
            aucj r0 = r1.b
            anui r0 = (defpackage.anui) r0
            int r0 = r0.b
            int r0 = defpackage.anuh.a(r0)
            if (r0 == 0) goto L_0x00bd
            r2 = 4
            if (r0 != r2) goto L_0x00bd
            if (r4 == 0) goto L_0x00bd
            boolean r0 = r4.c
            if (r0 != 0) goto L_0x008a
            goto L_0x008f
        L_0x008a:
            r4.c()
            r4.c = r6
        L_0x008f:
            aucj r0 = r4.b
            aocf r0 = (defpackage.aocf) r0
            aocf r2 = defpackage.aocf.s
            int r2 = r0.a
            r2 = r2 | r5
            r0.a = r2
            r0.b = r9
            boolean r9 = r1.c
            if (r9 != 0) goto L_0x00a1
            goto L_0x00a6
        L_0x00a1:
            r1.c()
            r1.c = r6
        L_0x00a6:
            aucj r9 = r1.b
            anui r9 = (defpackage.anui) r9
            aucj r0 = r4.i()
            aocf r0 = (defpackage.aocf) r0
            anui r2 = defpackage.anui.p
            r0.getClass()
            r9.f = r0
            int r0 = r9.a
            r0 = r0 | 16
            r9.a = r0
        L_0x00bd:
            if (r3 != 0) goto L_0x00c0
            goto L_0x00e1
        L_0x00c0:
            boolean r9 = r1.c
            if (r9 != 0) goto L_0x00c5
            goto L_0x00ca
        L_0x00c5:
            r1.c()
            r1.c = r6
        L_0x00ca:
            aucj r9 = r1.b
            anui r9 = (defpackage.anui) r9
            aucj r0 = r3.i()
            aoei r0 = (defpackage.aoei) r0
            anui r2 = defpackage.anui.p
            r0.getClass()
            r9.c = r0
            int r0 = r9.a
            r0 = r0 | 2
            r9.a = r0
        L_0x00e1:
            aucj r9 = r1.i()
            anui r9 = (defpackage.anui) r9
            long r0 = r8.a()
            hol r2 = r8.b
            hoi r9 = r2.a((defpackage.audx) r9)
            java.util.concurrent.ExecutorService r2 = r8.d
            akhi r3 = new akhi
            int r1 = (int) r0
            r3.<init>(r8, r1, r9)
            r2.execute(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akhj.a(anui):void");
    }
}
