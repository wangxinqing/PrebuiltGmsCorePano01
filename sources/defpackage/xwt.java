package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.ClientContext;
import java.util.List;

/* renamed from: xwt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class xwt {
    public final ClientContext a;
    public final xpp b;
    public final String c;
    public final yav d;
    public final yaz e;
    public final aqwp f;
    public final ybu g;

    public xwt(Context context, ClientContext clientContext, xpp xpp, String str, amsn amsn, yaz yaz, aqwp aqwp, ybu ybu) {
        String str2;
        this.a = clientContext;
        this.b = xpp;
        this.g = ybu;
        if (!TextUtils.isEmpty(str)) {
            str2 = "AID_".concat(str);
        } else {
            str2 = "";
        }
        this.c = str2;
        this.f = aqwp;
        this.e = yaz;
        this.d = new yav(context, yaz, amsn);
    }

    public static aqvx a() {
        aqvv aqvv = (aqvv) aqvx.b.o();
        aqvv.a(aqvw.GDATA_COMPATIBILITY);
        return (aqvx) aqvv.i();
    }

    public static void a(String str) {
        xdt.b("FSA2_PhotoSyncGrpc", "writePhoto() failed since %s", str);
    }

    public static void a(List list, int i) {
        if (list.size() != i) {
            throw new xxz(3);
        }
    }

    public final byte[] a(String str, int i) {
        if (i != 2) {
            i = 1;
        }
        amrl.a(true);
        if (str != null) {
            xip.a();
            aucd o = aqvt.e.o();
            if (o.c) {
                o.c();
                o.c = false;
            }
            ((aqvt) o.b).a = aqwt.a(5);
            if (o.c) {
                o.c();
                o.c = false;
            }
            str.getClass();
            ((aqvt) o.b).b = str;
            aucd o2 = aqws.c.o();
            if (i != 2) {
                int intValue = Integer.valueOf((int) ayrj.a.a().aY()).intValue();
                if (o2.c) {
                    o2.c();
                    o2.c = false;
                }
                ((aqws) o2.b).b = intValue;
                int intValue2 = Integer.valueOf((int) ayrj.a.a().aZ()).intValue();
                if (o2.c) {
                    o2.c();
                    o2.c = false;
                }
                ((aqws) o2.b).a = intValue2;
            } else {
                int intValue3 = Integer.valueOf((int) ayrj.a.a().aW()).intValue();
                if (o2.c) {
                    o2.c();
                    o2.c = false;
                }
                ((aqws) o2.b).b = intValue3;
                int intValue4 = Integer.valueOf((int) ayrj.a.a().aX()).intValue();
                if (o2.c) {
                    o2.c();
                    o2.c = false;
                }
                ((aqws) o2.b).a = intValue4;
            }
            if (o.c) {
                o.c();
                o.c = false;
            }
            aqws aqws = (aqws) o2.i();
            aqws.getClass();
            ((aqvt) o.b).c = aqws;
            if (o.c) {
                o.c();
                o.c = false;
            }
            ((aqvt) o.b).f = true;
            aqwp aqwp = this.f;
            if (o.c) {
                o.c();
                o.c = false;
            }
            aqwp.getClass();
            ((aqvt) o.b).d = aqwp;
            try {
                this.d.a();
                aqvs a2 = this.b.a(this.a, (aqvt) o.i());
                this.d.a("FSA_getPersonPhotoEncoded", 1, xxa.a(a2));
                if (a2 != null) {
                    return a2.a.k();
                }
                throw new xya(3);
            } catch (babk | eif e2) {
                Log.e("FSA2_PhotoSyncGrpc", "readPhoto error", e2);
                throw e2;
            }
        } else {
            Log.e("FSA2_PhotoSyncGrpc", "readPhoto() failed since contactID was null.");
            throw new xya(2);
        }
    }
}
