package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.places.personalized.UserPlacesResult;
import java.util.Collections;

/* renamed from: rli  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class rli extends ril {
    public rli(ibq ibq, icc icc) {
        super(ibq, icc);
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void a(ibf ibf) {
        rjn rjn = (rjn) ibf;
        rlc rlc = new rlc(this);
        iva.a((Object) rlc, (Object) "callback == null");
        ((rju) rjn.x()).a(rjn.a, (rld) rlc);
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ icl b(Status status) {
        return new UserPlacesResult(status, Collections.emptyList());
    }
}
