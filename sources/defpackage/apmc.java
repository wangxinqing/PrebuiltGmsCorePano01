package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* renamed from: apmc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class apmc extends isy {
    public static final ibq a = new ibq("AppIndexing.API", v, u);
    private static final ibg u = new ibg();
    private static final ibn v = new apmb();

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ IInterface a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.firebase.appindexing.internal.IAppIndexingService");
        if (queryLocalInterface instanceof apmt) {
            return (apmt) queryLocalInterface;
        }
        return new apmr(iBinder);
    }

    /* access modifiers changed from: protected */
    public final String b() {
        return "com.google.android.gms.icing.APP_INDEXING_SERVICE";
    }

    /* access modifiers changed from: protected */
    public final String c() {
        return "com.google.firebase.appindexing.internal.IAppIndexingService";
    }

    public final int d() {
        return 12600000;
    }

    public apmc(Context context, Looper looper, ise ise, ica ica, icb icb) {
        super(context, looper, 113, ise, ica, icb);
    }
}
