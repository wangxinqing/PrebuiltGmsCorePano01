package defpackage;

import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.location.DeviceOrientation;

/* renamed from: aihz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class aihz {
    private final aiib a;

    public aihz(aiib aiib) {
        this.a = aiib;
    }

    public final void a(DeviceOrientation deviceOrientation) {
        aiib aiib = this.a;
        for (aihv aihv : aiib.c.c()) {
            try {
                aihv.d.a(deviceOrientation);
            } catch (RemoteException e) {
                String valueOf = String.valueOf(e);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 36);
                sb.append("Client died while calling listener. ");
                sb.append(valueOf);
                Log.e("GCoreFlp", sb.toString());
                aihv.a();
            }
        }
        aict aict = aiib.g;
        if (aict.a()) {
            float g = deviceOrientation.g();
            float e2 = deviceOrientation.e();
            if (e2 <= 360.0f && e2 >= 0.0f && g <= 180.0f && g >= 0.0f) {
                aucd aucd = aict.e;
                long j = ((anyy) aucd.b).f + 1;
                if (aucd.c) {
                    aucd.c();
                    aucd.c = false;
                }
                anyy anyy = (anyy) aucd.b;
                anyy anyy2 = anyy.h;
                anyy.a |= 4;
                anyy.f = j;
                int ceil = (int) Math.ceil((double) (e2 / 45.0f));
                aucd aucd2 = aict.e;
                int c = ((anyy) aucd2.b).c.c(ceil) + 1;
                if (aucd2.c) {
                    aucd2.c();
                    aucd2.c = false;
                }
                anyy anyy3 = (anyy) aucd2.b;
                anyy3.b();
                anyy3.c.a(ceil, c);
                int ceil2 = (int) Math.ceil((double) (g / 45.0f));
                aucd aucd3 = aict.e;
                int c2 = ((anyy) aucd3.b).b.c(ceil2) + 1;
                if (aucd3.c) {
                    aucd3.c();
                    aucd3.c = false;
                }
                anyy anyy4 = (anyy) aucd3.b;
                anyy4.a();
                anyy4.b.a(ceil2, c2);
                if (aict.b != deviceOrientation.a()) {
                    aucd aucd4 = aict.e;
                    int i = ((anyy) aucd4.b).e + 1;
                    if (aucd4.c) {
                        aucd4.c();
                        aucd4.c = false;
                    }
                    anyy anyy5 = (anyy) aucd4.b;
                    anyy5.a |= 2;
                    anyy5.e = i;
                    aict.b = deviceOrientation.a();
                }
                if (aict.a != deviceOrientation.c()) {
                    aucd aucd5 = aict.e;
                    int i2 = ((anyy) aucd5.b).d + 1;
                    if (aucd5.c) {
                        aucd5.c();
                        aucd5.c = false;
                    }
                    anyy anyy6 = (anyy) aucd5.b;
                    anyy6.a |= 1;
                    anyy6.d = i2;
                    aict.a = deviceOrientation.c();
                }
            }
        }
    }
}
