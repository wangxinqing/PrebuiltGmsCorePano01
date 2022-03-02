package defpackage;

import android.os.AsyncTask;
import java.util.List;

/* renamed from: erp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class erp extends AsyncTask {
    final /* synthetic */ Runnable a;
    final /* synthetic */ String b;
    final /* synthetic */ boolean c;
    final /* synthetic */ erq d;

    public erp(erq erq, Runnable runnable, String str, boolean z) {
        this.d = erq;
        this.a = runnable;
        this.b = str;
        this.c = z;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        Void[] voidArr = (Void[]) objArr;
        return this.d.b.a(this.b, this.c);
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        List list = (List) obj;
        this.d.c.removeCallbacks(this.a);
        if (list == null || list.isEmpty()) {
            this.d.a.f();
        } else if (list.size() != 1) {
            this.d.a.a((String) list.get(0), (String) list.get(1));
        } else {
            this.d.a.a((String) list.get(0));
        }
    }

    /* access modifiers changed from: protected */
    public final void onPreExecute() {
        this.d.c.postDelayed(this.a, 100);
    }
}
