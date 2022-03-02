package defpackage;

import android.content.SharedPreferences;
import com.google.android.chimera.FragmentTransaction;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.util.List;

/* renamed from: haz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class haz {
    private static final iwd a = gzk.a("AndroidCheckinProtoModule");

    static had a(awdn awdn, awdn awdn2, awdn awdn3, awdn awdn4, awdn awdn5, hal hal, awdn awdn6, awdn awdn7, hac hac, gwr gwr, hct hct) {
        hag hag;
        SharedPreferences sharedPreferences;
        gwr gwr2 = gwr;
        hct hct2 = hct;
        aucd o = had.o.o();
        if (hct2.a(had.class, 1)) {
            if (o.c) {
                o.c();
                o.c = false;
            }
            had had = (had) o.b;
            hac.getClass();
            had.b = hac;
            had.a |= 1;
        }
        if (hct2.a(had.class, 2) && (sharedPreferences = gwr2.b) != null) {
            long j = sharedPreferences.getLong("CheckinTask_bookmark", 0);
            if (o.c) {
                o.c();
                o.c = false;
            }
            had had2 = (had) o.b;
            had2.a |= 8;
            had2.c = j;
        }
        if (hct2.a(had.class, 5) && jnl.a().d()) {
            o.g("te.bots");
        }
        if (hct2.a(had.class, 6)) {
            amri amri = (amri) awdn.a();
            if (amri.a()) {
                String str = (String) amri.b();
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                had had3 = (had) o.b;
                str.getClass();
                had3.a |= 16;
                had3.f = str;
            }
        }
        if (hct2.a(had.class, 7)) {
            amri amri2 = (amri) awdn2.a();
            if (amri2.a()) {
                String str2 = (String) amri2.b();
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                had had4 = (had) o.b;
                str2.getClass();
                had4.a |= 32;
                had4.g = str2;
            }
        }
        if (hct2.a(had.class, 8)) {
            amri amri3 = (amri) awdn3.a();
            if (amri3.a()) {
                String str3 = (String) amri3.b();
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                had had5 = (had) o.b;
                str3.getClass();
                had5.a |= 64;
                had5.h = str3;
            }
        }
        if (hct2.a(had.class, 18) && ((amri) awdn6.a()).a()) {
            boolean booleanValue = ((Boolean) ((amri) awdn6.a()).b()).booleanValue();
            if (o.c) {
                o.c();
                o.c = false;
            }
            had had6 = (had) o.b;
            had6.a |= 128;
            had6.i = booleanValue;
        }
        if (hct2.a(had.class, 9)) {
            int intValue = ((Integer) awdn7.a()).intValue();
            if (o.c) {
                o.c();
                o.c = false;
            }
            had had7 = (had) o.b;
            had7.a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            had7.j = intValue;
        }
        if (hct2.a(had.class, 14)) {
            if (o.c) {
                o.c();
                o.c = false;
            }
            had had8 = (had) o.b;
            had8.k = hal.i;
            had8.a |= 1024;
        }
        if (hct2.a(had.class, 15) && (hag = gwr2.p) != null) {
            iwd iwd = a;
            Object[] objArr = new Object[2];
            int a2 = haf.a(hag.b);
            if (a2 == 0) {
                a2 = 1;
            }
            objArr[0] = Integer.valueOf(a2 - 1);
            objArr[1] = Integer.valueOf(hag.c);
            iwd.c("Checkin reason type: %d attempt count: %d.", objArr);
            if (o.c) {
                o.c();
                o.c = false;
            }
            had had9 = (had) o.b;
            hag.getClass();
            had9.l = hag;
            had9.a |= 2048;
        }
        if (hct2.a(had.class, 16)) {
            Iterable iterable = (Iterable) awdn4.a();
            if (o.c) {
                o.c();
                o.c = false;
            }
            had had10 = (had) o.b;
            had10.a();
            auab.a(iterable, (List) had10.m);
        }
        if (hct2.a(had.class, 19)) {
            amri amri4 = (amri) awdn5.a();
            if (amri4.a()) {
                String str4 = (String) amri4.b();
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                had had11 = (had) o.b;
                str4.getClass();
                had11.a |= FragmentTransaction.TRANSIT_ENTER_MASK;
                had11.n = str4;
            }
        }
        return (had) o.i();
    }
}
