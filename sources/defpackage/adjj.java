package defpackage;

import android.os.AsyncTask;
import android.util.Log;

/* renamed from: adjj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class adjj extends AsyncTask {
    final /* synthetic */ adhy a;

    public adjj(adhy adhy) {
        this.a = adhy;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        Void[] voidArr = (Void[]) objArr;
        Log.i("SystemUpdateClient", "Sending request for getLastCheckinSuccessTime.");
        try {
            return Long.valueOf(gwc.c(this.a.getApplicationContext()));
        } catch (Exception e) {
            Log.w("SystemUpdateClient", "getLastCheckinSuccessTime error", e);
            return 0L;
        }
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        long j;
        Long l = (Long) obj;
        adhy adhy = this.a;
        int i = adjk.h;
        boolean z = adjk.i;
        if (l != null) {
            j = l.longValue();
        } else {
            j = 0;
        }
        adhy.a(i, z, j);
    }
}
