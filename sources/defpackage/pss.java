package defpackage;

import android.content.Context;
import com.google.android.gms.icing.nativeindex.NativeIndex;

/* renamed from: pss  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class pss {
    public static void a(String str, Context context, ozs ozs, orf orf, NativeIndex nativeIndex, oyq oyq) {
        ptc ptc = new ptc(context);
        String string = ptc.a().getString("ActionsUploadPreviousAccount", "");
        if (!str.equals(string)) {
            ptc.a().edit().putString("ActionsUploadPreviousAccount", str).commit();
            if (!string.isEmpty()) {
                a(ozs, orf, nativeIndex);
                jjc.a(psu.a(context));
                oyq.b(4111);
            }
        }
    }

    public static void a(ozs ozs, orf orf, NativeIndex nativeIndex) {
        anhj a = ozs.d().iterator();
        while (a.hasNext()) {
            osz d = ozs.d((pao) a.next());
            if (d != null) {
                nativeIndex.a(d.i, 0, Integer.MAX_VALUE);
            }
        }
        if (!nativeIndex.i()) {
            oso.b("Unable to delete all usage reports");
        }
        anhj a2 = ozs.d().iterator();
        while (a2.hasNext()) {
            osz d2 = ozs.d((pao) a2.next());
            if (d2 != null) {
                orf.a(d2.e, d2.c);
            }
        }
    }
}
