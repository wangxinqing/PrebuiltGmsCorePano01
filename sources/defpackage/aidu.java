package defpackage;

import android.app.PendingIntent;
import android.os.Parcelable;
import com.google.android.gms.location.LocationRequest;

/* renamed from: aidu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class aidu implements Runnable {
    private final aiei a;
    private final PendingIntent b;

    public aidu(aiei aiei, PendingIntent pendingIntent) {
        this.a = aiei;
        this.b = pendingIntent;
    }

    public final void run() {
        aiei aiei = this.a;
        PendingIntent pendingIntent = this.b;
        aiei.a((Object) pendingIntent);
        aiei.r.b((Parcelable) aiei.a((LocationRequest) null, pendingIntent));
    }
}
