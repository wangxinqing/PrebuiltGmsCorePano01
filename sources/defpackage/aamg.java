package defpackage;

import android.os.IInterface;
import com.google.android.gms.search.queries.AnnotateCall$Response;
import com.google.android.gms.search.queries.GetDocumentsCall$Response;
import com.google.android.gms.search.queries.GetPhraseAffinityCall$Response;
import com.google.android.gms.search.queries.GlobalQueryCall$Response;
import com.google.android.gms.search.queries.QueryCall$Response;
import com.google.android.gms.search.queries.QuerySuggestCall$Response;

/* renamed from: aamg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public interface aamg extends IInterface {
    void a(AnnotateCall$Response annotateCall$Response);

    void a(GetDocumentsCall$Response getDocumentsCall$Response);

    void a(GetPhraseAffinityCall$Response getPhraseAffinityCall$Response);

    void a(GlobalQueryCall$Response globalQueryCall$Response);

    void a(QueryCall$Response queryCall$Response);

    void a(QuerySuggestCall$Response querySuggestCall$Response);
}
