package defpackage;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.smartdevice.setup.accounts.Challenge;

/* renamed from: acho  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class acho implements Runnable {
    final /* synthetic */ avov a;
    final /* synthetic */ acjs b;
    final /* synthetic */ achr c;

    public acho(achr achr, avov avov, acjs acjs) {
        this.c = achr;
        this.a = avov;
        this.b = acjs;
    }

    public final void run() {
        Status status;
        Throwable th;
        Status status2 = new Status(13);
        Challenge[] challengeArr = null;
        try {
            aboo aboo = this.c.d;
            abot abot = (abot) aboo;
            avow avow = (avow) new abop(abot, ((abot) aboo).d, ((abot) aboo).e, ((abot) aboo).f, this.a).b();
            if (avow != null) {
                int i = avow.a;
                if ((i & 2) == 0 && (i & 1) != 0) {
                    aqdy aqdy = avow.b;
                    if (aqdy == null) {
                        aqdy = aqdy.b;
                    }
                    if (aqdy.a.size() == 0) {
                        status = new Status(10654);
                        try {
                            this.c.e.a(status.i);
                            try {
                                this.b.a(status, challengeArr);
                            } catch (RemoteException e) {
                                achr.a.e("Error executing callback", e, new Object[0]);
                                return;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    } else {
                        status = new Status(0);
                        aqdy aqdy2 = avow.b;
                        if (aqdy2 == null) {
                            aqdy2 = aqdy.b;
                        }
                        Challenge[] challengeArr2 = new Challenge[aqdy2.a.size()];
                        for (int i2 = 0; i2 < aqdy2.a.size(); i2++) {
                            aqdm aqdm = (aqdm) aqdy2.a.get(i2);
                            challengeArr2[i2] = new Challenge(aqdm.a, aqdm.b, aqdm.c, aqdm.d.k(), aqdm.e.k());
                        }
                        challengeArr = challengeArr2;
                        this.b.a(status, challengeArr);
                    }
                }
            }
            status = new Status(10652);
            try {
                this.c.e.a(status.i);
                this.b.a(status, challengeArr);
            } catch (Throwable th3) {
                th = th3;
                try {
                    this.b.a(status, (Challenge[]) null);
                } catch (RemoteException e2) {
                    achr.a.e("Error executing callback", e2, new Object[0]);
                }
                throw th;
            }
        } catch (Throwable th4) {
            status = status2;
            th = th4;
            this.b.a(status, (Challenge[]) null);
            throw th;
        }
    }
}
