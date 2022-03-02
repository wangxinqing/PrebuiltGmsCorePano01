package defpackage;

import android.content.Context;
import com.google.android.gms.nearby.messages.ClientAppIdentifier;
import com.google.android.gms.nearby.messages.Message;

/* renamed from: val  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class val extends thj {
    public val(Context context, String str, String str2) {
        super(context, str, str2);
    }

    public static String a(Message message) {
        return uyg.a(ClientAppIdentifier.a, message);
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object a() {
        return avae.h;
    }

    public final /* bridge */ /* synthetic */ String b(Object obj) {
        auzr auzr = ((avae) obj).c;
        if (auzr == null) {
            auzr = auzr.e;
        }
        return a(vem.a(auzr));
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ boolean a(Object obj) {
        avae avae = (avae) obj;
        return false;
    }
}
