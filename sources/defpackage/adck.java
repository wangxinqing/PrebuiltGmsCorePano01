package defpackage;

import com.google.android.gms.common.api.Status;

/* renamed from: adck  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class adck extends adbw {
    final /* synthetic */ adcl a;

    public adck(adcl adcl) {
        this.a = adcl;
    }

    public final void d(Status status, byte[] bArr) {
        if (status.c()) {
            aucd o = atzy.e.o();
            try {
                o.b(bArr, aubs.c());
                this.a.a((icl) new adcq(status, (atzy) o.i()));
            } catch (auda e) {
                adcl adcl = this.a;
                adcl.a((icl) adcl.b(Status.c));
            }
        } else {
            adcl adcl2 = this.a;
            adcl2.a((icl) adcl2.b(status));
        }
    }
}
