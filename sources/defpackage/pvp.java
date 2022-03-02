package defpackage;

import android.content.Context;
import android.os.AsyncTask;
import com.google.android.gms.R;
import java.util.concurrent.ExecutionException;

/* renamed from: pvp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class pvp extends AsyncTask {
    final /* synthetic */ pvt a;

    public pvp(pvt pvt) {
        this.a = pvt;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        String[] strArr = (String[]) objArr;
        boolean z = true;
        if (strArr.length != 1) {
            z = false;
        }
        iva.b(z);
        String str = strArr[0];
        aagp b = aafi.b(this.a.getContext());
        iha b2 = ihb.b();
        b2.a = new aahi(str);
        try {
            acws.a(((iby) b).a(b2.a()));
            return 0;
        } catch (InterruptedException | ExecutionException e) {
            if (e.getCause() instanceof ibr) {
                return Integer.valueOf(((ibr) e.getCause()).a());
            }
            return 8;
        }
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        Integer num = (Integer) obj;
        if (this.a.isAdded()) {
            this.a.e.setVisibility(8);
            if (num.intValue() != 0) {
                pvt pvt = this.a;
                pue.a((Context) pvt.r, pvt.getContext().getString(R.string.debug_info), this.a.getContext().getString(R.string.failed_clear_debug_info), num);
                return;
            }
            this.a.d.setVisibility(0);
            this.a.p.show();
            this.a.a();
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
