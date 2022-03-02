package defpackage;

import android.animation.ValueAnimator;
import android.os.Bundle;
import android.view.View;
import com.google.android.chimera.Fragment;
import com.google.android.chimera.FragmentManager;
import com.google.android.chimera.FragmentTransaction;
import com.google.android.gms.R;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* renamed from: fcl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class fcl {
    public final FragmentManager a;
    public BottomSheetBehavior b;
    public int c = R.id.dialog_container_1;
    public int d;
    private final View e;
    private final int f;
    private int g = R.id.dialog_container_2;

    public fcl(FragmentManager fragmentManager, View view, int i, Bundle bundle) {
        this.a = fragmentManager;
        this.e = view;
        this.f = i;
        if (bundle != null) {
            this.c = bundle.getInt("key_current_container_id");
            this.g = bundle.getInt("key_next_container_id");
        }
    }

    public final void a(int i) {
        int min = Math.min(i, (int) ((((long) this.f) * awnv.a.a().a()) / 100));
        Fragment findFragmentById = this.a.findFragmentById(this.g);
        Fragment findFragmentById2 = this.a.findFragmentById(this.c);
        if (findFragmentById2 != null && findFragmentById2.getView() != null) {
            findFragmentById2.getView().setAlpha(0.0f);
            this.e.findViewById(this.c).setVisibility(0);
            int i2 = this.d;
            BottomSheetBehavior bottomSheetBehavior = this.b;
            if (bottomSheetBehavior != null && i2 == 0) {
                i2 = bottomSheetBehavior.b();
            }
            ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{i2, min});
            ofInt.addUpdateListener(new fci(this, findFragmentById, findFragmentById2));
            ofInt.setDuration(awnv.a.a().e());
            ofInt.addListener(new fcj(this, findFragmentById));
            ofInt.start();
        }
    }

    public final void a(Bundle bundle) {
        bundle.putInt("key_current_container_id", this.c);
        bundle.putInt("key_next_container_id", this.g);
    }

    public final void a(Fragment fragment, String str) {
        if (this.a.findFragmentById(this.c) != null) {
            this.e.findViewById(this.g).setVisibility(4);
        }
        BottomSheetBehavior bottomSheetBehavior = this.b;
        if (bottomSheetBehavior != null) {
            int i = this.d;
            if (i > 0) {
                bottomSheetBehavior.a(i);
            }
            this.b.c(4);
        }
        FragmentTransaction beginTransaction = this.a.beginTransaction();
        beginTransaction.add(this.g, fragment, str);
        beginTransaction.commitNow();
        int i2 = this.c;
        this.c = this.g;
        this.g = i2;
    }

    public final void a(BottomSheetBehavior bottomSheetBehavior) {
        this.b = bottomSheetBehavior;
        bottomSheetBehavior.a((ajtn) new fck(this, bottomSheetBehavior));
    }
}
