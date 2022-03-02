package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.usagereporting.UsageReportingOptInOptions;

/* renamed from: adsw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class adsw implements icl {
    public final Status a;
    private final UsageReportingOptInOptions b;

    public adsw(Status status, UsageReportingOptInOptions usageReportingOptInOptions) {
        this.a = status;
        this.b = usageReportingOptInOptions;
    }

    public final Status aO() {
        return this.a;
    }

    public final boolean b() {
        iva.a((Object) this.b);
        return this.b.a == 1;
    }

    public final String toString() {
        boolean z = true;
        Object[] objArr = new Object[1];
        if (this.b.a != 1) {
            z = false;
        }
        objArr[0] = Boolean.valueOf(z);
        return String.format("OptInOptionsResultImpl[%s]", objArr);
    }
}
