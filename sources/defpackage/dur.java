package defpackage;

import android.os.Bundle;
import android.os.IInterface;
import com.google.android.gms.appdatasearch.CorpusStatus;
import com.google.android.gms.appdatasearch.DocumentResults;
import com.google.android.gms.appdatasearch.GlobalSearchApplication;
import com.google.android.gms.appdatasearch.GlobalSearchApplicationInfo;
import com.google.android.gms.appdatasearch.GlobalSearchQuerySpecification;
import com.google.android.gms.appdatasearch.NativeApiInfo;
import com.google.android.gms.appdatasearch.PIMEUpdateResponse;
import com.google.android.gms.appdatasearch.PhraseAffinityResponse;
import com.google.android.gms.appdatasearch.PhraseAffinitySpecification;
import com.google.android.gms.appdatasearch.QuerySpecification;
import com.google.android.gms.appdatasearch.RegisterCorpusInfo;
import com.google.android.gms.appdatasearch.SearchResults;
import com.google.android.gms.appdatasearch.StorageStats;
import com.google.android.gms.appdatasearch.SuggestSpecification;
import com.google.android.gms.appdatasearch.SuggestionResults;

/* renamed from: dur  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public interface dur extends IInterface {
    Bundle a(Bundle bundle);

    Bundle a(String str, String str2);

    DocumentResults a(String[] strArr, String str, String str2, QuerySpecification querySpecification);

    PhraseAffinityResponse a(String[] strArr, PhraseAffinitySpecification phraseAffinitySpecification);

    SearchResults a(String str, int i, int i2, GlobalSearchQuerySpecification globalSearchQuerySpecification);

    SearchResults a(String str, String str2, String[] strArr, int i, int i2, QuerySpecification querySpecification);

    SuggestionResults a(String str, String str2, String[] strArr, int i, SuggestSpecification suggestSpecification);

    void a(GlobalSearchApplicationInfo globalSearchApplicationInfo);

    void a(String str, RegisterCorpusInfo registerCorpusInfo);

    void a(String str, boolean z);

    void a(String[] strArr);

    boolean a(String str, String str2, long j);

    GlobalSearchApplicationInfo[] a();

    String[] a(String str);

    CorpusStatus b(String str, String str2);

    void b(String[] strArr);

    boolean b(String str, RegisterCorpusInfo registerCorpusInfo);

    GlobalSearchApplication[] b();

    String[] b(String str);

    RegisterCorpusInfo c(String str, String str2);

    StorageStats c();

    void c(String str);

    boolean d();

    NativeApiInfo e();

    void f();

    int[] g();

    int[] h();

    String[] i();

    PIMEUpdateResponse j();

    boolean k();

    boolean l();

    boolean m();
}
