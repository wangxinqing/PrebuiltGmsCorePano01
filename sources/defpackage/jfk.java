package defpackage;

import android.content.Intent;
import android.os.Message;

/* renamed from: jfk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class jfk extends jfo {
    final /* synthetic */ jfl a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public jfk(jfl jfl, jfp jfp) {
        super(jfp);
        this.a = jfl;
    }

    public final void handleMessage(Message message) {
        this.a.a((Intent) message.obj);
        this.a.stopSelf(message.arg1);
    }
}
