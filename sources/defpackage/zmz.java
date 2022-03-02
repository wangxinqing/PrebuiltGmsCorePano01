package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.app.Dialog;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.gms.R;

/* renamed from: zmz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class zmz extends znf {
    private static PropertyValuesHolder b;
    public boolean a;

    private static Animator a(View view, long j) {
        view.setScaleX(0.0f);
        view.setScaleY(0.0f);
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, new PropertyValuesHolder[]{b});
        ofPropertyValuesHolder.setDuration(467);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, View.SCALE_X, new float[]{0.0f, 1.0f});
        ofFloat.setDuration(500);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, View.SCALE_Y, new float[]{0.0f, 1.0f});
        ofFloat2.setDuration(500);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(new Animator[]{ofPropertyValuesHolder, ofFloat, ofFloat2});
        animatorSet.setStartDelay(j);
        return animatorSet;
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int i = Build.VERSION.SDK_INT;
        setStyle(1, getTheme());
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        int i = Build.VERSION.SDK_INT;
        return super.a(bundle);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i = Build.VERSION.SDK_INT;
        View inflate = LayoutInflater.from(getActivity()).inflate(R.layout.animated_progress_dialog_fragment, (ViewGroup) null);
        ((TextView) inflate.findViewById(R.id.animated_progress_message)).setText(getArguments().getString("message"));
        View findViewById = inflate.findViewById(R.id.animated_progress_circle_1);
        View findViewById2 = inflate.findViewById(R.id.animated_progress_circle_2);
        View findViewById3 = inflate.findViewById(R.id.animated_progress_circle_3);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(new Animator[]{a(findViewById, 0), a(findViewById2, 267), a(findViewById3, 534)});
        animatorSet.addListener(new zmy(this));
        animatorSet.start();
        return inflate;
    }

    public static znf a(String str) {
        int i = Build.VERSION.SDK_INT;
        if (b == null) {
            b = PropertyValuesHolder.ofKeyframe(View.ALPHA, new Keyframe[]{Keyframe.ofFloat(0.0f, 0.0f), Keyframe.ofFloat(0.36f, 1.0f), Keyframe.ofFloat(0.57f, 1.0f), Keyframe.ofFloat(1.0f, 0.0f)});
        }
        Bundle bundle = new Bundle();
        bundle.putString("message", str);
        bundle.putBoolean("cancelable", true);
        zmz zmz = new zmz();
        zmz.setArguments(bundle);
        return zmz;
    }
}
