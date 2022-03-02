package defpackage;

import com.google.android.chimera.Fragment;
import com.google.android.chimera.FragmentManager;
import com.google.android.chimera.FragmentTransaction;

/* renamed from: ezr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class ezr implements ax {
    private final ezu a;

    public ezr(ezu ezu) {
        this.a = ezu;
    }

    public final void a(Object obj) {
        Fragment fragment;
        int i;
        ezu ezu = this.a;
        int intValue = ((Integer) obj).intValue();
        String str = (String) ezu.c.get(Integer.valueOf(intValue));
        if (str != null) {
            FragmentManager childFragmentManager = ezu.getChildFragmentManager();
            if (childFragmentManager.findFragmentByTag(str) == null) {
                if (intValue == 1) {
                    fragment = new fah();
                    i = ezu.a;
                } else if (intValue == 2) {
                    fragment = ezz.a(ezu.d);
                    i = ezu.a;
                } else if (intValue == 3) {
                    fragment = new fae();
                    i = ezu.b;
                } else {
                    StringBuilder sb = new StringBuilder(39);
                    sb.append("Unrecognized fragment type: ");
                    sb.append(intValue);
                    throw new IllegalStateException(sb.toString());
                }
                FragmentTransaction beginTransaction = childFragmentManager.beginTransaction();
                beginTransaction.replace(i, fragment, str);
                beginTransaction.commitNow();
                return;
            }
            return;
        }
        StringBuilder sb2 = new StringBuilder(39);
        sb2.append("Unrecognized fragment type: ");
        sb2.append(intValue);
        throw new IllegalStateException(sb2.toString());
    }
}
