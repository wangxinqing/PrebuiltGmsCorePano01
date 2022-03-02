package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;

/* renamed from: gey  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class gey extends isy {
    private final gen a;

    public gey(Context context, Looper looper, ise ise, iea iea, igg igg, gen gen) {
        super(context, looper, 172, ise, iea, igg);
        this.a = gen;
    }

    public final Feature[] D() {
        return gqy.b;
    }

    /* access modifiers changed from: protected */
    public final boolean F() {
        return true;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ IInterface a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.folsom.internal.IKeyRetrievalService");
        if (queryLocalInterface instanceof ger) {
            return (ger) queryLocalInterface;
        }
        return new ger(iBinder);
    }

    /* access modifiers changed from: protected */
    public final String b() {
        return "com.google.android.gms.auth.key.retrieval.service.START";
    }

    /* access modifiers changed from: protected */
    public final String c() {
        return "com.google.android.gms.auth.folsom.internal.IKeyRetrievalService";
    }

    public final int d() {
        return 19609000;
    }

    /* access modifiers changed from: protected */
    public final Bundle f() {
        Bundle bundle = new Bundle();
        bundle.putString("SECURITY_DOMAIN", this.a.a);
        return bundle;
    }
}
