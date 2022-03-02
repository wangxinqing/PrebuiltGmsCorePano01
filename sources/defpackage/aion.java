package defpackage;

import android.content.Context;
import android.os.Build;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationSettingsStates;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* renamed from: aion  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aion {
    public boolean a;
    private final Context b;
    private final aioi c;
    private final boolean d;
    private boolean e;
    private boolean f;

    public aion(Context context, aioi aioi, String str) {
        this.b = context;
        this.c = aioi;
        this.d = hya.a(aioi.a).b(str);
    }

    private final boolean a(boolean z) {
        if (!z || this.c.g()) {
            return false;
        }
        if (this.d) {
            return this.c.h();
        }
        return true;
    }

    public final aiom a() {
        boolean z;
        int i;
        boolean[] zArr = new boolean[9];
        boolean z2 = true;
        if (jkr.g() && this.e) {
            this.f = true;
        }
        if (this.c.g()) {
            zArr[8] = true;
            z = false;
        } else {
            z = true;
        }
        if (this.f && !this.c.a() && this.c.b()) {
            zArr[0] = true;
            z = false;
        }
        if (this.e && this.c.d()) {
            if (!this.c.c()) {
                zArr[1] = true;
                z = false;
            }
            if (this.c.c.hasSystemFeature("android.hardware.wifi") && !this.c.b.isWifiEnabled()) {
                aioi aioi = this.c;
                int i2 = Build.VERSION.SDK_INT;
                if (!aioi.b.isScanAlwaysAvailable() || aioi.j()) {
                    int i3 = Build.VERSION.SDK_INT;
                    zArr[3] = true;
                    z = false;
                }
            }
        }
        if ((this.f || this.e) && !this.c.h() && this.d) {
            zArr[4] = true;
            z = false;
        }
        if (this.a && this.c.e() && !this.c.i() && !this.c.f()) {
            if (!jkr.b()) {
                zArr[5] = true;
            } else {
                zArr[7] = true;
            }
            z = false;
        }
        int i4 = 8500;
        if ((!zArr[0] && !zArr[1]) || !this.c.a("no_share_location") || this.c.g()) {
            int i5 = 8505;
            if (!zArr[5] && !zArr[7]) {
                if (zArr[2] || zArr[3]) {
                    if (!this.c.j()) {
                        i5 = 0;
                    }
                    if (i5 != 0) {
                        Arrays.fill(zArr, false);
                        i = i5;
                    }
                } else if (z) {
                    i = 0;
                }
                i = 6;
            } else {
                if (!this.c.a("no_config_bluetooth")) {
                    i4 = this.c.j() ? 8505 : 0;
                }
                if (i4 != 0) {
                    Arrays.fill(zArr, false);
                    i = i4;
                } else {
                    i = 6;
                }
            }
        } else {
            Arrays.fill(zArr, false);
            i = 8500;
        }
        Context context = this.b;
        aioi aioi2 = this.c;
        res res = new res();
        res.a = a(this.c.a());
        res.b = a(this.c.c());
        if (!this.c.e() || !this.c.i()) {
            if (!jkr.b()) {
                z2 = false;
            } else if (!this.c.f()) {
                z2 = false;
            }
        }
        res.c = z2;
        res.d = this.c.b();
        res.e = this.c.d();
        return new aiom(context, aioi2, i, new LocationSettingsStates(res.a, res.b, res.c, res.d, res.e, this.c.e()), zArr);
    }

    public final void a(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            LocationRequest locationRequest = (LocationRequest) it.next();
            if (locationRequest != null) {
                int i = locationRequest.a;
                if (i == 100) {
                    jix.g(this.b);
                    this.f = true;
                    this.e = true;
                } else if (i == 102) {
                    jix.g(this.b);
                    this.e = true;
                } else if (i == 104) {
                    jix.g(this.b);
                    this.e = true;
                }
            }
        }
    }
}
