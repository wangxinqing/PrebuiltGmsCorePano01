package defpackage;

import com.google.android.gms.common.api.Status;

/* renamed from: abzx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class abzx implements acvz {
    public final /* bridge */ /* synthetic */ acwa a(Object obj) {
        String str = (String) obj;
        if (str == null) {
            str = "";
        }
        if (str.endsWith("@google.com")) {
            return acws.a((Object) str);
        }
        throw new ibr(new Status(10501));
    }
}
