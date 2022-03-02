package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* renamed from: ojn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ojn extends isy {
    public static final /* synthetic */ int a = 0;

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ IInterface a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.googlehelp.internal.common.IGoogleHelpService");
        if (queryLocalInterface instanceof ojt) {
            return (ojt) queryLocalInterface;
        }
        return new ojr(iBinder);
    }

    /* access modifiers changed from: protected */
    public final String b() {
        return "com.google.android.gms.googlehelp.service.GoogleHelpService.START";
    }

    /* access modifiers changed from: protected */
    public final String c() {
        return "com.google.android.gms.googlehelp.internal.common.IGoogleHelpService";
    }

    public final int d() {
        return 11925000;
    }

    public ojn(Context context, Looper looper, ise ise, ica ica, icb icb) {
        super(context, looper, 63, ise, ica, icb);
    }
}
