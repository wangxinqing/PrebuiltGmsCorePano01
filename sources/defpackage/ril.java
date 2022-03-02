package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;

/* renamed from: ril  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class ril extends idf {
    public ril(ibq ibq, icc icc) {
        super(ibq, icc);
    }

    public final /* bridge */ /* synthetic */ void a(Object obj) {
        super.a((icl) obj);
    }

    /* access modifiers changed from: protected */
    public /* bridge */ /* synthetic */ icl b(Status status) {
        return new rhr(DataHolder.b(status.i));
    }
}
