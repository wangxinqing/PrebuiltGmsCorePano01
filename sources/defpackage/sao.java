package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.mdh.FootprintsRecordingSetting;

/* renamed from: sao  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class sao extends bhv implements IInterface {
    public sao(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.mdh.internal.IMdhFootprintsRecordingSettingCallback");
    }

    public final void a(Status status, FootprintsRecordingSetting footprintsRecordingSetting) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) status);
        bhx.a(aQ, (Parcelable) footprintsRecordingSetting);
        c(1, aQ);
    }
}
