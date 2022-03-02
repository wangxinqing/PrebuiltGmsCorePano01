package defpackage;

import android.os.Bundle;
import android.os.IInterface;
import com.google.android.gms.search.queries.GetDocumentsCall$Request;
import com.google.android.gms.search.queries.GetPhraseAffinityCall$Request;
import com.google.android.gms.search.queries.GlobalQueryCall$Request;
import com.google.android.gms.search.queries.QueryCall$Request;
import com.google.android.gms.search.queries.QuerySuggestCall$Request;

/* renamed from: aamj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public interface aamj extends IInterface {
    void a(aamg aamg);

    void a(Bundle bundle);

    void a(GetDocumentsCall$Request getDocumentsCall$Request, aamg aamg);

    void a(GetPhraseAffinityCall$Request getPhraseAffinityCall$Request, aamg aamg);

    void a(GlobalQueryCall$Request globalQueryCall$Request, aamg aamg);

    void a(QueryCall$Request queryCall$Request, aamg aamg);

    void a(QuerySuggestCall$Request querySuggestCall$Request, aamg aamg);
}
