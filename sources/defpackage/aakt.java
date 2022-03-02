package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.appdatasearch.NativeApiInfo;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.search.nativeapi.GetNativeApiInfoCall$Response;

@Deprecated
/* renamed from: aakt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aakt extends aakw implements jbh {
    public final void a(aaku aaku) {
        GetNativeApiInfoCall$Response getNativeApiInfoCall$Response = new GetNativeApiInfoCall$Response();
        getNativeApiInfoCall$Response.a = new Status(8, "API Disabled");
        getNativeApiInfoCall$Response.b = new NativeApiInfo((String) null, (String) null, (String) null);
        Parcel aQ = aaku.aQ();
        bhx.a(aQ, (Parcelable) getNativeApiInfoCall$Response);
        aaku.c(2, aQ);
    }
}
