package defpackage;

import android.content.Context;
import android.util.Log;
import com.android.volley.toolbox.ImageRequest;
import com.google.android.gms.common.internal.ClientContext;
import java.util.concurrent.TimeUnit;

/* renamed from: xpp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class xpp {
    public final int a;
    public final xpo b;
    public final xpn c;

    public xpp(Context context, int i) {
        this(context, context.getApplicationInfo().uid, i);
    }

    public static xpp a(Context context, int i) {
        xip.a();
        if (Boolean.valueOf(ayrj.a.a().I()).booleanValue()) {
            if (((Boolean) xin.a.a()).booleanValue()) {
                return new xpp(context, i, 5380, ayrj.e(), ((Integer) xgc.a.a()).intValue(), ayrj.d());
            }
            return new xpp(context, i, 5380, ayrj.e(), ((Integer) xgc.a.a()).intValue(), (String) null);
        } else if (!((Boolean) xin.a.a()).booleanValue()) {
            return new xpp(context, i, 5380);
        } else {
            return new xpp(context, i, 5380, ayrj.d());
        }
    }

    public xpp(Context context, int i, int i2) {
        this(context, i, i2, (String) null);
    }

    public xpp(Context context, int i, int i2, String str) {
        this(context, i, i2, aywy.a.a().o(), (int) aywy.a.a().p(), str);
    }

    public xpp(Context context, int i, int i2, String str, int i3, String str2) {
        izd izd = new izd(context, str, i3, i, i2);
        if (str2 != null) {
            izd.d = str2;
        }
        this.b = new xpo(izd);
        this.c = new xpn(izd);
        xip.a();
        this.a = Math.max(ImageRequest.DEFAULT_IMAGE_TIMEOUT_MS, Integer.valueOf((int) ayrj.a.a().au()).intValue());
    }

    public final aqvr a(ClientContext clientContext, aqvp aqvp) {
        try {
            return this.b.a(clientContext, aqvp, (long) this.a);
        } catch (babk | eif e) {
            Log.e("InternalPeopleServiceGrpcClient", "Error making Grpc request.", e);
            throw e;
        }
    }

    public final aqvs a(ClientContext clientContext, aqvt aqvt) {
        try {
            xpo xpo = this.b;
            long j = (long) this.a;
            if (xpo.k == null) {
                xpo.k = baaj.a(baai.UNARY, "google.internal.people.v2.InternalPeopleService/GetPersonPhotoEncoded", baoq.a(aqvt.e), baoq.a(aqvs.b));
            }
            return (aqvs) xpo.a.a(xpo.k, clientContext, aqvt, j, TimeUnit.MILLISECONDS);
        } catch (babk | eif e) {
            Log.e("InternalPeopleServiceGrpcClient", "Error making Grpc request.", e);
            throw e;
        }
    }

    public final aqxj a(ClientContext clientContext, aqxi aqxi) {
        try {
            xpo xpo = this.b;
            long j = (long) this.a;
            if (xpo.l == null) {
                xpo.l = baaj.a(baai.UNARY, "google.internal.people.v2.InternalPeopleService/UpdatePersonPhoto", baoq.a(aqxi.h), baoq.a(aqxj.d));
            }
            return (aqxj) xpo.a.a(xpo.l, clientContext, aqxi, j, TimeUnit.MILLISECONDS);
        } catch (babk | eif e) {
            Log.e("InternalPeopleServiceGrpcClient", "Error making Grpc request.", e);
            throw e;
        }
    }
}
