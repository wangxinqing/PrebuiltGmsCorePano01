package defpackage;

import android.content.Context;
import android.location.Location;
import android.text.TextUtils;
import java.util.Collections;
import java.util.Locale;

/* renamed from: cfq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class cfq extends ccv implements rei {
    public static final ccj b = new ccj(new cfp(), "UserLocationProducer", new int[]{1}, (int[]) null);

    public cfq(Context context, bsz bsz, String str, but but) {
        super(context, bsz, b, str, but);
    }

    public final void a() {
        cff a = cff.a();
        Object[] objArr = {this, Integer.valueOf(a.e.size())};
        if (a.e.isEmpty()) {
            a.b();
        }
        a.e.add(this);
    }

    public final void b() {
        cff a = cff.a();
        Object[] objArr = {this, Integer.valueOf(a.e.size())};
        a.e.remove(this);
        if (a.e.isEmpty()) {
            a.c.a(Collections.emptyList(), false);
            a.b.b();
            new Object[1][0] = cff.f;
            cff.f = null;
        }
    }

    public final void a(Location location) {
        int i = 2;
        Object[] objArr = {Double.valueOf(location.getLatitude()), Double.valueOf(location.getLongitude())};
        aucd o = atus.i.o();
        int b2 = aell.b(location.getLatitude());
        if (o.c) {
            o.c();
            o.c = false;
        }
        atus atus = (atus) o.b;
        atus.a |= 1;
        atus.b = b2;
        int b3 = aell.b(location.getLongitude());
        if (o.c) {
            o.c();
            o.c = false;
        }
        atus atus2 = (atus) o.b;
        atus2.a |= 2;
        atus2.c = b3;
        if (location.hasSpeed()) {
            float speed = location.getSpeed();
            if (o.c) {
                o.c();
                o.c = false;
            }
            atus atus3 = (atus) o.b;
            atus3.a |= 4;
            atus3.d = speed;
        }
        if (location.hasBearing()) {
            float bearing = location.getBearing();
            if (o.c) {
                o.c();
                o.c = false;
            }
            atus atus4 = (atus) o.b;
            atus4.a |= 8;
            atus4.e = bearing;
        }
        if (location.hasAltitude()) {
            double altitude = location.getAltitude();
            if (o.c) {
                o.c();
                o.c = false;
            }
            atus atus5 = (atus) o.b;
            atus5.a |= 16;
            atus5.f = altitude;
        }
        if (location.hasAccuracy()) {
            float accuracy = location.getAccuracy();
            if (o.c) {
                o.c();
                o.c = false;
            }
            atus atus6 = (atus) o.b;
            atus6.a |= 32;
            atus6.g = accuracy;
        }
        String upperCase = location.getProvider().toUpperCase(Locale.US);
        if (TextUtils.equals(upperCase, "UNKNOWN")) {
            i = 1;
        } else if (!TextUtils.equals(upperCase, "WIFI")) {
            i = !TextUtils.equals(upperCase, "CELL") ? !TextUtils.equals(upperCase, "GPS") ? !TextUtils.equals(upperCase, "FUSED") ? !TextUtils.equals(upperCase, "IPGEO") ? !TextUtils.equals(upperCase, "MANUAL") ? 1 : 7 : 6 : 5 : 4 : 3;
        }
        if (o.c) {
            o.c();
            o.c = false;
        }
        atus atus7 = (atus) o.b;
        atus7.h = i - 1;
        atus7.a |= 64;
        jti jti = new jti(3, 1, 1);
        jti.a(jut.a(location.getTime()));
        jti.a(atus.j, (atus) o.i());
        c(jti.a());
    }

    public final void a(cas cas) {
        cff a = cff.a();
        new Object[1][0] = cas;
        if (a.a.a(cas)) {
            a.b();
        }
    }

    public final void a(cas cas, cas cas2) {
        cff a = cff.a();
        Object[] objArr = {cas, cas2};
        Location c = a.b.c();
        if (c != null && c.getTime() > a.d + awuz.u()) {
            a.a(c);
        }
        if (a.a.a(cas, cas2)) {
            a.b();
        }
    }
}
