package defpackage;

import com.google.android.chimera.Fragment;
import com.google.android.chimera.FragmentManager;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* renamed from: evv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class evv implements ax {
    private final evy a;

    public evv(evy evy) {
        this.a = evy;
    }

    public final void a(Object obj) {
        Fragment fragment;
        evy evy = this.a;
        int intValue = ((Integer) obj).intValue();
        String str = (String) evy.a.get(Integer.valueOf(intValue));
        if (str != null) {
            FragmentManager childFragmentManager = evy.getChildFragmentManager();
            if (childFragmentManager.findFragmentByTag(str) == null) {
                Fragment findFragmentById = childFragmentManager.findFragmentById(evy.c.c);
                if (intValue == 1) {
                    fragment = new ewm();
                } else if (intValue == 2) {
                    fragment = new exb();
                } else if (intValue == 3) {
                    fragment = new ews();
                } else if (intValue == 4) {
                    fragment = new ewj();
                } else {
                    StringBuilder sb = new StringBuilder(39);
                    sb.append("Unrecognized fragment type: ");
                    sb.append(intValue);
                    throw new IllegalStateException(sb.toString());
                }
                BottomSheetBehavior bottomSheetBehavior = evy.b;
                if (bottomSheetBehavior != null && findFragmentById == null) {
                    bottomSheetBehavior.a(0);
                }
                evy.c.a(fragment, str);
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
