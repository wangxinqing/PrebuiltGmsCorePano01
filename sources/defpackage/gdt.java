package defpackage;

import android.content.Context;
import android.os.Parcel;

/* renamed from: gdt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class gdt extends bhw implements gdu {
    private final gkv a;

    public gdt() {
        super("com.google.android.gms.auth.firstparty.devicesignals.IDeviceSignalsService");
    }

    private static void a() {
        if (!jhg.b()) {
            throw new SecurityException("Calling pkg not zero party.");
        }
    }

    public final long b() {
        long j;
        a();
        gkv gkv = this.a;
        synchronized (gkv.b) {
            j = -1;
            if (gkv.b()) {
                j = gkv.a.getLong("lastSecureUnlockTime", -1);
            }
        }
        return j;
    }

    public final long c() {
        long j;
        a();
        gkv gkv = this.a;
        synchronized (gkv.b) {
            j = -1;
            if (gkv.b()) {
                j = gkv.a.getLong("lockScreenSecureDuration", -1);
            }
        }
        return j;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public gdt(Context context) {
        super("com.google.android.gms.auth.firstparty.devicesignals.IDeviceSignalsService");
        gkv a2 = gkv.a(context);
        this.a = a2;
    }

    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            long b = b();
            parcel2.writeNoException();
            parcel2.writeLong(b);
        } else if (i != 2) {
            return false;
        } else {
            long c = c();
            parcel2.writeNoException();
            parcel2.writeLong(c);
        }
        return true;
    }
}
