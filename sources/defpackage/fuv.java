package defpackage;

import android.os.Parcel;
import com.google.android.gms.auth.api.proxy.ProxyResponse;

/* renamed from: fuv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class fuv extends bhw implements fuw {
    public fuv() {
        super("com.google.android.gms.auth.api.internal.IAuthCallbacks");
    }

    public void a(ProxyResponse proxyResponse) {
        throw new UnsupportedOperationException();
    }

    public final void a(String str) {
        throw new UnsupportedOperationException();
    }

    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            a((ProxyResponse) bhx.a(parcel, ProxyResponse.CREATOR));
        } else if (i != 2) {
            return false;
        } else {
            a(parcel.readString());
        }
        parcel2.writeNoException();
        return true;
    }
}
