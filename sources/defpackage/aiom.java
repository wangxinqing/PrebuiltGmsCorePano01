package defpackage;

import android.content.Context;
import com.google.android.gms.location.LocationSettingsStates;

/* renamed from: aiom  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aiom {
    public final int a;
    public final LocationSettingsStates b;
    public final Context c;
    public final aioi d;
    public final boolean[] e;
    public int f;

    public aiom(Context context, aioi aioi, int i, LocationSettingsStates locationSettingsStates, boolean[] zArr) {
        amrl.a(zArr.length == 9);
        this.c = context;
        this.d = aioi;
        this.a = i;
        this.b = locationSettingsStates;
        this.e = zArr;
    }

    public final int a() {
        int i = this.a;
        if (i == 8500 || i == 8501 || i == 8505) {
            return 8502;
        }
        return i;
    }

    public final void a(aioj aioj) {
        int i = this.f - 1;
        this.f = i;
        if (i == 0) {
            aioj.a();
        }
    }
}
