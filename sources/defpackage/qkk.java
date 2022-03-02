package defpackage;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.instantapps.InstantAppIntentData;
import com.google.android.gms.instantapps.internal.RoutingOptions;

/* renamed from: qkk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qkk {
    public static final qfn a = new qfn("IntentMethods");
    private final qkm b;
    private final qks c;
    private final qex d;
    private final int e;

    public qkk(qkm qkm, qks qks, qex qex, int i) {
        this.b = qkm;
        this.c = qks;
        this.d = qex;
        this.e = i;
    }

    private final Intent a(String str, qfc qfc, long j, Bundle bundle, qlo qlo) {
        Intent a2 = qfj.a(str, qfc.b.packageName, j);
        if (bundle != null) {
            try {
                Intent intent = (Intent) bundle.getParcelable("key_fallbackIntent");
                if (intent != null) {
                    Uri data = intent.getData();
                    if (data == null || !data.equals(a2.getData())) {
                        throw new qfi("Fallback Intent URI does not match Instant App URL");
                    }
                    a2.putExtra("key_fallbackIntent", intent);
                }
            } catch (ClassCastException e2) {
                throw new qfi("Fallback Intent invalid type");
            }
        }
        qlo.a(1420);
        try {
            this.b.a(a2);
            qlo.a(1421);
            return a2;
        } catch (qkl e3) {
            throw new qfi((Throwable) e3);
        }
    }

    public final InstantAppIntentData a(qfc qfc, String str, Bundle bundle, qlo qlo) {
        byte[] bArr;
        RoutingOptions routingOptions;
        InstantAppIntentData instantAppIntentData;
        String str2;
        String str3;
        qfc qfc2 = qfc;
        Bundle bundle2 = bundle;
        long currentTimeMillis = System.currentTimeMillis();
        if (str != null) {
            qex qex = this.d;
            qex.a(qfc2.b.packageName, qfc2.b.versionCode);
            qev a2 = qex.a();
            if (bundle2 != null) {
                bArr = bundle2.getByteArray("key_routingOptions");
            } else {
                bArr = null;
            }
            if (bArr != null) {
                routingOptions = (RoutingOptions) ivy.a(bArr, RoutingOptions.CREATOR);
            } else {
                routingOptions = new RoutingOptions();
            }
            routingOptions.f = true;
            qkt a3 = this.c.a(str, true, routingOptions, qlo, true);
            int i = a3.a;
            int i2 = a3.d;
            String str4 = a3.f;
            new Object[1][0] = i2 != 0 ? "do not launch" : "may launch";
            if (i2 == 2) {
                instantAppIntentData = new InstantAppIntentData((Intent) null, 2, str4);
                str2 = "InstantAppsIntentMethods.Holdback";
            } else if (i == 4) {
                instantAppIntentData = InstantAppIntentData.a;
                str2 = "InstantAppsIntentMethods.SupervisorNotAvailable";
            } else if (i == 0 && !a3.e) {
                instantAppIntentData = InstantAppIntentData.a;
                str2 = "InstantAppsIntentMethods.DestinationNotInstantApp";
            } else if (i == 3) {
                if (axvq.a.a().a()) {
                    instantAppIntentData = new InstantAppIntentData(qfm.a(a(str, qfc, currentTimeMillis, bundle, qlo)), 0, str4);
                    str2 = "InstantAppsIntentMethods.ReinstallSupervisor";
                } else {
                    instantAppIntentData = InstantAppIntentData.a;
                    str2 = "InstantAppsIntentMethods.WillNotReinstallSupervisor";
                }
            } else if (i == 2 || i == 1 || (a3.e && this.e == 0)) {
                if (i2 != 3) {
                    str3 = "InstantAppsIntentMethods.IntentReturned";
                } else {
                    str3 = "InstantAppsIntentMethods.UserPrefersBrowser";
                }
                if (axvh.a.a().b() && this.e != 0 && i2 == 3) {
                    instantAppIntentData = InstantAppIntentData.a;
                } else if (this.e == 0) {
                    Intent a4 = a(str, qfc, currentTimeMillis, bundle, qlo);
                    qlo.a(1405);
                    a4.putExtra("key_eventListProtoBytes", qlo.a());
                    instantAppIntentData = new InstantAppIntentData(a4, i2, str4);
                } else {
                    Intent a5 = qfj.a(str);
                    if (bundle2 != null) {
                        a5.putExtras(bundle2);
                    }
                    instantAppIntentData = new InstantAppIntentData(a5, i2, str4);
                }
                str2 = str3;
            } else {
                a.b("Unknown result %d %d", 0, Integer.valueOf(i2));
                return InstantAppIntentData.a;
            }
            a2.a(str2);
            return instantAppIntentData;
        }
        throw new qfi("URL is null");
    }
}
