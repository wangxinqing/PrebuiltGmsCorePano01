package defpackage;

import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.auth.api.accounttransfer.AccountTransferMsg;
import com.google.android.gms.auth.api.accounttransfer.AuthenticatorTransferInfo;
import com.google.android.gms.auth.api.accounttransfer.DeviceMetaData;
import com.google.android.gms.common.api.Status;

/* renamed from: etz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class etz extends bhw implements IInterface {
    public etz() {
        super("com.google.android.gms.auth.api.accounttransfer.internal.IAccountTransferCallbacks");
    }

    public void a() {
        throw new UnsupportedOperationException();
    }

    public void a(DeviceMetaData deviceMetaData) {
        throw new UnsupportedOperationException();
    }

    public void a(Status status) {
        throw new UnsupportedOperationException();
    }

    public void a(Status status, AccountTransferMsg accountTransferMsg) {
        throw new UnsupportedOperationException();
    }

    public void a(byte[] bArr) {
        throw new UnsupportedOperationException();
    }

    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 1:
                Status status = (Status) bhx.a(parcel, Status.CREATOR);
                throw new UnsupportedOperationException();
            case 2:
                Status status2 = (Status) bhx.a(parcel, Status.CREATOR);
                AuthenticatorTransferInfo authenticatorTransferInfo = (AuthenticatorTransferInfo) bhx.a(parcel, AuthenticatorTransferInfo.CREATOR);
                throw new UnsupportedOperationException();
            case 3:
                a((Status) bhx.a(parcel, Status.CREATOR), (AccountTransferMsg) bhx.a(parcel, AccountTransferMsg.CREATOR));
                return true;
            case 4:
                a();
                return true;
            case 5:
                a((Status) bhx.a(parcel, Status.CREATOR));
                return true;
            case 6:
                a(parcel.createByteArray());
                return true;
            case 7:
                a((DeviceMetaData) bhx.a(parcel, DeviceMetaData.CREATOR));
                return true;
            default:
                return false;
        }
    }
}
