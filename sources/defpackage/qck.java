package defpackage;

import com.google.android.chimera.Activity;

/* renamed from: qck  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qck {
    public static br a(Activity activity) {
        br brVar;
        amrl.a(activity instanceof qcd);
        qcj h = ((qcd) activity).h();
        amrl.a((Object) h);
        Activity activity2 = h.getActivity();
        if (activity2 != null) {
            brVar = h.a(new bm(activity2.getApplication()));
        } else {
            brVar = null;
        }
        amrl.a((Object) brVar);
        return brVar;
    }

    public static br a(Activity activity, bn bnVar) {
        amrl.a(activity instanceof qcd);
        qcj h = ((qcd) activity).h();
        amrl.a((Object) h);
        br a = h.a(bnVar);
        amrl.a((Object) a);
        return a;
    }
}
