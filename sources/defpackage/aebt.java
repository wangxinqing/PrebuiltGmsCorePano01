package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.util.Log;
import java.util.concurrent.ExecutorService;

/* renamed from: aebt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aebt extends isy {
    private final aeba A = new aeba();
    private final aebv B;
    private final aeba a = new aeba();
    private final aeba u = new aeba();
    private final aeba v = new aeba();
    private final aeba w = new aeba();
    private final aeba x = new aeba();
    private final aeba y = new aeba();
    private final aeba z = new aeba();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aebt(Context context, Looper looper, ica ica, icb icb, ise ise) {
        super(context, looper, 14, ise, ica, icb);
        ExecutorService a2 = qvj.b.a();
        aebv a3 = aebv.a(context);
        iva.a((Object) a2);
        this.B = a3;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ IInterface a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableService");
        if (queryLocalInterface instanceof aeaz) {
            return (aeaz) queryLocalInterface;
        }
        return new aeaz(iBinder);
    }

    /* access modifiers changed from: protected */
    public final String b() {
        return "com.google.android.gms.wearable.BIND";
    }

    /* access modifiers changed from: protected */
    public final String c() {
        return "com.google.android.gms.wearable.internal.IWearableService";
    }

    public final int d() {
        return 8600000;
    }

    public final boolean n() {
        return !this.B.a("com.google.android.wearable.app.cn");
    }

    /* access modifiers changed from: protected */
    public final String r() {
        return !this.B.a("com.google.android.wearable.app.cn") ? "com.google.android.gms" : "com.google.android.wearable.app.cn";
    }

    /* access modifiers changed from: protected */
    public final void a(int i, IBinder iBinder, Bundle bundle, int i2) {
        if (i == 0) {
            this.a.a(iBinder);
            this.u.a(iBinder);
            this.v.a(iBinder);
            this.w.a(iBinder);
            this.x.a(iBinder);
            this.y.a(iBinder);
            this.z.a(iBinder);
            this.A.a(iBinder);
        }
        super.a(i, iBinder, bundle, i2);
    }

    public final void a(irr irr) {
        int i;
        if (!n()) {
            try {
                Bundle bundle = this.c.getPackageManager().getApplicationInfo("com.google.android.wearable.app.cn", 128).metaData;
                if (bundle != null) {
                    i = bundle.getInt("com.google.android.wearable.api.version", 0);
                } else {
                    i = 0;
                }
                if (i < 8600000) {
                    StringBuilder sb = new StringBuilder(82);
                    sb.append("The Wear OS app is out of date. Requires API version 8600000 but found ");
                    sb.append(i);
                    Log.w("WearableClient", sb.toString());
                    Context context = this.c;
                    Intent intent = new Intent("com.google.android.wearable.app.cn.UPDATE_ANDROID_WEAR").setPackage("com.google.android.wearable.app.cn");
                    if (context.getPackageManager().resolveActivity(intent, 65536) == null) {
                        intent = new Intent("android.intent.action.VIEW", Uri.parse("market://details").buildUpon().appendQueryParameter("id", "com.google.android.wearable.app.cn").build());
                    }
                    a(irr, 6, PendingIntent.getActivity(context, 0, intent, 0));
                    return;
                }
            } catch (PackageManager.NameNotFoundException e) {
                a(irr, 16, (PendingIntent) null);
                return;
            }
        }
        super.a(irr);
    }
}
