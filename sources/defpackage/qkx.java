package defpackage;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.instantapps.LaunchData;
import com.google.android.gms.instantapps.internal.AppInfo;
import com.google.android.gms.instantapps.internal.RoutingOptions;

/* renamed from: qkx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qkx extends jba {
    private static final qfn a = new qfn("GetLaunchDataOperation");
    private final qex d;
    private final qfy e;
    private final qks f;
    private final qlc g;
    private final String h;
    private final qkm i;
    private final String j;
    private final int k;
    private final qiz l;

    public qkx(qex qex, qfy qfy, qks qks, qlc qlc, String str, qkm qkm, String str2, int i2, qiz qiz) {
        super(121, "GetLaunchDataOperation");
        iva.a((Object) str);
        iva.a((Object) str2);
        this.d = qex;
        this.e = qfy;
        this.f = qks;
        this.g = qlc;
        this.h = str;
        this.i = qkm;
        this.j = str2;
        this.k = i2;
        this.l = qiz;
    }

    /* access modifiers changed from: protected */
    public final void a(Context context) {
        String str;
        String str2;
        Status status;
        Intent intent;
        BitmapTeleporter bitmapTeleporter;
        qex qex = this.d;
        qex.a(this.j, 0);
        qev a2 = qex.a();
        qlo qlo = new qlo();
        RoutingOptions routingOptions = new RoutingOptions();
        routingOptions.a = true;
        qkt a3 = this.f.a(this.h, true, routingOptions, qlo, false);
        int i2 = a3.a;
        LaunchData launchData = null;
        if (a3.d == 3) {
            str = "User prefers browser";
            str2 = "GetLaunchDataOperation.UserPrefersBrowser";
        } else if (i2 == 1) {
            str = "User not opted in";
            str2 = "GetLaunchDataOperation.DestinationOptIn";
        } else if (i2 == 0) {
            str = "Not an instant app";
            str2 = "GetLaunchDataOperation.DestinationNotInstantApp";
        } else if (i2 == 4) {
            str = "Runtime not available";
            str2 = "GetLaunchDataOperation.SupervisorNotAvailable";
        } else if (i2 == 3) {
            str = "Need to restore runtime";
            str2 = "GetLaunchDataOperation.WillNotReinstallSupervisor";
        } else if (i2 != 2) {
            str = null;
            str2 = null;
        } else {
            try {
                if (this.k == 0) {
                    intent = qfj.a(this.h, this.j, System.currentTimeMillis());
                } else {
                    intent = qfj.a(this.h);
                }
                this.i.a(intent);
                if (this.g.a() != null) {
                    AppInfo appInfo = a3.b;
                    if (appInfo != null) {
                        Bitmap g2 = this.l.g(appInfo.a);
                        if (g2 != null) {
                            bitmapTeleporter = new BitmapTeleporter(g2);
                            bitmapTeleporter.a(context.getCacheDir());
                        } else {
                            bitmapTeleporter = null;
                        }
                        LaunchData launchData2 = new LaunchData(intent, appInfo.a, appInfo.b, bitmapTeleporter);
                        str2 = null;
                        launchData = launchData2;
                        str = null;
                    } else {
                        throw new qfi("Missing app info");
                    }
                } else {
                    throw new qfi("Missing opt in account");
                }
            } catch (qkl e2) {
                throw new qfi((Throwable) e2);
            } catch (qfi e3) {
                a.a(e3);
                str = null;
                str2 = null;
            }
        }
        if (launchData != null) {
            status = Status.a;
            str2 = "GetLaunchDataOperation.IntentReturned";
        } else if (str == null) {
            status = Status.c;
            str2 = "GetLaunchDataOperation.ERROR";
        } else {
            status = new Status(19500, str);
        }
        qkw qkw = new qkw(status, launchData, str2);
        this.e.a(qkw.a, qkw.b);
        a2.a(qkw.c);
    }
}
