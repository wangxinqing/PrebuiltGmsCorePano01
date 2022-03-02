package defpackage;

import android.content.Context;
import android.os.Handler;
import com.google.android.places.Subscription;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

/* renamed from: akiy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class akiy extends jip implements jki, akit {
    private static final String[] j = {"android:monitor_location"};
    public final Handler a;
    public final akhm b;
    public final akir g;
    public final akis h;
    public final List i = new ArrayList();
    private final Context k;
    private final Set l = new HashSet();

    public akiy(Context context, Handler handler, akhm akhm, akir akir) {
        super(j, context, handler);
        this.k = context;
        this.a = handler;
        this.b = akhm;
        this.g = akir;
        this.h = new akis(context, "com.google.android.location.places.service.PlaceDetectionAsyncService");
    }

    public final Future a(Subscription subscription) {
        FutureTask futureTask = new FutureTask(new akix(this, subscription));
        this.a.post(new akiv(this, futureTask));
        return futureTask;
    }

    public final void b(Subscription subscription) {
        Context context = this.k;
        akhm akhm = this.b;
        if (subscription.f == null) {
            subscription.f = subscription.a(context, this, akhm);
        }
        a((Object) subscription, (jio) subscription.f);
    }

    /* access modifiers changed from: protected */
    public final void a(int i2) {
        ArrayList arrayList = new ArrayList();
        HashSet<akhu> hashSet = new HashSet<>(this.l);
        for (akhu akhu : c()) {
            if (!this.l.contains(akhu)) {
                arrayList.add(akhu);
            }
            hashSet.remove(akhu);
        }
        for (akhu c : hashSet) {
            c.c();
        }
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            ((akhu) arrayList.get(i3)).b();
        }
        this.l.clear();
        this.l.addAll(c());
        this.b.b.a();
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void b(jio jio) {
        akhu akhu = (akhu) jio;
    }

    public final boolean b(String str) {
        for (Subscription a2 : this.h.a()) {
            if (str.equals(a2.a())) {
                return true;
            }
        }
        return false;
    }

    public final void a(Runnable runnable) {
        if (!this.h.b) {
            this.i.add(runnable);
        } else {
            runnable.run();
        }
    }

    public final void a(String str) {
        ArrayList arrayList = new ArrayList();
        for (Subscription subscription : this.h.a()) {
            if (str.equals(subscription.a())) {
                arrayList.add(subscription);
            }
        }
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            a((Subscription) arrayList.get(i2));
        }
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void a(jio jio) {
        akhu akhu = (akhu) jio;
    }
}
