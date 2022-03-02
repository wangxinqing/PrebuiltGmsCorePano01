package defpackage;

import com.google.android.chimera.Fragment;
import com.google.android.chimera.FragmentManager;
import com.google.android.chimera.FragmentTransaction;
import com.google.android.gms.R;

/* renamed from: fdy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class fdy implements ax {
    private final fdz a;

    public fdy(fdz fdz) {
        this.a = fdz;
    }

    public final void a(Object obj) {
        Fragment fragment;
        fdz fdz = this.a;
        int intValue = ((Integer) obj).intValue();
        String str = (String) fdz.a.get(Integer.valueOf(intValue));
        if (str != null) {
            FragmentManager childFragmentManager = fdz.getChildFragmentManager();
            if (childFragmentManager.findFragmentByTag(str) == null) {
                if (intValue == 1) {
                    fragment = ffe.a(fdz.b);
                } else if (intValue == 2) {
                    fragment = new fff();
                } else {
                    StringBuilder sb = new StringBuilder(39);
                    sb.append("Unrecognized fragment type: ");
                    sb.append(intValue);
                    throw new IllegalStateException(sb.toString());
                }
                FragmentTransaction beginTransaction = childFragmentManager.beginTransaction();
                beginTransaction.replace(R.id.main_container, fragment, str);
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
