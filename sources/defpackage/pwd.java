package defpackage;

import android.content.pm.PackageManager;
import android.os.AsyncTask;
import android.view.View;
import com.google.android.gms.R;
import com.google.android.gms.search.administration.GetAppIndexingPackagesCall$Response;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.concurrent.ExecutionException;

/* renamed from: pwd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class pwd extends AsyncTask {
    final /* synthetic */ pwe a;

    protected pwd(pwe pwe) {
        this.a = pwe;
    }

    private final void a(String str, boolean z) {
        PackageManager packageManager = this.a.getContext().getPackageManager();
        try {
            this.a.a.a.add(new pvu(packageManager.getApplicationInfo(str, 0).loadLabel(packageManager).toString(), str, packageManager.getApplicationIcon(str), z));
        } catch (PackageManager.NameNotFoundException e) {
            oso.b("Application %s not found because: %s", (Object) str, (Object) e.getMessage());
        }
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        Void[] voidArr = (Void[]) objArr;
        pwc pwc = new pwc();
        aagp b = aafi.b(this.a.getContext());
        iha b2 = ihb.b();
        b2.a = aahf.a;
        try {
            pwc.c = (ick) acws.a(((iby) b).a(b2.a()));
            pwc.a = 0;
        } catch (InterruptedException | ExecutionException e) {
            if (e.getCause() instanceof ibr) {
                pwc.a = Integer.valueOf(((ibr) e.getCause()).a());
            } else {
                pwc.a = 8;
            }
        }
        if (((Boolean) ozx.at.c()).booleanValue()) {
            pwc.b = new ivk(this.a.getContext(), "3pErrorCachePreferences", true).getBoolean("LoggingEnabled", false);
        }
        return pwc;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        pwc pwc = (pwc) obj;
        if (this.a.isAdded()) {
            this.a.d.setVisibility(8);
            this.a.g.a(false);
            if (pwc.a.intValue() != 0) {
                pue.a(this.a.getContext(), this.a.getContext().getString(R.string.packages_title), this.a.getContext().getString(R.string.failed_retrieve_packages), pwc.a);
                return;
            }
            this.a.c.setVisibility(0);
            if (((Boolean) ozx.at.c()).booleanValue()) {
                this.a.e.setVisibility(0);
                this.a.f.setChecked(pwc.b);
                this.a.a(pwc.b);
            }
            this.a.a.a.clear();
            HashSet<String> hashSet = new HashSet<>(Arrays.asList(((GetAppIndexingPackagesCall$Response) pwc.c.a).b));
            HashSet<String> hashSet2 = new HashSet<>(Arrays.asList(((GetAppIndexingPackagesCall$Response) pwc.c.a).c));
            for (String a2 : hashSet2) {
                a(a2, true);
            }
            hashSet.removeAll(hashSet2);
            for (String a3 : hashSet) {
                a(a3, false);
            }
            Collections.sort(this.a.a.a, new pvv());
            this.a.a.notifyDataSetChanged();
        }
    }

    /* access modifiers changed from: protected */
    public final void onPreExecute() {
        if (this.a.isAdded()) {
            this.a.c.setVisibility(8);
            this.a.d.setVisibility(0);
            View view = this.a.e;
            if (view != null) {
                view.setVisibility(8);
            }
        }
    }
}
