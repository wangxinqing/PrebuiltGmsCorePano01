package defpackage;

import android.app.PendingIntent;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* renamed from: ghp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ghp extends bhw implements ghq {
    public ghp() {
        super("com.google.android.gms.auth.managed.internal.IEmmCallbacks");
    }

    public void a(Status status, PendingIntent pendingIntent) {
        throw new UnsupportedOperationException();
    }

    public final void a(Status status, byte[] bArr) {
        throw new UnsupportedOperationException();
    }

    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            a((Status) bhx.a(parcel, Status.CREATOR), parcel.createByteArray());
        } else if (i != 9) {
            return false;
        } else {
            a((Status) bhx.a(parcel, Status.CREATOR), (PendingIntent) bhx.a(parcel, PendingIntent.CREATOR));
        }
        return true;
    }
}
