package defpackage;

import android.content.Context;
import com.google.android.gms.common.internal.ClientContext;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

/* renamed from: zvu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class zvu {
    public final zvt a;
    public final zvs b;

    public final aqxb a(ClientContext clientContext, String str, String[] strArr, String str2) {
        aqwy aqwy = (aqwy) aqwz.d.o();
        aucd o = aqvi.b.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        str.getClass();
        ((aqvi) o.b).a = str;
        if (aqwy.c) {
            aqwy.c();
            aqwy.c = false;
        }
        aqvi aqvi = (aqvi) o.i();
        aqvi.getClass();
        ((aqwz) aqwy.b).a = aqvi;
        if (strArr != null) {
            aqwy.a(Arrays.asList(strArr));
        }
        if (aqwy.c) {
            aqwy.c();
            aqwy.c = false;
        }
        ((aqwz) aqwy.b).e = 0;
        if (aqwy.c) {
            aqwy.c();
            aqwy.c = false;
        }
        str2.getClass();
        ((aqwz) aqwy.b).c = str2;
        zvt zvt = this.a;
        aqwz aqwz = (aqwz) aqwy.i();
        long b2 = azer.b();
        if (zvt.c == null) {
            zvt.c = baaj.a(baai.UNARY, "google.internal.people.v2.InternalPeopleService/RestoreDeviceContacts", baoq.a(aqwz.d), baoq.a(aqxb.c));
        }
        return (aqxb) zvt.a.a(zvt.c, clientContext, aqwz, b2, TimeUnit.MILLISECONDS);
    }

    public zvu(Context context) {
        izd izd = new izd(context, azer.a.a().b(), (int) azer.a.a().a(), context.getApplicationInfo().uid, 14080);
        this.a = new zvt(izd);
        this.b = new zvs(izd);
    }
}
