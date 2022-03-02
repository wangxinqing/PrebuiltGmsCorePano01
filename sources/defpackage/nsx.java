package defpackage;

import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;

/* renamed from: nsx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class nsx extends bhw implements nsy {
    private final Messenger a;
    private final aabz b;

    public nsx() {
        super("com.google.android.gms.gcm.IMessengerConnection");
    }

    public final void a(Message message) {
        this.a.send(message);
    }

    public final void b() {
        this.b.close();
    }

    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            a((Message) bhx.a(parcel, Message.CREATOR));
        } else if (i != 2) {
            return false;
        } else {
            b();
        }
        return true;
    }

    public nsx(IBinder iBinder, aabz aabz) {
        super("com.google.android.gms.gcm.IMessengerConnection");
        this.a = new Messenger(iBinder);
        this.b = aabz;
    }
}
