package defpackage;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.location.places.internal.PlaceLikelihoodEntity;

/* renamed from: rkn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class rkn extends ilj implements rhy {
    public final float ba() {
        return a("place_likelihood", -1.0f);
    }

    public final rhq bb() {
        return new rkr(this.a, this.b);
    }

    public rkn(DataHolder dataHolder, int i) {
        super(dataHolder, i);
    }

    public final /* bridge */ /* synthetic */ Object r() {
        return PlaceLikelihoodEntity.a(((rkr) bb()).r(), ba());
    }
}
