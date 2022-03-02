package defpackage;

import android.content.Intent;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.iid.MessengerCompat;

/* renamed from: qdr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class qdr extends qvr {
    final /* synthetic */ qdt a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public qdr(qdt qdt, Looper looper) {
        super(looper);
        this.a = qdt;
    }

    public final void handleMessage(Message message) {
        qdt qdt = this.a;
        if (message == null) {
            return;
        }
        if (message.obj instanceof Intent) {
            Intent intent = (Intent) message.obj;
            intent.setExtrasClassLoader(MessengerCompat.class.getClassLoader());
            if (intent.hasExtra("google.messenger")) {
                Parcelable parcelableExtra = intent.getParcelableExtra("google.messenger");
                if (parcelableExtra instanceof MessengerCompat) {
                    qdt.i = (MessengerCompat) parcelableExtra;
                }
                if (parcelableExtra instanceof Messenger) {
                    qdt.h = (Messenger) parcelableExtra;
                }
            }
            qdt.b((Intent) message.obj);
            return;
        }
        Log.w("InstanceID", "Dropping invalid message");
    }
}
