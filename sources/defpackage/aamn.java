package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* renamed from: aamn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aamn extends aahm {
    public aamn(Context context, Looper looper, ise ise, iea iea, igg igg, aafk aafk) {
        super(context, looper, 32, ise, iea, igg, aafk);
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ IInterface a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.search.queries.internal.ISearchQueriesService");
        if (queryLocalInterface instanceof aamj) {
            return (aamj) queryLocalInterface;
        }
        return new aamh(iBinder);
    }

    /* access modifiers changed from: protected */
    public final String c() {
        return "com.google.android.gms.search.queries.internal.ISearchQueriesService";
    }

    public final int d() {
        return 12600000;
    }

    public aamn(Context context, ise ise, iea iea, igg igg, aafk aafk) {
        super(context, context.getMainLooper(), 32, ise, iea, igg, aafk);
    }
}
