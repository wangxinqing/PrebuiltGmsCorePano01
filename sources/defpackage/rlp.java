package defpackage;

/* renamed from: rlp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class rlp implements Runnable {
    final /* synthetic */ CharSequence a;
    final /* synthetic */ rlq b;

    public rlp(rlq rlq, CharSequence charSequence) {
        this.b = rlq;
        this.a = charSequence;
    }

    public final void run() {
        rlr rlr = this.b.a;
        rjl rjl = rlr.i;
        icc icc = rlr.c;
        String charSequence = this.a.toString();
        rlr rlr2 = this.b.a;
        icf a2 = rjl.a(icc, charSequence, rlr2.e, rlr2.f);
        this.b.a.a(a2);
        a2.a((icm) new rlo(this));
    }
}
