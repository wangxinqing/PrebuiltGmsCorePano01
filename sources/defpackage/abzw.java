package defpackage;

import com.google.android.gms.smartdevice.d2d.BootstrapAccount;

/* renamed from: abzw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class abzw implements acvz {
    public final /* bridge */ /* synthetic */ acwa a(Object obj) {
        String str;
        BootstrapAccount[] bootstrapAccountArr = (BootstrapAccount[]) obj;
        if (bootstrapAccountArr == null || bootstrapAccountArr.length <= 0) {
            str = "";
        } else {
            str = bootstrapAccountArr[0].b;
        }
        return acws.a((Object) str);
    }
}
