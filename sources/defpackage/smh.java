package defpackage;

import android.content.Context;
import android.location.Location;
import android.text.TextUtils;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.util.Arrays;
import java.util.List;

/* renamed from: smh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class smh {
    public static RequestQueue a() {
        return ihs.b().getRequestQueue();
    }

    public static void a(String str, Response.Listener listener, Response.ErrorListener errorListener) {
        RequestQueue a = a();
        aucd o = avum.e.o();
        long a2 = jhg.a((Context) ihs.b());
        if (o.c) {
            o.c();
            o.c = false;
        }
        avum avum = (avum) o.b;
        int i = avum.a | 1;
        avum.a = i;
        avum.b = a2;
        if (str != null) {
            str.getClass();
            avum.a = i | 2;
            avum.c = str;
        } else {
            avum.a = i | 4;
            avum.d = true;
        }
        a.add(smi.a(String.valueOf(azfq.b()).concat("/nova/rename_device"), true, listener, errorListener, (auef) avun.a.c(7), (avum) o.i()));
    }

    public static void a(avuj[] avujArr, Location location, avtx avtx, avty avty, String str, avue avue, boolean z, String str2, Response.Listener listener, Response.ErrorListener errorListener) {
        avtx avtx2 = avtx;
        avty avty2 = avty;
        String str3 = str;
        avue avue2 = avue;
        String str4 = str2;
        snn.b("sending remote payload: [%s, %s]", Arrays.toString(avujArr), str3);
        RequestQueue a = a();
        aucd o = avuk.j.o();
        if (!TextUtils.isEmpty(str)) {
            if (o.c) {
                o.c();
                o.c = false;
            }
            avuk avuk = (avuk) o.b;
            str.getClass();
            avuk.a |= 2;
            avuk.c = str3;
        }
        List<avuj> asList = Arrays.asList(avujArr);
        if (o.c) {
            o.c();
            o.c = false;
        }
        avuk avuk2 = (avuk) o.b;
        if (!avuk2.d.a()) {
            avuk2.d = aucj.a(avuk2.d);
        }
        for (avuj avuj : asList) {
            avuk2.d.d(avuj.z);
        }
        if (location != null) {
            aucd o2 = avub.f.o();
            float accuracy = location.getAccuracy();
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            avub avub = (avub) o2.b;
            avub.a |= 4;
            avub.d = accuracy;
            double latitude = location.getLatitude();
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            avub avub2 = (avub) o2.b;
            avub2.a = 2 | avub2.a;
            avub2.c = latitude;
            double longitude = location.getLongitude();
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            avub avub3 = (avub) o2.b;
            avub3.a |= 1;
            avub3.b = longitude;
            long time = location.getTime();
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            avub avub4 = (avub) o2.b;
            avub4.a |= 16;
            avub4.e = time;
            if (o.c) {
                o.c();
                o.c = false;
            }
            avuk avuk3 = (avuk) o.b;
            avub avub5 = (avub) o2.i();
            avub5.getClass();
            avuk3.b = avub5;
            avuk3.a |= 1;
        }
        if (avue2 != null) {
            if (o.c) {
                o.c();
                o.c = false;
            }
            avuk avuk4 = (avuk) o.b;
            avue.getClass();
            avuk4.e = avue2;
            avuk4.a |= 8;
        }
        if (avtx2 != null) {
            if (o.c) {
                o.c();
                o.c = false;
            }
            avuk avuk5 = (avuk) o.b;
            avtx.getClass();
            avuk5.f = avtx2;
            avuk5.a |= 16;
        }
        if (avty2 != null) {
            if (o.c) {
                o.c();
                o.c = false;
            }
            avuk avuk6 = (avuk) o.b;
            avty.getClass();
            avuk6.g = avty2;
            avuk6.a |= 32;
        }
        if (str4 != null) {
            if (o.c) {
                o.c();
                o.c = false;
            }
            avuk avuk7 = (avuk) o.b;
            str2.getClass();
            avuk7.a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            avuk7.i = str4;
        }
        if (o.c) {
            o.c();
            o.c = false;
        }
        avuk avuk8 = (avuk) o.b;
        avuk8.a |= 64;
        avuk8.h = z;
        a.add(smi.a(azfq.a.a().b(), false, listener, errorListener, (auef) avul.a.c(7), (avuk) o.i()));
    }

    public static void a(avuj[] avujArr, String str, boolean z, String str2) {
        a(avujArr, (Location) null, (avtx) null, (avty) null, str, (avue) null, z, str2, (Response.Listener) null, (Response.ErrorListener) null);
    }
}
