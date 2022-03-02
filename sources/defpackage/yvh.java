package defpackage;

import android.content.ContentValues;
import android.content.Context;
import com.google.android.chimera.Activity;
import com.google.android.gms.common.ConnectionResult;

/* renamed from: yvh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class yvh extends irq {
    public final ConnectionResult a;
    public final ysw b;

    public yvh(ywg ywg, zab zab, ConnectionResult connectionResult, ysw ysw) {
        super(ywg, zab);
        this.a = connectionResult;
        this.b = ysw;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        zab zab = (zab) obj;
        ConnectionResult connectionResult = this.a;
        ysw ysw = this.b;
        zab.a.k = false;
        if (connectionResult.b() && ysw != null) {
            zab.a.g = ysw;
        } else {
            Activity activity = zab.a.getActivity();
            if (activity != null) {
                izr.a((Context) activity, zab.a.d, (String) null, ylm.h, yln.a, zab.a.c);
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("title", zab.a.b);
            contentValues.put("url", zab.a.b);
            contentValues.put("type", "article");
            zab.a.g = new ysw(contentValues);
        }
        zae zae = zab.a;
        zae.a(zae.g);
        zae zae2 = zab.a;
        zae2.a(zae2.m);
    }

    /* access modifiers changed from: protected */
    public final void b() {
    }
}
