package defpackage;

import com.google.android.gms.common.api.Status;

/* renamed from: adch  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class adch extends adbw {
    final /* synthetic */ adci a;

    protected adch(adci adci) {
        this.a = adci;
    }

    public final void c(Status status, byte[] bArr) {
        if (status.c()) {
            aucd o = atyx.n.o();
            try {
                o.b(bArr, aubs.c());
                this.a.a((icl) new adco(status, (atyx) o.i()));
            } catch (auda e) {
                adci adci = this.a;
                adci.a((icl) adci.b(Status.c));
            }
        } else {
            adci adci2 = this.a;
            adci2.a((icl) adci2.b(status));
        }
    }
}
