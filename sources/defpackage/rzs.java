package defpackage;

import com.google.android.gms.mdh.LatestFootprintFilter;
import com.google.android.gms.mdh.SecondaryIdMatcher;
import com.google.android.gms.mdh.internal.MdhFootprintListSafeParcelable;
import java.util.List;

/* renamed from: rzs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class rzs implements Runnable {
    private final LatestFootprintFilter a;
    private final MdhFootprintListSafeParcelable b;
    private final sag c;

    public rzs(sag sag, LatestFootprintFilter latestFootprintFilter, MdhFootprintListSafeParcelable mdhFootprintListSafeParcelable) {
        this.c = sag;
        this.a = latestFootprintFilter;
        this.b = mdhFootprintListSafeParcelable;
    }

    public final void run() {
        sag sag = this.c;
        LatestFootprintFilter latestFootprintFilter = this.a;
        MdhFootprintListSafeParcelable mdhFootprintListSafeParcelable = this.b;
        if (sag.a) {
            afil afil = sag.b;
            List list = mdhFootprintListSafeParcelable.a;
            afht afht = afil.b;
            if (latestFootprintFilter != null) {
                afhq b2 = afhr.b();
                List list2 = latestFootprintFilter.a;
                int size = list2.size();
                for (int i = 0; i < size; i++) {
                    SecondaryIdMatcher secondaryIdMatcher = (SecondaryIdMatcher) list2.get(i);
                    b2.a(secondaryIdMatcher.a, secondaryIdMatcher.b);
                }
                b2.a();
            }
            amzy.a(anbs.a((Iterable) list, (amqy) new afik(afil)));
            afht.b();
        }
    }
}
