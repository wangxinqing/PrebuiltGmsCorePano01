package defpackage;

import android.content.Context;
import android.os.AsyncTask;
import android.util.Pair;
import android.widget.Button;
import com.google.android.gms.R;
import com.google.android.gms.appdatasearch.STSortSpec;
import com.google.android.gms.appdatasearch.SearchResults;
import com.google.android.gms.search.administration.AppIndexingErrorInfo;
import com.google.android.gms.search.administration.AppIndexingUserActionInfo;
import com.google.android.gms.search.administration.CorpusConfigParcelable;
import com.google.android.gms.search.administration.GetAppIndexingPackageDetailsCall$Response;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ExecutionException;

/* renamed from: pvr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class pvr extends AsyncTask {
    final /* synthetic */ pvt a;

    public pvr(pvt pvt) {
        this.a = pvt;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        String[] strArr = (String[]) objArr;
        pvq pvq = new pvq();
        iva.b(strArr.length == 1);
        String str = strArr[0];
        aagp b = aafi.b(this.a.getContext());
        iha b2 = ihb.b();
        b2.a = new aahg(str);
        try {
            pvq.c = (ick) acws.a(((iby) b).a(b2.a()));
            ick ick = pvq.c;
            ArrayList arrayList = new ArrayList();
            aafk aafk = null;
            if (ick.g() != null) {
                CorpusConfigParcelable[] g = ick.g();
                int length = g.length;
                int i = 0;
                boolean z = true;
                while (i < length) {
                    CorpusConfigParcelable corpusConfigParcelable = g[i];
                    Context context = this.a.getContext();
                    String str2 = corpusConfigParcelable.a;
                    String str3 = corpusConfigParcelable.b;
                    aalw a2 = aafi.a(context, aafk);
                    dti dti = new dti();
                    dti.c();
                    dti.a = new STSortSpec("(GET_NUM _DOC_SCORE)");
                    String[] strArr2 = {str3};
                    String[] strArr3 = strArr2;
                    int i2 = -1;
                    try {
                        i2 = ((SearchResults) acws.a(a2.a("", str2, strArr3, 0, 1, dti.a()))).m;
                    } catch (InterruptedException | ExecutionException e) {
                        if (e.getCause() instanceof ibr) {
                            oso.b("Query failed: %s", (Object) e.getCause().getMessage());
                        }
                    }
                    if (i2 >= 0) {
                        z = false;
                    }
                    if (i2 > 0) {
                        arrayList.add(new pug(corpusConfigParcelable, i2));
                    }
                    i++;
                    aafk = null;
                }
                if (z) {
                    if (ick.g().length > 0) {
                        arrayList = null;
                    }
                }
                Collections.sort(arrayList, new puf());
            }
            if (arrayList != null) {
                pvq.a = 0;
                pvq.b = arrayList;
            } else {
                pvq.a = 8;
            }
        } catch (InterruptedException | ExecutionException e2) {
            if (e2.getCause() instanceof ibr) {
                pvq.a = ((ibr) e2.getCause()).a();
            } else {
                pvq.a = 8;
            }
        }
        return pvq;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        pvq pvq = (pvq) obj;
        if (this.a.isAdded()) {
            this.a.e.setVisibility(8);
            boolean z = false;
            this.a.q.a(false);
            if (pvq.a != 0) {
                pue.a(this.a.getContext(), this.a.getContext().getString(R.string.package_details_title), this.a.getContext().getString(R.string.failed_retrieve_package_details), Integer.valueOf(pvq.a));
                return;
            }
            this.a.d.setVisibility(0);
            List list = pvq.b;
            this.a.a.clear();
            this.a.a.addAll(list);
            this.a.b.notifyDataSetChanged();
            pue.a(this.a.c);
            ick ick = pvq.c;
            if (this.a.c()) {
                this.a.f.clear();
                if (this.a.c() && ick.j() != null) {
                    HashMap hashMap = new HashMap();
                    for (AppIndexingUserActionInfo appIndexingUserActionInfo : ick.j()) {
                        ArrayList arrayList = (ArrayList) hashMap.get(appIndexingUserActionInfo.c.a);
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                            hashMap.put(appIndexingUserActionInfo.c.a, arrayList);
                        }
                        arrayList.add(appIndexingUserActionInfo);
                    }
                    for (String str : hashMap.keySet()) {
                        ArrayList arrayList2 = (ArrayList) hashMap.get(str);
                        Collections.sort(arrayList2, new aafn());
                        this.a.f.add(new pwj(str, arrayList2));
                    }
                }
                this.a.h.notifyDataSetChanged();
                pue.a(this.a.g);
            }
            ick ick2 = pvq.c;
            if (this.a.b()) {
                this.a.i.clear();
                if (this.a.b() && ick2.i() != null) {
                    HashMap hashMap2 = new HashMap();
                    for (AppIndexingErrorInfo appIndexingErrorInfo : ick2.i()) {
                        Pair pair = new Pair(Integer.valueOf(appIndexingErrorInfo.b), Integer.valueOf(appIndexingErrorInfo.c));
                        ArrayList arrayList3 = (ArrayList) hashMap2.get(pair);
                        if (arrayList3 == null) {
                            arrayList3 = new ArrayList();
                            hashMap2.put(pair, arrayList3);
                        }
                        arrayList3.add(appIndexingErrorInfo);
                    }
                    for (Pair pair2 : hashMap2.keySet()) {
                        ArrayList arrayList4 = (ArrayList) hashMap2.get(pair2);
                        Collections.sort(arrayList4, new aafl());
                        this.a.i.add(new pun((aolv) amrh.a(aolv.a(((Integer) pair2.first).intValue()), aolv.UNRECOGNIZED), (aolx) amrh.a(aolx.a(((Integer) pair2.second).intValue()), aolx.UNRECOGNIZED), ((AppIndexingErrorInfo) arrayList4.get(0)).e, arrayList4));
                    }
                }
                this.a.k.notifyDataSetChanged();
                pue.a(this.a.j);
            }
            ick ick3 = pvq.c;
            GetAppIndexingPackageDetailsCall$Response getAppIndexingPackageDetailsCall$Response = (GetAppIndexingPackageDetailsCall$Response) ick3.a;
            if (getAppIndexingPackageDetailsCall$Response.f && !getAppIndexingPackageDetailsCall$Response.g) {
                this.a.n.setVisibility(0);
            }
            if (this.a.t) {
                if (ick3.h() == -1) {
                    pvt pvt = this.a;
                    pvt.m.setText(pvt.r.getString(R.string.update_index_description_error_sending, new Object[]{"UPDATE_INDEX"}));
                } else if (ick3.h() != 0) {
                    String a2 = pue.a(ick3.h());
                    pvt pvt2 = this.a;
                    pvt2.m.setText(pvt2.r.getString(R.string.update_index_description_sent_time, new Object[]{"UPDATE_INDEX", a2}));
                } else {
                    pvt pvt3 = this.a;
                    pvt3.m.setText(pvt3.r.getString(R.string.update_index_description_never_sent, new Object[]{"UPDATE_INDEX"}));
                }
            }
            pvt pvt4 = this.a;
            Button button = pvt4.l;
            if (button != null) {
                if (!pvt4.i.isEmpty() || !this.a.f.isEmpty()) {
                    z = true;
                }
                button.setEnabled(z);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void onPreExecute() {
        if (this.a.isAdded()) {
            this.a.d.setVisibility(8);
            this.a.e.setVisibility(0);
        }
    }
}
