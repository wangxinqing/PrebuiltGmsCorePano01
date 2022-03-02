package defpackage;

import com.google.android.gms.common.api.Status;
import java.util.concurrent.ExecutionException;

/* renamed from: pdu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class pdu implements pjl {
    private final aorr a;
    private final sad b;

    public pdu(sad sad, aorr aorr) {
        this.b = sad;
        this.a = aorr;
    }

    public final void a() {
        try {
            this.b.a(Status.a, ((auke) this.a.get()).k());
        } catch (InterruptedException e) {
            a(pku.a(getClass().getSimpleName(), 14, "Failed to get ChannelConfig"));
        } catch (ExecutionException e2) {
            a(pku.a(getClass().getSimpleName(), "Failed to get ChannelConfig"));
        }
    }

    public final void a(Status status) {
        this.b.a(status, (byte[]) null);
    }
}
