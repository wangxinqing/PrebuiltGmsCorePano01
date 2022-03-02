package defpackage;

import android.content.Context;
import android.net.Uri;
import android.util.Log;
import com.google.android.gms.common.api.Status;

/* renamed from: xqt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class xqt extends nis {
    private final wtb a;
    private final yar b;
    private final String c;
    private final Uri d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public xqt(wtb wtb, Context context, String str, Uri uri) {
        super(208, "SyncHighResPhoto");
        yar yar = new yar(context);
        this.a = wtb;
        this.c = str;
        this.d = uri;
        this.b = yar;
    }

    /* access modifiers changed from: protected */
    public final void a(Context context) {
        if (ayud.a.a().a()) {
            aucd o = xld.e.o();
            if (o.c) {
                o.c();
                o.c = false;
            }
            xld xld = (xld) o.b;
            xld.b = 5;
            xld.a |= 1;
            int a2 = yby.a(this.c);
            if (o.c) {
                o.c();
                o.c = false;
            }
            xld xld2 = (xld) o.b;
            int i = a2 - 1;
            if (a2 != 0) {
                xld2.d = i;
                xld2.a |= 4;
                try {
                    this.b.a(this.d);
                    this.a.e(Status.a);
                    wml a3 = wml.a();
                    if (o.c) {
                        o.c();
                        o.c = false;
                    }
                    xld xld3 = (xld) o.b;
                    xld3.c = 1;
                    xld3.a |= 2;
                    a3.a((xld) o.i());
                } catch (nja e) {
                    wml a4 = wml.a();
                    if (o.c) {
                        o.c();
                        o.c = false;
                    }
                    xld xld4 = (xld) o.b;
                    xld4.c = 0;
                    xld4.a |= 2;
                    a4.a((xld) o.i());
                    throw e;
                }
            } else {
                throw null;
            }
        } else {
            Log.e("SyncHighResPhotoOperation", "Sync high res photo is not enabled yet in GmsCore.");
            throw new nja(10, "Sync high res photo is not enabled yet in GmsCore.");
        }
    }

    /* access modifiers changed from: protected */
    public final void a(Status status) {
        this.a.e(status);
    }
}
