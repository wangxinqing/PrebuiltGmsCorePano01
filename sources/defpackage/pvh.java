package defpackage;

import android.os.AsyncTask;
import com.google.android.gms.R;
import com.google.android.gms.appdatasearch.STSortSpec;
import com.google.android.gms.appdatasearch.SearchResults;
import com.google.android.gms.appdatasearch.Section;
import java.util.Collections;
import java.util.concurrent.ExecutionException;

/* renamed from: pvh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class pvh extends AsyncTask {
    final /* synthetic */ pvi a;

    public pvh(pvi pvi) {
        this.a = pvi;
    }

    /* access modifiers changed from: package-private */
    public final boolean a() {
        return this.a.isAdded();
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        boolean z;
        pvf[] pvfArr = (pvf[]) objArr;
        if (pvfArr.length == 1) {
            z = true;
        } else {
            z = false;
        }
        iva.b(z);
        aalw a2 = aafi.a(this.a.getActivity(), (aafk) null);
        pvg pvg = new pvg();
        pvf pvf = pvfArr[0];
        pvg.c = pvf.a;
        pvg.d = pvf.b;
        pvg.e = pvf.c;
        pvg.f = pvf.d;
        try {
            String str = pvg.c;
            String str2 = pvg.d;
            String str3 = pvg.f;
            dti dti = new dti();
            dti.a(new Section("name"));
            dti.c();
            dti.a = new STSortSpec("(MAX _CREATED_TIMESTAMP _LAST_USED_TIMESTAMP)");
            dti.d();
            if (str3 != null) {
                if (str3.length() >= 4) {
                    dti.b();
                }
            }
            pvg.b = (SearchResults) acws.a(a2.a(str3, str, new String[]{str2}, 0, 100, dti.a()));
            pvg.a = 0;
        } catch (InterruptedException | ExecutionException e) {
            pvg.a = e.getCause() instanceof ibr ? ((ibr) e.getCause()).a() : 8;
        }
        return pvg;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        long j;
        long j2;
        pvg pvg = (pvg) obj;
        if (a()) {
            this.a.d.setVisibility(8);
            this.a.h.a(false);
            if (pvg.a != 0) {
                pue.a(this.a.getContext(), "Indexables", this.a.getContext().getString(R.string.failed_retrieve_indexables, new Object[]{"Indexables"}), Integer.valueOf(pvg.a));
                return;
            }
            this.a.c.setVisibility(0);
            this.a.a.a.clear();
            dua b = pvg.b.iterator();
            while (b.hasNext()) {
                dtz a2 = b.next();
                String b2 = a2.b("name");
                String a3 = a2.a();
                SearchResults searchResults = a2.b;
                long[] jArr = searchResults.n;
                if (jArr != null) {
                    j = jArr[a2.a];
                } else {
                    j = 0;
                }
                long[] jArr2 = searchResults.o;
                if (jArr2 != null) {
                    j2 = jArr2[a2.a];
                } else {
                    j2 = 0;
                }
                this.a.a.a.add(new pux(b2, a3, j, j2, pvg.c, pvg.d, pvg.e));
            }
            Collections.sort(this.a.a.a, new puw());
            this.a.a.notifyDataSetChanged();
        }
    }

    /* access modifiers changed from: protected */
    public final void onPreExecute() {
        if (a()) {
            this.a.c.setVisibility(8);
            this.a.d.setVisibility(0);
        }
    }
}
