package defpackage;

import android.content.Context;
import android.database.ContentObserver;
import android.os.Handler;
import android.provider.Settings;

/* renamed from: aifs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aifs implements jhq {
    public final Context a;
    public final ContentObserver b;
    public final jhr c;
    public final Object d;
    public volatile aifr e;
    private final Handler f;

    public aifs(Context context, Handler handler) {
        this.a = context;
        this.f = handler;
        if (jkr.b()) {
            jhr a2 = jhr.a(context);
            this.c = a2;
            this.d = a2;
            this.b = null;
            return;
        }
        this.c = null;
        aifq aifq = new aifq(this, "location", "MockModeSettingsWatcher", handler);
        this.b = aifq;
        this.d = aifq;
    }

    public final void a() {
        aifr aifr = this.e;
        if (aifr != null) {
            aifr.e();
        }
    }

    public final void s(String str) {
        this.f.post(new aifp(this));
    }

    public final void a(aifr aifr) {
        synchronized (this.d) {
            if (this.e == null) {
                if (!jkr.b()) {
                    this.a.getContentResolver().registerContentObserver(Settings.Secure.getUriFor("mock_location"), true, this.b);
                } else {
                    this.c.a("android:mock_location", this);
                }
            }
            this.e = aifr;
        }
    }
}
