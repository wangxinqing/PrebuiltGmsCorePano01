package defpackage;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Context;
import com.google.android.gms.chromesync.ChromeSyncState;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* renamed from: hkk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class hkk extends hkf {
    private final hju b;
    private final amsv c;

    public hkk(Context context, hju hju, Account account) {
        super("GetState", account);
        iva.a((Object) hju);
        this.b = hju;
        this.c = amta.a((amsv) new hkj(context));
    }

    public final void a(Status status) {
        this.b.a(new hkb(status, (SafeParcelable) null).b());
    }

    /* access modifiers changed from: protected */
    public final void b(Context context) {
        boolean z;
        boolean z2;
        amri b2 = ((hnn) hnn.a.b()).b(this.a);
        PendingIntent pendingIntent = null;
        int i = 0;
        if (!b2.a()) {
            this.b.a(new hkb(Status.a, new ChromeSyncState(false, 0, (PendingIntent) null, false)).b());
            return;
        }
        aqpd aqpd = ((aqpb) b2.b()).c;
        if (aqpd == null) {
            aqpd = aqpd.g;
        }
        if (!hiv.a(aqpd)) {
            try {
                ((hnh) hnh.a.b()).a(this.a);
                z2 = false;
                z = false;
            } catch (hjm e) {
                if (e.a == 1537) {
                    z2 = false;
                    z = true;
                } else {
                    throw e;
                }
            }
        } else {
            if (awsl.a.a().a()) {
                acwa b3 = ((gel) this.c.a()).b(this.a.b);
                try {
                    acws.a(b3);
                    z2 = ((Integer) b3.d()).equals(5);
                } catch (InterruptedException | CancellationException | ExecutionException e2) {
                    z2 = false;
                    z = false;
                }
            } else {
                z2 = false;
            }
            z = false;
        }
        if (z) {
            pendingIntent = hoa.a(context, this.a.a());
        }
        hju hju = this.b;
        Status status = Status.a;
        aqpc aqpc = aqpc.PASSPHRASE_TYPE_UNSPECIFIED;
        aqpc a = aqpc.a(aqpd.b);
        if (a == null) {
            a = aqpc.UNRECOGNIZED;
        }
        int ordinal = a.ordinal();
        if (ordinal == 1) {
            i = 1;
        } else if (ordinal == 2) {
            i = 2;
        } else if (ordinal == 3) {
            i = 3;
        } else if (ordinal == 4) {
            i = 4;
        } else if (ordinal == 5) {
            i = 5;
        }
        hju.a(new hkb(status, new ChromeSyncState(true, i, pendingIntent, z2)).b());
    }
}
