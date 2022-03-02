package defpackage;

import android.content.Context;
import android.os.Parcel;
import com.google.android.gms.common.internal.GetServiceRequest;
import java.util.Map;
import java.util.Set;

/* renamed from: jay  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class jay extends irg {
    final /* synthetic */ jaz a;
    private int b = 1;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public jay(jaz jaz, Context context, int i, int... iArr) {
        super(context, i, iArr);
        this.a = jaz;
    }

    /* access modifiers changed from: protected */
    public final Set a() {
        return this.a.f;
    }

    /* access modifiers changed from: protected */
    public final Map b() {
        return this.a.g;
    }

    /* access modifiers changed from: protected */
    public final void a(isv isv, GetServiceRequest getServiceRequest) {
        njd.a(getServiceRequest, this.b);
        Parcel obtain = Parcel.obtain();
        ist.a(getServiceRequest, obtain, 0);
        jaz jaz = this.a;
        jbb jbb = new jbb(isv);
        obtain.setDataPosition(0);
        jaz.a(jbb, (GetServiceRequest) GetServiceRequest.CREATOR.createFromParcel(obtain));
        obtain.recycle();
    }

    /* access modifiers changed from: protected */
    public final void a(String str, int i) {
        this.b = i;
        nje.a(str, i, this.a.h, this.e);
    }
}
