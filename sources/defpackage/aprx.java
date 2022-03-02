package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.firebase.auth.api.model.GetTokenResponse;

/* renamed from: aprx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aprx implements apts {
    final /* synthetic */ aptg a;

    public aprx(aptg aptg) {
        this.a = aptg;
    }

    public final /* bridge */ /* synthetic */ void a(Object obj) {
        GetTokenResponse getTokenResponse = (GetTokenResponse) obj;
        aptg aptg = this.a;
        try {
            aptm aptm = aptg.c;
            Parcel aQ = aptm.aQ();
            bhx.a(aQ, (Parcelable) getTokenResponse);
            aptm.c(1, aQ);
        } catch (RemoteException e) {
            aptg.b.e("RemoteException when sending token result.", e, new Object[0]);
        }
    }

    public final void a(String str) {
        this.a.a(apvs.a(str));
    }
}
