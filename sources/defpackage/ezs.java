package defpackage;

import com.google.android.chimera.Fragment;
import com.google.android.chimera.FragmentManager;

/* renamed from: ezs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class ezs implements ax {
    private final ezu a;

    public ezs(ezu ezu) {
        this.a = ezu;
    }

    public final void a(Object obj) {
        ezu ezu = this.a;
        if (((Boolean) ((amri) obj).b()).booleanValue()) {
            FragmentManager childFragmentManager = ezu.getChildFragmentManager();
            Fragment findFragmentById = childFragmentManager.findFragmentById(ezu.a);
            Fragment findFragmentById2 = childFragmentManager.findFragmentById(ezu.b);
            if (findFragmentById != null && findFragmentById2 != null) {
                childFragmentManager.beginTransaction().remove(findFragmentById).commitNow();
            }
        }
    }
}
