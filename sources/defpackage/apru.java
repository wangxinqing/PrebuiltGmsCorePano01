package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.firebase.auth.api.model.CreateAuthUriResponse;

/* renamed from: apru  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class apru implements apts {
    final /* synthetic */ aptg a;

    public apru(aptg aptg) {
        this.a = aptg;
    }

    public final /* bridge */ /* synthetic */ void a(Object obj) {
        CreateAuthUriResponse createAuthUriResponse = (CreateAuthUriResponse) obj;
        aptg aptg = this.a;
        try {
            aptm aptm = aptg.c;
            Parcel aQ = aptm.aQ();
            bhx.a(aQ, (Parcelable) createAuthUriResponse);
            aptm.c(3, aQ);
        } catch (RemoteException e) {
            aptg.b.e("RemoteException when sending create auth uri response.", e, new Object[0]);
        }
    }

    public final void a(String str) {
        this.a.a(apvs.a(str));
    }
}
