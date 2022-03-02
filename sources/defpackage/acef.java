package defpackage;

import android.os.Bundle;
import android.os.ResultReceiver;
import java.util.ArrayList;
import java.util.List;

/* renamed from: acef  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class acef {
    private static final iwd a = acqa.a("D2D", "UI", "QueuedMessageSender");
    private final List b = new ArrayList();
    private ResultReceiver c;

    public final synchronized void a() {
        this.c = null;
    }

    public final synchronized void a(int i, Bundle bundle) {
        ResultReceiver resultReceiver = this.c;
        if (resultReceiver == null) {
            iwd iwd = a;
            StringBuilder sb = new StringBuilder(43);
            sb.append("Queuing message with eventCode: ");
            sb.append(i);
            iwd.a(sb.toString(), new Object[0]);
            this.b.add(new acee(i, bundle));
            return;
        }
        resultReceiver.send(i, bundle);
    }

    public final synchronized void a(ResultReceiver resultReceiver) {
        List list = this.b;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            acee acee = (acee) list.get(i);
            iwd iwd = a;
            int i2 = acee.a;
            StringBuilder sb = new StringBuilder(50);
            sb.append("Sending queued message with eventCode: ");
            sb.append(i2);
            iwd.a(sb.toString(), new Object[0]);
            resultReceiver.send(acee.a, acee.b);
        }
        this.c = resultReceiver;
        this.b.clear();
    }
}
