package defpackage;

import android.os.Parcel;
import com.google.android.gms.contextmanager.fence.internal.FenceStateImpl;
import com.google.android.gms.contextmanager.fence.internal.FenceTriggerInfoImpl;

/* renamed from: jvl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class jvl extends bhw implements jvm {
    public jvl() {
        super("com.google.android.gms.contextmanager.fence.internal.IContextFenceListener");
    }

    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            a((FenceTriggerInfoImpl) bhx.a(parcel, FenceTriggerInfoImpl.CREATOR));
        } else if (i != 2) {
            return false;
        } else {
            a((FenceStateImpl) bhx.a(parcel, FenceStateImpl.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
