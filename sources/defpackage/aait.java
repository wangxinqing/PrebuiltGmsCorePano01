package defpackage;

import android.os.IInterface;
import com.google.android.gms.search.corpora.ClearCorpusCall$Request;
import com.google.android.gms.search.corpora.DeleteUsageReportCall$Request;
import com.google.android.gms.search.corpora.GetCorpusInfoCall$Request;
import com.google.android.gms.search.corpora.GetCorpusStatusCall$Request;
import com.google.android.gms.search.corpora.RegisterCorpusInfoCall$Request;
import com.google.android.gms.search.corpora.RequestIndexingCall$Request;

/* renamed from: aait  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public interface aait extends IInterface {
    void a(ClearCorpusCall$Request clearCorpusCall$Request, aaiq aaiq);

    void a(DeleteUsageReportCall$Request deleteUsageReportCall$Request, aaiq aaiq);

    void a(GetCorpusInfoCall$Request getCorpusInfoCall$Request, aaiq aaiq);

    void a(GetCorpusStatusCall$Request getCorpusStatusCall$Request, aaiq aaiq);

    void a(RegisterCorpusInfoCall$Request registerCorpusInfoCall$Request, aaiq aaiq);

    void a(RequestIndexingCall$Request requestIndexingCall$Request, aaiq aaiq);
}
