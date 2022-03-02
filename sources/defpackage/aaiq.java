package defpackage;

import android.os.IInterface;
import com.google.android.gms.search.corpora.ClearCorpusCall$Response;
import com.google.android.gms.search.corpora.DeleteUsageReportCall$Response;
import com.google.android.gms.search.corpora.GetCorpusInfoCall$Response;
import com.google.android.gms.search.corpora.GetCorpusStatusCall$Response;
import com.google.android.gms.search.corpora.RegisterCorpusInfoCall$Response;
import com.google.android.gms.search.corpora.RequestIndexingCall$Response;

/* renamed from: aaiq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public interface aaiq extends IInterface {
    void a(ClearCorpusCall$Response clearCorpusCall$Response);

    void a(DeleteUsageReportCall$Response deleteUsageReportCall$Response);

    void a(GetCorpusInfoCall$Response getCorpusInfoCall$Response);

    void a(GetCorpusStatusCall$Response getCorpusStatusCall$Response);

    void a(RegisterCorpusInfoCall$Response registerCorpusInfoCall$Response);

    void a(RequestIndexingCall$Response requestIndexingCall$Response);
}
