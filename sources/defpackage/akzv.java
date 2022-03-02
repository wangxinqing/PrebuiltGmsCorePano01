package defpackage;

import com.google.android.chimera.Fragment;
import com.google.android.gms.location.places.internal.PlaceEntity;

/* renamed from: akzv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class akzv extends akzo {
    final /* synthetic */ akzz a;

    public akzv(akzz akzz) {
        this.a = akzz;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void b(icl icl) {
        PlaceEntity placeEntity;
        rhr rhr = (rhr) icl;
        akzu akzu = this.a.e;
        if (akzu != null) {
            if (rhr.a() != 0) {
                placeEntity = ((rkr) rhr.a(0)).r();
            } else {
                placeEntity = null;
            }
            ((Fragment) akzu).getActivity().runOnUiThread(new albr((albv) akzu, placeEntity));
        }
    }
}
