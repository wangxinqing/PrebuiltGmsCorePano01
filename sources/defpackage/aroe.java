package defpackage;

import android.hardware.location.ContextHubClient;
import android.hardware.location.ContextHubClientCallback;
import android.hardware.location.ContextHubInfo;
import android.hardware.location.NanoAppMessage;

/* renamed from: aroe  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aroe extends ContextHubClientCallback {
    final /* synthetic */ arof a;

    public aroe(arof arof) {
        this.a = arof;
    }

    public final void onHubReset(ContextHubClient contextHubClient) {
        ((arnr) this.a.a).b(contextHubClient.getAttachedHub().getId());
    }

    /* JADX WARNING: type inference failed for: r1v5, types: [arnd, arod] */
    public final void onMessageFromNanoApp(ContextHubClient contextHubClient, NanoAppMessage nanoAppMessage) {
        arok a2 = arok.a(nanoAppMessage.getMessageBody());
        if (a2 == null) {
            String valueOf = String.valueOf(nanoAppMessage);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 33);
            sb.append("Failed to parse nanoapp message: ");
            sb.append(valueOf);
            sb.toString();
            return;
        }
        aron a3 = this.a.b.a(a2);
        if (a3 != null && a3.a) {
            arnt arnt = a3.b;
            arns a4 = this.a.a(nanoAppMessage.getNanoAppId());
            ? r1 = this.a.a;
            arnr arnr = r1;
            if (arnr.c(contextHubClient.getAttachedHub().getId())) {
                aipf aipf = arnr.o;
                if (!(aipf == null || arnt == null)) {
                    aipf.a(a4, arnt.a);
                }
                r1.a(arnr.a((arnh) a4), r1, a4, arnt);
            }
        }
    }

    public final void onNanoAppLoaded(ContextHubClient contextHubClient, long j) {
        arod arod = this.a.a;
        ContextHubInfo attachedHub = contextHubClient.getAttachedHub();
        arns a2 = this.a.a(j);
        arnr arnr = (arnr) arod;
        if (arnr.c(attachedHub.getId())) {
            synchronized (arnr.k) {
                ((arnr) arod).l.put(a2.a, a2);
            }
        }
    }

    public final void onNanoAppUnloaded(ContextHubClient contextHubClient, long j) {
        arod arod = this.a.a;
        ContextHubInfo attachedHub = contextHubClient.getAttachedHub();
        arns a2 = this.a.a(j);
        arnr arnr = (arnr) arod;
        if (arnr.c(attachedHub.getId())) {
            synchronized (arnr.k) {
                ((arnr) arod).l.delete(a2.a);
            }
        }
    }
}
