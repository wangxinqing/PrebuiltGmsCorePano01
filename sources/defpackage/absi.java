package defpackage;

import com.google.android.gms.smartdevice.d2d.data.MessagePayload;
import java.util.ArrayList;

/* renamed from: absi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class absi implements acvv {
    private final absq a;

    public absi(absq absq) {
        this.a = absq;
    }

    public final void a(Object obj) {
        absq absq = this.a;
        MessagePayload messagePayload = new MessagePayload();
        messagePayload.b((ArrayList) obj);
        absq.b(messagePayload);
    }
}
