package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.util.Pair;
import com.google.android.location.geofencer.data.PendingIntentCacheItem;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

/* renamed from: aiju  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aiju implements PendingIntent.OnFinished {
    public final String a;
    public volatile ikh b;
    public ahys c;
    public final Context d;
    public final aijx e;
    private final acrz f;

    public aiju(aekn aekn, Context context, Handler handler, acrz acrz, aijw aijw, String str, aijv aijv, aikk aikk) {
        this.d = context;
        this.f = acrz;
        this.a = str;
        int i = jhg.a;
        this.e = new aijx(context, handler, aijw, aijv, aikk);
        boolean z = aikq.a;
    }

    public final List a(double d2, int i) {
        aijx aijx = this.e;
        return aijx.g.a(aijx.c(), d2, i);
    }

    public final List b(int i) {
        aijx aijx = this.e;
        return aijx.g.c(aijx.c(), i);
    }

    public final int c() {
        return this.e.j();
    }

    public final void onSendFinished(PendingIntent pendingIntent, Intent intent, int i, String str, Bundle bundle) {
        if (this.f.e()) {
            this.f.c();
        }
    }

    public final void a() {
        a(1003);
    }

    public final void b() {
        boolean z = aikq.a;
        if (this.b != null) {
            aijx aijx = this.e;
            String b2 = this.b.b();
            nz nzVar = new nz();
            aucd o = ailw.d.o();
            if (o.c) {
                o.c();
                o.c = false;
            }
            ailw ailw = (ailw) o.b;
            b2.getClass();
            ailw.a |= 1;
            ailw.b = b2;
            for (aikb aikb : aijx.c()) {
                ArrayList arrayList = aikb.c;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    aijt aijt = (aijt) arrayList.get(i);
                    PendingIntentCacheItem pendingIntentCacheItem = (PendingIntentCacheItem) nzVar.get(aijt.b);
                    if (pendingIntentCacheItem == null) {
                        if (aybl.a.a().doNotStoreTagsInSystemMemoryCache()) {
                            pendingIntentCacheItem = new PendingIntentCacheItem(aijt.b, UUID.randomUUID().toString(), new ArrayList(), (String) null);
                        } else {
                            pendingIntentCacheItem = new PendingIntentCacheItem(aijt.b, UUID.randomUUID().toString(), new ArrayList(), aikb.b.b);
                        }
                        nzVar.put(aijt.b, pendingIntentCacheItem);
                    }
                    String str = aijt.a.a;
                    int binarySearch = Collections.binarySearch(pendingIntentCacheItem.c, str);
                    if (binarySearch < 0) {
                        pendingIntentCacheItem.c.add((-binarySearch) - 1, str);
                    }
                    o.a(aijt.a(pendingIntentCacheItem.b));
                }
            }
            Pair create = Pair.create(o, nzVar.values());
            try {
                this.c.a((audx) (ailw) ((aucd) create.first).i());
                boolean z2 = aikq.a;
                this.b.a((Collection) create.second);
            } catch (IOException e2) {
                if (Log.isLoggable("GeofenceStateCache", 6)) {
                    aikq.b("GeofenceStateCache", "Unable to save geofence states on disk, PendingIntent memory cache was not changed");
                }
                throw e2;
            }
        }
    }

    public final void a(int i) {
        if (this.b != null) {
            List d2 = this.b.d();
            int size = d2.size();
            for (int i2 = 0; i2 < size; i2++) {
                PendingIntent pendingIntent = ((PendingIntentCacheItem) d2.get(i2)).a;
                if (i != 1003 || ajqj.a(pendingIntent).equals("com.google.android.gms")) {
                    boolean z = aikq.a;
                    Intent intent = new Intent();
                    intent.putExtra("gms_error_code", i);
                    this.f.a(10000);
                    try {
                        jjy.a(pendingIntent, this.d, 0, intent, (PendingIntent.OnFinished) this);
                    } catch (PendingIntent.CanceledException e2) {
                        if (this.f.e()) {
                            this.f.c();
                        }
                    }
                }
            }
        }
    }
}
