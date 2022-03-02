package defpackage;

import com.google.android.gms.mdh.LatestFootprintFilter;
import com.google.android.gms.mdh.MdhFootprint;
import com.google.android.gms.mdh.MdhFootprintsReadResult;
import com.google.android.gms.mdh.SecondaryIdMatcher;
import com.google.android.gms.mdh.TimeSeriesFootprintsSubscriptionFilter;
import java.util.List;

/* renamed from: pga  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class pga {
    public static aeta a(LatestFootprintFilter latestFootprintFilter) {
        if (latestFootprintFilter == null) {
            return null;
        }
        aesz b = aeta.b();
        List list = latestFootprintFilter.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            SecondaryIdMatcher secondaryIdMatcher = (SecondaryIdMatcher) list.get(i);
            b.a(secondaryIdMatcher.a, secondaryIdMatcher.b);
        }
        return b.a();
    }

    public static aeti a(TimeSeriesFootprintsSubscriptionFilter timeSeriesFootprintsSubscriptionFilter) {
        return aeti.a(timeSeriesFootprintsSubscriptionFilter.a, timeSeriesFootprintsSubscriptionFilter.b, timeSeriesFootprintsSubscriptionFilter.c);
    }

    public static MdhFootprint a(aetb aetb) {
        if (aetb != null) {
            return new MdhFootprint(aetb.a(), aetb.b(), aetb.c());
        }
        return null;
    }

    public static MdhFootprintsReadResult a(aetc aetc) {
        if (aetc != null) {
            return new MdhFootprintsReadResult(anda.a(aetc.a(), pfz.a), pcy.a(aetc.b()));
        }
        return null;
    }
}
