package defpackage;

import android.os.Looper;
import android.os.Message;
import android.util.Log;

/* renamed from: ajqn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ajqn extends qvr {
    final /* synthetic */ ajqo a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ajqn(ajqo ajqo, Looper looper) {
        super(looper);
        this.a = ajqo;
    }

    /* access modifiers changed from: protected */
    public final void a(Message message) {
        ajqo ajqo = this.a;
        if (ajqo.d != null) {
            try {
                message.setTarget(ajqo.c);
                this.a.c.dispatchMessage(message);
                if (this.a.d.e()) {
                    try {
                        this.a.d.c();
                    } catch (Exception e) {
                        String valueOf = String.valueOf(e);
                        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 34);
                        sb.append("exception when releasing wakelock ");
                        sb.append(valueOf);
                        Log.e("GCoreFlp", sb.toString());
                    }
                }
            } catch (Throwable th) {
                if (this.a.d.e()) {
                    try {
                        this.a.d.c();
                    } catch (Exception e2) {
                        String valueOf2 = String.valueOf(e2);
                        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 34);
                        sb2.append("exception when releasing wakelock ");
                        sb2.append(valueOf2);
                        Log.e("GCoreFlp", sb2.toString());
                    }
                }
                throw th;
            }
        } else {
            throw new UnsupportedOperationException();
        }
    }
}
