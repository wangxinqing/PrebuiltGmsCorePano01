package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Process;
import android.util.Log;
import com.google.android.gms.common.internal.ClientContext;
import java.io.ByteArrayOutputStream;

/* renamed from: wmr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class wmr {
    public final xpr a;
    public final zdi b = new zdi(this.d);
    public final xpp c;
    private final xpr d;

    private wmr(Context context, int i) {
        xpr xpr = new xpr(context, aywy.a.a().dk(), aywy.a.a().dj(), aywy.c(), aywy.q(), aywy.b(), aywy.a.a().du());
        xpr xpr2 = new xpr(context, aywy.a.a().dq(), aywy.a.a().dp(), aywy.c(), aywy.q(), aywy.b(), aywy.a.a().dn());
        xpp xpp = new xpp(context, i);
        this.d = xpr;
        this.a = xpr2;
        new zin(this.a);
        new zdj(this.d);
        new zdo(this.d);
        this.c = xpp;
    }

    public static synchronized wmr a(Context context, int i) {
        wmr wmr;
        synchronized (wmr.class) {
            wmr = new wmr(context, i);
        }
        return wmr;
    }

    public static xpk a(Context context, String str, String str2, String str3) {
        ClientContext clientContext;
        xip.a();
        if (!Boolean.valueOf(aywy.a.a().N()).booleanValue()) {
            clientContext = xpl.a(context, str, str3);
        } else {
            int myUid = Process.myUid();
            String packageName = context.getPackageName();
            ClientContext clientContext2 = new ClientContext(myUid, str, str, packageName, packageName);
            xip.a();
            String[] a2 = xpl.a(aywy.a.a().E());
            if (a2.length > 0) {
                clientContext2.a(a2);
            }
            clientContext2.a("social_client_app_id", str3);
            clientContext = clientContext2;
        }
        return new xpk(clientContext, str2);
    }

    public static final byte[] a(Context context, Uri uri) {
        byte[] bArr;
        String a2 = jju.a(context.getContentResolver(), uri);
        if (a2 == null || !jju.b(a2)) {
            String valueOf = String.valueOf(uri);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 22);
            sb.append("Not a image mime type ");
            sb.append(valueOf);
            throw new IllegalArgumentException(sb.toString());
        }
        int k = (int) aywy.k();
        Bitmap a3 = jju.a(context, uri, k, k, false);
        if (a3 != null) {
            int j = (int) aywy.j();
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                a3.compress(Bitmap.CompressFormat.JPEG, j, byteArrayOutputStream);
                bArr = byteArrayOutputStream.toByteArray();
                try {
                    a3.recycle();
                } catch (OutOfMemoryError e) {
                    e = e;
                }
            } catch (OutOfMemoryError e2) {
                e = e2;
                bArr = null;
                String valueOf2 = String.valueOf(uri);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 26);
                sb2.append("Could not load image from ");
                sb2.append(valueOf2);
                Log.e("DataBroker", sb2.toString(), e);
                return bArr;
            }
            return bArr;
        }
        String valueOf3 = String.valueOf(uri);
        StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf3).length() + 22);
        sb3.append("No image decoded from ");
        sb3.append(valueOf3);
        throw new IllegalArgumentException(sb3.toString());
    }
}
