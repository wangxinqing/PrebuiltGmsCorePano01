package defpackage;

import android.content.Context;
import android.os.Parcel;

/* renamed from: gyk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class gyk extends bhw implements gyl {
    private final Context a;

    public gyk() {
        super("com.google.android.gms.checkin.internal.ICheckinService");
    }

    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            String b = b();
            parcel2.writeNoException();
            parcel2.writeString(b);
        } else if (i == 2) {
            long c = c();
            parcel2.writeNoException();
            parcel2.writeLong(c);
        } else if (i != 3) {
            return false;
        } else {
            String i2 = gwd.i(this.a);
            parcel2.writeNoException();
            parcel2.writeString(i2);
        }
        return true;
    }

    public final String b() {
        return gwd.g(this.a);
    }

    public final long c() {
        return gwd.j(this.a);
    }

    public gyk(Context context) {
        super("com.google.android.gms.checkin.internal.ICheckinService");
        this.a = context;
    }
}
