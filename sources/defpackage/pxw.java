package defpackage;

import android.content.Context;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: pxw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class pxw {
    private final Context a;
    private final pxt b;
    private final oyq c;
    private final pxs d;
    private final iby e;

    public pxw(Context context, pxs pxs, ozs ozs, ozb ozb, oyq oyq) {
        pxt pxt = new pxt(context.getPackageManager(), ozs, ozb);
        iby a2 = dsa.a(context);
        this.a = context;
        this.b = pxt;
        this.c = oyq;
        this.d = pxs;
        this.e = a2;
    }

    public static otw a(osz osz, ovc ovc) {
        aucd o = otw.i.o();
        long j = osz.i;
        if (o.c) {
            o.c();
            o.c = false;
        }
        otw otw = (otw) o.b;
        int i = otw.a | 1;
        otw.a = i;
        otw.b = j;
        String str = ovc.f;
        str.getClass();
        int i2 = i | 2;
        otw.a = i2;
        otw.c = str;
        long j2 = ovc.g;
        otw.a = i2 | 8;
        otw.d = (int) (j2 / 1000);
        ovg a2 = ovg.a(ovc.h);
        if (a2 == null) {
            a2 = ovg.GENERAL_USE;
        }
        if (o.c) {
            o.c();
            o.c = false;
        }
        otw otw2 = (otw) o.b;
        otw2.e = a2.g;
        otw2.a |= 16;
        otk a3 = otk.a(ovc.l);
        if (a3 == null) {
            a3 = otk.UNKNOWN;
        }
        if (o.c) {
            o.c();
            o.c = false;
        }
        otw otw3 = (otw) o.b;
        otw3.h = a3.d;
        int i3 = otw3.a | PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        otw3.a = i3;
        int i4 = ovc.j;
        int i5 = i3 | 64;
        otw3.a = i5;
        otw3.f = i4;
        boolean z = ovc.k;
        otw3.a = i5 | 128;
        otw3.g = z;
        return (otw) o.i();
    }

    public final pws a() {
        ParcelFileDescriptor parcelFileDescriptor;
        ParcelFileDescriptor parcelFileDescriptor2;
        Throwable e2;
        pxs pxs = this.d;
        if (pxs != null) {
            parcelFileDescriptor = pxs.a();
        } else {
            parcelFileDescriptor = null;
        }
        try {
            iby iby = this.e;
            iha b2 = ihb.b();
            b2.a = duz.a;
            parcelFileDescriptor2 = (ParcelFileDescriptor) acws.a(iby.a(b2.a()), ((Long) ozx.J.c()).longValue(), TimeUnit.MILLISECONDS);
            try {
                this.c.b(6010);
            } catch (InterruptedException | ExecutionException | TimeoutException e3) {
                e2 = e3;
            }
        } catch (InterruptedException | ExecutionException | TimeoutException e4) {
            Throwable th = e4;
            parcelFileDescriptor2 = null;
            e2 = th;
            this.c.b(6004);
            oso.c(e2, "Usage reports not received in time.", new Object[0]);
            pxf pxf = new pxf(this.a);
            return new pxj(new pxv(pxs.a(parcelFileDescriptor), parcelFileDescriptor, this.b, pxf), new pxv(pxs.a(parcelFileDescriptor2), parcelFileDescriptor2, this.b, pxf));
        }
        pxf pxf2 = new pxf(this.a);
        return new pxj(new pxv(pxs.a(parcelFileDescriptor), parcelFileDescriptor, this.b, pxf2), new pxv(pxs.a(parcelFileDescriptor2), parcelFileDescriptor2, this.b, pxf2));
    }
}
