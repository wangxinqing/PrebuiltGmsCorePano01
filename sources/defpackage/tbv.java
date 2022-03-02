package defpackage;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.mobstore.OpenFileDescriptorResponse;

/* renamed from: tbv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class tbv extends bhw implements tbw {
    public tbv() {
        super("com.google.android.gms.mobstore.IMobStoreFileCallbacks");
    }

    public void a(Status status) {
        throw new UnsupportedOperationException();
    }

    public void b(Status status) {
        throw new UnsupportedOperationException();
    }

    public void a(Status status, OpenFileDescriptorResponse openFileDescriptorResponse) {
        throw new UnsupportedOperationException();
    }

    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            a((Status) bhx.a(parcel, Status.CREATOR), (OpenFileDescriptorResponse) bhx.a(parcel, OpenFileDescriptorResponse.CREATOR));
        } else if (i == 2) {
            a((Status) bhx.a(parcel, Status.CREATOR));
        } else if (i != 3) {
            return false;
        } else {
            b((Status) bhx.a(parcel, Status.CREATOR));
        }
        return true;
    }
}
