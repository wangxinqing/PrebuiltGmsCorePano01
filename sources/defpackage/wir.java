package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.cast.JGCastService;
import com.google.android.gms.R;

/* renamed from: wir  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class wir extends acq {
    public int a = 0;
    private final Context b;
    private final int c;
    private View d;

    public wir(Context context, int i) {
        this.b = context;
        this.c = i;
    }

    private final void a(RecyclerView recyclerView) {
        View inflate = LayoutInflater.from(this.b).inflate(R.layout.sharing_list_item_contact_decor, recyclerView, false);
        this.d = inflate;
        ((TextView) inflate.findViewById(R.id.decor_text)).setText(this.c);
        this.d.measure(ViewGroup.getChildMeasureSpec(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), JGCastService.FLAG_PRIVATE_DISPLAY), recyclerView.getPaddingStart() + recyclerView.getPaddingEnd(), this.d.getLayoutParams().width), ViewGroup.getChildMeasureSpec(View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 0), recyclerView.getPaddingTop() + recyclerView.getPaddingBottom(), this.d.getLayoutParams().height));
        View view = this.d;
        view.layout(0, 0, view.getMeasuredWidth(), this.d.getMeasuredHeight());
    }

    public final void b(Canvas canvas, RecyclerView recyclerView) {
        View childAt;
        int childCount = recyclerView.getChildCount();
        int i = this.a;
        if (childCount > i && (childAt = recyclerView.getChildAt(i)) != null && recyclerView.getChildAdapterPosition(childAt) == this.a) {
            if (this.d == null) {
                a(recyclerView);
            }
            canvas.translate(0.0f, (float) (childAt.getTop() - this.d.getHeight()));
            this.d.draw(canvas);
        }
    }

    public final void a(Rect rect, View view, RecyclerView recyclerView, adi adi) {
        super.a(rect, view, recyclerView, adi);
        if (this.d == null) {
            a(recyclerView);
        }
        if (recyclerView.getChildAdapterPosition(view) == this.a) {
            rect.set(0, this.d.getMeasuredHeight(), 0, 0);
        }
    }
}
