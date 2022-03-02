package defpackage;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.AsyncTask;
import android.view.View;
import android.widget.TextView;
import com.google.android.gms.R;
import com.google.firebase.appindexing.internal.GetIndexableRequest;
import com.google.firebase.appindexing.internal.Thing;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: put  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class put extends AsyncTask {
    private final String a;

    public put(String str) {
        this.a = str;
    }

    /* access modifiers changed from: protected */
    public abstract Context a();

    /* renamed from: a */
    public final pus doInBackground(String... strArr) {
        boolean z;
        if (strArr.length == 2) {
            z = true;
        } else {
            z = false;
        }
        iva.b(z);
        String str = strArr[0];
        String str2 = strArr[1];
        acwa b = aplg.a(a()).a.b((ihb) new apml(new GetIndexableRequest(str, str2)));
        pus pus = new pus();
        try {
            pus.a = (aplu) acws.a(b, 60, TimeUnit.SECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            pus.b = e;
        }
        return pus;
    }

    /* access modifiers changed from: protected */
    public abstract View b();

    /* access modifiers changed from: protected */
    public abstract View c();

    /* access modifiers changed from: protected */
    public abstract TextView d();

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        pus pus = (pus) obj;
        b().setVisibility(0);
        c().setVisibility(8);
        if (pus.b == null) {
            aplu aplu = pus.a;
            if (aplu == null) {
                pue.a((View) d(), this.a);
            } else if (aplu instanceof Thing) {
                pue.a((View) d(), (Thing) pus.a);
            } else {
                pue.a((View) d(), a().getString(R.string.invalid_indexable_type, new Object[]{"Indexable"}));
            }
        } else {
            new AlertDialog.Builder(a()).setTitle(a().getString(R.string.indexable_details_title, new Object[]{"Indexable"})).setMessage(a().getString(R.string.failed_retrieve_indexable_details, new Object[]{"Indexable"})).setPositiveButton(R.string.common_ok, (DialogInterface.OnClickListener) null).show();
            pue.a((View) d(), a().getString(R.string.failed_retrieve_indexable_details, new Object[]{"Indexable"}));
        }
    }

    /* access modifiers changed from: protected */
    public final void onPreExecute() {
        b().setVisibility(8);
        c().setVisibility(0);
    }
}
