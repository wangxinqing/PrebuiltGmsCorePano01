package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import com.google.android.gms.nearby.messages.ClientAppIdentifier;
import com.google.android.gms.nearby.messages.MessageFilter;
import com.google.android.gms.nearby.messages.Strategy;
import com.google.android.gms.nearby.messages.internal.SubscribeRequest;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: uwl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class uwl {
    public final ikh a;
    public final CountDownLatch b = new CountDownLatch(1);
    private final ikd c;

    public uwl(Context context, String str) {
        ikd ikd = uwk.a;
        this.c = ikd;
        this.a = ikh.a(context, str, ikd);
    }

    public static SubscribeRequest b(Bundle bundle) {
        return (SubscribeRequest) bundle.getParcelable("s");
    }

    public static PendingIntent c(Bundle bundle) {
        SubscribeRequest b2 = b(bundle);
        if (b2 != null) {
            return b2.f;
        }
        return null;
    }

    public static long d(Bundle bundle) {
        return bundle.getLong("t");
    }

    public static ClientAppIdentifier e(Bundle bundle) {
        byte[] byteArray = bundle.getByteArray("i");
        if (byteArray == null) {
            return null;
        }
        ClientAppIdentifier clientAppIdentifier = (ClientAppIdentifier) ivy.a(byteArray, ClientAppIdentifier.CREATOR);
        if (clientAppIdentifier.e == 0) {
            clientAppIdentifier.e = 1;
        }
        return clientAppIdentifier;
    }

    public static String f(Bundle bundle) {
        return bundle.getString("d");
    }

    public final void a() {
        if (!this.b.await(20000, TimeUnit.MILLISECONDS)) {
            throw new TimeoutException();
        }
    }

    public final List b() {
        return this.a.d();
    }

    public final void a(PendingIntent pendingIntent) {
        SubscribeRequest subscribeRequest = new SubscribeRequest((IBinder) null, (Strategy) null, (IBinder) null, (MessageFilter) null, pendingIntent, (IBinder) null, false, 0);
        Bundle bundle = new Bundle();
        bundle.putParcelable("s", subscribeRequest);
        this.a.b((Parcelable) bundle);
    }

    public final void a(Bundle bundle) {
        this.a.b((Parcelable) bundle);
    }
}
