package defpackage;

import android.content.Context;

/* renamed from: wrl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class wrl extends wqz {
    public final yda f;

    public wrl(Context context) {
        super("CL_DM", context, new xsd(context), (ybz) null, (amsv) null);
        xip.a();
        if (((Boolean) xfv.a.a()).booleanValue()) {
            this.f = ydb.a(context, "CL_DM");
        } else {
            this.f = new yda(context, "CL_DM");
        }
    }
}
