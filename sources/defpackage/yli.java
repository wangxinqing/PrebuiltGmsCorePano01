package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;

/* renamed from: yli  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class yli extends isy {
    final Handler a = new qvr();
    private final String[] u;

    public yli(Context context, ica ica, icb icb, String[] strArr) {
        super(context, context.getMainLooper(), 70, ise.a(context), ica, icb);
        this.u = strArr;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ IInterface a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.plus.internal.IPlusInternalService");
        if (queryLocalInterface instanceof ytn) {
            return (ytn) queryLocalInterface;
        }
        return new ytl(iBinder);
    }

    /* access modifiers changed from: protected */
    public final String b() {
        return "com.google.android.gms.plus.service.internal.START";
    }

    /* access modifiers changed from: protected */
    public final String c() {
        return "com.google.android.gms.plus.internal.IPlusInternalService";
    }

    /* access modifiers changed from: protected */
    public final Bundle f() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("skip_oob", true);
        bundle.putStringArray("request_visible_actions", this.u);
        bundle.putString("auth_package", this.c.getPackageName());
        return bundle;
    }
}
