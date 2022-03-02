package defpackage;

import android.os.Build;
import android.os.UserManager;
import android.provider.Settings;
import android.util.Log;
import com.google.android.location.network.NetworkLocationProvider;

/* renamed from: aisw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class aisw implements rng {
    private final NetworkLocationProvider a;

    public aisw(NetworkLocationProvider networkLocationProvider) {
        this.a = networkLocationProvider;
    }

    public final void a(int i, int i2) {
        NetworkLocationProvider networkLocationProvider = this.a;
        if (hxy.d(networkLocationProvider.a)) {
            rns.a(networkLocationProvider.a, false, rnu.a, 1, new int[0]);
        } else if (Build.VERSION.SDK_INT < 25 || !((UserManager) networkLocationProvider.a.getSystemService("user")).isDemoUser()) {
            if (Build.VERSION.SDK_INT < 28 && i2 == 1 && i != 0) {
                Log.i("NLP", "revoking nlp consent in sensors only");
                rns.a(networkLocationProvider.a, false, rnu.a, 2, new int[0]);
            }
            if ((i2 == 3 || i2 == 2) && !rns.a(networkLocationProvider.a)) {
                if (Build.VERSION.SDK_INT < 28) {
                    Log.i("NLP", "reverting location mode and showing nlp consent dialog");
                    if (i == 0 && i2 == 3) {
                        rns.a(networkLocationProvider.a, 1, rnu.a);
                    } else if (i == 0 || i == 1) {
                        rns.a(networkLocationProvider.a, i, rnu.a);
                    }
                    networkLocationProvider.a(i2);
                } else if (!ayap.a.a().fixGlsConsentAtv()) {
                    int i3 = Settings.Secure.getInt(networkLocationProvider.a.getContentResolver(), "location_changer", 0);
                    Settings.Secure.putInt(networkLocationProvider.a.getContentResolver(), "location_changer", 0);
                    if (i3 == 2 && rlt.a(networkLocationProvider.a)) {
                        Log.i("NLP", "showing nlp consent dialog");
                        rlt.e(networkLocationProvider.a);
                        networkLocationProvider.a(i2);
                    }
                } else {
                    jix.h(networkLocationProvider.a);
                    networkLocationProvider.a(i2);
                }
            }
        } else {
            rns.a(networkLocationProvider.a, true, rnu.a, 1, new int[0]);
        }
    }
}
