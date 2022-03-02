package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.search.corpora.DeleteUsageReportCall$Request;
import com.google.android.gms.search.corpora.DeleteUsageReportCall$Response;
import java.util.Iterator;

/* renamed from: aahs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class aahs extends aafb {
    private final osf a;

    public aahs(osf osf, DeleteUsageReportCall$Request deleteUsageReportCall$Request, ozc ozc) {
        super(aonk.DELETE_USAGE_REPORT, 2, 1, osf.b, deleteUsageReportCall$Request, ozc);
        this.a = osf;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object a() {
        osz osz;
        DeleteUsageReportCall$Request deleteUsageReportCall$Request = (DeleteUsageReportCall$Request) this.n;
        oso.b("DeleteUsageReportTask: Corpus: %s, Package: %s, Uri: %s", deleteUsageReportCall$Request.b, deleteUsageReportCall$Request.a, deleteUsageReportCall$Request.c);
        ozs a2 = this.a.a();
        synchronized (a2.a()) {
            ozc ozc = this.o;
            DeleteUsageReportCall$Request deleteUsageReportCall$Request2 = (DeleteUsageReportCall$Request) this.n;
            Iterator it = a2.a(ozc, new String[]{deleteUsageReportCall$Request2.b}, false, deleteUsageReportCall$Request2.a).iterator();
            while (true) {
                if (!it.hasNext()) {
                    osz = null;
                    break;
                }
                osz = a2.d((pao) it.next());
                if (osz != null && osz.c.equals(((DeleteUsageReportCall$Request) this.n).b)) {
                    break;
                }
            }
        }
        DeleteUsageReportCall$Response deleteUsageReportCall$Response = new DeleteUsageReportCall$Response();
        deleteUsageReportCall$Response.a = Status.c;
        if (osz == null) {
            oso.b("DeleteUsageReportUsageTask: couldn't find requested corpus: %s", (Object) ((DeleteUsageReportCall$Request) this.n).b);
            return deleteUsageReportCall$Response;
        } else if (!this.a.a(osz, ((DeleteUsageReportCall$Request) this.n).c)) {
            oso.e("DeleteUsageReportTask: failed to delete usage report and implicit document");
            return deleteUsageReportCall$Response;
        } else {
            oso.a("DeleteUsageReportTask succeeded.");
            DeleteUsageReportCall$Response deleteUsageReportCall$Response2 = new DeleteUsageReportCall$Response();
            deleteUsageReportCall$Response2.a = Status.a;
            return deleteUsageReportCall$Response2;
        }
    }

    public final /* bridge */ /* synthetic */ Object a(Status status) {
        DeleteUsageReportCall$Response deleteUsageReportCall$Response = new DeleteUsageReportCall$Response();
        deleteUsageReportCall$Response.a = status;
        return deleteUsageReportCall$Response;
    }
}
