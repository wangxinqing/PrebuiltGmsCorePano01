package defpackage;

import android.os.Parcel;
import com.google.android.gms.audiomodem.DecodedToken;
import java.util.List;

/* renamed from: efn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class efn extends bhw implements efo {
    final /* synthetic */ ige a;

    public efn() {
        super("com.google.android.gms.audiomodem.internal.ITokenReceiverListener");
    }

    public final void a(int i) {
        this.a.a(new ecq());
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public efn(ige ige) {
        super("com.google.android.gms.audiomodem.internal.ITokenReceiverListener");
        this.a = ige;
    }

    public final void a(List list) {
        this.a.a(new ecp(list));
    }

    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            a((List) parcel.createTypedArrayList(DecodedToken.CREATOR));
        } else if (i != 2) {
            return false;
        } else {
            a(parcel.readInt());
        }
        parcel2.writeNoException();
        return true;
    }
}
