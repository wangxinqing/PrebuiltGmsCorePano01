package defpackage;

import com.google.android.gms.smartdevice.d2d.data.MessagePayload;
import com.google.android.gms.smartdevice.d2d.data.WorkProfilePayload;

/* renamed from: absh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class absh implements acvv {
    private final absq a;

    public absh(absq absq) {
        this.a = absq;
    }

    public final void a(Object obj) {
        absq absq = this.a;
        WorkProfilePayload workProfilePayload = (WorkProfilePayload) obj;
        MessagePayload messagePayload = new MessagePayload();
        messagePayload.a(workProfilePayload);
        absq.b(messagePayload);
        absq.j.g(workProfilePayload.b());
    }
}
