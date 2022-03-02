package defpackage;

import android.os.Looper;
import android.os.Message;
import com.google.android.gms.location.internal.LocationRequestInternal;
import java.util.List;

/* renamed from: aidl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aidl extends qvr {
    final /* synthetic */ aidm a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aidl(aidm aidm, Looper looper) {
        super(looper);
        this.a = aidm;
    }

    public final void handleMessage(Message message) {
        boolean z = true;
        if (message.what == 1) {
            List<LocationRequestInternal> list = (List) message.obj;
            long j = Long.MAX_VALUE;
            for (LocationRequestInternal locationRequestInternal : list) {
                long j2 = locationRequestInternal.b.b;
                if (j2 < j) {
                    j = j2;
                }
            }
            aidm aidm = this.a;
            int i = aidm.f;
            if (j <= aidm.e) {
                z = false;
            }
            aidm.e = j;
            this.a.b.a(list, aidm.d.a(j, z));
        }
    }
}
