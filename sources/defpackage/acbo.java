package defpackage;

import android.os.RemoteException;
import com.google.android.gms.smartdevice.d2d.BootstrapOptions;
import com.google.android.gms.smartdevice.d2d.TargetConnectionArgs;
import com.google.android.gms.smartdevice.d2d.VerificationInfo;
import com.google.android.gms.smartdevice.d2d.data.MessagePayload;

/* renamed from: acbo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class acbo implements acau {
    private final abvo a;
    private final abtc b;
    private final abtm c;

    public acbo(abvo abvo, abtc abtc, abtm abtm) {
        this.a = abvo;
        this.b = abtc;
        this.c = abtm;
    }

    public final void a() {
        try {
            this.b.b.b();
        } catch (RemoteException e) {
            abtc.a.a((Throwable) e);
        }
    }

    public final void a(VerificationInfo verificationInfo) {
        throw null;
    }

    public final void a(int i) {
        this.a.a(i);
        this.b.a(i);
    }

    public final void a(abox abox, TargetConnectionArgs targetConnectionArgs) {
        try {
            this.b.b.a(targetConnectionArgs);
        } catch (RemoteException e) {
            abtc.a.a((Throwable) e);
        }
        abnb.e();
        abtm abtm = this.c;
        abtm.h = abox;
        BootstrapOptions bootstrapOptions = abtm.f;
        MessagePayload messagePayload = new MessagePayload();
        messagePayload.a(bootstrapOptions);
        abtm.b(messagePayload);
    }

    public final void a(String str) {
        try {
            this.b.b.b(str);
        } catch (RemoteException e) {
            abtc.a.a((Throwable) e);
        }
    }

    public final void a(byte[] bArr) {
        this.c.a(bArr);
    }
}
