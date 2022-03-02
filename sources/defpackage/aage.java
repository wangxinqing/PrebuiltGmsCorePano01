package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.search.administration.AppIndexingErrorInfo;
import com.google.android.gms.search.administration.AppIndexingUserActionInfo;
import com.google.android.gms.search.administration.CorpusConfigParcelable;
import com.google.android.gms.search.administration.GetAppIndexingPackageDetailsCall$Request;
import com.google.android.gms.search.administration.GetAppIndexingPackageDetailsCall$Response;
import java.util.ArrayList;
import java.util.List;

/* renamed from: aage  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class aage extends aafb {
    private final osf a;

    public aage(osf osf, GetAppIndexingPackageDetailsCall$Request getAppIndexingPackageDetailsCall$Request, ozc ozc) {
        super(aonk.GET_APP_INDEXING_PACKAGE_DETAILS, 1, 4, osf.b, getAppIndexingPackageDetailsCall$Request, ozc);
        this.a = osf;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object a() {
        CorpusConfigParcelable[] corpusConfigParcelableArr;
        String str;
        String str2 = ((GetAppIndexingPackageDetailsCall$Request) this.n).a;
        Status status = Status.a;
        oyz d = this.a.m.d(str2);
        if (d != null) {
            ArrayList arrayList = new ArrayList();
            ozs a2 = this.a.a();
            anhk i = a2.a(d).listIterator();
            while (i.hasNext()) {
                osz d2 = a2.d((pao) i.next());
                oxe a3 = oxe.a(d2.c, str2, oyb.a(this.a.b));
                if (a3 != null && (aplx.b(a3.c) || axrm.d())) {
                    if (!pba.a()) {
                        str = a3.a.b;
                    } else {
                        int i2 = a3.c;
                        if (i2 != 2) {
                            String str3 = a3.a.b;
                            String c = aplx.c(i2);
                            StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 3 + String.valueOf(c).length());
                            sb.append(str3);
                            sb.append(" (");
                            sb.append(c);
                            sb.append(")");
                            str = sb.toString();
                        } else {
                            str = a3.a.b;
                        }
                    }
                    arrayList.add(new CorpusConfigParcelable(d2.e, d2.c, str));
                }
            }
            corpusConfigParcelableArr = (CorpusConfigParcelable[]) arrayList.toArray(new CorpusConfigParcelable[arrayList.size()]);
        } else {
            corpusConfigParcelableArr = null;
        }
        long p = this.a.g.p(str2);
        oxx a4 = oxx.a(this.a.b);
        List arrayList2 = new ArrayList();
        if (a4.a()) {
            arrayList2 = a4.a(str2, "errors", AppIndexingErrorInfo.CREATOR);
        }
        AppIndexingErrorInfo[] appIndexingErrorInfoArr = (AppIndexingErrorInfo[]) arrayList2.toArray(new AppIndexingErrorInfo[arrayList2.size()]);
        oxx a5 = oxx.a(this.a.b);
        List arrayList3 = new ArrayList();
        if (a5.b()) {
            arrayList3 = a5.a(str2, "user_actions", AppIndexingUserActionInfo.CREATOR);
        }
        return new GetAppIndexingPackageDetailsCall$Response(status, corpusConfigParcelableArr, p, appIndexingErrorInfoArr, (AppIndexingUserActionInfo[]) arrayList3.toArray(new AppIndexingUserActionInfo[arrayList3.size()]), owa.a(this.a.b, owa.a(str2)), owa.b(this.a.b, owa.a(str2)));
    }

    public final /* bridge */ /* synthetic */ Object a(Status status) {
        return new GetAppIndexingPackageDetailsCall$Response(status, (CorpusConfigParcelable[]) null, -1, (AppIndexingErrorInfo[]) null, (AppIndexingUserActionInfo[]) null, false, false);
    }
}
