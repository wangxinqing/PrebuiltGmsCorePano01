package defpackage;

import android.os.Parcel;
import android.util.Log;
import com.google.android.gms.common.api.Status;

/* renamed from: vch  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class vch extends bhw implements vci {
    private final ige a;
    private boolean b;

    public vch() {
        super("com.google.android.gms.nearby.messages.internal.INearbyMessagesCallback");
    }

    public final synchronized void a(Status status) {
        if (this.b) {
            String valueOf = String.valueOf(status);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb.append("Received multiple statuses: ");
            sb.append(valueOf);
            Log.wtf("NearbyMessagesCallbackWrapper", sb.toString(), new Exception());
            return;
        }
        this.a.a(new vea(status));
        this.b = true;
    }

    public vch(ige ige) {
        super("com.google.android.gms.nearby.messages.internal.INearbyMessagesCallback");
        this.b = false;
        this.a = ige;
    }

    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        a((Status) bhx.a(parcel, Status.CREATOR));
        return true;
    }
}
