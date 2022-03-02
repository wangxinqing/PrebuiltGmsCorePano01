package defpackage;

import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Parcelable;

/* renamed from: ajgt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ajgt extends qvr {
    public final ajgu a;

    public ajgt(ajgu ajgu, Looper looper) {
        super(looper);
        this.a = ajgu;
    }

    public static final Parcelable b(Message message) {
        return message.getData().getParcelable("d");
    }

    public final void a(int i) {
        int i2 = ajgu.d;
        String str = this.a.a;
        sendMessage(obtainMessage(i));
    }

    public final void handleMessage(Message message) {
        int i = ajgu.d;
        String str = this.a.a;
        int i2 = message.what;
        boolean z = false;
        for (ajgs ajgs = this.a.c; ajgs != null && !z; ajgs = ajgs.g) {
            z = ajgs.a(message);
            String str2 = this.a.a;
            int i3 = message.what;
        }
    }

    public final void a(int i, long j) {
        if (!this.a.b.hasMessages(i)) {
            a(i, (Bundle) null, j);
        }
    }

    public final void a(int i, Bundle bundle) {
        int i2 = ajgu.d;
        String str = this.a.a;
        Message obtainMessage = obtainMessage(i);
        obtainMessage.setData(bundle);
        sendMessage(obtainMessage);
    }

    public final void a(int i, Bundle bundle, long j) {
        int i2 = ajgu.d;
        String str = this.a.a;
        Message obtainMessage = obtainMessage(i);
        if (bundle != null) {
            obtainMessage.setData(bundle);
        }
        sendMessageDelayed(obtainMessage, j);
    }
}
