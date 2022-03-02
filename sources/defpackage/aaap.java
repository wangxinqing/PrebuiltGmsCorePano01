package defpackage;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.common.api.Status;

/* renamed from: aaap  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aaap extends nis {
    private final int a;

    public aaap(int i) {
        super(218, "HandleWakeupEvent");
        this.a = i;
    }

    /* access modifiers changed from: protected */
    public final void a(Context context) {
        nxn nxn = nxn.CAUSE_UNKNOWN;
        int ordinal = nxn.a(this.a).ordinal();
        if (ordinal == 1) {
            aaaz.b(context);
        } else if (ordinal == 2) {
            aaaz.b();
        } else if (ordinal == 3) {
            aaaz.c();
        }
    }

    /* access modifiers changed from: protected */
    public final void a(Status status) {
        String valueOf = String.valueOf(status);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 29);
        sb.append("Failed to send wakeup message");
        sb.append(valueOf);
        Log.e("NetworkScheduler", sb.toString());
    }
}
