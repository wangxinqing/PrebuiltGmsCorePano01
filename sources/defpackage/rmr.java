package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.reporting.ReportingState;

/* renamed from: rmr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class rmr implements icl {
    public final Status a;
    public final ReportingState b;

    public rmr(Status status, ReportingState reportingState) {
        this.a = status;
        if (status.i == 0) {
            iva.a((Object) reportingState);
        }
        this.b = reportingState;
    }

    public final Status aO() {
        return this.a;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 52 + String.valueOf(valueOf2).length());
        sb.append("ReportingStateResultImpl{mStatus=");
        sb.append(valueOf);
        sb.append(", mReportingState=");
        sb.append(valueOf2);
        sb.append('}');
        return sb.toString();
    }
}
