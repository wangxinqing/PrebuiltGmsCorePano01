package defpackage;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.contextmanager.fence.internal.ContextFenceRegistrationStub;
import com.google.android.gms.contextmanager.fence.internal.UpdateFenceOperation;

/* renamed from: jwb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class jwb implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new UpdateFenceOperation[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = ivw.b(parcel);
        long j = 0;
        long j2 = 0;
        ContextFenceRegistrationStub contextFenceRegistrationStub = null;
        IBinder iBinder = null;
        PendingIntent pendingIntent = null;
        String str = null;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (ivw.a(readInt)) {
                case 2:
                    i = ivw.g(parcel2, readInt);
                    break;
                case 3:
                    contextFenceRegistrationStub = (ContextFenceRegistrationStub) ivw.a(parcel2, readInt, ContextFenceRegistrationStub.CREATOR);
                    break;
                case 4:
                    iBinder = ivw.r(parcel2, readInt);
                    break;
                case 5:
                    pendingIntent = (PendingIntent) ivw.a(parcel2, readInt, PendingIntent.CREATOR);
                    break;
                case 6:
                    str = ivw.q(parcel2, readInt);
                    break;
                case 7:
                    j = ivw.i(parcel2, readInt);
                    break;
                case 8:
                    j2 = ivw.i(parcel2, readInt);
                    break;
                default:
                    ivw.b(parcel2, readInt);
                    break;
            }
        }
        ivw.E(parcel2, b);
        return new UpdateFenceOperation(i, contextFenceRegistrationStub, iBinder, pendingIntent, str, j, j2);
    }
}
