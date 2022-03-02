package defpackage;

import android.os.RemoteException;
import com.google.location.nearby.direct.client.internal.OperationStatus;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: asis  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class asis {
    public static final asik j = new asij(new AtomicInteger());
    public final int k;
    final String l;
    public asir m;

    public asis() {
        int intValue = ((asij) j).a().intValue();
        this.k = intValue;
        this.l = Integer.toString(intValue);
    }

    /* access modifiers changed from: package-private */
    public final asgs a(Class cls) {
        if (cls == asem.class) {
            return new asim(this);
        }
        if (cls == asfk.class) {
            return new asin(this);
        }
        if (cls == asgl.class) {
            return new asio(this);
        }
        if (cls == aseq.class) {
            return new asip(this);
        }
        if (cls == asgh.class) {
            return new asiq(this);
        }
        String valueOf = String.valueOf(cls);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 37);
        sb.append("Unexpected status class for operation");
        sb.append(valueOf);
        throw new RuntimeException(sb.toString());
    }

    public abstract void a();

    public abstract void b();

    public abstract asfz d();

    public final void a(OperationStatus operationStatus) {
        asfz asfz;
        asir asir = this.m;
        if (asir != null) {
            try {
                jjg jjg = asil.a;
                ((askb) asir).a.a(operationStatus);
            } catch (RemoteException e) {
                ((anih) ((anih) asil.a.c()).a("askb", "a", 376, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("RemoteException: Failed to deliver status: %s", (Object) operationStatus);
                askb askb = (askb) asir;
                askb.c.a(askb.b);
            }
            int a = ashd.a(operationStatus.b.b);
            if (a == 0) {
                a = 1;
            }
            int i = a - 1;
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
            asgb a2 = asgb.a(asfz.c);
            if (a2 == null) {
                a2 = asgb.OPERATION_STATUS_UNKNOWN;
            }
            if (a2 != asgb.OPERATION_STATUS_FAILED) {
                asgb a3 = asgb.a(asfz.c);
                if (a3 == null) {
                    a3 = asgb.OPERATION_STATUS_UNKNOWN;
                }
                if (a3 != asgb.OPERATION_STATUS_FINISHED) {
                    return;
                }
            }
            askb askb2 = (askb) asir;
            arwg arwg = askb2.c.c;
            String valueOf = String.valueOf(asfz.b);
            arwg.c(new aska(askb2, valueOf.length() == 0 ? new String("UnregisterOperation: ") : "UnregisterOperation: ".concat(valueOf), asfz));
        }
    }
}
