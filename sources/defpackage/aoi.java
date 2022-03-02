package defpackage;

import android.database.ContentObserver;
import android.os.AsyncTask;
import android.os.Handler;

/* renamed from: aoi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aoi extends ContentObserver {
    final /* synthetic */ aoj a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aoi(aoj aoj, Handler handler) {
        super(handler);
        this.a = aoj;
    }

    public final void onChange(boolean z) {
        AsyncTask.execute(this.a.d);
    }
}
