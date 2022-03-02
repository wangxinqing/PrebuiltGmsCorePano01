package defpackage;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.places.internal.PlacesParams;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: akwm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class akwm extends akwd {
    public final CountDownLatch b = new CountDownLatch(1);
    public akvf c;
    public final akwg d;
    private final akwl e;

    public akwm(PlacesParams placesParams, akuy akuy, akvn akvn, akwg akwg, String str, akhj akhj) {
        super(67, str, placesParams, akuy, akvn, akwg.c(), akhj);
        this.d = akwg;
        this.e = new akwl(this);
    }

    /* access modifiers changed from: protected */
    public final int a() {
        return this.d.a();
    }

    /* access modifiers changed from: protected */
    public final int b() {
        return this.d.b();
    }

    public final aoei c() {
        return this.d.a(this.a);
    }

    /* access modifiers changed from: protected */
    public final boolean e() {
        return this.d.d();
    }

    public final void a(Context context) {
        super.a(context);
        Intent intent = new Intent("com.google.android.gms.location.places.PlaceDetectionAsyncService");
        intent.setPackage(context.getPackageName());
        if (context.bindService(intent, this.e, 1)) {
            try {
                if (this.b.await(azcf.a.a().G(), TimeUnit.SECONDS)) {
                    try {
                        this.d.a(context, this.c, this.a);
                        return;
                    } finally {
                        context.unbindService(this.e);
                    }
                }
            } catch (InterruptedException e2) {
            }
        }
        context.unbindService(this.e);
        throw new nja(8, "Failed to bind to inner service");
    }

    public final void a(Status status) {
        this.d.a(status);
    }
}
