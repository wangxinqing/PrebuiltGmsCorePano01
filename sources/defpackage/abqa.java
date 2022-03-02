package defpackage;

import com.google.android.gms.smartdevice.d2d.data.MessagePayload;
import com.google.android.gms.smartdevice.d2d.data.WorkProfilePayload;

/* renamed from: abqa  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class abqa implements acvv {
    private final abqd a;

    public abqa(abqd abqd) {
        this.a = abqd;
    }

    public final void a(Object obj) {
        abqd abqd = this.a;
        WorkProfilePayload workProfilePayload = (WorkProfilePayload) obj;
        MessagePayload messagePayload = new MessagePayload();
        messagePayload.a(workProfilePayload);
        abqd.b(messagePayload);
        abqd.e.g(workProfilePayload.b());
    }
}
