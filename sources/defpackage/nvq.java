package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import java.nio.charset.Charset;

/* renamed from: nvq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class nvq extends nvo {
    public nvq(Context context) {
        super(context, "fcm_queued_messages.ldb");
    }

    public static byte[] b(String str) {
        return str.getBytes(Charset.forName("UTF-8"));
    }

    public final amri a(String str) {
        return a(b(str));
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ amri c(aucj aucj) {
        nrp nrp = (nrp) aucj;
        if (nrp == null) {
            Log.w("GCM", "Provided QueuedMessage is null.");
        } else if ((nrp.a & 2) == 0) {
            Log.w("GCM", "Stanza message was not populated.");
        } else {
            amnc amnc = nrp.c;
            if (amnc == null) {
                amnc = amnc.r;
            }
            if (TextUtils.isEmpty(amnc.h)) {
                Log.w("GCM", "PersistentId was not populated.");
            } else {
                amnc amnc2 = nrp.c;
                if (amnc2 == null) {
                    amnc2 = amnc.r;
                }
                return amri.b(b(amnc2.h));
            }
        }
        return ampu.a;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ aucj c(byte[] bArr) {
        return (nrp) aucj.a((aucj) nrp.e, bArr);
    }
}
