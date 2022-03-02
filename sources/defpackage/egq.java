package defpackage;

import android.content.Context;
import com.google.android.gms.audit.LogAuditRecordsRequest;

/* renamed from: egq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class egq extends iby implements egm {
    private static final ibq a = new ibq("Audit.API", l, b);
    private static final ibg b = new ibg();
    private static final ibn l = new egn();

    public egq(Context context) {
        super(context, a, (ibm) null, ibx.a);
    }

    public final acwa a(LogAuditRecordsRequest logAuditRecordsRequest) {
        return b((ihb) new egp(logAuditRecordsRequest));
    }
}
