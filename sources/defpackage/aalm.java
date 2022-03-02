package defpackage;

import android.os.Bundle;
import com.google.android.gms.common.api.Status;

/* renamed from: aalm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aalm extends aafb {
    private final osf a;
    private final Bundle b;

    public aalm(osf osf, Bundle bundle, ozc ozc) {
        super(aonk.LOG_API_TRACE_EVENTS, 1, 1, osf.b, bundle, ozc);
        this.a = osf;
        this.b = bundle;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object a() {
        Bundle bundle = this.b;
        if (bundle != null && bundle.containsKey("should_log_stats")) {
            try {
                aucd o = aojk.C.o();
                o.b(this.b.getByteArray("IcingQueryStatsLog"), aubs.c());
                int i = (int) (this.b.getLong("response_timestamp_ms") - this.b.getLong("query_task_done_timestamp_ms"));
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                aojk aojk = (aojk) o.b;
                aojk.a |= 524288;
                aojk.t = i;
                Object[] objArr = new Object[12];
                aolo a2 = aolo.a(aojk.b);
                if (a2 == null) {
                    a2 = aolo.QUERY;
                }
                objArr[0] = a2;
                objArr[1] = Integer.valueOf(((aojk) o.b).h);
                objArr[2] = Integer.valueOf(((aojk) o.b).i);
                objArr[3] = Integer.valueOf(((aojk) o.b).j);
                objArr[4] = Integer.valueOf(((aojk) o.b).s);
                objArr[5] = Integer.valueOf(((aojk) o.b).m);
                objArr[6] = Integer.valueOf(((aojk) o.b).n);
                objArr[7] = Integer.valueOf(((aojk) o.b).p);
                objArr[8] = Integer.valueOf(((aojk) o.b).q);
                objArr[9] = Integer.valueOf(((aojk) o.b).r);
                objArr[10] = Integer.valueOf(((aojk) o.b).t);
                aojk aojk2 = (aojk) o.b;
                objArr[11] = Integer.valueOf(aojk2.s + aojk2.m + aojk2.o + aojk2.r + aojk2.t);
                oso.b("%s req/res/sco %d/%d/%d in before_init:%d init:%d + lock_wait:%d + prepBefore:%d  + prepAfter:%d +  execute:%d + after_query_task:%d = %d ms", objArr);
                this.a.r.a((aojk) o.i());
                return Status.a;
            } catch (auda e) {
                oso.a((Throwable) e, "Can't deserialize the Query Log proto.");
                return Status.c;
            }
        } else {
            oso.b("LogApiTraceEvents is called when there is nothing to log.");
            return Status.c;
        }
    }

    public final /* bridge */ /* synthetic */ Object a(Status status) {
        return status;
    }
}
