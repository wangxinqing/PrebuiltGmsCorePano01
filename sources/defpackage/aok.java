package defpackage;

import android.content.ContentProviderClient;
import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.util.ArrayMap;
import android.util.Pair;

/* renamed from: aok  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class aok extends aoe {
    protected final Context a;
    private final ArrayMap b = new ArrayMap();

    public aok(Context context) {
        this.a = context;
    }

    public final void a(Uri uri, aod aod) {
        aoj aoj = new aoj(this, uri, new aof(new Handler(Looper.getMainLooper())), aod);
        Pair pair = new Pair(uri, aod);
        synchronized (this.b) {
            aoj aoj2 = (aoj) this.b.put(pair, aoj);
            if (aoj2 != null) {
                aoj2.b();
            }
        }
        ContentProviderClient acquireContentProviderClient = aoj.f.a.getContentResolver().acquireContentProviderClient(aoj.a);
        if (acquireContentProviderClient != null) {
            acquireContentProviderClient.release();
            aoj.f.a.getContentResolver().registerContentObserver(aoj.a, true, aoj.e);
            aoj.a();
        }
    }

    public final void b(Uri uri, aod aod) {
        synchronized (this.b) {
            aoj aoj = (aoj) this.b.remove(new Pair(uri, aod));
            if (aoj != null) {
                aoj.b();
            }
        }
    }
}
