package defpackage;

import com.google.android.gms.deviceconnection.service.DeviceConnectionApiService;

/* renamed from: jyu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class jyu extends jyr implements niz {
    final /* synthetic */ DeviceConnectionApiService a;
    private final nix b;
    private final jyl c;

    public jyu(DeviceConnectionApiService deviceConnectionApiService, nix nix, jyl jyl) {
        this.a = deviceConnectionApiService;
        this.b = nix;
        this.c = jyl;
    }

    public final void a(jyq jyq) {
        this.b.a(this.a, new jyv(jyq, this.c));
    }

    public final void a(jyq jyq, String[] strArr) {
        boolean z;
        iva.a((Object) strArr);
        if (strArr.length != 0) {
            z = true;
        } else {
            z = false;
        }
        iva.a(z);
        for (int i = 0; i < strArr.length; i++) {
            iva.c(strArr[i]);
            iva.a(!strArr[i].contains(","));
        }
        this.b.a(this.a, new jyw(jyq, this.c, strArr));
    }
}
