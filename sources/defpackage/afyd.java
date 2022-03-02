package defpackage;

import android.util.Log;

/* renamed from: afyd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class afyd implements afyc {
    private final aucp a;

    public afyd(aucp aucp) {
        amrl.a(aucp.a(0) != null, (Object) "EnumMap must have a value for number 0");
        this.a = aucp;
    }

    public final /* bridge */ /* synthetic */ int a(Object obj) {
        return ((auco) obj).a();
    }

    public final /* bridge */ /* synthetic */ Object a(Integer num) {
        if (num == null) {
            String valueOf = String.valueOf((Object) null);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 20);
            sb.append("Unknown event code ");
            sb.append(valueOf);
            sb.append("!");
            Log.e("SyncMetadata", sb.toString());
            return this.a.a(0);
        }
        auco a2 = this.a.a(num.intValue());
        if (a2 != null) {
            return a2;
        }
        return this.a.a(0);
    }
}
