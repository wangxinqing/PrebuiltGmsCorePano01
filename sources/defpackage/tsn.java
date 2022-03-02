package defpackage;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: tsn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class tsn {
    private final aosh a;

    public tsn(aosh aosh) {
        this.a = aosh;
    }

    public final void a(IBinder iBinder) {
        aryd aryd;
        aosh aosh = this.a;
        if (iBinder != null) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.location.nearby.common.fastpair.ILocalizedStringWrapperService");
            aryd = queryLocalInterface instanceof aryd ? (aryd) queryLocalInterface : new aryd(iBinder);
        } else {
            aryd = null;
        }
        aosh.b((Object) aryd);
    }
}
