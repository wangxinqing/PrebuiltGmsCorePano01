package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.proxy.ProxyResponse;

/* renamed from: fuu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class fuu extends bhv implements fuw {
    public fuu(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.internal.IAuthCallbacks");
    }

    public final void a(ProxyResponse proxyResponse) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) proxyResponse);
        b(1, aQ);
    }

    public final void a(String str) {
        Parcel aQ = aQ();
        aQ.writeString(str);
        b(2, aQ);
    }
}
