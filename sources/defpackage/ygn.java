package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;

/* renamed from: ygn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ygn extends isy {
    public final Feature[] D() {
        return ydy.e;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ IInterface a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.phenotype.internal.IPhenotypeService");
        if (queryLocalInterface instanceof ygm) {
            return (ygm) queryLocalInterface;
        }
        return new ygk(iBinder);
    }

    /* access modifiers changed from: protected */
    public final String b() {
        return "com.google.android.gms.phenotype.service.START";
    }

    /* access modifiers changed from: protected */
    public final String c() {
        return "com.google.android.gms.phenotype.internal.IPhenotypeService";
    }

    public final int d() {
        return 9410000;
    }

    public ygn(Context context, Looper looper, ise ise, ica ica, icb icb) {
        super(context, looper, 51, ise, ica, icb);
    }
}
