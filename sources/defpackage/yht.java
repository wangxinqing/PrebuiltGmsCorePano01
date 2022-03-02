package defpackage;

import android.content.Context;
import com.google.android.gms.common.api.Status;

/* renamed from: yht  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class yht extends ygu {
    private final ygj a;
    private final String b;
    private final boolean c;
    private final yhu d;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public yht(defpackage.ygj r11, java.lang.String r12, int r13, java.lang.String[] r14, int[] r15, byte[] r16, boolean r17, java.lang.String r18) {
        /*
            r10 = this;
            r0 = r10
            r7 = r17
            if (r7 != 0) goto L_0x0008
            avtj r1 = defpackage.avtj.REGULAR_REGISTER
            goto L_0x000a
        L_0x0008:
            avtj r1 = defpackage.avtj.WEAK_REGISTER
        L_0x000a:
            java.lang.String r2 = "RegisterOperationCall"
            r10.<init>(r2, r1)
            defpackage.iva.a((java.lang.Object) r11)
            r1 = r11
            r0.a = r1
            r2 = r12
            r0.b = r2
            r0.c = r7
            yhu r9 = new yhu
            r1 = r9
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r7 = r17
            r8 = r18
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            r0.d = r9
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yht.<init>(ygj, java.lang.String, int, java.lang.String[], int[], byte[], boolean, java.lang.String):void");
    }

    private final void b(Status status) {
        if (this.c) {
            this.a.b(status);
        } else {
            this.a.a(status);
        }
    }

    public final avst a() {
        yhu yhu = this.d;
        avss avss = (avss) avst.m.o();
        String str = yhu.a.d;
        if (avss.c) {
            avss.c();
            avss.c = false;
        }
        avst avst = (avst) avss.b;
        str.getClass();
        int i = avst.a | 1;
        avst.a = i;
        avst.b = str;
        apgu apgu = yhu.a;
        int i2 = apgu.e;
        avst.a = i | 2;
        avst.c = i2;
        avss.a(apgu.f);
        avss.b(yhu.a.g);
        yhx yhx = yhu.b;
        if (yhx != null) {
            int i3 = yhx.c - 1;
            if (avss.c) {
                avss.c();
                avss.c = false;
            }
            avst avst2 = (avst) avss.b;
            avst2.a |= 64;
            avst2.j = i3;
        }
        return (avst) avss.i();
    }

    public final void b(Context context) {
        yhu yhu = this.d;
        yhu.b = yhy.a(context, yhu.a, (String) null);
        yhx yhx = yhu.b;
        if (yhs.a(this.b, yhx.c)) {
            yij.a(context, yhx.c, this.b);
        }
        b(Status.a);
    }

    public final void b(Context context, yfw yfw) {
        yhu yhu = this.d;
        yhu.b = yhy.a(context, yfw, yhu.a, (String) null);
        yhx yhx = yhu.b;
        if (yhs.a(this.b, yhx.c)) {
            yij.a(context, yhx.c, this.b);
        }
        b(Status.a);
    }

    public final void a(Status status) {
        b(status);
    }
}
