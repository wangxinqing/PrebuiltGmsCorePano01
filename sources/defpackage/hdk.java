package defpackage;

import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.util.Log;
import java.util.concurrent.ArrayBlockingQueue;

/* renamed from: hdk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class hdk extends Binder {
    public static final Binder a = new Binder();
    public final Intent b;
    public final hdm c;
    private final hdl d;
    private Binder e;
    private boolean f = true;

    public hdk(hdm hdm, Intent intent, hdl hdl) {
        this.c = hdm;
        this.b = intent;
        this.d = hdl;
    }

    /* access modifiers changed from: protected */
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        IBinder iBinder;
        if (!this.f && this.e == null) {
            ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(1);
            hdm hdm = this.c;
            int i3 = hdm.c;
            hdm.b.post(new hdj(this, arrayBlockingQueue));
            try {
                iBinder = (IBinder) arrayBlockingQueue.take();
            } catch (InterruptedException e2) {
                String valueOf = String.valueOf(e2);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 18);
                sb.append("Take interrupted: ");
                sb.append(valueOf);
                Log.w("GmsApiChimeraSvc", sb.toString());
                iBinder = null;
            }
            if (iBinder != a) {
                this.e = (Binder) iBinder;
            }
        }
        Binder binder = this.e;
        if (binder != null) {
            return binder.transact(i, parcel, parcel2, i2);
        }
        this.f = false;
        String action = this.b.getAction();
        StringBuilder sb2 = new StringBuilder(String.valueOf(action).length() + 77);
        sb2.append("Using MissingApiServiceBroker for ");
        sb2.append(action);
        sb2.append(" due to missing BoundService implementation");
        Log.i("GmsApiChimeraSvc", sb2.toString());
        return this.d.onTransact(i, parcel, parcel2, i2);
    }

    public final IInterface queryLocalInterface(String str) {
        return null;
    }
}
