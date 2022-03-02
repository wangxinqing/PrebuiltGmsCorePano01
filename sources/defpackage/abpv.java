package defpackage;

import android.os.Handler;
import android.os.RemoteException;
import com.google.android.gms.smartdevice.d2d.TargetConnectionArgs;
import com.google.android.gms.smartdevice.d2d.VerificationInfo;

/* renamed from: abpv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class abpv implements acau {
    private static final acpz a = acqa.a("SourceConnectionCallbacks");
    private final abqd b;
    private final abxb c;

    public abpv(abqd abqd, abxb abxb) {
        this.b = abqd;
        this.c = abxb;
    }

    public void a() {
        try {
            this.c.b();
        } catch (RemoteException e) {
            a.a((Throwable) e);
        }
        this.b.e();
    }

    public void a(int i) {
        try {
            this.c.a(i);
        } catch (RemoteException e) {
            a.a((Throwable) e);
        }
    }

    public void a(abox abox, TargetConnectionArgs targetConnectionArgs) {
        Handler handler = this.b.b;
        abnb.e();
        abqd abqd = this.b;
        abqd.d.b("Connected to target device.", new Object[0]);
        iva.a((Object) abox, (Object) "deviceMessageSender cannot be null.");
        abqd.f = abox;
    }

    public final void a(VerificationInfo verificationInfo) {
        try {
            this.c.a(verificationInfo);
        } catch (RemoteException e) {
            a.a((Throwable) e);
        }
    }

    public final void a(String str) {
        try {
            this.c.a(str);
        } catch (RemoteException e) {
            a.a((Throwable) e);
        }
    }

    public final void a(byte[] bArr) {
        this.b.a(bArr);
    }
}
