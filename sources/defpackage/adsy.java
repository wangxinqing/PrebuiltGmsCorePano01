package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.usagereporting.UsageReportingOptInOptions;

/* renamed from: adsy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class adsy extends adrw {
    final /* synthetic */ UsageReportingOptInOptions a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public adsy(icc icc, UsageReportingOptInOptions usageReportingOptInOptions) {
        super(icc);
        this.a = usageReportingOptInOptions;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void a(ibf ibf) {
        ((adsv) ((adth) ibf).x()).a(this.a, (adsp) new adte(this));
    }

    public final /* bridge */ /* synthetic */ icl b(Status status) {
        return status;
    }
}
