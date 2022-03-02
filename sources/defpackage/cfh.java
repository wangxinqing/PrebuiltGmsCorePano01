package defpackage;

import android.location.Location;
import com.google.android.gms.awareness.fence.AwarenessFence;
import com.google.android.gms.contextmanager.ContextData;
import com.google.android.gms.contextmanager.fence.internal.ContextFenceStub;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.TimeZone;

/* renamed from: cfh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class cfh extends bva {
    final /* synthetic */ cfj a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public cfh(cfj cfj, String str, Object... objArr) {
        super(str, objArr);
        this.a = cfj;
    }

    public final void a(Exception exc) {
        this.a.j();
    }

    public final /* bridge */ /* synthetic */ void a(Object obj) {
        boolean z;
        grp grp = (grp) ((ick) obj).a;
        Location location = grp.a.b() != null ? grp.a.b().d : null;
        new Object[1][0] = location;
        if (location != null) {
            cfj cfj = this.a;
            cfj.p = 120000;
            long a2 = cbi.i().a();
            avyi avyi = new avyi(location.getLongitude(), location.getLatitude());
            int i = -1;
            int i2 = 0;
            while (i <= 1) {
                avyi.a((((long) i) * 86400000) + a2);
                cfj.n[i2] = avyi.a(true);
                cfj.o[i2] = avyi.a(false);
                i++;
                i2++;
            }
            aucd o = atup.e.o();
            List asList = Arrays.asList(new atuo[]{cfj.a(2, cfj.n), cfj.a(3, cfj.o)});
            if (o.c) {
                o.c();
                o.c = false;
            }
            atup atup = (atup) o.b;
            if (!atup.b.a()) {
                atup.b = aucj.a(atup.b);
            }
            auab.a((Iterable) asList, (List) atup.b);
            int b = aell.b(location.getLatitude());
            if (o.c) {
                o.c();
                o.c = false;
            }
            atup atup2 = (atup) o.b;
            atup2.a |= 1;
            atup2.c = b;
            int b2 = aell.b(location.getLongitude());
            if (o.c) {
                o.c();
                o.c = false;
            }
            atup atup3 = (atup) o.b;
            atup3.a |= 2;
            atup3.d = b2;
            atup atup4 = (atup) o.i();
            new Object[1][0] = atup4;
            jti jti = new jti(10, 43, 2);
            jti.a(jut.b(a2));
            jti.a(atup.f, atup4);
            ContextData a3 = jti.a();
            cfj.a(-1 + a2);
            cfj.d(a3);
            long j = Long.MAX_VALUE;
            for (int i3 = 0; i3 < 3; i3++) {
                long j2 = cfj.n[i3];
                if (a2 < j2 && j2 < j) {
                    j = j2;
                }
                long j3 = cfj.o[i3];
                if (a2 < j3 && j3 < j) {
                    j = j3;
                }
            }
            AwarenessFence[] awarenessFenceArr = new AwarenessFence[2];
            int latitude = (int) (location.getLatitude() * 1.0E7d);
            int longitude = (int) (location.getLongitude() * 1.0E7d);
            iva.b(true);
            aucd o2 = atku.j.o();
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            atku atku = (atku) o2.b;
            atku.b = 1;
            int i4 = atku.a | 1;
            atku.a = i4;
            atku.c = 1;
            int i5 = i4 | 2;
            atku.a = i5;
            int i6 = i5 | 4;
            atku.a = i6;
            atku.d = 0;
            int i7 = i6 | 128;
            atku.a = i7;
            atku.i = 0;
            int i8 = i7 | 8;
            atku.a = i8;
            atku.e = latitude;
            int i9 = i8 | 16;
            atku.a = i9;
            atku.f = longitude;
            int i10 = i9 | 32;
            atku.a = i10;
            atku.g = 20000.0d;
            atku.a = i10 | 64;
            atku.h = 20000.0d;
            jvo jvo = new jvo((atku) o2.i());
            iva.a((Object) jvo);
            atjq atjq = (atjq) atjt.z.o();
            atjs atjs = atjs.LOCATION_FENCE;
            if (atjq.c) {
                atjq.c();
                atjq.c = false;
            }
            atjt atjt = (atjt) atjq.b;
            atjt.b = atjs.z;
            int i11 = atjt.a | 1;
            atjt.a = i11;
            atku atku2 = jvo.a;
            atku2.getClass();
            atjt.e = atku2;
            atjt.a = i11 | 4;
            ContextFenceStub contextFenceStub = new ContextFenceStub((atjt) atjq.i());
            iva.a((Object) contextFenceStub);
            iva.a((Object) contextFenceStub);
            atjq atjq2 = (atjq) atjt.z.o();
            atjs atjs2 = atjs.NOT;
            if (atjq2.c) {
                atjq2.c();
                atjq2.c = false;
            }
            atjt atjt2 = (atjt) atjq2.b;
            atjt2.b = atjs2.z;
            atjt2.a |= 1;
            atjq2.a(contextFenceStub.c());
            awarenessFenceArr[0] = new ContextFenceStub((atjt) atjq2.i());
            if (j >= 0) {
                z = true;
            } else {
                z = false;
            }
            TimeZone timeZone = jvz.a;
            iva.b(z);
            iva.b(true);
            iva.b(true);
            awarenessFenceArr[1] = ContextFenceStub.a(new jvz(jvz.a(atmd.ABSOLUTE_INTERVAL, timeZone, j, Long.MAX_VALUE)));
            iva.b(true);
            ArrayList arrayList = new ArrayList(2);
            for (int i12 = 0; i12 < 2; i12++) {
                arrayList.add((ContextFenceStub) awarenessFenceArr[i12]);
            }
            iva.a((Object) arrayList);
            iva.b(!arrayList.isEmpty());
            atjq atjq3 = (atjq) atjt.z.o();
            atjs atjs3 = atjs.OR;
            if (atjq3.c) {
                atjq3.c();
                atjq3.c = false;
            }
            atjt atjt3 = (atjt) atjq3.b;
            atjt3.b = atjs3.z;
            atjt3.a |= 1;
            atjq3.a((Iterable) ContextFenceStub.a((Collection) arrayList));
            cfj.l = new ContextFenceStub((atjt) atjq3.i());
            new Object[1][0] = cfj.l;
            grd grd = new grd();
            grd.a(cfj.m, cfj.l, cfj);
            gra.a(cfj.d, cfj.g).a(grd.a()).a((acvp) new bva("[SunStateProducer] register fence", new Object[0]));
            return;
        }
        this.a.j();
    }
}
