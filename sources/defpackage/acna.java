package defpackage;

import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* renamed from: acna  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class acna implements Runnable {
    private final acnj a;
    private final aorr b;
    private final aorr c;

    public acna(acnj acnj, aorr aorr, aorr aorr2) {
        this.a = acnj;
        this.b = aorr;
        this.c = aorr2;
    }

    public final void run() {
        acnj acnj = this.a;
        aorr aorr = this.b;
        aorr aorr2 = this.c;
        try {
            acnj.g = (Set) aorl.a((Future) aorr);
        } catch (ExecutionException e) {
            acnj.a.e("Failed to find Dasher accounts", e, new Object[0]);
        }
        try {
            acnj.h = (Set) aorl.a((Future) aorr2);
        } catch (ExecutionException e2) {
            acnj.a.e("Failed to find Unicorn accounts", e2, new Object[0]);
        }
        acnj.f = iko.a(acnj.g, acnj.h);
    }
}
