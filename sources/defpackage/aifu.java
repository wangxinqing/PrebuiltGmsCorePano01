package defpackage;

import android.os.Looper;
import android.os.Message;
import com.google.android.gms.location.ActivityRecognitionResult;
import com.google.android.gms.location.NetworkLocationStatus;
import java.util.ArrayList;
import java.util.List;

/* renamed from: aifu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aifu extends qvr {
    final /* synthetic */ aifw a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aifu(aifw aifw, Looper looper) {
        super(looper);
        this.a = aifw;
    }

    public final void handleMessage(Message message) {
        aift aift;
        if (this.a.i != null) {
            int i = message.what;
            if (i == 0) {
                this.a.i.a((ActivityRecognitionResult) message.obj);
            } else if (i == 1) {
                this.a.i.a((List) message.obj);
            } else if (i == 2) {
                this.a.i.a((NetworkLocationStatus[]) message.obj);
            } else if (i == 3) {
                this.a.i.d();
            } else if (i != 4) {
                String valueOf = String.valueOf(message);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 23);
                sb.append("Unexpected msg.what in ");
                sb.append(valueOf);
                throw new IllegalStateException(sb.toString());
            } else if (axxm.k() && (aift = this.a.j) != null) {
                aift.a((ArrayList) message.obj);
            }
        }
    }
}
