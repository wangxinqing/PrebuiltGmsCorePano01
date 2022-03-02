package defpackage;

import com.google.android.chimera.Fragment;
import com.google.android.chimera.FragmentManager;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* renamed from: fdr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class fdr implements ax {
    private final fdu a;

    public fdr(fdu fdu) {
        this.a = fdu;
    }

    public final void a(Object obj) {
        Fragment fragment;
        fdu fdu = this.a;
        int intValue = ((Integer) obj).intValue();
        String str = (String) fdu.a.get(Integer.valueOf(intValue));
        if (str != null) {
            FragmentManager childFragmentManager = fdu.getChildFragmentManager();
            if (childFragmentManager.findFragmentByTag(str) == null) {
                Fragment findFragmentById = childFragmentManager.findFragmentById(fdu.c.c);
                if (intValue == 1) {
                    fragment = new ffr();
                } else if (intValue == 2) {
                    fragment = new ffp();
                } else if (intValue == 3) {
                    fragment = new ffi();
                } else {
                    StringBuilder sb = new StringBuilder(39);
                    sb.append("Unrecognized fragment type: ");
                    sb.append(intValue);
                    throw new IllegalStateException(sb.toString());
                }
                BottomSheetBehavior bottomSheetBehavior = fdu.b;
                if (bottomSheetBehavior != null && findFragmentById == null) {
                    bottomSheetBehavior.a(0);
                }
                fdu.c.a(fragment, str);
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
