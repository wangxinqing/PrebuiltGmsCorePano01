package com.google.android.gms.iid;

import android.os.Build;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class MessengerCompat implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new qdh();
    Messenger a;

    public MessengerCompat(IBinder iBinder) {
        int i = Build.VERSION.SDK_INT;
        this.a = new Messenger(iBinder);
    }

    public final IBinder a() {
        Messenger messenger = this.a;
        if (messenger != null) {
            return messenger.getBinder();
        }
        throw null;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj != null) {
            try {
                return a().equals(((MessengerCompat) obj).a());
            } catch (ClassCastException e) {
            }
        }
        return false;
    }

    public final int hashCode() {
        return a().hashCode();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Messenger messenger = this.a;
        if (messenger != null) {
            parcel.writeStrongBinder(messenger.getBinder());
            return;
        }
        throw null;
    }

    public final void a(Message message) {
        Messenger messenger = this.a;
        if (messenger != null) {
            messenger.send(message);
            return;
        }
        throw null;
    }
}
