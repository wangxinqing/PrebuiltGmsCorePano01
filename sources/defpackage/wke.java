package defpackage;

import android.content.Context;
import com.android.volley.VolleyError;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.notifications.Identifier;
import com.google.android.gms.notifications.ReadStateUpdate;

/* renamed from: wke  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class wke extends wkb {
    private static final jjg d = jjg.a(iyc.GUNS);
    final String a;
    final String b;
    final ReadStateUpdate c;

    public wke(String str, String str2, ReadStateUpdate readStateUpdate, wkc wkc) {
        super(wkc, "UpdateReadState");
        this.a = str;
        this.b = str2;
        this.c = readStateUpdate;
    }

    public final Status b(Context context) {
        try {
            wjm wjm = new wjm(context);
            String str = this.a;
            String str2 = this.b;
            ReadStateUpdate readStateUpdate = this.c;
            aucd o = amhe.e.o();
            Identifier identifier = readStateUpdate.c;
            aucd o2 = amej.g.o();
            long j = identifier.d;
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            amej amej = (amej) o2.b;
            int i = amej.a | 4;
            amej.a = i;
            amej.d = j;
            String str3 = identifier.b;
            if (str3 != null) {
                str3.getClass();
                i |= 1;
                amej.a = i;
                amej.b = str3;
            }
            String str4 = identifier.c;
            if (str4 != null) {
                str4.getClass();
                i |= 2;
                amej.a = i;
                amej.c = str4;
            }
            String str5 = identifier.e;
            if (str5 != null) {
                str5.getClass();
                i |= 8;
                amej.a = i;
                amej.e = str5;
            }
            String str6 = identifier.f;
            if (str6 != null) {
                str6.getClass();
                amej.a = i | 16;
                amej.f = str6;
            }
            amej amej2 = (amej) o2.i();
            if (o.c) {
                o.c();
                o.c = false;
            }
            amhe amhe = (amhe) o.b;
            amej2.getClass();
            amhe.b = amej2;
            int i2 = 1;
            amhe.a |= 1;
            int a2 = amed.a(readStateUpdate.b);
            if (a2 != 0) {
                i2 = a2;
            }
            if (o.c) {
                o.c();
                o.c = false;
            }
            amhe amhe2 = (amhe) o.b;
            amhe2.c = i2 - 1;
            amhe2.a |= 4;
            aucd o3 = amhf.b.o();
            o3.k(o);
            wjm.a(context, str, str2, (amhf) o3.i());
            return Status.a;
        } catch (VolleyError | eif e) {
            anih anih = (anih) d.c();
            anih.a(e);
            anih.a("Failed to update the notification(s) read state.");
            return Status.c;
        }
    }
}
