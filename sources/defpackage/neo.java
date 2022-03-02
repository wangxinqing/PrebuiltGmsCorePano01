package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.fitness.request.ListClaimedBleDevicesRequest;
import com.google.android.gms.fitness.result.BleDevicesResult;
import java.util.Collections;

/* renamed from: neo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class neo extends ndi {
    public neo(icc icc) {
        super(icc);
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void a(ibf ibf) {
        neq neq = new neq(this);
        ned ned = (ned) ((ndk) ibf).x();
        ListClaimedBleDevicesRequest listClaimedBleDevicesRequest = new ListClaimedBleDevicesRequest((ner) neq);
        Parcel aQ = ned.aQ();
        bhx.a(aQ, (Parcelable) listClaimedBleDevicesRequest);
        ned.b(5, aQ);
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ icl b(Status status) {
        return new BleDevicesResult(Collections.emptyList(), status);
    }
}
