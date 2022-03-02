package defpackage;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.location.places.internal.NearbyLikelihoodEntity;

/* renamed from: rkc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class rkc extends ilj implements rhm {
    public final rhq bb() {
        return new rkr(this.a, this.b);
    }

    public rkc(DataHolder dataHolder, int i) {
        super(dataHolder, i);
    }

    public final /* bridge */ /* synthetic */ Object r() {
        return NearbyLikelihoodEntity.a(((rkr) bb()).r(), a("place_likelihood", -1.0f));
    }
}
