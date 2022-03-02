package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.contextmanager.fence.internal.FenceStateImpl;
import com.google.android.gms.contextmanager.fence.internal.FenceTriggerInfoImpl;

/* renamed from: jvk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class jvk extends bhv implements jvm {
    public jvk(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.contextmanager.fence.internal.IContextFenceListener");
    }

    public final void a(FenceStateImpl fenceStateImpl) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) fenceStateImpl);
        b(2, aQ);
    }

    public final void a(FenceTriggerInfoImpl fenceTriggerInfoImpl) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) fenceTriggerInfoImpl);
        b(1, aQ);
    }
}
