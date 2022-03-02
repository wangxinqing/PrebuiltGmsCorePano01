package defpackage;

import com.google.android.gms.nearby.bootstrap.request.EnableTargetRequest;

/* renamed from: tfk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class tfk implements Runnable {
    final /* synthetic */ EnableTargetRequest a;
    final /* synthetic */ tfq b;

    public tfk(tfq tfq, EnableTargetRequest enableTargetRequest) {
        this.b = tfq;
        this.a = enableTargetRequest;
    }

    /* JADX WARNING: type inference failed for: r13v0, types: [tdn] */
    /* JADX WARNING: type inference failed for: r2v6, types: [tcz] */
    /* JADX WARNING: type inference failed for: r2v7, types: [tct] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r14 = this;
            tfq r0 = r14.b
            tdf r0 = r0.a()
            if (r0 == 0) goto L_0x0077
            com.google.android.gms.nearby.bootstrap.request.EnableTargetRequest r1 = r14.a
            java.lang.String r6 = r1.b
            java.lang.String r7 = r1.c
            byte r8 = r1.g
            byte r2 = r1.h
            tdv r9 = r1.d
            tdy r10 = r1.e
            teb r1 = r1.f
            boolean r3 = r0.c()
            r4 = 2982(0xba6, float:4.179E-42)
            if (r3 == 0) goto L_0x0024
            r0.a(r1, r4)
            return
        L_0x0024:
            boolean r3 = r0.a()
            if (r3 == 0) goto L_0x002e
            r0.a(r1, r4)
            return
        L_0x002e:
            boolean r3 = r0.b()
            if (r3 != 0) goto L_0x0073
            int r3 = android.os.Build.VERSION.SDK_INT
            ased r3 = r0.g
            arwa r4 = r0.j
            android.bluetooth.BluetoothAdapter r5 = r0.h
            tde r11 = new tde
            aymf r12 = defpackage.aymf.a
            aymg r12 = r12.a()
            long r12 = r12.b()
            r11.<init>(r0, r12)
            r12 = 2
            if (r2 != r12) goto L_0x005b
            tct r13 = new tct
            r2 = r13
            r5 = r6
            r6 = r7
            r7 = r8
            r8 = r9
            r9 = r10
            r10 = r11
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            goto L_0x0061
        L_0x005b:
            tcz r13 = new tcz
            r2 = r13
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
        L_0x0061:
            r0.b = r13
            arwa r2 = r0.j
            tdn r3 = r0.b
            r2.a((int) r12, (defpackage.tdk) r3)
            tdn r2 = r0.b
            r2.j()
            r0.b(r1)
            return
        L_0x0073:
            r2 = -1
            r0.a(r1, r2)
        L_0x0077:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tfk.run():void");
    }
}
