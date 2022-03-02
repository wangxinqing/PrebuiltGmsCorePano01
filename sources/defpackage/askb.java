package defpackage;

import android.os.IBinder;
import android.os.RemoteException;
import com.google.location.nearby.direct.client.internal.OperationStatus;

/* renamed from: askb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class askb implements IBinder.DeathRecipient, asir {
    public final asgw a;
    public final String b;
    public final /* synthetic */ askc c;

    public askb(askc askc, String str, asgw asgw) {
        this.c = askc;
        this.b = str;
        iva.a((Object) asgw);
        this.a = asgw;
        IBinder asBinder = asgw.asBinder();
        if (asBinder != null) {
            asBinder.linkToDeath(this, 0);
        }
    }

    public final void a(OperationStatus operationStatus) {
        asfz asfz;
        try {
            jjg jjg = asil.a;
            this.a.a(operationStatus);
        } catch (RemoteException e) {
            ((anih) ((anih) asil.a.c()).a("askb", "a", 376, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("RemoteException: Failed to deliver status: %s", (Object) operationStatus);
            this.c.a(this.b);
        }
        int a2 = ashd.a(operationStatus.b.b);
        if (a2 == 0) {
            a2 = 1;
        }
        int i = a2 - 1;
        if (i == 2) {
            asfk asfk = operationStatus.b.c;
            if (asfk == null) {
                asfk = asfk.g;
            }
            asfz = asfk.b;
            if (asfz == null) {
                asfz = asfz.d;
            }
        } else if (i == 3) {
            asgl asgl = operationStatus.b.d;
            if (asgl == null) {
                asgl = asgl.c;
            }
            asfz = asgl.b;
            if (asfz == null) {
                asfz = asfz.d;
            }
        } else if (i == 4) {
            aseq aseq = operationStatus.b.e;
            if (aseq == null) {
                aseq = aseq.c;
            }
            asfz = aseq.b;
            if (asfz == null) {
                asfz = asfz.d;
            }
        } else if (i == 5) {
            asgh asgh = operationStatus.b.f;
            if (asgh == null) {
                asgh = asgh.d;
            }
            asfz = asgh.b;
            if (asfz == null) {
                asfz = asfz.d;
            }
        } else if (i == 8) {
            asem asem = operationStatus.b.g;
            if (asem == null) {
                asem = asem.e;
            }
            asfz = asem.b;
            if (asfz == null) {
                asfz = asfz.d;
            }
        } else {
            throw new RuntimeException("Cannot get operation from unknown OperationType");
        }
        asgb a3 = asgb.a(asfz.c);
        if (a3 == null) {
            a3 = asgb.OPERATION_STATUS_UNKNOWN;
        }
        if (a3 != asgb.OPERATION_STATUS_FAILED) {
            asgb a4 = asgb.a(asfz.c);
            if (a4 == null) {
                a4 = asgb.OPERATION_STATUS_UNKNOWN;
            }
            if (a4 != asgb.OPERATION_STATUS_FINISHED) {
                return;
            }
        }
        arwg arwg = this.c.c;
        String valueOf = String.valueOf(asfz.b);
        arwg.c(new aska(this, valueOf.length() == 0 ? new String("UnregisterOperation: ") : "UnregisterOperation: ".concat(valueOf), asfz));
    }

    public final void binderDied() {
        this.c.a(this.b);
        IBinder asBinder = this.a.asBinder();
        if (asBinder != null) {
            asBinder.unlinkToDeath(this, 0);
        }
    }
}
