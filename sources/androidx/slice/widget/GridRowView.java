package androidx.slice.widget;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.slice.SliceItem;
import com.google.android.gms.R;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class GridRowView extends apt implements View.OnClickListener, View.OnTouchListener {
    public LinearLayout a;
    public View b;
    private int[] c;

    public GridRowView(Context context) {
        this(context, (AttributeSet) null);
    }

    public void onClick(View view) {
        SliceItem b2;
        Pair pair = (Pair) view.getTag();
        SliceItem sliceItem = (SliceItem) pair.first;
        apm apm = (apm) pair.second;
        if (sliceItem != null && (b2 = apl.b(sliceItem, "action", (String) null)) != null) {
            try {
                Object obj = ((oq) b2.d).a;
                if (obj instanceof PendingIntent) {
                    ((PendingIntent) obj).send((Context) null, 0, (Intent) null, (PendingIntent.OnFinished) null, (Handler) null);
                } else {
                    ((ant) obj).a();
                }
            } catch (PendingIntent.CanceledException e) {
                Log.e("GridRowView", "PendingIntent for slice cannot be sent", e);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        throw null;
    }

    public GridRowView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = new int[2];
        new app(this);
        Resources resources = getContext().getResources();
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.a = linearLayout;
        linearLayout.setOrientation(0);
        addView(this.a, new FrameLayout.LayoutParams(-1, -1));
        this.a.setGravity(16);
        resources.getDimensionPixelSize(R.dimen.abc_slice_icon_size);
        resources.getDimensionPixelSize(R.dimen.abc_slice_small_image_size);
        resources.getDimensionPixelSize(R.dimen.abc_slice_grid_image_only_height);
        resources.getDimensionPixelSize(R.dimen.abc_slice_grid_image_min_width);
        resources.getDimensionPixelSize(R.dimen.abc_slice_grid_gutter);
        resources.getDimensionPixelSize(R.dimen.abc_slice_grid_text_padding);
        View view = new View(getContext());
        this.b = view;
        addView(view, new FrameLayout.LayoutParams(-1, -1));
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i = Build.VERSION.SDK_INT;
        this.b.getLocationOnScreen(this.c);
        this.b.getBackground().setHotspot((float) ((int) (motionEvent.getRawX() - ((float) this.c[0]))), (float) ((int) (motionEvent.getRawY() - ((float) this.c[1]))));
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.b.setPressed(true);
        } else if (actionMasked == 3 || actionMasked == 1 || actionMasked == 2) {
            this.b.setPressed(false);
        }
        return false;
    }
}
