package defpackage;

import android.os.ParcelFileDescriptor;
import java.io.DataInputStream;

/* renamed from: acpt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class acpt {
    public static final iwd a = acqa.a("D2D", "PipeReadManager");
    private final DataInputStream b;
    private final aoru c = aosd.a(qvj.b.b(2));
    private aorr d;
    private acps e;

    public acpt(ParcelFileDescriptor parcelFileDescriptor) {
        this.b = new DataInputStream(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor));
    }

    public final synchronized void a() {
        aorr aorr = this.d;
        if (aorr != null) {
            a.a("Shutting down reading thread", new Object[0]);
            acps acps = this.e;
            if (acps != null) {
                acps.a = true;
            }
            aorr.cancel(true);
            this.d = null;
        }
    }

    public final synchronized void a(acpr acpr) {
        a();
        acps acps = new acps(acpr, this.b);
        this.e = acps;
        this.d = this.c.a(acps);
        aorl.a(this.d, new acpq(acpr), this.c);
    }
}
