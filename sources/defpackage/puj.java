package defpackage;

import android.content.SharedPreferences;
import android.os.AsyncTask;

/* renamed from: puj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class puj extends AsyncTask {
    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        boolean z;
        if (objArr.length == 2) {
            z = true;
        } else {
            z = false;
        }
        iva.b(z);
        SharedPreferences.Editor edit = new ivk(objArr[0], "3pErrorCachePreferences", true).edit();
        edit.putBoolean("LoggingEnabled", objArr[1].booleanValue());
        edit.apply();
        return null;
    }
}
