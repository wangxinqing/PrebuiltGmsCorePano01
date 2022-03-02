package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.places.personalized.AliasedPlacesResult;
import java.util.List;

/* renamed from: rkw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class rkw extends ril {
    public rkw(ibq ibq, icc icc) {
        super(ibq, icc);
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ icl b(Status status) {
        return new AliasedPlacesResult(status, (List) null);
    }
}
