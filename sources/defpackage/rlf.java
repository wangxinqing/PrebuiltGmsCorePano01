package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.location.places.personalized.PlaceUserData;

@Deprecated
/* renamed from: rlf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class rlf extends ilk implements icl {
    private final Status b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public rlf(DataHolder dataHolder) {
        super(dataHolder, PlaceUserData.CREATOR);
        Status h = ris.h(dataHolder.e);
        iva.b(dataHolder.e == h.i);
        this.b = h;
    }

    public final Status aO() {
        return this.b;
    }
}
