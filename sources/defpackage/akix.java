package defpackage;

import android.os.Parcelable;
import com.google.android.places.Subscription;
import java.util.concurrent.Callable;

/* renamed from: akix  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class akix implements Callable {
    final /* synthetic */ akiy a;
    private final Subscription b;

    public akix(akiy akiy, Subscription subscription) {
        this.a = akiy;
        this.b = subscription;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        akis akis = this.a.h;
        if (akis.b) {
            akis.a.b((Parcelable) this.b);
            if (this.a.i.isEmpty()) {
                akiy akiy = this.a;
                akiy.g.a(akiy.h.b());
            }
            this.a.a((Object) this.b);
            return ris.h(0);
        }
        throw new IllegalStateException("Tried to remove a subscription before we were ready");
    }
}
