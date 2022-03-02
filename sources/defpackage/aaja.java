package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* renamed from: aaja  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aaja extends aahm {
    public aaja(Context context, Looper looper, ise ise, iea iea, igg igg, aafk aafk) {
        super(context, looper, 36, ise, iea, igg, aafk);
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ IInterface a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.search.corpora.internal.ISearchCorporaService");
        if (queryLocalInterface instanceof aait) {
            return (aait) queryLocalInterface;
        }
        return new aair(iBinder);
    }

    /* access modifiers changed from: protected */
    public final String c() {
        return "com.google.android.gms.search.corpora.internal.ISearchCorporaService";
    }

    public final int d() {
        return 12600000;
    }

    public aaja(Context context, ise ise, iea iea, igg igg, aafk aafk) {
        super(context, context.getMainLooper(), 36, ise, iea, igg, aafk);
    }
}
