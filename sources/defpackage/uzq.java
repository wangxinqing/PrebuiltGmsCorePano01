package defpackage;

/* renamed from: uzq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class uzq extends arwm {
    final /* synthetic */ uzr a;
    private final int b;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public uzq(defpackage.uzr r3, int r4) {
        /*
            r2 = this;
            r2.a = r3
            r3 = 1
            if (r4 == r3) goto L_0x001a
            r3 = 2
            if (r4 == r3) goto L_0x0017
            r3 = 3
            if (r4 == r3) goto L_0x0014
            r3 = 4
            if (r4 == r3) goto L_0x0011
            java.lang.String r3 = "WAIT_FOR_STOP_BROADCAST_ELAPSED"
            goto L_0x001c
        L_0x0011:
            java.lang.String r3 = "BROADCAST_TIME_ELAPSED"
            goto L_0x001c
        L_0x0014:
            java.lang.String r3 = "NO_BROADCAST_DETECTED"
            goto L_0x001c
        L_0x0017:
            java.lang.String r3 = "BROADCAST_DETECTED"
            goto L_0x001c
        L_0x001a:
            java.lang.String r3 = "START"
        L_0x001c:
            java.lang.String r0 = "CarrierSenseEvent_"
            int r1 = r3.length()
            if (r1 != 0) goto L_0x002a
            java.lang.String r3 = new java.lang.String
            r3.<init>(r0)
            goto L_0x002e
        L_0x002a:
            java.lang.String r3 = r0.concat(r3)
        L_0x002e:
            r2.<init>(r3)
            r2.b = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uzq.<init>(uzr, int):void");
    }

    public final void run() {
        if (this.a.g) {
            int i = this.b;
            if (i == 1 || i == 2) {
                this.a.a(false);
            } else if (i == 3) {
                this.a.a();
                uzr uzr = this.a;
                uzr.e.a(uzr.b, uzr.c);
                uzr uzr2 = this.a;
                auyp auyp = uzr2.f.f.e;
                if (auyp == null) {
                    auyp = auyp.g;
                }
                long length = auyp.f * ((long) uzr2.c.a.length);
                auyp auyp2 = uzr2.f.f.e;
                if (auyp2 == null) {
                    auyp2 = auyp.g;
                }
                uzr2.a(4, uzr2.a(length, auyp2.a));
            } else if (i != 4) {
                this.a.a(true);
            } else {
                this.a.b();
                uzr uzr3 = this.a;
                auyp auyp3 = uzr3.f.f.e;
                if (auyp3 == null) {
                    auyp3 = auyp.g;
                }
                uzr3.a(5, auyp3.e);
            }
        }
    }
}
