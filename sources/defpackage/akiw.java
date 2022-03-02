package defpackage;

import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.places.Subscription;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: akiw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class akiw implements Callable {
    final /* synthetic */ akiy a;
    private final Subscription b;

    public akiw(akiy akiy, Subscription subscription) {
        this.a = akiy;
        this.b = subscription;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        Subscription subscription;
        akis akis = this.a.h;
        if (akis.b) {
            Subscription subscription2 = this.b;
            String a2 = subscription2.a();
            List d = akis.a.d();
            int size = d.size();
            int i = 0;
            for (int i2 = 0; i2 < size; i2++) {
                Subscription subscription3 = (Subscription) d.get(i2);
                String a3 = subscription3.a();
                if (subscription2.getClass() == subscription3.getClass() && a2.equals(a3)) {
                    i++;
                }
            }
            Status a4 = this.b.a(i);
            if (!a4.c()) {
                return a4;
            }
            akis akis2 = this.a.h;
            Subscription subscription4 = this.b;
            List d2 = akis2.a.d();
            int size2 = d2.size();
            int i3 = 0;
            while (true) {
                if (i3 >= size2) {
                    subscription = null;
                    break;
                }
                subscription = (Subscription) d2.get(i3);
                i3++;
                if (subscription.equals(subscription4)) {
                    break;
                }
            }
            akis2.a.a((Parcelable) subscription4);
            if (!this.b.a(subscription)) {
                if (this.a.i.isEmpty()) {
                    akiy akiy = this.a;
                    akiy.g.a(akiy.h.b());
                }
                this.a.b(this.b);
            }
            return ris.h(0);
        }
        throw new IllegalStateException("Tried to add a subscription before we were ready");
    }
}
