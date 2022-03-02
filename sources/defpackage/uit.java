package defpackage;

import com.google.android.gms.nearby.connection.AdvertisingOptions;
import com.google.android.gms.nearby.internal.connection.StartAdvertisingParams;

/* renamed from: uit  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class uit {
    public final StartAdvertisingParams a;

    public uit() {
        this.a = new StartAdvertisingParams();
    }

    public final void a(AdvertisingOptions advertisingOptions) {
        this.a.f = advertisingOptions;
    }

    public final void a(String str) {
        this.a.c = str;
    }

    public final void a(ugb ugb) {
        this.a.b = ugb;
    }

    public final void a(ugh ugh) {
        this.a.g = ugh;
    }

    public final void a(uhd uhd) {
        this.a.a = uhd;
    }

    public final void b(String str) {
        this.a.d = str;
    }

    public uit(StartAdvertisingParams startAdvertisingParams) {
        StartAdvertisingParams startAdvertisingParams2 = new StartAdvertisingParams();
        this.a = startAdvertisingParams2;
        startAdvertisingParams2.a = startAdvertisingParams.a;
        startAdvertisingParams2.b = startAdvertisingParams.b;
        startAdvertisingParams2.c = startAdvertisingParams.c;
        startAdvertisingParams2.d = startAdvertisingParams.d;
        startAdvertisingParams2.e = startAdvertisingParams.e;
        startAdvertisingParams2.f = startAdvertisingParams.f;
        startAdvertisingParams2.g = startAdvertisingParams.g;
        startAdvertisingParams2.h = startAdvertisingParams.h;
    }
}
