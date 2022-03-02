package defpackage;

import android.content.Context;
import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;

/* renamed from: aafb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class aafb extends ppr {
    protected final Object n;
    protected final ozc o;

    protected aafb(aonk aonk, int i, int i2, Context context, Object obj, ozc ozc) {
        super(aonk, i, 3, ozc.f, psd.b(context));
        boolean z;
        int i3;
        boolean z2;
        this.n = obj;
        this.o = ozc;
        if (((aafa.b ^ -1) & i2) == 0) {
            z = true;
        } else {
            z = false;
        }
        iva.b(z, "Invalid permissions: %d", Integer.valueOf(i2));
        if (!ozc.b) {
            i3 = 1;
        } else {
            i3 = 15;
        }
        int i4 = ((ozc.c ? i3 | 2 : i3) ^ -1) & i2;
        if (i4 != 0) {
            if (((aafa.b ^ -1) & i4) == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            iva.b(z2, "Permission bits out of range: %d", Integer.valueOf(i4));
            ArrayList arrayList = new ArrayList();
            for (int i5 = 0; i5 < aafa.a.length; i5++) {
                if (((1 << i5) & i4) != 0) {
                    arrayList.add(aafa.a[i5]);
                }
            }
            String valueOf = String.valueOf(arrayList);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 35);
            sb.append("Access denied. Not authorized for: ");
            sb.append(valueOf);
            throw new SecurityException(sb.toString());
        }
    }

    private final void b(Exception exc) {
        try {
            a(a(new Status(8, exc.getMessage())));
        } catch (RemoteException e) {
            oso.c((Throwable) e, "Task %s failed to deliver failure response for request %s", this, this.o);
        }
        a(exc);
    }

    /* access modifiers changed from: protected */
    public abstract Object a(Status status);

    /* access modifiers changed from: protected */
    public void a(Exception exc) {
    }

    /* access modifiers changed from: protected */
    public void a(Object obj) {
    }

    /* access modifiers changed from: protected */
    public String f() {
        return String.format("%s - client[%s]", new Object[]{d(), this.o.f});
    }

    /* access modifiers changed from: protected */
    public final void a(RuntimeException runtimeException) {
        if (axrj.a.a().e()) {
            b((Exception) runtimeException);
            return;
        }
        throw runtimeException;
    }

    /* access modifiers changed from: protected */
    public final void b(Object obj) {
        try {
            a(obj);
            a((Exception) null);
        } catch (RemoteException e) {
            oso.b((Throwable) e, "Task %s failed to deliver result for request %s.", this, this.o);
            if (!(e instanceof DeadObjectException)) {
                b((Exception) e);
            }
        }
    }
}
