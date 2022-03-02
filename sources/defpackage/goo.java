package defpackage;

import android.os.AsyncTask;
import android.os.SystemClock;
import java.util.Map;
import java.util.concurrent.ExecutionException;

/* renamed from: goo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class goo extends AsyncTask {
    final /* synthetic */ gop a;
    private final Map b;

    public goo(gop gop, Map map) {
        this.a = gop;
        this.b = map;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        Void[] voidArr = (Void[]) objArr;
        gop gop = this.a;
        iwd iwd = gop.a;
        gon gon = gop.e;
        if (gon == null) {
            gop.a.d("DroidGuardHandleTask null", new Object[0]);
            return null;
        }
        try {
            lya lya = (lya) gon.get();
            long currentThreadTimeMillis = SystemClock.currentThreadTimeMillis();
            String a2 = lya.a(this.b);
            gop.a.b("snapshot: %sms", Long.valueOf(SystemClock.currentThreadTimeMillis() - currentThreadTimeMillis));
            return a2;
        } catch (InterruptedException | ExecutionException e) {
            gop.a.d("Error getting DroidGuardHandle", e, new Object[0]);
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        this.a.deliverResult((String) obj);
    }
}
