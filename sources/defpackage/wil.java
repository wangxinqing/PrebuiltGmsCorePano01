package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.cast.JGCastService;

/* renamed from: wil  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class wil {
    public static void a(Context context, TextView textView, float f, float f2) {
        float f3 = context.getResources().getDisplayMetrics().scaledDensity;
        float f4 = f / f3;
        float f5 = f2 / f3;
        textView.setTextSize(2, f4);
        float width = (float) ((textView.getWidth() - textView.getPaddingStart()) - textView.getPaddingEnd());
        do {
            double ceil = Math.ceil((double) (textView.getPaint().measureText(textView.getText().toString()) / width));
            textView.setTextSize(2, f4);
            f4 -= 2.0f;
            if (((int) ceil) <= textView.getMaxLines() || f4 < f5) {
            }
            double ceil2 = Math.ceil((double) (textView.getPaint().measureText(textView.getText().toString()) / width));
            textView.setTextSize(2, f4);
            f4 -= 2.0f;
            return;
        } while (f4 < f5);
    }

    public static void a(MotionEvent motionEvent, View view, View view2) {
        int i;
        int i2;
        if (motionEvent.getX() < 0.0f) {
            i = (int) motionEvent.getX();
        } else if (motionEvent.getX() > ((float) view.getWidth())) {
            i = (((int) motionEvent.getX()) - view.getWidth()) + view2.getWidth();
        } else {
            i = (int) ((motionEvent.getX() / ((float) view.getWidth())) * ((float) view2.getWidth()));
        }
        if (motionEvent.getY() < 0.0f) {
            i2 = (int) motionEvent.getY();
        } else if (motionEvent.getY() > ((float) view.getHeight())) {
            i2 = view2.getHeight() + (((int) motionEvent.getY()) - view.getHeight());
        } else {
            i2 = (int) ((motionEvent.getY() / ((float) view.getHeight())) * ((float) view2.getHeight()));
        }
        motionEvent.setLocation((float) i, (float) i2);
    }

    public static void a(View view) {
        Rect rect;
        int i;
        if (view.getParent() == null || !((View) view.getParent()).isLaidOut()) {
            rect = new Rect(0, 0, 1073741823, 1073741823);
        } else {
            View view2 = (View) view.getParent();
            rect = new Rect(0, 0, view2.getWidth(), view2.getHeight());
        }
        if (view.getLayoutParams() != null) {
            int makeMeasureSpec = view.getLayoutParams().width == -2 ? View.MeasureSpec.makeMeasureSpec(rect.width(), Integer.MIN_VALUE) : view.getLayoutParams().width == -1 ? View.MeasureSpec.makeMeasureSpec(rect.width(), JGCastService.FLAG_PRIVATE_DISPLAY) : View.MeasureSpec.makeMeasureSpec(view.getLayoutParams().width, JGCastService.FLAG_PRIVATE_DISPLAY);
            if (view.getLayoutParams().height == -2) {
                i = View.MeasureSpec.makeMeasureSpec(rect.height(), Integer.MIN_VALUE);
            } else if (view.getLayoutParams().height == -1) {
                i = View.MeasureSpec.makeMeasureSpec(rect.height(), JGCastService.FLAG_PRIVATE_DISPLAY);
            } else {
                i = View.MeasureSpec.makeMeasureSpec(view.getLayoutParams().height, JGCastService.FLAG_PRIVATE_DISPLAY);
            }
            a(view, makeMeasureSpec, i);
            return;
        }
        a(view, View.MeasureSpec.makeMeasureSpec(rect.width(), JGCastService.FLAG_PRIVATE_DISPLAY), View.MeasureSpec.makeMeasureSpec(rect.height(), JGCastService.FLAG_PRIVATE_DISPLAY));
    }

    public static void a(View view, float f) {
        view.setScaleX(f);
        view.setScaleY(f);
    }

    private static void a(View view, int i, int i2) {
        view.measure(i, i2);
        view.layout(0, 0, view.getWidth(), view.getHeight());
    }

    public static void a(View view, View view2) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int[] iArr2 = new int[2];
        view2.getLocationOnScreen(iArr2);
        view2.setTranslationX(view2.getTranslationX() - ((float) (iArr2[0] - iArr[0])));
        view2.setTranslationY(view2.getTranslationY() - ((float) (iArr2[1] - iArr[1])));
    }

    public static void a(ViewGroup viewGroup, boolean z) {
        try {
            viewGroup.suppressLayout(z);
        } catch (NoSuchMethodError e) {
        }
    }

    public static void a(TextView textView, int i, int i2, View.OnClickListener onClickListener) {
        SpannableString spannableString = new SpannableString(textView.getText());
        spannableString.setSpan(new wik(onClickListener), i, i2, 33);
        textView.setText(spannableString);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
    }

    public static boolean a(Context context) {
        return context.getResources().getConfiguration().getLayoutDirection() == 1;
    }
}
