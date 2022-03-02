package defpackage;

import android.content.Context;
import android.os.Binder;
import android.os.Parcel;
import android.util.Log;

/* renamed from: qyf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class qyf extends Binder {
    private static final int c = jhg.a;
    private final Binder a;
    private final Context b;

    public qyf(Context context, Binder binder) {
        this.b = context;
        this.a = binder;
    }

    /* access modifiers changed from: protected */
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        try {
            int callingUid = Binder.getCallingUid();
            if (callingUid != c) {
                if (!jll.a(this.b, Binder.getCallingUid(), "com.google.android.gms")) {
                    Log.e("ZeroPartyBinder", "Unexpected package bound to the service");
                    throw new SecurityException("Unexpected uid");
                } else if (this.b.getPackageManager().checkSignatures(callingUid, c) < 0) {
                    Log.e("ZeroPartyBinder", "Incorrect caller's signature");
                    throw new SecurityException("Wrong signature");
                }
            }
            return this.a.transact(i, parcel, parcel2, i2);
        } catch (SecurityException e) {
            if (parcel2 == null) {
                return false;
            }
            parcel2.writeException(e);
            return false;
        }
    }
}
