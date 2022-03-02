package defpackage;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.appdatasearch.CorpusStatus;
import com.google.android.gms.appdatasearch.DocumentResults;
import com.google.android.gms.appdatasearch.Feature;
import com.google.android.gms.appdatasearch.GlobalSearchApplication;
import com.google.android.gms.appdatasearch.GlobalSearchApplicationInfo;
import com.google.android.gms.appdatasearch.GlobalSearchQuerySpecification;
import com.google.android.gms.appdatasearch.NativeApiInfo;
import com.google.android.gms.appdatasearch.PIMEUpdate;
import com.google.android.gms.appdatasearch.PIMEUpdateResponse;
import com.google.android.gms.appdatasearch.PhraseAffinityResponse;
import com.google.android.gms.appdatasearch.PhraseAffinitySpecification;
import com.google.android.gms.appdatasearch.QuerySpecification;
import com.google.android.gms.appdatasearch.RegisterCorpusInfo;
import com.google.android.gms.appdatasearch.RegisteredPackageInfo;
import com.google.android.gms.appdatasearch.SearchResults;
import com.google.android.gms.appdatasearch.StorageStats;
import com.google.android.gms.appdatasearch.SuggestSpecification;
import com.google.android.gms.appdatasearch.SuggestionResults;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.search.administration.BundleResponse;
import com.google.android.gms.search.administration.GetStorageStatsCall$PackageStats;
import com.google.android.gms.search.administration.GetStorageStatsCall$Request;
import com.google.android.gms.search.administration.GetStorageStatsCall$Response;
import com.google.android.gms.search.corpora.GetCorpusInfoCall$Request;
import com.google.android.gms.search.corpora.GetCorpusInfoCall$Response;
import com.google.android.gms.search.corpora.GetCorpusStatusCall$Request;
import com.google.android.gms.search.corpora.GetCorpusStatusCall$Response;
import com.google.android.gms.search.corpora.RequestIndexingCall$Request;
import com.google.android.gms.search.corpora.RequestIndexingCall$Response;
import com.google.android.gms.search.global.GetGlobalSearchSourcesCall$CorpusInfo;
import com.google.android.gms.search.global.GetGlobalSearchSourcesCall$GlobalSearchSource;
import com.google.android.gms.search.global.GetGlobalSearchSourcesCall$Request;
import com.google.android.gms.search.global.GetGlobalSearchSourcesCall$Response;
import com.google.android.gms.search.global.SetIncludeInGlobalSearchCall$Request;
import com.google.android.gms.search.queries.GetDocumentsCall$Request;
import com.google.android.gms.search.queries.GetDocumentsCall$Response;
import com.google.android.gms.search.queries.GetPhraseAffinityCall$Request;
import com.google.android.gms.search.queries.GetPhraseAffinityCall$Response;
import com.google.android.gms.search.queries.GlobalQueryCall$Request;
import com.google.android.gms.search.queries.GlobalQueryCall$Response;
import com.google.android.gms.search.queries.QueryCall$Request;
import com.google.android.gms.search.queries.QueryCall$Response;
import com.google.android.gms.search.queries.QuerySuggestCall$Request;
import com.google.android.gms.search.queries.QuerySuggestCall$Response;
import java.util.ArrayList;
import java.util.Map;

@Deprecated
/* renamed from: dsh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class dsh extends duq implements jbh {
    final osf a;
    private final ozc b;

    public dsh(osf osf, ozc ozc) {
        iva.a((Object) osf);
        this.a = osf;
        this.b = ozc;
    }

    private final void a(String str, GlobalSearchApplicationInfo globalSearchApplicationInfo) {
        boolean z;
        ozc a2 = this.a.m.a(str);
        ppp ppp = this.a.c;
        dse dse = new dse(this, aonk.SET_GLOBAL_SEARCH_INFO, this.b.f, a2, globalSearchApplicationInfo);
        ppp.d(dse);
        Exception exc = (Exception) dse.h();
        if (exc instanceof pau) {
            throw new IllegalArgumentException(exc.getMessage(), exc);
        } else if (!(exc instanceof SecurityException)) {
            if (exc == null) {
                z = true;
            } else {
                z = false;
            }
            iva.a(z);
        } else {
            throw ((SecurityException) exc);
        }
    }

    public final CorpusStatus b(String str, String str2) {
        GetCorpusStatusCall$Request getCorpusStatusCall$Request = new GetCorpusStatusCall$Request();
        getCorpusStatusCall$Request.a = str;
        getCorpusStatusCall$Request.b = str2;
        aahy aahy = new aahy(this.a, getCorpusStatusCall$Request, this.b);
        this.a.c.d(aahy);
        return ((GetCorpusStatusCall$Response) aahy.h()).b;
    }

    public final RegisterCorpusInfo c(String str, String str2) {
        GetCorpusInfoCall$Request getCorpusInfoCall$Request = new GetCorpusInfoCall$Request();
        getCorpusInfoCall$Request.a = str;
        getCorpusInfoCall$Request.b = str2;
        osf osf = this.a;
        ppp ppp = osf.c;
        aahv aahv = new aahv(osf, getCorpusInfoCall$Request, this.b);
        ppp.d(aahv);
        return ((GetCorpusInfoCall$Response) aahv.h()).b;
    }

    public final boolean d() {
        aafu aafu = new aafu(this.a, this.b);
        this.a.c.d(aafu);
        return ((Status) aafu.h()).c();
    }

    public final NativeApiInfo e() {
        return new NativeApiInfo((String) null, (String) null, (String) null);
    }

    public final void f() {
        if (this.b.b) {
            this.a.g();
            return;
        }
        throw new SecurityException("Access denied");
    }

    public final int[] g() {
        return new int[0];
    }

    public final int[] h() {
        return new int[0];
    }

    public final String[] i() {
        return new String[0];
    }

    public final PIMEUpdateResponse j() {
        return new PIMEUpdateResponse("API disabled", (byte[]) null, (PIMEUpdate[]) null);
    }

    public final boolean k() {
        return false;
    }

    public final boolean l() {
        return true;
    }

    public final boolean m() {
        return false;
    }

    public final void b(String[] strArr) {
        if (this.b.b) {
            this.a.c.d(new dsg(this, aonk.UNBLOCK_PACKAGES, this.b.f, strArr));
            return;
        }
        throw new SecurityException("Access denied");
    }

    public final StorageStats c() {
        aagl aagl = new aagl(this.a, new GetStorageStatsCall$Request(), this.b);
        this.a.c.d(aagl);
        GetStorageStatsCall$Response getStorageStatsCall$Response = (GetStorageStatsCall$Response) aagl.h();
        RegisteredPackageInfo[] registeredPackageInfoArr = new RegisteredPackageInfo[getStorageStatsCall$Response.b.length];
        int i = 0;
        while (true) {
            GetStorageStatsCall$PackageStats[] getStorageStatsCall$PackageStatsArr = getStorageStatsCall$Response.b;
            if (i >= getStorageStatsCall$PackageStatsArr.length) {
                return new StorageStats(registeredPackageInfoArr, getStorageStatsCall$Response.c, getStorageStatsCall$Response.d, getStorageStatsCall$Response.e);
            }
            GetStorageStatsCall$PackageStats getStorageStatsCall$PackageStats = getStorageStatsCall$PackageStatsArr[i];
            registeredPackageInfoArr[i] = new RegisteredPackageInfo(getStorageStatsCall$PackageStats.a, getStorageStatsCall$PackageStats.b, getStorageStatsCall$PackageStats.c, getStorageStatsCall$PackageStats.d);
            i++;
        }
    }

    public final boolean b(String str, RegisterCorpusInfo registerCorpusInfo) {
        String a2 = osn.a(registerCorpusInfo);
        if (a2 == null) {
            ozc a3 = this.a.m.a(str);
            ozv a4 = ozv.a(registerCorpusInfo, System.currentTimeMillis());
            ppp ppp = this.a.c;
            dsc dsc = new dsc(this, aonk.REGISTER_CORPUS_INFO, this.b.f, a3, a4);
            ppp.d(dsc);
            Exception exc = (Exception) dsc.h();
            boolean z = false;
            if (exc != null) {
                oso.a((Throwable) exc, "Client exception");
                if (exc instanceof pau) {
                    throw new IllegalArgumentException(exc.getMessage(), exc);
                } else if (exc instanceof SecurityException) {
                    throw ((SecurityException) exc);
                } else if (exc instanceof pax) {
                    oso.a((Throwable) exc, "Internal error");
                    return false;
                }
            }
            if (exc == null) {
                z = true;
            }
            iva.a(z);
            return true;
        }
        throw new IllegalArgumentException(a2);
    }

    public final void c(String str) {
        iva.a((Object) str);
        a(str, (GlobalSearchApplicationInfo) null);
    }

    public final Bundle a(Bundle bundle) {
        aagb aagb = new aagb(this.a, bundle, this.b);
        this.a.c.d(aagb);
        return ((BundleResponse) aagb.h()).b;
    }

    public final Bundle a(String str, String str2) {
        String str3 = null;
        if (str2 != null) {
            try {
                osn.b(str2);
            } catch (IllegalArgumentException e) {
                str3 = e.getMessage();
            }
        }
        if (str3 == null) {
            oyz a2 = this.a.m.a(this.a.m.a(str));
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ppp ppp = this.a.c;
            dsd dsd = new dsd(this, aonk.UNREGISTER_CORPUS, this.b.f, str2, a2, arrayList2, arrayList);
            ppp.d(dsd);
            dsd.h();
            Bundle bundle = new Bundle();
            bundle.putStringArray("content_provider_uris", (String[]) arrayList.toArray(new String[arrayList.size()]));
            boolean[] zArr = new boolean[arrayList2.size()];
            for (int i = 0; i < arrayList2.size(); i++) {
                zArr[i] = ((Boolean) arrayList2.get(i)).booleanValue();
            }
            bundle.putBooleanArray("success", zArr);
            return bundle;
        }
        throw new IllegalArgumentException(str3);
    }

    public final GlobalSearchApplication[] b() {
        aajh aajh = new aajh(this.a, new GetGlobalSearchSourcesCall$Request(), this.b);
        this.a.c.d(aajh);
        GetGlobalSearchSourcesCall$Response getGlobalSearchSourcesCall$Response = (GetGlobalSearchSourcesCall$Response) aajh.h();
        int length = getGlobalSearchSourcesCall$Response.b.length;
        GlobalSearchApplication[] globalSearchApplicationArr = new GlobalSearchApplication[length];
        for (int i = 0; i < length; i++) {
            GetGlobalSearchSourcesCall$GlobalSearchSource getGlobalSearchSourcesCall$GlobalSearchSource = getGlobalSearchSourcesCall$Response.b[i];
            GlobalSearchApplicationInfo globalSearchApplicationInfo = r7;
            GlobalSearchApplicationInfo globalSearchApplicationInfo2 = new GlobalSearchApplicationInfo(getGlobalSearchSourcesCall$GlobalSearchSource.a, getGlobalSearchSourcesCall$GlobalSearchSource.b, getGlobalSearchSourcesCall$GlobalSearchSource.c, getGlobalSearchSourcesCall$GlobalSearchSource.d, getGlobalSearchSourcesCall$GlobalSearchSource.e, getGlobalSearchSourcesCall$GlobalSearchSource.f, getGlobalSearchSourcesCall$GlobalSearchSource.g, getGlobalSearchSourcesCall$GlobalSearchSource.h);
            dsu dsu = new dsu();
            dsu.a = globalSearchApplicationInfo;
            for (GetGlobalSearchSourcesCall$CorpusInfo getGlobalSearchSourcesCall$CorpusInfo : getGlobalSearchSourcesCall$GlobalSearchSource.i) {
                String str = getGlobalSearchSourcesCall$CorpusInfo.a;
                Feature[] featureArr = getGlobalSearchSourcesCall$CorpusInfo.b;
                Map map = dsu.b;
                iva.a((Object) str);
                map.put(str, (Feature[]) iva.a((Object) featureArr));
            }
            globalSearchApplicationArr[i] = new GlobalSearchApplication(dsu.a, getGlobalSearchSourcesCall$GlobalSearchSource.j, dsu.b);
        }
        return globalSearchApplicationArr;
    }

    public final DocumentResults a(String[] strArr, String str, String str2, QuerySpecification querySpecification) {
        GetDocumentsCall$Request getDocumentsCall$Request = new GetDocumentsCall$Request();
        getDocumentsCall$Request.c = strArr;
        getDocumentsCall$Request.a = str;
        getDocumentsCall$Request.b = str2;
        getDocumentsCall$Request.d = querySpecification;
        aale aale = new aale(this.a, getDocumentsCall$Request, this.b);
        this.a.c.d(aale);
        return ((GetDocumentsCall$Response) aale.h()).b;
    }

    public final PhraseAffinityResponse a(String[] strArr, PhraseAffinitySpecification phraseAffinitySpecification) {
        GetPhraseAffinityCall$Request getPhraseAffinityCall$Request = new GetPhraseAffinityCall$Request();
        getPhraseAffinityCall$Request.a = strArr;
        getPhraseAffinityCall$Request.b = phraseAffinitySpecification.a();
        aalh aalh = new aalh(this.a, getPhraseAffinityCall$Request, this.b);
        this.a.c.d(aalh);
        return ((GetPhraseAffinityCall$Response) aalh.h()).b;
    }

    public final SearchResults a(String str, int i, int i2, GlobalSearchQuerySpecification globalSearchQuerySpecification) {
        GlobalQueryCall$Request globalQueryCall$Request = new GlobalQueryCall$Request();
        globalQueryCall$Request.a = str;
        globalQueryCall$Request.b = i;
        globalQueryCall$Request.c = i2;
        globalQueryCall$Request.d = globalSearchQuerySpecification;
        aall aall = new aall(this.a, globalQueryCall$Request, this.b);
        this.a.c.d(aall);
        return ((GlobalQueryCall$Response) aall.h()).b;
    }

    public final SearchResults a(String str, String str2, String[] strArr, int i, int i2, QuerySpecification querySpecification) {
        QueryCall$Request queryCall$Request = new QueryCall$Request();
        queryCall$Request.a = str;
        queryCall$Request.b = str2;
        queryCall$Request.c = strArr;
        queryCall$Request.d = i;
        queryCall$Request.e = i2;
        queryCall$Request.f = querySpecification;
        aalu aalu = new aalu(this.a, queryCall$Request, this.b);
        this.a.c.d(aalu);
        return ((QueryCall$Response) aalu.h()).b;
    }

    public final SuggestionResults a(String str, String str2, String[] strArr, int i, SuggestSpecification suggestSpecification) {
        QuerySuggestCall$Request querySuggestCall$Request = new QuerySuggestCall$Request();
        querySuggestCall$Request.a = str;
        querySuggestCall$Request.b = str2;
        querySuggestCall$Request.c = strArr;
        querySuggestCall$Request.d = i;
        querySuggestCall$Request.e = suggestSpecification;
        aals aals = new aals(this.a, querySuggestCall$Request, this.b);
        this.a.c.d(aals);
        return ((QuerySuggestCall$Response) aals.h()).b;
    }

    public final String[] b(String str) {
        return this.a.a().a(this.a.m.a(str), -1);
    }

    public final void a(GlobalSearchApplicationInfo globalSearchApplicationInfo) {
        iva.a((Object) globalSearchApplicationInfo);
        a(globalSearchApplicationInfo.a, globalSearchApplicationInfo);
    }

    @Deprecated
    public final void a(String str, RegisterCorpusInfo registerCorpusInfo) {
        b(str, registerCorpusInfo);
    }

    public final void a(String str, boolean z) {
        aajs aajs = new aajs(this.a, new SetIncludeInGlobalSearchCall$Request(str, (String) null, z), this.b);
        this.a.c.d(aajs);
        aajs.h();
    }

    public final void a(String[] strArr) {
        if (this.b.b) {
            this.a.c.d(new dsf(this, aonk.BLOCK_PACKAGES, this.b.f, strArr));
            return;
        }
        throw new SecurityException("Access denied");
    }

    public final boolean a(String str, String str2, long j) {
        RequestIndexingCall$Request requestIndexingCall$Request = new RequestIndexingCall$Request();
        requestIndexingCall$Request.a = str;
        requestIndexingCall$Request.b = str2;
        requestIndexingCall$Request.c = j;
        osf osf = this.a;
        Context context = osf.b;
        ppp ppp = osf.c;
        ozs a2 = osf.a();
        osf osf2 = this.a;
        aaif aaif = new aaif(context, ppp, a2, osf2.o, osf2.q, requestIndexingCall$Request, this.b);
        this.a.c.d(aaif);
        return ((RequestIndexingCall$Response) aaif.h()).a.c();
    }

    public final GlobalSearchApplicationInfo[] a() {
        GlobalSearchApplication[] b2 = b();
        GlobalSearchApplicationInfo[] globalSearchApplicationInfoArr = new GlobalSearchApplicationInfo[b2.length];
        for (int i = 0; i < b2.length; i++) {
            globalSearchApplicationInfoArr[i] = b2[i].a;
        }
        return globalSearchApplicationInfoArr;
    }

    public final String[] a(String str) {
        return this.a.a().a(this.a.m.a(str), 1);
    }
}
