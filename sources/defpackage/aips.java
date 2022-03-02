package defpackage;

import android.location.Location;
import android.os.Bundle;
import com.google.android.gms.location.WifiScan;

/* renamed from: aips  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aips {
    public static final Location a(aiax aiax) {
        WifiScan a;
        Location location = new Location("network");
        aiav aiav = aiax.a;
        amrl.a((Object) aiav);
        amrl.a((Object) aiav.c);
        aibe aibe = aiav.c;
        location.setLatitude(aell.b(aibe.b));
        location.setLongitude(aell.b(aibe.c));
        location.setAccuracy(Math.max(1.0f, ((float) aibe.d) / 1000.0f));
        location.setTime(aiav.e + ajbt.e());
        aiyk.g.a(location, aiav.e);
        if (aibe.b()) {
            location.setAltitude((double) aibe.g());
        }
        Bundle bundle = new Bundle();
        if (aibe.c()) {
            float h = aibe.h();
            aiyk.g.a(location, h);
            bundle.putFloat("verticalAccuracy", h);
        }
        bundle.putInt("nlpVersion", 2023);
        aibo aibo = aiax.b;
        if (aibo != null) {
            aibw aibw = aibo.b;
            if (aibw instanceof aibr) {
                aibr aibr = (aibr) aibw;
                if (!ayfi.b()) {
                    bundle.putByteArray("wifiScan", aibr.d(50));
                } else {
                    byte[] bArr = null;
                    if (!(aibr == null || (a = atis.a(aibr)) == null)) {
                        bArr = ivy.a(a);
                    }
                    if (bArr != null) {
                        bundle.putByteArray("newWifiScan", bArr);
                    }
                }
            }
        }
        if (aiav == aiax.c) {
            bundle.putString("networkLocationType", "cell");
            bundle.putInt("locationSubtype", ((aiah) aiav).a);
        } else if (aiav == aiax.b) {
            bundle.putString("networkLocationType", "wifi");
            bundle.putInt("locationSubtype", ((aibo) aiav).a);
            aibo aibo2 = aiax.b;
            if (aibo2 != null) {
                aibe aibe2 = aibo2.c;
                amrl.a((Object) aibe2);
                if (aibe2.d()) {
                    bundle.putString("levelId", aibe2.i());
                }
                if (aibe2.e()) {
                    bundle.putInt("levelNumberE3", aibe2.j());
                }
                if (aybc.b() && aibe2.f()) {
                    bundle.putString("floorLabel", aibe2.k());
                }
            }
        }
        location.setExtras(bundle);
        return location;
    }
}
