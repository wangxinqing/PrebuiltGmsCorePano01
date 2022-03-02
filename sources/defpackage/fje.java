package defpackage;

import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;

/* renamed from: fje  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class fje implements Callable {
    private final aorr a;
    private final aorr b;
    private final aorr c;

    public fje(aorr aorr, aorr aorr2, aorr aorr3) {
        this.a = aorr;
        this.b = aorr2;
        this.c = aorr3;
    }

    public final Object call() {
        boolean z;
        aorr aorr = this.a;
        aorr aorr2 = this.b;
        aorr aorr3 = this.c;
        anaf a2 = anet.a((Iterable) aorl.a((Future) aorr), fjg.a);
        ffs ffs = new ffs();
        boolean z2 = true;
        if (a2.containsKey("credentials_enable_service")) {
            z = fko.a((hmk) a2.get("credentials_enable_service"), true);
        } else {
            z = true;
        }
        ffs.a = z;
        if (a2.containsKey("credentials_enable_autosignin")) {
            z2 = fko.a((hmk) a2.get("credentials_enable_autosignin"), true);
        }
        ffs.b = z2;
        ffs.a((List) aorl.a((Future) aorr2));
        ffs.d = ((Boolean) aorl.a((Future) aorr3)).booleanValue();
        return ffs.a();
    }
}
