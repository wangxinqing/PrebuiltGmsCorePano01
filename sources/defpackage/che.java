package defpackage;

import android.hardware.location.ContextHubClient;
import android.hardware.location.ContextHubClientCallback;
import android.hardware.location.NanoAppMessage;
import java.util.List;

/* renamed from: che  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class che extends ContextHubClientCallback {
    final /* synthetic */ chf a;

    public che(chf chf) {
        this.a = chf;
    }

    public final void onHubReset(ContextHubClient contextHubClient) {
        this.a.e();
    }

    public final void onMessageFromNanoApp(ContextHubClient contextHubClient, NanoAppMessage nanoAppMessage) {
        if (nanoAppMessage.getNanoAppId() == 5147455389092024337L) {
            new Object[1][0] = nanoAppMessage.toString();
            int messageType = nanoAppMessage.getMessageType();
            if (messageType != 3 && messageType != 4) {
                if (messageType == 5) {
                    List list = this.a.a;
                    int size = list.size();
                    for (int i = 0; i < size; i++) {
                        ((cdb) list.get(i)).a(true);
                    }
                } else if (messageType != 6) {
                    ((anih) ((anih) bxk.a.c()).a("che", "onMessageFromNanoApp", 297, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[ShushGestureSensor] Unrecognized nano app message.");
                } else {
                    List list2 = this.a.a;
                    int size2 = list2.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        ((cdb) list2.get(i2)).a(false);
                    }
                }
            }
        }
    }

    public final void onNanoAppLoaded(ContextHubClient contextHubClient, long j) {
        new Object[1][0] = Long.valueOf(j);
        if (j == 5147455389092024337L) {
            this.a.e();
        }
    }
}
