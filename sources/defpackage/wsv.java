package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;

/* renamed from: wsv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class wsv extends isy {
    public wsv(Context context, Looper looper, ise ise, iea iea, igg igg) {
        super(context, looper, 208, ise, iea, igg);
    }

    public final Feature[] D() {
        return new Feature[]{wku.b, wku.c, wku.d, wku.f};
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ IInterface a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.people.contactssync.internal.IContactsSyncService");
        if (queryLocalInterface instanceof wsy) {
            return (wsy) queryLocalInterface;
        }
        return new wsw(iBinder);
    }

    /* access modifiers changed from: protected */
    public final String b() {
        return "com.google.android.gms.people.contactssync.service.START";
    }

    /* access modifiers changed from: protected */
    public final String c() {
        return "com.google.android.gms.people.contactssync.internal.IContactsSyncService";
    }

    public final int d() {
        return 17108000;
    }
}
