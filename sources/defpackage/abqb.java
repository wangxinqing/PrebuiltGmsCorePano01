package defpackage;

import com.google.android.gms.smartdevice.d2d.data.MessagePayload;
import java.util.ArrayList;

/* renamed from: abqb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class abqb implements acvv {
    private final abqd a;

    public abqb(abqd abqd) {
        this.a = abqd;
    }

    public final void a(Object obj) {
        abqd abqd = this.a;
        MessagePayload messagePayload = new MessagePayload();
        messagePayload.b((ArrayList) obj);
        abqd.b(messagePayload);
    }
}
