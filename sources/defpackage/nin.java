package defpackage;

import android.content.Context;
import android.os.Parcel;
import com.google.android.gms.common.internal.GetServiceRequest;
import java.util.Map;
import java.util.Set;

/* renamed from: nin  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class nin extends irg {
    final /* synthetic */ nio a;
    private int b = 1;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public nin(nio nio, Context context, int i, int... iArr) {
        super(context, i, iArr);
        this.a = nio;
    }

    /* access modifiers changed from: protected */
    public final Set a() {
        return this.a.g;
    }

    /* access modifiers changed from: protected */
    public final Map b() {
        return this.a.h;
    }

    /* access modifiers changed from: protected */
    public final void a(isv isv, GetServiceRequest getServiceRequest) {
        njd.a(getServiceRequest, this.b);
        Parcel obtain = Parcel.obtain();
        try {
            ist.a(getServiceRequest, obtain, 0);
            nio nio = this.a;
            nit nit = new nit(isv, this.b);
            obtain.setDataPosition(0);
            nio.a(nit, (GetServiceRequest) GetServiceRequest.CREATOR.createFromParcel(obtain));
        } finally {
            obtain.recycle();
        }
    }

    /* access modifiers changed from: protected */
    public final void a(String str, int i) {
        this.b = i;
        nje.a(str, i, this.a.j, this.e);
    }
}
