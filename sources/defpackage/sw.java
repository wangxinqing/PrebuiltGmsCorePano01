package defpackage;

import com.google.android.chimera.FragmentTransaction;

/* renamed from: sw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class sw implements Runnable {
    final /* synthetic */ tn a;

    public sw(tn tnVar) {
        this.a = tnVar;
    }

    public final void run() {
        tn tnVar = this.a;
        if ((tnVar.A & 1) != 0) {
            tnVar.e(0);
        }
        tn tnVar2 = this.a;
        if ((tnVar2.A & FragmentTransaction.TRANSIT_ENTER_MASK) != 0) {
            tnVar2.e(108);
        }
        tn tnVar3 = this.a;
        tnVar3.z = false;
        tnVar3.A = 0;
    }
}
