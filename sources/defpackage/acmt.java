package defpackage;

import android.graphics.Bitmap;
import android.os.AsyncTask;

/* renamed from: acmt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class acmt extends AsyncTask {
    final /* synthetic */ wlj a;
    final /* synthetic */ acmu b;

    public acmt(acmu acmu, wlj wlj) {
        this.b = acmu;
        this.a = wlj;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        Void[] voidArr = (Void[]) objArr;
        return wlu.a(this.a.b());
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        acmu acmu = this.b;
        acmu.b.d.put(acmu.a, (Bitmap) obj);
        for (acmv a2 : this.b.b.e) {
            a2.a();
        }
    }
}
